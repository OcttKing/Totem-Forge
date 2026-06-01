package net.octtking.totemforge.unused;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.octtking.totemforge.item.ModItems;
import net.octtking.totemforge.registry.DamageTypeRegistry;

public class CarafeItem extends Item{

    private Item resultitem;

    //private static final String[] TERMS = {"white","light_gray","gray","black"};
    private static final Item[] RESULT = {ModItems.FILLED_WHITE_CARAFE,ModItems.FILLED_LIGHT_GRAY_CARAFE,ModItems.FILLED_GRAY_CARAFE,ModItems.FILLED_BLACK_CARAFE};

    private static final int MAX_USE_TIME = 75;

    public CarafeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        boolean returnableitem = true;
        if (user instanceof PlayerEntity player) {
            float curAbsorption = player.getAbsorptionAmount();
            if (player.getHealth() <= 12){
                 if (!world.isClient() && world instanceof ServerWorld serverWorld) {
                     player.damage(DamageTypeRegistry.getCarafeDamageType(serverWorld), Integer.MAX_VALUE);
                 }
            } else {
                player.damage(world.getDamageSources().magic(), 12+curAbsorption);
                player.setAbsorptionAmount(curAbsorption);
                returnableitem = true;
                player.setHealth(player.getHealth()-12);

            }
        }

        super.finishUsing(stack, world, user);


        if (returnableitem){
            return new ItemStack(resultitem);
        } else {
            return new ItemStack(Items.AIR);
        }
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return MAX_USE_TIME;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) { return UseAction.DRINK; }

    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }


}

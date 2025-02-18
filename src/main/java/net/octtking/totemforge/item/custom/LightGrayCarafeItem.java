package net.octtking.totemforge.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.octtking.totemforge.Octtkingstotemforge;
import net.octtking.totemforge.item.ModItems;
import net.octtking.totemforge.registry.DamageTypeRegistry;

public class LightGrayCarafeItem extends Item {
    private static final int MAX_USE_TIME = 75;

    public LightGrayCarafeItem(Settings settings) {
        super(settings);
    }
    public static final RegistryKey<DamageType> CARAFE_DAMAGE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE,
            new Identifier(Octtkingstotemforge.MOD_ID, "carafe_damage"));

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        float returnitem = 0;
        if (user instanceof PlayerEntity player) {
            float curHealth = player.getHealth();
            float curAbsorption = player.getAbsorptionAmount();

            if (curHealth <= 12){
                 if (!world.isClient() && world instanceof ServerWorld serverWorld) {
                     player.damage(DamageTypeRegistry.getCarafeDamageType(serverWorld), Integer.MAX_VALUE);
                 }
            } else {
                float dmg = 12 + curAbsorption;
                player.damage(world.getDamageSources().magic(), dmg);
                player.setAbsorptionAmount(curAbsorption);
                returnitem = 1;
            }
        }

        super.finishUsing(stack, world, user);
        if (returnitem == 1){
            return new ItemStack(ModItems.FILLED_LIGHT_GRAY_CARAFE);
        } else {
            return new ItemStack(Items.AIR);
        }
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 75;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) { return UseAction.DRINK; }

    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ITEM_HONEY_BOTTLE_DRINK;
    }
}

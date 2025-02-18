package net.octtking.totemforge.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.octtking.totemforge.item.ModItems;

public class FilledBrownCarafeItem extends Item {
    public FilledBrownCarafeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity player) {
            if (player.hasStatusEffect(StatusEffects.ABSORPTION)){
                if(player.getStatusEffect(StatusEffects.ABSORPTION).getDuration() <= 900) {
                    int carry = player.getStatusEffect(StatusEffects.ABSORPTION).getAmplifier();
                    float carry2 = player.getAbsorptionAmount();
                    player.removeStatusEffect(StatusEffects.ABSORPTION);
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION,900,carry));
                    player.setAbsorptionAmount(carry2+4);
                } else {
                    player.setAbsorptionAmount(player.getAbsorptionAmount()+4);
                }
            } else {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 900));
            }
            player.setHealth(player.getHealth()+8);
        }
        return new ItemStack(ModItems.BROWN_CARAFE);
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

package net.octtking.totemforge.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Consumable {
    public static final FoodComponent FILLED_CARAFE = new FoodComponent.Builder()
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 900), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 1), 1f)
            .build();
    public static final FoodComponent EMPTY_CARAFE = new FoodComponent.Builder()
            .alwaysEdible().build();

}

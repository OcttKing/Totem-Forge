package net.octtking.totemforge.entity.damage;

import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.octtking.totemforge.Octtkingstotemforge;
import org.jetbrains.annotations.Nullable;

public class ModDamageSources {
    public static final RegistryKey<DamageType> CARAFE_DAMAGE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Octtkingstotemforge.id("carafe_damage"));

    private final DamageSource carafe_damage;

    public ModDamageSources(DamageSources damageSources) {
        this.carafe_damage = damageSources.create(CARAFE_DAMAGE);
    }

    public DamageSource carafe_damage() {
        return carafe_damage;
    }
//    public final Registry<DamageType> registry;
//    private final DamageSource carafe_damage;
//
//    public ModDamageSources(DynamicRegistryManager registryManager) {
//        this.registry = registryManager.get(RegistryKeys.DAMAGE_TYPE);
//        this.carafe_damage = this.create(DamageTypes.IN_FIRE);
//
//    }
//    public final DamageSource create(RegistryKey<DamageType> key) {
//        return new DamageSource(this.registry.entryOf(key));
//    }
//
//    public final DamageSource create(RegistryKey<DamageType> key, @Nullable Entity attacker) {
//        return new DamageSource(this.registry.entryOf(key), attacker);
//    }
//
//    public final DamageSource create(RegistryKey<DamageType> key, @Nullable Entity source, @Nullable Entity attacker) {
//        return new DamageSource(this.registry.entryOf(key), source, attacker);
//    }
//
//    public DamageSource CarafeDamage() {return this.carafe_damage; }
}

package net.octtking.totemforge.registry;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageSources;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

public class DamageTypeRegistry {
    public static final RegistryKey<DamageType> CARAFE_DAMAGE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE,
            new Identifier("octtkingstotemforge", "carafe_damage"));

    public static DamageSource getCarafeDamageType(ServerWorld world) {
        RegistryEntry<DamageType> carafeDamageEntry = world.getRegistryManager()
                .get(RegistryKeys.DAMAGE_TYPE)
                .entryOf(CARAFE_DAMAGE);
        return  new DamageSource(carafeDamageEntry);
    }
    public static void register() {}
}

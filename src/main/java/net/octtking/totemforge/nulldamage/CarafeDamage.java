package net.octtking.totemforge.nulldamage;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;





/*public class CarafeDamage extends DamageSource {

    // Constructor to initialize with a unique identifier for our custom source
    public static final DamageSource CARAFE_DAMAGE = new CarafeDamage();

    public CarafeDamage() {
        super(RegistryEntry.of(RegistryKeys.DAMAGE_TYPE, new Identifier("carafe_damage")));
    }
}


/*import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;

public class CarafeDamage extends DamageSource {

    public CarafeDamage() {
        super(RegistryEntry.of(new DamageType("carafe_damage", 0)));
    }

    @Override
    public Text getDeathMessage(LivingEntity entity) {
        if (entity.getAttacker() != null) {
            return new TranslatableTextContent("death.damage.carafe_damage.entity",entity.getDisplayName(), entity.getAttacker().getDisplayName());
        } else {
            return new TranslatableTextContent("death.damage.carafe_damage.self", entity.getDisplayName());
        }
    }
}
*/
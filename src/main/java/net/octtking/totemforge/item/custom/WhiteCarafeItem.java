package net.octtking.totemforge.item.custom;

//import net.octtking.totemforge.nulldamage.CarafeDamage;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
//import net.octtking.totemforge.entity.damage.ModDamageSources;
import net.octtking.totemforge.Octtkingstotemforge;
import net.octtking.totemforge.entity.damage.ModDamageTypes;
import net.octtking.totemforge.item.ModItems;
import net.octtking.totemforge.world.WorldMod;

public class WhiteCarafeItem extends Item {

    public WhiteCarafeItem(Settings settings) {
        super(settings);
    }

    public static final RegistryKey<DamageType> CARAFE_DAMAGE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE,
            new Identifier(Octtkingstotemforge.MOD_ID, "carafe_damage"));

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // Call the super method to handle the eating process
        float returnitem = 0;

        if (user instanceof PlayerEntity player) {
            float curHealth = player.getHealth();
            float curAbsorption = player.getAbsorptionAmount();

            if (curHealth <= 12){
                //player.damage(world.getDamageSources().magic(), 1);

               // player.damage(world.getModDamageSources().CarafeDamage());
              //  if (entity instanceof LivingEntity) {
                   // entity.damage
                //}
                //player.setHealth(0.0f);
                //player.sendMessage(Text.literal(player.getDisplayName());
                player.damage(world.getDamageSources().create(CARAFE_DAMAGE), 12.f);
            } else {
                float dmg = 12 + curAbsorption;
                player.damage(world.getDamageSources().magic(), dmg);

                player.setAbsorptionAmount(curAbsorption);

                returnitem = 1;
            }
        }

        super.finishUsing(stack, world, user);
        if (returnitem == 1){
            return new ItemStack(ModItems.FILLED_WHITE_CARAFE);
        } else {
            return new ItemStack(Items.AIR);
        }
    }
}

package net.octtking.totemforge.entity.damage;

import net.minecraft.entity.damage.DamageSources;
//credit to doctorR4T for code
/**
 * allows access to {@link ModDmgSourcesExtd} from {@link DamageSources}
 *
 *<p>Interface injected into {@link DamageSources}
 */
public interface ModDmgSourcesExtd {
 default ModDamageSources pypSources() {
     throw new IllegalStateException("Not transformed");
 }
}

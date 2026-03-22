/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectFloatHashMap
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import gnu.trove.map.hash.TObjectFloatHashMap;

/*
 * Renamed from atO
 */
public class ato_1
extends atq_1 {
    private static final float ddA = 1.0f;
    private static final float ddB = 0.5f;
    private static final float ddC = 0.116279066f;
    private final TObjectFloatHashMap<Particle> ddD = new TObjectFloatHashMap();

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        if (!particle2.aNe) {
            return;
        }
        float f4 = particle2.aPY + particle.aSc();
        float f5 = particle2.aPZ + particle.aSd();
        float f6 = particle2.aQa + particle.aSe();
        f4 += particleSystem.aSc();
        f5 += particleSystem.aSd();
        f6 += particleSystem.aSe();
        if (!Float.isNaN(particle2.dcf)) {
            float f7 = f4 - particle2.dcf;
            float f8 = f5 - particle2.dcg;
            float f9 = f6 - particle2.dch;
            if (f7 == 0.0f && f8 == 0.0f && f9 == 0.0f) {
                return;
            }
            float f10 = (f7 - f8) / 4.0f;
            float f11 = (f7 + f8) * 0.5f + f9 * 0.116279066f;
            if (Math.abs(f10) > 1.0E-5f) {
                float f12 = (float)Math.atan(f11 / f10);
                float f13 = this.ddD.get((Object)particle2);
                particle2.aQj += f12 - f13;
                this.ddD.put((Object)particle2, f12);
            }
        }
        particle2.dcf = f4;
        particle2.dcg = f5;
        particle2.dch = f6;
    }
}


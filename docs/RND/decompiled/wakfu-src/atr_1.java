/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atr
 */
class atr_1
implements atd_1 {
    atr_1() {
    }

    @Override
    public boolean a(atq_1 atq_12, Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        float f3 = particle2.ceh;
        float f4 = particle2.cei;
        float f5 = f3 / f4;
        atq_12.a(f2, f5, particle, particle2, particleSystem);
        return false;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atX
 */
public class atx_2
extends atq_1 {
    private final lj_2 ddK;

    public atx_2(lj_2 lj_22) {
        this.ddK = lj_22;
    }

    public lj_2 bMp() {
        return this.ddK;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = this.ddK.aRB() * f2;
        Particle particle3 = particle.dbV == null ? particle : particle.dbV;
        particle2.aPY += (particle2.aPZ - particle3.aSd()) * f4;
        particle2.aPZ -= (particle2.aPY - particle3.aSc()) * f4;
    }
}


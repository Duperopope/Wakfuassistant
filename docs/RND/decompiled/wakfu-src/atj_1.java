/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atJ
 */
public class atj_1
extends atq_1 {
    private float ddt = 180.0f;
    private final ls_2 ddu;

    public atj_1(ls_2 ls_22) {
        this.ddu = ls_22;
    }

    public ls_2 bMc() {
        return this.ddu;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        this.ddt += this.ddu.aSf() * f2;
        if (this.ddt >= 360.0f) {
            this.ddt -= 360.0f;
        }
        particle2.aPY = particle.aSc() + GC.H(this.ddt) * particle2.ceb + 0.4f;
        particle2.aPZ = particle.aSd() + GC.G(this.ddt) * particle2.cec - 0.7f;
    }
}


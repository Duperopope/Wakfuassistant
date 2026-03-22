/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atV
 */
public class atv_2
extends atq_1 {
    private final lh_2 ddI;

    public atv_2(lh_2 lh_22) {
        this.ddI = lh_22;
    }

    public lh_2 bMn() {
        return this.ddI;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = (float)((int)(33333.0f * f2)) / 1000.0f;
        particle2.aRg += this.ddI.aTa() * f4;
        particle2.aRh += this.ddI.aTb() * f4;
        particle2.aRi += this.ddI.aTc() * f4;
    }
}


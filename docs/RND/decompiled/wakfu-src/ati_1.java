/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atI
 */
public class ati_1
extends atq_1 {
    private final lr_2 dds;

    public ati_1(lr_2 lr_22) {
        this.dds = lr_22;
    }

    public lr_2 bMb() {
        return this.dds;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.ceb += this.dds.aSc();
        particle2.cec += this.dds.aSd();
        particle2.ced += this.dds.aSe();
    }
}


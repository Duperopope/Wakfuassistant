/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atQ
 */
public class atq_2
extends atq_1 {
    private final lc_2 ddF;

    public atq_2(lc_2 lc_22) {
        this.ddF = lc_22;
    }

    public lc_2 bMk() {
        return this.ddF;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.aPD += this.ddF.aSi() * (float)((int)(33333.0f * f2)) / 1000.0f;
    }
}


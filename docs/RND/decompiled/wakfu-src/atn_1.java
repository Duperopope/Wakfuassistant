/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atN
 */
public class atn_1
extends atq_1 {
    private final lw_2 ddz;

    public atn_1(lw_2 lw_22) {
        this.ddz = lw_22;
    }

    public lw_2 bMi() {
        return this.ddz;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = (float)((int)(33333.0f * f2)) / 1000.0f;
        particle2.aPD += (this.ddz.aSi() + GC.aNJ() * this.ddz.aSl()) * f4;
        particle2.aPE += (this.ddz.aSj() + GC.aNJ() * this.ddz.aSm()) * f4;
        particle2.aQj += (this.ddz.aSk() + GC.aNJ() * this.ddz.aSn()) * f4;
    }
}


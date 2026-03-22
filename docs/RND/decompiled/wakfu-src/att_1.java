/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atT
 */
public class att_1
extends atr_2 {
    att_1(ld_2 ld_22) {
        super(ld_22);
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.ceb += this.ddG.aSc() * f2;
        particle2.cec += this.ddG.aSd() * f2;
        particle2.ced += this.ddG.aSe() * f2;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atS
 */
public class ats_2
extends atr_2 {
    ats_2(ld_2 ld_22) {
        super(ld_22);
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        particle2.aPY += this.ddG.aSc() * f2;
        particle2.aPZ += this.ddG.aSd() * f2;
        particle2.aQa += this.ddG.aSe() * f2;
    }
}


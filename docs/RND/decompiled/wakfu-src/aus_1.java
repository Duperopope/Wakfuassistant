/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from aus
 */
public class aus_1
implements ats_1 {
    public final le_2 dez;

    public aus_1(le_2 le_22) {
        this.dez = le_22;
    }

    @Override
    public boolean a(Particle particle, Particle particle2, float f2, ParticleSystem particleSystem) {
        switch (this.dez.aSM()) {
            case aQN: {
                return particle2.aPY >= (float)this.dez.getValue() + (this.dez.aRf() ? particleSystem.cWN : particle.aPY);
            }
            case aQO: {
                return particle2.aPY <= (float)this.dez.getValue() + (this.dez.aRf() ? particleSystem.cWN : particle.aPY);
            }
            case aQP: {
                return particle2.aPZ >= (float)this.dez.getValue() + (this.dez.aRf() ? particleSystem.cWO : particle.aPZ);
            }
            case aQQ: {
                return particle2.aPZ <= (float)this.dez.getValue() + (this.dez.aRf() ? particleSystem.cWO : particle.aPZ);
            }
            case aQR: {
                return particle2.aQa >= (float)this.dez.getValue() + (this.dez.aRf() ? particleSystem.cWP : particle.aQa);
            }
            case aQS: {
                return particle2.aQa <= (float)this.dez.getValue() + (this.dez.aRf() ? particleSystem.cWP : particle.aQa);
            }
        }
        return true;
    }
}


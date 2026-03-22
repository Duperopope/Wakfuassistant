/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atG
 */
public class atg_1
extends atq_1 {
    private final ln_2 ddp;

    public atg_1(ln_2 ln_22) {
        this.ddp = ln_22;
    }

    public ln_2 bMa() {
        return this.ddp;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = this.ddp.aRB() * f2;
        float f5 = this.ddp.getOffsetX() - particle2.aPY;
        float f6 = this.ddp.getOffsetY() - particle2.aPZ;
        float f7 = this.ddp.aRD() - particle2.aQa;
        if (!particle.aNe) {
            f5 += particle.aSc();
            f6 += particle.aSd();
            f7 += particle.aSe();
        }
        float f8 = (float)Math.sqrt(f5 * f5 + f6 * f6 + f7 * f7);
        f5 /= f8;
        f6 /= f8;
        f7 /= f8;
        switch (this.ddp.aRC()) {
            case aPw: {
                particle2.aPZ += f6 * f4;
                particle2.aQa += f7 * f4;
                break;
            }
            case aPx: {
                particle2.aPY += f5 * f4;
                particle2.aQa += f7 * f4;
                break;
            }
            case aPy: {
                particle2.aPY += f5 * f4;
                particle2.aPZ += f6 * f4;
                break;
            }
            case aPz: {
                particle2.aPY += f5 * f4;
                particle2.aPZ += f6 * f4;
                particle2.aQa += f7 * f4;
                break;
            }
            default: {
                assert (false) : "Unknown attractor axis";
                break;
            }
        }
    }

    @Override
    public boolean bLi() {
        return true;
    }
}


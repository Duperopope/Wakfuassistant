/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from atU
 */
public class atu_1
extends atq_1 {
    private final lg_2 ddH;

    public atu_1(lg_2 lg_22) {
        this.ddH = lg_22;
    }

    public lg_2 bMm() {
        return this.ddH;
    }

    @Override
    public void a(float f2, float f3, Particle particle, Particle particle2, ParticleSystem particleSystem) {
        float f4 = particle.aSc() + this.ddH.aSO();
        float f5 = particle.aSd() + this.ddH.aSP();
        float f6 = particle.aSe() + this.ddH.aSQ();
        float f7 = particle.aSc() + this.ddH.aSR();
        float f8 = particle.aSd() + this.ddH.aSS();
        float f9 = particle.aSe() + this.ddH.aST();
        boolean bl = false;
        if (particle2.aPY < f4 && particle2.dcf >= f4) {
            bl = true;
            particle2.aPY = f4;
            particle2.ceb = -particle2.ceb;
        }
        if (particle2.aPY > f7 && particle2.dcf <= f7) {
            bl = true;
            particle2.aPY = f7;
            particle2.ceb = -particle2.ceb;
        }
        if (particle2.aPZ < f5 && particle2.dcg >= f5) {
            bl = true;
            particle2.aPZ = f5;
            particle2.cec = -particle2.cec;
        }
        if (particle2.aPZ > f8 && particle2.dcg <= f8) {
            bl = true;
            particle2.aPZ = f8;
            particle2.cec = -particle2.cec;
        }
        if (particle2.aQa < f6 && particle2.dch >= f6) {
            bl = true;
            particle2.aQa = f6;
            particle2.ced = -particle2.ced;
        }
        if (particle2.aQa > f9 && particle2.dch <= f9) {
            bl = true;
            particle2.aQa = f9;
            particle2.ced = -particle2.ced;
        }
        if (bl) {
            if (this.ddH.aSX() != 0.0f || this.ddH.aSY() != 0.0f || this.ddH.aSZ() != 0.0f) {
                particle2.ceb *= this.ddH.aSU() + GC.aNJ() * this.ddH.aSX();
                particle2.cec *= this.ddH.aSV() + GC.aNJ() * this.ddH.aSY();
                particle2.ced *= this.ddH.aSW() + GC.aNJ() * this.ddH.aSZ();
            } else {
                particle2.ceb *= this.ddH.aSU();
                particle2.cec *= this.ddH.aSV();
                particle2.ced *= this.ddH.aSW();
            }
        }
        particle2.dcf = particle2.aPY;
        particle2.dcg = particle2.aPZ;
        particle2.dch = particle2.aQa;
    }
}


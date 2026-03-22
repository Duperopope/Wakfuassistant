/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;

/*
 * Renamed from auF
 */
public class auf_1
extends atw_2 {
    private final lp_2 deQ;

    public auf_1(lp_2 lp_22) {
        this.deQ = lp_22;
    }

    @Override
    public Particle d(ParticleSystem particleSystem) {
        if (particleSystem.isEditable() && this.bLD() && !this.f(particleSystem)) {
            return null;
        }
        return super.d(particleSystem);
    }

    @Override
    public boolean bLE() {
        return false;
    }

    public boolean f(ParticleSystem particleSystem) {
        assert (this.bLD()) : "Texture is already up to date";
        assert (particleSystem.isEditable());
        aws_2 aws_22 = particleSystem.bLW().uC(this.bMu().aPA());
        if (aws_22 == null) {
            return false;
        }
        int n = aws_22.getWidth();
        int n2 = aws_22.getHeight();
        int n3 = GC.mV(n);
        int n4 = GC.mV(n2);
        lp_2 lp_22 = this.bMu();
        lp_22.an((float)n * 0.5f);
        lp_22.ao((float)n2 * 0.5f);
        lp_22.Q((float)n2 / (float)n4);
        lp_22.R((float)n / (float)n3);
        this.cV(false);
        return true;
    }

    @Override
    public void c(Particle particle) {
        float f2 = this.deQ.aRH();
        float f3 = this.deQ.aRI();
        float f4 = this.deQ.aRL();
        if (this.deQ.aPH()) {
            float f5 = GC.aNJ() * this.deQ.aRJ();
            f2 += f5;
            f3 += f5;
        } else {
            if (this.deQ.aRJ() != 0.0f) {
                f2 += GC.aNJ() * this.deQ.aRJ();
            }
            if (this.deQ.aRK() != 0.0f) {
                f3 += GC.aNJ() * this.deQ.aRK();
            }
        }
        if (this.deQ.aRM() != 0.0f) {
            f4 += (GC.aNJ() - 0.5f) * this.deQ.aRM();
        }
        particle.aPB = this.deQ.aRF();
        particle.aPC = this.deQ.aRG();
        particle.ayP = this.deQ.aRQ() + GC.aNJ() * this.deQ.aRU();
        particle.axp = this.deQ.aRN() + GC.aNJ() * this.deQ.aRR();
        particle.axq = this.deQ.aRO() + GC.aNJ() * this.deQ.aRS();
        particle.axr = this.deQ.aRP() + GC.aNJ() * this.deQ.aRT();
        particle.aPD = f2;
        particle.aPE = f3;
        particle.aQj = f4 * ((float)Math.PI / 180);
        particle.aPU = this.deQ.aRY();
        particle.aPV = this.deQ.aRZ();
        particle.aLN = this.deQ.aPV();
        particle.aLO = this.deQ.aPW();
        particle.aLP = this.deQ.aPX();
        particle.aLQ = this.deQ.aPY();
        particle.dci = particle.aRg = this.deQ.aRV() * ((float)Math.PI / 180);
        particle.dcj = particle.aRh = this.deQ.aRW() * ((float)Math.PI / 180);
        particle.dck = particle.aRi = this.deQ.aRX() * ((float)Math.PI / 180);
    }

    public lp_2 bMu() {
        return this.deQ;
    }

    @Override
    public int aPA() {
        return this.deQ.aPA();
    }
}


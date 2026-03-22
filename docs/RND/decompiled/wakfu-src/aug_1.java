/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import com.jogamp.opengl.util.texture.TextureCoords;

/*
 * Renamed from auG
 */
public class aug_1
extends atw_2 {
    public final lm_2 deS;
    private final lq_2 deT;
    private float deU;

    public aug_1(lq_2 lq_22, lm_2 lm_22) {
        this.deT = lq_22;
        this.deS = lm_22;
    }

    @Override
    public Particle d(ParticleSystem particleSystem) {
        if (particleSystem.isEditable() && !this.f(particleSystem)) {
            return null;
        }
        return super.d(particleSystem);
    }

    @Override
    public boolean bLE() {
        return true;
    }

    public boolean f(ParticleSystem particleSystem) {
        assert (this.bLD()) : "Texture is already up to date";
        assert (particleSystem.isEditable());
        aws_2 aws_22 = particleSystem.bLW().uC(this.deT.aPA());
        if (aws_22 == null) {
            return false;
        }
        this.cV(false);
        return true;
    }

    public final TextureCoords uF(int n) {
        assert (n >= 0);
        this.deU += this.deT.aSa() * (float)n;
        int n2 = this.deS.aRz();
        if (this.deU >= (float)n2) {
            this.deU -= (float)n2;
            if (this.deT.aSb() > 0) {
                this.deT.np(this.deT.aSb() - 1);
            }
        }
        float f2 = GC.mV(this.deS.aRw());
        float f3 = (float)GC.mV(this.deS.aRw()) - 0.5f;
        float f4 = (float)this.deS.aRu() / f2;
        float f5 = (float)this.deS.aRv() / f3;
        short[] sArray = this.deS.aRy();
        TextureCoords[] textureCoordsArray = new TextureCoords[sArray.length / 2];
        for (int i = 0; i < textureCoordsArray.length; ++i) {
            float f6 = ((float)sArray[i * 2] + 0.5f) / f2;
            float f7 = ((float)sArray[i * 2 + 1] + 0.5f) / f3;
            textureCoordsArray[i] = new TextureCoords(f6, f5 + f7, f4 + f6, f7);
        }
        short[] sArray2 = this.deS.aRA();
        int n3 = ((int)(this.deT.aSb() == 0 ? (float)n2 : this.deU) & 0xFFFF) % this.deS.aRz();
        for (int i = 0; i < sArray2.length; ++i) {
            if ((n3 -= sArray2[i]) >= 0) continue;
            return textureCoordsArray[i];
        }
        return textureCoordsArray[0];
    }

    @Override
    public void c(Particle particle) {
        float f2 = this.deT.aRH();
        float f3 = this.deT.aRI();
        float f4 = this.deT.aRL();
        if (this.deT.aPH()) {
            float f5 = GC.aNJ() * this.deT.aRJ();
            f2 += f5;
            f3 += f5;
        } else {
            if (this.deT.aRJ() != 0.0f) {
                f2 += GC.aNJ() * this.deT.aRJ();
            }
            if (this.deT.aRK() != 0.0f) {
                f3 += GC.aNJ() * this.deT.aRK();
            }
        }
        if (this.deT.aRM() != 0.0f) {
            f4 += (GC.aNJ() - 0.5f) * this.deT.aRM();
        }
        particle.aPB = this.deT.aRF();
        particle.aPC = this.deT.aRG();
        particle.ayP = this.deT.aRQ() + GC.aNJ() * this.deT.aRU();
        particle.axp = this.deT.aRN() + GC.aNJ() * this.deT.aRR();
        particle.axq = this.deT.aRO() + GC.aNJ() * this.deT.aRS();
        particle.axr = this.deT.aRP() + GC.aNJ() * this.deT.aRT();
        particle.aPD = f2;
        particle.aPE = f3;
        particle.aQj = f4 * ((float)Math.PI / 180);
        particle.aPU = this.deT.aRY();
        particle.aPV = this.deT.aRZ();
        particle.aLN = this.deT.aPV();
        particle.aLO = this.deT.aPW();
        particle.aLP = this.deT.aPX();
        particle.aLQ = this.deT.aPY();
        particle.dci = particle.aRg = this.deT.aRV() * ((float)Math.PI / 180);
        particle.dcj = particle.aRh = this.deT.aRW() * ((float)Math.PI / 180);
        particle.dck = particle.aRi = this.deT.aRX() * ((float)Math.PI / 180);
    }

    public lq_2 bMv() {
        return this.deT;
    }

    @Override
    public int aPA() {
        return this.deT.aPA();
    }
}


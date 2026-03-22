/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.particleSystem.Particle;
import com.ankamagames.framework.graphics.engine.particleSystem.ParticleSystem;
import java.util.ArrayList;

/*
 * Renamed from auw
 */
public class auw_1
extends att_2 {
    public final ly_2 deD;
    public int o;
    public final ArrayList<atw_2> deE = new ArrayList(1);
    public ArrayList<auw_1> deF;
    public auxx_1 dbX;

    public auw_1(ly_2 ly_22) {
        this.deD = ly_22;
    }

    public void reset() {
        this.deE.clear();
        this.bLn();
        this.dbX = null;
        this.deD.aC(false);
    }

    public void a(atw_2 atw_22) {
        this.deE.add(atw_22);
    }

    public void a(ParticleSystem particleSystem, Particle particle, Particle particle2) {
        this.a(particle, particle2);
        if (!particle.aNe) {
            particle2.aPY += particle.aSc();
            particle2.aPZ += particle.aSd();
            particle2.aQa += particle.aSe();
        }
        if (this.deF != null) {
            particle2.a(particleSystem, this.deF);
        }
    }

    public void a(Particle particle, Particle particle2) {
        float f2 = this.deD.aSw();
        float f3 = this.deD.aSx();
        float f4 = this.deD.aSy();
        float f5 = this.deD.aSC();
        float f6 = this.deD.aSD();
        float f7 = this.deD.aSE();
        if (this.deD.aSz() != 0.0f) {
            f2 += (GC.aNJ() - 0.5f) * this.deD.aSz();
        }
        if (this.deD.aSA() != 0.0f) {
            f3 += (GC.aNJ() - 0.5f) * this.deD.aSA();
        }
        if (this.deD.aSB() != 0.0f) {
            f4 += (GC.aNJ() - 0.5f) * this.deD.aSB();
        }
        if (this.deD.aSF() != 0.0f) {
            f5 += (GC.aNJ() - 0.5f) * this.deD.aSF();
        }
        if (this.deD.aSG() != 0.0f) {
            f6 += (GC.aNJ() - 0.5f) * this.deD.aSG();
        }
        if (this.deD.aSH() != 0.0f) {
            f7 += (GC.aNJ() - 0.5f) * this.deD.aSH();
        }
        particle2.aPY = f2;
        particle2.aPZ = f3;
        particle2.aQa = f4;
        particle2.ceb = f5;
        particle2.cec = f6;
        particle2.ced = f7;
        particle2.cei = this.deD.aSu() + GC.aNJ() * this.deD.aSv();
        particle2.ceh = 0.0f;
        particle2.aNe = this.deD.aQM();
        particle2.dbV = particle;
    }

    public void b(auw_1 auw_12) {
        if (auw_12 == null) {
            return;
        }
        if (this.deF == null) {
            this.deF = new ArrayList(1);
        }
        this.deF.add(auw_12);
    }

    public int bMq() {
        int n = this.deE.size();
        if (n == 0) {
            return -1;
        }
        return GC.mR(n);
    }

    public void a(auxx_1 auxx_12) {
        this.dbX = auxx_12;
    }
}


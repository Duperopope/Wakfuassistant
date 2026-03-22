/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fbY
 */
public class fby_0
extends fbz_0 {
    private final ArrayList<fbl_0> rSV = new ArrayList();
    private final boolean rSW;
    private final int rSX;
    private final int rSY;

    public fby_0(short s, int n, int n2, int n3, boolean bl, short s2) {
        super(s, n, s2);
        this.rSX = n2;
        this.rSY = n3;
        this.rSW = bl;
    }

    @Override
    public int cmP() {
        return fbo_0.e(this).fSb();
    }

    public boolean coy() {
        return fbo_0.e(this).coy();
    }

    public int fSp() {
        return fbo_0.e(this).fSe();
    }

    public int fSq() {
        return fbo_0.e(this).fSc();
    }

    public int fSd() {
        return fbo_0.e(this).fSd();
    }

    public boolean cow() {
        return this.rSW;
    }

    public void fJ(int n, int n2) {
        this.rSV.add(new fbl_0(n, n2));
    }

    public boolean V(TObjectProcedure<fbl_0> tObjectProcedure) {
        for (int i = 0; i < this.rSV.size(); ++i) {
            if (tObjectProcedure.execute((Object)this.rSV.get(i))) continue;
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + ", m_conditions=" + String.valueOf(this.rSV) + ", m_buyable=" + this.rSW + "}";
    }

    public int aYs() {
        return this.rSX;
    }

    public int cov() {
        return this.rSY;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fby_0)) {
            return false;
        }
        fby_0 fby_02 = (fby_0)object;
        return this.fSr() == fby_02.fSr();
    }

    public int hashCode() {
        return this.fSr();
    }
}


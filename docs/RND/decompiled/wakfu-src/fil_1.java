/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fIl
 */
public class fil_1 {
    private static final Logger uAA = Logger.getLogger(fil_1.class);
    private static final fil_1 uAB = new fil_1();
    private final ArrayList<fik_1> uAC = new ArrayList();
    private final ArrayList<fik_1> uAD = new ArrayList();
    private final ArrayList<fij_1> uAE = new ArrayList();
    private final ArrayList<fii_1> uAF = new ArrayList();
    private fij_1 uAG;

    private fil_1() {
    }

    public static fil_1 gBx() {
        return uAB;
    }

    public void a(fij_1 fij_12) {
        this.uAE.add(fij_12);
    }

    public void a(fij_1 fij_12, boolean bl) {
        this.uAE.remove(fij_12);
        if (bl && fij_12.gBw()) {
            for (int i = this.uAF.size() - 1; i >= 0; --i) {
                this.uAF.get(i).cancel();
            }
        }
    }

    public void a(fii_1 fii_12) {
        this.uAF.add(fii_12);
    }

    public void b(fii_1 fii_12) {
        this.uAF.remove(fii_12);
    }

    public void a(fik_1 fik_12) {
        this.uAC.add(fik_12);
    }

    public void b(fik_1 fik_12) {
        this.uAC.remove(fik_12);
    }

    public void c(fes_2 fes_22, int n, int n2) {
        for (fij_1 fij_12 : this.uAE) {
            if (!fij_12.b(fes_22, n, n2)) continue;
            this.uAG = fij_12;
            this.uAG.he(n, n2);
            this.uAD.clear();
            for (fik_1 fik_12 : this.uAC) {
                if (!fik_12.aZ(this.uAG.getValue())) continue;
                this.uAD.add(fik_12);
            }
            return;
        }
    }

    public boolean d(fes_2 fes_22, int n, int n2) {
        if (this.uAG != null && this.uAG.isDragEnabled()) {
            this.uAG.a(n, n2, fes_22);
            for (fik_1 fik_12 : this.uAD) {
                fik_12.a(this.uAG, n, n2, fes_22);
            }
            return true;
        }
        return false;
    }

    public void e(fes_2 fes_22, int n, int n2) {
        if (this.uAG != null && this.uAG.isDropEnabled()) {
            this.uAG.b(n, n2, fes_22);
            for (fik_1 fik_12 : this.uAD) {
                fik_12.b(this.uAG, n, n2, fes_22);
            }
            this.uAG = null;
        }
    }

    public void cancel() {
        if (this.uAG != null) {
            this.uAG.clean();
            this.uAG = null;
        }
    }

    public void bmX() {
        this.uAG = null;
    }
}


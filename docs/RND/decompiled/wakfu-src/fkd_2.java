/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import org.apache.commons.pool.ObjectPool;

/*
 * Renamed from fKd
 */
public class fkd_2
extends fys_0 {
    public static final String TAG = "FocusAppearance";
    private static final ObjectPool uFv = new ayv_2(new fke_2());
    private float nNC;
    private float nND;
    private float nNE;
    private float nNF;
    private boolean nNN;

    public static fkd_2 checkOut() {
        fkd_2 fkd_22;
        try {
            fkd_22 = (fkd_2)uFv.borrowObject();
            fkd_22.uth = uFv;
        }
        catch (Exception exception) {
            tDG.error((Object)"Probl\u00e8me au borrowObject");
            fkd_22 = new fkd_2();
            fkd_22.aVI();
        }
        return fkd_22;
    }

    public void setCenter(float f2, float f3, float f4, float f5) {
        this.nNC = f2;
        this.nND = f3;
        this.nNE = f4;
        this.nNF = f5;
    }

    public void setMouseBlocked(boolean bl) {
        this.nNN = bl;
    }

    @Override
    public boolean gE(int n, int n2) {
        return this.nNN && ((float)n < this.nNC || (float)n > this.nNE || (float)n2 < this.nND || (float)n2 > this.nNF);
    }

    @Override
    public String getTag() {
        return TAG;
    }
}


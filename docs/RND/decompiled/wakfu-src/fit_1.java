/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from fIT
 */
public class fit_1 {
    private final String uCU;
    private final ArrayList<fes_2> uCV = new ArrayList();
    private boolean cHn = true;

    public fit_1(String string) {
        this.uCU = string;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        if (this.cHn == bl) {
            return;
        }
        this.cHn = bl;
        int n = this.uCV.size();
        for (int i = 0; i < n; ++i) {
            fes_2 fes_22 = this.uCV.get(i);
            fes_22.setNetEnabled(bl);
        }
    }

    public void l(fes_2 fes_22) {
        this.uCV.add(fes_22);
        fes_22.setNetEnabled(this.cHn);
    }

    public void n(fes_2 fes_22) {
        this.uCV.remove(fes_22);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bcD
 */
public class bcd_1
implements aeh_2 {
    public static final String hGh = "quests";
    public static final String hGi = "achievementIndexText";
    private final ArrayList<bci_1> hGj = new ArrayList();
    private int hGk = -1;
    private int hGl = -1;

    public void b(mp_1 mp_12) {
        if (mp_12.d() == this.hGk) {
            return;
        }
        this.hGk = mp_12.d();
        this.hGj.clear();
        int n = mp_12.aVo();
        for (int i = 0; i < n; ++i) {
            this.hGj.add(bcm_1.hIK.t(csc_1.eNJ().KU(), mp_12.nL(i)));
        }
        fse_1.gFu().a((aef_2)this, hGh);
    }

    public void Bn(int n) {
        if (this.hGk == -1) {
            return;
        }
        this.hGl = -1;
        int n2 = this.hGj.size();
        for (int i = 0; i < n2; ++i) {
            bci_1 bci_12 = this.hGj.get(i);
            if (bci_12.d() != n) continue;
            this.hGl = i;
            break;
        }
        fse_1.gFu().a((aef_2)this, hGi);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hGh)) {
            return this.hGj;
        }
        if (string.equals(hGi)) {
            return String.valueOf(this.hGl + 1);
        }
        return null;
    }
}


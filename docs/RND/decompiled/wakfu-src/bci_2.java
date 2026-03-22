/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;

/*
 * Renamed from bci
 */
public class bci_2
implements aeh_2 {
    public static final bci_2 hDG = new bci_2();
    public static final String hDH = "fightChallenge";
    public static final String hDI = "environmentQuest";
    public static final String hDJ = "regularQuests";
    private int hDK = -1;
    private int hDL = -1;
    private long aDh;

    public void bkZ() {
        this.aDh = bci_2.daL().Sn();
        this.hDK = -1;
        this.hDL = -1;
        fse_1.gFu().f("followedAchievements", this);
        fse_1.gFu().f("canFollowMoreAchievements", true);
    }

    private static bgt_0 daL() {
        return aue_0.cVJ().cVL();
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "environmentQuest": {
                return this.hDK == -1 ? null : bgk.hZN.Cx(this.hDK);
            }
            case "regularQuests": {
                ArrayList<bci_1> arrayList = new ArrayList<bci_1>();
                TIntArrayList tIntArrayList = bci_2.daL().dpy().aYv();
                int n = tIntArrayList.size();
                for (int i = 0; i < n; ++i) {
                    bci_1 bci_12 = this.Be(tIntArrayList.get(i));
                    if (bci_12 == null) continue;
                    arrayList.add(bci_12);
                }
                return arrayList;
            }
            case "fightChallenge": {
                return bue.jop.dIL();
            }
        }
        return null;
    }

    private bci_1 Be(int n) {
        bgt_0 bgt_02 = bci_2.daL();
        bbu_2 bbu_22 = bgt_02.dpy().AZ(n);
        if (bbu_22 == null) {
            return null;
        }
        bcu_2 bcu_22 = bcm_1.hIK.v(this.aDh, bbu_22.d());
        if (bcu_22 == null) {
            return null;
        }
        bcy_1 bcy_12 = bcu_22.Bl(bbu_22.dat().d());
        if (bcy_12 == null || bcy_12.dbG()) {
            return null;
        }
        bch_2 bch_22 = (bch_2)bcy_12;
        return bch_22.Bo(n);
    }

    private boolean f(bbu_2 bbu_22) {
        return bbu_22 != null && bbu_22.apo() && bbu_22.isVisible();
    }

    public void daM() {
        if (!this.daN()) {
            csc_1.eNJ().jY(false);
        } else if (!csc_1.eNM()) {
            csc_1.eNJ().jY(true);
        }
    }

    private boolean daN() {
        if (this.hDL != -1) {
            return false;
        }
        bcd_2 bcd_22 = bci_2.daL().dpy();
        return bcd_22 != null && !bcd_22.aYv().isEmpty();
    }

    public void daO() {
        fse_1.gFu().a((aef_2)this, hDH);
    }

    public void Bf(int n) {
        this.hDK = n;
        fse_1.gFu().a((aef_2)this, hDI);
    }

    public void Bg(int n) {
        this.Be(n);
        this.daP();
    }

    public void daP() {
        fse_1.gFu().a((aef_2)this, hDJ);
        TIntArrayList tIntArrayList = bci_2.daL().dpy().aYv();
        fse_1.gFu().f("canFollowMoreAchievements", tIntArrayList.size() < 4);
        this.daM();
        bcm_1.hIK.dcv();
    }

    public void Bh(int n) {
        bgt_0 bgt_02 = bci_2.daL();
        if (bgt_02 == null || !this.f(bgt_02.dpy().AZ(n))) {
            return;
        }
        mp_1 mp_12 = mq_1.aXr.nN(n);
        if (mp_12 != null) {
            bci_1 bci_12 = bcm_1.hIK.t(bgt_02.Sn(), n);
            this.hDL = mp_12.d();
            csc_1.eNJ().b(bci_12);
        }
        this.daM();
    }

    public void Bi(int n) {
        int n2;
        bgt_0 bgt_02 = bci_2.daL();
        if (bgt_02 == null || !this.f(bgt_02.dpy().AZ(n))) {
            return;
        }
        mp_1 mp_12 = mq_1.aXr.nN(n);
        if (mp_12 != null && n == (n2 = mp_12.nL(mp_12.aVo() - 1))) {
            this.hDL = -1;
            csc_1.eNJ().eNO();
        }
        this.daM();
    }

    public void daQ() {
        if (this.hDK != -1) {
            bfM bfM2 = bgk.hZN.Cx(this.hDK);
            bfM2.dbA();
        }
    }

    public void daR() {
        TIntArrayList tIntArrayList = bci_2.daL().dpy().aYv();
        int n = tIntArrayList.size();
        for (int i = 0; i < n; ++i) {
            bci_1 bci_12 = this.Be(tIntArrayList.get(i));
            if (bci_12 == null) continue;
            bci_12.daR();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from btd
 */
public final class btd_0 {
    private static final int jkF = 0;
    private bsj_0 hvQ = null;
    private aVm jkG;
    private avs_0 jkH;
    private avj_0 jkI;
    private aVH jkJ;
    private awk_0 jkK;
    private aVU jkL;
    private awp_0 jkM;

    public void bGy() {
        this.a(avs_0.a(agb_1.cbm(), eui_1.rsD.aJr(), 0, "fight.beginning"), this.jkG, avf_0.a(agb_1.cbm(), eui_1.rsI.aJr(), 0, btd_0.dHE()), this.jkH, this.jkI, this.jkJ, this.jkK, this.jkM, this.jkL);
        aVi.cWF().m(this.hvQ);
    }

    public static ArrayList<adi_1> dHE() {
        ArrayList<adi_1> arrayList = new ArrayList<adi_1>();
        arrayList.add(cya_1.eYj());
        arrayList.add(cub_1.eSi());
        arrayList.add(cuu_1.eRU());
        return arrayList;
    }

    private void a(aft_2 ... aft_2Array) {
        for (int i = 0; i < aft_2Array.length; ++i) {
            aft_2 aft_22 = aft_2Array[i];
            this.b(aft_22);
        }
    }

    private void b(aft_2 aft_22) {
        aVi.cWF().a(this.hvQ, aft_22);
    }

    public void reset() {
        this.jkG = null;
        this.jkH = null;
        this.jkI = null;
        this.jkJ = null;
        this.jkK = null;
        this.jkL = null;
        this.jkM = null;
    }

    public void i(bsj_0 bsj_02) {
        this.hvQ = bsj_02;
    }

    public void a(avs_0 avs_02) {
        this.jkH = avs_02;
    }

    public void a(aVU aVU2) {
        this.jkL = aVU2;
    }

    public void a(awp_0 awp_02) {
        this.jkM = awp_02;
    }

    public void a(awk_0 awk_02) {
        this.jkK = awk_02;
    }

    public void a(aVH aVH2) {
        this.jkJ = aVH2;
    }

    public void a(avj_0 avj_02) {
        this.jkI = avj_02;
    }

    public void a(bgy bgy2, acd_1 acd_12) {
        if (this.jkG == null) {
            this.jkG = aVm.a(agb_1.cbm(), eui_1.rsz.aJr(), 0, bgy2, acd_12);
        } else {
            this.jkG.a(bgy2, acd_12);
        }
    }
}


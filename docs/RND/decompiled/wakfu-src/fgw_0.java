/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fgw
 */
public class fgw_0
implements RU<ffh_0> {
    private static final fgw_0 sjE = new fgw_0();

    public static fgw_0 fXd() {
        return sjE;
    }

    private fgw_0() {
    }

    @Override
    public int a(RS rS, ffh_0 ffh_02) {
        ffc_0 ffc_02 = (ffc_0)rS;
        if (ffh_02.dSx().sID > ffc_02.fVt()) {
            return -10;
        }
        return this.a(ffc_02.fVu(), ffh_02.getItem());
    }

    public int a(fgz_0 fgz_02, ffV ffV2) {
        if (ffV2 == null) {
            return -3;
        }
        if (ffV2.dOg() == null) {
            return -3;
        }
        if (ffV2.dOg().dGh() == null) {
            return -3;
        }
        if (fgz_02 != null && !fgz_02.isValid(ffV2.dOg().dGh())) {
            return -3;
        }
        return 0;
    }

    @Override
    public int a(RS rS, ffh_0 ffh_02, short s) {
        return this.a(rS, ffh_02);
    }

    @Override
    public int a(RS rS, ffh_0 ffh_02, ffh_0 ffh_03) {
        return this.a(rS, ffh_03);
    }

    @Override
    public int b(RS rS, ffh_0 ffh_02) {
        return 0;
    }

    @Override
    public boolean a(ffh_0 ffh_02, qu_0 qu_02, qm_0 qm_02) {
        return true;
    }

    @Override
    public boolean a(RS<ffh_0> rS, qu_0 qu_02, qm_0 qm_02) {
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSu
 */
public class csu_1
implements adi_1 {
    private static final csu_1 nFC = new csu_1();
    private alx_2 ikv;

    public static csu_1 eOe() {
        return nFC;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19169: {
                ama_1 ama_12 = (ama_1)aam_22;
                bfi_0 bfi_02 = (bfi_0)ama_12.bCv();
                bfa bfa2 = (bfa)fse_1.gFu().vY("battlegroundListView");
                if (bfi_02 == null || bfa2.dfy() != null && bfa2.dfy().dfI().d() == bfi_02.dfI().d()) {
                    bfa2.a((bfi_0)null);
                } else {
                    bfa2.a(bfi_02);
                }
                return false;
            }
            case 19701: {
                bfa bfa3 = (bfa)fse_1.gFu().vY("battlegroundListView");
                int n = bfa3.dfz() - 1;
                if (n < 1) {
                    return false;
                }
                bfa3.BH(n);
                return false;
            }
            case 19512: {
                bfa bfa4 = (bfa)fse_1.gFu().vY("battlegroundListView");
                int n = bfa4.dfz() + 1;
                if (n > bfa4.dfA()) {
                    return false;
                }
                bfa4.BH(n);
                return false;
            }
            case 17437: {
                ama_1 ama_13 = (ama_1)aam_22;
                bfc_0 bfc_02 = (bfc_0)ama_13.bCv();
                bfa bfa5 = (bfa)fse_1.gFu().vY("battlegroundListView");
                bfa5.a(bfc_02);
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new csv_1(this);
            bfa bfa2 = new bfa();
            bfa2.bkZ();
            aue_0.cVJ().etu().d(new cxt_0());
            fse_1.gFu().f("battlegroundListView", bfa2);
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("battlegroundListDialog", 32768L);
            fyw_0.gqw().d("wakfu.battlegroundList", cdt_2.class);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("battlegroundListDialog");
            fyw_0.gqw().tc("wakfu.battlegroundList");
            fse_1.gFu().vX("battlegroundListView");
        }
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}


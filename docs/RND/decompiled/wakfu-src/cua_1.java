/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cUA
 */
public class cua_1
implements adi_1 {
    private static final cua_1 nMM = new cua_1();

    public static cua_1 eSg() {
        return nMM;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        aam_22.d();
        return true;
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        fse_1.gFu().f("isInFightPlacement", aue_0.cVJ().c(cuh_2.eSM()));
        fse_1.gFu().f("isInFightPlayerTurn", true);
        byf_2.F("is_player_turn", true);
    }

    private void qx(String string) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(string);
        if (fhs_22 != null) {
            fes_2 fes_22 = (fes_2)fhs_22.uH("apsContainer");
            fes_22.setVisible(false);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.qx("worldAndFightBarDialog");
            this.eSh();
            fse_1.gFu().f("isInFightPlayerTurn", false);
            byf_2.F("is_player_turn", false);
        }
    }

    private void eSh() {
    }
}


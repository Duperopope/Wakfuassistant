/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXY
 */
class cxy_1
implements alw_2 {
    final /* synthetic */ cxx_2 nXz;

    cxy_1(cxx_2 cxx_22) {
        this.nXz = cxx_22;
    }

    @Override
    public void eX(String string) {
        if (!string.equals("shortcutBarDialog")) {
            return;
        }
        if (this.nXz.ieQ.ede() == fqt_0.sTc) {
            blk_2.edM();
        }
        fse_1.gFu().f("loadingShortcutBar", false);
        fyw_0.gqw().b(this);
    }
}


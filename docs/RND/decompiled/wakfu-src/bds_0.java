/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDS
 */
class bds_0
implements alx_2 {
    bds_0() {
    }

    @Override
    public void dialogUnloaded(String string) {
        if ("recyclingConfirmationDialog".equals(string)) {
            fse_1.gFu().f("recyclingConfirmation", (Object)null);
            fyw_0.gqw().b(this);
        }
    }
}


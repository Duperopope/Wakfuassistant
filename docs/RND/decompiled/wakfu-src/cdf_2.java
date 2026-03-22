/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDf
 */
class cdf_2
extends euF {
    cdf_2(cde_2 cde_22) {
    }

    @Override
    public void kX(String string) {
        cdd_2.mSN.info((Object)"Token obtained from Zaap. Starting autologin");
        euG.rx(string);
    }

    @Override
    public void kW(String string) {
        cdd_2.mSN.error((Object)("Error during zaap connection(" + string + ")"));
        euG.iY(string);
        cdd_2.fadeLogonDialogBackIn();
    }
}


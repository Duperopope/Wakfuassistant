/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDe
 */
class cde_2
extends euF {
    cde_2() {
    }

    @Override
    public void cZe() {
        cdd_2.mSN.info((Object)"Connected to Zaap. Starting token fill");
        euG.ors.b(new cdf_2(this));
    }

    @Override
    public void kW(String string) {
        cdd_2.mSN.error((Object)("Error during zaap connection(" + string + ")"));
        euG.iY(string);
        cdd_2.fadeLogonDialogBackIn();
    }
}


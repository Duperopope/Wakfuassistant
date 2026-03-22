/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDg
 */
class cdg_2
implements aww_0 {
    final /* synthetic */ String mSS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdg_2(String string) {
        this.mSS = string;
    }

    @Override
    public void kR(String string) {
        String string2 = String.format(this.mSS, aum_0.cWf().aUXX().aUR(), string);
        cdd_2.pn(string2);
    }

    @Override
    public void cXM() {
        cdd_2.mSN.error((Object)"Impossible de linker le compte, on n'a pas pu r\u00e9cup\u00e9rer de token ICE");
    }
}


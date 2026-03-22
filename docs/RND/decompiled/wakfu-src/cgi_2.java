/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGI
 */
class cgi_2
extends fmz_1 {
    final /* synthetic */ exz_1 mYO;

    cgi_2(exz_1 exz_12) {
        this.mYO = exz_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        dbx dbx2 = new dbx();
        dbx2.setName(this.mYO.getName());
        aaw_1.bUq().h(dbx2);
        return false;
    }
}


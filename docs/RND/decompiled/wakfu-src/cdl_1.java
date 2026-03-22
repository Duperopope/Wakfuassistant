/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cDL
 */
class cdl_1
extends fmz_1 {
    final /* synthetic */ String mUc;

    cdl_1(String string) {
        this.mUc = string;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        dbx dbx2 = new dbx();
        dbx2.setName(this.mUc);
        aaw_1.bUq().h(dbx2);
        return false;
    }
}


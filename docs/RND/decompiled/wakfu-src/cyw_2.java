/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYW
 */
class cyw_2
implements alx_2 {
    final /* synthetic */ cyr_2 nZO;

    cyw_2(cyr_2 cyr_22) {
        this.nZO = cyr_22;
    }

    @Override
    public void dialogUnloaded(String string) {
        this.nZO.nZr.remove((Object)string);
        if ("webShopDialog".equals(string)) {
            abg_2.bUP().h(this.nZO.nZB);
        }
        if (this.nZO.nZr.isEmpty()) {
            aue_0.cVJ().b(cyr_2.nZp);
        }
    }
}


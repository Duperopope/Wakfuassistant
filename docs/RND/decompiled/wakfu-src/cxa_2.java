/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cXa
 */
class cxa_2
implements alx_2 {
    final /* synthetic */ cwz_1 nUA;

    cxa_2(cwz_1 cwz_12) {
        this.nUA = cwz_12;
    }

    @Override
    public void dialogUnloaded(String string) {
        if (string.equals("informationMessageDialog")) {
            aue_0.cVJ().b(this.nUA);
        }
    }
}


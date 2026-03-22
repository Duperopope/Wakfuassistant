/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cba
 */
class cba_1 {
    final cbc_1 lIo;
    final agg_0 lIp = new agg_0();
    final agg_0 lIq = new agg_0();
    byte lIr = 0;
    boolean lIs = false;
    final /* synthetic */ caz_1 lIt;

    cba_1(caz_1 caz_12, cbc_1 cbc_12) {
        this.lIt = caz_12;
        this.lIo = cbc_12;
        this.lIp.setSpeed(2.1f);
        this.lIp.cF(0.01f);
        this.lIq.setSpeed(2.1f);
        this.lIq.cF(0.01f);
    }

    public void a(aah_1<cax_1> aah_12) {
        for (int i = this.lIt.lIj.bTR() - 1; i >= 0; --i) {
            this.lIs |= this.lIt.lIj.vU(i).cU(this.lIo.aJr());
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cdY
 */
class cdy_0
implements asi_2 {
    final /* synthetic */ aaj_0 lRI;
    final /* synthetic */ bgt_0 lRJ;
    final /* synthetic */ long lRK;
    final /* synthetic */ bzq_2 lRL;
    final /* synthetic */ aie_0 lRM;
    final /* synthetic */ bdj_2 lRN;
    final /* synthetic */ acd_1 lRO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cdy_0(cdv_0 cdv_02, aaj_0 aaj_02, bgt_0 bgt_02, long l, bzq_2 bzq_22, aie_0 aie_02, bdj_2 bdj_22, acd_1 acd_12) {
        this.lRI = aaj_02;
        this.lRJ = bgt_02;
        this.lRK = l;
        this.lRL = bzq_22;
        this.lRM = aie_02;
        this.lRN = bdj_22;
        this.lRO = acd_12;
    }

    @Override
    public void buf() {
        this.lRI.bqL().bqH();
        aaE.brU().brW();
        aaE.brU().c(this.lRI, 300);
    }

    @Override
    public void bug() {
        asj_2.bJt().b(this);
        this.lRJ.fY(false);
    }

    @Override
    public void bud() {
    }

    @Override
    public void bue() {
        if (can_0.lHv.bhh() == this.lRK) {
            this.lRI.a(this.lRL.lEE);
            cdv_0.a(this.lRM.bmD(), this.lRL);
        }
        try {
            this.lRN.X(this.lRO.getX(), this.lRO.getY(), this.lRO.bdi());
        }
        catch (Exception exception) {
            cdv_0.lRu.error((Object)"Exception levee", (Throwable)exception);
        }
    }
}


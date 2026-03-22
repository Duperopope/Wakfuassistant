/*
 * Decompiled with CFR 0.152.
 */
class bOb
implements Runnable {
    final /* synthetic */ RH kJz;
    final /* synthetic */ long kJA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bOb(bOa bOa2, RH rH, long l) {
        this.kJz = rH;
        this.kJA = l;
    }

    @Override
    public void run() {
        coc_0 coc_02 = new coc_0(this.kJz.Sn(), this.kJA);
        aue_0.cVJ().etu().d(coc_02);
        aue_0.cVJ().b(czl_2.eYY());
    }
}


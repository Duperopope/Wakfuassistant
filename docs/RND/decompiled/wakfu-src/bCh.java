/*
 * Decompiled with CFR 0.152.
 */
class bCh
implements Runnable {
    final /* synthetic */ bgt_0 jHa;
    final /* synthetic */ fdg_0 jHb;
    final /* synthetic */ bCd jHc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bCh(bCd bCd2, bgt_0 bgt_02, fdg_0 fdg_02) {
        this.jHc = bCd2;
        this.jHa = bgt_02;
        this.jHb = fdg_02;
    }

    @Override
    public void run() {
        this.jHc.a(this.jHa, this.jHb);
    }
}


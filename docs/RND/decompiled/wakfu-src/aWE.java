/*
 * Decompiled with CFR 0.152.
 */
class aWE
implements Runnable {
    final /* synthetic */ bdj_2 hvu;
    final /* synthetic */ aWD hvv;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aWE(aWD aWD2, bdj_2 bdj_22) {
        this.hvv = aWD2;
        this.hvu = bdj_22;
    }

    @Override
    public void run() {
        this.hvv.f(this.hvu);
    }
}


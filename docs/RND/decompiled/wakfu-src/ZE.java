/*
 * Decompiled with CFR 0.152.
 */
class ZE
implements Runnable {
    final /* synthetic */ ZC bWg;

    ZE(ZC zC) {
        this.bWg = zC;
    }

    @Override
    public void run() {
        if (this.bWg.bWb == null) {
            return;
        }
        if (this.bWg.bVk != null) {
            this.bWg.bVk.reset();
        }
        this.bWg.bVk = this.bWg.bWb;
        this.bWg.bWb = null;
        this.bWg.bpC();
    }
}


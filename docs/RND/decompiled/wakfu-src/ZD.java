/*
 * Decompiled with CFR 0.152.
 */
class ZD
implements Runnable {
    final /* synthetic */ ZC bWf;

    ZD(ZC zC) {
        this.bWf = zC;
    }

    @Override
    public void run() {
        if (this.bWf.bVk != null) {
            this.bWf.l(this.bWf.bVk.aJM());
        }
    }
}


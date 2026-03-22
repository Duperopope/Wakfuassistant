/*
 * Decompiled with CFR 0.152.
 */
class aeF
implements Runnable {
    final /* synthetic */ aeE cnB;

    aeF(aeE aeE2) {
        this.cnB = aeE2;
    }

    @Override
    public void run() {
        if (this.cnB.cnA.cny != null && this.cnB.cnA.cnz != null) {
            this.cnB.cnA.cny.c(this.cnB.cnA.cnz);
        }
    }
}


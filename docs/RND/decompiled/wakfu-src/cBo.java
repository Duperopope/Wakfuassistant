/*
 * Decompiled with CFR 0.152.
 */
class cBo
extends Thread {
    private boolean btq = false;
    final /* synthetic */ cBn mxi;

    cBo(cBn cBn2) {
        this.mxi = cBn2;
    }

    public void cL(boolean bl) {
        this.btq = bl;
    }

    @Override
    public void run() {
        while (true) {
            if (this.btq) {
                try {
                    this.mxi.hD(System.currentTimeMillis());
                }
                catch (Throwable throwable) {
                    cBn.mwZ.warn((Object)"Exception dans le Thread de moteur d'ambiance.", throwable);
                }
            }
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
            }
        }
    }
}


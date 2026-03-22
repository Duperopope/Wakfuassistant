/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class WC
implements Runnable {
    final /* synthetic */ short bOK;
    final /* synthetic */ short bOL;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    WC(short s, short s2) {
        this.bOK = s;
        this.bOL = s2;
    }

    @Override
    public void run() {
        try {
            wa_0.j(this.bOK, this.bOL);
        }
        catch (IOException iOException) {
            wa_0.bOy.error((Object)"", (Throwable)iOException);
        }
    }
}


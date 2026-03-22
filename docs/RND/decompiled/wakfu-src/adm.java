/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

class adm
implements Runnable {
    final /* synthetic */ short cjm;
    final /* synthetic */ short cjn;
    final /* synthetic */ adk cjo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    adm(adk adk2, short s, short s2) {
        this.cjo = adk2;
        this.cjm = s;
        this.cjn = s2;
    }

    @Override
    public void run() {
        try {
            this.cjo.j(this.cjm, this.cjn);
        }
        catch (IOException iOException) {
            adk.cjc.error((Object)"", (Throwable)iOException);
        }
    }
}


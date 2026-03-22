/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fmK
extends flx_0 {
    private static final Logger sHa = Logger.getLogger(fmK.class);
    private final int sHb;

    public fmK(fjm fjm2, int n) {
        super(fjm2);
        this.sHb = n;
    }

    public int gdu() {
        return this.sHb;
    }

    @Override
    public void gdk() {
        fjo_0 fjo_02 = this.sEH.ffF().ems();
        if (fjo_02 == null) {
            return;
        }
        try {
            fjo_02.gbo().b(this);
        }
        catch (RuntimeException runtimeException) {
            sHa.error((Object)"Exception levee", (Throwable)runtimeException);
        }
    }

    @Override
    public fly_0 gdl() {
        return fly_0.sEX;
    }
}


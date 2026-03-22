/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fbE
 */
public final class fbe_0
implements fbu {
    private static final Logger rRY = Logger.getLogger(fbe_0.class);
    private final int rRZ;

    public fbe_0(fbf_0 fbf_02) {
        this.rRZ = fbf_02.fRX();
    }

    @Override
    public void Y(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rRY.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TW(this.rRZ);
    }

    @Override
    public void Z(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rRY.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TW(-this.rRZ);
    }

    @Override
    public boolean fRO() {
        return false;
    }
}


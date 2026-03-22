/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fbC
 */
public final class fbc_0
implements fbu {
    private static final Logger rRV = Logger.getLogger(fbc_0.class);
    private final int rRW;

    public fbc_0(fbd_0 fbd_02) {
        this.rRW = fbd_02.fRW();
    }

    @Override
    public void Y(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rRV.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TV(this.rRW);
    }

    @Override
    public void Z(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rRV.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TV(-this.rRW);
    }

    @Override
    public boolean fRO() {
        return false;
    }
}


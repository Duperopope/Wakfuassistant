/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fbB
 */
public final class fbb_0
implements fbu {
    private static final Logger rRT = Logger.getLogger(fbb_0.class);
    private final int rRU;

    public fbb_0(fba_0 fba_02) {
        this.rRU = fba_02.fRV();
    }

    @Override
    public void Y(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rRT.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TT(this.rRU);
    }

    @Override
    public void Z(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rRT.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TT(-this.rRU);
    }

    @Override
    public boolean fRO() {
        return false;
    }
}


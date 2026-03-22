/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fbH
 */
public final class fbh_0
implements fbu {
    private static final Logger rSd = Logger.getLogger(fbh_0.class);
    private final int rSe;

    public fbh_0(fbi_0 fbi_02) {
        this.rSe = fbi_02.fRU();
    }

    @Override
    public void Y(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rSd.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TX(this.rSe);
    }

    @Override
    public void Z(long l, long l2) {
        fby fby2;
        try {
            fby2 = fbz.rRR.sa(l);
        }
        catch (fbt fbt2) {
            rSd.error((Object)"Exception raised", (Throwable)fbt2);
            return;
        }
        fby2.TX(0);
    }

    @Override
    public boolean fRO() {
        return false;
    }

    public String toString() {
        return "PerceptionBonus{m_perceptionRate=" + this.rSe + "}";
    }
}


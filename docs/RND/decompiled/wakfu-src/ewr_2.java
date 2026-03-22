/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eWr
 */
class ewr_2
implements ewt_2 {
    private static final Logger rBx = Logger.getLogger(ewr_2.class);
    private final euc_0<? extends exP> rBy;

    ewr_2(euc_0<? extends exP> euc_02) {
        this.rBy = euc_02;
    }

    @Override
    public int rh(long l) {
        exP exP2 = this.rBy.ku(l);
        if (exP2 == null) {
            rBx.error((Object)("[_FL_] fightId=" + this.rBy.d() + " : Fighter inconnu " + l + " on ne peut pas recuperer son init"));
        }
        return exP2 == null ? 0 : exP2.c(exx_2.rGI);
    }

    @Override
    public boolean ri(long l) {
        exP exP2 = this.rBy.ku(l);
        return exP2 != null && exP2.a(exe_1.rDl);
    }
}


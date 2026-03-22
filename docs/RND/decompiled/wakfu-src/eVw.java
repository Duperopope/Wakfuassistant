/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class eVw {
    static final Logger rAh = Logger.getLogger(eVw.class);
    private evv_0 rAi = evv_0.rAb;
    private byte ebP;
    private final byte rAj;
    private final boolean rAk;
    private final long rAl;
    private boolean rAm;
    private Long rAn;

    eVw(byte by, boolean bl, boolean bl2, long l) {
        this.rAk = bl2;
        this.rAj = by;
        this.ebP = by;
        this.rAm = bl;
        this.rAl = l;
        this.rAn = l;
    }

    public boolean baH() {
        return this.rAi == evv_0.rAb;
    }

    public boolean baI() {
        return this.rAi == evv_0.rAc;
    }

    public boolean baM() {
        return this.rAi == evv_0.rAd;
    }

    public evv_0 fNh() {
        return this.rAi;
    }

    public byte bcP() {
        return this.ebP;
    }

    public void az(byte by) {
        this.ebP = by;
    }

    public byte fNi() {
        return this.rAj;
    }

    boolean a(evv_0 evv_02) {
        if (this.rAi != evv_02.fNf()) {
            rAh.error((Object)String.format("[FIGHT_STATE] \u00c9tat incorrect pour une transition vers l'\u00e9tat %s, actuel: %s, requis: %s", new Object[]{evv_02, this.rAi, evv_02.fNf()}), (Throwable)new Exception("for stacktrace"));
            return false;
        }
        this.rAi = evv_02;
        return true;
    }

    void b(evv_0 evv_02) {
        this.rAi = evv_02;
    }

    public boolean fNj() {
        return this.rAk;
    }

    public boolean fNk() {
        return this.rAm;
    }

    public void mK(boolean bl) {
        this.rAm = bl;
    }

    public long dOo() {
        return this.rAl;
    }

    public Long fNl() {
        return this.rAn;
    }

    public void a(Long l, byte by) {
        this.rAn = l;
        this.ebP = by;
    }

    public boolean qZ(long l) {
        return this.rAn != null && this.rAn == l;
    }

    public boolean ra(long l) {
        return this.rAl == l;
    }
}


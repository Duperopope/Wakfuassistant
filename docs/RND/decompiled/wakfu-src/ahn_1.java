/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aHn
 */
public class ahn_1 {
    protected static final Logger dPH = Logger.getLogger(ahn_1.class);
    private static final ahn_1 dPI = new ahn_1();
    private final Map<Long, ahk_1> dPJ = new HashMap<Long, ahk_1>();
    private long dOX = 0L;
    private static final ObjectPool dPK = new ayv_2(new aho_1());

    public static ahn_1 ccT() {
        return dPI;
    }

    public long ccU() {
        if (this.dOX == Long.MAX_VALUE) {
            this.dOX = 0L;
        }
        return this.dOX++;
    }

    public synchronized ahk_1 l(long l, long l2) {
        try {
            ahk_1 ahk_12 = (ahk_1)dPK.borrowObject();
            ahk_12.dW(true);
            ahk_12.gc(l);
            ahk_12.hF(l2 == -1L ? this.ccU() : l2);
            this.dPJ.put(ahk_12.ccq(), ahk_12);
            return ahk_12;
        }
        catch (Exception exception) {
            dPH.error((Object)"Exception lev\u00e9e lors du checkOut d'une source audio : ", (Throwable)exception);
            return null;
        }
    }

    public synchronized void d(ahk_1 ahk_12) {
        try {
            if (ahk_12 != null) {
                agk_1 agk_12 = ahk_12.ccr();
                ahw_1.a("Removing " + ahk_12.ccQ(), agk_12 == null ? (byte)-1 : (byte)agk_12.cbE());
                ahk_12.dW(false);
                this.dPJ.remove(ahk_12.ccq());
                dPK.returnObject((Object)ahk_12);
            }
        }
        catch (Exception exception) {
            dPH.error((Object)"Exception lev\u00e9e lors du release d'une source audio : ", (Throwable)exception);
        }
    }

    public synchronized ahk_1 hL(long l) {
        return this.dPJ.get(l);
    }

    public ahk_1 ccV() {
        byte by = -1;
        ahk_1 ahk_12 = null;
        for (ahk_1 ahk_13 : this.dPJ.values()) {
            if (ahk_13.cbF() <= by) continue;
            ahk_12 = ahk_13;
            by = ahk_13.cbF();
        }
        return ahk_12;
    }

    public Collection<ahk_1> ccW() {
        return this.dPJ.values();
    }
}


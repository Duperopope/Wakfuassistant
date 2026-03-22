/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Optional;
import org.apache.log4j.Logger;

public class eMV {
    private static final Logger qOr = Logger.getLogger(eMV.class);

    public boolean b(long l, long l2, int n, int n2) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qOr.info((Object)"Can't change dungeon difficulty, player null");
            return false;
        }
        Optional<fte_0> optional = ((exP)t).doa();
        if (optional == null || optional.isEmpty()) {
            qOr.info((Object)("Can't change dungeon difficulty, instance info null, playerId = " + ((exP)t).Sn()));
            return false;
        }
        fte_0 fte_02 = optional.get();
        if (fte_02.bhh() != l2) {
            qOr.warn((Object)("Can't change dungeon difficulty, player not in instance, playerId = " + ((exP)t).Sn() + ", worldId = " + fte_02.bhh()));
            return false;
        }
        if (fte_02.erD()) {
            qOr.warn((Object)("Can't change dungeon difficulty during a fight, playerId = " + ((exP)t).Sn() + ", worldId = " + fte_02.bhh()));
            return false;
        }
        int n3 = this.RI(n);
        if (n2 < n3 || n2 > 10) {
            qOr.warn((Object)("Can't change dungeon difficulty, selected difficulty outside the authorized limits, playerId = " + ((exP)t).Sn() + ", worldId = " + fte_02.bhh() + ", difficulty = " + n2));
            return false;
        }
        if (!fte_02.cmT()) {
            qOr.warn((Object)("Can't change dungeon difficulty, difficulty not available, playerId = " + ((exP)t).Sn() + ", worldId = " + fte_02.bhh()));
            return false;
        }
        if (fte_02.GN() < n2 && !fte_02.erC()) {
            qOr.warn((Object)("Can't change dungeon difficulty, difficulty can't be increased, playerId = " + ((exP)t).Sn() + ", worldId = " + fte_02.bhh()));
            return false;
        }
        return true;
    }

    public boolean c(long l, int n, int n2, boolean bl) {
        Object t = fcL.rUh.sw(l);
        if (t == null) {
            qOr.info((Object)"Can't change dungeon difficulty, player null");
            return false;
        }
        int n3 = this.RI(n2);
        if (n < n3 || n > 10) {
            qOr.warn((Object)("Can't change dungeon difficulty. The selected difficulty is outside the authorized limits, playerId = " + ((exP)t).Sn() + ", instanceId = , difficulty = " + n));
            return false;
        }
        return true;
    }

    private int RI(int n) {
        eIb eIb2 = eId.quO.PM(n);
        if (eIb2 == null) {
            return 1;
        }
        return eIb2.cmS();
    }

    public static boolean RJ(int n) {
        eIb eIb2 = eId.quO.PM(n);
        if (eIb2 == null) {
            return false;
        }
        return eIb2.aVf() > 186;
    }
}


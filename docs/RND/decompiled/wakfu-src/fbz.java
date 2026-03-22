/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class fbz {
    private final Map<Long, fby> rRQ = new HashMap<Long, fby>();
    public static final fbz rRR = new fbz();

    private fbz() {
    }

    public fby sa(long l) {
        if (l <= 0L) {
            throw new fbt("guildId can not be <= 0");
        }
        fby fby2 = this.rRQ.get(l);
        if (fby2 == null) {
            fby2 = this.sc(l);
        }
        return fby2;
    }

    public fby sb(long l) {
        return this.sc(l);
    }

    private fby sc(long l) {
        fby fby2 = new fby();
        this.rRQ.put(l, fby2);
        return fby2;
    }
}


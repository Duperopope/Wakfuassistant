/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRQ
 */
public class erq_0
implements qh_0 {
    public static final long riP = 0x1000000L;
    private static long riQ = 0x1000000L;

    @Override
    public synchronized long baY() {
        if (riQ == Long.MAX_VALUE) {
            riQ = 0x1000000L;
        }
        return riQ++;
    }
}


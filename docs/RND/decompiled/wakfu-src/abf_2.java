/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aBf
 */
public final class abf_2
extends Enum<abf_2> {
    public static final /* enum */ abf_2 dyc = new abf_2(1000L);
    public static final /* enum */ abf_2 dyd = new abf_2(60000L);
    public static final /* enum */ abf_2 dye = new abf_2(3600000L);
    public static final /* enum */ abf_2 dyf = new abf_2(86400000L);
    private final long dyg;
    private static final /* synthetic */ abf_2[] dyh;

    public static abf_2[] values() {
        return (abf_2[])dyh.clone();
    }

    public static abf_2 valueOf(String string) {
        return Enum.valueOf(abf_2.class, string);
    }

    private abf_2(long l) {
        this.dyg = l;
    }

    public long ho(long l) {
        return this.dyg * l;
    }

    private static /* synthetic */ abf_2[] bUO() {
        return new abf_2[]{dyc, dyd, dye, dyf};
    }

    static {
        dyh = abf_2.bUO();
    }
}


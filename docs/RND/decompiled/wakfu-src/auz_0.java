/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUz
 */
public final class auz_0
extends Enum<auz_0> {
    public static final /* enum */ auz_0 gzk = new auz_0(8);
    public static final /* enum */ auz_0 gzl = new auz_0(8);
    public static final /* enum */ auz_0 gzm = new auz_0(1);
    public static final /* enum */ auz_0 gzn = new auz_0(0);
    private final byte gzo;
    private static final /* synthetic */ auz_0[] gzp;

    public static auz_0[] values() {
        return (auz_0[])gzp.clone();
    }

    public static auz_0 valueOf(String string) {
        return Enum.valueOf(auz_0.class, string);
    }

    private auz_0(byte by) {
        this.gzo = by;
    }

    public byte aWj() {
        return this.gzo;
    }

    private static /* synthetic */ auz_0[] cVa() {
        return new auz_0[]{gzk, gzl, gzm, gzn};
    }

    static {
        gzp = auz_0.cVa();
    }
}


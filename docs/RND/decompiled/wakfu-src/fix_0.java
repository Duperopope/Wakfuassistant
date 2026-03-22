/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiX
 */
public final class fix_0
extends Enum<fix_0> {
    public static final /* enum */ fix_0 sup = new fix_0(0);
    public static final /* enum */ fix_0 suq = new fix_0(1);
    public static final /* enum */ fix_0 sur = new fix_0(2);
    public static final /* enum */ fix_0 sus = new fix_0(3);
    public static final /* enum */ fix_0 sut = new fix_0(4);
    public static final /* enum */ fix_0 suu = new fix_0(5);
    public static final /* enum */ fix_0 suv = new fix_0(6);
    private final int suw;
    private static final /* synthetic */ fix_0[] sux;

    public static fix_0[] values() {
        return (fix_0[])sux.clone();
    }

    public static fix_0 valueOf(String string) {
        return Enum.valueOf(fix_0.class, string);
    }

    private fix_0(int n2) {
        this.suw = n2;
    }

    public int d() {
        return this.suw;
    }

    private static /* synthetic */ fix_0[] gav() {
        return new fix_0[]{sup, suq, sur, sus, sut, suu, suv};
    }

    static {
        sux = fix_0.gav();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public final class Uv
extends Enum<Uv> {
    public static final /* enum */ Uv bvz = new Uv();
    public static final /* enum */ Uv bvA = new Uv();
    public static final /* enum */ Uv bvB = new Uv();
    public static final /* enum */ Uv bvC = new Uv();
    public static final /* enum */ Uv bvD = new Uv();
    private static final /* synthetic */ Uv[] bvE;

    public static Uv[] values() {
        return (Uv[])bvE.clone();
    }

    public static Uv valueOf(String string) {
        return Enum.valueOf(Uv.class, string);
    }

    private static /* synthetic */ Uv[] bjs() {
        return new Uv[]{bvz, bvA, bvB, bvC, bvD};
    }

    static {
        bvE = Uv.bjs();
    }
}


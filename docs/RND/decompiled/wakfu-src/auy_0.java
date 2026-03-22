/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aUy
 */
public final class auy_0
extends Enum<auy_0> {
    public static final /* enum */ auy_0 gzf = new auy_0(true);
    public static final /* enum */ auy_0 gzg = new auy_0(false);
    public static final /* enum */ auy_0 gzh = new auy_0(false);
    private final boolean gzi;
    private static final /* synthetic */ auy_0[] gzj;

    public static auy_0[] values() {
        return (auy_0[])gzj.clone();
    }

    public static auy_0 valueOf(String string) {
        return Enum.valueOf(auy_0.class, string);
    }

    private auy_0(boolean bl) {
        this.gzi = bl;
    }

    public boolean cUY() {
        return this.gzi;
    }

    private static /* synthetic */ auy_0[] cUZ() {
        return new auy_0[]{gzf, gzg, gzh};
    }

    static {
        gzj = auy_0.cUZ();
    }
}


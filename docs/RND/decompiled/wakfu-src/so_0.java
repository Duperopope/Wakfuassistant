/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from SO
 */
public final class so_0
extends Enum<so_0> {
    public static final /* enum */ so_0 bpF = new so_0(2);
    public static final /* enum */ so_0 bpG = new so_0(1);
    public static final /* enum */ so_0 bpH = new so_0(3);
    public static final /* enum */ so_0 bpI = new so_0(0);
    private final int bpJ;
    private static final /* synthetic */ so_0[] bpK;

    public static so_0[] values() {
        return (so_0[])bpK.clone();
    }

    public static so_0 valueOf(String string) {
        return Enum.valueOf(so_0.class, string);
    }

    private so_0(int n2) {
        this.bpJ = n2;
    }

    public int d() {
        return this.bpJ;
    }

    private static /* synthetic */ so_0[] bfZ() {
        return new so_0[]{bpF, bpG, bpH, bpI};
    }

    static {
        bpK = so_0.bfZ();
    }
}


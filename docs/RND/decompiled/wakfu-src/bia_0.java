/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from biA
 */
public final class bia_0
extends Enum<bia_0> {
    public static final /* enum */ bia_0 ikZ = new bia_0(1);
    public static final /* enum */ bia_0 ila = new bia_0(2);
    public static final /* enum */ bia_0 ilb = new bia_0(3);
    private final byte ilc;
    private static final /* synthetic */ bia_0[] ild;

    public static bia_0[] values() {
        return (bia_0[])ild.clone();
    }

    public static bia_0 valueOf(String string) {
        return Enum.valueOf(bia_0.class, string);
    }

    private bia_0(int n2) {
        this.ilc = GC.ct(n2);
    }

    public byte aJr() {
        return this.ilc;
    }

    private static /* synthetic */ bia_0[] dqk() {
        return new bia_0[]{ikZ, ila, ilb};
    }

    static {
        ild = bia_0.dqk();
    }
}


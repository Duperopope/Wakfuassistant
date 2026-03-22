/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQo
 */
public final class bqo_2
extends Enum<bqo_2> {
    public static final /* enum */ bqo_2 kUx = new bqo_2(0);
    public static final /* enum */ bqo_2 kUy = new bqo_2(1);
    public static final /* enum */ bqo_2 kUz = new bqo_2(2);
    public static final /* enum */ bqo_2 kUA = new bqo_2(3);
    private final byte kUB;
    private static final /* synthetic */ bqo_2[] kUC;

    public static bqo_2[] values() {
        return (bqo_2[])kUC.clone();
    }

    public static bqo_2 valueOf(String string) {
        return Enum.valueOf(bqo_2.class, string);
    }

    private bqo_2(byte by) {
        this.kUB = by;
    }

    public byte aJr() {
        return this.kUB;
    }

    private static /* synthetic */ bqo_2[] eji() {
        return new bqo_2[]{kUx, kUy, kUz, kUA};
    }

    static {
        kUC = bqo_2.eji();
    }
}


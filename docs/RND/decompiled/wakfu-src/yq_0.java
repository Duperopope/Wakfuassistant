/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Yq
 */
public abstract sealed class yq_0
extends Enum<yq_0>
permits yr_0, ys_0, yt_0 {
    public static final /* enum */ yq_0 bTR = new yr_0();
    public static final /* enum */ yq_0 bTS = new ys_0();
    public static final /* enum */ yq_0 bTT = new yt_0();
    private static final /* synthetic */ yq_0[] bTU;

    public static yq_0[] values() {
        return (yq_0[])bTU.clone();
    }

    public static yq_0 valueOf(String string) {
        return Enum.valueOf(yq_0.class, string);
    }

    public abstract Float a(Number var1);

    private static /* synthetic */ yq_0[] bov() {
        return new yq_0[]{bTR, bTS, bTT};
    }

    static {
        bTU = yq_0.bov();
    }
}


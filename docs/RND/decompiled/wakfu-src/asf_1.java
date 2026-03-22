/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asF
 */
public abstract sealed class asf_1
extends Enum<asf_1>
permits asg_1, ash_1, asi_1, asj_1, ask_1 {
    public static final /* enum */ asf_1 cZr = new asg_1();
    public static final /* enum */ asf_1 cZs = new ash_1();
    public static final /* enum */ asf_1 cZt = new asi_1();
    public static final /* enum */ asf_1 cZu = new asj_1();
    public static final /* enum */ asf_1 cZv = new ask_1();
    private static final /* synthetic */ asf_1[] cZw;

    public static asf_1[] values() {
        return (asf_1[])cZw.clone();
    }

    public static asf_1 valueOf(String string) {
        return Enum.valueOf(asf_1.class, string);
    }

    public abstract int bDw();

    private static /* synthetic */ asf_1[] bJV() {
        return new asf_1[]{cZr, cZs, cZt, cZu, cZv};
    }

    static {
        cZw = asf_1.bJV();
    }
}


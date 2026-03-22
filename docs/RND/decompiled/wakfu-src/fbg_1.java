/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBG
 */
public final class fbg_1
extends Enum<fbg_1> {
    public static final /* enum */ fbg_1 tUT = new fbg_1();
    public static final /* enum */ fbg_1 tUU = new fbg_1();
    public static final /* enum */ fbg_1 tUV = new fbg_1();
    public static final /* enum */ fbg_1 tUW = new fbg_1();
    private static final /* synthetic */ fbg_1[] tUX;

    public static fbg_1[] values() {
        return (fbg_1[])tUX.clone();
    }

    public static fbg_1 valueOf(String string) {
        return Enum.valueOf(fbg_1.class, string);
    }

    public static fbg_1 tL(String string) {
        fbg_1[] fbg_1Array;
        for (fbg_1 fbg_12 : fbg_1Array = fbg_1.values()) {
            if (!fbg_12.name().equals(string.toUpperCase())) continue;
            return fbg_12;
        }
        return fbg_1Array[0];
    }

    private static /* synthetic */ fbg_1[] gtu() {
        return new fbg_1[]{tUT, tUU, tUV, tUW};
    }

    static {
        tUX = fbg_1.gtu();
    }
}


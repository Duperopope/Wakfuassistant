/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cIz
 */
public final class ciz_1
extends Enum<ciz_1> {
    public static final /* enum */ ciz_1 ndW = new ciz_1();
    public static final /* enum */ ciz_1 ndX = new ciz_1();
    public static final /* enum */ ciz_1 ndY = new ciz_1();
    public static final /* enum */ ciz_1 ndZ = new ciz_1();
    public static final /* enum */ ciz_1 nea = new ciz_1();
    public static final /* enum */ ciz_1 neb = new ciz_1();
    private static final /* synthetic */ ciz_1[] nec;

    public static ciz_1[] values() {
        return (ciz_1[])nec.clone();
    }

    public static ciz_1 valueOf(String string) {
        return Enum.valueOf(ciz_1.class, string);
    }

    public ciz_1 eLk() {
        if (this == ndW) {
            return ndX;
        }
        if (this == ndX) {
            return ndW;
        }
        return this;
    }

    private static /* synthetic */ ciz_1[] eLl() {
        return new ciz_1[]{ndW, ndX, ndY, ndZ, nea, neb};
    }

    static {
        nec = ciz_1.eLl();
    }
}


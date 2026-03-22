/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from auY
 */
public final class auy_2
extends Enum<auy_2> {
    public static final /* enum */ auy_2 dfW = new auy_2(5889);
    public static final /* enum */ auy_2 dfX = new auy_2(5890);
    public static final /* enum */ auy_2 dfY = new auy_2(5888);
    public final int dfZ;
    private static final /* synthetic */ auy_2[] dga;

    public static auy_2[] values() {
        return (auy_2[])dga.clone();
    }

    public static auy_2 valueOf(String string) {
        return Enum.valueOf(auy_2.class, string);
    }

    private auy_2(int n2) {
        this.dfZ = n2;
    }

    private static /* synthetic */ auy_2[] bMG() {
        return new auy_2[]{dfW, dfX, dfY};
    }

    static {
        dga = auy_2.bMG();
    }
}


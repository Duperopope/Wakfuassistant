/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bEh
 */
public final class beh_1
extends Enum<beh_1> {
    public static final /* enum */ beh_1 jNE = new beh_1("itemPetFrozenBackground");
    public static final /* enum */ beh_1 jNF = new beh_1("itemSelectedBackground");
    public static final /* enum */ beh_1 jNG = new beh_1("itemVirtualBackground");
    public static final /* enum */ beh_1 jNH = new beh_1("itemBackground");
    private final String jNI;
    private static final /* synthetic */ beh_1[] jNJ;

    public static beh_1[] values() {
        return (beh_1[])jNJ.clone();
    }

    public static beh_1 valueOf(String string) {
        return Enum.valueOf(beh_1.class, string);
    }

    private beh_1(String string2) {
        this.jNI = string2;
    }

    public String getStyle() {
        return this.jNI;
    }

    private static /* synthetic */ beh_1[] dRX() {
        return new beh_1[]{jNE, jNF, jNG, jNH};
    }

    static {
        jNJ = beh_1.dRX();
    }
}


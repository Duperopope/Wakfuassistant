/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eUd
 */
public final class eud_0
extends Enum<eud_0> {
    public static final /* enum */ eud_0 rrP = new eud_0(1);
    public static final /* enum */ eud_0 rrQ = new eud_0(2);
    public static final /* enum */ eud_0 rrR = new eud_0(3);
    public static final /* enum */ eud_0 rrS = new eud_0(4);
    public static final /* enum */ eud_0 rrT = new eud_0(5);
    final byte rrU;
    private static final /* synthetic */ eud_0[] rrV;

    public static eud_0[] values() {
        return (eud_0[])rrV.clone();
    }

    public static eud_0 valueOf(String string) {
        return Enum.valueOf(eud_0.class, string);
    }

    private eud_0(byte by) {
        this.rrU = by;
    }

    public byte aJr() {
        return this.rrU;
    }

    private static /* synthetic */ eud_0[] fKD() {
        return new eud_0[]{rrP, rrQ, rrR, rrS, rrT};
    }

    static {
        rrV = eud_0.fKD();
    }
}


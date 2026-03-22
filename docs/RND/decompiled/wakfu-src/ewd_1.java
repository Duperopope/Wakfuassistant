/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWD
 */
public final class ewd_1
extends Enum<ewd_1>
implements aoq_1 {
    public static final /* enum */ ewd_1 rBV = new ewd_1(1, "bonus positif");
    public static final /* enum */ ewd_1 rBW = new ewd_1(2, "bonus negatif");
    private final int rBX;
    private final String rBY;
    private static final /* synthetic */ ewd_1[] rBZ;

    public static ewd_1[] values() {
        return (ewd_1[])rBZ.clone();
    }

    public static ewd_1 valueOf(String string) {
        return Enum.valueOf(ewd_1.class, string);
    }

    private ewd_1(int n2, String string2) {
        this.rBX = n2;
        this.rBY = string2;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.rBX);
    }

    @Override
    public String aXB() {
        return this.rBY;
    }

    @Override
    public String aXC() {
        return null;
    }

    public static ewd_1 SN(int n) {
        ewd_1[] ewd_1Array = ewd_1.values();
        for (int i = 0; i < ewd_1Array.length; ++i) {
            ewd_1 ewd_12 = ewd_1Array[i];
            if (ewd_12.rBX != n) continue;
            return ewd_12;
        }
        return null;
    }

    private static /* synthetic */ ewd_1[] fOk() {
        return new ewd_1[]{rBV, rBW};
    }

    static {
        rBZ = ewd_1.fOk();
    }
}


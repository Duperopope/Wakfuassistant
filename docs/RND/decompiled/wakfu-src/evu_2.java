/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evu
 */
public final class evu_2
extends Enum<evu_2> {
    public static final /* enum */ evu_2 ovM = new evu_2(-1);
    public static final /* enum */ evu_2 ovN = new evu_2(0);
    public static final /* enum */ evu_2 ovO = new evu_2(1);
    public final int ovP;
    private static final /* synthetic */ evu_2[] ovQ;

    public static evu_2[] values() {
        return (evu_2[])ovQ.clone();
    }

    public static evu_2 valueOf(String string) {
        return Enum.valueOf(evu_2.class, string);
    }

    private evu_2(int n2) {
        this.ovP = n2;
    }

    public static evu_2 Op(int n) {
        for (evu_2 evu_22 : evu_2.values()) {
            if (evu_22.ovP != n) continue;
            return evu_22;
        }
        return ovM;
    }

    private static /* synthetic */ evu_2[] fei() {
        return new evu_2[]{ovM, ovN, ovO};
    }

    static {
        ovQ = evu_2.fei();
    }
}


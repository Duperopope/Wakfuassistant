/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cbL
 */
public abstract sealed class cbl_2
extends Enum<cbl_2>
permits cbm_2 {
    public static final /* enum */ cbl_2 lKQ = new cbm_2(679);
    private final int lKR;
    private static final /* synthetic */ cbl_2[] lKS;

    public static cbl_2[] values() {
        return (cbl_2[])lKS.clone();
    }

    public static cbl_2 valueOf(String string) {
        return Enum.valueOf(cbl_2.class, string);
    }

    cbl_2(int n2) {
        this.lKR = n2;
    }

    public abstract cbp_2 est();

    public int d() {
        return this.lKR;
    }

    private static /* synthetic */ cbl_2[] esu() {
        return new cbl_2[]{lKQ};
    }

    static {
        lKS = cbl_2.esu();
    }
}


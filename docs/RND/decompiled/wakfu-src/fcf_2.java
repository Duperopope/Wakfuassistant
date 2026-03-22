/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCf
 */
public abstract sealed class fcf_2
extends Enum<fcf_2>
permits fcg_1, fch_2, fci_2, fcj_1, fck_1, fcl_2, fcm_2 {
    public static final /* enum */ fcf_2 tYa = new fcg_1(fzg_0.tGN);
    public static final /* enum */ fcf_2 tYb = new fch_2(fzg_0.tGO);
    public static final /* enum */ fcf_2 tYc = new fci_2(fzg_0.tGP);
    public static final /* enum */ fcf_2 tYd = new fcj_1(fzg_0.tGQ);
    public static final /* enum */ fcf_2 tYe = new fck_1(fzg_0.tGR);
    public static final /* enum */ fcf_2 tYf = new fcl_2(fzg_0.tGS);
    public static final /* enum */ fcf_2 tYg = new fcm_2(fzg_0.tGT);
    public final fzg_0 tYh;
    private static final /* synthetic */ fcf_2[] tYi;

    public static fcf_2[] values() {
        return (fcf_2[])tYi.clone();
    }

    public static fcf_2 valueOf(String string) {
        return Enum.valueOf(fcf_2.class, string);
    }

    fcf_2(fzg_0 fzg_02) {
        this.tYh = fzg_02;
    }

    public abstract ffz_1 gtG();

    public static fcf_2 tN(String string) {
        fcf_2[] fcf_2Array;
        for (fcf_2 fcf_22 : fcf_2Array = fcf_2.values()) {
            if (!fcf_22.name().equals(string.toUpperCase())) continue;
            return fcf_22;
        }
        return fcf_2Array[0];
    }

    private static /* synthetic */ fcf_2[] gtH() {
        return new fcf_2[]{tYa, tYb, tYc, tYd, tYe, tYf, tYg};
    }

    static {
        tYi = fcf_2.gtH();
    }
}


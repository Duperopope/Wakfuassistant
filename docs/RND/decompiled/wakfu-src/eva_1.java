/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from evA
 */
public abstract sealed class eva_1
extends Enum<eva_1>
permits evb_2, evl_1, evm_1, evn_1, evo_1, evp_1, evq_1, evr_1, evs_1, evc_1, evd_1, eve_1, evf_2, evg_2, evh_2, evi_2, evj_1, evk_1 {
    public static final /* enum */ eva_1 owq = new evb_2();
    public static final /* enum */ eva_1 owr = new evl_1();
    public static final /* enum */ eva_1 ows = new evm_1();
    public static final /* enum */ eva_1 owt = new evn_1();
    public static final /* enum */ eva_1 owu = new evo_1();
    public static final /* enum */ eva_1 owv = new evp_1();
    public static final /* enum */ eva_1 oww = new evq_1();
    public static final /* enum */ eva_1 owx = new evr_1();
    public static final /* enum */ eva_1 owy = new evs_1();
    public static final /* enum */ eva_1 owz = new evc_1();
    public static final /* enum */ eva_1 owA = new evd_1();
    public static final /* enum */ eva_1 owB = new eve_1();
    public static final /* enum */ eva_1 owC = new evf_2();
    public static final /* enum */ eva_1 owD = new evg_2();
    public static final /* enum */ eva_1 owE = new evh_2();
    public static final /* enum */ eva_1 owF = new evi_2();
    public static final /* enum */ eva_1 owG = new evj_1();
    public static final /* enum */ eva_1 owH = new evk_1();
    public static eva_1[] owI;
    private static final /* synthetic */ eva_1[] owJ;

    public static eva_1[] values() {
        return (eva_1[])owJ.clone();
    }

    public static eva_1 valueOf(String string) {
        return Enum.valueOf(eva_1.class, string);
    }

    public abstract evv_2 feu();

    public boolean fev() {
        return true;
    }

    private static /* synthetic */ eva_1[] few() {
        return new eva_1[]{owq, owr, ows, owt, owu, owv, oww, owx, owy, owz, owA, owB, owC, owD, owE, owF, owG, owH};
    }

    static {
        owJ = eva_1.few();
        owI = eva_1.values();
    }
}


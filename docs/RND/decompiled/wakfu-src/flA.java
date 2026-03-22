/*
 * Decompiled with CFR 0.152.
 */
public final class flA
extends Enum<flA>
implements aoq_1,
aoy_1 {
    public static final /* enum */ flA sEZ = new flA(1, fmb_0.sGR, fly_0.sEI);
    public static final /* enum */ flA sFa = new flA(2, fmv.sGJ, fly_0.sEJ);
    public static final /* enum */ flA sFb = new flA(3, flG.sFU, fly_0.sEK);
    public static final /* enum */ flA sFc = new flA(4, flI.sFW, fly_0.sEK);
    public static final /* enum */ flA sFd = new flA(5, fmp_0.sGD, fly_0.sEL);
    public static final /* enum */ flA sFe = new flA(6, fmx_0.sGN, fly_0.sEM);
    public static final /* enum */ flA sFf = new flA(7, flU.sGj, fly_0.sEN);
    public static final /* enum */ flA sFg = new flA(8, flQ.sGf, fly_0.sEN);
    public static final /* enum */ flA sFh = new flA(9, flS.sGh, fly_0.sEN);
    public static final /* enum */ flA sFi = new flA(10, fmc.sGr, fly_0.sEO);
    public static final /* enum */ flA sFj = new flA(11, fma.sGp, fly_0.sEO);
    public static final /* enum */ flA sFk = new flA(12, fmh_0.sGY, fly_0.sEP);
    public static final /* enum */ flA sFl = new flA(13, fmk_0.sGz, fly_0.sEQ);
    public static final /* enum */ flA sFm = new flA(14, fmi.sGx, fly_0.sEQ);
    public static final /* enum */ flA sFn = new flA(15, fme.sGt, fly_0.sES);
    public static final /* enum */ flA sFo = new flA(16, fmg.sGv, fly_0.sES);
    public static final /* enum */ flA sFp = new flA(17, flw_0.sGl, fly_0.sEN);
    public static final /* enum */ flA sFq = new flA(18, flY.sGn, fly_0.sEN);
    public static final /* enum */ flA sFr = new flA(19, flM.sGb, fly_0.sET);
    public static final /* enum */ flA sFs = new flA(20, flO.sGd, fly_0.sET);
    public static final /* enum */ flA sFt = new flA(21, fmn_0.sGB, fly_0.sEU);
    public static final /* enum */ flA sFu = new flA(22, fmr_0.sGF, fly_0.sEU);
    public static final /* enum */ flA sFv = new flA(23, fmt.sGH, fly_0.sEU);
    public static final /* enum */ flA sFw = new flA(24, fmz.sGP, fly_0.sEV);
    public static final /* enum */ flA sFx = new flA(25, fmd_0.sGU, fly_0.sEW);
    public static final /* enum */ flA sFy = new flA(26, fmf_0.sGW, fly_0.sEW);
    public static final /* enum */ flA sFz = new flA(27, flK.sFY, fly_0.sEX);
    public final int sFA;
    public final fmm_0<? extends flv_0> sFB;
    public final fly_0 sFC;
    private static final /* synthetic */ flA[] sFD;

    public static flA[] values() {
        return (flA[])sFD.clone();
    }

    public static flA valueOf(String string) {
        return Enum.valueOf(flA.class, string);
    }

    private flA(int n2, fmm_0<? extends flv_0> fmm_02, fly_0 fly_02) {
        this.sFA = n2;
        this.sFB = fmm_02;
        this.sFC = fly_02;
    }

    public static flA WZ(int n) {
        flA[] flAArray = flA.values();
        for (int i = 0; i < flAArray.length; ++i) {
            flA flA2 = flAArray[i];
            if (flA2.sFA != n) continue;
            return flA2;
        }
        return null;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.sFA);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return this.toString();
    }

    @Override
    public aox_1 bEt() {
        return this.sFB.gdt();
    }

    private static /* synthetic */ flA[] gdn() {
        return new flA[]{sEZ, sFa, sFb, sFc, sFd, sFe, sFf, sFg, sFh, sFi, sFj, sFk, sFl, sFm, sFn, sFo, sFp, sFq, sFr, sFs, sFt, sFu, sFv, sFw, sFx, sFy, sFz};
    }

    static {
        sFD = flA.gdn();
    }
}


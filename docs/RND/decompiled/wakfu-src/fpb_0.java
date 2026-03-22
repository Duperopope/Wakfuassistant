/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from fpB
 */
public final class fpb_0
extends Enum<fpb_0> {
    public static final /* enum */ fpb_0 sPx = new fpb_0(fpz_0.sPo, fpc_0.sQe, 24369);
    public static final /* enum */ fpb_0 sPy = new fpb_0(fpz_0.sPo, fpc_0.sQf, 24370);
    public static final /* enum */ fpb_0 sPz = new fpb_0(fpz_0.sPo, fpc_0.sQg, 24371);
    public static final /* enum */ fpb_0 sPA = new fpb_0(fpz_0.sPo, fpc_0.sQh, 24372);
    public static final /* enum */ fpb_0 sPB = new fpb_0(fpz_0.sPp, fpc_0.sQe, 24741);
    public static final /* enum */ fpb_0 sPC = new fpb_0(fpz_0.sPp, fpc_0.sQf, 24742);
    public static final /* enum */ fpb_0 sPD = new fpb_0(fpz_0.sPp, fpc_0.sQg, 24743);
    public static final /* enum */ fpb_0 sPE = new fpb_0(fpz_0.sPp, fpc_0.sQh, 24744);
    public static final /* enum */ fpb_0 sPF = new fpb_0(fpz_0.sPq, fpc_0.sQe, 24746);
    public static final /* enum */ fpb_0 sPG = new fpb_0(fpz_0.sPq, fpc_0.sQf, 24747);
    public static final /* enum */ fpb_0 sPH = new fpb_0(fpz_0.sPq, fpc_0.sQg, 24748);
    public static final /* enum */ fpb_0 sPI = new fpb_0(fpz_0.sPq, fpc_0.sQh, 24749);
    public static final /* enum */ fpb_0 sPJ = new fpb_0(fpz_0.sPr, fpc_0.sQe, 24750);
    public static final /* enum */ fpb_0 sPK = new fpb_0(fpz_0.sPr, fpc_0.sQf, 24751);
    public static final /* enum */ fpb_0 sPL = new fpb_0(fpz_0.sPr, fpc_0.sQg, 24752);
    public static final /* enum */ fpb_0 sPM = new fpb_0(fpz_0.sPr, fpc_0.sQh, 24753);
    public static final /* enum */ fpb_0 sPN = new fpb_0(fpz_0.sPs, fpc_0.sQe, 24754);
    public static final /* enum */ fpb_0 sPO = new fpb_0(fpz_0.sPs, fpc_0.sQf, 24755);
    public static final /* enum */ fpb_0 sPP = new fpb_0(fpz_0.sPs, fpc_0.sQg, 24756);
    public static final /* enum */ fpb_0 sPQ = new fpb_0(fpz_0.sPs, fpc_0.sQh, 24757);
    public static final /* enum */ fpb_0 sPR = new fpb_0(fpz_0.sPt, fpc_0.sQe, 27988);
    public static final /* enum */ fpb_0 sPS = new fpb_0(fpz_0.sPt, fpc_0.sQf, 27989);
    public static final /* enum */ fpb_0 sPT = new fpb_0(fpz_0.sPt, fpc_0.sQg, 27990);
    public static final /* enum */ fpb_0 sPU = new fpb_0(fpz_0.sPt, fpc_0.sQh, 27991);
    public static final /* enum */ fpb_0 sPV = new fpb_0(fpz_0.sPu, fpc_0.sQe, 32327);
    public static final /* enum */ fpb_0 sPW = new fpb_0(fpz_0.sPu, fpc_0.sQf, 32328);
    public static final /* enum */ fpb_0 sPX = new fpb_0(fpz_0.sPu, fpc_0.sQg, 32329);
    public static final /* enum */ fpb_0 sPY = new fpb_0(fpz_0.sPu, fpc_0.sQh, 32330);
    private final fpz_0 sPZ;
    private final fpc_0 sQa;
    private final int sQb;
    private static final /* synthetic */ fpb_0[] sQc;

    public static fpb_0[] values() {
        return (fpb_0[])sQc.clone();
    }

    public static fpb_0 valueOf(String string) {
        return Enum.valueOf(fpb_0.class, string);
    }

    private fpb_0(fpz_0 fpz_02, fpc_0 fpc_02, int n2) {
        this.sPZ = fpz_02;
        this.sQa = fpc_02;
        this.sQb = n2;
    }

    public fpz_0 ggH() {
        return this.sPZ;
    }

    public fpc_0 ggV() {
        return this.sQa;
    }

    public int azv() {
        return this.sQb;
    }

    public static Optional<fpb_0> N(int n, long l) {
        fpb_0[] fpb_0Array;
        for (fpb_0 fpb_02 : fpb_0Array = fpb_0.values()) {
            fpc_0 fpc_02;
            fpz_0 fpz_02 = fpb_02.sPZ;
            if (n < fpz_02.ggS() || n >= fpz_02.ggT() || l < (fpc_02 = fpb_02.sQa).ggY() || l >= fpc_02.ggZ()) continue;
            return Optional.of(fpb_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ fpb_0[] ggW() {
        return new fpb_0[]{sPx, sPy, sPz, sPA, sPB, sPC, sPD, sPE, sPF, sPG, sPH, sPI, sPJ, sPK, sPL, sPM, sPN, sPO, sPP, sPQ, sPR, sPS, sPT, sPU, sPV, sPW, sPX, sPY};
    }

    static {
        sQc = fpb_0.ggW();
    }
}


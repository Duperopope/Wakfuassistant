/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTm
 */
public final class etm_0
extends Enum<etm_0>
implements aoq_1,
aoy_1 {
    public static final /* enum */ etm_0 rnq = new etm_0(0, "GLYPH", eSV.rlY);
    public static final /* enum */ etm_0 rnr = new etm_0(1, "HOUR", eSW.rmd);
    public static final /* enum */ etm_0 rns = new etm_0(2, "BEACON", eSN.rln);
    public static final /* enum */ etm_0 rnt = new etm_0(3, "TRAP", eSZ.rmk);
    public static final /* enum */ etm_0 rnu = new etm_0(4, "AURA", eSK.rlc);
    public static final /* enum */ etm_0 rnv = new etm_0(5, "BATTLEGROUND_BORDER", eSM.rli);
    public static final /* enum */ etm_0 rnw = new etm_0(6, "SIMPLE", eSY.rmi);
    public static final /* enum */ etm_0 rnx = new etm_0(7, "WALL", eta_0.rmv);
    public static final /* enum */ etm_0 rny = new etm_0(8, "WARP", etb_0.rmw);
    public static final /* enum */ etm_0 rnz = new etm_0(9, "BOMB", eSP.rls);
    public static final /* enum */ etm_0 rnA = new etm_0(12, "ENUTROF_DEPOSIT", eSR.rlw);
    public static final /* enum */ etm_0 rnB = new etm_0(13, "LOOT_AREA", eSX.rmg);
    public static final /* enum */ etm_0 rnC = new etm_0(14, "SIMPLE_WITH_REM", etc_0.rmB);
    public static final /* enum */ etm_0 rnD = new etm_0(15, "FAKE_FIGHTER", eST.rlQ);
    public static final /* enum */ etm_0 rnE = new etm_0(16, "BARREL", eSL.rlg);
    public static final /* enum */ etm_0 rnF = new etm_0(18, "BOMB_COMBO", eSO.rlo);
    public static final /* enum */ etm_0 rnG = new etm_0(19, "GATE", eSU.rlX);
    public static final /* enum */ etm_0 rnH = new etm_0(20, "ARTIFACT", eSJ.rla);
    private final int rnI;
    private final String rnJ;
    private final QX rnK;
    private static final /* synthetic */ etm_0[] rnL;

    public static etm_0[] values() {
        return (etm_0[])rnL.clone();
    }

    public static etm_0 valueOf(String string) {
        return Enum.valueOf(etm_0.class, string);
    }

    private etm_0(int n2, String string2, QX qX) {
        this.rnI = n2;
        this.rnJ = string2;
        this.rnK = qX;
    }

    public int aHp() {
        return this.rnI;
    }

    @Override
    public String aXA() {
        return this.rnJ;
    }

    @Override
    public String aXB() {
        return this.rnJ;
    }

    @Override
    public aox_1 bEt() {
        return this.rnK;
    }

    public static etm_0 Sr(int n) {
        for (etm_0 etm_02 : etm_0.values()) {
            if (etm_02.aHp() != n) continue;
            return etm_02;
        }
        return null;
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ etm_0[] fIY() {
        return new etm_0[]{rnq, rnr, rns, rnt, rnu, rnv, rnw, rnx, rny, rnz, rnA, rnB, rnC, rnD, rnE, rnF, rnG, rnH};
    }

    static {
        rnL = etm_0.fIY();
    }
}


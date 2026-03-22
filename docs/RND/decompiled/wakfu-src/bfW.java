/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bfW
extends bfV {
    protected static final Logger hYu = Logger.getLogger(bfW.class);
    private static final long hYv = 131072L;
    public static final String hYw = "remainingTime";
    public static final String hYx = "rewards";
    public static final String hYy = "failures";
    public static final String hYz = "goal";
    public static final String hYA = "isFinished";
    public static final String hYB = "isLaunched";
    public static final String hYC = "isActivated";
    public static final String hYD = "isFailed";
    public static final String hYE = "selectedReward";
    public static final String hYF = "isProposed";
    public static final String hYG = "needActivation";
    public static final String hYH = "compass";
    public static final String hYI = "stateText";
    public static final String hYJ = "coloredTitle";
    public static final String[] hYK = new String[]{"remainingTime", "rewards", "goal", "isFinished", "isLaunched", "isActivated", "isFailed", "selectedReward", "isProposed", "needActivation", "stateText", "coloredTitle"};
    public static final String[] hYL = new String[hYK.length + bhJ.iiF.length];
    protected bfT hYM;
    private String hYN;
    private byte hYO;

    public bfW(bfT bfT2) {
        super(bfT2.dig());
        this.hYM = bfT2;
    }

    public bfW(bfW bfW2) {
        super(bfW2.dig());
        this.hYM = bfW2.dhu();
    }

    public bfT dhu() {
        return this.hYM;
    }

    public String diO() {
        return this.hYN;
    }

    public void lF(String string) {
        this.hYN = string;
    }

    @Override
    public String[] bxk() {
        return hYL;
    }

    @Override
    public Object eu(String string) {
        if (string.equals("isModel")) {
            return false;
        }
        if (string.equals(hYz)) {
            ArrayList arrayList = new ArrayList();
            ArrayList<bgb> arrayList2 = this.hXW.dbs();
            int n = arrayList2.size();
            for (int i = 0; i < n; ++i) {
            }
            return arrayList;
        }
        if (string.equals(hYx)) {
            return this.hYM.din().length > 0 ? this.hYM.din() : null;
        }
        if (string.equals(hYy)) {
            return this.hYM.dio() != null && this.hYM.dio().length > 0 ? this.hYM.dio() : null;
        }
        if (string.equals(hYA)) {
            return this.hYM.bVp();
        }
        if (string.equals(hYB)) {
            return this.hYM.dil();
        }
        if (string.equals(hYC)) {
            return this.hYM.aOY();
        }
        if (string.equals(hYE)) {
            return this.hYM.dim();
        }
        if (string.equals(hYF)) {
            return this.hYM.dik();
        }
        if (string.equals(hYw)) {
            short s = this.hYM.dhG();
            return s > 0 ? bfW.br(s) : null;
        }
        if (string.equals(hYG)) {
            return !this.hYM.dik() && !this.hXW.diH() && !this.hYM.aOY();
        }
        if (string.equals(hYD)) {
            return !this.hYM.bVp() && this.hYM.daI();
        }
        if (string.equals(hYI)) {
            return this.diP();
        }
        if (string.equals(hYJ)) {
            String string2 = this.hXW.diA();
            if (string2 != null && string2.length() == 0) {
                return null;
            }
            if (this.dik()) {
                return "<text color=\"7ad1d6\">" + string2 + "</text>";
            }
            if (this.dil()) {
                return string2;
            }
            return "<text color=\"7ad1d6\">" + string2 + "</text>";
        }
        return super.eu(string);
    }

    public static String br(short s) {
        int n = s / 60;
        int n2 = s - 60 * n;
        return String.format("%d:%s", n, n2 > 9 ? Integer.valueOf(n2) : "0" + n2);
    }

    public short aFT() {
        return this.hYM.aFT();
    }

    public void D(ux_0 ux_02) {
        this.hYM.D(ux_02);
    }

    public void a(bgg bgg2) {
        this.hYM.a(bgg2);
    }

    public bgg dim() {
        return this.hYM.dim();
    }

    public boolean dir() {
        return this.hYM.dir();
    }

    @Override
    public bfS dih() {
        return this.hYM.dih();
    }

    public boolean bVp() {
        return this.hYM.bVp();
    }

    public void fI(boolean bl) {
        this.hYM.fI(bl);
        fse_1.gFu().a((aef_2)this, hYA);
    }

    public boolean daI() {
        return this.hYM.daI();
    }

    public void fJ(boolean bl) {
        this.hYM.fJ(bl);
    }

    public boolean aOY() {
        return this.hYM.aOY();
    }

    public void az(boolean bl) {
        this.hYM.az(bl);
    }

    public boolean dil() {
        return this.hYM.dil();
    }

    public void fH(boolean bl) {
        this.hYM.fH(bl);
    }

    public boolean dip() {
        return this.hYM.dip();
    }

    public boolean dik() {
        return this.hYM.dik();
    }

    public void fG(boolean bl) {
        this.hYM.fG(bl);
    }

    public boolean diq() {
        return this.hYM.diq();
    }

    public int d() {
        return this.hYM.d();
    }

    public String bAD() {
        return this.hYM.bAD();
    }

    public String diP() {
        if (this.dik()) {
            return "<text color=\"7ad1d6\">" + aum_0.cWf().c("challenge.state.proposal", new Object[0]) + "</text>";
        }
        if (this.aOY()) {
            if (this.dil()) {
                return "<text color=\"7ad1d6\">" + aum_0.cWf().c("challenge.state.activatedAndLaunched", new Object[0]) + "</text>";
            }
            return "<text color=\"BB0606\">" + aum_0.cWf().c("challenge.state.activatedNotLaunched", new Object[0]) + "</text>";
        }
        if (this.bVp()) {
            return "<text color=\"14C800\">" + aum_0.cWf().c("challenge.state.complete", new Object[0]) + "</text>";
        }
        if (this.daI()) {
            return "<text color=\"BB0606\">" + aum_0.cWf().c("challenge.state.failed", new Object[0]) + "</text>";
        }
        if (this.dil()) {
            return "<text color=\"BB0606\">" + aum_0.cWf().c("challenge.state.launchedWaitStart", new Object[0]) + "</text>";
        }
        return "<text color=\"BB0606\">" + aum_0.cWf().c("challenge.state.activatedNotLaunched", new Object[0]) + "</text>";
    }

    public void cAN() {
        fse_1.gFu().a((aef_2)this, hYK);
        fse_1.gFu().a((aef_2)this, hYr);
    }

    public void dhH() {
        if (fyw_0.gqw().to(this.hYN)) {
            fyw_0.gqw().tl(this.hYN);
        }
    }

    public void dhE() {
        if (fyw_0.gqw().to(this.hYN)) {
            fse_1.gFu().a((aef_2)this, hYw);
        }
    }

    public void diQ() {
        this.cAN();
    }

    public boolean dhD() {
        return false;
    }

    public String toString() {
        return this.bAD();
    }

    public void bj(byte by) {
        this.hYO = by;
    }

    public byte diR() {
        return this.hYO;
    }

    public void dbC() {
    }

    public void dhr() {
    }

    public void dhK() {
    }

    public void dhL() {
    }

    public void dhM() {
    }

    public void dhs() {
    }

    public void dht() {
    }

    static {
        System.arraycopy(hYK, 0, hYL, 0, hYK.length);
        System.arraycopy(bfV.hYr, 0, hYL, hYK.length, bfV.hYr.length);
    }
}


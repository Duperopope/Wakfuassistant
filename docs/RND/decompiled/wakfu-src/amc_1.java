/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from amc
 */
public class amc_1 {
    private String cHc;
    private int cHd;
    private int cHe;
    @Nullable
    private String cHf;
    private String cHg;
    private boolean cHh;
    private boolean cHi;
    private boolean cHj;
    private boolean cHk;
    private final boolean cHl;
    private amd_1 cHm;
    private boolean cHn = true;
    private String aZF;
    private String cHo;
    private int cHp;
    private String cHq;

    public amc_1(String string, int n, int n2, @Nullable String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, String string4) {
        this.cHc = string;
        this.cHd = n;
        this.cHe = n2;
        this.cHf = string2;
        this.cHg = string3;
        this.cHh = bl;
        this.cHi = bl2;
        this.cHj = bl3;
        this.cHl = bl4;
        this.cHk = bl5;
        this.cHq = string4;
        this.bCA();
    }

    private void bCA() {
        this.cHp = amb_1.b(this.cHj, this.cHi, this.cHh);
    }

    public String bCB() {
        return this.cHg;
    }

    public int bCC() {
        return this.cHd;
    }

    public int bCD() {
        return this.cHe;
    }

    @Nullable
    public String bCE() {
        return this.cHf;
    }

    public long bCF() {
        return amc_1.a(this.bCC(), this.bCD(), this.bCG(), this.bCI(), this.bCH());
    }

    public static long bO(int n, int n2) {
        return amc_1.a(n, n2, false, false, false);
    }

    public static long a(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = n != 0;
        long l = bl4 ? (long)n : (long)n2;
        return l << 32 | (long)((bl4 ? 0 : 1) << 3) | (long)((bl ? 0 : 1) << 2) | (long)((bl2 ? 0 : 1) << 1) | (long)((bl3 ? 0 : 1) << 0);
    }

    public void cE(boolean bl) {
        this.cHh = bl;
    }

    public void cF(boolean bl) {
        this.cHi = bl;
    }

    public void cG(boolean bl) {
        this.cHj = bl;
    }

    public boolean bCG() {
        return this.cHh;
    }

    public boolean bCH() {
        return this.cHi;
    }

    public boolean bCI() {
        return this.cHj;
    }

    public boolean bCJ() {
        return this.cHk;
    }

    public void cH(boolean bl) {
        this.cHk = bl;
    }

    public String getId() {
        return this.cHc;
    }

    public void setId(String string) {
        this.cHc = string;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public void a(amd_1 amd_12) {
        this.cHm = amd_12;
    }

    public amd_1 bCK() {
        return this.cHm;
    }

    public String aWZ() {
        return this.aZF;
    }

    public void cZ(String string) {
        this.aZF = string;
    }

    public String bCL() {
        return this.cHo;
    }

    public void fe(String string) {
        this.cHo = string;
    }

    public void ta(int n) {
        this.cHd = n;
    }

    public void tb(int n) {
        this.cHe = n;
    }

    public void ff(@Nullable String string) {
        this.cHf = string;
    }

    public int bCM() {
        return this.cHp;
    }

    public void tc(int n) {
        this.cHp = n;
        this.cHj = (this.cHp & 0x40) == 64;
        this.cHi = (this.cHp & 0x200) == 512;
        this.cHh = (this.cHp & 0x80) == 128;
    }

    public void fg(String string) {
        this.cHg = string;
    }

    public String bCN() {
        return this.cHq;
    }

    public void fh(String string) {
        this.cHq = string;
    }

    public boolean bCO() {
        return this.cHl;
    }

    public amc_1 bCP() {
        amc_1 amc_12 = new amc_1(this.cHc, this.cHd, this.cHe, this.cHf, this.cHg, this.cHh, this.cHi, this.cHj, this.cHl, this.cHk, this.cHq);
        amc_12.aZF = this.aZF;
        amc_12.cHo = this.cHo;
        return amc_12;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from asT
 */
public abstract class ast_2 {
    private static int dao = 1;
    protected int o = 0;
    protected final asr_2 dap = new asr_2(asr_2.dak);
    protected final asr_2 daq = new asr_2(asr_2.dal);
    protected float aQK;
    protected final float[] dar = new float[]{0.0f, 1.0f, 0.0f};
    protected final acp_1 das;
    protected boolean dat;
    protected float aPt = 1.0f;
    protected boolean cHn = true;
    protected boolean dau;
    protected int bUi;
    protected int dav = 0;
    private asu_2 daw;

    protected ast_2() {
        this(new acp_1(0.0f, 0.0f, 0.0f));
    }

    protected ast_2(acp_1 acp_12) {
        this(acp_12, 3.0f);
    }

    protected ast_2(acp_1 acp_12, float f2) {
        this.o = dao++;
        this.das = acp_12;
        this.aQK = f2;
    }

    public int d() {
        return this.o;
    }

    public void s(float f2, float f3, float f4) {
        this.dar[0] = f2;
        this.dar[1] = f3;
        this.dar[2] = f4;
    }

    public float aRB() {
        return this.aPt;
    }

    public void S(float f2) {
        this.aPt = f2;
    }

    public boolean bKI() {
        return this.dat;
    }

    public void cT(boolean bl) {
        this.dat = bl;
    }

    public void qF(int n) {
        if (this.dap.bzm()) {
            this.dap.qF(n);
        }
        if (this.daq.bzm()) {
            this.daq.qF(n);
        }
        this.bUi += n;
        if (this.dav > 0 && this.bUi > this.dav) {
            this.dav = 0;
            this.bUi = 0;
            this.dau = true;
            if (this.daw != null) {
                this.daw.bKS();
            }
        }
    }

    public float bKJ() {
        return this.dap.aIU();
    }

    public float bKK() {
        return this.dap.aIV();
    }

    public float bKL() {
        return this.dap.aIW();
    }

    public float bKM() {
        return this.daq.aIU();
    }

    public float bKN() {
        return this.daq.aIV();
    }

    public float bKO() {
        return this.daq.aIW();
    }

    public void t(float f2, float f3, float f4) {
        this.dap.m(f2, f3, f4);
    }

    public void u(float f2, float f3, float f4) {
        this.daq.m(f2, f3, f4);
    }

    public void v(float f2, float f3, float f4) {
        this.daq.m(f2, f3, f4);
    }

    public void b(float f2, float f3, float f4, int n) {
        this.dap.a(f2, f3, f4, n);
    }

    public void c(float f2, float f3, float f4, int n) {
        this.daq.a(f2, f3, f4, n);
    }

    public acp_1 bts() {
        return this.das;
    }

    public void a(acp_1 acp_12) {
        this.das.g(acp_12);
    }

    public float aSL() {
        return this.aQK;
    }

    public void aT(float f2) {
        assert (f2 >= 0.0f);
        this.aQK = f2;
    }

    public asr_2 bKP() {
        return this.dap;
    }

    public asr_2 bKQ() {
        return this.daq;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public void ut(int n) {
        if (this.cHn) {
            this.bUi = 0;
            this.dav = n;
            this.b(0.0f, 0.0f, 0.0f, n);
            this.c(0.0f, 0.0f, 0.0f, n);
        } else {
            this.dau = true;
        }
    }

    public boolean aKO() {
        return this.dau;
    }

    public asu_2 bKR() {
        return this.daw;
    }

    public void a(asu_2 asu_22) {
        this.daw = asu_22;
    }
}


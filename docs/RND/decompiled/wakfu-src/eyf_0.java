/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eyf
 */
public abstract class eyf_0<C extends exP>
implements eyh_0<C> {
    protected boolean phi;
    protected boolean mcR;
    protected boolean phj;
    protected final sp_0 phk = new sp_0();
    private boolean phl;
    private boolean phm;
    private boolean phn;
    private ezw pho;
    private tw_0 hvK;
    private byte bin = (byte)-1;
    private boolean php;
    private boolean phq;
    private final fqQ phr = new fqQ();

    @Override
    public boolean fhE() {
        return !this.mcR && this.phi && !this.phl;
    }

    @Override
    public boolean fhF() {
        return this.phi;
    }

    @Override
    public void lt(boolean bl) {
        this.phi = bl;
    }

    @Override
    public boolean doP() {
        return this.mcR;
    }

    @Override
    public void gf(boolean bl) {
        this.mcR = bl;
    }

    @Override
    public boolean fgk() {
        return this.phj;
    }

    @Override
    public void lk(boolean bl) {
        this.phj = bl;
    }

    @Override
    public boolean fhG() {
        return this.phl;
    }

    @Override
    public void lf(boolean bl) {
        this.phl = bl;
    }

    @Override
    public sp_0 baD() {
        return this.phk;
    }

    @Override
    public void a(ezw ezw2) {
        this.pho = ezw2;
    }

    @Override
    public ezw fhH() {
        return this.pho;
    }

    @Override
    public void lu(boolean bl) {
        this.phn = bl;
    }

    @Override
    public boolean dOp() {
        return this.phn;
    }

    @Override
    public void lv(boolean bl) {
        if (this.pho != null) {
            this.pho.lr(bl);
        }
    }

    @Override
    public boolean dOn() {
        return this.pho != null && this.pho.dOn();
    }

    @Override
    public byte bcQ() {
        return this.bin;
    }

    @Override
    public void N(byte by) {
        this.bin = by;
    }

    @Override
    public boolean fhf() {
        return this.phm;
    }

    @Override
    public void lw(boolean bl) {
        this.phm = bl;
    }

    @Override
    public boolean fhI() {
        return this.php;
    }

    @Override
    public void lx(boolean bl) {
        this.php = bl;
    }

    @Override
    public fqQ fgh() {
        return this.phr;
    }

    @Override
    public boolean fhh() {
        return this.phq;
    }

    @Override
    public void lq(boolean bl) {
        this.phq = bl;
    }

    @Override
    public tw_0 eyB() {
        return this.hvK;
    }

    @Override
    public void c(tw_0 tw_02) {
        this.hvK = tw_02;
    }
}


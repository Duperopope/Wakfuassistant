/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSA
 */
class csa_2
implements Runnable {
    private final fbz_2 nFP;
    private boolean nFQ;
    private float nFR;
    private float nFS;
    private float nFT;
    private boolean jLe;
    final /* synthetic */ csw_2 nFU;

    public csa_2(csw_2 csw_22, fbz_2 fbz_22) {
        this.nFU = csw_22;
        this.nFP = fbz_22;
        this.nFS = GC.B(-((float)(Math.random() * (double)csw_22.nFG.dRj())));
        csw_22.a(this.nFP, this.nFS);
    }

    @Override
    public void run() {
        float f2;
        float f3 = this.nFP.getOffset();
        float f4 = f2 = this.nFQ ? this.nFR : -this.nFR;
        if (this.nFT != 32767.0f) {
            boolean bl;
            if (this.nFQ) {
                bl = this.nFP.getOffset() - this.nFS + f2 >= this.nFT;
            } else {
                boolean bl2 = bl = this.nFP.getOffset() - this.nFS + f2 <= this.nFT;
            }
            if (bl) {
                this.a(f3, f2, this.nFQ);
                return;
            }
        }
        this.nFU.a(this.nFP, f3 + f2);
    }

    void a(short s, boolean bl, float f2) {
        int n;
        this.jLe = false;
        this.nFS = s == Short.MAX_VALUE ? -((float)(Math.random() * (double)this.nFU.nFG.dRj())) : (float)Math.floor(this.nFP.getOffset());
        this.nFU.a(this.nFP, this.nFS);
        this.nFT = s == Short.MAX_VALUE ? (float)s : ((float)((n = this.nFP.aVo()) - s) > Math.abs(this.nFS) % (float)n ? (bl ? (float)GC.B((float)s - this.nFS % (float)n) : -((float)GC.B((float)(n - s) - Math.abs(this.nFS % (float)n)))) : (bl ? (float)GC.B((float)n - this.nFS % (float)n + (float)s) : -((float)GC.B((float)(n + n - s) - Math.abs(this.nFS) % (float)n))));
        this.nFQ = bl;
        this.nFR = f2;
        abg_2.bUP().h(this);
        abg_2.bUP().a((Runnable)this, 25L);
    }

    void cR(short s) {
        this.nFU.a(this.nFP, -this.nFP.aVo() + s);
        abg_2.bUP().h(this);
        this.jLe = true;
        this.nFU.eOj();
    }

    private boolean a(float f2, float f3, boolean bl) {
        boolean bl2;
        int n;
        if (bl) {
            n = GC.C(f2);
            bl2 = f2 + f3 >= (float)n;
        } else {
            n = GC.B(f2);
            boolean bl3 = bl2 = f2 + f3 <= (float)n;
        }
        if (bl2) {
            this.nFU.a(this.nFP, n);
            abg_2.bUP().h(this);
            this.jLe = true;
            this.nFU.eOj();
            return true;
        }
        return false;
    }

    public boolean bVp() {
        return this.jLe;
    }

    public void a(boolean bl, float f2) {
        this.a((short)Short.MAX_VALUE, bl, f2);
    }
}


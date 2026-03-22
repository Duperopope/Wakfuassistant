/*
 * Decompiled with CFR 0.152.
 */
public class aLL
implements aqz_2 {
    protected int o;
    protected int ehO;
    protected short ehQ;
    protected boolean bmT;
    protected int eiV;
    protected aln_0[] eiW;
    protected aLM[] eiX;

    public int d() {
        return this.o;
    }

    public int clf() {
        return this.ehO;
    }

    public short clh() {
        return this.ehQ;
    }

    public boolean bfb() {
        return this.bmT;
    }

    public int cmm() {
        return this.eiV;
    }

    public aln_0[] cmn() {
        return this.eiW;
    }

    public aLM[] cmo() {
        return this.eiX;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ehO = 0;
        this.ehQ = 0;
        this.bmT = false;
        this.eiV = 0;
        this.eiW = null;
        this.eiX = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.ehO = aqh_12.bGI();
        this.ehQ = aqh_12.bGG();
        this.bmT = aqh_12.bxv();
        this.eiV = aqh_12.bGI();
        int n2 = aqh_12.bGI();
        this.eiW = new aln_0[n2];
        for (n = 0; n < n2; ++n) {
            this.eiW[n] = new aln_0();
            this.eiW[n].a(aqh_12);
        }
        n = aqh_12.bGI();
        this.eiX = new aLM[n];
        for (int i = 0; i < n; ++i) {
            this.eiX[i] = new aLM();
            this.eiX[i].a(aqh_12);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.oyM.d();
    }
}


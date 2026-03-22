/*
 * Decompiled with CFR 0.152.
 */
public class eQm
extends eqc_0 {
    private static final aox_1 rfE = new enz_0(new eny_0("Polynome 1er degr\u00e9 : a0 + a1*lvl", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD)), new eny_0("Polynome 2nd degr\u00e9 : a0 + a1*lvl + a2*lvl^2", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD), new enx_0("a2", eNA.qYD)), new eny_0("Polynome 3\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + a3*lvl^3", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD), new enx_0("a2", eNA.qYD), new enx_0("a3", eNA.qYD)), new eny_0("Polynome 4\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a4*lvl^4", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD), new enx_0("a2", eNA.qYD), new enx_0("a3", eNA.qYD), new enx_0("a4", eNA.qYD)), new eny_0("Polynome 5\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a5*lvl^5", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD), new enx_0("a2", eNA.qYD), new enx_0("a3", eNA.qYD), new enx_0("a4", eNA.qYD), new enx_0("a5", eNA.qYD)), new eny_0("Polynome 6\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a6*lvl^6", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD), new enx_0("a2", eNA.qYD), new enx_0("a3", eNA.qYD), new enx_0("a4", eNA.qYD), new enx_0("a5", eNA.qYD), new enx_0("a6", eNA.qYD)), new eny_0("Polynome 7\u00e8me degr\u00e9 : a0 + a1*lvl + a2*lvl^2 + ... + a7*lvl^7", new enx_0("a0", eNA.qYD), new enx_0("a1", eNA.qYD), new enx_0("a2", eNA.qYD), new enx_0("a3", eNA.qYD), new enx_0("a4", eNA.qYD), new enx_0("a5", eNA.qYD), new enx_0("a6", eNA.qYD), new enx_0("a7", eNA.qYD)));

    @Override
    public aox_1 bEt() {
        return rfE;
    }

    public eQm() {
        this.bby();
    }

    public eQm fFv() {
        return new eQm();
    }

    @Override
    public void E(QD qD) {
        if (this.bgC == null) {
            return;
        }
        short s = this.fHf();
        fqB fqB2 = fqC.giD().Za(((enk_0)this.bgC).aZH());
        if (fqB2 != null) {
            this.rfa = fqB2.ci(s);
        }
        float f2 = 0.0f;
        for (int i = 0; i < ((enk_0)this.bgC).fAn(); ++i) {
            f2 += ((enk_0)this.bgC).x(i, s) * (float)GC.u(s, i);
        }
        this.aQL = Math.round(f2);
    }

    @Override
    public enq_0 d(ero_0 ero_02, boolean bl) {
        enq_0 enq_02 = super.d(ero_02, bl);
        enq_02.RT(this.aQL);
        return enq_02;
    }

    @Override
    public boolean bbA() {
        return true;
    }

    @Override
    public boolean bbB() {
        return true;
    }

    @Override
    public boolean bbC() {
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.aQL = 0;
    }

    @Override
    public /* synthetic */ eqc_0 fES() {
        return this.fFv();
    }

    @Override
    public /* synthetic */ QD bbo() {
        return this.fFv();
    }
}


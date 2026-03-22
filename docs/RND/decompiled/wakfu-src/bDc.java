/*
 * Decompiled with CFR 0.152.
 */
public final class bDc
implements bDb {
    private final acd_1 jJR = new acd_1();
    boolean jJS;
    private Runnable jJT;
    private final bCA jJU;

    public bDc(bCA bCA2) {
        this.jJU = bCA2;
    }

    @Override
    public boolean dQF() {
        return this.jJS;
    }

    @Override
    public acd_1 dQG() {
        return this.jJR;
    }

    @Override
    public void dQH() {
        this.jJS = true;
        this.jJR.C(this.jJU.aZw());
        this.aVQ();
    }

    private void aVQ() {
        this.jJU.aVQ();
    }

    @Override
    public void U(int n, int n2, short s) {
        this.jJR.Q(n, n2, s);
        this.aVQ();
    }

    @Override
    public void dQI() {
        clf clf2 = new clf();
        clf2.ng(this.jJU.Sn());
        clf2.ad(this.jJR);
        clf2.Lb(this.jJU.bcB().wp());
        aue_0.cVJ().etu().d(clf2);
        this.jJT = new bDd(this);
        abg_2.bUP().a(this.jJT, 1000L, 1);
        this.aVQ();
    }

    @Override
    public void k(abi_1 abi_12) {
        this.jJR.reset();
        this.jJS = false;
        this.jJU.a(abi_12);
        this.aVQ();
    }

    @Override
    public void dQJ() {
        if (this.jJT != null) {
            abg_2.bUP().h(this.jJT);
            this.jJT = null;
        }
    }

    @Override
    public void clear() {
        this.jJS = false;
        this.jJT = null;
    }
}


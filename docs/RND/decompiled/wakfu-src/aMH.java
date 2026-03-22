/*
 * Decompiled with CFR 0.152.
 */
public class aMH
implements aqz_2 {
    protected int o;
    protected short ekU;
    protected int elk;
    protected int ell;
    protected long elm;
    protected byte asH;

    public int d() {
        return this.o;
    }

    public short coj() {
        return this.ekU;
    }

    public int coC() {
        return this.elk;
    }

    public int coD() {
        return this.ell;
    }

    public long coE() {
        return this.elm;
    }

    public byte aGu() {
        return this.asH;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekU = 0;
        this.elk = 0;
        this.ell = 0;
        this.elm = 0L;
        this.asH = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ekU = aqh_12.bGG();
        this.elk = aqh_12.bGI();
        this.ell = aqh_12.bGI();
        this.elm = aqh_12.bGK();
        this.asH = aqh_12.aTf();
    }

    @Override
    public final int bGA() {
        return ewj_2.oAo.d();
    }
}


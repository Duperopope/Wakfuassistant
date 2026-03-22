/*
 * Decompiled with CFR 0.152.
 */
public class fwi
implements aqz_2 {
    protected int o;
    protected int elz;
    protected short elA;
    protected int asA;
    protected short bol;

    public int d() {
        return this.o;
    }

    public int coR() {
        return this.elz;
    }

    public short coS() {
        return this.elA;
    }

    public int azv() {
        return this.asA;
    }

    public short bfd() {
        return this.bol;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.elz = 0;
        this.elA = 0;
        this.asA = 0;
        this.bol = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.elz = aqh_12.bGI();
        this.elA = aqh_12.bGG();
        this.asA = aqh_12.bGI();
        this.bol = aqh_12.bGG();
    }

    @Override
    public final int bGA() {
        return ewj_2.oBf.d();
    }
}


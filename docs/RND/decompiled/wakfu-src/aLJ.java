/*
 * Decompiled with CFR 0.152.
 */
public class aLJ
implements aqz_2 {
    protected int eiQ;
    protected int ciZ;
    protected String eik;
    protected int bMn;
    protected short bMo;
    protected float eiR;
    protected float eiS;

    public int cmh() {
        return this.eiQ;
    }

    public int aVt() {
        return this.ciZ;
    }

    public String clB() {
        return this.eik;
    }

    public int getDuration() {
        return this.bMn;
    }

    public short blw() {
        return this.bMo;
    }

    public float cmi() {
        return this.eiR;
    }

    public float cmj() {
        return this.eiS;
    }

    @Override
    public void reset() {
        this.eiQ = 0;
        this.ciZ = 0;
        this.eik = null;
        this.bMn = 0;
        this.bMo = 0;
        this.eiR = 0.0f;
        this.eiS = 0.0f;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.eiQ = aqh_12.bGI();
        this.ciZ = aqh_12.bGI();
        this.eik = aqh_12.bGL().intern();
        this.bMn = aqh_12.bGI();
        this.bMo = aqh_12.bGG();
        this.eiR = aqh_12.bGH();
        this.eiS = aqh_12.bGH();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyK.d();
    }
}


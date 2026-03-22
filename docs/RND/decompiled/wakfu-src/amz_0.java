/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aMz
 */
public class amz_0
implements aqz_2 {
    protected int o;
    protected boolean ekR;
    protected boolean ekS;
    protected int ekT;
    protected boolean ejf;
    protected float aXn;
    protected float aXo;
    protected float aXm;

    public int d() {
        return this.o;
    }

    public boolean coe() {
        return this.ekR;
    }

    public boolean cof() {
        return this.ekS;
    }

    public int cog() {
        return this.ekT;
    }

    public boolean cmv() {
        return this.ejf;
    }

    public float getZoom() {
        return this.aXn;
    }

    public float coh() {
        return this.aXo;
    }

    public float coi() {
        return this.aXm;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.ekR = false;
        this.ekS = false;
        this.ekT = 0;
        this.ejf = false;
        this.aXn = 0.0f;
        this.aXo = 0.0f;
        this.aXm = 0.0f;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.ekR = aqh_12.bxv();
        this.ekS = aqh_12.bxv();
        this.ekT = aqh_12.bGI();
        this.ejf = aqh_12.bxv();
        this.aXn = aqh_12.bGH();
        this.aXo = aqh_12.bGH();
        this.aXm = aqh_12.bGH();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyX.d();
    }
}


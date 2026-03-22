/*
 * Decompiled with CFR 0.152.
 */
public class fvc
implements aqz_2 {
    protected int o;
    protected short aXk;
    protected short tyW;
    protected boolean tyX;
    protected byte tyY;
    protected byte tyZ;
    protected byte tza;

    public int d() {
        return this.o;
    }

    public short bdL() {
        return this.aXk;
    }

    public short gnQ() {
        return this.tyW;
    }

    public boolean gnR() {
        return this.tyX;
    }

    public byte gnS() {
        return this.tyY;
    }

    public byte gnT() {
        return this.tyZ;
    }

    public byte gnU() {
        return this.tza;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.aXk = 0;
        this.tyW = 0;
        this.tyX = false;
        this.tyY = 0;
        this.tyZ = 0;
        this.tza = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.aXk = aqh_12.bGG();
        this.tyW = aqh_12.bGG();
        this.tyX = aqh_12.bxv();
        this.tyY = aqh_12.aTf();
        this.tyZ = aqh_12.aTf();
        this.tza = aqh_12.aTf();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyE.d();
    }
}


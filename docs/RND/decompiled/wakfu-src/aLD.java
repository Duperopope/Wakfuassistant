/*
 * Decompiled with CFR 0.152.
 */
public class aLD
implements aqz_2 {
    protected byte eiC;
    protected int eiD;

    public byte clT() {
        return this.eiC;
    }

    public int clU() {
        return this.eiD;
    }

    @Override
    public void reset() {
        this.eiC = 0;
        this.eiD = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.eiC = aqh_12.aTf();
        this.eiD = aqh_12.bGI();
    }

    @Override
    public final int bGA() {
        throw new UnsupportedOperationException();
    }
}


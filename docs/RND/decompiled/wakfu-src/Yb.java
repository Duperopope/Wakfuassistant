/*
 * Decompiled with CFR 0.152.
 */
public abstract class Yb<M extends YY> {
    protected final Yh[] bTA;
    protected final Yh[] bTB;
    protected Yg[] bTC;
    protected final M bTD;

    protected Yb(M m) {
        this.bTD = m;
        this.bTA = ((YY)m).boQ();
        this.bTB = ((YY)m).boP();
    }

    public final Yh qL(int n) {
        return this.bTB[n];
    }

    public final Yh qM(int n) {
        return this.bTA[n];
    }

    public final int bok() {
        return ((YY)this.bTD).boN();
    }

    public final Yc bol() {
        return ((YY)this.bTD).bol();
    }

    public int bom() {
        return ((YY)this.bTD).boO();
    }

    public void a(Yg[] ygArray) {
        assert (ygArray.length == this.bom());
        this.bTC = ygArray;
    }

    public abstract void qF(int var1);
}


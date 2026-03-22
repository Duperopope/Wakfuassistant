/*
 * Decompiled with CFR 0.152.
 */
public class aMx {
    protected int ekI;
    protected short ekJ;
    protected String ekK;
    protected String ekL;
    protected boolean ekM;
    protected aMy[] ekN;

    public int cnV() {
        return this.ekI;
    }

    public short cnW() {
        return this.ekJ;
    }

    public String cnX() {
        return this.ekK;
    }

    public String cnY() {
        return this.ekL;
    }

    public boolean cnZ() {
        return this.ekM;
    }

    public aMy[] coa() {
        return this.ekN;
    }

    public void a(aqh_1 aqh_12) {
        this.ekI = aqh_12.bGI();
        this.ekJ = aqh_12.bGG();
        this.ekK = aqh_12.bGL().intern();
        this.ekL = aqh_12.bGL().intern();
        this.ekM = aqh_12.bxv();
        int n = aqh_12.bGI();
        this.ekN = new aMy[n];
        for (int i = 0; i < n; ++i) {
            this.ekN[i] = new aMy();
            this.ekN[i].a(aqh_12);
        }
    }
}


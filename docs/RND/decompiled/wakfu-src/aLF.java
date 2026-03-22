/*
 * Decompiled with CFR 0.152.
 */
public class aLF
implements aqz_2 {
    protected int o;
    protected int eiF;
    protected int eiG;
    protected String eiH;
    protected String eiI;
    protected int[] eiJ;

    public int d() {
        return this.o;
    }

    public int clW() {
        return this.eiF;
    }

    public int clX() {
        return this.eiG;
    }

    public String clY() {
        return this.eiH;
    }

    public String ajo() {
        return this.eiI;
    }

    public int[] clZ() {
        return this.eiJ;
    }

    public fkj_0[] cma() {
        fkj_0[] fkj_0Array = new fkj_0[this.eiJ.length];
        for (int i = 0; i < this.eiJ.length; ++i) {
            fkj_0Array[i] = fkj_0.WL(this.eiJ[i]);
        }
        return fkj_0Array;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.eiF = 0;
        this.eiG = 0;
        this.eiH = null;
        this.eiI = null;
        this.eiJ = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.o = aqh_12.bGI();
        this.eiF = aqh_12.bGI();
        this.eiG = aqh_12.bGI();
        this.eiH = aqh_12.bGL().intern();
        this.eiI = aqh_12.bGL().intern();
        this.eiJ = aqh_12.bGM();
    }

    @Override
    public final int bGA() {
        return ewj_2.oyH.d();
    }
}


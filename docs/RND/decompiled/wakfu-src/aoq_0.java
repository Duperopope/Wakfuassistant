/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from aOq
 */
public class aoq_0
implements aqz_2 {
    protected int o;
    protected int bIi;
    protected int eqU;
    protected short eqV;
    protected short eqW;
    protected boolean eqX;
    protected boolean eqY;
    protected boolean eqZ;
    protected boolean era;
    protected short erb;
    protected int[] baD;
    protected int[] erc;
    protected aOr[] erd;
    protected short aAw;
    protected int ere;
    protected HashMap<Long, int[]> erf;

    public int d() {
        return this.o;
    }

    public int aeV() {
        return this.bIi;
    }

    public int cuw() {
        return this.eqU;
    }

    public short cux() {
        return this.eqV;
    }

    public short cuy() {
        return this.eqW;
    }

    public boolean cuz() {
        return this.eqX;
    }

    public boolean cuA() {
        return this.eqY;
    }

    public boolean cuB() {
        return this.eqZ;
    }

    public boolean cuC() {
        return this.era;
    }

    public short cuD() {
        return this.erb;
    }

    public int[] ckm() {
        return this.baD;
    }

    public int[] cuE() {
        return this.erc;
    }

    public aOr[] cuF() {
        return this.erd;
    }

    public short aKu() {
        return this.aAw;
    }

    public int cuG() {
        return this.ere;
    }

    public HashMap<Long, int[]> cuH() {
        return this.erf;
    }

    @Override
    public void reset() {
        this.o = 0;
        this.bIi = 0;
        this.eqU = 0;
        this.eqV = 0;
        this.eqW = 0;
        this.eqX = false;
        this.eqY = false;
        this.eqZ = false;
        this.era = false;
        this.erb = 0;
        this.baD = null;
        this.erc = null;
        this.erd = null;
        this.aAw = 0;
        this.ere = 0;
        this.erf = null;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        int n;
        this.o = aqh_12.bGI();
        this.bIi = aqh_12.bGI();
        this.eqU = aqh_12.bGI();
        this.eqV = aqh_12.bGG();
        this.eqW = aqh_12.bGG();
        this.eqX = aqh_12.bxv();
        this.eqY = aqh_12.bxv();
        this.eqZ = aqh_12.bxv();
        this.era = aqh_12.bxv();
        this.erb = aqh_12.bGG();
        this.baD = aqh_12.bGM();
        this.erc = aqh_12.bGM();
        int n2 = aqh_12.bGI();
        this.erd = new aOr[n2];
        for (n = 0; n < n2; ++n) {
            this.erd[n] = new aOr();
            this.erd[n].a(aqh_12);
        }
        this.aAw = aqh_12.bGG();
        this.ere = aqh_12.bGI();
        n = aqh_12.bGI();
        this.erf = new HashMap(n);
        for (int i = 0; i < n; ++i) {
            long l = aqh_12.bGK();
            int[] nArray = aqh_12.bGM();
            this.erf.put(l, nArray);
        }
    }

    @Override
    public final int bGA() {
        return ewj_2.ozy.d();
    }
}


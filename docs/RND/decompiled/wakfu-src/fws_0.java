/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fws
 */
public class fws_0
implements aqz_2 {
    protected short avX;
    protected short emz;
    protected boolean emB;
    protected String[] emC;
    protected String[] emD;
    protected boolean emE;
    protected short emF;

    public short aIi() {
        return this.avX;
    }

    public short cpX() {
        return this.emz;
    }

    public boolean cpZ() {
        return this.emB;
    }

    public String[] cqa() {
        return this.emC;
    }

    public String[] cqb() {
        return this.emD;
    }

    public boolean cqc() {
        return this.emE;
    }

    public short cqd() {
        return this.emF;
    }

    @Override
    public void reset() {
        this.avX = 0;
        this.emz = 0;
        this.emB = false;
        this.emC = null;
        this.emD = null;
        this.emE = false;
        this.emF = 0;
    }

    @Override
    public void a(aqh_1 aqh_12) {
        this.avX = aqh_12.bGG();
        this.emz = aqh_12.bGG();
        this.emB = aqh_12.bxv();
        this.emC = aqh_12.bGO();
        this.emD = aqh_12.bGO();
        this.emE = aqh_12.bxv();
        this.emF = aqh_12.bGG();
    }

    @Override
    public final int bGA() {
        return ewj_2.ozb.d();
    }
}


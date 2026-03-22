/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;

public abstract class foI
implements fph {
    protected final foP sMh;
    protected final TIntObjectHashMap<abm_1> sMi;
    protected final TIntObjectHashMap<abm_1> sMj;
    private fpc sMk;
    protected int sMl;
    protected int sMm;
    protected fpb sMn;
    static final LU sMo = new LU();

    public foI(foP foP2) {
        this.sMh = foP2;
        this.sMl = -1;
        this.sMm = -1;
        this.sMn = fpb.sNn;
        this.sMi = new TIntObjectHashMap();
        this.sMj = new TIntObjectHashMap();
    }

    public void c(int n, abm_1 abm_12) {
        this.sMi.put(n, (Object)abm_12);
    }

    public void d(int n, abm_1 abm_12) {
        this.sMj.put(n, (Object)abm_12);
    }

    public TIntObjectHashMap<abm_1> gfJ() {
        return this.sMi;
    }

    public TIntObjectHashMap<abm_1> gfK() {
        return this.sMj;
    }

    @Override
    public int gfL() {
        return this.sMl;
    }

    @Override
    public int gfM() {
        return this.sMm;
    }

    @Override
    public fpb gfN() {
        return this.sMn;
    }

    public void a(fpb fpb2) {
        this.sMn = fpb2;
    }

    public void a(fpc fpc2) {
        this.sMk = fpc2;
    }

    public void c(TIntIntHashMap tIntIntHashMap) {
        sMo.ns(0);
        this.sMi.forEachEntry((TIntObjectProcedure)new foJ(this, tIntIntHashMap));
        int n = sMo.aTn();
        if (n != this.sMl) {
            this.sMl = n;
            if (this.sMk != null) {
                this.sMk.j(this.sMh);
            }
            this.eaP();
        }
    }

    public void d(TIntIntHashMap tIntIntHashMap) {
        sMo.ns(0);
        this.sMj.forEachEntry((TIntObjectProcedure)new foK(this, tIntIntHashMap));
        int n = sMo.aTn();
        if (n != this.sMm) {
            this.sMm = n;
            if (this.sMk != null) {
                this.sMk.j(this.sMh);
            }
            this.eaP();
        }
    }

    public void Yb(int n) {
        this.sMl = n;
    }

    public void Yc(int n) {
        this.sMm = n;
    }

    protected abstract void eaP();
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.util.function.BiConsumer;

/*
 * Renamed from fop
 */
public abstract class fop_0
implements fov_0 {
    protected final int sLh;
    protected final int sLi;
    protected final int sLj;
    protected final short sLk;
    protected final short sLl;
    protected final aae_1 sLm = new aae_1();
    protected final foz_0 sLn;
    private final TObjectIntHashMap<foq_0> sLo = new TObjectIntHashMap();

    fop_0(int n, int n2, int n3, long l, long l2, byte by, short s, short s2) {
        this.sLh = n;
        this.sLi = n2;
        this.sLj = n3;
        this.sLn = new foz_0(l, l2, by);
        this.sLk = s;
        this.sLl = s2;
    }

    @Override
    public void a(foq_0 foq_02, int n) {
        this.sLo.put((Object)foq_02, n);
    }

    @Override
    public int a(foq_0 foq_02) {
        return this.sLo.get((Object)foq_02);
    }

    @Override
    public void gi(int n, int n2) {
        this.sLm.cA(n, n2);
    }

    @Override
    public boolean XF(int n) {
        return this.sLm.vZ(n);
    }

    @Override
    public void ai(int n, boolean bl) {
        this.sLn.ai(n, bl);
    }

    @Override
    public boolean XG(int n) {
        return this.sLn.XG(n);
    }

    @Override
    public void f(TIntProcedure tIntProcedure) {
        this.sLn.g(tIntProcedure);
    }

    @Override
    public void i(BiConsumer<Integer, Boolean> biConsumer) {
        this.sLn.i(biConsumer);
    }

    @Override
    public int fs(short s) {
        return Math.min(this.sLl, s) * this.sLk;
    }

    @Override
    public int[] gft() {
        return this.sLm.bTS();
    }

    @Override
    public int XH(int n) {
        return this.sLm.pF(n);
    }

    @Override
    public int d() {
        return this.sLh;
    }

    @Override
    public int aVt() {
        return this.sLi;
    }

    @Override
    public int agM() {
        return this.sLj;
    }

    @Override
    public ua_0 gfu() {
        return this.sLn.gfu();
    }

    @Override
    public ua_0 gfv() {
        return this.sLn.gfv();
    }

    @Override
    public byte gfw() {
        return this.sLn.gfw();
    }

    @Override
    public short csH() {
        return this.sLk;
    }

    @Override
    public short aVe() {
        return this.sLl;
    }
}


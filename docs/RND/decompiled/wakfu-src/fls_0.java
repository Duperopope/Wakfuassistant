/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.map.hash.TIntIntHashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fls
 */
public abstract class fls_0
extends flr_0 {
    private fkL lfY = null;
    protected final TIntIntHashMap sEn = new TIntIntHashMap();
    protected int sEo = -1;
    protected fka_0 sEp;
    protected boolean sEq;

    protected fls_0(fjm fjm2) {
        super(fjm2);
    }

    @Override
    public int WA(int n) {
        return this.sEn.get(n);
    }

    public boolean WV(int n) {
        return this.sEn.containsKey(n);
    }

    @Override
    public fkL emF() {
        return this.lfY;
    }

    @Override
    public void b(fkL fkL2) {
        this.lfY = fkL2;
    }

    @Override
    public boolean c(fkL fkL2) {
        return this.lfY != null && this.lfY == fkL2;
    }

    @Override
    public boolean WB(int n) {
        return this.WC(n);
    }

    @Override
    public boolean gaX() {
        return this.WC(((exP)this.sEm).ffM());
    }

    @Override
    public boolean WC(int n) {
        fjo_0 fjo_02 = fjt.syH.WG(n);
        if (fjo_02 == null) {
            return false;
        }
        int n2 = this.sEn.get(n);
        return fkf_0.gcc().WJ(n2).b(fkj_0.sAM);
    }

    @Override
    public boolean gaW() {
        return this.WB(((exP)this.sEm).ffM());
    }

    @Override
    public int gdd() {
        return this.sEn.get(this.sEo);
    }

    @Override
    public int gde() {
        return this.sEo;
    }

    @Override
    public int WU(int n) {
        int n2 = this.sEn.adjustOrPutValue(this.sEo, n, n);
        if (n2 >= 0) {
            this.sEn.remove(this.sEo);
        }
        return n2;
    }

    public int fY(int n, int n2) {
        int n3 = n2;
        if (n != this.Xt() && n2 > 0) {
            n3 = 0;
        }
        return this.sEn.put(n, n3);
    }

    public TIntIntIterator gdf() {
        return this.sEn.iterator();
    }

    public int[] gdg() {
        return this.sEn.keys();
    }

    @Override
    public abstract void Jo(int var1);

    @Override
    public void i(@NotNull fjo_0 fjo_02) {
        super.i(fjo_02);
        this.iv(true);
    }

    @Override
    public void iv(boolean bl) {
        this.sEq = bl;
    }

    @Override
    public boolean gaY() {
        return this.sEq;
    }
}


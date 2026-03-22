/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntShortIterator
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntShortIterator;
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from eLt
 */
public class elt_0 {
    private static final Logger qGp = Logger.getLogger(elt_0.class);
    public static final byte qGq = 0;
    private final int qGr;
    private final int qGs;
    private final short qGt;
    private final long qGu;
    private final int qGv;
    private final ang_2 qGw;
    private final ang_2 qGx;
    private final boolean qGy;
    private final EnumSet<els_0> qGz;
    protected final TIntShortHashMap qGA = new TIntShortHashMap();
    private final ArrayList<elx_0> qGB = new ArrayList();
    private final ArrayList<elw_0> qGC = new ArrayList();
    private final float qGD;
    private final boolean qGE;
    private final long qGF;
    private final long qGG;
    private final int qGH;

    public elt_0(int n, int n2, short s, long l, int n3, ang_2 ang_22, ang_2 ang_23, boolean bl, EnumSet<els_0> enumSet, float f2, boolean bl2, long l2, long l3, int n4) {
        this.qGr = n;
        this.qGs = n2;
        this.qGt = s;
        this.qGu = l;
        this.qGv = n3;
        this.qGw = ang_22;
        this.qGx = ang_23;
        this.qGy = bl;
        this.qGz = enumSet != null ? enumSet : EnumSet.noneOf(els_0.class);
        this.qGD = f2;
        this.qGE = bl2;
        this.qGF = l2;
        this.qGG = l3;
        this.qGH = n4;
    }

    public boolean at(exP exP2) {
        return this.qGw == null || this.qGw.b(exP2, exP2, this, exP2.bdV());
    }

    public boolean au(exP exP2) {
        return this.qGx == null || this.qGx.b(exP2, exP2, this, exP2.bdV());
    }

    public boolean cui() {
        return this.qGy;
    }

    public byte aFW() {
        return 0;
    }

    public void a(els_0 els_02) {
        this.qGz.add(els_02);
    }

    public void e(Collection<els_0> collection) {
        this.qGz.addAll(collection);
    }

    public void b(els_0 els_02) {
        this.qGz.remove(els_02);
    }

    public void g(Collection<els_0> collection) {
        this.qGz.removeAll(collection);
    }

    public boolean c(els_0 els_02) {
        return this.qGz.contains(els_02);
    }

    public Iterator<els_0> bek() {
        return this.qGz.iterator();
    }

    public int d() {
        return this.qGr;
    }

    public short dxy() {
        return this.qGt;
    }

    public int fzH() {
        return this.qGB.size();
    }

    public long fyY() {
        return this.qGu;
    }

    public int cuj() {
        return this.qGv;
    }

    public long aw(exP exP2) {
        int n = exP2.dmn().a(eje_0.qyv, this.qGs, 8);
        double d2 = 1.0 / (double)this.qGu;
        double d3 = 1.0 + (double)n / 100.0;
        double d4 = d2 * d3;
        return Math.round(1.0 / d4);
    }

    public elx_0 dZ(short s) {
        if (this.qGB.isEmpty()) {
            return elx_0.qGO;
        }
        double d2 = elz_0.a(s, this);
        return this.qGB.get((int)Math.round(d2));
    }

    public float fzI() {
        return this.qGD;
    }

    public long cun() {
        return this.qGG;
    }

    public elx_0[] fzJ() {
        return this.qGB.toArray(new elx_0[this.qGB.size()]);
    }

    public elx_0 ea(short s) {
        elz_0 elz_02 = new elz_0(s, this);
        return this.qGB.get((int)Math.round(elz_02.nextDouble()));
    }

    public TIntShortIterator fzK() {
        return this.qGA.iterator();
    }

    public ArrayList<elw_0> fzL() {
        return this.qGC;
    }

    public ang_2 bdo() {
        return this.qGw;
    }

    public short Rl(int n) {
        return this.qGA.get(n);
    }

    public boolean QX(int n) {
        return this.qGA.containsKey(n);
    }

    public void v(int n, short s) {
        this.qGA.put(n, s);
    }

    public long fzM() {
        return this.qGF;
    }

    public boolean cum() {
        return this.qGE;
    }

    public int cms() {
        return this.qGs;
    }

    public String toString() {
        return "CraftRecipeReference{m_id=" + this.qGr + ", m_craftId=" + this.qGs + ", m_requiredLevel=" + this.qGt + ", m_craftDuration=" + this.qGu + "}";
    }

    public boolean Rm(int n) {
        int n2 = this.qGB.size();
        for (int i = 0; i < n2; ++i) {
            if (this.qGB.get(i).azv() != n) continue;
            return true;
        }
        return false;
    }

    public void w(int n, short s) {
        elx_0 elx_02 = new elx_0(n, s);
        if (this.qGB.contains(elx_02)) {
            qGp.warn((Object)("Duplication d'item r\u00e9sultant " + n + " sur la recette " + this.d()));
            return;
        }
        this.qGB.add(elx_02);
    }

    public void a(int[] nArray, short s, short s2, boolean bl) {
        elp_0[] elp_0Array = new elp_0[nArray.length];
        for (int i = 0; i < elp_0Array.length; ++i) {
            elp_0Array[i] = elp_0.fa((byte)nArray[i]);
        }
        elw_0 elw_02 = new elw_0(elp_0Array, s, s2, bl);
        if (this.qGC.contains(elw_02)) {
            qGp.warn((Object)("Duplication de slot de mat\u00e9riau " + String.valueOf(elw_02) + " sur la recette " + this.d()));
            return;
        }
        this.qGC.add(elw_02);
    }

    public elw_0 fb(byte by) {
        return this.qGC.get(by);
    }

    public boolean dxG() {
        return this.qGH > 0;
    }
}


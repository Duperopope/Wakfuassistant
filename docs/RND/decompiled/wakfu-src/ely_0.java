/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eLy
 */
public class ely_0 {
    private final int qGR;
    private final int qGS;
    private final float qGT;
    private final boolean qGU;
    private final boolean qGV;
    private final boolean qGW;
    private final TIntObjectHashMap<elt_0> qGX = new TIntObjectHashMap();
    private TIntObjectHashMap<ArrayList<elt_0>> qEP = null;

    public ely_0(int n, int n2, float f2, boolean bl, boolean bl2, boolean bl3) {
        this.qGR = n;
        this.qGS = n2;
        this.qGT = f2;
        this.qGU = bl;
        this.qGV = bl2;
        this.qGW = bl3;
    }

    public int d() {
        return this.qGR;
    }

    public int fzd() {
        return this.qGS;
    }

    public float cmu() {
        return this.qGT;
    }

    public boolean cmv() {
        return this.qGU || this.cmw();
    }

    public boolean cmw() {
        return this.qGV;
    }

    public elt_0 Rn(int n) {
        return (elt_0)this.qGX.get(n);
    }

    public TIntObjectIterator<elt_0> fze() {
        return this.qGX.iterator();
    }

    @Nullable
    public Iterator<elt_0> Ra(int n) {
        ArrayList arrayList = (ArrayList)this.qEP.get(n);
        return arrayList != null ? arrayList.iterator() : null;
    }

    public boolean Rc(int n) {
        return this.qEP.get(n) != null;
    }

    public int fzh() {
        return this.qGX.size();
    }

    public boolean cmx() {
        return this.qGW;
    }

    public void f(TIntObjectHashMap<ArrayList<elt_0>> tIntObjectHashMap) {
        this.qEP = tIntObjectHashMap;
    }

    public void a(int n, elt_0 elt_02) {
        this.qGX.put(n, (Object)elt_02);
    }
}


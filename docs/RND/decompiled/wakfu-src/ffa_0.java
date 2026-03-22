/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ffA
 */
public class ffa_0<R extends fhc_0>
implements Iterable<R> {
    private static final Logger sfG = Logger.getLogger(ffa_0.class);
    private final short sfH;
    private final int sfI;
    protected final List<R> sfJ;
    protected final TIntObjectHashMap<fgm_0> sfK = new TIntObjectHashMap(1);

    public ffa_0(short s, int n, List<R> list) {
        this.sfH = s;
        this.sfI = n;
        this.sfJ = list;
    }

    public ffa_0(short s, int n) {
        this.sfH = s;
        this.sfI = n;
        this.sfJ = new ArrayList<R>();
    }

    public short aIi() {
        return this.sfH;
    }

    @Override
    @NotNull
    public Iterator<R> iterator() {
        return this.sfJ.iterator();
    }

    protected List<R> fVp() {
        return this.sfJ;
    }

    public void e(R r) {
        if (r == null) {
            sfG.warn((Object)("ajout d'un item null dans le set " + this.aIi()));
            return;
        }
        this.sfJ.add(r);
    }

    public void O(Collection<R> collection) {
        this.sfJ.addAll(collection);
    }

    public void a(int n, enk_0 enk_02) {
        fgm_0 fgm_02 = (fgm_0)this.sfK.get(n);
        if (fgm_02 == null) {
            fgm_02 = new fgm_0((short)n, this.sfH);
            this.sfK.put(n, (Object)fgm_02);
        }
        fgm_02.v(enk_02);
    }

    public fgm_0 ae(int n, boolean bl) {
        if (n == 0) {
            return null;
        }
        fgm_0 fgm_02 = (fgm_0)this.sfK.get(n);
        if (fgm_02 != null) {
            return fgm_02;
        }
        if (bl) {
            return this.ae(--n, bl);
        }
        return null;
    }

    public ArrayList<enk_0> UP(int n) {
        fgm_0 fgm_02 = this.ae(n, false);
        if (fgm_02 == null) {
            return null;
        }
        ArrayList<enk_0> arrayList = new ArrayList<enk_0>(0);
        for (enk_0 enk_02 : fgm_02) {
            arrayList.add(enk_02);
        }
        return arrayList;
    }

    public fgm_0 UQ(int n) {
        return this.ae(n, true);
    }

    public ArrayList<fgm_0> UR(int n) {
        ArrayList<fgm_0> arrayList = new ArrayList<fgm_0>();
        for (int i = 1; i <= n; ++i) {
            fgm_0 fgm_02 = this.ae(i, false);
            if (fgm_02 == null) continue;
            arrayList.add(fgm_02);
        }
        return arrayList;
    }

    public int US(int n) {
        if (n == 0) {
            return 0;
        }
        fgm_0 fgm_02 = (fgm_0)this.sfK.get(n);
        if (fgm_02 == null) {
            return this.US(--n);
        }
        return fgm_02.fWZ();
    }

    public int dSg() {
        return this.sfJ.size();
    }

    public int fVq() {
        return this.sfI;
    }

    public final int[] fVr() {
        int[] nArray = new int[this.sfJ.size()];
        for (int i = 0; i < this.sfJ.size(); ++i) {
            nArray[i] = ((fhc_0)this.sfJ.get(i)).d();
        }
        return nArray;
    }

    public boolean fVs() {
        return !this.sfK.isEmpty();
    }
}


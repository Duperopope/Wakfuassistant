/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class arF {
    public static final arF cUO = new arH();
    private boolean cUP = true;
    private boolean cUQ;
    private boolean cUR = true;
    final ArrayList<EZ> cUS = new ArrayList(1);
    private final ArrayList<Anm> cUT = new ArrayList(4);
    private final ArrayList<arz> cUU = new ArrayList(4);
    private final TIntObjectHashMap<arz> cUV = new TIntObjectHashMap();
    private int cUw;
    private final TObjectProcedure<arz> cUW = new arG();
    private final TObjectProcedure<arz> cUX = new arI(this);

    protected final boolean bHR() {
        return !this.cUT.isEmpty() || !this.cUU.isEmpty() || !this.cUV.isEmpty() || this.cUw != 0;
    }

    public final boolean bHS() {
        return !this.cUV.isEmpty();
    }

    public final boolean bHT() {
        return !this.cUU.isEmpty();
    }

    final arz tY(int n) {
        return (arz)this.cUV.get(n);
    }

    public boolean bHU() {
        if (this.cUP) {
            this.cUP = false;
            this.cUQ = false;
            this.cUQ = !this.cUV.isEmpty() && !this.cUV.forEachValue(this.cUW);
        }
        return this.cUQ;
    }

    public ArrayList<EZ> bHV() {
        if (this.cUR) {
            this.cUR = false;
            this.cUS.clear();
            this.cUV.forEachValue(this.cUX);
        }
        return this.cUS;
    }

    public void clear() {
        for (int i = this.cUT.size() - 1; i >= 0; --i) {
            arF.k(this.cUT.get(i));
        }
        this.cUT.clear();
        this.cUU.clear();
        this.cUV.clear();
        this.cUS.clear();
        this.cUR = true;
        this.cUQ = false;
        this.cUP = true;
        this.cUw = 0;
    }

    boolean a(@NotNull Anm anm, TIntHashSet tIntHashSet) {
        return this.a(anm, tIntHashSet, null);
    }

    boolean a(@NotNull Anm anm, TIntHashSet tIntHashSet, TIntHashSet tIntHashSet2) {
        this.j(anm);
        ++this.cUw;
        if (tIntHashSet == null) {
            return this.a(anm, this.cUw, tIntHashSet2);
        }
        boolean bl = false;
        if (anm.aLB()) {
            List<Fk> list = anm.bGV().aIF().aIt();
            for (Fk fk : list) {
                int n = fk.aIj();
                if (tIntHashSet2 != null && tIntHashSet2.contains(fk.aIk()) || n == 0 || !tIntHashSet.contains(fk.aIk())) continue;
                this.a(n, new arz(n, anm, fk, this.cUw));
                bl = true;
                this.bW(fk.aIk(), this.cUw);
            }
        } else {
            for (int n : tIntHashSet) {
                if (tIntHashSet2 != null && tIntHashSet2.contains(n)) continue;
                this.cUU.add(new arz(n, anm, null, this.cUw));
            }
        }
        return bl;
    }

    private void bW(int n, int n2) {
        for (int i = this.cUU.size() - 1; i >= 0; --i) {
            arz arz2 = this.cUU.get(i);
            if (arz2.cUs != n || arz2.cUw >= n2) continue;
            this.cUU.remove(i);
        }
    }

    boolean b(Anm anm, TIntHashSet tIntHashSet) {
        boolean bl = false;
        TIntObjectIterator tIntObjectIterator = this.cUV.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            arz arz2 = (arz)tIntObjectIterator.value();
            if (tIntHashSet == null) {
                if (arz2.cUt != anm) continue;
                tIntObjectIterator.remove();
                bl = true;
                continue;
            }
            if (!tIntHashSet.contains(arz2.cUu.aIk()) || arz2.cUt != anm) continue;
            tIntObjectIterator.remove();
            bl = true;
        }
        int n = 0;
        while (n < this.cUU.size()) {
            arz arz3 = this.cUU.get(n);
            if (tIntHashSet == null) {
                if (arz3.cUt == anm) {
                    this.cUU.remove(n);
                    bl = true;
                    continue;
                }
                ++n;
                continue;
            }
            if (tIntHashSet.contains(arz3.cUs) && arz3.cUt == anm) {
                this.cUU.remove(n);
                bl = true;
                continue;
            }
            ++n;
        }
        this.cUR = true;
        this.cUP = true;
        return bl && this.bHX();
    }

    boolean bHW() {
        boolean bl = false;
        int n = 0;
        while (n < this.cUU.size()) {
            arz arz2 = this.cUU.get(n);
            int n2 = arz2.cUs;
            Anm anm = arz2.cUt;
            if (anm.aLB()) {
                bl = true;
                boolean bl2 = false;
                if (n2 == 0) {
                    this.a(anm, arz2.cUw, arz2.cUx);
                } else {
                    List<Fk> list = anm.bGV().aIF().aIt();
                    for (Fk fk : list) {
                        if (fk == null || fk.aIj() == 0 || fk.aIk() != n2) continue;
                        bl2 = true;
                        this.a(fk.aIj(), new arz(n2, anm, fk, arz2.cUw));
                    }
                }
                this.cUU.remove(arz2);
                if (!bl2) continue;
                this.bW(n2, arz2.cUw);
                continue;
            }
            if (anm.bGU()) {
                this.cUU.remove(n);
                continue;
            }
            ++n;
        }
        if (this.cUU.isEmpty()) {
            this.cUw = 0;
        }
        return bl;
    }

    private void a(int n, arz arz2) {
        this.cUV.put(n, (Object)arz2);
        this.cUR = true;
        this.cUP = true;
    }

    private void j(@NotNull Anm anm) {
        int n = this.cUT.size();
        for (int i = 0; i < n; ++i) {
            if (this.cUT.get(i) != anm) continue;
            return;
        }
        anm.bGY();
        this.cUT.add(anm);
    }

    private static void k(@NotNull Anm anm) {
        assert (anm.bSW() > 0);
        anm.bsI();
    }

    private boolean bHX() {
        boolean bl = false;
        int n = 0;
        while (n < this.cUT.size()) {
            Anm anm = this.cUT.get(n);
            if (this.l(anm)) {
                ++n;
                continue;
            }
            this.cUT.remove(n);
            arF.k(anm);
            bl = true;
        }
        return bl;
    }

    private boolean l(Anm anm) {
        TIntObjectIterator tIntObjectIterator = this.cUV.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((arz)tIntObjectIterator.value()).cUt != anm) continue;
            return true;
        }
        int n = this.cUU.size();
        for (int i = 0; i < n; ++i) {
            if (this.cUU.get((int)i).cUt != anm) continue;
            return true;
        }
        return false;
    }

    boolean a(Anm anm, int n, TIntHashSet tIntHashSet) {
        ++this.cUw;
        boolean bl = false;
        if (anm.aLB()) {
            List<Fk> list = anm.bGV().aIF().aIt();
            for (Fk fk : list) {
                int n2 = fk.aIj();
                if (tIntHashSet != null && tIntHashSet.contains(fk.aIk())) continue;
                if (fk.getName() != null) {
                    arz arz2 = (arz)this.cUV.get(n2);
                    if (arz2 == null || arz2.cUw < n) {
                        this.a(n2, new arz(n2, anm, fk, this.cUw));
                    }
                    this.bW(fk.aIk(), this.cUw);
                }
                bl = true;
            }
        } else {
            this.cUU.add(new arz(0, anm, null, this.cUw, tIntHashSet));
        }
        return bl;
    }

    boolean a(Anm anm, int n) {
        return this.a(anm, n, null);
    }

    arF bHY() {
        int n;
        arF arF2 = new arF();
        int n2 = this.cUT.size();
        arF2.cUT.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            Anm anm = this.cUT.get(n);
            anm.bGY();
            arF2.cUT.add(anm);
        }
        n = this.cUU.size();
        arF2.cUU.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            arF2.cUU.add(new arz(this.cUU.get(i)));
        }
        TIntObjectIterator tIntObjectIterator = this.cUV.iterator();
        arF2.cUV.ensureCapacity(this.cUV.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            arF2.cUV.put(tIntObjectIterator.key(), (Object)((arz)tIntObjectIterator.value()));
        }
        arF2.cUw = this.cUw;
        arF2.cUR = true;
        arF2.cUP = true;
        return arF2;
    }
}

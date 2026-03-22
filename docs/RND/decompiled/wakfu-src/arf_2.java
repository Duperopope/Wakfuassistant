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

/*
 * Renamed from arF
 */
public class arf_2 {
    public static final arf_2 cUO = new arh_1();
    private boolean cUP = true;
    private boolean cUQ;
    private boolean cUR = true;
    final ArrayList<ez_1> cUS = new ArrayList(1);
    private final ArrayList<Anm> cUT = new ArrayList(4);
    private final ArrayList<arz_1> cUU = new ArrayList(4);
    private final TIntObjectHashMap<arz_1> cUV = new TIntObjectHashMap();
    private int cUw;
    private final TObjectProcedure<arz_1> cUW = new arg_2();
    private final TObjectProcedure<arz_1> cUX = new ari_1(this);

    protected final boolean bHR() {
        return !this.cUT.isEmpty() || !this.cUU.isEmpty() || !this.cUV.isEmpty() || this.cUw != 0;
    }

    public final boolean bHS() {
        return !this.cUV.isEmpty();
    }

    public final boolean bHT() {
        return !this.cUU.isEmpty();
    }

    final arz_1 tY(int n) {
        return (arz_1)this.cUV.get(n);
    }

    public boolean bHU() {
        if (this.cUP) {
            this.cUP = false;
            this.cUQ = false;
            this.cUQ = !this.cUV.isEmpty() && !this.cUV.forEachValue(this.cUW);
        }
        return this.cUQ;
    }

    public ArrayList<ez_1> bHV() {
        if (this.cUR) {
            this.cUR = false;
            this.cUS.clear();
            this.cUV.forEachValue(this.cUX);
        }
        return this.cUS;
    }

    public void clear() {
        for (int i = this.cUT.size() - 1; i >= 0; --i) {
            arf_2.k(this.cUT.get(i));
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
            List<fk_0> list = anm.bGV().aIF().aIt();
            for (fk_0 fk_02 : list) {
                int n = fk_02.aIj();
                if (tIntHashSet2 != null && tIntHashSet2.contains(fk_02.aIk()) || n == 0 || !tIntHashSet.contains(fk_02.aIk())) continue;
                this.a(n, new arz_1(n, anm, fk_02, this.cUw));
                bl = true;
                this.bW(fk_02.aIk(), this.cUw);
            }
        } else {
            for (int n : tIntHashSet) {
                if (tIntHashSet2 != null && tIntHashSet2.contains(n)) continue;
                this.cUU.add(new arz_1(n, anm, null, this.cUw));
            }
        }
        return bl;
    }

    private void bW(int n, int n2) {
        for (int i = this.cUU.size() - 1; i >= 0; --i) {
            arz_1 arz_12 = this.cUU.get(i);
            if (arz_12.cUs != n || arz_12.cUw >= n2) continue;
            this.cUU.remove(i);
        }
    }

    boolean b(Anm anm, TIntHashSet tIntHashSet) {
        boolean bl = false;
        TIntObjectIterator tIntObjectIterator = this.cUV.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            arz_1 arz_12 = (arz_1)tIntObjectIterator.value();
            if (tIntHashSet == null) {
                if (arz_12.cUt != anm) continue;
                tIntObjectIterator.remove();
                bl = true;
                continue;
            }
            if (!tIntHashSet.contains(arz_12.cUu.aIk()) || arz_12.cUt != anm) continue;
            tIntObjectIterator.remove();
            bl = true;
        }
        int n = 0;
        while (n < this.cUU.size()) {
            arz_1 arz_13 = this.cUU.get(n);
            if (tIntHashSet == null) {
                if (arz_13.cUt == anm) {
                    this.cUU.remove(n);
                    bl = true;
                    continue;
                }
                ++n;
                continue;
            }
            if (tIntHashSet.contains(arz_13.cUs) && arz_13.cUt == anm) {
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
            arz_1 arz_12 = this.cUU.get(n);
            int n2 = arz_12.cUs;
            Anm anm = arz_12.cUt;
            if (anm.aLB()) {
                bl = true;
                boolean bl2 = false;
                if (n2 == 0) {
                    this.a(anm, arz_12.cUw, arz_12.cUx);
                } else {
                    List<fk_0> list = anm.bGV().aIF().aIt();
                    for (fk_0 fk_02 : list) {
                        if (fk_02 == null || fk_02.aIj() == 0 || fk_02.aIk() != n2) continue;
                        bl2 = true;
                        this.a(fk_02.aIj(), new arz_1(n2, anm, fk_02, arz_12.cUw));
                    }
                }
                this.cUU.remove(arz_12);
                if (!bl2) continue;
                this.bW(n2, arz_12.cUw);
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

    private void a(int n, arz_1 arz_12) {
        this.cUV.put(n, (Object)arz_12);
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
            arf_2.k(anm);
            bl = true;
        }
        return bl;
    }

    private boolean l(Anm anm) {
        TIntObjectIterator tIntObjectIterator = this.cUV.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (((arz_1)tIntObjectIterator.value()).cUt != anm) continue;
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
            List<fk_0> list = anm.bGV().aIF().aIt();
            for (fk_0 fk_02 : list) {
                int n2 = fk_02.aIj();
                if (tIntHashSet != null && tIntHashSet.contains(fk_02.aIk())) continue;
                if (fk_02.getName() != null) {
                    arz_1 arz_12 = (arz_1)this.cUV.get(n2);
                    if (arz_12 == null || arz_12.cUw < n) {
                        this.a(n2, new arz_1(n2, anm, fk_02, this.cUw));
                    }
                    this.bW(fk_02.aIk(), this.cUw);
                }
                bl = true;
            }
        } else {
            this.cUU.add(new arz_1(0, anm, null, this.cUw, tIntHashSet));
        }
        return bl;
    }

    boolean a(Anm anm, int n) {
        return this.a(anm, n, null);
    }

    arf_2 bHY() {
        int n;
        arf_2 arf_22 = new arf_2();
        int n2 = this.cUT.size();
        arf_22.cUT.ensureCapacity(n2);
        for (n = 0; n < n2; ++n) {
            Anm anm = this.cUT.get(n);
            anm.bGY();
            arf_22.cUT.add(anm);
        }
        n = this.cUU.size();
        arf_22.cUU.ensureCapacity(n);
        for (int i = 0; i < n; ++i) {
            arf_22.cUU.add(new arz_1(this.cUU.get(i)));
        }
        TIntObjectIterator tIntObjectIterator = this.cUV.iterator();
        arf_22.cUV.ensureCapacity(this.cUV.size());
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            arf_22.cUV.put(tIntObjectIterator.key(), (Object)((arz_1)tIntObjectIterator.value()));
        }
        arf_22.cUw = this.cUw;
        arf_22.cUR = true;
        arf_22.cUP = true;
        return arf_22;
    }
}


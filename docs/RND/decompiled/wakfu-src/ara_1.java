/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from arA
 */
public class ara_1 {
    public static final ara_1 cUz = new arb_1();
    private final TIntProcedure cUA = new arc_1(this);
    final TIntHashSet cUB = new TIntHashSet();
    private final TIntHashSet cUC = new TIntHashSet();
    private final TIntHashSet cUD = new TIntHashSet();
    private final TIntHashSet cUE = new TIntHashSet();
    final TIntHashSet cUF = new TIntHashSet();
    private boolean cUG = false;
    private boolean cSL = true;

    public void tQ(int n) {
        this.cSL |= this.cUC.add(n);
    }

    public void tR(int n) {
        this.cSL |= this.cUD.add(n);
    }

    public void tS(int n) {
        this.cSL |= this.cUD.remove(n);
    }

    public void tT(int n) {
        this.cSL |= this.cUE.add(n);
        this.cUG = true;
    }

    public void tU(int n) {
        this.cSL |= this.cUE.remove(n);
        this.cUG = !this.cUE.isEmpty();
    }

    public void tV(int n) {
        this.cSL |= this.cUF.add(n);
    }

    public void tW(int n) {
        this.cSL |= this.cUF.remove(n);
    }

    public void aPc() {
        if (!this.cSL) {
            return;
        }
        this.cUB.clear();
        this.cUC.forEach(this.cUA);
        this.cUD.forEach(this.cUA);
        this.cSL = false;
    }

    public void clear() {
        this.cUB.clear();
        this.cUD.clear();
        this.cUE.clear();
        this.cUF.clear();
        this.cUG = false;
        this.cUC.clear();
    }

    boolean tX(int n) {
        assert (!this.cSL);
        if (this.cUG) {
            return !this.cUE.contains(n);
        }
        return !this.cUB.isEmpty() && this.cUB.contains(n);
    }

    void bHN() {
        this.cUC.clear();
        this.cSL = true;
    }

    public ara_1 bHO() {
        ara_1 ara_12 = new ara_1();
        ara_12.cUB.addAll(this.cUB.toArray());
        ara_12.cUC.addAll(this.cUC.toArray());
        ara_12.cUD.addAll(this.cUD.toArray());
        ara_12.cUF.addAll(this.cUF.toArray());
        ara_12.cSL = this.cSL;
        return ara_12;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class btu
implements eVf {
    public static final btu jlv = new btu();
    private final TIntObjectHashMap<ArrayList<btr_1>> jlw = new TIntObjectHashMap();

    private btu() {
    }

    public boolean a(bsR bsR2, long l) {
        ArrayList arrayList = (ArrayList)this.jlw.get(bsR2.ordinal());
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            btr_1 btr_12 = (btr_1)iterator.next();
            if (btr_12.OO() != l && btr_12.OO() != 0L) continue;
            iterator.remove();
            return true;
        }
        return false;
    }

    public boolean a(bsR bsR2, btr_1 btr_12) {
        ArrayList<btr_1> arrayList = (ArrayList<btr_1>)this.jlw.get(bsR2.ordinal());
        if (arrayList == null) {
            arrayList = new ArrayList<btr_1>();
            this.jlw.put(bsR2.ordinal(), arrayList);
        }
        for (btr_1 btr_13 : arrayList) {
            if (btr_13.OO() != btr_12.OO()) continue;
            return false;
        }
        return arrayList.add(btr_12);
    }

    private void a(bsR bsR2) {
        ArrayList arrayList = (ArrayList)this.jlw.get(bsR2.ordinal());
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); ++i) {
                ((btr_1)arrayList.get(i)).dHM();
            }
        }
    }

    private void a(bsR bsR2, exP exP2) {
        ArrayList arrayList = (ArrayList)this.jlw.get(bsR2.ordinal());
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); ++i) {
                ((btr_1)arrayList.get(i)).H(exP2);
            }
        }
    }

    private void a(bsR bsR2, exP exP2, long l) {
        ArrayList arrayList = (ArrayList)this.jlw.get(bsR2.ordinal());
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); ++i) {
                ((btr_1)arrayList.get(i)).f(exP2, l);
            }
        }
    }

    @Override
    public void dHO() {
        this.a(bsR.jjs);
    }

    @Override
    public void dGS() {
        this.a(bsR.jjt);
    }

    @Override
    public void dHN() {
        this.a(bsR.jju);
    }

    @Override
    public void dHP() {
    }

    @Override
    public void dHQ() {
        this.a(bsR.jjw);
    }

    @Override
    public void dHd() {
        this.a(bsR.jjx);
    }

    public void z(exP exP2) {
        this.a(bsR.jjy, exP2);
    }

    public void y(exP exP2) {
        this.a(bsR.jjz, exP2);
    }

    public void B(exP exP2) {
        this.a(bsR.jjA, exP2);
    }

    public void G(exP exP2) {
        this.a(bsR.jjB, exP2);
    }

    public void I(exP exP2) {
        this.a(bsR.jjC, exP2);
    }

    public void J(exP exP2) {
        this.a(bsR.jjD, exP2);
    }

    @Override
    public void a(eSS eSS2) {
    }

    public void K(exP exP2) {
    }

    @Override
    public void dGY() {
        this.a(bsR.jjv);
        this.jlw.clear();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.TestOnly
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.TestOnly;

/*
 * Renamed from fhX
 */
public abstract class fhx_0 {
    private static final List<Short> sqZ = new ArrayList<Short>();
    protected static final Logger sra = Logger.getLogger(fgD.class);
    protected final TIntObjectHashMap<fhy_0> srb = new TIntObjectHashMap();

    protected fhx_0() {
        if (sqZ.size() != 0) {
            return;
        }
        sqZ.add((short)106);
        sqZ.add((short)525);
        sqZ.add((short)631);
        sqZ.add((short)751);
        sqZ.add((short)747);
        sqZ.add((short)746);
        sqZ.add((short)745);
        sqZ.add((short)757);
        sqZ.add((short)630);
        sqZ.add((short)752);
        sqZ.add((short)815);
        sqZ.add((short)707);
        sqZ.add((short)512);
        sqZ.add((short)756);
        sqZ.add((short)738);
        sqZ.add((short)766);
        sqZ.add((short)696);
        sqZ.add((short)743);
        sqZ.add((short)744);
        sqZ.add((short)476);
        sqZ.add((short)710);
        sqZ.add((short)647);
        sqZ.add((short)827);
    }

    public void k(fhy_0 fhy_02) {
        this.srb.put((int)fhy_02.aIi(), (Object)fhy_02);
    }

    public fhy_0 Gy(int n) {
        return (fhy_0)this.srb.get(n);
    }

    public ArrayList<fhy_0> fZi() {
        ArrayList<fhy_0> arrayList = new ArrayList<fhy_0>(1);
        TIntObjectIterator tIntObjectIterator = this.srb.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fhy_0 fhy_02 = (fhy_0)tIntObjectIterator.value();
            if (this.Gy(fhy_02.cpX()) != null) continue;
            arrayList.add(fhy_02);
        }
        return arrayList;
    }

    public void fZj() {
        fhy_0 fhy_02;
        ArrayList<fhy_0> arrayList = new ArrayList<fhy_0>(1);
        TIntObjectIterator tIntObjectIterator = this.srb.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fhy_02 = (fhy_0)tIntObjectIterator.value();
            fhy_0 fhy_03 = this.Gy(fhy_02.cpX());
            fhy_02.n(fhy_03);
            if (fhy_03 == null) {
                if (sqZ.contains(fhy_02.aIi())) {
                    fhy_02.ns(false);
                }
                arrayList.add(fhy_02);
                continue;
            }
            fhy_03.o(fhy_02);
            if (!sqZ.contains(fhy_02.aIi())) continue;
            fhy_02.ns(false);
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fhy_02 = (fhy_0)arrayList.get(i);
            this.l(fhy_02);
        }
    }

    private void l(fhy_0 fhy_02) {
        if (!fhy_02.fZo()) {
            return;
        }
        azl_2<fhy_0> azl_22 = fhy_02.fZp();
        for (int i = azl_22.aVo() - 1; i >= 0; --i) {
            fhy_0 fhy_03 = azl_22.vK(i);
            ffS[] ffSArray = fhy_02.fZq();
            ffS[] ffSArray2 = fhy_03.fZq();
            if (ffSArray.length != 0 && ffSArray2.length == 0) {
                fhy_03.c(ffSArray);
            }
            if (fhy_02.fZs() != null && fhy_02.fZs().length != 0 && (fhy_03.fZs() == null || fhy_03.fZs().length == 0)) {
                fhy_03.d(fhy_02.fZs());
            }
            this.l(fhy_03);
        }
    }

    public void fZk() {
        fhy_0 fhy_02;
        ArrayList<fhy_0> arrayList = new ArrayList<fhy_0>(1);
        TIntObjectIterator tIntObjectIterator = this.srb.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fhy_02 = (fhy_0)tIntObjectIterator.value();
            fhy_0 fhy_03 = fhy_02.fZm();
            if (fhy_03 != null) continue;
            arrayList.add(fhy_02);
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            fhy_02 = (fhy_0)arrayList.get(i);
            this.m(fhy_02);
        }
    }

    private void m(fhy_0 fhy_02) {
        if (!fhy_02.fZo()) {
            return;
        }
        azl_2<fhy_0> azl_22 = fhy_02.fZp();
        for (int i = azl_22.aVo() - 1; i >= 0; --i) {
            fhy_0 fhy_03 = azl_22.vK(i);
            this.l(fhy_03);
        }
    }

    @TestOnly
    public void fZl() {
        this.srb.clear();
    }
}


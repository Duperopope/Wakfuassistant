/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.TLongCollection
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.TLongCollection;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/*
 * Renamed from eWo
 */
final class ewo_1
extends TF {
    private final eub_0<? extends exP> rBp;
    private final ewt_2 rBq;
    private final Comparator<exP> rBr;
    private List<exP> rBs;
    private List<exP> rBt;

    ewo_1(eub_0<? extends exP> eub_02, ewt_2 ewt_22) {
        this.rBp = eub_02;
        this.rBq = ewt_22;
        this.rBr = new ewv_2(this.rBp.d(), ewt_22);
    }

    @Override
    protected void a(TD tD) {
        ewo_1.e(tD);
        this.fNZ();
        TLongArrayList tLongArrayList = this.bhD();
        ewo_1.a(tD, tLongArrayList);
    }

    private static void a(TD tD, TLongArrayList tLongArrayList) {
        tD.bia().add(tLongArrayList.toArray());
        tD.bhD().add(tLongArrayList.toArray());
    }

    private TLongArrayList bhD() {
        TLongArrayList tLongArrayList = new TLongArrayList();
        if (this.rBs.isEmpty() && this.rBt.isEmpty()) {
            return tLongArrayList;
        }
        if (this.rBs.isEmpty()) {
            ewo_1.a(tLongArrayList, this.rBt);
            return tLongArrayList;
        }
        if (this.rBt.isEmpty()) {
            ewo_1.a(tLongArrayList, this.rBs);
            return tLongArrayList;
        }
        boolean bl = true;
        while (!this.rBs.isEmpty() && !this.rBt.isEmpty()) {
            if (bl) {
                tLongArrayList.add(this.rBs.removeFirst().Sn());
            } else {
                tLongArrayList.add(this.rBt.removeFirst().Sn());
            }
            boolean bl2 = bl = !bl;
            if (this.rBs.isEmpty()) {
                ewo_1.a(tLongArrayList, this.rBt);
                continue;
            }
            if (!this.rBt.isEmpty()) continue;
            ewo_1.a(tLongArrayList, this.rBs);
        }
        return tLongArrayList;
    }

    private static void a(TLongArrayList tLongArrayList, List<? extends exP> list) {
        for (exP exP2 : list) {
            tLongArrayList.add(exP2.Sn());
        }
    }

    private static void e(TD tD) {
        tD.bhD().clear();
        tD.bia().clear();
    }

    private void fNZ() {
        Collection collection = this.rBp.bJ((byte)0);
        Collection collection2 = this.rBp.bJ((byte)1);
        int n = this.M(collection);
        int n2 = this.M(collection2);
        if (n2 > n) {
            this.rBs = new ArrayList(collection2);
            this.rBt = new ArrayList(collection);
        } else if (n2 < n) {
            this.rBs = new ArrayList(collection);
            this.rBt = new ArrayList(collection2);
        } else if (this.rBp.d() % 2 == 0) {
            this.rBs = new ArrayList(collection2);
            this.rBt = new ArrayList(collection);
        } else {
            this.rBs = new ArrayList(collection);
            this.rBt = new ArrayList(collection2);
        }
        this.rBs.sort(this.rBr);
        this.rBt.sort(this.rBr);
    }

    private int M(Collection<? extends exP> collection) {
        if (collection.isEmpty()) {
            return 0;
        }
        int n = 0;
        for (exP exP2 : collection) {
            n += this.rBq.rh(exP2.Sn());
        }
        return n /= collection.size();
    }

    @Override
    protected void b(TD tD) {
        tD.bhD().clear();
        tD.bhD().addAll((TLongCollection)tD.bia());
    }

    @Override
    protected void c(TD tD) {
    }

    @Override
    protected void a(TD tD, long l) {
        tD.bia().add(l);
    }

    @Override
    protected void a(TD tD, long l, int n) {
        TLongArrayList tLongArrayList = tD.bhD();
        if (n >= tLongArrayList.size()) {
            tLongArrayList.add(l);
        } else {
            tLongArrayList.insert(n, l);
        }
    }

    @Override
    protected void b(TD tD, long l, int n) {
        TLongArrayList tLongArrayList = tD.bia();
        if (n >= tLongArrayList.size()) {
            tLongArrayList.add(l);
        } else {
            tLongArrayList.insert(n, l);
        }
    }
}


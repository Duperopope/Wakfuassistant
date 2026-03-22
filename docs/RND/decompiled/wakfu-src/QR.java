/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class QR
implements ayx_2 {
    protected static final Logger biG = Logger.getLogger(QR.class);
    private ObjectPool bip;
    private final HashMap<Long, QQ> biH;
    private final TLongObjectHashMap<QQ> biI = new TLongObjectHashMap();
    private QT bit;
    private qm_0 bgJ;

    protected QR() {
        this.biH = new HashMap();
    }

    public qm_0 bbh() {
        return this.bgJ;
    }

    public void a(qm_0 qm_02) {
        this.bgJ = qm_02;
    }

    public void aZp() {
        if (this.bip != null) {
            try {
                this.bip.returnObject((Object)this);
            }
            catch (Exception exception) {
                biG.error((Object)"impossible");
            }
        } else {
            biG.error((Object)("Double release de " + this.getClass().toString()));
        }
        this.aVH();
    }

    @Override
    public void aVI() {
        this.bit = null;
        this.biI.clear();
        this.biH.clear();
    }

    @Override
    public void aVH() {
        this.bch();
        this.bit = null;
    }

    public void a(ObjectPool objectPool) {
        this.bip = objectPool;
    }

    public Collection<QQ> bde() {
        return this.biH.values();
    }

    public Collection<QQ> bdf() {
        return this.a(QQ::bcU);
    }

    public QQ e(acd_1 acd_12) {
        int n = acd_12.getX();
        int n2 = acd_12.getY();
        return this.N(n, n2);
    }

    @Nullable
    public QQ N(int n, int n2) {
        for (QQ qQ : this.bdf()) {
            if (n != qQ.bcC() || n2 != qQ.bcD()) continue;
            return qQ;
        }
        return null;
    }

    public List<QQ> f(acd_1 acd_12) {
        int n = acd_12.getX();
        int n2 = acd_12.getY();
        return this.O(n, n2);
    }

    public List<QQ> O(int n, int n2) {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        for (QQ qQ : this.bdf()) {
            if (n != qQ.bcC() || n2 != qQ.bcD()) continue;
            arrayList.add(qQ);
        }
        return arrayList;
    }

    public List<QQ> c(int n, int n2, int n3) {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        for (QQ qQ : this.bdf()) {
            if (n != qQ.bcC() || n2 != qQ.bcD() || n3 != qQ.aeV()) continue;
            arrayList.add(qQ);
        }
        return arrayList;
    }

    public List<QQ> g(@NotNull acd_1 acd_12) {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        this.biI.forEachValue(qQ -> {
            if (acd_12.cF(qQ.bcC(), qQ.bcD())) {
                arrayList.add((QQ)qQ);
            }
            return true;
        });
        return arrayList;
    }

    public int bdg() {
        return this.biI.size();
    }

    public Collection<QQ> bdh() {
        return this.biI.valueCollection();
    }

    public QQ do(long l) {
        return this.biH.get(l);
    }

    public QQ dp(long l) {
        return (QQ)this.biI.get(l);
    }

    public void a(QT qT) {
        this.bit = qT;
    }

    public void a(QQ qQ) {
        if (qQ == null) {
            return;
        }
        if (this.biI.containsKey(qQ.Sn())) {
            biG.error((Object)("Unable to spawn area : there is already one with the same ID in the manager, areaId : " + qQ.Sn() + ", area baseId : " + qQ.bcw()));
            return;
        }
        assert (!this.biI.containsValue((Object)qQ)) : "Trying to insert an effectArea already present, but with a different Id";
        qQ.a(this.bit);
        this.biH.put(qQ.Sn(), qQ);
        this.biI.put(qQ.Sn(), (Object)qQ);
        qQ.bcK();
        if (this.bit != null) {
            this.bit.f(qQ);
        }
    }

    public void b(QQ qQ) {
        this.a(qQ, null);
    }

    public void a(QQ qQ, qu_0 qu_02) {
        if (qQ == null) {
            return;
        }
        if (this.biI.containsKey(qQ.Sn())) {
            this.biI.remove(qQ.Sn());
            qQ.bcL();
            if (this.bit != null) {
                this.bit.g(qQ);
            }
            qQ.a(10011, null, (anu_1)qu_02);
        }
    }

    public void c(QQ qQ) {
        if (qQ == null) {
            return;
        }
        this.biH.remove(qQ.Sn());
    }

    public void k(qu_0 qu_02) {
        if (qu_02 == null) {
            return;
        }
        List<QQ> list = this.a((QQ qQ) -> qQ.bci() == qu_02);
        for (QQ qQ2 : list) {
            this.b(qQ2);
        }
    }

    public void l(qu_0 qu_02) {
        if (qu_02 == null) {
            return;
        }
        List<QQ> list = this.a((QQ qQ) -> qQ.bci() == qu_02 && qQ.bdb());
        for (QQ qQ2 : list) {
            this.b(qQ2);
        }
    }

    private List<QQ> a(Predicate<QQ> predicate) {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        this.biI.forEachValue(qQ -> {
            if (predicate.test((QQ)qQ)) {
                arrayList.add((QQ)qQ);
            }
            return true;
        });
        return arrayList;
    }

    public boolean d(QQ qQ) {
        return qQ != null && this.biI.containsKey(qQ.Sn());
    }

    public void bch() {
        for (QQ qQ : this.bde()) {
            qQ.aZp();
        }
        this.biI.clear();
        this.biH.clear();
    }

    public void a(int n, int n2, short s, int n3, int n4, short s2, qu_0 qu_02) {
        List<QQ> list = this.a((QQ qQ) -> qQ.d(n, n2, s));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.biI.forEachValue(qQ -> {
            if (qQ.a(qu_02, n3, n4, s2)) {
                if (!list.contains(qQ)) {
                    arrayList.add(qQ);
                } else {
                    arrayList3.add(qQ);
                }
            } else if (list.contains(qQ)) {
                arrayList2.add(qQ);
            }
            return true;
        });
        for (QQ qQ2 : arrayList) {
            qQ2.a(10001, null, (anu_1)qu_02);
        }
        for (QQ qQ2 : arrayList3) {
            qQ2.a(10008, null, (anu_1)qu_02);
        }
        for (QQ qQ2 : arrayList2) {
            qQ2.a(10002, null, (anu_1)qu_02);
        }
    }

    public boolean dq(long l) {
        return this.biI.contains(l);
    }

    public boolean e(QQ qQ) {
        return this.biI.containsKey(qQ.Sn());
    }

    public abstract QQ dr(long var1);
}


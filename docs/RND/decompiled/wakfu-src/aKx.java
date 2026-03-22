/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

class aKx<RE extends QD<enk_0, eNl>, EC extends eNl> {
    final /* synthetic */ aKv eeD;

    aKx(aKv aKv2) {
        this.eeD = aKv2;
    }

    protected boolean ciO() {
        return true;
    }

    protected boolean ciP() {
        return false;
    }

    protected RE a(enk_0 enk_02, qm_0 qm_02, qu_0 qu_02, qu_0 qu_03, acd_1 acd_12, List<eNl> list) {
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        QD<enk_0, eNl> qD = ero_02.bbo();
        eNl eNl2 = list.get(list.size() - 1);
        ero_0 ero_03 = this.a(list, qm_02, qu_02, qu_03, acd_12);
        enq_0 enq_02 = ero_03 instanceof eqc_0 ? ((eqc_0)ero_03).d(ero_03, true) : enq_0.a(true, false, ero_03);
        qD.g(ero_03);
        qD.a(enk_02, eNl2, qm_02, qu_02, qu_03, acd_12.getX(), acd_12.getY(), acd_12.bdi(), (qr_0)enq_02);
        return (RE)qD;
    }

    protected ero_0 a(List<eNl> list, qm_0 qm_02, qu_0 qu_02, qu_0 qu_03, acd_1 acd_12) {
        ero_0 ero_02;
        eNl eNl2 = list.get(list.size() - 1);
        LinkedList<eNl> linkedList = new LinkedList<eNl>(list);
        linkedList.remove(eNl2);
        if (eNl2 instanceof bmh_1) {
            bmh_1 bmh_12 = (bmh_1)eNl2;
            enk_0 enk_02 = bat_2.cZD().RN(bmh_12.giC());
            ero_02 = enk_02 != null ? (ero_0)this.a(enk_02, qm_02, qu_02, qu_03, acd_12, linkedList) : null;
        } else {
            ero_02 = null;
        }
        if (ero_02 instanceof eqc_0 && this.ciO()) {
            ero_02.E(null);
        }
        return ero_02;
    }

    protected boolean v(RE RE2) {
        return false;
    }

    protected boolean w(RE RE2) {
        return true;
    }

    protected aoh_1 a(enk_0 enk_02, List<eNl> list) {
        QQ<enk_0, etj_0> qQ;
        if (this.eeD.b(enk_02) && (qQ = eQN.a(enk_02, list.get(list.size() - 1))) != null) {
            return qQ.bcG();
        }
        return enk_02.aZS();
    }

    public void c(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        this.a(bgy2, acd_12, enk_02, s, list, list);
    }

    public void a(bgy object, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list, List<eNl> list2) {
        Object object2;
        bsj_0 bsj_02;
        Object object3;
        Object object4;
        if (enk_02.fAD()) {
            object4 = null;
            object3 = ((bgy)object).dkZ();
            object4 = (bgy)((bsj_0)object3).dy(acd_12.getX(), acd_12.getY());
            bsj_02 = this.a(enk_02, ((exP)object).fgg(), (qu_0)object, (qu_0)object4, acd_12, list2);
            if (this.v(bsj_02) && object4 != null) {
                object = object4;
            }
            if (((QD)((Object)bsj_02)).bbB()) {
                int n = acd_12.getX();
                int n2 = acd_12.getY();
                short s2 = acd_12.bdi();
                if (!this.w(bsj_02)) {
                    object4 = null;
                }
                if (object4 == null || enk_02.baa()) {
                    if (this.ciP()) {
                        object2 = this.eeD.eey.a(enk_02, (anu_1)object, ((ety_0)object3).bbh(), acd_12.getX(), acd_12.getY(), acd_12.bdi());
                        Iterator iterator = object2.iterator();
                        while (iterator.hasNext()) {
                            qu_0 qu_02 = (qu_0)iterator.next();
                            acd_12.Q(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
                            this.d((bgy)object, acd_12, enk_02, s, list);
                        }
                    } else {
                        this.d((bgy)object, acd_12, enk_02, s, list);
                    }
                } else {
                    acd_12.Q(((exP)object4).bcC(), ((exP)object4).bcD(), ((exP)object4).bcE());
                    this.d((bgy)object, acd_12, enk_02, s, list);
                }
                acd_12.Q(n, n2, s2);
            } else {
                this.d((bgy)object, acd_12, enk_02, s, list);
            }
            this.x(bsj_02);
        } else {
            this.d((bgy)object, acd_12, enk_02, s, list);
        }
        if (enk_02 instanceof eNB && (object3 = ((eNB)(object4 = (eNB)enk_02)).fBw()) instanceof eqc_0) {
            eqc_0 eqc_02;
            bsj_02 = ((bgy)object).dkZ();
            bgy bgy2 = (bgy)bsj_02.dy(acd_12.getX(), acd_12.getY());
            RE RE2 = this.a(enk_02, ((exP)object).fgg(), (qu_0)object, bgy2, acd_12, list2);
            if (this.v(RE2) && bgy2 != null) {
                object = bgy2;
            }
            if (RE2 instanceof eqc_0 && (eqc_02 = (eqc_0)RE2).fFg() && (object2 = eqc_02.fFf()) != null) {
                this.e((bgy)object, (acd_1)object2, enk_02, s, list);
            }
            this.x(RE2);
        }
    }

    protected void x(RE RE2) {
        LinkedHashSet<RE> linkedHashSet = new LinkedHashSet<RE>();
        linkedHashSet.add(RE2);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add((QD<?, ?>)RE2);
        while (!linkedHashSet2.isEmpty()) {
            Set<QD<?, ?>> set = this.b(linkedHashSet2);
            linkedHashSet2.clear();
            linkedHashSet2.addAll(set);
            linkedHashSet.addAll(set);
        }
        for (QD qD : linkedHashSet) {
            qD.aZp();
        }
    }

    @NotNull
    private Set<QD<?, ?>> b(Set<QD<?, ?>> set) {
        HashSet hashSet = new HashSet();
        for (QD<?, ?> qD : set) {
            ero_0 ero_02;
            Object object;
            qr_0 qr_02 = qD.bbg();
            if (qr_02 instanceof enq_0 && (object = (enq_0)qr_02) != null && (ero_02 = ((enq_0)object).fBh()) != null) {
                hashSet.add(ero_02);
            }
            if ((object = qD.bbm()) == null) continue;
            hashSet.add((QD<?, ?>)object);
        }
        return hashSet;
    }

    protected void d(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        abi_1 abi_12 = new acq_1(bgy2.aZw(), acd_12).bXb();
        if (abi_12 == abi_1.dzt) {
            abi_12 = bgy2.bcB();
        }
        Iterable<int[]> iterable = this.a(enk_02, list).b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), abi_12);
        rh_0 rh_02 = bgy2.dkZ().bag();
        for (int[] nArray : iterable) {
            int n;
            int n2 = nArray[0];
            if (!rh_02.T(n2, n = nArray[1])) continue;
            this.eeD.eev.E(n2, n, rh_02.Z(n2, n));
            if (this.eeD.eex == null) continue;
            this.eeD.eex.G(n2, n, rh_02.Z(n2, n));
        }
    }

    protected void e(bgy bgy2, acd_1 acd_12, enk_0 enk_02, short s, List<eNl> list) {
        abi_1 abi_12 = new acq_1(bgy2.aZw(), acd_12).bXb();
        if (abi_12 == abi_1.dzt) {
            abi_12 = bgy2.bcB();
        }
        Iterable<int[]> iterable = this.a(enk_02, list).b(acd_12.getX(), acd_12.getY(), acd_12.bdi(), bgy2.bcC(), bgy2.bcD(), bgy2.bcE(), abi_12);
        rh_0 rh_02 = bgy2.dkZ().bag();
        for (int[] nArray : iterable) {
            int n;
            int n2 = nArray[0];
            if (!rh_02.T(n2, n = nArray[1])) continue;
            this.eeD.eew.E(n2, n, rh_02.Z(n2, n));
            if (this.eeD.eex == null) continue;
            this.eeD.eex.G(n2, n, rh_02.Z(n2, n));
        }
    }
}


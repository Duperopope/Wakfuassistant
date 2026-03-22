/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.set.hash.TByteHashSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from eWb
 */
final class ewb_2 {
    private eub_0 rAH;
    private exP rAI;
    private fqE rAJ;
    private int rAK;
    private int rAL;
    private acd_1 bgG;
    private final Map<QQ, Set<fqH>> rAM = new HashMap<QQ, Set<fqH>>();
    private final Set<QQ> rAN = new HashSet<QQ>();
    private final Set<QQ> rAO = new HashSet<QQ>();

    ewb_2() {
    }

    void bot() {
        this.fNy();
        this.fNB();
    }

    private void fNy() {
        this.fNA();
        this.fNz();
    }

    private void fNz() {
        this.rAO.clear();
        Set<QQ> set = this.rAN;
        if (set.isEmpty()) {
            return;
        }
        this.rAO.addAll(this.fNC());
        if (set.size() == 1) {
            this.rAO.removeAll(set);
        }
    }

    private void fNA() {
        acd_1 acd_12 = this.rAI.aZw();
        this.rAN.clear();
        Set<QQ> set = this.fNC();
        for (QQ qQ : set) {
            int n = amf_1.c((amg_1)qQ, acd_12);
            if (n > this.rAL || n < this.rAK || !this.i(this.rAI.aZw(), qQ.aZw()) || !this.j(qQ.aZw(), acd_12)) continue;
            this.rAN.add(qQ);
        }
    }

    private void fNB() {
        this.rAM.clear();
        Set<QQ> set = this.rAO;
        if (set.isEmpty()) {
            return;
        }
        for (QQ qQ : set) {
            acd_1 acd_12 = qQ.aZw();
            HashSet<fqH> hashSet = new HashSet<fqH>();
            int n = acd_12.cH(this.bgG.getX(), this.bgG.getY());
            if (((fqD)this.rAJ.giP()).g(fqS.sWp)) {
                if (n > 0) {
                    hashSet.add(fqH.sUX);
                }
            } else {
                if (!this.j(this.bgG, acd_12)) {
                    hashSet.add(fqH.sVj);
                }
                if (!ewb_2.al(this.rAK, this.rAL, n)) {
                    hashSet.add(fqH.sUX);
                }
                if (!this.i(qQ.aZw(), this.bgG)) {
                    hashSet.add(fqH.sUV);
                }
            }
            this.rAM.put(qQ, hashSet);
        }
    }

    private Set<QQ> fNC() {
        HashSet<QQ> hashSet = new HashSet<QQ>();
        for (QQ qQ : this.rAH.bai().bdh()) {
            TByteHashSet tByteHashSet;
            if (qQ == null || qQ.aeV() != etm_0.rnG.aHp() || qQ.bcP() != this.rAI.bcP() || (tByteHashSet = this.rAH.bag().W(qQ.bcC(), qQ.bcD())) != null && !tByteHashSet.isEmpty()) continue;
            hashSet.add(qQ);
        }
        return hashSet;
    }

    private static boolean al(int n, int n2, int n3) {
        return n3 <= n2 && n3 >= n;
    }

    private boolean i(acd_1 acd_12, acd_1 acd_13) {
        boolean bl = ((fqD)this.rAJ.giP()).a(this.rAJ, (Object)this.rAI, (Object)null, (Object)this.rAH.bbh());
        if (!bl) {
            return true;
        }
        return eUo.a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), this.rAI.bcN(), acd_13.getX(), acd_13.getY(), acd_13.bdi(), this.rAH.bag());
    }

    private boolean j(acd_1 acd_12, acd_1 acd_13) {
        boolean bl = ((fqD)this.rAJ.giP()).b(this.rAJ, (Object)this.rAI, (Object)acd_12, (Object)this.rAH.bbh());
        if (!bl) {
            return true;
        }
        return ewb_2.k(acd_12, acd_13);
    }

    private static boolean k(acd_1 acd_12, acd_1 acd_13) {
        return acd_13.getX() == acd_12.getX() || acd_13.getY() == acd_12.getY();
    }

    void a(Collection<QQ> collection, Map<QQ, Set<fqH>> map) {
        collection.addAll(this.rAN);
        map.putAll(this.rAM);
    }

    void a(eub_0 eub_02, exP exP2, fqE fqE2, int n, int n2, acd_1 acd_12) {
        this.rAH = eub_02;
        this.rAI = exP2;
        this.rAJ = fqE2;
        this.rAK = n;
        this.rAL = n2;
        this.bgG = acd_12;
    }

    void fND() {
        this.rAH = null;
        this.rAI = null;
        this.rAJ = null;
        this.rAK = 0;
        this.rAL = 0;
        this.bgG = null;
    }
}


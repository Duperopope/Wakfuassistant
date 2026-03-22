/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.apache.log4j.Logger;

public final class eJN {
    private static final Logger qAE = Logger.getLogger(eJN.class);
    public static final eJN qAF = new eJN();
    private final TLongObjectHashMap<TLongObjectHashMap<eJS>> qAG = new TLongObjectHashMap();
    private final TLongObjectHashMap<eJS> qAH = new TLongObjectHashMap();
    private final Set<Integer> qAI = new HashSet<Integer>();
    private final List<eJR> qAJ = new ArrayList<eJR>();

    private eJN() {
    }

    public void a(long l, eJS eJS2) {
        if (eJS2.Xi() != l) {
            throw new IllegalArgumentException("le companion " + String.valueOf(eJS2) + " doit avoir le bon ownerId : " + l);
        }
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            tLongObjectHashMap = new TLongObjectHashMap();
            this.qAG.put(l, (Object)tLongObjectHashMap);
        }
        tLongObjectHashMap.put(eJS2.Sn(), (Object)eJS2);
        this.qAH.put(eJS2.Sn(), (Object)eJS2);
        this.s(eJS2);
    }

    public List<eJS> pP(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<eJS> arrayList = new ArrayList<eJS>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eJO(this, arrayList));
        return arrayList;
    }

    public TLongObjectHashMap<eJS> pQ(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            return new TLongObjectHashMap();
        }
        return tLongObjectHashMap;
    }

    public eJS O(long l, long l2) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (eJS)tLongObjectHashMap.get(l2);
    }

    public eJS pR(long l) {
        return (eJS)this.qAH.get(l);
    }

    public eJS T(long l, int n) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            eJS eJS2 = (eJS)tLongObjectIterator.value();
            if (eJS2.aWP() != n) continue;
            return eJS2;
        }
        return null;
    }

    public boolean U(long l, int n) {
        eJS eJS2 = this.T(l, n);
        return eJS2 != null && eJS2.efO();
    }

    public void pS(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.remove(l);
        if (tLongObjectHashMap != null) {
            TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                this.qAH.remove(tLongObjectIterator.key());
            }
        }
    }

    public boolean P(long l, long l2) {
        boolean bl;
        this.qAH.remove(l2);
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            return false;
        }
        eJS eJS2 = (eJS)tLongObjectHashMap.remove(l2);
        boolean bl2 = bl = eJS2 != null;
        if (bl) {
            this.r(eJS2);
        }
        return bl;
    }

    public List<eJS> pT(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.qAG.get(l);
        if (tLongObjectHashMap == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<eJS> arrayList = new ArrayList<eJS>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eJP(this, arrayList));
        return arrayList;
    }

    public void Qf(int n) {
        this.qAI.add(n);
    }

    public void Qg(int n) {
        this.qAI.remove(n);
    }

    public boolean Qh(int n) {
        return this.qAI.contains(n);
    }

    private void r(eJS eJS2) {
        for (eJR eJR2 : this.qAJ) {
            try {
                eJR2.b(eJS2);
            }
            catch (Exception exception) {
                qAE.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void s(eJS eJS2) {
        for (eJR eJR2 : this.qAJ) {
            try {
                eJR2.c(eJS2);
            }
            catch (Exception exception) {
                qAE.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void a(eJR eJR2) {
        if (!this.qAJ.contains(eJR2)) {
            return;
        }
        this.qAJ.remove(eJR2);
    }

    public void b(eJR eJR2) {
        if (this.qAJ.contains(eJR2)) {
            return;
        }
        this.qAJ.add(eJR2);
    }

    public eJS Q(long l, long l2) {
        List<eJS> list = this.pP(l);
        for (eJS eJS2 : list) {
            if (!eJS2.dme().dM(l2)) continue;
            return eJS2;
        }
        return null;
    }

    public Optional<eJS> V(long l, int n) {
        List<eJS> list = this.pP(l);
        for (eJS eJS2 : list) {
            if (!eJS2.dme().pb(n)) continue;
            return Optional.of(eJS2);
        }
        return Optional.empty();
    }
}


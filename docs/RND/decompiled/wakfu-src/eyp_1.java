/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eYp
 */
public final class eyp_1
implements eyt_1 {
    private static final Logger rJE = Logger.getLogger(eyp_1.class);
    private final long rJF;
    private long ppn = -1L;
    private final TLongObjectHashMap<exz_1> rJG = new TLongObjectHashMap();
    private final List<eyu_1> rJH = new ArrayList<eyu_1>();

    public eyp_1(long l) {
        this.rJF = l;
    }

    @Override
    public long fmo() {
        return this.ppn;
    }

    @Override
    public void ps(long l) {
        long l2 = this.ppn;
        this.ppn = l;
        this.U(l2, this.ppn);
    }

    @Override
    public boolean d(exz_1 exz_12) {
        return exz_12 != null && this.ppn == exz_12.KU();
    }

    @Override
    public long Sn() {
        return this.rJF;
    }

    @Override
    public void e(exz_1 exz_12) {
        exz_12.da(this.rJF);
        this.rJG.put(exz_12.KU(), (Object)exz_12);
        this.h(exz_12);
    }

    @Override
    public boolean ru(long l) {
        exz_1 exz_12 = (exz_1)this.rJG.get(l);
        return exz_12 != null && this.a(exz_12, false, false);
    }

    @Override
    public boolean a(exz_1 exz_12, boolean bl, boolean bl2) {
        if (!this.rJG.contains(exz_12.KU())) {
            return false;
        }
        try {
            if (bl) {
                this.rJG.remove(exz_12.KU());
                this.a(exz_12, bl2);
                exz_12.af(Ve.fs(this.rJF));
                return true;
            }
            if (this.f(exz_12) && this.rJG.remove(exz_12.KU()) != null) {
                this.a(exz_12, bl2);
                exz_12.af(Ve.fs(this.rJF));
                return true;
            }
            return false;
        }
        catch (Exception exception) {
            rJE.error((Object)"Exception levee", (Throwable)exception);
            return false;
        }
    }

    @Override
    public boolean f(exz_1 exz_12) {
        return exz_12.aXa() == this.rJF && this.rJG.containsKey(exz_12.KU());
    }

    @Override
    public void fPE() {
        Object[] objectArray = new exz_1[this.rJG.size()];
        this.rJG.values(objectArray);
        for (int i = 0; i < objectArray.length; ++i) {
            Object object = objectArray[i];
            this.a((exz_1)object, true, false);
        }
        this.rJG.clear();
    }

    public int fPF() {
        return this.rJG.size();
    }

    @Override
    public TLongObjectHashMap<exz_1> fPG() {
        return this.rJG;
    }

    @Override
    public TLongObjectHashMap<exz_1> Tj(int n) {
        TLongObjectHashMap tLongObjectHashMap = new TLongObjectHashMap();
        this.rJG.forEachEntry((TLongObjectProcedure)new eyr_1(n, (TLongObjectHashMap<exz_1>)tLongObjectHashMap));
        return tLongObjectHashMap;
    }

    @Override
    public List<exz_1> g(exz_1 exz_12) {
        long l = exz_12.aZj();
        return this.pP(l);
    }

    @Override
    public List<exz_1> pP(long l) {
        TLongObjectHashMap<exz_1> tLongObjectHashMap = this.Tj(2);
        if (tLongObjectHashMap.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<exz_1> arrayList = new ArrayList<exz_1>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eyq_1(l, arrayList));
        return arrayList;
    }

    @Override
    public List<exz_1> rv(long l) {
        TLongObjectHashMap<exz_1> tLongObjectHashMap = this.rJG;
        if (tLongObjectHashMap.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<exz_1> arrayList = new ArrayList<exz_1>();
        tLongObjectHashMap.forEachValue((TObjectProcedure)new eyq_1(l, arrayList));
        return arrayList;
    }

    @Override
    public int fPH() {
        return this.rJG.size() - this.Tj(2).size();
    }

    @Override
    public boolean hC(String string) {
        TLongObjectIterator tLongObjectIterator = this.rJG.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exz_1 exz_12 = (exz_1)tLongObjectIterator.value();
            if (!exz_12.getName().equals(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public exz_1 rw(long l) {
        return (exz_1)this.rJG.get(l);
    }

    @Override
    public boolean fa(long l) {
        return this.rJG.contains(l);
    }

    @Override
    public boolean aJG() {
        return this.rJG.isEmpty();
    }

    @Override
    public boolean isFull() {
        return this.rJG.size() >= ewo_0.oBF.i(ewr_0.oEz);
    }

    @Override
    public void a(eyu_1 eyu_12) {
        if (this.rJH.contains(eyu_12)) {
            return;
        }
        this.rJH.add(eyu_12);
    }

    @Override
    public void b(eyu_1 eyu_12) {
        this.rJH.remove(eyu_12);
    }

    private void U(long l, long l2) {
        ArrayList<eyu_1> arrayList = new ArrayList<eyu_1>(this.rJH);
        for (eyu_1 eyu_12 : arrayList) {
            try {
                eyu_12.a((eyt_1)this, l, l2);
            }
            catch (Exception exception) {
                rJE.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void h(exz_1 exz_12) {
        ArrayList<eyu_1> arrayList = new ArrayList<eyu_1>(this.rJH);
        for (eyu_1 eyu_12 : arrayList) {
            try {
                eyu_12.a(this, exz_12);
            }
            catch (Exception exception) {
                rJE.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    private void a(exz_1 exz_12, boolean bl) {
        ArrayList<eyu_1> arrayList = new ArrayList<eyu_1>(this.rJH);
        for (eyu_1 eyu_12 : arrayList) {
            try {
                eyu_12.a((eyt_1)this, exz_12, bl);
            }
            catch (Exception exception) {
                rJE.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public String toString() {
        return "PartyModel{m_id=" + this.rJF + ", m_leaderId=" + this.ppn + ", m_members=" + String.valueOf(this.rJG) + ", m_listeners=" + String.valueOf(this.rJH) + "}";
    }
}


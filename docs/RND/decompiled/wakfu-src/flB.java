/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TLongObjectProcedure
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TLongObjectProcedure;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.List;

public class flB {
    private static final TLongHashSet sFE = new TLongHashSet();
    private final TLongObjectProcedure<flv_0> sFF = new flC(this);
    private final TLongProcedure sFG = new flD(this);
    protected fjo_0 laU;
    private List<fkB> sFH;
    protected final TLongObjectHashMap<flv_0> sFI = new TLongObjectHashMap();
    protected final TIntObjectHashMap<TLongHashSet> sFJ = new TIntObjectHashMap();
    protected final TLongHashSet sFK = new TLongHashSet();
    private boolean sFL = false;

    public void b(flv_0 flv_02) {
        long l = flv_02.Sn();
        if (this.sFI.containsKey(l)) {
            return;
        }
        this.sFI.put(l, (Object)flv_02);
        int n = flv_02.gdh().sFC.ordinal();
        TLongHashSet tLongHashSet = (TLongHashSet)this.sFJ.get(n);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.sFJ.put(n, (Object)tLongHashSet);
        }
        tLongHashSet.add(l);
        if (flv_02.bfb()) {
            this.sFK.add(l);
        }
    }

    public void gcr() {
        this.sFL = true;
    }

    public boolean gdo() {
        return this.sFL;
    }

    public boolean gdp() {
        boolean bl = this.sFL;
        this.sFL = false;
        return bl;
    }

    public void b(flx_0 flx_02) {
        throw new UnsupportedOperationException();
    }

    public ArrayList<flv_0> c(flx_0 flx_02) {
        ArrayList<flv_0> arrayList = new ArrayList<flv_0>();
        TLongHashSet tLongHashSet = (TLongHashSet)this.sFJ.get(flx_02.gdl().ordinal());
        if (tLongHashSet == null) {
            return arrayList;
        }
        for (long l : tLongHashSet) {
            flv_0 flv_02;
            if (!this.sFK.contains(l) || !this.a(flv_02 = (flv_0)this.sFI.get(l), flx_02) || !flv_02.a(flx_02)) continue;
            arrayList.add(flv_02);
        }
        return arrayList;
    }

    protected boolean a(flv_0 flv_02, flx_0 flx_02) {
        exP exP2 = (exP)flx_02.elp();
        int n = exP2.ffF().Xt();
        boolean bl = exP2.ffM() == n;
        fku_0 fku_02 = exP2.ffF().ems().gbD();
        fkc_0 fkc_02 = fku_02.WO(exP2.ffM());
        switch (fkc_02) {
            case sAo: {
                return flv_02.csZ();
            }
            case sAp: {
                return bl ? flv_02.csX() : flv_02.csY();
            }
        }
        throw new UnsupportedOperationException("Type d'alignement non reconnu " + String.valueOf(fkc_02));
    }

    public TLongObjectIterator<flv_0> gdq() {
        return this.sFI.iterator();
    }

    public int um(long l) {
        return ((flv_0)this.sFI.get(l)).csT();
    }

    public int un(long l) {
        return ((flv_0)this.sFI.get(l)).csU();
    }

    public boolean uo(long l) {
        return this.sFK.contains(l);
    }

    public void gdr() {
        this.d(sFE);
    }

    public void gds() {
        this.d(sFE);
    }

    public void d(TLongHashSet tLongHashSet) {
        this.sFK.clear();
        this.sFI.forEachEntry(this.sFF);
        tLongHashSet.forEach(this.sFG);
        if (this.laU != null && this.sFH != null) {
            for (int i = 0; i < this.sFH.size(); ++i) {
                this.sFH.get(i).f(this.laU);
            }
        }
    }

    public void a(fjo_0 fjo_02, List<fkB> list) {
        this.laU = fjo_02;
        this.sFH = list;
    }

    public int e(TLongHashSet tLongHashSet) {
        int n = 0;
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            n += ((flv_0)this.sFI.get(tLongIterator.next())).csV();
        }
        return n;
    }

    public void a(wo_2 wo_22) {
        wo_22.ahj = this.sFL;
        TLongIterator tLongIterator = this.sFK.iterator();
        while (tLongIterator.hasNext()) {
            wp_1 wp_12 = new wp_1();
            wp_12.ahl = tLongIterator.next();
            wo_22.ahk.add(wp_12);
        }
    }

    public void b(wo_2 wo_22) {
        this.sFL = wo_22.ahj;
        TLongHashSet tLongHashSet = new TLongHashSet();
        int n = wo_22.ahk.size();
        for (int i = 0; i < n; ++i) {
            tLongHashSet.add(wo_22.ahk.get((int)i).ahl);
        }
        this.d(tLongHashSet);
    }
}


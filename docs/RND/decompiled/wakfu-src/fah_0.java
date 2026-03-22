/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from faH
 */
public class fah_0
implements faz_0 {
    private faa_0 lFx;
    private final TLongObjectHashMap<fas_0> rPP = new TLongObjectHashMap();
    private final TIntObjectHashMap<fao_0> rPQ = new TIntObjectHashMap();
    private final List<faf_0> rPR = new ArrayList<faf_0>();

    fah_0(faa_0 faa_02) {
        this.lFx = faa_02;
    }

    @Override
    public long Ya() {
        if (this.lFx == null) {
            return 0L;
        }
        return this.lFx.Ya();
    }

    @Override
    public long aqZ() {
        if (this.lFx == null) {
            return 0L;
        }
        return this.lFx.aqZ();
    }

    @Override
    public faa_0 eqJ() {
        return this.lFx;
    }

    @Override
    public fas_0 oM(long l) {
        return (fas_0)this.rPP.get(l);
    }

    @Override
    public boolean O(TObjectProcedure<fas_0> tObjectProcedure) {
        return this.rPP.forEachValue(tObjectProcedure);
    }

    @Override
    public int fRn() {
        fcu fcu2 = new fcu();
        this.O(fcu2);
        return fcu2.fSz();
    }

    @Override
    public int fRo() {
        fcu fcu2 = new fcu();
        this.O(fcu2);
        return fcu2.fSy();
    }

    @Override
    public int eB(short s) {
        fce_0 fce_02 = new fce_0(s);
        this.O(fce_02);
        return fce_02.eEl();
    }

    @Override
    public int TN(int n) {
        fcg_0 fcg_02 = new fcg_0(n);
        this.O(fcg_02);
        return fcg_02.eEl();
    }

    @Override
    public void a(faa_0 faa_02) {
        this.lFx = faa_02;
        this.fRr();
    }

    @Override
    public int eAn() {
        return this.lFx == null ? 0 : this.lFx.eAn();
    }

    @Override
    public String HR() {
        return this.lFx == null ? "" : this.lFx.HR();
    }

    @Override
    public fao_0 Y(short s, short s2) {
        return (fao_0)this.rPQ.get(GC.d(s, s2));
    }

    @Override
    public boolean P(TObjectProcedure<fao_0> tObjectProcedure) {
        return this.rPQ.forEachValue(tObjectProcedure);
    }

    @Override
    public int fRp() {
        return 250000;
    }

    @Override
    public TLongObjectHashMap<fas_0> fRq() {
        return this.rPP;
    }

    @Override
    public long HP() {
        return this.lFx == null ? 0L : this.lFx.HP();
    }

    @Override
    public boolean dLd() {
        return this.lFx == null || this.lFx.dLd();
    }

    public void d(fas_0 fas_02) {
        this.rPP.put(fas_02.Lx(), (Object)fas_02);
        this.g(fas_02);
    }

    void rQ(long l) {
        fas_0 fas_02 = (fas_0)this.rPP.remove(l);
        this.h(fas_02);
    }

    void b(fao_0 fao_02) {
        int n = GC.d(fao_02.bsM(), fao_02.bsN());
        this.rPQ.put(n, (Object)fao_02);
        this.f(fao_02);
    }

    void e(fao_0 fao_02) {
        this.f(fao_02);
    }

    private void fRr() {
        for (int i = 0; i < this.rPR.size(); ++i) {
            this.rPR.get(i).e(this.lFx);
        }
    }

    private void fRs() {
        if (this.lFx == null) {
            return;
        }
        for (int i = 0; i < this.rPR.size(); ++i) {
            this.rPR.get(i).Jb(this.lFx.eAn());
        }
    }

    private void g(fas_0 fas_02) {
        for (int i = 0; i < this.rPR.size(); ++i) {
            this.rPR.get(i).e(fas_02);
        }
    }

    private void h(fas_0 fas_02) {
        for (int i = 0; i < this.rPR.size(); ++i) {
            this.rPR.get(i).f(fas_02);
        }
    }

    private void f(fao_0 fao_02) {
        for (int i = 0; i < this.rPR.size(); ++i) {
            this.rPR.get(i).c(fao_02);
        }
    }

    @Override
    public boolean a(faf_0 faf_02) {
        return !this.rPR.contains(faf_02) && this.rPR.add(faf_02);
    }

    @Override
    public boolean b(faf_0 faf_02) {
        return this.rPR.remove(faf_02);
    }

    @Override
    public void dQY() {
        this.rPR.clear();
    }

    public String toString() {
        return "HavenWorldModel{m_basicInfo=" + String.valueOf(this.lFx) + ", m_buildings=" + String.valueOf(this.rPP) + ", m_partitions=" + String.valueOf(this.rPQ) + ", m_listeners=" + String.valueOf(this.rPR) + "}";
    }
}


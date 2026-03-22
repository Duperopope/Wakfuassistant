/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from bbL
 */
public class bbl_0 {
    private static final Logger hBq = Logger.getLogger(bbl_0.class);
    public static final bbl_0 hBr = new bbl_0();
    final TIntObjectHashMap<bbf_0> hBs = new TIntObjectHashMap();
    final TIntObjectHashMap<bbf_0> hBt = new TIntObjectHashMap();
    private final TIntObjectHashMap<bbo_0> hBu = new TIntObjectHashMap();
    private final TIntArrayList hBv = new TIntArrayList();
    private final TIntArrayList hBw = new TIntArrayList();

    private bbl_0() {
        for (VI vI : VI.values()) {
            bbo_0 bbo_02 = new bbo_0(vI.d(), vI.bkG());
            this.hBu.put(bbo_02.d(), (Object)bbo_02);
        }
    }

    public void b(ame_0 ame_02) {
        this.hBs.put(ame_02.d(), (Object)bbl_0.d(ame_02));
        this.hBv.add(ame_02.d());
    }

    public void c(ame_0 ame_02) {
        this.hBt.put(ame_02.d(), (Object)bbl_0.d(ame_02));
        this.hBw.add(ame_02.d());
    }

    private static bbf_0 d(ame_0 ame_02) {
        ang_2 ang_22 = bbl_0.e(ame_02);
        return new bbf_0(ame_02.d(), ame_02.cnd(), ame_02.cne(), ame_02.cnf(), ame_02.cnc(), ame_02.cng(), ang_22);
    }

    private static ang_2 e(ame_0 ame_02) {
        try {
            return ehu_0.rY(ame_02.clB());
        }
        catch (Exception exception) {
            hBq.error((Object)("Error when compiling the emote " + ame_02.d() + " criterion"), (Throwable)exception);
            return null;
        }
    }

    public bbi_0 AF(int n) {
        bbf_0 bbf_02 = this.AH(n);
        return bbf_02 != null ? bbf_02 : this.AG(n);
    }

    public bbo_0 AG(int n) {
        return (bbo_0)this.hBu.get(n);
    }

    public bbf_0 AH(int n) {
        if (this.hBt.contains(n)) {
            return (bbf_0)this.hBt.get(n);
        }
        if (this.hBs.contains(n)) {
            return (bbf_0)this.hBs.get(n);
        }
        return null;
    }

    public bbf_0 c(aUf aUf2) {
        TIntObjectIterator tIntObjectIterator = this.hBt.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!aUf2.cUp().matcher(((bbf_0)tIntObjectIterator.value()).hBg).matches()) continue;
            return (bbf_0)tIntObjectIterator.value();
        }
        tIntObjectIterator = this.hBs.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!aUf2.cUp().matcher(((bbf_0)tIntObjectIterator.value()).hBg).matches()) continue;
            return (bbf_0)tIntObjectIterator.value();
        }
        return null;
    }

    public bbf_0 lm(String string) {
        if (string == null) {
            return null;
        }
        TIntObjectIterator tIntObjectIterator = this.hBt.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!string.equalsIgnoreCase(((bbf_0)tIntObjectIterator.value()).hBg)) continue;
            return (bbf_0)tIntObjectIterator.value();
        }
        tIntObjectIterator = this.hBs.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            if (!string.equalsIgnoreCase(((bbf_0)tIntObjectIterator.value()).hBg)) continue;
            return (bbf_0)tIntObjectIterator.value();
        }
        return null;
    }

    public List<bbf_0> ln(String string) {
        String string2 = BH.aT(string);
        ArrayList<bbf_0> arrayList = new ArrayList<bbf_0>();
        this.hBv.forEach((TIntProcedure)new bbm_0(this, string2, string, arrayList));
        return arrayList;
    }

    public List<bbf_0> lo(String string) {
        String string2 = BH.aT(string);
        ArrayList<bbf_0> arrayList = new ArrayList<bbf_0>();
        this.hBw.forEach((TIntProcedure)new bbn_0(this, string2, arrayList));
        return arrayList;
    }
}


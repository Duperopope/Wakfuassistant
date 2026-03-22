/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.google.common.collect.ImmutableList;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from frB
 */
public class frb_0 {
    public static final frb_0 sYO = new frb_0();
    private final Set<Integer> sYP = new HashSet<Integer>();
    private final TLongObjectHashMap<frn_0> sYQ = new TLongObjectHashMap();
    private final TLongObjectHashMap<fro_0> sYR = new TLongObjectHashMap();
    private final TLongObjectHashMap<frm_0> sYS = new TLongObjectHashMap();
    private final TLongObjectHashMap<frj_0> sYT = new TLongObjectHashMap();
    private final TLongObjectHashMap<frf_0> sYU = new TLongObjectHashMap();
    private final TLongObjectHashMap<frg_0> sYV = new TLongObjectHashMap();
    private final TLongObjectHashMap<frh_0> sYW = new TLongObjectHashMap();

    public <Info extends frk_0> Info a(fre_0 fre_02, long l) {
        switch (fre_02) {
            case sYZ: {
                return (Info)((frk_0)this.sYQ.get(l));
            }
            case sZa: {
                return (Info)((frk_0)this.sYT.get(l));
            }
            case sZc: {
                return (Info)((frk_0)this.sYU.get(l));
            }
            case sZb: {
                return (Info)((frk_0)this.sYW.get(l));
            }
        }
        throw new IllegalArgumentException("Type de transport inconnu " + String.valueOf(fre_02));
    }

    public void a(frh_0 frh_02) {
        this.sYW.put(frh_02.Sn(), (Object)frh_02);
    }

    public void a(frf_0 frf_02) {
        this.sYU.put(frf_02.Sn(), (Object)frf_02);
    }

    public frg_0 b(frg_0 frg_02) {
        if (!this.sYU.containsKey((long)frg_02.gkn()) || !this.sYU.containsKey((long)frg_02.gko())) {
            throw new IllegalArgumentException("We can't add a link between boats if they don't exist, start : " + frg_02.gkn() + ", end : " + frg_02.gko());
        }
        this.sYV.put(frg_02.Sn(), (Object)frg_02);
        return frg_02;
    }

    public @Unmodifiable List<frg_0> aM(long l, long l2) {
        return this.sYV.valueCollection().stream().filter(frg_02 -> {
            int n = frg_02.gkn();
            int n2 = frg_02.gko();
            if ((long)n == l && (long)n2 == l2) {
                return true;
            }
            return (long)n == l2 && (long)n2 == l;
        }).toList();
    }

    public frg_0 uH(long l) {
        return (frg_0)this.sYV.get(l);
    }

    public void ab(TObjectProcedure<frg_0> tObjectProcedure) {
        this.sYV.forEachValue(tObjectProcedure);
    }

    public void a(frj_0 frj_02) {
        this.sYT.put(frj_02.Sn(), (Object)frj_02);
    }

    public frj_0 uI(long l) {
        return (frj_0)this.sYT.get(l);
    }

    public fro_0 aN(long l, long l2) {
        TLongObjectIterator tLongObjectIterator = this.sYR.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            fro_0 fro_02 = (fro_0)tLongObjectIterator.value();
            int n = fro_02.gkt();
            int n2 = fro_02.gku();
            if (((long)n != l || (long)n2 != l2) && ((long)n != l2 || (long)n2 != l)) continue;
            return fro_02;
        }
        throw new IllegalArgumentException("Impossible de trouver un lien entre les zaaps " + l + " et " + l2);
    }

    public void a(frn_0 frn_02, boolean bl) {
        this.sYQ.put(frn_02.Sn(), (Object)frn_02);
        if (bl) {
            this.sYP.add((int)frn_02.Sn());
        }
    }

    public void a(fro_0 fro_02) {
        if (!this.sYQ.containsKey((long)fro_02.gkt()) || !this.sYQ.containsKey((long)fro_02.gku())) {
            throw new IllegalArgumentException("Impossible de rajouter un liens entre deux zaaps si ces zaaps n'existent pas");
        }
        this.sYR.put(fro_02.Sn(), (Object)fro_02);
    }

    public void a(frm_0 frm_02) {
        this.sYS.put((long)frm_02.d(), (Object)frm_02);
    }

    public void a(frn_0 frn_02) {
        frm_0 frm_02 = (frm_0)this.sYS.get((long)frn_02.gks());
        if (frm_02 == null) {
            throw new IllegalArgumentException("Impossible de trouver la categorie " + frn_02.gks() + " pour le zaap " + frn_02.Sn());
        }
        frm_02.gkr().add(frn_02);
    }

    public List<frm_0> gkj() {
        return ImmutableList.copyOf((Object[])((frm_0[])this.sYS.values((Object[])new frm_0[this.sYS.size()])));
    }

    public frm_0 uJ(long l) {
        return (frm_0)this.sYS.get(l);
    }

    public void gkk() {
        TLongObjectIterator tLongObjectIterator = this.sYQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            TLongObjectIterator tLongObjectIterator2 = this.sYQ.iterator();
            while (tLongObjectIterator2.hasNext()) {
                tLongObjectIterator2.advance();
                if (tLongObjectIterator.key() == tLongObjectIterator2.key() || this.aN(tLongObjectIterator.key(), tLongObjectIterator2.key()) != null) continue;
                throw new IllegalArgumentException("Impossible de trouver un lien entre les zaaps " + tLongObjectIterator.key() + " et " + tLongObjectIterator2.key());
            }
        }
    }

    public Set<Integer> gkl() {
        return this.sYP;
    }
}


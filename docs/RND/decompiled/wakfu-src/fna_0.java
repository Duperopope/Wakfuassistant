/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteLongHashMap
 *  gnu.trove.procedure.TByteLongProcedure
 */
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.procedure.TByteLongProcedure;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from fna
 */
public class fna_0 {
    private final fjo_0 sHD;
    private fjs_0 sHE;
    private final TByteLongHashMap sHF = new TByteLongHashMap();
    private final TByteLongHashMap sHG = new TByteLongHashMap();
    private final Map<Integer, Integer> sHH = new HashMap<Integer, Integer>();

    fna_0(fjo_0 fjo_02) {
        this.sHD = fjo_02;
    }

    public void a(fjs_0 fjs_02) {
        this.sHE = fjs_02;
    }

    void J(int n, long l) {
        this.sHH.put(n, Math.min(1000000000, GC.cw(l)));
    }

    void Xa(int n) {
        this.sHH.remove(n);
    }

    void a(foZ foZ2, long l) {
        this.sHF.adjustOrPutValue(foZ2.aZv(), l, l);
        if (this.sHE != null) {
            this.sHE.a(this.sHD, foZ2.aZv(), l);
        }
    }

    void b(frk frk2, int n) {
        this.sHG.adjustOrPutValue(frk2.sXI, (long)n, (long)n);
        if (this.sHE != null) {
            this.sHE.a(this.sHD, frk2, (long)n);
        }
    }

    public void clear() {
        this.sHF.clear();
        this.sHG.clear();
        this.sHH.clear();
    }

    public void a(wi_2 wi_22, Boolean bl) {
        this.sHF.forEachEntry((TByteLongProcedure)new fnc_0(wi_22));
        this.sHG.forEachEntry((TByteLongProcedure)new fnb_0(wi_22));
        if (bl.booleanValue()) {
            wi_22.agY = new wl_2();
            wi_22.agY.abq = this.eCG();
        }
    }

    public void b(wi_2 wi_22) {
        gs_0 gs_02;
        int n;
        int n2 = wi_22.agW.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wi_22.agW.get(n);
            this.sHF.put(gs_02.ahb, (long)gs_02.adL);
        }
        n2 = wi_22.agX.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wi_22.agX.get(n);
            this.sHG.put(((wj_2)gs_02).agZ, (long)((wj_2)gs_02).adL);
        }
    }

    public TByteLongHashMap gdN() {
        return this.sHF;
    }

    public TByteLongHashMap gdO() {
        return this.sHG;
    }

    public int eCG() {
        int n = 0;
        for (int n2 : this.sHH.values()) {
            if ((n = GC.cw((long)n + (long)n2)) < 1000000000) continue;
            return 1000000000;
        }
        return n;
    }
}


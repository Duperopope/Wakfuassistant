/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from fku
 */
public class fku_0 {
    protected static final Logger sBM = Logger.getLogger(fku_0.class);
    protected final fjo_0 sBN;
    protected fkt_0 sBO;
    private final TIntObjectHashMap<fkv_0> sBP = new TIntObjectHashMap();
    private final TIntObjectHashMap<fkc_0> sBQ = new TIntObjectHashMap();

    public fku_0(fjo_0 fjo_02) {
        this.sBN = fjo_02;
    }

    public void a(fkt_0 fkt_02) {
        this.sBO = fkt_02;
    }

    protected void a(int n, fkc_0 fkc_02) {
        this.sBQ.put(n, (Object)fkc_02);
    }

    protected void WM(int n) {
        this.sBQ.remove(n);
    }

    public void gcm() {
        this.sBQ.clear();
    }

    public fkc_0 WN(int n) {
        return (fkc_0)this.sBQ.get(n);
    }

    public fkc_0 WO(int n) {
        return this.WP((int)n).sBR;
    }

    protected void b(int n, fkc_0 fkc_02) {
        this.WP((int)n).sBR = fkc_02;
    }

    private fkv_0 WP(int n) {
        fjo_0 fjo_02 = fjt.syH.WG(n);
        fkv_0 fkv_02 = (fkv_0)this.sBP.get(n);
        if (fkv_02 != null) {
            return fkv_02;
        }
        if (fjo_02 != null) {
            fkv_02 = (fkv_0)fjo_02.gbD().sBP.get(this.sBN.Xt());
            this.sBP.put(n, (Object)fkv_02);
        }
        if (fkv_02 != null) {
            return fkv_02;
        }
        fkv_02 = new fkv_0(this.sBN.Xt() != n && n != 0 && this.sBN.Xt() != 0 ? fkc_0.sAo : fkc_0.sAp);
        this.sBP.put(n, (Object)fkv_02);
        return fkv_02;
    }

    public void clear() {
        this.sBP.clear();
        this.sBQ.clear();
    }

    private void gcn() {
        if (this.sBO != null) {
            this.sBO.gcl();
        }
    }

    public void a(wf_1 wf_12) {
        gs_0 gs_02;
        TIntObjectIterator tIntObjectIterator = this.sBP.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            gs_02 = new wg_1();
            gs_02.Vu = tIntObjectIterator.key();
            gs_02.agT = ((fkv_0)tIntObjectIterator.value()).sBR.aJr();
            wf_12.agR.add((wg_1)gs_02);
        }
        tIntObjectIterator = this.sBQ.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            gs_02 = new wh_2();
            ((wh_2)gs_02).Vu = tIntObjectIterator.key();
            ((wh_2)gs_02).agT = ((fkc_0)tIntObjectIterator.value()).aJr();
            wf_12.agS.add((wh_2)gs_02);
        }
    }

    public void b(wf_1 wf_12) {
        gs_0 gs_02;
        int n;
        int n2 = wf_12.agR.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wf_12.agR.get(n);
            this.b(gs_02.Vu, fkc_0.gT(gs_02.agT));
        }
        n2 = wf_12.agS.size();
        for (n = 0; n < n2; ++n) {
            gs_02 = wf_12.agS.get(n);
            this.sBQ.put(((wh_2)gs_02).Vu, (Object)fkc_0.gT(((wh_2)gs_02).agT));
        }
        this.gcn();
    }
}


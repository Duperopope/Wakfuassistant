/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TShortIntHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TShortIntHashMap;
import java.util.Date;

public class eHx {
    public static final eHx qse = new eHx();
    private final TIntObjectHashMap<eHw> qsf = new TIntObjectHashMap();
    private final TShortIntHashMap qsg = new TShortIntHashMap();

    private eHx() {
    }

    public void a(eHw eHw2) {
        this.qsf.put(eHw2.d(), (Object)eHw2);
    }

    public void a(Date date, int n) {
        this.qsg.put(eHy.n(date), n);
    }

    public eHw L(ux_0 ux_02) {
        int n = this.qsg.get(eHy.M(ux_02));
        eHw eHw2 = (eHw)this.qsf.get(n);
        return eHw2 != null ? eHw2 : eHw.qrZ;
    }

    public eHw Pu(int n) {
        eHw eHw2 = (eHw)this.qsf.get(n);
        if (eHw2 != null) {
            return eHw2;
        }
        return eHw.qrZ;
    }
}


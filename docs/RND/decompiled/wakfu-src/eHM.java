/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.map.hash.TIntShortHashMap;
import java.util.HashMap;

public class eHM {
    private final ehy_0 qte;

    public eHM(ehy_0 ehy_02) {
        this.qte = ehy_02;
    }

    public TIntShortHashMap a(TIntShortHashMap tIntShortHashMap, short s) {
        ehy_0 ehy_02 = new ehy_0(this.qte);
        HashMap hashMap = new HashMap();
        tIntShortHashMap.forEachEntry((n, s2) -> {
            ehy_02.q(n, s2);
            int n3 = eHK.qsX.PB(n);
            hashMap.compute(n3, (n2, s) -> (short)(s == null ? s2 : s + s2));
            return true;
        });
        if (eIp.a(ehy_02, s).isEmpty()) {
            ehy_02.j(this.qte);
            return tIntShortHashMap;
        }
        return new TIntShortHashMap();
    }

    public void fvY() {
        this.qte.clear();
    }

    public String toString() {
        return "AptitudeSheetController{m_model=" + String.valueOf(this.qte) + "}";
    }
}


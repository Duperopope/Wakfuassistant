/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

class aYz
implements aqg_1<aOl> {
    final /* synthetic */ eKW hxG;
    final /* synthetic */ TIntObjectHashMap hxH;
    final /* synthetic */ TIntObjectHashMap hxI;
    final /* synthetic */ Map hxJ;
    final /* synthetic */ Map hxK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aYz(eKW eKW2, TIntObjectHashMap tIntObjectHashMap, TIntObjectHashMap tIntObjectHashMap2, Map map, Map map2) {
        this.hxG = eKW2;
        this.hxH = tIntObjectHashMap;
        this.hxI = tIntObjectHashMap2;
        this.hxJ = map;
        this.hxK = map2;
    }

    public void b(aOl aOl2) {
        try {
            eKR eKR2 = ayx_0.a(aOl2);
            this.hxG.c(aOl2.d(), eKR2);
            int n = eKR2.fyZ().azv();
            if (!this.hxH.containsKey(n)) {
                this.hxH.put(n, new ArrayList());
            }
            ((ArrayList)this.hxH.get(n)).add(eKR2);
            Iterator<Map.Entry<Integer, Bu<Short, Short>>> iterator = eKR2.fza();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Bu<Short, Short>> entry = iterator.next();
                int n2 = entry.getKey();
                ArrayList<eKR> arrayList = (ArrayList<eKR>)this.hxI.get(n2);
                if (arrayList == null) {
                    arrayList = new ArrayList<eKR>();
                    this.hxI.put(n2, arrayList);
                }
                arrayList.add(eKR2);
                bmi_2.iDE.a(n2, this.hxG.d(), eKR2.d(), eKR2.c(eKS.qEv));
            }
            if (!eKR2.dxG()) {
                return;
            }
            int n3 = eKR2.cuo();
            if (n3 == n) {
                return;
            }
            this.hxJ.put(n3, n);
            this.hxK.put(n, n3);
        }
        catch (Exception exception) {
            ayx_0.hxF.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(aqz_2 aqz_22) {
        this.b((aOl)aqz_22);
    }
}


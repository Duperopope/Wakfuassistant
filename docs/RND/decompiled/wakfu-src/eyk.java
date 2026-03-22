/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class eyk {
    private static final eyk phS = new eyk();
    private final TIntObjectHashMap<TIntObjectHashMap<List<eyl>>> phT = new TIntObjectHashMap();

    public static eyk fhS() {
        return phS;
    }

    public void a(int n, int n2, short s, short s2, short s3) {
        ArrayList<eyl> arrayList;
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.phT.get(n);
        if (tIntObjectHashMap == null) {
            tIntObjectHashMap = new TIntObjectHashMap();
            this.phT.put(n, (Object)tIntObjectHashMap);
        }
        if ((arrayList = (ArrayList<eyl>)tIntObjectHashMap.get(n2)) == null) {
            arrayList = new ArrayList<eyl>();
            tIntObjectHashMap.put(n2, arrayList);
        }
        Iterator iterator = arrayList.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            eyl eyl2 = (eyl)iterator.next();
            if (eyl2.clG() == s) {
                throw new UnsupportedOperationException("Impossible d'ajouter deux fois un step de m\u00eame limite");
            }
            if (eyl2.clG() > s) break;
            ++n3;
        }
        arrayList.add(n3, new eyl(s, s2, s3));
    }

    public short ak(int n, int n2, short s) {
        eyl eyl2 = this.am(n, n2, s);
        if (eyl2 != null) {
            return eyl2.clI();
        }
        return Short.MAX_VALUE;
    }

    public short al(int n, int n2, short s) {
        eyl eyl2 = this.am(n, n2, s);
        if (eyl2 != null) {
            return eyl2.clH();
        }
        return 0;
    }

    private eyl am(int n, int n2, short s) {
        List list;
        eyl eyl2 = null;
        TIntObjectHashMap tIntObjectHashMap = (TIntObjectHashMap)this.phT.get(n);
        if (tIntObjectHashMap != null && (list = (List)tIntObjectHashMap.get(n2)) != null) {
            for (eyl eyl3 : list) {
                if (eyl3.clG() > s) {
                    return eyl2;
                }
                eyl2 = eyl3;
            }
        }
        return eyl2;
    }

    public void fhT() {
        this.phT.clear();
    }
}


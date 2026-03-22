/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

public class beU {
    public static final beU hOR = new beU();
    private final TIntObjectHashMap<beT> hOS = new TIntObjectHashMap();

    public void a(beT beT2) {
        this.hOS.put(beT2.d(), (Object)beT2);
    }

    public beT BG(int n) {
        return (beT)this.hOS.get(n);
    }

    public ArrayList<beT> a(beV beV2) {
        ArrayList<beT> arrayList = new ArrayList<beT>();
        TIntObjectIterator tIntObjectIterator = this.hOS.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            beT beT2 = (beT)tIntObjectIterator.value();
            if (beT2.dff() != beV2) continue;
            arrayList.add(beT2);
        }
        return arrayList;
    }
}


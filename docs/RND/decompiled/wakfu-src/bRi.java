/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;

public class bRi {
    public static final bRi kZE = new bRi();
    private final TIntObjectHashMap<fiv> kZF = new TIntObjectHashMap();
    private final TIntObjectHashMap<ArrayList<fiv>> kZG = new TIntObjectHashMap();

    private bRi() {
    }

    public void C(int n, int n2, int n3, int n4) {
        ArrayList<fiv> arrayList = (ArrayList<fiv>)this.kZG.get(n4);
        if (arrayList == null) {
            arrayList = new ArrayList<fiv>();
            this.kZG.put(n4, arrayList);
        }
        int n5 = arrayList.size();
        fiv fiv2 = new fiv(n, n2, n3, n4, n5);
        this.kZF.put(n, (Object)fiv2);
        arrayList.add(fiv2);
    }
}


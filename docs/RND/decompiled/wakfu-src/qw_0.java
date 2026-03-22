/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from Qw
 */
public class qw_0 {
    protected static final Logger bfA = Logger.getLogger(qw_0.class);
    private static final qw_0 bfB = new qw_0();
    private final TIntObjectHashMap<List<Qj>> bfC = new TIntObjectHashMap();

    private qw_0() {
    }

    public static qw_0 baO() {
        return bfB;
    }

    public void a(int n, Qj qj) {
        ArrayList<Qj> arrayList = (ArrayList<Qj>)this.bfC.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<Qj>();
            this.bfC.put(n, arrayList);
        }
        arrayList.add(qj);
    }

    public List<Qj> oz(int n) {
        return (List)this.bfC.get(n);
    }
}


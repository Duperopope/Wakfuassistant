/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bqM
 */
public class bqm_0 {
    private static final Logger jbo = Logger.getLogger(bqm_0.class);
    public static final bqm_0 jbp = new bqm_0();
    private final TIntObjectHashMap<bql_0> jbq = new TIntObjectHashMap();
    private final TIntObjectHashMap<ArrayList<bql_0>> jbr = new TIntObjectHashMap();

    public void a(bql_0 bql_02) {
        int n = bql_02.dEA();
        ArrayList<bql_0> arrayList = (ArrayList<bql_0>)this.jbr.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<bql_0>();
            this.jbr.put(n, arrayList);
        }
        arrayList.add(bql_02);
        this.jbq.put(bql_02.d(), (Object)bql_02);
    }

    public void b(bru_0 bru_02) {
        int n = bru_02.d();
        String[] stringArray = bru_02.dEy();
        ArrayList arrayList = (ArrayList)this.jbr.get(n);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int n2 = arrayList.size();
        for (int i = 0; i < n2; ++i) {
            bql_0 bql_02 = (bql_0)arrayList.get(i);
            String[] stringArray2 = bql_02.dEB();
            try {
                if (!bql_02.apo() || !this.a(stringArray, stringArray2)) continue;
                bql_02.a(bru_02);
                continue;
            }
            catch (Exception exception) {
                jbo.error((Object)("Probl\u00e8me \u00e0 l'execution d'un event Client id=" + bql_02.d()), (Throwable)exception);
            }
        }
    }

    public bql_0 Fi(int n) {
        return (bql_0)this.jbq.get(n);
    }

    private boolean a(String[] stringArray, String[] stringArray2) {
        if (stringArray == null || stringArray2 == null || stringArray.length == 0 || stringArray2.length == 0) {
            return true;
        }
        for (int i = 0; i < stringArray2.length; ++i) {
            if (stringArray[i] == null || stringArray2[i] == null || stringArray[i].equals(stringArray2[i])) continue;
            return false;
        }
        return true;
    }

    public void aPg() {
        fyw_0.gqw().a(bsa.jeJ);
        fyw_0.gqw().a(bsa.jeJ);
    }

    public void dEE() {
        this.jbq.forEachValue((TObjectProcedure)new bqn_0(this));
    }
}


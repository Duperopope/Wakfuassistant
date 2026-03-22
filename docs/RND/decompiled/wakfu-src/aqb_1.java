/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.THashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from aqB
 */
public class aqb_1 {
    public static final String cQQ = "id";
    private static final Logger cQR = Logger.getLogger(aqb_1.class);
    private String awN = "";
    private static final aqb_1 cQS = new aqb_1();
    private final THashMap<String, aqa_1> cQT = new THashMap();

    public static aqb_1 bGD() {
        return cQS;
    }

    private aqb_1() {
    }

    public void cL(String string) {
        this.awN = string;
    }

    public static String tD(int n) {
        return n + ".bin";
    }

    private aqa_1 a(aqz_2 aqz_22) {
        return new aqa_1(this.b(aqz_22), aqz_22.bGA());
    }

    private String b(aqz_2 aqz_22) {
        int n = aqz_22.bGA();
        return String.format(this.awN, n, n);
    }

    public aqa_1 c(aqz_2 aqz_22) {
        String string = this.b(aqz_22);
        aqa_1 aqa_12 = (aqa_1)this.cQT.get((Object)string);
        if (aqa_12 == null) {
            aqa_12 = this.a(aqz_22);
            this.cQT.put((Object)aqa_12.bGB(), (Object)aqa_12);
            assert (aqa_12.bGB().equals(string));
        }
        return aqa_12;
    }

    public void a(aqa_1 aqa_12) {
        this.cQT.remove((Object)aqa_12.bGB());
    }

    public void bGE() {
        this.cQT.clear();
    }

    public <T extends aqz_2> void a(T t, aqg_1<T> aqg_12) {
        aqa_1 aqa_12 = this.c(t);
        cQR.trace((Object)(t.getClass().getSimpleName() + ": " + aqa_12.bGC() + " entr\u00e9es"));
        aqa_12.a(t, aqg_12);
        this.a(aqa_12);
    }

    public <T extends aqz_2> boolean a(int n, T t) {
        aqa_1 aqa_12 = this.c(t);
        return aqa_12.a(n, t);
    }

    public <T extends aqz_2> boolean a(int n, T t, aqg_1<T> aqg_12) {
        if (this.a(n, t)) {
            aqg_12.load(t);
            return true;
        }
        cQR.error((Object)("Object inconnu d'id=" + n));
        return false;
    }

    public <T extends aqz_2> void a(T t, String string, int n, aqg_1<T> aqg_12) {
        aqa_1 aqa_12 = this.c(t);
        aqa_12.a(t, string, n, aqg_12);
        this.a(aqa_12);
    }
}


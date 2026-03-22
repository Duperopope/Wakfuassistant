/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bST
 */
public class bst_1 {
    private static final Logger lli = Logger.getLogger(bst_1.class);
    static final bst_1 llj = new bst_1();
    private static final String llk = "type";
    private static final String lll = "version";
    static final String llm = "setProperty";
    static final String lln = "removeProperty";
    static final String llo = "removePropertyPattern";
    static final String llp = "renameProperty";
    static final String llq = "resetChat";
    private final HashMap<String, bss_1> llr = new HashMap();

    private bst_1() {
        this.llr.put(llm, new bsx_1());
        this.llr.put(llq, new bsr_1());
        this.llr.put(lln, new bsu_1());
        this.llr.put(llo, new bsv_1());
        this.llr.put(llp, new bsw_1());
    }

    bss_1 a(apd_1 apd_12, int n) {
        apd_1 apd_13 = apd_12.fq(llk);
        if (apd_13 == null) {
            lli.warn((Object)"Action sans type");
            return null;
        }
        int n2 = bst_1.m(apd_12);
        if (n2 <= n) {
            return null;
        }
        String string = apd_13.bCt();
        bss_1 bss_12 = this.llr.get(string);
        if (bss_12 == null) {
            lli.warn((Object)("Type d'action inexistant : " + string));
            return null;
        }
        bss_1 bss_13 = bss_12.eni();
        bss_13.l(apd_12);
        return bss_13;
    }

    private static int m(apd_1 apd_12) {
        apd_1 apd_13 = apd_12.fq(lll);
        if (apd_13 == null) {
            lli.warn((Object)"Action sans num\u00e9ro de version");
            return -1;
        }
        return apd_13.bCo();
    }

    public String toString() {
        return "CheckerActionFactory{}";
    }
}


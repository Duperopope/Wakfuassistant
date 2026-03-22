/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from eJp
 */
public final class ejp_0 {
    public static final ejp_0 qzy = new ejp_0();
    private boolean qzz = true;
    private boolean qzA = true;
    private final Map<Long, LinkedList<ejr_0>> qzB = new HashMap<Long, LinkedList<ejr_0>>();
    private final Map<Long, LinkedList<ejq_0>> qzC = new HashMap<Long, LinkedList<ejq_0>>();

    public static ejp_0 fxk() {
        return qzy;
    }

    private ejp_0() {
        ewo_0.oBF.a((ewr_0 ewr_02, Object object) -> {
            if (ewr_02 == ewr_0.oFn) {
                this.qzz = ewo_0.oBF.k(ewr_0.oFn);
            } else if (ewr_02 == ewr_0.oEZ) {
                this.qzA = ewo_0.oBF.k(ewr_0.oEZ);
            }
        });
    }

    public void bkZ() {
        this.qzz = ewo_0.oBF.k(ewr_0.oFn);
        this.qzA = ewo_0.oBF.k(ewr_0.oEZ);
    }

    public boolean a(ejs_0 ejs_02, String string) {
        if (!this.qzz) {
            return false;
        }
        if (string == null) {
            return false;
        }
        if (ejs_02.cAI()) {
            return false;
        }
        long l = ejs_02.aZj();
        ejr_0 ejr_02 = new ejr_0(ejp_0.sj(string), System.currentTimeMillis());
        if (!this.qzB.containsKey(l)) {
            this.qzB.put(l, new LinkedList());
        }
        this.M(l, ejr_02.bYU());
        boolean bl = this.a(l, ejr_02);
        this.b(l, ejr_02);
        return bl;
    }

    private void M(long l, long l2) {
        LinkedList<ejr_0> linkedList = new LinkedList<ejr_0>();
        for (ejr_0 ejr_02 : this.qzB.get(l)) {
            if (ejr_02.bYU() + 120000L < l2) continue;
            linkedList.add(ejr_02);
        }
        this.qzB.put(l, linkedList);
    }

    private boolean a(long l, ejr_0 ejr_02) {
        LinkedList<ejr_0> linkedList = this.qzB.get(l);
        int n = 0;
        int n2 = 0;
        for (ejr_0 ejr_03 : linkedList) {
            if (ejr_03.bYU() + 5000L > ejr_02.bYU()) {
                ++n;
            }
            if (!(ejp_0.aw(ejr_02.getText(), ejr_03.getText()) >= 0.75f)) continue;
            ++n2;
        }
        return n >= 5 || n2 >= 3;
    }

    private void b(long l, ejr_0 ejr_02) {
        LinkedList<ejr_0> linkedList = this.qzB.get(l);
        linkedList.add(ejr_02);
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
        }
    }

    public boolean a(ejs_0 ejs_02) {
        return this.a(ejs_02, null, ejn_0.qzl);
    }

    public boolean a(ejs_0 ejs_02, String string, ejn_0 ejn_02) {
        if (!this.qzA) {
            return false;
        }
        if (ejs_02.cAI()) {
            return false;
        }
        long l = ejs_02.aZj();
        if (!this.qzC.containsKey(l)) {
            this.qzC.put(l, new LinkedList());
        }
        ejq_0 ejq_02 = new ejq_0(string, ejn_02, System.currentTimeMillis());
        this.N(l, ejq_02.bYU());
        boolean bl = this.a(l, ejq_02);
        this.b(l, ejq_02);
        return bl;
    }

    private void N(long l, long l2) {
        LinkedList<ejq_0> linkedList = new LinkedList<ejq_0>();
        for (ejq_0 ejq_02 : this.qzC.get(l)) {
            if (ejq_02.bYU() + 120000L < l2) continue;
            linkedList.add(ejq_02);
        }
        this.qzC.put(l, linkedList);
    }

    private boolean a(long l, ejq_0 ejq_02) {
        LinkedList<ejq_0> linkedList = this.qzC.get(l);
        int n = 0;
        int n2 = 0;
        for (ejq_0 ejq_03 : linkedList) {
            if (ejq_03.bYU() + 5000L > ejq_02.bYU()) {
                ++n;
            }
            if (!ejq_02.a(ejq_03)) continue;
            ++n2;
        }
        return n >= 5 || n2 >= 3;
    }

    private void b(long l, ejq_0 ejq_02) {
        LinkedList<ejq_0> linkedList = this.qzC.get(l);
        linkedList.add(ejq_02);
        if (linkedList.size() >= 10) {
            linkedList.removeFirst();
        }
    }

    private static String sj(String string) {
        String string2 = string.toLowerCase();
        string2 = string2.replaceAll("(\\?|\\!|\\,|\\;|\\.|\\/|\\*|\\@|\\#|\\\")", "");
        string2 = string2.replaceAll("(\u00e1|\u00e0|\u00e2|\u00e4|\u00e3)", "a");
        string2 = string2.replaceAll("(\u00e8|\u00ea|\u00eb|\u00e9)", "e");
        string2 = string2.replaceAll("(\u00ed|\u00ec|\u00ef|\u00ee)", "i");
        string2 = string2.replaceAll("(\u00f3|\u00f2|\u00f6|\u00f4)", "o");
        string2 = string2.replaceAll("(\u00fa|\u00f9|\u00fc|\u00fb)", "u");
        string2 = string2.replaceAll("(\u00f1)", "n");
        string2 = string2.replaceAll("(\u00e7)", "c");
        string2 = string2.replaceAll("(-)", " ");
        string2 = string2.replaceAll("(')", "' ");
        string2 = string2.replaceAll("([ ]+)", " ");
        string2 = string2.replaceAll("(<[^>]+>)", "");
        string2 = string2.trim();
        return string2;
    }

    private static float aw(String string, String string2) {
        int n = StringUtils.getLevenshteinDistance((CharSequence)string, (CharSequence)string2);
        return 1.0f - (float)n / (float)Math.max(string.length(), string2.length());
    }
}


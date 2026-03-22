/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.log4j.Logger;

public final class ddi {
    protected static final Logger ogn = Logger.getLogger(ddi.class);
    private static final ddi ogo = new ddi();
    private als_2 bPy;
    private final HashMap<ddj_0, fis_1> ogp = new HashMap();
    private final HashMap<String, alw_2> ogq = new HashMap();
    private final HashMap<String, alx_2> ogr = new HashMap();

    private ddi() {
    }

    public static ddi fcw() {
        return ogo;
    }

    public void a(als_2 als_22) {
        this.bPy = als_22;
    }

    public final void a(afx_1 afx_12, String string, String string2, String string3, String string4, fis_1 fis_12) {
        ddj_0 ddj_02 = new ddj_0(this, afx_12, string, string2, string3, string4);
        this.ogp.put(ddj_02, fis_12);
    }

    public final fis_1 a(afx_1 afx_12, String string, String string2, String string3, String string4) {
        ddj_0 ddj_02 = new ddj_0(this, afx_12, string, string2, string3, string4);
        return this.ogp.get(ddj_02);
    }

    public final fis_1 b(afx_1 afx_12, String string, String string2, String string3, String string4) {
        ddj_0 ddj_02 = new ddj_0(this, afx_12, string, string2, string3, string4);
        return this.ogp.remove(ddj_02);
    }

    public final void a(String string, alx_2 alx_22) {
        this.ogr.put(string, alx_22);
        this.bPy.a(alx_22);
    }

    public final void rl(String string) {
        alx_2 alx_22 = this.ogr.remove(string);
        if (alx_22 != null) {
            this.bPy.b(alx_22);
        } else {
            ogn.error((Object)("Aucun DialogUnloadListener n'est enregistr\u00e9 pour " + string));
        }
    }

    public final void a(String string, alw_2 alw_22) {
        this.ogq.put(string, alw_22);
        this.bPy.a(alw_22);
    }

    public final void rm(String string) {
        alw_2 alw_22 = this.ogq.remove(string);
        if (alw_22 != null) {
            this.bPy.b(alw_22);
        } else {
            ogn.error((Object)("Aucun DialogLoadListener n'est enregistr\u00e9 pour " + string));
        }
    }

    public void h(afx_1 afx_12) {
        Set<Map.Entry<ddj_0, fis_1>> set = this.ogp.entrySet();
        ArrayList<ddj_0> arrayList = new ArrayList<ddj_0>();
        for (Map.Entry<ddj_0, fis_1> entry : set) {
            if (entry.getKey().fcA() != afx_12) continue;
            arrayList.add(entry.getKey());
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            this.ogp.remove(arrayList.get(i));
        }
    }

    public void rn(String string) {
        Set<Map.Entry<ddj_0, fis_1>> set = this.ogp.entrySet();
        ArrayList<ddj_0> arrayList = new ArrayList<ddj_0>();
        for (Map.Entry<ddj_0, fis_1> entry : set) {
            if (!entry.getKey().fcy().equals(string)) continue;
            arrayList.add(entry.getKey());
        }
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            this.ogp.remove(arrayList.get(i));
        }
    }

    public void clean() {
        this.ogp.clear();
    }
}


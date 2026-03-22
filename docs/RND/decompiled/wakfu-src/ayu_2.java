/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ayU
 */
public final class ayu_2 {
    private static final int duw = 256;
    private static final Logger dux = Logger.getLogger(ayu_2.class);
    private static final ayu_2 duy = new ayu_2();
    private final TIntIntHashMap duz;
    private final TIntObjectHashMap<ays_2> duA;
    private final TIntObjectHashMap<ayr_2> duB = new TIntObjectHashMap();

    private ayu_2() {
        this.duA = new TIntObjectHashMap();
        this.duz = new TIntIntHashMap();
    }

    ays_2 a(int n, Class clazz) {
        ays_2 ays_22 = (ays_2)this.duA.get(n);
        if (ays_22 == null) {
            int n2 = this.duz.get(n);
            if (n2 == 0) {
                n2 = 256;
            }
            ays_22 = this.a(n, clazz, n2);
        }
        return ays_22;
    }

    private ays_2 a(int n, Class clazz, int n2) {
        ayr_2 ayr_22 = (ayr_2)this.duB.get(n);
        if (ayr_22 == null) {
            ayr_22 = ayu_2.a(null, clazz);
            this.duB.put(n, (Object)ayr_22);
        }
        return new ays_2(n2, clazz, ayr_22);
    }

    public final ays_2[] bSS() {
        Object[] objectArray = new ays_2[this.duA.size()];
        return (ays_2[])this.duA.values(objectArray);
    }

    private static ayr_2 C(String object, String string) {
        if (BH.aU((String)object)) {
            object = string + "$ObjectFactory";
        }
        return (ayr_2)Class.forName((String)object).newInstance();
    }

    private static ayr_2 a(String string, Class clazz) {
        try {
            return ayu_2.C(string, clazz.getName());
        }
        catch (Exception exception) {
            dux.error((Object)exception);
            return ays_2.r(clazz);
        }
    }

    public final void d(aqs_2 aqs_22) {
        apd_1 apd_12 = aqs_22.bGT().fn("memoryObjectPools");
        if (apd_12 == null) {
            dux.warn((Object)"No pools configuration found");
            return;
        }
        ArrayList<apd_1> arrayList = apd_12.fo("pool");
        if (arrayList == null) {
            dux.warn((Object)"No pools configuration found");
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            apd_1 apd_13 = arrayList.get(i);
            apd_1 apd_14 = apd_13.fq("class");
            apd_1 apd_15 = apd_13.fq("size");
            String string = apd_14.bCt();
            int n2 = apd_15.bCo();
            int n3 = ayq_2.gS(string);
            this.cz(n3, n2);
            apd_1 apd_16 = apd_13.fq("factory_class");
            String string2 = apd_16 != null ? apd_16.bCt() : null;
            try {
                this.duB.put(n3, (Object)ayu_2.C(string2, string));
                continue;
            }
            catch (Exception exception) {
                dux.error((Object)("probl\u00e8me avec la factory pour la classe " + string), (Throwable)exception);
            }
        }
    }

    public final aqs_2 gT(String string) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        try {
            aqr_22.ex(string);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
        }
        catch (Exception exception) {
            dux.error((Object)("Exception during loadConfiguration(" + string + ")"), (Throwable)exception);
        }
        this.d(aqs_22);
        return aqs_22;
    }

    public final void gY(InputStream inputStream) {
        aqr_2 aqr_22 = aqr_2.bGR();
        aqs_2 aqs_22 = aqr_22.bGS();
        try {
            aqr_22.gU(inputStream);
            aqr_22.a(aqs_22, new ape_1[0]);
            aqr_22.close();
        }
        catch (Exception exception) {
            dux.error((Object)"Exception during loadConfiguration", (Throwable)exception);
        }
        this.d(aqs_22);
    }

    public static ayu_2 bST() {
        return duy;
    }

    final void c(ays_2 ays_22) {
        this.duA.put(ays_22.bSN(), (Object)ays_22);
        aro_2.bIf().a(ays_22);
    }

    private void cz(int n, int n2) {
        this.duz.put(n, n2);
    }
}


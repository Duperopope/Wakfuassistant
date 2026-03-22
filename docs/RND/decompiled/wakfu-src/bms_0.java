/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

/*
 * Renamed from bMs
 */
public class bms_0 {
    private static final Logger kwZ = Logger.getLogger(bms_0.class);

    private bms_0() {
    }

    /*
     * WARNING - void declaration
     */
    public static ArrayList<String> a(Iterable<QD> iterable, Qk qk) {
        bmx_0 bmx_02;
        boolean bl = true;
        ArrayList<String> arrayList = new ArrayList<String>();
        if (qk instanceof bmx_0 && !((bmt_0)(bmx_02 = (bmx_0)qk).giP()).cvG()) {
            bl = false;
            if (aum_0.cWf().e(5, ((bmt_0)bmx_02.giP()).d())) {
                arrayList.add(aum_0.cWf().a(5, (long)((bmt_0)bmx_02.giP()).d(), new Object[0]));
            }
        }
        if (bl && iterable != null) {
            bmx_02 = new TObjectIntHashMap();
            ArrayList<String> arrayList2 = new ArrayList<String>();
            QD object = null;
            int n = 0;
            for (QD object2 : iterable) {
                ahv_2 ahv_22 = new ahv_2();
                Object FX = object2.bba();
                String string = "";
                if (FX != null) {
                    if (FX instanceof enk_0) {
                        eLS eLS2;
                        int n2;
                        ems_0 ems_02;
                        float f2;
                        Object object3;
                        eLT eLT2;
                        short s = 0;
                        if (object2.bbf() instanceof bmq_0) {
                            s = ((eNl)object2.bbf()).cmL();
                            eLT2 = new eMB(qk, 0, s);
                        } else if (object2.bbf() instanceof bmx_0) {
                            object3 = (bmx_0)object2.bbf();
                            s = ((fqE)object3).cmL();
                            eLT2 = new eMj((fqE<? extends fqD>)object3);
                        } else if (object2.bbf() instanceof eSS) {
                            s = ((eNl)object2.bbf()).cmL();
                            eLT2 = new eMB(qk, 0, s);
                        } else {
                            eLT2 = new eMB(qk, 0, s);
                        }
                        if ((f2 = (object3 = (enk_0)FX).eb(s)) <= 0.0f || (ems_02 = new ems_0(object2)).avZ() == -1 || (n2 = (eLS2 = eLL.Rw(ems_02.avZ())).a(ahv_22, ems_02, eLT2)) == -1) continue;
                        String string2 = ahv_22.ceL();
                        string2 = eLT2.k(string2, (enk_0)object3);
                        string2 = eLT.so(string2);
                        if (object2.bbf() instanceof bmx_0) {
                            string2 = eMj.a((fqE)object2.bbf(), s, string2);
                        }
                        string = string2;
                    }
                } else {
                    if (object != null && object.d() != object2.d()) {
                        bms_0.a(ahv_22, object.bba().aZH(), object.d(), n, bms_0.c(object.bba()));
                        n = 0;
                    }
                    object = object2;
                    n += object2.getValue();
                    string = ahv_22.ceL();
                }
                if (string.isEmpty()) continue;
                if (!bmx_02.contains(string)) {
                    arrayList2.addAll(Arrays.asList(string.split("\n")));
                    arrayList2.removeIf(String::isEmpty);
                }
                bmx_02.adjustOrPutValue(string, 1, 1);
            }
            for (String string : arrayList2) {
                void var9_13;
                int n3 = bmx_02.get(string);
                if (n3 > 1) {
                    String string3 = string + " (x" + n3 + ")";
                }
                arrayList.add((String)var9_13);
            }
            if (object != null) {
                ahv_2 ahv_23 = new ahv_2();
                bms_0.a(ahv_23, object.bba().aZH(), object.d(), n, bms_0.c(object.bba()));
                arrayList.add(ahv_23.ceL());
            }
        }
        return arrayList;
    }

    private static eNd c(Qj qj) {
        return ((ero_0)enf_0.fBb().pU(qj.avZ())).dTh();
    }

    private static void a(ahv_2 ahv_22, int n, int n2, int n3, eNd eNd2) {
        String string;
        String string2 = null;
        if (aum_0.cWf().e(33, n)) {
            string = aum_0.cWf().a(33, (long)n, new Object[0]);
            string2 = Bz.a(string, n3);
        }
        if ((string2 == null || string2.isEmpty()) && aum_0.cWf().e(10, n2)) {
            string = aum_0.cWf().J(10, n2);
            string2 = Bz.a(string, n3);
        }
        if (string2 != null && !string2.isEmpty()) {
            ahv_22.c(string2);
            if (eNd2 != null) {
                try {
                    string = String.format(auc_0.cVq().bS("elementsSmallIconsPath"), eNd2.name());
                    ahv_22.c(" ").c(fty_2.b(string, -1, -1, null));
                }
                catch (fu_0 fu_02) {
                    kwZ.error((Object)fu_02.toString());
                }
            }
        }
    }

    public static boolean f(Qk<enk_0> qk) {
        if (qk == null) {
            return false;
        }
        for (enk_0 enk_02 : qk) {
            if (bms_0.m(enk_02)) {
                return true;
            }
            fqB fqB2 = fqC.giD().Za(enk_02.aZH());
            if (fqB2 == null || !bms_0.f(fqB2)) continue;
            return true;
        }
        return false;
    }

    private static boolean m(enk_0 enk_02) {
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        return ero_02 instanceof epp_0;
    }

    public static boolean g(Qk<enk_0> qk) {
        if (qk == null) {
            return false;
        }
        for (enk_0 enk_02 : qk) {
            if (bms_0.n(enk_02)) {
                return true;
            }
            fqB fqB2 = fqC.giD().Za(enk_02.aZH());
            if (fqB2 == null || !bms_0.g(fqB2)) continue;
            return true;
        }
        return false;
    }

    private static boolean n(enk_0 enk_02) {
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        return bms_0.c(ero_02);
    }

    public static boolean c(ero_0 ero_02) {
        return ero_02 instanceof epq_0 || ero_02 instanceof epl_0;
    }
}


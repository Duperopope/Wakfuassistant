/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TByteObjectHashMap
 *  gnu.trove.map.hash.TShortIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TShortIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TByteObjectHashMap;
import gnu.trove.map.hash.TShortIntHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class biR {
    private static final Logger imM = Logger.getLogger(biR.class);
    private static final Pattern imN = Pattern.compile("[+-]");
    private static final Pattern imO = Pattern.compile("(\\[el[0-9]+])");
    private final TShortIntHashMap imP = new TShortIntHashMap();
    private final TByteIntHashMap imQ = new TByteIntHashMap();
    private final My imR;

    public biR(My my, ArrayList<enk_0> arrayList, short s) {
        this(my, arrayList, s, false);
    }

    public biR(My my, ArrayList<enk_0> arrayList, short s, boolean bl) {
        this.a(arrayList, s, bl);
        this.imR = my;
    }

    public ArrayList<String> dqX() {
        Object object;
        TByteObjectHashMap tByteObjectHashMap = new TByteObjectHashMap();
        Object object2 = this.imP.iterator();
        while (object2.hasNext()) {
            int n;
            object2.advance();
            object = exx_2.c(GC.x(object2.key()));
            if (object == null || !this.imR.e(eLL.qJg, n = this.imQ.get(((exx_2)object).aJr()))) continue;
            String string = this.do(n, object2.value());
            Matcher matcher = imO.matcher(string);
            while (matcher.find()) {
                String string2 = matcher.group();
                byte by = Byte.parseByte(String.valueOf(string2.charAt(3)));
                String string3 = eLL.j(eNd.ff(by));
                string = string.replace(string2, string3);
            }
            tByteObjectHashMap.put(((exx_2)object).aJr(), (Object)string);
        }
        object2 = new ArrayList(tByteObjectHashMap.size());
        object = tByteObjectHashMap.keys();
        Arrays.sort((byte[])object);
        for (Object object3 : object) {
            ((ArrayList)object2).add((String)tByteObjectHashMap.get((byte)object3));
        }
        return object2;
    }

    public TByteObjectHashMap<String> n(qu_0 qu_02) {
        TByteObjectHashMap tByteObjectHashMap = new TByteObjectHashMap();
        TShortIntIterator tShortIntIterator = this.imP.iterator();
        while (tShortIntIterator.hasNext()) {
            tShortIntIterator.advance();
            exx_2 exx_22 = exx_2.c(GC.x(tShortIntIterator.key()));
            eNd eNd2 = eNd.ff(GC.y(tShortIntIterator.key()));
            int n = this.imQ.get(exx_22.aJr());
            int n2 = tShortIntIterator.value();
            if (!this.imR.e(eLL.qJg, n)) continue;
            String string = this.do(n, n2);
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.c(string);
            if (eNd2 != null) {
                try {
                    String string2 = String.format(auc_0.cVq().bS("elementsSmallIconsPath"), eNd2.name());
                    ahv_22.c(" ").c(fty_2.b(string2, -1, -1, null));
                }
                catch (fu_0 fu_02) {
                    imM.error((Object)"Probl\u00e8me de propri\u00e9t\u00e9", (Throwable)fu_02);
                }
            }
            if (exx_22 == exx_2.rGi || exx_22 == exx_2.rGj || exx_22 == exx_2.rGk || exx_22 == exx_2.rGl) {
                ahv_22.c(" (").yx(qu_02.b(exx_22).aYD()).c(")");
            } else {
                ahv_22.c(" (").yx(qu_02.c(exx_22)).c(")");
            }
            tByteObjectHashMap.put(exx_22.aJr(), (Object)ahv_22.ceL());
        }
        return tByteObjectHashMap;
    }

    private String do(int n, int n2) {
        String string = this.imR.J(10, n);
        string = imN.matcher(string).replaceAll("");
        Object object = n2 < 0 ? String.valueOf(n2) : "+" + n2;
        return Bz.a(string, object);
    }

    private void a(ArrayList<enk_0> arrayList, short s, boolean bl) {
        arrayList.sort(bis_0.imT);
        ArrayList<enk_0> arrayList2 = arrayList;
        int n = arrayList2.size();
        for (int i = 0; i < n; ++i) {
            boolean bl2;
            pt_0 pt_02;
            enk_0 enk_02 = arrayList2.get(i);
            if (!bl && enk_02.fAt()) continue;
            ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
            eNd eNd2 = ero_02.dTh();
            if (ero_02 instanceof eON) {
                pt_02 = ((eot_0)ero_02).fCY();
                bl2 = true;
            } else if (ero_02 instanceof eOO) {
                pt_02 = ((eot_0)ero_02).fCY();
                bl2 = false;
            } else if (ero_02 instanceof eok_0) {
                pt_02 = ((eok_0)ero_02).fCY();
                bl2 = true;
            } else {
                if (!(ero_02 instanceof eol_0)) continue;
                pt_02 = ((eol_0)ero_02).fCY();
                bl2 = false;
            }
            if (pt_02 == null) {
                assert (false);
                imM.error((Object)("CharacteristicType inconnu pour l'effet" + enk_02.aZH() + " actionId=" + enk_02.avZ() + "  " + String.valueOf(ero_02.getClass())));
                continue;
            }
            byte by = pt_02.aJr();
            if (!this.imQ.contains(by)) {
                this.imQ.put(by, enk_02.avZ());
            }
            int n2 = bl2 ? enk_02.a(0, s, ene_0.qPu) : -enk_02.a(0, s, ene_0.qPu);
            short s2 = GC.d(by, eNd2 != null ? (byte)eNd2.aJr() : (byte)-1);
            this.imP.adjustOrPutValue(s2, n2, n2);
        }
    }

    public static boolean i(@NotNull enk_0 enk_02) {
        ero_0 ero_02 = (ero_0)enf_0.fBb().pU(enk_02.avZ());
        return ero_02 instanceof eON || ero_02 instanceof eOO || ero_02 instanceof eok_0 || ero_02 instanceof eol_0;
    }

    public String o(qu_0 qu_02) {
        return biR.a(this.n(qu_02));
    }

    private static String a(TByteObjectHashMap<String> tByteObjectHashMap) {
        int n;
        ahv_2 ahv_22 = new ahv_2();
        boolean bl = false;
        String string = (String)tByteObjectHashMap.get(exx_2.rGi.aJr());
        if (string != null) {
            ahv_22.ceu().ih("fe201b").c(string).cev().ceH();
            bl = true;
        }
        if ((string = (String)tByteObjectHashMap.get(exx_2.rGj.aJr())) != null) {
            ahv_22.ceu().ih("00afea").c(string).cev().ceH();
            bl = true;
        }
        if ((string = (String)tByteObjectHashMap.get(exx_2.rGk.aJr())) != null) {
            ahv_22.ceu().ih("00b400").c(string).cev().ceH();
            bl = true;
        }
        if ((string = (String)tByteObjectHashMap.get(exx_2.rGl.aJr())) != null) {
            ahv_22.ceu().ih("c04aff").c(string).cev().ceH();
            bl = true;
        }
        if (bl) {
            ahv_22.ceH();
        }
        if (biR.a(tByteObjectHashMap, ahv_22, new exx_2[]{exx_2.rGw, exx_2.rGB, exx_2.rGy, exx_2.rGD, exx_2.rGA, exx_2.rGF, exx_2.rGz, exx_2.rGE, exx_2.rGx, exx_2.rGC, exx_2.rGu})) {
            ahv_22.ceH();
        }
        if (biR.a(tByteObjectHashMap, ahv_22, new exx_2[]{exx_2.rGq, exx_2.rGI, exx_2.rGo, exx_2.rGp, exx_2.rGm, exx_2.rGn, exx_2.rGJ, exx_2.rGH, exx_2.rHm})) {
            ahv_22.ceH();
        }
        if (biR.a(tByteObjectHashMap, ahv_22, new exx_2[]{exx_2.rGr, exx_2.rGv, exx_2.rGt})) {
            ahv_22.ceH();
        }
        String string2 = ahv_22.ceL();
        int n2 = string2.length();
        for (n = 0; n < n2 && string2.charAt(n2 - n - 1) == '\n'; ++n) {
        }
        return string2.substring(0, string2.length() - n);
    }

    private static boolean a(TByteObjectHashMap<String> tByteObjectHashMap, ahv_2 ahv_22, exx_2[] exx_2Array) {
        boolean bl = false;
        for (exx_2 exx_22 : exx_2Array) {
            String string = (String)tByteObjectHashMap.get(exx_22.aJr());
            if (string == null) continue;
            ahv_22.c(string).ceH();
            bl = true;
        }
        return bl;
    }
}


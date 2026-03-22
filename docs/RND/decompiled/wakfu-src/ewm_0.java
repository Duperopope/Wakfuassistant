/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from ewm
 */
public final class ewm_0 {
    private static final String oBD = "";

    public static Object a(ews_0 ews_02, String string) {
        switch (ews_02) {
            case oGz: {
                return Boolean.valueOf(string);
            }
            case oGA: {
                return Long.valueOf(string);
            }
            case oGB: {
                return string;
            }
            case oGC: {
                return Lists.newArrayList((Object[])string.split("\\|"));
            }
            case oGD: {
                String[] stringArray;
                ArrayList<Long> arrayList = new ArrayList<Long>();
                if (Strings.isNullOrEmpty((String)string)) {
                    return arrayList;
                }
                for (String string2 : stringArray = string.split("\\|")) {
                    arrayList.add(Long.valueOf(string2));
                }
                return arrayList;
            }
            case oGE: {
                int[] nArray = new int[4];
                String[] stringArray = string.split("\\|");
                for (int i = 0; i < stringArray.length; ++i) {
                    int n;
                    String string3 = stringArray[i];
                    if (string3.isEmpty() || (n = Bw.b((Object)string3, Integer.MIN_VALUE)) == Integer.MIN_VALUE) continue;
                    nArray[i] = n;
                }
                return new uz_0(nArray[0], nArray[1], nArray[2], nArray[3]);
            }
            case oGF: {
                return Float.valueOf(Bw.a((Object)string, 0.0f));
            }
        }
        return null;
    }

    public static String gm(String string) {
        ewr_0 ewr_02 = ewr_0.rJ(string);
        if (ewr_02 == null) {
            return oBD;
        }
        ews_0 ews_02 = ewr_02.feT();
        switch (ews_02) {
            case oGz: {
                return ewm_0.f(ewr_02);
            }
            case oGA: {
                return ewm_0.e(ewr_02);
            }
            case oGB: {
                return ewm_0.d(ewr_02);
            }
            case oGC: {
                return ewm_0.c(ewr_02);
            }
            case oGD: {
                return ewm_0.b(ewr_02);
            }
            case oGE: {
                return ewm_0.b(ewr_02);
            }
            case oGF: {
                return ewm_0.g(ewr_02);
            }
        }
        return oBD;
    }

    private static String b(ewr_0 ewr_02) {
        List<Long> list = ewo_0.oBF.o(ewr_02);
        return StringUtils.join(list, (String)"|");
    }

    private static String c(ewr_0 ewr_02) {
        ArrayList<String> arrayList = ewo_0.oBF.m(ewr_02);
        return StringUtils.join(arrayList, (String)"|");
    }

    private static String d(ewr_0 ewr_02) {
        return ewo_0.oBF.l(ewr_02);
    }

    private static String e(ewr_0 ewr_02) {
        long l = ewo_0.oBF.j(ewr_02);
        return Long.toString(l);
    }

    private static String f(ewr_0 ewr_02) {
        boolean bl = ewo_0.oBF.k(ewr_02);
        return Boolean.toString(bl);
    }

    private static String g(ewr_0 ewr_02) {
        double d2 = ewo_0.oBF.p(ewr_02);
        return Double.toString(d2);
    }
}


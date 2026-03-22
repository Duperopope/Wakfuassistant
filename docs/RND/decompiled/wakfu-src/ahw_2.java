/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringEscapeUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashMap;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aHW
 */
public class ahw_2 {
    private static final Logger dSO = Logger.getLogger(ahw_2.class);

    public static ahv_2 iq(@NotNull String string) {
        aph_1 aph_12;
        ahv_2 ahv_22 = new ahv_2();
        aps_2 aps_22 = new aps_2(new app_2(new StringBuilder(string)));
        while ((aph_12 = aps_22.bFi()) != null) {
            Object object;
            String string2;
            Object object2;
            if (aph_12 instanceof apm_2) {
                object2 = ((apm_2)aph_12).bFb();
                string2 = StringEscapeUtils.unescapeHtml4((String)object2);
                string2 = StringUtils.replaceChars((String)string2, (char)'\u2019', (char)'\'');
                ahv_22.c(string2);
                continue;
            }
            if (!(aph_12 instanceof apl_2)) continue;
            object2 = (apl_2)aph_12;
            string2 = object2.bEX();
            if ("b".equalsIgnoreCase(string2) || "strong".equalsIgnoreCase(string2)) {
                if (object2.bEZ()) {
                    ahv_22.cev();
                    continue;
                }
                ahv_22.ceu();
                continue;
            }
            if ("i".equalsIgnoreCase(string2)) {
                if (object2.bEZ()) {
                    ahv_22.cez();
                    continue;
                }
                ahv_22.cey();
                continue;
            }
            if ("u".equalsIgnoreCase(string2)) {
                if (object2.bEZ()) {
                    ahv_22.ceB();
                    continue;
                }
                ahv_22.ceA();
                continue;
            }
            if ("s".equalsIgnoreCase(string2)) {
                if (object2.bEZ()) {
                    ahv_22.cex();
                    continue;
                }
                ahv_22.cew();
                continue;
            }
            if ("font".equalsIgnoreCase(string2)) {
                if (object2.bEZ()) {
                    ahv_22.ceD();
                    continue;
                }
                boolean bl = false;
                for (apg_2 apg_22 : object2.bFa()) {
                    object = apg_22.bEP();
                    if ("size".equalsIgnoreCase((String)object)) {
                        ahv_22.yu(Integer.parseInt(apg_22.bEO()));
                        bl = true;
                        continue;
                    }
                    if ("color".equalsIgnoreCase((String)object)) {
                        String string3 = ahw_2.ir(apg_22.bEO());
                        if (string3 == null) continue;
                        ahv_22.ih(string3);
                        bl = true;
                        continue;
                    }
                    if (!"face".equalsIgnoreCase((String)object)) continue;
                    ahv_22.ii(apg_22.bEO());
                    bl = true;
                }
                if (bl) continue;
                ahv_22.ceC();
                continue;
            }
            if ("br".equalsIgnoreCase(string2)) {
                ahv_22.k('\n');
                continue;
            }
            if ("p".equalsIgnoreCase(string2)) {
                ahv_22.k('\n');
                continue;
            }
            if (!"span".equalsIgnoreCase(string2)) continue;
            if (object2.bEZ()) {
                ahv_22.ceD();
                continue;
            }
            ahv_22.ceC();
            for (apg_2 apg_23 : object2.bFa()) {
                String string4 = apg_23.bEP();
                if (!"style".equalsIgnoreCase(string4)) continue;
                object = ahw_2.is(apg_23.bEO());
                for (String string5 : ((HashMap)object).keySet()) {
                    String string6;
                    if ("color".equalsIgnoreCase(string5)) {
                        string6 = ahw_2.ir((String)((HashMap)object).get(string5));
                        if (string6 == null) continue;
                        ahv_22.ih(string6);
                        continue;
                    }
                    if ("font-family".equalsIgnoreCase(string5)) {
                        string6 = (String)((HashMap)object).get(string5);
                        String string7 = string6.contains(",") ? StringUtils.split((String)string6, (char)',')[0].trim() : string6;
                        ahv_22.ii(string7);
                        continue;
                    }
                    if ("font-size".equalsIgnoreCase(string5)) {
                        string6 = (String)((HashMap)object).get(string5);
                        if (!string6.endsWith("px")) continue;
                        try {
                            int n = Integer.parseInt(string6.substring(0, string6.length() - 2));
                            ahv_22.yu(n);
                        }
                        catch (NumberFormatException numberFormatException) {
                            dSO.error((Object)("Error while reading font size : invalid size " + string6));
                        }
                        continue;
                    }
                    if (!"text-align".equalsIgnoreCase(string5)) continue;
                    string6 = (String)((HashMap)object).get(string5);
                    if ("center".equalsIgnoreCase(string6)) {
                        ahv_22.ceI();
                        continue;
                    }
                    if ("right".equalsIgnoreCase(string6)) {
                        ahv_22.ceJ();
                        continue;
                    }
                    if (!"left".equalsIgnoreCase(string6)) continue;
                    ahv_22.ceK();
                }
            }
        }
        return ahv_22;
    }

    private static String ir(String string) {
        if (string == null) {
            return null;
        }
        if (string.startsWith("#")) {
            string = string.substring(1);
        }
        if (string.length() < 6) {
            return null;
        }
        return string.substring(0, 6);
    }

    private static HashMap<String, String> is(String string) {
        String[] stringArray;
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (String string2 : stringArray = StringUtils.split((String)string, (char)';')) {
            String[] stringArray2 = StringUtils.split((String)string2, (char)':');
            if (stringArray2.length < 2) {
                dSO.error((Object)("Invalid css property : '" + string2 + "' in css string : '" + string + "'"));
                continue;
            }
            String string3 = stringArray2[0].trim();
            String string4 = stringArray2[1].trim();
            hashMap.put(string3, string4);
        }
        return hashMap;
    }

    public static void main(String[] stringArray) {
        int n = 8217;
        int n2 = 8217;
        int n3 = 326;
        System.out.println(true);
        System.out.println(false);
    }
}


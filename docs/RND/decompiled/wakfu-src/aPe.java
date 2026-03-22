/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aPe {
    private static final Logger ewA = Logger.getLogger(aPe.class);
    private static final aPe ewB = new aPe();
    private static final Pattern ewC = Pattern.compile("\\[([^\\[|]+)\\|(.+?)\\]");
    private static final Pattern ewD = Pattern.compile("<O(?:(=(\\d+))|((\\d+);(.*?)))>");
    private static final int ewE = 5;
    private static final int ewF = 501;
    private int ewG = 0;
    private final List<apg_0> ewH = new ArrayList<apg_0>();
    private final Map<String, ffV> ewI = new HashMap<String, ffV>();
    private static final int ewJ = 501;

    private static String cze() {
        return "(" + aum_0.cWf().c("chat.unknownObject", new Object[0]) + ")";
    }

    private aPe() {
    }

    public static aPe czf() {
        return ewB;
    }

    public static void ag(@Nullable Object object) {
        aPe.a((aOY)aPt.cAg().cAl().czW(), object);
    }

    public static void a(@Nullable aOY aOY2, @Nullable Object object) {
        if (!(object instanceof ejl_0)) {
            return;
        }
        aPe.a(aOY2, (ejl_0)object);
    }

    public static void a(@Nullable ejl_0 ejl_02) {
        aPe.a((aOY)aPt.cAg().cAl().czW(), ejl_02);
    }

    public static void a(@Nullable aOY aOY2, @Nullable ejl_0 ejl_02) {
        boolean bl;
        if (aOY2 == null || ejl_02 == null) {
            return;
        }
        String string = (String)aOY2.eu("input");
        boolean bl2 = bl = string != null && !string.isEmpty() && string.charAt(string.length() - 1) != ' ';
        if (ejl_02.drH() == null || ejl_02.drI() == null) {
            return;
        }
        apg_0 apg_02 = ewB.b(ejl_02);
        if (apg_02 == null) {
            return;
        }
        int n = apg_02.wp() + 1;
        String string2 = String.format("%s[%s|%s] ", bl ? " " : "", apg_02.getName(), n);
        aOY2.e("input", string2);
        fse_1.gFu().a((aef_2)aOY2, "input");
    }

    @Nullable
    private apg_0 b(ejl_0 ejl_02) {
        return this.R(ejm_0.a(ejl_02.drG(), ejl_02.drH()), ejl_02.drI());
    }

    private apg_0 R(String string, String string2) {
        for (int i = 0; i < this.ewH.size(); ++i) {
            if (!this.ewH.get(i).getIdentifier().equals(string)) continue;
            return this.ewH.get(i);
        }
        if (this.ewG >= 501) {
            this.ewG = 0;
        }
        apg_0 apg_02 = new apg_0(this.ewG, string, string2);
        if (this.ewG >= this.ewH.size()) {
            this.ewH.add(apg_02);
        } else {
            this.ewH.set(this.ewG, apg_02);
        }
        ++this.ewG;
        return apg_02;
    }

    @Nullable
    public String iK(String string) {
        String string2 = string;
        Matcher matcher = ewC.matcher(string2);
        int n = 0;
        while (matcher.find()) {
            if (!StringUtils.isNumeric((CharSequence)matcher.group(2))) {
                aPd.e("error.chat.cannotRetrieveItems", new Object[0]);
                return null;
            }
            int n2 = Integer.parseInt(matcher.group(2)) - 1;
            if (n2 < 0 || n2 >= this.ewH.size()) {
                aPd.e("error.chat.cannotRetrieveItems", new Object[0]);
                return null;
            }
            apg_0 apg_02 = this.ewH.get(n2);
            if (apg_02 == null || !apg_02.getName().equals(matcher.group(1))) {
                aPd.e("error.chat.cannotRetrieveItems", new Object[0]);
                return null;
            }
            if (n >= 5) {
                aPd.e("error.chat.tooManyItemsInOneMessage", 5);
                return null;
            }
            string2 = string2.replace(matcher.group(), aPe.iL(apg_02.getIdentifier()));
            ++n;
        }
        return string2.trim();
    }

    private static String iL(@NotNull String string) {
        return String.format("<%s id=\"%s\"/>", "o", string);
    }

    public void clear() {
        this.ewH.clear();
        this.ewG = 0;
    }

    public static String iM(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string;
        ArrayList<String> arrayList = new ArrayList<String>();
        Matcher matcher = ewD.matcher(string2);
        while (matcher.find()) {
            String string3 = matcher.group();
            if (matcher.group(1) == null) {
                ejm_0 ejm_02 = ejm_0.Qa(Integer.parseInt(matcher.group(4)));
                if (ejm_02 == null || matcher.group(5) == null) {
                    string2 = aPe.a(string2, string3, aPe.cze(), arrayList);
                    continue;
                }
                String string4 = aPe.a(ejm_02, matcher.group(5));
                if (string4 == null) {
                    string2 = aPe.a(string2, string3, aPe.cze(), arrayList);
                    continue;
                }
                string2 = aPe.a(string2, string3, string4, arrayList);
                continue;
            }
            int n = Integer.parseInt(matcher.group(2));
            string2 = StringUtils.replace((String)string2, (String)string3, (String)((String)arrayList.get(n)));
        }
        return string2;
    }

    @Nullable
    private static String a(String string, String string2, String string3, ArrayList<String> arrayList) {
        arrayList.add(string3);
        return StringUtils.replace((String)string, (String)string2, (String)string3);
    }

    private static String a(ejm_0 ejm_02, String string) {
        switch (ejm_02) {
            case qyS: {
                return aPe.iN(string);
            }
            case qyT: {
                return aPe.iP(string);
            }
            case qyU: {
                return aPe.iQ(string);
            }
            case qyV: {
                return aPe.iR(string);
            }
            case qyX: {
                return aPe.aO(Short.parseShort(string));
            }
            case qyY: {
                return aPe.iS(string);
            }
            case qyZ: {
                return aPe.yV(Integer.parseInt(string));
            }
        }
        return null;
    }

    private static String iN(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 1) {
            return null;
        }
        return aPe.a(ejm_0.qyS, Integer.parseInt(stringArray[0]), string, aPe.iO(string));
    }

    private static short iO(String string) {
        ffV ffV2 = ffw_0.sJ(string);
        if (ffV2 == null || ffV2.bfd() <= 1) {
            return 0;
        }
        return ffV2.bfd();
    }

    private static String iP(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        return aPe.a(ejm_0.qyT, Integer.parseInt(stringArray[0]), string, 1);
    }

    private static String iQ(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        return aPe.a(ejm_0.qyU, Integer.parseInt(stringArray[0]), string, Integer.parseInt(stringArray[1]));
    }

    private static String iR(String string) {
        return aPe.a(ejm_0.qyV, Integer.parseInt(string), string, 1);
    }

    private static String iS(String string) {
        return aPe.a(ejm_0.qyY, Integer.parseInt(string), string, 1);
    }

    private static String a(ejm_0 ejm_02, int n, String string, int n2) {
        String string2 = bgv_2.Dm(n);
        return String.format("<u id=\"%s_%s\">%s%s</u> ", ejm_02.getTag(), string, string2, aPe.yT(n2));
    }

    private static String yT(int n) {
        if (n <= 1) {
            return "";
        }
        return " (x" + n + ")";
    }

    public static String a(@NotNull ffV ffV2) {
        return "<u id=\"" + ejm_0.qyS.getTag() + "_" + ffV2.avr() + ";" + ffV2.fWz() + "\">" + bgv_2.Dm(ffV2.acs()) + "</u> ";
    }

    public static String yU(int n) {
        return aPe.a(ejm_0.qyS, n, bgv_2.Dm(n));
    }

    public static String ih(long l) {
        String string = aum_0.cWf().c("fight.open.report", new Object[0]);
        return aPe.a(ejm_0.qyW, l, string);
    }

    public static String aO(short s) {
        return aPe.a(ejm_0.qyX, s, bjz_1.Dm(s));
    }

    public static String yV(int n) {
        return aPe.a(ejm_0.qyZ, n, bny_0.Dm(n));
    }

    private static String a(ejm_0 ejm_02, long l, String string) {
        return "<u id=\"" + ejm_02.getTag() + "_" + l + "\">" + string + "</u> ";
    }

    @Nullable
    public ffV b(ejm_0 ejm_02, String string) {
        ffV ffV2;
        String string2 = ejm_0.a(ejm_02, string);
        if (this.ewI.containsKey(string2)) {
            return this.ewI.get(string2);
        }
        switch (ejm_02) {
            case qyS: {
                ffV2 = aPe.iT(string);
                break;
            }
            case qyT: {
                ffV2 = aPe.iU(string);
                break;
            }
            case qyU: {
                ffV2 = aPe.iV(string);
                break;
            }
            case qyV: 
            case qyY: {
                ffV2 = aPe.iW(string);
                break;
            }
            default: {
                return null;
            }
        }
        if (ffV2 == null) {
            return null;
        }
        ffV2.tn(aym_2.bSE());
        if (this.ewI.size() > 501) {
            this.ewI.clear();
        }
        this.ewI.put(string2, ffV2);
        return ffV2;
    }

    @Nullable
    private static ffV iT(String string) {
        return ffw_0.sJ(string);
    }

    private static ffV iU(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 2) {
            return null;
        }
        Object r = fgD.fXh().Vd(Integer.parseInt(stringArray[0]));
        ffV ffV2 = new ffV(Long.parseLong(stringArray[1]));
        ffV2.l((fhc_0)r);
        return ffV2;
    }

    private static ffV iV(String string) {
        String[] stringArray = string.split(";");
        if (stringArray.length < 1) {
            return null;
        }
        Object r = fgD.fXh().Vd(Integer.parseInt(stringArray[0]));
        return ffV.k(r);
    }

    private static ffV iW(String string) {
        Object r = fgD.fXh().Vd(Integer.parseInt(string));
        return ffV.k(r);
    }

    public static boolean a(flp_2 flp_22) {
        return flp_22.gDR() && flp_22.gEm();
    }
}


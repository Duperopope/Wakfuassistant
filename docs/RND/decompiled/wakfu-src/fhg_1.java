/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.log4j.Logger
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from fHg
 */
public class fhg_1
implements fib_1<String> {
    protected static final Logger uvQ = Logger.getLogger(fhg_1.class);
    public static final Class<String> uvR = String.class;
    private static final String uvS = "!";
    private static final String uvT = "~";
    private static final Pattern uvU = Pattern.compile("(%([!~])?([^%\\n]*)%)");
    private static final Pattern uvV = Pattern.compile("(\\$([A-Za-z0-9_\\-]+)(:([^\\$]+))*\\$)");

    public static void main(String[] stringArray) {
        String string = "$pouet:meuh$";
        Matcher matcher = uvV.matcher("$pouet:meuh$");
        if (matcher.matches()) {
            System.out.println(matcher.group(0));
        }
    }

    public String uv(String string) {
        return this.k(uvR, string);
    }

    public String k(Class<? extends String> clazz, String string) {
        return this.l(clazz, string, null);
    }

    public String l(Class<? extends String> clazz, String string, fhs_2 fhs_22) {
        String string2;
        Object object;
        if (string == null) {
            return null;
        }
        Matcher matcher = uvU.matcher(string);
        String string3 = string;
        while (matcher.find()) {
            try {
                object = fyw_0.gqw().k(matcher.group(3), new Object[0]);
                string2 = matcher.group(2);
                if (string2 != null) {
                    switch (string2) {
                        case "!": {
                            object = ((String)object).toUpperCase();
                            break;
                        }
                        case "~": {
                            object = ((String)object).toLowerCase();
                        }
                    }
                }
                string3 = StringUtils.replace((String)string3, (String)matcher.group(1), (String)object);
            }
            catch (Exception exception) {
                uvQ.error((Object)"Exception during convert", (Throwable)exception);
            }
        }
        if (fhs_22 != null && ((Matcher)(object = uvV.matcher(string3))).matches()) {
            string2 = ((Matcher)object).group(2);
            String string4 = ((Matcher)object).group(4);
            string3 = fhs_22.aN(string2, string4);
        }
        return string3;
    }

    @Override
    public Class<String> gzM() {
        return uvR;
    }

    @Override
    public boolean gzN() {
        return true;
    }

    @Override
    public boolean gzO() {
        return false;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends String> clazz, String string, fhu_1 fhu_12) {
        ftz_22.E(uvR);
        Matcher matcher = uvU.matcher(string);
        if (matcher.find()) {
            matcher.reset();
            String string2 = ftz_22.gHa();
            ftz_22.a(new fte_2(clazz, string2, "\"" + string + "\""));
            while (matcher.find()) {
                String string3;
                String string4 = matcher.group(2);
                if (string4 != null) {
                    switch (string4) {
                        case "!": {
                            string3 = ".toUpperCase()";
                            break;
                        }
                        case "~": {
                            string3 = ".toLowerCase()";
                            break;
                        }
                        default: {
                            string3 = "";
                            break;
                        }
                    }
                } else {
                    string3 = "";
                }
                ftz_22.a(new fte_2(clazz, string2, string2 + ".replace(\"" + matcher.group(1) + "\", Xulor.getInstance().getTranslatedString(\"" + matcher.group(3) + "\")" + string3 + ")"));
            }
            return string2;
        }
        Matcher matcher2 = uvV.matcher(string);
        if (matcher2.matches()) {
            String string5 = "\"" + matcher2.group(2) + "\"";
            String string6 = matcher2.group(4) == null ? "null" : "\"" + matcher2.group(4) + "\"";
            String string7 = ftz_22.gHa();
            ftz_22.a(new fte_2(clazz, string7, "elementMap.getEnvironmentProperty(" + string5 + ", " + string6 + ")"));
            return string7;
        }
        return "\"" + StringUtils.replace((String)string, (String)"\\", (String)"\\\\") + "\"";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.uv(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.k(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.l(clazz, string, fhs_22);
    }
}


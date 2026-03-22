/*
 * Decompiled with CFR 0.152.
 */
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from fHa
 */
public class fha_1
implements fib_1<axb_2> {
    private final Class<axb_2> uvF = axb_2.class;
    public static final Pattern uvG = Pattern.compile("[0-9A-Fa-f][0-9A-Fa-f]");
    public static final Pattern uvH = Pattern.compile("(([0-9\\.\\s]+),){2,}([0-9\\.\\s]+)");
    public static final String uvI = "@";
    public static final fha_1 uvJ = new fha_1();

    private fha_1() {
    }

    public axb_2 us(String string) {
        return this.h(this.uvF, string);
    }

    public axb_2 h(Class<? extends axb_2> clazz, String string) {
        return this.h(this.uvF, string, null);
    }

    public axb_2 h(Class<? extends axb_2> clazz, String string, fhs_2 fhs_22) {
        if (string == null) {
            return null;
        }
        if (!clazz.equals(this.uvF)) {
            return null;
        }
        if (string.charAt(0) == '#') {
            String string2 = string.substring(1);
            Matcher matcher = uvG.matcher(string2);
            float f2 = 0.0f;
            if (matcher.find()) {
                f2 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            float f3 = 0.0f;
            if (matcher.find()) {
                f3 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            float f4 = 0.0f;
            if (matcher.find()) {
                f4 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            float f5 = 1.0f;
            if (matcher.find()) {
                f5 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            return new awx_2(f2, f3, f4, f5);
        }
        if (uvH.matcher(string).matches()) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            float f6 = 0.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f6 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            float f7 = 0.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f7 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            float f8 = 0.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f8 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            float f9 = 1.0f;
            if (stringTokenizer.hasMoreTokens()) {
                f9 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            return new awx_2(f6, f7, f8, f9);
        }
        String[] stringArray = string.split(uvI);
        if (stringArray.length > 1) {
            String string3 = stringArray[0].trim();
            float f10 = Float.parseFloat(stringArray[1].trim());
            return new fhl_2(string3, f10);
        }
        return new fhl_2(string);
    }

    @Override
    public Class<axb_2> gzM() {
        return this.uvF;
    }

    @Override
    public boolean gzN() {
        return true;
    }

    @Override
    public boolean gzO() {
        return true;
    }

    @Override
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends axb_2> clazz, String string, fhu_1 fhu_12) {
        if (string == null) {
            return "null";
        }
        if (!clazz.equals(this.uvF)) {
            return "null";
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        if (string.charAt(0) == '#') {
            String string2 = string.substring(1);
            Matcher matcher = uvG.matcher(string2);
            if (matcher.find()) {
                f2 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            if (matcher.find()) {
                f3 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            if (matcher.find()) {
                f4 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
            if (matcher.find()) {
                f5 = (float)Integer.parseInt(matcher.group(), 16) / 255.0f;
            }
        } else if (uvH.matcher(string).matches()) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            if (stringTokenizer.hasMoreTokens()) {
                f2 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                f3 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                f4 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                f5 = Float.parseFloat(stringTokenizer.nextToken().trim());
            }
        } else {
            ftz_22.E(fhl_2.class);
            String[] stringArray = string.split(uvI);
            if (stringArray.length > 1) {
                String string3 = stringArray[0].trim();
                float f6 = Float.parseFloat(stringArray[1].trim());
                return String.format("new %s(\"%s\", %sf)", fhl_2.class.getSimpleName(), string3, Float.valueOf(GC.a(f6, 2)));
            }
            return String.format("new %s(\"%s\")", fhl_2.class.getSimpleName(), string);
        }
        ftz_22.E(awx_2.class);
        return "new " + awx_2.class.getSimpleName() + "(" + f2 + "f, " + f3 + "f, " + f4 + "f, " + f5 + "f)";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.us(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.h(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.h(clazz, string, fhs_22);
    }
}


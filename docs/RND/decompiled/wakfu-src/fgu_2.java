/*
 * Decompiled with CFR 0.152.
 */
import java.util.StringTokenizer;
import java.util.regex.Matcher;

/*
 * Renamed from fGU
 */
public class fgu_2
implements fib_1<awx_2> {
    private final Class<awx_2> uvy = awx_2.class;

    public awx_2 ul(String string) {
        return this.a(this.uvy, string);
    }

    public awx_2 a(Class<? extends awx_2> clazz, String string) {
        return this.a(this.uvy, string, null);
    }

    public awx_2 a(Class<? extends awx_2> clazz, String string, fhs_2 fhs_22) {
        if (string == null) {
            return null;
        }
        if (!clazz.equals(this.uvy)) {
            return null;
        }
        axb_2 axb_22 = fha_1.uvJ.h(clazz, string, fhs_22);
        if (axb_22 == null) {
            return null;
        }
        return axb_22 instanceof awx_2 ? (awx_2)axb_22 : new awx_2(axb_22);
    }

    @Override
    public Class<awx_2> gzM() {
        return this.uvy;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends awx_2> clazz, String string, fhu_1 fhu_12) {
        if (string == null) {
            return "null";
        }
        if (!clazz.equals(this.uvy)) {
            return "null";
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 1.0f;
        if (string.charAt(0) == '#') {
            String string2 = string.substring(1);
            Matcher matcher = fha_1.uvG.matcher(string2);
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
        } else if (fha_1.uvH.matcher(string).matches()) {
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
            String string3;
            ftz_22.E(fhm_2.class);
            String[] stringArray = string.split("@");
            if (stringArray.length > 1) {
                String string4 = stringArray[0].trim();
                float f6 = Float.parseFloat(stringArray[1].trim());
                string3 = String.format("%s.INSTANCE.getColor(\"%s\", %sf)", fhm_2.class.getSimpleName(), string4, Float.valueOf(GC.a(f6, 2)));
            } else {
                string3 = String.format("%s.INSTANCE.getColor(\"%s\")", fhm_2.class.getSimpleName(), string);
            }
            return String.format("%s instanceof %s ? (%s) %s : new %s(%s)", string3, this.uvy.getSimpleName(), this.uvy.getSimpleName(), string3, this.uvy.getSimpleName(), string3);
        }
        ftz_22.E(this.uvy);
        return "new " + this.uvy.getSimpleName() + "(" + f2 + "f, " + f3 + "f, " + f4 + "f, " + f5 + "f)";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.ul(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.a(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.a(clazz, string, fhs_22);
    }
}


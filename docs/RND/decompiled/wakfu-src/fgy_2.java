/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fGY
 */
public class fgy_2
implements fib_1<awx_1> {
    private static final Logger uvC = Logger.getLogger(fgy_2.class);
    private final Class<awx_1> uvD = awx_1.class;

    public awx_1 uq(String string) {
        return this.f(this.uvD, string);
    }

    public awx_1 f(Class<? extends awx_1> clazz, String string) {
        return this.f(clazz, string, null);
    }

    public awx_1 f(Class<? extends awx_1> clazz, String string, fhs_2 fhs_22) {
        awh_2 awh_22;
        if (string == null) {
            return null;
        }
        awx_1 awx_12 = fyw_0.gqw().gqB().uG(string);
        if (awx_12 == null && (awh_22 = awk_2.gx(string)) != null) {
            awx_12 = awa_1.c(awh_22);
        }
        return awx_12;
    }

    @Override
    public Class<awx_1> gzM() {
        return this.uvD;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends awx_1> clazz, String string, fhu_1 fhu_12) {
        if (string == null || !clazz.equals(this.uvD)) {
            return "null";
        }
        String string2 = null;
        awx_1 awx_12 = fyw_0.gqw().gqB().uG(string);
        if (awx_12 == null) {
            awh_2 awh_22 = awk_2.gx(string);
            if (awh_22 != null) {
                awx_12 = awa_1.c(awh_22);
                ftz_22.E(fyw_0.class);
                string2 = "doc.getFont(\"" + string + "\")";
            }
        } else {
            string2 = "TextRendererLoader.getInstance().loadTextRenderer(\"" + string + "\")";
        }
        return string2 != null ? string2 : "null";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.uq(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.f(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.f(clazz, string, fhs_22);
    }
}


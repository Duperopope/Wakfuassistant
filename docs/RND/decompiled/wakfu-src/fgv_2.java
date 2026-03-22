/*
 * Decompiled with CFR 0.152.
 */
import java.util.StringTokenizer;

/*
 * Renamed from fGV
 */
public final class fgv_2
implements fib_1<fsm_1> {
    public static final Class<fsm_1> uvz = fsm_1.class;

    public fsm_1 un(String string) {
        return this.c(uvz, string);
    }

    public fsm_1 c(Class<? extends fsm_1> clazz, String string) {
        return this.c(clazz, string, null);
    }

    public fsm_1 c(Class<? extends fsm_1> clazz, String string, fhs_2 fhs_22) {
        if (string != null) {
            String string2;
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            fsm_1 fsm_12 = new fsm_1();
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    fsm_12.ge(Float.parseFloat(string2.substring(0, string2.length() - 1)));
                } else {
                    fsm_12.setWidth(Integer.parseInt(string2));
                }
            }
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    fsm_12.gd(Float.parseFloat(string2.substring(0, string2.length() - 1)));
                } else {
                    fsm_12.setHeight(Integer.parseInt(string2));
                }
            }
            return fsm_12;
        }
        return null;
    }

    @Override
    public Class<fsm_1> gzM() {
        return uvz;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends fsm_1> clazz, String string, fhu_1 fhu_12) {
        if (string != null) {
            String string2;
            ftz_22.E(uvz);
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("new Dimension(");
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    stringBuilder.append(string2.substring(0, string2.length() - 1)).append("f");
                } else {
                    stringBuilder.append(string2);
                }
            } else {
                stringBuilder.append(0);
            }
            stringBuilder.append(", ");
            if (stringTokenizer.hasMoreTokens()) {
                string2 = stringTokenizer.nextToken().trim();
                if (string2.endsWith("%")) {
                    stringBuilder.append(string2.substring(0, string2.length() - 1)).append("f");
                } else {
                    stringBuilder.append(string2);
                }
            } else {
                stringBuilder.append(0);
            }
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return "null";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.un(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.c(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.c(clazz, string, fhs_22);
    }
}


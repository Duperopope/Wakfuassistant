/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGZ
 */
public class fgz_2
implements fib_1<fiy_2> {
    private final Class<fiy_2> uvE = fiy_2.class;

    public fiy_2 ur(String string) {
        return this.g(this.uvE, string);
    }

    public fiy_2 g(Class<? extends fiy_2> clazz, String string) {
        return this.g(clazz, string, null);
    }

    public fiy_2 g(Class<? extends fiy_2> clazz, String string, fhs_2 fhs_22) {
        if (string == null) {
            return null;
        }
        if (clazz.equals(fiy_2.class)) {
            fiy_2 fiy_22 = new fiy_2();
            fhu_1 fhu_12 = fyw_0.gqw().gqC();
            fhs_2 fhs_23 = fhu_12.gAy();
            fix_2 fix_22 = fhu_12.gAA();
            fiy_22.a(string, fhs_23, fix_22);
            return fiy_22;
        }
        return null;
    }

    @Override
    public Class<fiy_2> gzM() {
        return this.uvE;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends fiy_2> clazz, String string, fhu_1 fhu_12) {
        if (string == null) {
            return null;
        }
        if (clazz.equals(fiy_2.class)) {
            String string2 = ftz_22.gHa();
            ftz_22.E(clazz);
            ftz_22.E(fhu_1.class);
            ftz_22.a(new fte_2(clazz, string2, "new " + clazz.getSimpleName() + "()"));
            ftz_22.a(new ftd_2(null, "setFunc", string2, "\"" + string + "\"", "env.getCurrentElementMap()", "env.getCurrentForm()"));
            return string2;
        }
        return null;
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.ur(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.g(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.g(clazz, string, fhs_22);
    }
}


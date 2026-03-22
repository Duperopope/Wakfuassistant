/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fGW
 */
public class fgw_2
implements fib_1<fmm_2> {
    private final Class<fmm_2> uvA = fmm_2.class;

    public fmm_2 uo(String string) {
        return this.d(this.uvA, string);
    }

    public fmm_2 d(Class<? extends fmm_2> clazz, String string) {
        return this.d(clazz, string, null);
    }

    public fmm_2 d(Class<? extends fmm_2> clazz, String string, fhs_2 fhs_22) {
        if (string == null) {
            return null;
        }
        if (clazz.equals(fmm_2.class)) {
            fmm_2 fmm_22 = new fmm_2();
            fhs_2 fhs_23 = fyw_0.gqw().gqC().gAy();
            fmm_22.e(string, fhs_23);
            return fmm_22;
        }
        return null;
    }

    @Override
    public Class<fmm_2> gzM() {
        return this.uvA;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends fmm_2> clazz, String string, fhu_1 fhu_12) {
        if (string == null) {
            return "null";
        }
        if (clazz.equals(fmm_2.class)) {
            ftz_22.E(fmm_2.class);
            ftz_22.E(fhu_1.class);
            String string2 = ftz_22.gHa();
            ftz_22.a(new fte_2(fmm_2.class, string2, "new DropValidateCallBack()"));
            ftz_22.a(new ftd_2(null, "setFunc", string2, "\"" + string + "\"", "env.getCurrentElementMap()"));
            return string2;
        }
        return "null";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.uo(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.d(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.d(clazz, string, fhs_22);
    }
}


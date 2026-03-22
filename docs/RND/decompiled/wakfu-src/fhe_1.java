/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fHe
 */
public final class fhe_1
implements fib_1<ftc_1> {
    public static final Class<ftc_1> uvO = ftc_1.class;

    public ftc_1 uw(String string) {
        return this.l(uvO, string);
    }

    public ftc_1 l(Class<? extends ftc_1> clazz, String string) {
        return this.k(clazz, string, null);
    }

    public ftc_1 k(Class<? extends ftc_1> clazz, String string, fhs_2 fhs_22) {
        if (string != null) {
            return ftc_1.wj(string);
        }
        return null;
    }

    @Override
    public Class<ftc_1> gzM() {
        return uvO;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends ftc_1> clazz, String string, fhu_1 fhu_12) {
        if (string != null) {
            ftz_22.E(uvO);
            StringBuilder stringBuilder = new StringBuilder();
            ftc_1 ftc_12 = ftc_1.wj(string);
            double d2 = ftc_12.glb();
            stringBuilder.append("new Percentage(").append(d2).append(")");
            return stringBuilder.toString();
        }
        return "null";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.uw(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.l(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.k(clazz, string, fhs_22);
    }
}


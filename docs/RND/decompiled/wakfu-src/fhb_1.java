/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.StringTokenizer;

/*
 * Renamed from fHb
 */
public class fhb_1
implements fib_1<Insets> {
    private final Class<Insets> uvK = Insets.class;

    public Insets ut(String string) {
        return this.i(this.uvK, string);
    }

    public Insets i(Class<? extends Insets> clazz, String string) {
        return this.i(clazz, string, null);
    }

    public Insets i(Class<? extends Insets> clazz, String string, fhs_2 fhs_22) {
        if (string != null && clazz.equals(Insets.class)) {
            StringTokenizer stringTokenizer = new StringTokenizer(string, ",");
            Insets insets = new Insets(0, 0, 0, 0);
            if (stringTokenizer.hasMoreTokens()) {
                insets.top = Bw.m(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                insets.bottom = Bw.m(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                insets.left = Bw.m(stringTokenizer.nextToken().trim());
            }
            if (stringTokenizer.hasMoreTokens()) {
                insets.right = Bw.m(stringTokenizer.nextToken().trim());
            }
            return insets;
        }
        return null;
    }

    @Override
    public Class<Insets> gzM() {
        return this.uvK;
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
    public String a(ftz_2 ftz_22, fhq_2 fhq_22, Class<? extends Insets> clazz, String string, fhu_1 fhu_12) {
        Insets insets = this.i(clazz, string);
        ftz_22.E(clazz);
        return "new " + clazz.getSimpleName() + "(" + insets.top + ", " + insets.left + ", " + insets.bottom + ", " + insets.right + ")";
    }

    @Override
    public /* synthetic */ Object um(String string) {
        return this.ut(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.i(clazz, string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string, fhs_2 fhs_22) {
        return this.i(clazz, string, fhs_22);
    }
}


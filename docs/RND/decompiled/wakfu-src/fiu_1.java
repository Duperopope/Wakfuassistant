/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from fIU
 */
public class fiu_1 {
    public static final fiu_1 uCW = new fiu_1();
    private final HashMap<String, fit_1> uCX = new HashMap();

    private fiu_1() {
    }

    public boolean vM(String string) {
        return this.uCX.containsKey(string);
    }

    public void vN(String string) {
        this.uCX.put(string, new fit_1(string));
    }

    public void vO(String string) {
        this.uCX.remove(string);
    }

    public void c(String string, fes_2 fes_22) {
        fit_1 fit_12 = this.uCX.get(string);
        if (fit_12 != null) {
            fit_12.l(fes_22);
        }
    }

    public void d(String string, fes_2 fes_22) {
        fit_1 fit_12 = this.uCX.get(string);
        if (fit_12 != null) {
            fit_12.n(fes_22);
        }
    }

    public void N(String string, boolean bl) {
        fit_1 fit_12 = this.uCX.get(string);
        if (fit_12 != null) {
            fit_12.setEnabled(bl);
        }
    }

    public boolean fd(String string) {
        fit_1 fit_12 = this.uCX.get(string);
        return fit_12 != null && fit_12.isEnabled();
    }
}


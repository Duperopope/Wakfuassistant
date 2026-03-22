/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from eSk
 */
public final class esk_0 {
    private exa_1 rjs;
    private final List<exx_2> rjt = new ArrayList<exx_2>();
    private final List<exx_2> rju;
    public static final esk_0 rjv = new esk_0();

    private esk_0() {
        this.rjt.add(exx_2.rGi);
        this.rjt.add(exx_2.rHp);
        this.rjt.add(exx_2.rGA);
        this.rjt.add(exx_2.rGx);
        this.rjt.add(exx_2.rGz);
        this.rjt.add(exx_2.rGy);
        this.rjt.add(exx_2.rGw);
        this.rjt.add(exx_2.rGF);
        this.rjt.add(exx_2.rGC);
        this.rjt.add(exx_2.rGE);
        this.rjt.add(exx_2.rGD);
        this.rjt.add(exx_2.rGB);
        this.rju = new ArrayList<exx_2>();
        this.rju.add(exx_2.rGn);
        this.rju.add(exx_2.rGm);
        this.rju.add(exx_2.rGI);
    }

    public void a(exa_1 exa_12, float f2, float f3) {
        exx_2 exx_22;
        int n;
        this.rjs = exa_12;
        int n2 = this.rjt.size();
        for (n = 0; n < n2; ++n) {
            exx_22 = this.rjt.get(n);
            this.a(exx_22, f2);
        }
        n2 = this.rju.size();
        for (n = 0; n < n2; ++n) {
            exx_22 = this.rju.get(n);
            this.a(exx_22, f3);
        }
        this.rjs = null;
    }

    private void a(exx_2 exx_22, float f2) {
        Object Characteristic = this.rjs.b(exx_22);
        int n = ((pr_0)Characteristic).aYB();
        ((pr_0)Characteristic).op(Math.round((float)n - Math.abs((float)n * (1.0f - f2))));
        ((pr_0)Characteristic).ot(Math.round((float)((pr_0)Characteristic).aYD() * f2));
    }

    public int a(exx_2 exx_22, short s, exd_2 exd_22, float f2, float f3) {
        float f4 = this.rjt.contains(exx_22) ? f2 : (this.rju.contains(exx_22) ? f3 : 1.0f);
        int n = exd_22.b(exx_22, s);
        return Math.round((float)n - Math.abs((float)n * (1.0f - f4)));
    }
}


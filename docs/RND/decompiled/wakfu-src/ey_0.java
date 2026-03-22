/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from Ey
 */
public class ey_0 {
    public static final eh_2[] ayy = new eh_2[0];
    private final eg_2 ayz;

    public ey_0(eg_2 eg_22) {
        this.ayz = eg_22;
    }

    public void b(fp_0 fp_02) {
        this.d(fp_02);
        this.e(fp_02);
        this.f(fp_02);
        this.g(fp_02);
    }

    private void d(fp_0 fp_02) {
        float[] fArray = this.ayz.aIZ();
        fp_02.mz(fArray.length);
        for (float f2 : fArray) {
            fp_02.b(f2);
        }
    }

    private void e(fp_0 fp_02) {
        float[] fArray = this.ayz.aJa();
        fp_02.mz(fArray.length);
        for (float f2 : fArray) {
            fp_02.b(f2);
        }
    }

    private void f(fp_0 fp_02) {
        float[] fArray = this.ayz.aJb();
        fp_02.mz(fArray.length);
        for (float f2 : fArray) {
            fp_02.b(f2);
        }
    }

    private void g(fp_0 fp_02) {
        eh_2[] eh_2Array = this.ayz.aIH();
        fp_02.mz(eh_2Array.length);
        for (eh_2 eh_22 : eh_2Array) {
            Optional<CZ> optional = CZ.a(eh_22.aJd());
            if (optional.isEmpty()) continue;
            CY<? extends CX> cY = optional.get().aIw();
            CX cX = cY.b(eh_22);
            cX.a(fp_02);
        }
    }
}


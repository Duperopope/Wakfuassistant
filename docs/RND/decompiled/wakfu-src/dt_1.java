/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Supplier;

/*
 * Renamed from DT
 */
public final class dt_1 {
    public static final eh_2[] aye = new eh_2[0];
    private static final float[] ayf = new float[0];

    private dt_1() {
    }

    public static void b(eg_2 eg_22, do_0 do_02) {
        dt_1.c(eg_22, do_02);
        dt_1.d(eg_22, do_02);
        dt_1.e(eg_22, do_02);
        dt_1.f(eg_22, do_02);
    }

    private static void c(eg_2 eg_22, do_0 do_02) {
        int n = do_02.aIA();
        eg_22.j(n == 0 ? ayf : do_02.my(n));
    }

    private static void d(eg_2 eg_22, do_0 do_02) {
        int n = do_02.aIA();
        eg_22.k(n == 0 ? ayf : do_02.my(n));
    }

    private static void e(eg_2 eg_22, do_0 do_02) {
        int n = do_02.aIA();
        eg_22.l(n == 0 ? ayf : do_02.my(n));
    }

    private static void f(eg_2 eg_22, do_0 do_02) {
        int n = do_02.aIA();
        if (n == 0) {
            eg_22.a(aye);
            return;
        }
        eh_2[] eh_2Array = new eh_2[n];
        for (int i = 0; i < n; ++i) {
            es_1 es_12;
            Optional<CZ> optional;
            byte by = (byte)(do_02.aIy() & 0xFF);
            byte by2 = (byte)(do_02.aIy() & 0xFF);
            Optional<es_1> optional2 = es_1.j(by);
            if (optional2.isEmpty() || (optional = CZ.a(es_12 = optional2.get())).isEmpty()) continue;
            CZ cZ = optional.get();
            Supplier<? extends eh_2> supplier = es_12.aJs();
            CY<? extends CX> cY = cZ.aIw();
            eh_2 eh_22 = supplier.get();
            CX cX = cY.b(eh_22);
            cX.a(by2, do_02);
            eh_2Array[i] = eh_22;
        }
        eg_22.a(eh_2Array);
    }
}


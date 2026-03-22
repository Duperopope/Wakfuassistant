/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Supplier;

/*
 * Renamed from Dm
 */
public final class dm_0 {
    private static final eh_2[] axV = new eh_2[0];

    private dm_0() {
    }

    public static int a(ea_1 ea_12, do_0 do_02, int n) {
        int n2 = do_02.aIz() & 0xFFFF;
        fb_1[] fb_1Array = new fb_1[n2];
        for (int i = 0; i < fb_1Array.length; ++i) {
            fb_1Array[i] = dn_0.c(do_02);
        }
        ea_12.a(fb_1Array);
        return dm_0.b(ea_12, do_02, n);
    }

    private static int b(ea_1 ea_12, do_0 do_02, int n) {
        int n2 = do_02.aIy() & 0xFF;
        if (n2 == 0) {
            ea_12.a(axV);
            return do_02.aIz() & 0xFFFF;
        }
        eh_2[] eh_2Array = new eh_2[n2];
        for (int i = 0; i < eh_2Array.length; ++i) {
            es_1 es_12;
            Optional<CZ> optional;
            byte by = (byte)(do_02.aIy() & 0xFF);
            byte by2 = (byte)(do_02.aIy() & 0xFF);
            Optional<es_1> optional2 = es_1.j(by);
            if (optional2.isEmpty() || (optional = CZ.a(es_12 = optional2.get())).isEmpty()) continue;
            Supplier<? extends eh_2> supplier = es_12.aJs();
            CY<? extends CX> cY = optional.get().aIw();
            eh_2 eh_22 = supplier.get();
            CX cX = cY.b(eh_22);
            eh_22.mA(n);
            cX.a(by2, do_02);
            eh_2Array[i] = eh_22;
        }
        ea_12.a(eh_2Array);
        return do_02.aIz() & 0xFFFF;
    }
}


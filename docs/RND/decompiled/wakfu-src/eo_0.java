/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from Eo
 */
public final class eo_0 {
    private eo_0() {
    }

    public static void a(fp_0 fp_02, List<Integer> list) {
        int n = 0;
        int n2 = list.size();
        for (Integer n3 : list) {
            if (n3 <= n) continue;
            n = n3;
        }
        if (n < 255) {
            fp_02.g((byte)1);
            fp_02.mz(n2);
            for (Integer n3 : list) {
                fp_02.g(n3.byteValue());
            }
            return;
        }
        if (n < 65535) {
            fp_02.g((byte)2);
            fp_02.mz(n2);
            for (Integer n3 : list) {
                fp_02.k(n3.shortValue());
            }
            return;
        }
        if (n >= Integer.MAX_VALUE) {
            throw new IllegalStateException("trop de donn\u00e9e");
        }
        fp_02.g((byte)4);
        fp_02.mz(n2);
        for (Integer n3 : list) {
            fp_02.mz(n3);
        }
    }
}


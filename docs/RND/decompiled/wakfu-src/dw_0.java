/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from DW
 */
public final class dw_0 {
    private dw_0() {
    }

    public static void a(ei_2 ei_22, fp_0 fp_02) {
        try {
            fp_02.g(ei_22.aJd().aJr());
            int n = 1;
            if (ei_22.aJf() != 0 || ei_22.aJg() != 0 || ei_22.aJh() != 0) {
                n = 4;
            }
            fp_02.g((byte)n);
            fp_02.mz(ei_22.aJe());
            if (n == 4) {
                fp_02.k(ei_22.aJf());
                fp_02.k(ei_22.aJg());
                fp_02.k(ei_22.aJh());
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)ei_22.aJd()), iOException);
        }
    }
}


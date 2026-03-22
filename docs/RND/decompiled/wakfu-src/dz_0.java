/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from DZ
 */
public final class dz_0 {
    private dz_0() {
    }

    public static void a(el_1 el_12, fp_0 fp_02) {
        try {
            fp_02.g(el_12.aJd().aJr());
            int n = el_12.aJj() == 0 ? 1 : 2;
            fp_02.g((byte)n);
            fp_02.bo(el_12.aJi());
            if (n == 2) {
                fp_02.g((byte)el_12.aJj());
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)el_12.aJd()), iOException);
        }
    }
}


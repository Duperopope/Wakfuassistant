/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ee
 */
public final class ee_1 {
    private ee_1() {
    }

    public static void a(eq_1 eq_12, fp_0 fp_02) {
        try {
            fp_02.g(eq_12.aJd().aJr());
            fp_02.g((byte)1);
            fp_02.bo(Long.toString(eq_12.aJp()));
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)eq_12.aJd()), iOException);
        }
    }
}


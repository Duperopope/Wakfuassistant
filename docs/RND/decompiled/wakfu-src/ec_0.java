/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ec
 */
public final class ec_0 {
    private ec_0() {
    }

    public static void a(eo_1 eo_12, fp_0 fp_02) {
        try {
            fp_02.g(eo_12.aJd().aJr());
            fp_02.g((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)eo_12.aJd()), iOException);
        }
    }
}


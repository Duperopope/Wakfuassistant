/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ef
 */
public final class ef_1 {
    private ef_1() {
    }

    public static void a(er_1 er_12, fp_0 fp_02) {
        try {
            fp_02.g(er_12.aJd().aJr());
            fp_02.g((byte)1);
            fp_02.g(er_12.aJq());
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)er_12.aJd()), iOException);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from DY
 */
public final class dy_0 {
    private dy_0() {
    }

    public static void a(ek_1 ek_12, fp_0 fp_02) {
        try {
            fp_02.g(ek_12.aJd().aJr());
            fp_02.g((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)ek_12.aJd()), iOException);
        }
    }
}


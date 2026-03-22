/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from DX
 */
public final class dx_0 {
    private dx_0() {
    }

    public static void a(ej_1 ej_12, fp_0 fp_02) {
        try {
            fp_02.g(ej_12.aJd().aJr());
            fp_02.g((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)ej_12.aJd()), iOException);
        }
    }
}


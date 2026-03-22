/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ed
 */
public final class ed_0 {
    private ed_0() {
    }

    public static void a(ep_1 ep_12, fp_0 fp_02) {
        try {
            fp_02.g(ep_12.aJd().aJr());
            fp_02.g((byte)0);
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)ep_12.aJd()), iOException);
        }
    }
}


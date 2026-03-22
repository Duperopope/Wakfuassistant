/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Eb
 */
public final class eb_0 {
    private static final String ayi = "#optimized";

    private eb_0() {
    }

    public static void a(en_1 en_12, fp_0 fp_02) {
        try {
            fp_02.g(en_12.aJd().aJr());
            String[] stringArray = en_12.aJn();
            byte[] byArray = en_12.aJo();
            if (stringArray == null) {
                fp_02.g((byte)0);
                return;
            }
            fp_02.g((byte)(2 * stringArray.length + 1));
            fp_02.bo(ayi);
            for (String string : stringArray) {
                fp_02.bo(string);
            }
            for (byte by : byArray) {
                fp_02.g(by);
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)en_12.aJd()), iOException);
        }
    }
}


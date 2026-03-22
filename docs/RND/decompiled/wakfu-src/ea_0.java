/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from Ea
 */
public final class ea_0 {
    private ea_0() {
    }

    public static void a(em_1 em_12, fp_0 fp_02) {
        try {
            fp_02.g(em_12.aJd().aJr());
            String[] stringArray = em_12.aJk();
            String[] stringArray2 = em_12.aJl();
            int n = stringArray.length + stringArray2.length;
            if (em_12.aJm() != null) {
                ++n;
            }
            fp_02.g((byte)n);
            for (int i = 0; i < stringArray.length; ++i) {
                fp_02.bo(stringArray[i]);
                fp_02.bo(stringArray2[i]);
            }
            if (em_12.aJm() != null) {
                fp_02.bo(em_12.aJm());
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException("unable to write action " + String.valueOf((Object)em_12.aJd()), iOException);
        }
    }
}


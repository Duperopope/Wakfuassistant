/*
 * Decompiled with CFR 0.152.
 */
import java.io.EOFException;

/*
 * Renamed from Du
 */
public final class du_1 {
    private du_1() {
    }

    public static void a(em_1 em_12, byte by, do_0 do_02) {
        try {
            int n = (by - 1) / 2;
            String[] stringArray = new String[n];
            String[] stringArray2 = new String[n];
            for (int i = 0; i < n; ++i) {
                stringArray[i] = do_02.aIC();
                stringArray2[i] = do_02.aIC();
            }
            em_12.e(stringArray);
            em_12.f(stringArray2);
            if (by % 2 != 0) {
                em_12.br(do_02.aIC());
            }
        }
        catch (EOFException eOFException) {
            throw new RuntimeException("Unable to load " + String.valueOf((Object)em_12.aJd()), eOFException);
        }
    }
}


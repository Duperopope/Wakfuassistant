/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public final class DN {
    private DN() {
    }

    public static void a(fi_0 fi_02, eg_2 eg_22, boolean bl, do_0 do_02) {
        try {
            int n = do_02.aIz() & 0xFFFF;
            fk_0[] fk_0Array = new fk_0[n];
            for (int i = 0; i < n; ++i) {
                fk_0 fk_02;
                fk_0Array[i] = fk_02 = dq_1.a(eg_22, do_02);
                if (fk_02 == null || fk_02.aIs() == 0 || !bl || !DN.bp(fk_02.getName())) continue;
                fk_0Array[i] = null;
            }
            fi_02.a(fk_0Array);
        }
        catch (IOException iOException) {
            throw new IllegalStateException("unable to load sprite definitions", iOException);
        }
        DN.a(fi_02);
    }

    private static void a(fi_0 fi_02) {
        fi_02.aIt().forEach(fk_02 -> {
            if (fk_02 == null || fk_02.getName() == null) {
                return;
            }
            for (String string : bo_0.avJ) {
                if (!fk_02.getName().contains(string)) continue;
                bo_0.avK.add(fk_02.aIk());
                return;
            }
        });
    }

    private static boolean bp(String string) {
        if (string == null || string.trim().isEmpty() || "null".equals(string)) {
            return false;
        }
        if (!string.startsWith("_Anim", 1)) {
            return false;
        }
        char c2 = string.charAt(0);
        return c2 == '3' || c2 == '4' || c2 == '7';
    }
}


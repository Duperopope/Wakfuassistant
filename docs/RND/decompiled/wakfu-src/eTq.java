/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class eTq {
    public static final int ror = 20015;

    public static boolean X(long l, int n) {
        Optional<evv_2> optional = evx_2.feo().a(l, eva_1.owA);
        if (optional.isEmpty()) {
            return false;
        }
        evv_2 evv_22 = optional.get();
        if (!(evv_22 instanceof eTp)) {
            return false;
        }
        eTp eTp2 = (eTp)evv_22;
        return eTp2.Su(n);
    }
}


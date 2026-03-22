/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ffO
 */
public final class ffo_0 {
    private ffo_0() {
    }

    public static int z(enk_0 enk_02) {
        return (int)enk_02.Rz(0);
    }

    public static int d(enk_0 enk_02, short s) {
        return (int)enk_02.x(0, s);
    }

    public static float A(enk_0 enk_02) {
        if (!(enk_02 instanceof eNB)) {
            return 0.0f;
        }
        return ((eNB)enk_02).RV(0);
    }

    @Nullable
    public static Map<Integer, Integer> B(enk_0 enk_02) {
        if (enk_02.avZ() == enf_0.qPI.d() || enk_02.avZ() == enf_0.qQO.d()) {
            fja fja2 = fja.Wq((int)enk_02.Rz(2));
            if (fja2 == fja.svl) {
                return null;
            }
            return Map.of(fja2.d(), enk_02.avZ() == enf_0.qPI.d() ? 1 : -1);
        }
        return null;
    }
}


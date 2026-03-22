/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ftx
 */
public final class ftx_0 {
    private ftx_0() {
    }

    public static <T extends fsx_0> boolean a(fsy_0<T> fsy_02, @Nullable fty_0 fty_02, @NotNull aci_1 aci_12, long l) {
        if (fty_02 == null) {
            return false;
        }
        for (ftv_0 ftv_02 : fty_02.gmn().values()) {
            Optional<fsx_0> optional;
            if (ftv_02.gmj() == l || (optional = ftr_0.gmc().g(ftv_02).map(fsy_02::aag)).isEmpty() || !optional.get().gz(ftv_02.bkP(), ftv_02.bkQ()).e(aci_12)) continue;
            return true;
        }
        return false;
    }
}


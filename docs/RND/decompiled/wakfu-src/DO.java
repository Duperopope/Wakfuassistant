/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

public final class DO {
    private DO() {
    }

    @Nullable
    public static fk_0 a(Optional<fl_0> optional) {
        if (optional.isEmpty()) {
            return null;
        }
        return switch (optional.get()) {
            case fl_0.aAM -> new ff_0();
            case fl_0.aAN -> new fh_0();
            case fl_0.aAO -> new fg_0();
            case fl_0.aAP -> new fe_1();
            default -> null;
        };
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpJ
 */
final class bpj_1
implements aeh_2 {
    public static final String iXR = "flagIconUrl";
    public static final String iXS = "translation";
    @NotNull
    private final String iXT;
    @NotNull
    private final Mv iXU;

    bpj_1(@NotNull String string, @NotNull Mv mv) {
        this.iXT = string;
        this.iXU = mv;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iXS -> this.iXT;
            case iXR -> ccl_2.x(this.iXU);
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iXS};
    }
}


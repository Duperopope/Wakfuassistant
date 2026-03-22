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
 * Renamed from bYs
 */
public final class bys_2
implements aeh_2 {
    private static final String lzg = "title";
    private static final String lzh = "achievement";
    @NotNull
    private final String lzi;
    @NotNull
    private final bci_1 lzj;

    public bys_2(@NotNull bci_1 bci_12) {
        Object t = fcL.rUh.sw(bci_12.KU());
        this.lzi = aum_0.cWf().c(bci_12.dax() ? "quest.complete.by" : "achievement.complete.by", t != null ? ((exP)t).getName() : "?");
        this.lzj = bci_12;
    }

    @NotNull
    public bci_1 eoY() {
        return this.lzj;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case lzg -> this.lzi;
            case lzh -> this.lzj;
            default -> this.lzj.eu(string);
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{lzg, lzh};
    }
}


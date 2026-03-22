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
 * Renamed from bIk
 */
public class bik_1
implements aeh_2 {
    public static final String kfc = "name";
    @NotNull
    private final fjh kfd;

    public bik_1(@NotNull fjh fjh2) {
        this.kfd = fjh2;
    }

    @Override
    public String[] bxk() {
        return new String[]{kfc};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kfc)) {
            return aum_0.cWf().c("market.history.timespan." + this.kfd.aJr(), new Object[0]);
        }
        return null;
    }

    public fjh dXD() {
        return this.kfd;
    }
}


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
 * Renamed from bei
 */
public final class bei_2
extends Enum<bei_2> {
    public static final /* enum */ bei_2 hNa = new bei_2();
    private static final /* synthetic */ bei_2[] hNb;

    public static bei_2[] values() {
        return (bei_2[])hNb.clone();
    }

    public static bei_2 valueOf(String string) {
        return Enum.valueOf(bei_2.class, string);
    }

    @Nullable
    public static bei_2 lp(@NotNull String string) {
        bei_2[] bei_2Array = bei_2.values();
        for (int i = 0; i < bei_2Array.length; ++i) {
            bei_2 bei_22 = bei_2Array[i];
            if (!bei_22.toString().equals(string)) continue;
            return bei_22;
        }
        return null;
    }

    private static /* synthetic */ bei_2[] dep() {
        return new bei_2[]{hNa};
    }

    static {
        hNb = bei_2.dep();
    }
}


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
 * Renamed from bej
 */
public final class bej_2
extends Enum<bej_2> {
    public static final /* enum */ bej_2 hNc = new bej_2();
    private static final /* synthetic */ bej_2[] hNd;

    public static bej_2[] values() {
        return (bej_2[])hNd.clone();
    }

    public static bej_2 valueOf(String string) {
        return Enum.valueOf(bej_2.class, string);
    }

    @Nullable
    public static bej_2 lq(@NotNull String string) {
        bej_2[] bej_2Array = bej_2.values();
        for (int i = 0; i < bej_2Array.length; ++i) {
            bej_2 bej_22 = bej_2Array[i];
            if (!bej_22.toString().equals(string)) continue;
            return bej_22;
        }
        return null;
    }

    private static /* synthetic */ bej_2[] deq() {
        return new bej_2[]{hNc};
    }

    static {
        hNd = bej_2.deq();
    }
}


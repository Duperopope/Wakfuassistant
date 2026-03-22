/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

final class aWq {
    private aWq() {
    }

    public static void b(@Nullable bgy bgy2, @Nullable bgy bgy3) {
        bgy bgy4 = bgy2 != null && bgy2.dkQ() ? bgy2 : (bgy3 != null && bgy3.dkQ() ? bgy3 : null);
        if (bgy4 != null) {
            bgy4.dlH();
        }
    }
}


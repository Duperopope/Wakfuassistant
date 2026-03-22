/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atk
 */
final class atk_2
extends atj_2 {
    @Override
    public boolean c(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return !dbD.c(string, string2, string3) && (string.contains("ATI Technologies") || string2.startsWith("ATI "));
    }
}


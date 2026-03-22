/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ato
 */
final class ato_2
extends atj_2 {
    @Override
    public boolean h(@NotNull GL gL) {
        String string = gL.glGetString(7936);
        return this.fj(string);
    }

    public boolean fj(@NotNull String string) {
        return string.startsWith("Apple");
    }

    @Override
    public boolean c(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return this.fj(string);
    }
}


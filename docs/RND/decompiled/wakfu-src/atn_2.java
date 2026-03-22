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
 * Renamed from atn
 */
final class atn_2
extends atj_2 {
    @Override
    public boolean h(@NotNull GL gL) {
        String string = gL.glGetString(7937);
        String string2 = gL.glGetString(7938);
        return this.A(string, string2);
    }

    public boolean A(@NotNull String string, @NotNull String string2) {
        String string3 = "Mesa ";
        return string.contains("Mesa ") || string.contains("Gallium ") || string2.contains("Mesa ");
    }

    @Override
    public boolean c(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        return this.A(string2, string3);
    }
}


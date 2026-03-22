/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aAJ
 */
public final class aaj_1 {
    public static void a(aaw_1 aaw_12, GLAutoDrawable gLAutoDrawable) {
        if (aaw_12.bUt()) {
            return;
        }
        gLAutoDrawable.addGLEventListener((GLEventListener)new aak_1(aaw_12));
    }

    @NotNull
    static Runnable a(aaw_1 aaw_12) {
        return aaw_12.bUp();
    }

    @NotNull
    static Runnable g(Runnable runnable) {
        return new aal_1(runnable);
    }
}


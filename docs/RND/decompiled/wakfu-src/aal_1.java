/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.Threading
 */
import com.jogamp.opengl.Threading;

/*
 * Renamed from aAL
 */
class aal_1
implements Runnable {
    final /* synthetic */ Runnable dwU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aal_1(Runnable runnable) {
        this.dwU = runnable;
    }

    @Override
    public void run() {
        Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this.dwU);
    }
}


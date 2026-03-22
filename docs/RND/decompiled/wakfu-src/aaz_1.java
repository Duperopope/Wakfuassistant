/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLException
 *  com.jogamp.opengl.Threading
 *  org.apache.log4j.Logger
 */
import com.jogamp.opengl.GLException;
import com.jogamp.opengl.Threading;
import org.apache.log4j.Logger;

/*
 * Renamed from aAZ
 */
class aaz_1
implements Runnable {
    private static final Logger dxv = Logger.getLogger(aaz_1.class);
    private final Runnable dxw;

    aaz_1(Runnable runnable) {
        this.dxw = runnable;
    }

    @Override
    public void run() {
        try {
            if (!Threading.isOpenGLThread()) {
                Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this);
                return;
            }
        }
        catch (GLException gLException) {
            Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this);
            dxv.error((Object)"Exception lev\u00e9e", (Throwable)gLException);
        }
        catch (Throwable throwable) {
            Threading.invokeOnOpenGLThread((boolean)false, (Runnable)this);
            dxv.error((Object)"Exception lev\u00e9e", throwable);
            return;
        }
        aum_2.b("Worker", 1.0f, 0.0f, 0.0f);
        this.dxw.run();
        aum_2.bIi();
    }

    public String toString() {
        return "WorkerOGLRunner{m_runner=" + String.valueOf(this.dxw) + "}";
    }
}


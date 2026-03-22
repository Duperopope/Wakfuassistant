/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aAK
 */
class aak_1
implements GLEventListener {
    final /* synthetic */ aaw_1 dwT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aak_1(aaw_1 aaw_12) {
        this.dwT = aaw_12;
    }

    public void init(GLAutoDrawable gLAutoDrawable) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setNameFormat("Worker-%d").build());
        scheduledExecutorService.scheduleWithFixedDelay(aaj_1.g(aaj_1.a(this.dwT)), 0L, 100L, TimeUnit.MILLISECONDS);
    }

    public void dispose(GLAutoDrawable gLAutoDrawable) {
    }

    public void display(GLAutoDrawable gLAutoDrawable) {
    }

    public void reshape(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }
}


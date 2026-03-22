/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.FPSAnimator
 */
import com.jogamp.opengl.util.FPSAnimator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Renamed from avW
 */
class avw_2
extends WindowAdapter {
    final /* synthetic */ FPSAnimator djn;

    avw_2(avu_2 avu_22, FPSAnimator fPSAnimator) {
        this.djn = fPSAnimator;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        new Thread(new avx_2(this)).start();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLEventListener
 *  com.jogamp.opengl.awt.GLCanvas
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.util.awt.TextureRenderer
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.awt.TextureRenderer;
import java.awt.EventQueue;
import java.awt.Frame;

/*
 * Renamed from avY
 */
class avy_2
implements GLEventListener {
    Frame djp;
    final GLCanvas djq;
    final /* synthetic */ avu_2 djr;

    avy_2(avu_2 avu_22, Frame frame, GLCanvas gLCanvas) {
        this.djr = avu_22;
        this.djp = frame;
        this.djq = gLCanvas;
    }

    public void display(GLAutoDrawable gLAutoDrawable) {
        GL gL = GLU.getCurrentGL();
        gL.glClear(16640);
        if (this.djr.diU == null) {
            return;
        }
        TextureRenderer textureRenderer = this.djr.bNF();
        int n = textureRenderer.getWidth();
        int n2 = textureRenderer.getHeight();
        textureRenderer.beginOrthoRendering(n, n2);
        textureRenderer.drawOrthoRect(0, 0);
        textureRenderer.endOrthoRendering();
        if (this.djq.getWidth() != n || this.djq.getHeight() != n2) {
            EventQueue.invokeLater(new avz_2(this, n, n2));
        }
    }

    public void dispose(GLAutoDrawable gLAutoDrawable) {
        this.djp = null;
    }

    public void init(GLAutoDrawable gLAutoDrawable) {
    }

    public void reshape(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }
}


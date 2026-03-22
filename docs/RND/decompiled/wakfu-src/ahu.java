/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAnimatorControl
 *  com.jogamp.opengl.GLAutoDrawable
 *  com.jogamp.opengl.GLCapabilities
 *  com.jogamp.opengl.GLCapabilitiesImmutable
 *  com.jogamp.opengl.GLProfile
 *  com.jogamp.opengl.awt.GLCanvas
 *  com.jogamp.opengl.util.Animator
 */
import com.jogamp.opengl.GLAnimatorControl;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLCapabilitiesImmutable;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.util.Animator;
import java.awt.event.InputMethodListener;
import java.awt.im.InputMethodRequests;

public class ahu
extends GLCanvas {
    private InputMethodRequests cxC;
    private axm_1 cnX;
    private final Animator cxD = new Animator((GLAutoDrawable)this);

    private static GLCapabilities a(ahe_0 ahe_02) {
        GLCapabilities gLCapabilities = new GLCapabilities(GLProfile.getDefault());
        gLCapabilities.setHardwareAccelerated(true);
        gLCapabilities.setDoubleBuffered(ahe_02.cyf);
        gLCapabilities.setSampleBuffers(false);
        gLCapabilities.setDepthBits(ahe_02.cyh);
        gLCapabilities.setStencilBits(ahe_02.cyi);
        switch (ahe_02.cyg) {
            case 16: {
                gLCapabilities.setRedBits(4);
                gLCapabilities.setGreenBits(4);
                gLCapabilities.setBlueBits(4);
                gLCapabilities.setAlphaBits(4);
                break;
            }
            case 32: {
                gLCapabilities.setAlphaBits(8);
            }
            case 24: {
                gLCapabilities.setRedBits(8);
                gLCapabilities.setGreenBits(8);
                gLCapabilities.setBlueBits(8);
            }
        }
        return gLCapabilities;
    }

    public ahu(ahe_0 ahe_02) {
        super((GLCapabilitiesImmutable)ahu.a(ahe_02));
    }

    public Animator bAt() {
        return this.cxD;
    }

    public axm_1 bmE() {
        return this.cnX;
    }

    public void a(axm_1 axm_12) {
        if (axm_12 != this.cnX && axm_12 != null) {
            if (this.cnX != null) {
                this.removeGLEventListener(this.cnX);
                this.removeMouseListener(this.cnX);
                this.removeMouseMotionListener(this.cnX);
                this.removeKeyListener(this.cnX);
                this.removeFocusListener(this.cnX);
            }
            this.cnX = axm_12;
            this.addGLEventListener(this.cnX);
            this.addMouseListener(this.cnX);
            this.addMouseMotionListener(this.cnX);
            this.addMouseWheelListener(this.cnX);
            this.addKeyListener(this.cnX);
            this.addFocusListener(this.cnX);
        }
    }

    public synchronized void addInputMethodListener(InputMethodListener inputMethodListener) {
        super.addInputMethodListener(inputMethodListener);
        this.enableInputMethods(true);
    }

    public synchronized void removeInputMethodListener(InputMethodListener inputMethodListener) {
        super.removeInputMethodListener(inputMethodListener);
        this.enableInputMethods(false);
    }

    public InputMethodRequests bAu() {
        return this.cxC;
    }

    public void a(InputMethodRequests inputMethodRequests) {
        this.cxC = inputMethodRequests;
    }

    public InputMethodRequests getInputMethodRequests() {
        return this.cxC;
    }

    public /* synthetic */ GLAnimatorControl getAnimator() {
        return this.bAt();
    }
}


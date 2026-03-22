/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.awt.TextureRenderer
 *  com.jogamp.opengl.util.packrect.BackingStoreManager
 *  com.jogamp.opengl.util.packrect.Rect
 */
import com.jogamp.opengl.util.awt.TextureRenderer;
import com.jogamp.opengl.util.packrect.BackingStoreManager;
import com.jogamp.opengl.util.packrect.Rect;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.Image;

/*
 * Renamed from awd
 */
class awd_1
implements BackingStoreManager {
    private Graphics2D djE;
    final /* synthetic */ avu_2 djF;

    awd_1(avu_2 avu_22) {
        this.djF = avu_22;
    }

    public Object allocateBackingStore(int n, int n2) {
        TextureRenderer textureRenderer = this.djF.diW.bNC() ? TextureRenderer.createAlphaOnlyRenderer((int)n, (int)n2, (boolean)this.djF.diT) : new TextureRenderer(n, n2, true, this.djF.diT);
        textureRenderer.setSmoothing(this.djF.dji);
        if (avu_2.diu) {
            System.err.println(" TextRenderer allocating backing store " + n + " x " + n2);
        }
        return textureRenderer;
    }

    public void deleteBackingStore(Object object) {
        ((TextureRenderer)object).dispose();
    }

    public boolean preExpand(Rect rect, int n) {
        if (n == 0) {
            if (avu_2.diu) {
                System.err.println("Clearing unused entries in preExpand(): attempt number " + n);
            }
            this.djF.bNI();
            return true;
        }
        return false;
    }

    public boolean additionFailed(Rect rect, int n) {
        this.djF.diU.clear();
        this.djF.dja.bNR();
        if (avu_2.diu) {
            System.err.println(" *** Cleared all text because addition failed ***");
        }
        return true;
    }

    public boolean canCompact() {
        return true;
    }

    public void beginMovement(Object object, Object object2) {
        TextureRenderer textureRenderer = (TextureRenderer)object2;
        this.djE = textureRenderer.createGraphics();
    }

    public void move(Object object, Rect rect, Object object2, Rect rect2) {
        TextureRenderer textureRenderer = (TextureRenderer)object;
        TextureRenderer textureRenderer2 = (TextureRenderer)object2;
        if (textureRenderer == textureRenderer2) {
            this.djE.setComposite(AlphaComposite.Src);
            this.djE.copyArea(rect.x(), rect.y(), rect.w(), rect.h(), rect2.x() - rect.x(), rect2.y() - rect.y());
        } else {
            Image image = textureRenderer.getImage();
            this.djE.setComposite(AlphaComposite.Clear);
            this.djE.drawRect(rect2.x(), rect2.y(), rect2.w(), rect2.h());
            this.djE.setComposite(AlphaComposite.Src);
            this.djE.drawImage(image, rect2.x(), rect2.y(), rect2.x() + rect2.w(), rect2.y() + rect2.h(), rect.x(), rect.y(), rect.x() + rect.w(), rect.y() + rect.h(), null);
        }
    }

    public void endMovement(Object object, Object object2) {
        this.djE.dispose();
        TextureRenderer textureRenderer = (TextureRenderer)object2;
        textureRenderer.markDirty(0, 0, textureRenderer.getWidth(), textureRenderer.getHeight());
    }
}


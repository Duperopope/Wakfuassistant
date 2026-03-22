/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public final class aeD {
    public static final aeD cnx = new aeD();
    private boolean bXs;
    JFrame bXt;
    aeG cny;
    RenderTreeStencil cnz;

    private aeD() {
    }

    public void aPg() {
        if (this.bXs) {
            return;
        }
        SwingUtilities.invokeLater(new aeE(this));
        this.bXs = true;
    }

    public void b(RenderTreeStencil renderTreeStencil) {
        this.cnz = renderTreeStencil;
    }
}


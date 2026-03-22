/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fKW
 */
public abstract class fkw_1
extends fkx_2 {
    private static Logger oO = Logger.getLogger(fkw_1.class);
    protected final Insets uHM = new Insets(0, 0, 0, 0);

    public Insets getInsets() {
        return this.uHM;
    }

    public void setInsets(Insets insets) {
        this.uHM.top = insets.top;
        this.uHM.bottom = insets.bottom;
        this.uHM.left = insets.left;
        this.uHM.right = insets.right;
    }

    @Override
    public abstract void a(Dimension var1, Insets var2, Insets var3, Insets var4);
}


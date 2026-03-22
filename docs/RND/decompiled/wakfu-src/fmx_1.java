/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fMX
 */
public class fmx_1
extends avc_2 {
    private boolean uGB;
    private final boolean uJI;

    public fmx_1() {
        this.uJI = true;
    }

    @Override
    public void c(GL2 gL2) {
        if (!this.uGB) {
            ava_2.bMH().dc(!this.uJI);
        }
    }

    public final void pj(boolean bl) {
        this.uGB = bl;
    }
}


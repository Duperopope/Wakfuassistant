/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fGc
 */
public class fgc_1
extends avc_2 {
    private final fes_2 usf;
    private boolean udN = true;

    public fgc_1(fes_2 fes_22) {
        this.usf = fes_22;
    }

    @Override
    public void c(GL2 gL2) {
        if (this.usf.getContainer() == null) {
            return;
        }
        if (this.udN) {
            axl_2 axl_22 = axl_2.t(this.usf.getScreenX() + this.usf.getAppearance().getLeftInset(), this.usf.getScreenY() + this.usf.getAppearance().getBottomInset(), this.usf.getAppearance().getContentWidth(), this.usf.getAppearance().getContentHeight());
            fyw_0.gqw().gqD().f(axl_22);
            fmt_1.gEy().g(axl_22);
            axl_2 axl_23 = fmt_1.gEy().gEA();
            ava_2.bMH().dc(true);
            ava_2.bMH().p(axl_23.getX(), axl_23.getY(), axl_23.getWidth() + 1, axl_23.getHeight() + 1);
            ava_2.bMH().h(gL2);
        } else {
            fmt_1.gEy().gEB();
            axl_2 axl_24 = fmt_1.gEy().gEA();
            if (axl_24 != null) {
                ava_2.bMH().dc(true);
                ava_2.bMH().p(axl_24.getX(), axl_24.getY(), axl_24.getWidth() + 1, axl_24.getHeight() + 1);
                ava_2.bMH().h(gL2);
            }
        }
        this.udN = !this.udN;
    }
}


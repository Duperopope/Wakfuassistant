/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fFE
 */
public class ffe_1
extends avc_2 {
    private final fes_2 uqB;
    private boolean udN = true;

    public ffe_1(fes_2 fes_22) {
        this.uqB = fes_22;
    }

    @Override
    public void c(GL2 gL2) {
        faw_2 faw_22 = this.uqB.getContainer();
        if (faw_22 == null) {
            return;
        }
        if (this.udN) {
            if (faw_22.gvs()) {
                this.uqB.setScreenPosition(this.uqB.getScreenX(), this.uqB.getScreenY());
                faw_22.setScreenPosition(faw_22.getScreenX(), faw_22.getScreenY());
                axl_2 axl_22 = faw_22.getScissor(this.uqB);
                fyw_0.gqw().gqD().f(axl_22);
                fmt_1.gEy().g(axl_22);
                axl_2 axl_23 = this.uqB.getComputedScissor();
                if (axl_23 != null) {
                    fyw_0.gqw().gqD().f(axl_23);
                    fmt_1.gEy().g(axl_23);
                }
                this.gwB();
            }
        } else if (faw_22.gvs()) {
            this.uqB.setScreenPosition(-1, -1);
            faw_22.setScreenPosition(-1, -1);
            fmt_1.gEy().gEB();
            if (this.uqB.getScissor() != null) {
                fmt_1.gEy().gEB();
            }
            this.gwB();
        }
        this.udN = !this.udN;
    }

    private void gwB() {
        axl_2 axl_22 = fmt_1.gEy().gEA();
        if (axl_22 != null) {
            ava_2 ava_22 = ava_2.bMH();
            ava_22.dc(true);
            ava_22.p(axl_22.getX(), axl_22.getY(), axl_22.getWidth() + 1, axl_22.getHeight() + 1);
        }
    }
}


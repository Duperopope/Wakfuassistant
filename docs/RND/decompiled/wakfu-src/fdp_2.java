/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from fDp
 */
class fdp_2
extends avc_2 {
    private boolean udN = true;
    final /* synthetic */ fdh_1 udO;

    fdp_2(fdh_1 fdh_12) {
        this.udO = fdh_12;
    }

    @Override
    public void c(GL2 gL2) {
        if (this.udN) {
            this.udO.ucS.setScreenPosition(this.udO.ucS.getScreenX(), this.udO.ucS.getScreenY());
            axl_2 axl_22 = this.udO.ucS.getScissor(null);
            axl_22.a(this.udO.ucU.getSize());
            axl_22.bE(axl_22.getX(), (int)((double)axl_22.getY() + this.udO.ucV));
            fyw_0.gqw().gqD().f(axl_22);
            fmt_1.gEy().g(axl_22);
            axl_2 axl_23 = fmt_1.gEy().gEA();
            ava_2.bMH().dc(true);
            ava_2.bMH().p(axl_23.getX(), axl_23.getY(), axl_23.getWidth() + 1, axl_23.getHeight() + 1);
        } else {
            this.udO.ucS.setScreenPosition(-1, -1);
            fmt_1.gEy().gEB();
            axl_2 axl_24 = fmt_1.gEy().gEA();
            if (axl_24 != null) {
                ava_2.bMH().dc(true);
                ava_2.bMH().p(axl_24.getX(), axl_24.getY(), axl_24.getWidth() + 1, axl_24.getHeight() + 1);
            }
        }
        this.udN = !this.udN;
    }
}


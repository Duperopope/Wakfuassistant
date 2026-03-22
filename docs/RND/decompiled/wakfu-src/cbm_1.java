/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.jogamp.opengl.GLAutoDrawable;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;

/*
 * Renamed from cbm
 */
public class cbm_1
implements aba_1,
afy_0,
axn_1 {
    private final cbn_1 lIL = new cbn_1();

    public static void main(String[] stringArray) {
        JDialog jDialog = new JDialog();
        jDialog.add(new cbn_1());
        jDialog.setVisible(true);
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null) {
            acd_1 acd_12 = bgt_02.eap();
            this.lIL.a(acd_12, bgt_02.aqZ());
        }
    }

    @Override
    public void b(WL wL) {
        wL.bmE().a(this);
        wL.bmE().a(this, true);
    }

    @Override
    public void c(WL wL) {
        wL.bmE().b(this);
        wL.bmE().a(this);
    }

    @Override
    public JComponent bxL() {
        return this.lIL;
    }

    @Override
    public String getName() {
        return "Position Viewer";
    }

    @Override
    public void b(GLAutoDrawable gLAutoDrawable) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, int n, int n2, int n3, int n4) {
    }

    @Override
    public void a(GLAutoDrawable gLAutoDrawable, boolean bl, boolean bl2) {
    }

    @Override
    public boolean a(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean b(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean c(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean d(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean e(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean f(MouseEvent mouseEvent) {
        return false;
    }

    @Override
    public boolean g(MouseEvent mouseEvent) {
        aam_0 aam_02 = aie_0.cfn().bmC();
        acd_1 acd_12 = aeO.a(aam_02, mouseEvent.getX(), mouseEvent.getY(), false);
        this.lIL.Y(acd_12);
        return false;
    }

    @Override
    public boolean a(MouseWheelEvent mouseWheelEvent) {
        return false;
    }
}


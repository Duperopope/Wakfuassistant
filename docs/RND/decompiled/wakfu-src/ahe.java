/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

public class ahe {
    public static final int cvJ = Integer.MAX_VALUE;
    public static final int cvK = 3000;
    public static int cvL = 3000;
    private int bUi;
    private int bMn = cvL;
    private boolean cvM = false;
    private int bRf = 0;
    private int bRg = 0;
    private final EntityText cvN = (EntityText)EntityText.djS.bSK();

    public static void sp(int n) {
        cvL = n;
    }

    public static int bzF() {
        return cvL;
    }

    public ahe(awh_2 awh_22) {
        GLGeometryText gLGeometryText = (GLGeometryText)GLGeometryText.dbI.bSK();
        GeometryBackground geometryBackground = (GeometryBackground)GLGeometryBackground.dbH.bSK();
        this.cvN.a(awv_1.dlQ);
        this.cvN.a(gLGeometryText);
        this.cvN.a(geometryBackground);
        this.cvN.a(awh_22);
        GeometryBackground geometryBackground2 = this.cvN.bOe();
        ahf ahf2 = new ahf();
        geometryBackground2.a(ahf2.bnE(), ahf2.bnF());
        geometryBackground2.b(ahf2.bnG());
        geometryBackground2.a(ahf2.bnH());
        geometryBackground2.u(ahf2.getLeftMargin(), ahf2.getRightMargin(), ahf2.getTopMargin(), ahf2.getBottomMargin());
        gLGeometryText.bsI();
        geometryBackground2.bsI();
    }

    public void k(float f2, float f3, float f4, float f5) {
        this.cvN.bOe().c(f2, f3, f4, f5);
    }

    public axb_2 getBackgroundColor() {
        return this.cvN.bOe().getColor();
    }

    public void l(float f2, float f3, float f4, float f5) {
        this.cvN.bOe().t(f2, f3, f4, f5);
    }

    public axb_2 getBorderColor() {
        return this.cvN.bOe().bOv();
    }

    public int getDuration() {
        return this.bMn;
    }

    public void setDuration(int n) {
        this.bMn = n;
    }

    public void setOffset(int n, int n2) {
        this.bRf = n;
        this.bRg = n2;
    }

    public int getXOffset() {
        return this.bRf;
    }

    public int getYOffset() {
        return this.bRg;
    }

    protected float bzG() {
        return this.bRf;
    }

    protected float bzH() {
        return this.bRg;
    }

    public void setVisible(boolean bl) {
        if (!bl && this.cvN.bOf() != null && !this.cvN.bOf().isEmpty()) {
            this.cvM = false;
            this.bUi = 0;
        }
        this.cvN.setVisible(bl);
    }

    public void qy(int n) {
        if (this.cvN.bOf() == null) {
            return;
        }
        if (!this.cvN.isVisible()) {
            this.cvM = false;
            return;
        }
        if (this.bMn == Integer.MAX_VALUE) {
            return;
        }
        this.bUi += n;
        if (!this.cvM) {
            this.bUi = 0;
            this.cvM = true;
        }
        if (this.bUi >= this.bMn) {
            this.setVisible(false);
            this.cvM = false;
            return;
        }
    }

    public final EntityText bzI() {
        return this.cvN;
    }

    public final String bzJ() {
        return this.cvN.bOf();
    }

    public final void eM(String string) {
        this.cvN.gt(string);
    }

    public final void m(float f2, float f3, float f4, float f5) {
        this.cvN.c(f2, f3, f4, f5);
    }

    public final void b(awh_2 awh_22) {
        this.cvN.a(awh_22);
    }

    public final void aW(float f2, float f3) {
        this.cvN.a(new acr_1(f2, f3, 0.0f));
    }

    public final void cH(float f2) {
        this.cvN.bOe().dc(f2);
    }

    public final void sq(int n) {
        this.cvN.uL(n);
    }
}


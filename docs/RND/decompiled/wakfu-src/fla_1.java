/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLa
 */
public class fla_1
extends fkw_1 {
    private final Xl uHP = new Xl();
    private Xm uHQ = new Xm();
    private EntityText bRh;
    private boolean nav = true;
    private int bap;
    private int baq;
    private int brs;
    private int brt;

    public fla_1() {
        super.setInsets(new Insets(this.uHP.getTopMargin(), this.uHP.getLeftMargin(), this.uHP.getBottomMargin(), this.uHP.getRightMargin()));
    }

    public void setSparkAngle(float f2) {
        this.uHP.setSparkAngle(f2);
        this.gDl();
    }

    public void setDisplaySpark(boolean bl) {
        this.uHP.bx(bl);
        this.gDl();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.bap = insets.left;
        this.baq = insets.bottom;
        this.brs = dimension.width - insets.left - insets.right;
        this.brt = dimension.height - insets.bottom - insets.top;
        this.bRh.a(new acr_1(this.bap, this.baq, 0.0f));
        this.bRh.uM(this.brs - (insets2.left + insets2.right));
        this.bRh.uN(this.brt - (insets2.bottom + insets2.top));
    }

    private void gDl() {
        this.bRh.bOe().a(this.uHP.bnE(), this.uHP.bnF());
    }

    @Override
    public Entity getEntity() {
        return this.bRh;
    }

    @Override
    public void aVH() {
        this.bRh.bsI();
        this.bRh = null;
    }

    @Override
    public void aVI() {
        assert (this.bRh == null);
        this.bRh = (EntityText)EntityText.djS.bSK();
        GLGeometryText gLGeometryText = (GLGeometryText)GLGeometryText.dbI.bSK();
        GLGeometryBackground gLGeometryBackground = (GLGeometryBackground)GLGeometryBackground.dbH.bSK();
        this.bRh.a(gLGeometryText);
        this.bRh.a(gLGeometryBackground);
        this.bRh.a(awv_1.dlQ);
        gLGeometryBackground.a(this.uHP.bnE(), this.uHP.bnF());
        gLGeometryBackground.b(this.uHP.bnG());
        gLGeometryBackground.a(this.uHP.bnH());
        gLGeometryBackground.u(this.uHP.getLeftMargin(), this.uHP.getRightMargin(), this.uHP.getTopMargin(), this.uHP.getBottomMargin());
        gLGeometryText.bsI();
        gLGeometryBackground.bsI();
    }

    @Override
    public void setInsets(Insets insets) {
    }
}


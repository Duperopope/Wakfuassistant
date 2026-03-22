/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLk
 */
public class flk_1
extends fkv_1 {
    protected EntitySprite urc;
    protected axb_2 chO;
    protected axb_2 ncL;

    public void q(float[] fArray) {
        assert (fArray != null) : "Color components array can't be null";
        assert (fArray.length == 4) : "Color components size must be equal to 4";
        this.chO = new awx_2(fArray[0], fArray[1], fArray[2], fArray[3]);
        this.urc.b(this.chO);
    }

    public void setColor(axb_2 axb_22) {
        assert (axb_22 != null) : "Color can't be null";
        if (this.chO != null && this.chO.aTn() == axb_22.aTn()) {
            return;
        }
        this.chO = axb_22;
        this.gwq();
    }

    private void gwq() {
        if (this.urc == null) {
            return;
        }
        float f2 = this.chO != null ? this.chO.aIU() : 1.0f;
        float f3 = this.chO != null ? this.chO.aIV() : 1.0f;
        float f4 = this.chO != null ? this.chO.aIW() : 1.0f;
        float f5 = this.chO != null ? this.chO.aIX() : 1.0f;
        this.urc.c(f2 *= this.ncL != null ? this.ncL.aIU() : 1.0f, f3 *= this.ncL != null ? this.ncL.aIV() : 1.0f, f4 *= this.ncL != null ? this.ncL.aIW() : 1.0f, f5 *= this.ncL != null ? this.ncL.aIX() : 1.0f);
    }

    public final axb_2 gDp() {
        return this.chO;
    }

    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        this.gwq();
    }

    public final EntitySprite gDq() {
        return this.urc;
    }

    @Override
    public void aVH() {
        this.ncL = null;
        this.chO = null;
        this.urc.bsI();
        this.urc = null;
    }

    @Override
    public void aVI() {
        assert (this.urc == null) : "Object is already checked out";
        this.urc = (EntitySprite)EntitySprite.cXk.bSK();
        this.urc.cWR = this;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        this.urc.a(geometrySprite);
        geometrySprite.bsI();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = dimension.width - insets.right - insets2.right - insets.left - insets2.left;
        int n2 = dimension.height - insets.top - insets2.top - insets.bottom - insets2.bottom;
        int n3 = insets.left + insets2.left;
        int n4 = insets.bottom + insets2.bottom + n2;
        this.urc.e(n4, n3, n, n2);
    }

    @Override
    public /* synthetic */ Entity getEntity() {
        return this.gDq();
    }
}


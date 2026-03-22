/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Insets;

/*
 * Renamed from fGd
 */
public final class fgd_1 {
    private axb_2 ncL;
    private int bap;
    private int baq;
    private int usg;
    private int ush;
    private boolean dmq;
    private boolean uje = false;
    private EntitySprite urc;

    public int getX() {
        return this.bap;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public int getY() {
        return this.baq;
    }

    public void setY(int n) {
        this.baq = n;
    }

    public int getHeight() {
        return this.ush;
    }

    public int getWidth() {
        return this.usg;
    }

    public void setSize(int n, int n2) {
        this.usg = n;
        this.ush = n2;
    }

    public void setModulationColor(axb_2 axb_22) {
        if (axb_22 == this.ncL) {
            return;
        }
        if (axb_22 != null) {
            this.urc.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        } else {
            this.urc.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.ncL = axb_22;
    }

    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public void setFlipVerticaly(boolean bl) {
        this.dmq = bl;
    }

    public void a(awr_1 awr_12, Insets insets, Insets insets2, Insets insets3) {
        if (this.urc == null) {
            return;
        }
        if (awr_12 == null || !awr_12.bPN()) {
            this.urc.setVisible(false);
            return;
        }
        int n = insets2.right + insets3.left + insets3.right;
        int n2 = insets.left + insets2.left + insets3.left;
        int n3 = insets.top + insets.bottom + insets2.top;
        int n4 = insets.bottom + insets2.bottom + insets3.bottom;
        int n5 = this.usg - (n2 + n);
        int n6 = this.ush - (n3 + n4);
        int n7 = awr_12.bPO();
        int n8 = awr_12.bPP();
        if (n6 == 0 || n8 == 0) {
            this.urc.setVisible(false);
            return;
        }
        float f2 = (float)n5 / (float)n6;
        float f3 = (float)n7 / (float)n8;
        if (!this.uje || GC.c(f2, f3, 0.01f)) {
            this.urc.e(this.ush - n3, n2, n5, n6);
        } else if (f2 > f3) {
            float f4 = (float)n6 * f3;
            float f5 = ((float)n5 - f4) / 2.0f;
            this.urc.e(this.ush - n3, (float)n2 + f5, Math.round(f4), n6);
        } else {
            float f6 = (float)n5 / f3;
            float f7 = ((float)n6 - f6) / 2.0f;
            this.urc.e((float)(this.ush - n3) - f7, n2, n5, Math.round(f6));
        }
        this.urc.setVisible(true);
        if (this.ncL != null) {
            this.urc.b(this.ncL);
        } else {
            this.urc.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.urc.setTexture(awr_12.bHg());
        this.urc.bIS().d(0, -this.usg / 2, -this.ush / 2);
        this.urc.bIS().d(1, this.usg / 2, this.ush / 2);
        this.a(awr_12);
    }

    private void a(awr_1 awr_12) {
        float f2 = this.dmq ? awr_12.aKr() : awr_12.aKp();
        float f3 = this.dmq ? awr_12.aKp() : awr_12.aKr();
        float f4 = awr_12.aKq();
        float f5 = awr_12.aKs();
        this.urc.bJm().a(f2, f4, f3, f5, asp_1.dac);
    }

    public void aVH() {
        this.ncL = null;
        this.urc.bsI();
        this.urc = null;
    }

    public void aVI() {
        assert (this.urc == null);
        this.urc = (EntitySprite)EntitySprite.cXk.bSK();
        this.urc.cWR = this;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        this.urc.a(geometrySprite);
        geometrySprite.bsI();
        BatchTransformer batchTransformer = this.urc.bIS();
        batchTransformer.a(new awp_1());
        batchTransformer.a(new awp_1());
    }

    public Entity getEntity() {
        return this.urc;
    }

    public void setKeepRatio(boolean bl) {
        this.uje = bl;
    }
}


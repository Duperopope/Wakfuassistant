/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from fFQ
 */
public final class ffq_1 {
    private static final Logger urb = Logger.getLogger(ffq_1.class);
    private axb_2 ncL;
    private String tEm;
    private awg_1 tEC;
    private int bap;
    private int baq;
    private int brt;
    private int brs;
    private fzz_0 tFh = fzz_0.tGn;
    private boolean uqu;
    private boolean dmp;
    private boolean dmq;
    private EntitySprite urc;
    public boolean bmg = true;
    private final ach_1 urd = new ach_1();

    public boolean isVisible() {
        return this.bmg;
    }

    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

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
        return this.brt;
    }

    public void setHeight(int n) {
        this.brt = n;
    }

    public int getWidth() {
        return this.brs;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public fzz_0 getShape() {
        return this.tFh;
    }

    public void setShape(fzz_0 fzz_02) {
        this.tFh = fzz_02;
    }

    public void setPixmap(awg_1 awg_12) {
        this.tEC = awg_12;
        if (this.tEC != null) {
            this.uqu = true;
        }
    }

    public awg_1 getPixmap() {
        return this.tEC;
    }

    public boolean gwN() {
        return this.uqu;
    }

    public void b(acp_1 acp_12, float f2) {
        awp_1 awp_12 = (awp_1)this.urc.bIS().uW(1);
        this.urd.a(acp_12, f2);
        awp_12.a(this.urd);
        if (acp_12 == acp_1.dAV || acp_12 == acp_1.dAU) {
            float f3 = awp_12.bPy().bVA();
            float f4 = awp_12.bPy().bVB();
            awp_12.A(f3, f4, -(this.getWidth() / 2));
        }
        this.urc.bIS().b(1, awp_12);
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

    public boolean bOU() {
        return this.dmp;
    }

    public void setFlipHorizontaly(boolean bl) {
        this.dmp = bl;
    }

    public boolean bOV() {
        return this.dmq;
    }

    public void setFlipVerticaly(boolean bl) {
        this.dmq = bl;
    }

    public String getShader() {
        return this.tEm;
    }

    public void setShader(String string) {
        this.tEm = string;
        this.eqb();
    }

    public void a(fsm_1 fsm_12, Insets insets, Insets insets2, Insets insets3) {
        if (this.tEC == null || this.tEC.bHg() == null || !this.bmg) {
            this.urc.setVisible(false);
            return;
        }
        this.urc.setVisible(true);
        int n = insets.left + insets2.left + insets3.left;
        int n2 = insets.bottom + insets2.bottom + insets3.bottom;
        this.urc.e(n2 + this.brt + this.baq, n + this.bap, this.brs, this.brt);
        if (this.ncL != null) {
            this.urc.b(this.ncL);
        } else {
            this.urc.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        this.tEC.bOY();
        this.urc.setTexture(this.tEC.bHg());
        this.urc.bIS().d(0, -this.brs / 2, -this.brt / 2);
        this.urc.bIS().d(1, this.brs / 2, this.brt / 2);
        if (this.dmp) {
            if (this.dmq) {
                this.urc.bJm().a(this.tEC.aKr(), this.tEC.aKs(), this.tEC.aKp(), this.tEC.aKq(), this.tEC.getRotation());
            } else {
                this.urc.bJm().a(this.tEC.aKp(), this.tEC.aKs(), this.tEC.aKr(), this.tEC.aKq(), this.tEC.getRotation());
            }
        } else if (this.dmq) {
            this.urc.bJm().a(this.tEC.aKr(), this.tEC.aKq(), this.tEC.aKp(), this.tEC.aKs(), this.tEC.getRotation());
        } else {
            this.urc.bJm().a(this.tEC.aKp(), this.tEC.aKq(), this.tEC.aKr(), this.tEC.aKs(), this.tEC.getRotation());
        }
        this.eqb();
    }

    private void eqb() {
        if (BH.aU(this.tEm)) {
            if (avh_2.dhF.bMU()) {
                this.urc.a(null, 0, null);
            } else {
                this.urc.bJa();
            }
            return;
        }
        int n = arn_2.fW(this.tEm);
        asr_1 asr_12 = ast_1.bJG().bJI();
        if (asr_12 != null && asr_12.un(n)) {
            this.urc.a(asr_12, n, asa_1.cZh);
        } else {
            urb.error((Object)("technic invalide " + this.tEm));
        }
    }

    public void aVH() {
        this.tEC = null;
        this.ncL = null;
        this.tEm = null;
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
        this.bmg = true;
    }

    public Entity getEntity() {
        return this.urc;
    }

    public ach_1 gwO() {
        return this.urd;
    }

    public void B(float f2, float f3, float f4) {
        awp_1 awp_12 = (awp_1)this.urc.bIS().uW(1);
        awp_12.B(f2, f3, f4);
        this.urc.bIS().b(1, awp_12);
    }
}


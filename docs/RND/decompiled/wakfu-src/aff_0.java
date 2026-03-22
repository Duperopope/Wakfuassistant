/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

/*
 * Renamed from afF
 */
public abstract class aff_0
extends aam_0 {
    protected final WL cqI;
    private float cqJ;
    private float cqK;
    private float cqL;
    private boolean cqM;
    private final EntitySprite cqN;

    protected aff_0(WL wL) {
        this.cqI = wL;
        this.cqJ = 25.0f;
        this.cqK = 0.0f;
        this.cqL = 2.0f;
        this.cqM = false;
        this.cqN = (EntitySprite)EntitySprite.cXk.bSJ();
        this.cqN.cWR = this;
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.dbk.bSJ();
        this.cqN.a(gLGeometrySprite);
        gLGeometrySprite.bsI();
        this.cqN.c(0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void init(GLAutoDrawable gLAutoDrawable) {
        super.init(gLAutoDrawable);
        this.cqI.bnb();
    }

    @Override
    public void b(GL2 gL2) {
        if (!asj_2.bJt().bJu() && this.bYq) {
            gL2.glClearColor(this.bYp.aIU(), this.bYp.aIV(), this.bYp.aIW(), this.bYp.aIX());
            this.bYq = false;
        }
        if (this.cqK <= 0.0f) {
            super.b(gL2);
            return;
        }
        gL2.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        int n = (int)(this.cqK * this.drE / 100.0f);
        super.b(gL2);
        atg_2 atg_22 = aru_2.cVG.bIv();
        ((art_1)atg_22).b(Matrix44.dAe);
        this.cqN.e(-this.drE / 2.0f + (float)(n / 2), -this.drD / 2.0f, (int)this.drD, n / 2);
        this.cqN.b(atg_22);
        this.cqN.e(this.drE / 2.0f, -this.drD / 2.0f, (int)this.drD, n / 2);
        this.cqN.b(atg_22);
        gL2.glClearColor(this.bYp.aIU(), this.bYp.aIV(), this.bYp.aIW(), this.bYp.aIX());
    }

    @Override
    public void qy(int n) {
        super.qy(n);
        if (this.cqM) {
            this.cqK += this.cqJ * this.cqL * (float)n / 1000.0f;
            if (this.cqK > this.cqJ) {
                this.cqK = this.cqJ;
            }
        } else if (this.cqK > 0.0f) {
            this.cqK -= this.cqJ * this.cqL * (float)n / 1000.0f;
            if (this.cqK < 0.0f) {
                this.cqK = 0.0f;
            }
        }
    }

    public final void a(ame_1 ame_12) {
        aag_0 aag_02 = this.bqL();
        aag_02.bD(ame_12.bCQ(), ame_12.bCR());
        aag_02.cz(aag_02.getZoomFactor());
    }

    public void cs(float f2) {
        this.cqJ = f2;
    }

    public void ct(float f2) {
        this.cqK = f2;
    }

    public void cu(float f2) {
        this.cqL = f2;
    }

    public void cm(boolean bl) {
        this.cqM = bl;
    }

    @Override
    public void bqQ() {
        super.bqQ();
        this.cqN.bsI();
    }
}


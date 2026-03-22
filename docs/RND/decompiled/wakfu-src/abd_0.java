/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;

/*
 * Renamed from abD
 */
public class abd_0
extends abb_0 {
    private EntitySprite bYW;
    private float axp;
    private float axq;
    private float axr;
    private float ayP;
    private final Matrix44 cdY = (Matrix44)Matrix44.dAb.bSJ();
    private final Matrix44 cdZ = (Matrix44)Matrix44.dAb.bSJ();
    private final Matrix44 cea = (Matrix44)Matrix44.dAb.bSJ();

    public abd_0() {
        this.bYW = (EntitySprite)EntitySprite.cXk.bSK();
        this.bYW.cWR = this;
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.dbk.bSK();
        this.bYW.a(gLGeometrySprite);
        this.bYW.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.bYW.e(1.0f, -1.0f, 2, 2);
        this.bYW.n(0.0f, 0.0f, 1.0f, 1.0f);
        gLGeometrySprite.bsI();
    }

    @Override
    public void clear() {
        this.bYW.bsI();
        this.bYW = null;
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        float f2 = this.bnY();
        this.bYW.c(this.axp * f2, this.axq * f2, this.axr * f2, this.ayP * f2);
    }

    @Override
    public void b(art_1 art_12) {
        GL2 gL2 = art_12.bIq();
        ava_2 ava_22 = ava_2.bMH();
        this.cdZ.c(art_12.bIp());
        this.cdY.c(art_12.bIo());
        gL2.glGetFloatv(2983, this.cea.bQE(), 0);
        art_12.a(Matrix44.dAe);
        art_12.b(Matrix44.dAe);
        ava_22.a(gL2, auy_2.dfW, Matrix44.dAe);
        this.bYW.b(art_12);
        art_12.a(this.cdY);
        art_12.b(this.cdZ);
        ava_22.a(gL2, auy_2.dfW, this.cea);
    }

    public void eh(String string) {
        if (string != null) {
            String string2 = arn_2.bIc().bIe() + "textures/" + string;
            long l = 0xEE00EE0000000000L ^ (long)arn_2.fX(string2);
            awk_1 awk_12 = awm_1.bPn().a((art_1)aru_2.cVG.bIv(), l, string2, false);
            this.bYW.setTexture(awk_12);
        } else {
            this.bYW.setTexture(null);
        }
    }

    public void c(float f2, float f3, float f4, float f5) {
        this.axp = f2;
        this.axq = f3;
        this.axr = f4;
        this.ayP = f5;
    }

    public void aw(float f2, float f3) {
        this.bYW.bIT().A(f2, f3, 0.0f);
    }

    public void aG(float f2, float f3) {
        this.bYW.bIT().B(f2, f3, 1.0f);
    }

    public void a(auw_2 auw_22, auw_2 auw_23) {
        this.bYW.bJm().c(auw_22, auw_23);
    }

    @Override
    public int btf() {
        return 1;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.kernel.core.maths.Matrix44;

public class aJr
extends abb_0 {
    private static final float eaL = 0.9f;
    public static final String eaM = "ibmplexsans";
    public static final int eaN = 30;
    public static final int eaO = 0;
    private float axp = 1.0f;
    private float axq = 1.0f;
    private float axr = 1.0f;
    private float ayP = 1.0f;
    private final EntityText eaP;
    private final Matrix44 eaQ = new Matrix44(Matrix44.dAe);
    private final Matrix44 eaR = new Matrix44(Matrix44.dAe);

    public aJr(String string, int n, int n2) {
        this(awk_2.f(string, n, n2));
    }

    public aJr(awh_2 awh_22) {
        this.eaP = (EntityText)EntityText.djS.bSJ();
        GLGeometryText gLGeometryText = (GLGeometryText)GLGeometryText.dbI.bSK();
        this.eaP.a(gLGeometryText);
        this.eaP.uL(Math.min(1320, (int)(aie_0.cfn().cft().bRq() * 0.9f)));
        this.eaP.a(awh_22);
        this.eaP.a(awv_1.dlO);
        this.eaP.a(new acr_1(0.0f, 0.0f, 0.0f));
        this.eaP.setVisible(true);
        gLGeometryText.bsI();
    }

    @Override
    public void clear() {
        this.eaP.bsI();
    }

    @Override
    public void qF(int n) {
        super.qF(n);
        float f2 = this.bnY();
        this.eaP.c(this.axp, this.axq, this.axr, this.ayP * f2);
    }

    @Override
    public void b(art_1 art_12) {
        this.eaQ.c(art_12.bIp());
        this.eaR.c(art_12.bIo());
        art_12.a(Matrix44.dAe);
        art_12.b(Matrix44.dAe);
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.dbl.uu(13);
        this.eaP.b(art_12);
        art_12.a(this.eaR);
        art_12.b(this.eaQ);
    }

    public void c(float f2, float f3, float f4, float f5) {
        this.axp = f2;
        this.axq = f3;
        this.axr = f4;
        this.ayP = f5;
    }

    public void setText(String string) {
        this.eaP.gt(string);
    }

    @Override
    public int btf() {
        return 2;
    }
}


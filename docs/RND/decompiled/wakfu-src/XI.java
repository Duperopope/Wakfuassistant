/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText;
import com.ankamagames.framework.graphics.engine.text.EntityText;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.ankamagames.framework.graphics.engine.text.GeometryText;

public class XI
extends Xn {
    private final Entity3D bSK;
    private final EntityText bSL;
    private final EntityGroup bSM;
    private anz_1 bRe;
    private final xm_0 bSN;
    private float aPY;
    private float aPZ;
    private int bRf;
    private int bRg;
    private int o;
    private int bIi = 6;
    private boolean bmg = true;
    private int bSO = 10;
    private final awx_2 bSP = new awx_2(awx_2.dnF);

    public XI(String string, awh_2 awh_22, String string2, xm_0 xm_02, int n, int n2) {
        this(awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false), awh_22, string2, xm_02, n, n2);
    }

    public XI(awk_1 awk_12, awh_2 awh_22, String string, xm_0 xm_02, int n, int n2) {
        this.bSN = xm_02;
        this.bSK = (Entity3D)Entity3D.cXb.bSK();
        this.bSK.bIS().a(new awp_1());
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        int n3 = n == -1 ? awk_12.ve(0).getWidth() : n;
        int n4 = n2 == -1 ? awk_12.ve(0).getHeight() : n2;
        geometrySprite.f(n2, 0.0f, n3, n4);
        geometrySprite.o(0.0f, 0.0f, 1.0f, 1.0f);
        this.bSK.a(geometrySprite, awk_12, null);
        geometrySprite.bsI();
        this.bSL = (EntityText)EntityText.djS.bSK();
        GeometryText geometryText = (GeometryText)GLGeometryText.dbI.bSK();
        geometryText.dd(0.0f);
        geometryText.de(0.0f);
        this.bSL.a((GeometryBackground)null);
        this.bSL.a(geometryText);
        this.bSL.a(awh_22);
        this.bSL.gt(string);
        this.bSL.ce(0, 0);
        geometryText.bsI();
        this.bSM = (EntityGroup)EntityGroup.cXh.bSK();
        this.bSM.bIS().a(new awp_1());
        this.bSM.g(this.bSK);
        this.bSM.g(this.bSL);
        this.bSM.c(1.0f, 1.0f, 1.0f, 0.0f);
    }

    public void setGap(int n) {
        this.bSO = n;
    }

    public void bG(float f2) {
        this.bSL.setZoom(f2);
    }

    public void setTextColor(axb_2 axb_22) {
        this.bSP.c(axb_22);
    }

    @Override
    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    @Override
    public anz_1 bnp() {
        return this.bRe;
    }

    @Override
    public void a(anz_1 anz_12) {
        this.bRe = anz_12;
    }

    @Override
    public int getXOffset() {
        return this.bRf;
    }

    @Override
    public void setXOffset(int n) {
        this.bRf = n;
    }

    @Override
    public int getYOffset() {
        return this.bRg;
    }

    @Override
    public void setYOffset(int n) {
        this.bRg = n;
    }

    @Override
    public float getWorldX() {
        if (this.bRe != null) {
            return this.bRe.getWorldX();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.bRe != null) {
            return this.bRe.getWorldY();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.bRe != null) {
            return this.bRe.getAltitude();
        }
        return 0.0f;
    }

    void bnK() {
        this.bSK.bIS().uW(0).A(0.0f, 0.0f, -1.0f);
        int n = ((GeometrySprite)this.bSK.uh(0)).bKr();
        int n2 = (int)((float)this.bSL.bOh() * this.bSL.getZoom() / 2.0f);
        int n3 = ((GeometrySprite)this.bSK.uh(0)).bKs() / 2;
        int n4 = (int)((float)this.bSL.bOi() * this.bSL.getZoom() / 4.0f);
        int n5 = n3 - n4;
        this.bSL.a(new acr_1(n + this.bSO + n2, n5, -1.0f));
        this.getEntity().bIS().d(0, this.aPY, this.aPZ);
    }

    @Override
    public void b(float f2, float f3, float f4, float f5) {
        this.aPY = f2 + f4;
        this.aPZ = f3 + f5;
        this.bnK();
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        super.qy(n);
        if (this.bmg) {
            this.bSN.a(this, n);
        }
    }

    @Override
    public int d() {
        return this.o;
    }

    @Override
    public void lK(int n) {
        this.o = n;
    }

    @Override
    public int aHp() {
        return this.bIi;
    }

    @Override
    public void ma(int n) {
        this.bIi = n;
    }

    @Override
    public Entity getEntity() {
        return this.bSM;
    }

    int bnQ() {
        int n = ((GeometrySprite)this.bSK.uh(0)).bKr();
        int n2 = GC.A((float)this.bSL.bOh() * this.bSL.getZoom());
        return n + this.bSO + n2;
    }

    @Override
    public void bmX() {
        this.bSL.bsI();
        this.bSK.bsI();
        this.bSM.bsI();
        this.bRe = null;
    }

    @Override
    public boolean bnr() {
        return true;
    }

    void bH(float f2) {
        this.bSK.c(1.0f, 1.0f, 1.0f, f2);
    }

    void bI(float f2) {
        this.bSL.c(this.bSP.aIU(), this.bSP.aIV(), this.bSP.aIW(), f2);
    }
}


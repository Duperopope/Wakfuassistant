/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Xo
 */
public class xo_0
extends Xn {
    private final Entity3D bRE;
    private anz_1 bRe;
    private final xu_0 bRF;
    private float aPY;
    private float aPZ;
    private int bRf;
    private int bRg;
    private int o;
    private int bIi = 4;
    private boolean bmg = true;
    public static final int bRG = -1;

    @Override
    public void setVisible(boolean bl) {
        this.bmg = bl;
    }

    public xo_0(String string, int n, int n2, xu_0 xu_02, int n3) {
        this(awm_1.bPn().b((art_1)aru_2.cVG.bIv(), (long)arn_2.fX(string), string, false), n, n2, xu_02, n3);
    }

    public xo_0(awk_1 awk_12, int n, int n2, xu_0 xu_02, int n3) {
        this.bRF = xu_02;
        this.bMn = n3;
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        this.bRE.bIS().a(new awp_1());
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        if (n == -1) {
            n = awk_12.ve(0).getWidth();
        }
        if (n2 == -1) {
            n2 = awk_12.ve(0).getHeight();
        }
        geometrySprite.f(n2, 0.0f, n, n2);
        geometrySprite.o(0.0f, 0.0f, 1.0f, 1.0f);
        this.bRE.a(geometrySprite, awk_12, null);
        geometrySprite.bsI();
        this.bRE.c(1.0f, 1.0f, 1.0f, 0.0f);
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
        this.bnL().bIS().d(0, this.aPY, this.aPZ);
    }

    @Override
    public void b(float f2, float f3, float f4, float f5) {
        this.aPY = f2 + f4;
        this.aPZ = f3 + f5;
        this.bnK();
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

    public Entity3D bnL() {
        return this.bRE;
    }

    public void bnz() {
        this.bRl = 0;
    }

    @Override
    public void qy(int n) {
        super.qy(n);
        if (this.bmg) {
            this.bRF.a(this, n);
        }
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        this.qy(n);
    }

    @Override
    public void bmX() {
        this.bRE.bsI();
        this.bRe = null;
    }

    @Override
    public boolean bnr() {
        return true;
    }

    public float aSc() {
        return this.aPY;
    }

    public float aSd() {
        return this.aPZ;
    }

    @Override
    public /* synthetic */ Entity getEntity() {
        return this.bnL();
    }
}


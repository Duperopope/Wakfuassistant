/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Xq
 */
public class xq_0
implements xu_0 {
    private final aaj_0 bRH;
    private final xn_0 bRI;
    private float bRJ;
    private float bRK;
    private float bRL;
    private float bRM = -1.0f;
    private float bRN = -1.0f;
    private int bRO = -1;
    private int bRP = -1;

    public xq_0(aaj_0 aaj_02, xn_0 xn_02) {
        this.bRH = aaj_02;
        this.bRI = xn_02;
    }

    private void bnM() {
        aag_0 aag_02 = this.bRH.bqL();
        this.bRL = aag_02.byB();
        int n = aag_02.byK();
        int n2 = aag_02.byL();
        int n3 = (int)((float)this.bRI.getScreenX() / this.bRL);
        int n4 = (int)((float)this.bRI.getScreenY() / this.bRL);
        this.bRJ = n3 + n;
        this.bRK = n4 + n2;
    }

    @Override
    public void a(xo_0 xo_02, int n) {
        int n2;
        int n3 = xo_02.bnA();
        int n4 = xo_02.getDuration();
        Entity3D entity3D = xo_02.bnL();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)entity3D.uh(0);
        int n5 = n2 = n4 / 2;
        int n6 = n4 / 2;
        int n7 = gLGeometrySprite.bKs();
        int n8 = gLGeometrySprite.bKr();
        this.bnM();
        if (xo_02.aSc() != 0.0f || xo_02.aSd() != 0.0f) {
            if (this.bRM == -1.0f) {
                this.bRM = this.bRJ - xo_02.aSc();
            }
            if (this.bRN == -1.0f) {
                this.bRN = this.bRK - xo_02.aSd();
            }
            xo_02.setYOffset((int)this.bRN);
            xo_02.setXOffset((int)this.bRM);
            xo_02.bnL().c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (this.bRO == -1) {
            this.bRO = n8;
        }
        if (this.bRP == -1) {
            this.bRP = n7;
        }
        if (n3 > n5) {
            int n9 = n3 - n5;
            xo_02.setYOffset((int)XG.d(n9, 60.0f, 40.0f, n6));
            xo_02.setXOffset(-gLGeometrySprite.bKr() / 2);
            float f2 = (float)n6 * 0.8f;
            float f3 = GC.b(XG.d(Math.min((float)n9, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f);
            xo_02.bnL().c(1.0f, 1.0f, 1.0f, f3);
        } else {
            int n10 = Math.round(XG.d(n3, this.bRM, -this.bRM - (float)(n8 / 2), n2));
            int n11 = Math.round(XG.d(n3, this.bRN, -this.bRN + 60.0f, n2));
            xo_02.setXOffset(n10);
            xo_02.setYOffset(n11);
        }
        xo_02.bnK();
    }
}


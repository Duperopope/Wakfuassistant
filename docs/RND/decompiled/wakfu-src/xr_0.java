/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Xr
 */
public class xr_0
implements xu_0 {
    private final aaj_0 bRQ;
    private final xn_0 bRR;
    private float bRJ;
    private float bRK;
    private float bRL;
    private float bRS = -1.0f;
    private float bRT = -1.0f;
    private int bRO = -1;
    private int bRP = -1;

    public xr_0(aaj_0 aaj_02, xn_0 xn_02) {
        this.bRQ = aaj_02;
        this.bRR = xn_02;
    }

    private void bnM() {
        aag_0 aag_02 = this.bRQ.bqL();
        this.bRL = aag_02.byB();
        int n = aag_02.byK();
        int n2 = aag_02.byL();
        int n3 = (int)((float)this.bRR.getScreenX() / this.bRL);
        int n4 = (int)((float)this.bRR.getScreenY() / this.bRL);
        this.bRJ = n3 + n;
        this.bRK = n4 + n2;
    }

    @Override
    public void a(xo_0 xo_02, int n) {
        int n2 = xo_02.bnA();
        int n3 = xo_02.getDuration();
        Entity3D entity3D = xo_02.bnL();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)entity3D.uh(0);
        int n4 = Math.min(250, n3 / 4);
        int n5 = n3 / 2;
        int n6 = gLGeometrySprite.bKs();
        int n7 = gLGeometrySprite.bKr();
        if (n2 > n5) {
            this.bnM();
            if (this.bRS == -1.0f) {
                this.bRS = xo_02.getXOffset();
            }
            if (this.bRT == -1.0f) {
                this.bRT = xo_02.getYOffset();
            }
            if (this.bRO == -1) {
                this.bRO = n7;
            }
            if (this.bRP == -1) {
                this.bRP = n6;
            }
            int n8 = n2 - n5;
            int n9 = n3 - n5;
            int n10 = Math.round(XG.e(n8, this.bRS, this.bRJ - (xo_02.aSc() - (float)xo_02.getXOffset()), n9));
            int n11 = Math.round(XG.e(n8, this.bRT, this.bRK - (xo_02.aSd() - (float)xo_02.getYOffset()), n9));
            xo_02.setXOffset(n10);
            xo_02.setYOffset(n11);
            if (n7 > 0 && n6 > 0) {
                int n12 = Math.max(0, (int)((float)n7 - ((float)n7 - XG.e(n8, this.bRO, 0.0f, n3))));
                int n13 = Math.max(0, (int)((float)n6 - ((float)n6 - XG.e(n8, this.bRP, 0.0f, n3))));
                gLGeometrySprite.cb(n12, n13);
            }
        } else if (n2 < n4) {
            float f2 = XG.d(n2, 0.0f, 1.0f, n4);
            gLGeometrySprite.cb((int)(48.0f * f2), (int)(48.0f * f2));
            xo_02.setYOffset((int)XG.d(n2, 60.0f, 60.0f, n3));
            xo_02.setXOffset(-gLGeometrySprite.bKr() / 2);
        }
        xo_02.bnK();
        entity3D.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
}


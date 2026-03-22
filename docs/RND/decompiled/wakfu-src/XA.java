/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.text.EntityText;

public class XA
implements xf_0 {
    private final aaj_0 bSm;
    private final xn_0 bSn;
    private float bRJ;
    private float bRK;
    private float bRL;
    private float bRS = -1.0f;
    private float bRT = -1.0f;
    private int bRO = -1;
    private int bRP = -1;
    private final boolean bSo;

    public XA(aaj_0 aaj_02, xn_0 xn_02, boolean bl) {
        this.bSm = aaj_02;
        this.bSn = xn_02;
        this.bSo = bl;
    }

    private void bnM() {
        aag_0 aag_02 = this.bSm.bqL();
        this.bRL = aag_02.byB();
        int n = aag_02.byK();
        int n2 = aag_02.byL();
        int n3 = (int)((float)this.bSn.getScreenX() / this.bRL);
        int n4 = (int)((float)this.bSn.getScreenY() / this.bRL);
        this.bRJ = n3 + n;
        this.bRK = n4 + n2;
    }

    @Override
    public void a(xv_0 xv_02, int n) {
        int n2 = xv_0.e(xv_02);
        int n3 = xv_02.getDuration();
        EntityText entityText = xv_02.bny();
        int n4 = n3 / 4;
        int n5 = n3 / 2;
        int n6 = entityText.bOi();
        int n7 = entityText.bOh();
        if (n2 > n5) {
            this.bnM();
            if (this.bRS == -1.0f) {
                this.bRS = xv_02.getXOffset();
            }
            if (this.bRT == -1.0f) {
                this.bRT = xv_02.getYOffset();
            }
            if (this.bSo) {
                if (this.bRO == -1) {
                    this.bRO = n7;
                }
                if (this.bRP == -1) {
                    this.bRP = n6;
                }
            }
            int n8 = n2 - n5;
            int n9 = n3 - n5;
            int n10 = Math.round(XG.e(n8, this.bRS, this.bRJ - (xv_02.aSc() - (float)xv_02.getXOffset()), n9));
            int n11 = Math.round(XG.e(n8, this.bRT, this.bRK - (xv_02.aSd() - (float)xv_02.getYOffset()), n9));
            xv_02.setXOffset(n10);
            xv_02.setYOffset(n11);
            if (this.bSo && n7 > 0 && n6 > 0) {
                int n12 = Math.max(0, (int)((float)n7 - ((float)n7 - XG.e(n8, this.bRO, 0.0f, n3))));
                int n13 = Math.max(0, (int)((float)n6 - ((float)n6 - XG.e(n8, this.bRP, 0.0f, n3))));
                xv_02.bny().setZoom(XG.e(n8, 2.0f, 1.0f, n3));
            }
        } else if (n2 < n4) {
            int n14 = (int)XG.d(n2, 0.0f, 2.0f, n4);
            xv_02.setYOffset((int)XG.d(n2, 60.0f, 60.0f, n3));
            xv_02.setXOffset(-(n7 + n14) / 2);
            if (this.bSo) {
                xv_02.bny().setZoom(n14);
            }
        }
        xv_02.bnK();
    }
}


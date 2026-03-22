/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Xt
 */
public class xt_0
implements xu_0 {
    @Override
    public void a(xo_0 xo_02, int n) {
        int n2 = xo_02.bnA();
        int n3 = xo_02.getDuration();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)xo_02.bnL().uh(0);
        xo_02.setXOffset(-gLGeometrySprite.bKr() / 2);
        xo_02.bnK();
        float f2 = 1.0f;
        if (n2 < n3 / 4) {
            f2 = XG.d(n2, -0.5f, 1.6f, n3 / 4);
        } else if (n2 > n3 * 3 / 4) {
            f2 = XG.d(n2 - n3 * 3 / 4, 1.5f, -1.6f, n3 / 4);
        }
        xo_02.bnL().c(1.0f, 1.0f, 1.0f, f2);
    }
}


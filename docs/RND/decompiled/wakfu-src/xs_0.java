/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

/*
 * Renamed from Xs
 */
public class xs_0
implements xu_0 {
    @Override
    public void a(xo_0 xo_02, int n) {
        int n2 = xo_02.bnA();
        int n3 = xo_02.getDuration();
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)xo_02.bnL().uh(0);
        xo_02.setYOffset((int)XG.c(0.0f, 50.0f, n2, n3));
        xo_02.setXOffset(-gLGeometrySprite.bKr() / 2);
        xo_02.bnK();
        float f2 = (float)n3 * 0.65f;
        float f3 = GC.b(XG.d(Math.min((float)n2, f2), 20.0f, -20.1f, f2), 0.0f, 1.0f);
        xo_02.bnL().c(1.0f, 1.0f, 1.0f, f3);
    }
}


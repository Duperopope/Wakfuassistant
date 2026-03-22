/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.geom.Rectangle2D;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aHP
 */
public class ahp_2<T> {
    private static final Logger dSs = Logger.getLogger(ahp_2.class);
    private static final float dSt = 2.0f;
    private final ahq_2<T> dSu;
    private final int dSv;

    public ahp_2(int n, int n2, int n3, int n4, int n5) {
        this.dSu = new ahq_2(null, n, n2, n3, n4, 0);
        this.dSv = n5;
    }

    public int cen() {
        return this.a(this.dSu);
    }

    public int a(@NotNull ahq_2<T> ahq_22) {
        int n = 1;
        for (int i = 0; i < ahq_22.dSx.length; ++i) {
            if (ahq_22.dSx[i] == null) continue;
            n += this.a(ahq_22.dSx[i]);
        }
        return n;
    }

    public int a(@NotNull T t, @NotNull Rectangle2D rectangle2D) {
        return this.a(this.dSu, t, rectangle2D);
    }

    private int a(@NotNull ahq_2<T> ahq_22, @NotNull T t, @NotNull Rectangle2D rectangle2D) {
        if (ahq_22.dSz + 1 < this.dSv) {
            float f2 = (float)(this.dSu.dSy.getWidth() / (double)(2 << ahq_22.dSz) / 2.0);
            float f3 = (float)(this.dSu.dSy.getHeight() / (double)(2 << ahq_22.dSz) / 2.0);
            float f4 = 2.0f * f2;
            float f5 = 2.0f * f3;
            int n = rectangle2D.getCenterX() <= (double)ahq_22.bsS() ? 0 : 1;
            int n2 = rectangle2D.getCenterY() <= (double)ahq_22.bsT() ? 0 : 1;
            float f6 = n2 == 0 ? -1.0f : 1.0f;
            Rectangle2D.Float float_ = new Rectangle2D.Float();
            ((Rectangle2D)float_).setRect(ahq_22.bsS() + (f2 *= n == 0 ? -1.0f : 1.0f) - f4, ahq_22.bsT() + (f3 *= f6) - f5, f4 * 2.0f, f5 * 2.0f);
            if (float_.contains(rectangle2D)) {
                ahq_2 ahq_23 = ahq_22.dSx[n | n2 << 1];
                if (ahq_23 == null) {
                    ahq_22.dSx[n | n2 << 1] = ahq_23 = new ahq_2<T>(ahq_22, float_, ahq_22.dSz + 1);
                }
                return this.a(ahq_23, t, rectangle2D);
            }
        }
        ahq_22.dSA.add(t);
        return ahq_22.dSz;
    }

    public void clear() {
        this.dSu.clear();
    }

    public ahq_2<T> ceo() {
        return this.dSu;
    }
}


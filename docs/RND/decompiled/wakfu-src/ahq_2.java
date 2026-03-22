/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aHQ
 */
public class ahq_2<T> {
    final ahq_2<T> dSw;
    final ahq_2<T>[] dSx;
    final Rectangle2D dSy;
    final int dSz;
    final Collection<T> dSA;

    ahq_2(ahq_2<T> ahq_22, float f2, float f3, float f4, float f5, int n) {
        this(ahq_22, new Rectangle2D.Float(f2, f3, f4, f5), n);
    }

    ahq_2(ahq_2<T> ahq_22, @NotNull Rectangle2D rectangle2D, int n) {
        this.dSw = ahq_22;
        this.dSy = rectangle2D;
        this.dSz = n;
        this.dSx = new ahq_2[4];
        this.dSA = new ArrayList<T>();
    }

    float bsS() {
        return (int)this.dSy.getCenterX();
    }

    float bsT() {
        return (int)this.dSy.getCenterY();
    }

    void clear() {
        for (int i = this.dSx.length - 1; i >= 0; --i) {
            this.dSx[i] = null;
        }
        this.dSA.clear();
    }

    public Iterator<T> cep() {
        return this.dSA.iterator();
    }

    public ahq_2 ceq() {
        return this.dSw;
    }

    public ahq_2<T>[] cer() {
        return this.dSx;
    }

    public Rectangle2D ces() {
        return this.dSy;
    }

    public int bDN() {
        return this.dSz;
    }
}


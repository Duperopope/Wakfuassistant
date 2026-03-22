/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Rectangle;

/*
 * Renamed from fHP
 */
class fhp_2
extends Rectangle {
    private final fzx_0 uzv;

    public fhp_2(int n, int n2, int n3, int n4, fzx_0 fzx_02) {
        super(n, n2, n3, n4);
        this.uzv = fzx_02;
    }

    public fzx_0 gBf() {
        return this.uzv;
    }

    public int abG(int n) {
        int n2 = (int)this.getX();
        if (this.uzv == fzx_0.tLs) {
            n2 = (int)((double)n2 + (this.getWidth() - (double)n));
        }
        return n2;
    }

    public int abH(int n) {
        int n2 = (int)this.getY();
        if (this.uzv == fzx_0.tLq) {
            n2 = (int)((double)n2 + (this.getHeight() - (double)n));
        }
        return n2;
    }

    public boolean abI(int n) {
        if (this.uzv == fzx_0.tLs) {
            return (double)n > this.getX();
        }
        return (double)n < this.getX() + this.getWidth();
    }

    public boolean abJ(int n) {
        if (this.uzv == fzx_0.tLq) {
            return (double)n > this.getY();
        }
        return (double)n < this.getY() + this.getHeight();
    }

    public int abK(int n) {
        if (this.uzv == fzx_0.tLs) {
            return -n;
        }
        return n;
    }

    public int abL(int n) {
        if (this.uzv == fzx_0.tLq) {
            return -n;
        }
        return n;
    }
}


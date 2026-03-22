/*
 * Decompiled with CFR 0.152.
 */
public class ahP
extends aho_0 {
    private int bap;
    private int baq;
    private int brt;
    private int brs;
    private boolean cyH;

    public ahP(float f2, float f3, byte by, int n, int n2, int n3, int n4) {
        super(f2, f3, by);
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
        this.brt = n4;
        this.cyH = true;
    }

    public ahP(int n, int n2, int n3, int n4) {
        super(0.0f, 0.0f, (byte)1);
        this.brt = n4;
        this.bap = n;
        this.baq = n2;
        this.brs = n3;
    }

    public void setHeight(int n) {
        this.brt = n;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public void setX(int n) {
        this.bap = n;
    }

    public void setY(int n) {
        this.baq = n;
    }

    @Override
    public int bK(int n, int n2) {
        if (this.cyH) {
            return super.bK(n, n2);
        }
        return this.brt;
    }

    @Override
    public int bL(int n, int n2) {
        if (this.cyH) {
            return super.bL(n, n2);
        }
        return this.bap;
    }

    @Override
    public int bM(int n, int n2) {
        if (this.cyH) {
            return super.bM(n, n2);
        }
        return this.baq;
    }

    @Override
    public int bJ(int n, int n2) {
        if (this.cyH) {
            return super.bJ(n, n2);
        }
        return this.brs;
    }

    public void cx(boolean bl) {
        this.cyH = bl;
    }
}


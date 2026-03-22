/*
 * Decompiled with CFR 0.152.
 */
public class aKn {
    public final boolean edR;
    public final boolean edS;
    public final float edT;
    public final float edU;
    public final float edV;
    public final boolean edW;
    public final float edX;
    public final float edY;

    public aKn(boolean bl, int n, int n2, int n3, int n4, int n5, boolean bl2) {
        this.edR = bl;
        this.edT = n;
        this.edS = bl2;
        this.edU = n2 * 10;
        this.edV = n3 * 10;
        this.edW = (n4 + n5) % 2 != 0;
        this.edX = aau_0.bk(n4, n5);
        this.edY = aau_0.p(n4, n5, n);
    }

    public float bsS() {
        return this.edX;
    }

    public float bsT() {
        return this.edY;
    }

    public float aKq() {
        return this.edX - 43.0f;
    }

    public float aKs() {
        return this.edX + 43.0f;
    }

    public float ciH() {
        return this.edY + 21.5f;
    }

    public float ciI() {
        return this.edY - 21.5f;
    }

    public boolean ciG() {
        return !this.edR;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public class fns {
    private final int sIW;
    private final boolean sIX;
    private final boolean sIY;
    private final boolean sIZ;
    private final fnr sJa;

    public fns(int n, boolean bl, boolean bl2, short s, boolean bl3, float f2, float f3, float f4) {
        this.sIW = n;
        this.sIX = !bl;
        this.sIY = !bl2;
        this.sIZ = bl3;
        this.sJa = new fnr(s, f2, f3, f4);
    }

    public int d() {
        return this.sIW;
    }

    public boolean ger() {
        return this.sIX;
    }

    public boolean ges() {
        return this.sIY;
    }

    public boolean cmv() {
        return this.sIZ;
    }

    public fnr get() {
        return this.sJa;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public class aKl {
    public final int edI;
    public final int edJ;
    public final int edK;
    public final boolean edL;
    public final boolean edM;

    aKl(int n, int n2, boolean bl, boolean bl2, int n3) {
        this.edI = n;
        this.edJ = n2;
        this.edL = bl;
        this.edM = bl2;
        this.edK = n3;
    }

    public int ciF() {
        return this.edJ + this.edK;
    }

    public boolean ciG() {
        return !this.edL;
    }

    static aKl a(aKl aKl2, int n) {
        return new aKl(aKl2.edI, aKl2.edJ, aKl2.edL, aKl2.edM, n);
    }

    public String toString() {
        return "Block{minZ=" + this.edI + ", maxZ=" + this.edJ + ", zModifier=" + this.edK + ", walkable=" + this.edL + ", blockLos=" + this.edM + "}";
    }
}


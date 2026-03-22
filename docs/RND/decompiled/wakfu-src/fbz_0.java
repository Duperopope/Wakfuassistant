/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fbZ
 */
public abstract class fbz_0 {
    private final short rSZ;
    private final int rTa;
    private final short rTb;

    protected fbz_0(short s, int n, short s2) {
        this.rSZ = s;
        this.rTa = n;
        this.rTb = s2;
    }

    public abstract int cmP();

    public final short fSr() {
        return this.rSZ;
    }

    public final int fSs() {
        return this.rTa;
    }

    public final short fSt() {
        return this.rTb;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{m_id=" + this.rSZ + ", m_categoryId=" + this.rTa + ", m_maxQuantity=" + this.rTb + "}";
    }
}


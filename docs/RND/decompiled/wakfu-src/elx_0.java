/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLx
 */
public class elx_0 {
    public static final elx_0 qGO = new elx_0(-1, 0);
    private final int qGP;
    private final short qGQ;

    public elx_0(int n, short s) {
        this.qGP = n;
        this.qGQ = s;
    }

    public int azv() {
        return this.qGP;
    }

    public short bfd() {
        return this.qGQ;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        elx_0 elx_02 = (elx_0)object;
        return this.qGP == elx_02.qGP && this.qGQ == elx_02.qGQ;
    }

    public int hashCode() {
        int n = this.qGP;
        n = 31 * n + this.qGQ;
        return n;
    }

    public String toString() {
        return "RecipeResultItem{m_itemId=" + this.qGP + ", m_quantity=" + this.qGQ + "}";
    }
}


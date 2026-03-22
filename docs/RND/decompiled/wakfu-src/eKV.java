/*
 * Decompiled with CFR 0.152.
 */
public class eKV {
    public static final eKV qEF = new eKV(-1, 0);
    private final int qEG;
    private final short qEH;

    public eKV(int n, short s) {
        this.qEG = n;
        this.qEH = s;
    }

    public int azv() {
        return this.qEG;
    }

    public short bfd() {
        return this.qEH;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        eKV eKV2 = (eKV)object;
        return this.qEG == eKV2.qEG && this.qEH == eKV2.qEH;
    }

    public int hashCode() {
        int n = this.qEG;
        n = 31 * n + this.qEH;
        return n;
    }

    public String toString() {
        return "RecipeResultItem{m_itemId=" + this.qEG + ", m_quantity=" + this.qEH + "}";
    }
}


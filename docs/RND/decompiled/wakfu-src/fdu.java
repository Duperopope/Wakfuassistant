/*
 * Decompiled with CFR 0.152.
 */
public class fdu {
    private final int rWk;
    private final short rWl;
    private final fgW rWm;
    private final boolean rWn;

    public fdu(int n, short s, fgW fgW2, boolean bl) {
        this.rWk = n;
        this.rWl = s;
        this.rWm = fgW2;
        this.rWn = bl;
    }

    public int azv() {
        return this.rWk;
    }

    public short bfd() {
        return this.rWl;
    }

    public fgW fTB() {
        return this.rWm;
    }

    public boolean cnt() {
        return this.rWn;
    }

    public String toString() {
        return "Resulting{m_itemId=" + this.rWk + ", m_quantity=" + this.rWl + ", m_forcedType=" + String.valueOf(this.rWm) + ", m_forceFourWhiteSlots=" + this.rWn + "}";
    }
}


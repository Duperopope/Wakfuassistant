/*
 * Decompiled with CFR 0.152.
 */
public final class fdr
extends fdz_0 {
    private final String rVX;
    private final byte rVY;

    public fdr(int n, int n2, eIx eIx2, int n3, String string, byte by) {
        super(n, n2, eIx2, n3);
        this.rVX = string;
        this.rVY = by;
    }

    public String getAnimName() {
        return this.rVX;
    }

    public byte aWO() {
        return this.rVY;
    }

    public String toString() {
        return "IEEquipableDummyParameter{m_animName='" + this.rVX + "'}";
    }
}


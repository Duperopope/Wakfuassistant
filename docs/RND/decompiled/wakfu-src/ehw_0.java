/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHW
 */
public class ehw_0 {
    private final int qtT;
    private final int qtU;
    private final int qtV;

    public ehw_0(int n, int n2) {
        this.qtT = n;
        this.qtU = n2;
        this.qtV = 0;
    }

    public ehw_0(int n, int n2, int n3) {
        this.qtT = n;
        this.qtU = n2;
        this.qtV = n3;
    }

    public int d() {
        return this.qtT;
    }

    public int aZH() {
        return this.qtU;
    }

    public int bWc() {
        return this.qtV;
    }

    public String toString() {
        return "AptitudeBonusModel{m_id=" + this.qtT + ", m_effectId=" + this.qtU + "}";
    }
}


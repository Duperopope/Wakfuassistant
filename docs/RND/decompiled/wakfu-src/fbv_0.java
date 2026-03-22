/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fbV
 */
public class fbv_0 {
    private final int rSO;
    private final acd_1 rSP = new acd_1();

    public fbv_0(int n, acd_1 acd_12) {
        this.rSO = n;
        this.rSP.C(acd_12);
    }

    public int cor() {
        return this.rSO;
    }

    public acd_1 fSn() {
        return this.rSP;
    }

    public String toString() {
        return "BuildingIEDefinition{m_templateId=" + this.rSO + ", m_relativePos=" + String.valueOf(this.rSP) + "}";
    }
}


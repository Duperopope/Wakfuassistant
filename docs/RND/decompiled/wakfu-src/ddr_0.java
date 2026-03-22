/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ddr
 */
final class ddr_0 {
    private final String ogF;
    private final afx_1 ogG;
    private final afq_2[] ogH;

    ddr_0(String string, afx_1 afx_12, afq_2[] afq_2Array) {
        assert (afx_12 != null) : "BubbleClosedListener avec un script null";
        assert (string != null) : "BubbleClosedListener avec une fonction nulle";
        this.ogF = string;
        this.ogH = afq_2Array;
        this.ogG = afx_12;
    }

    public void bAs() {
        this.ogG.a(this.ogF, this.ogH, new afp_2[0]);
    }
}


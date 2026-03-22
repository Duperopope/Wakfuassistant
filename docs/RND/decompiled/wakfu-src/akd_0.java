/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aKD
 */
public class akd_0
extends aad_0 {
    private static final String eeW = "pathDisplayer";
    private static final akd_0 eeX = new akd_0();

    public static akd_0 ciR() {
        return eeX;
    }

    private akd_0() {
        super(eeW, aid_0.dUP);
    }

    public void b(anp_2 anp_22) {
        this.bqC();
        int n = anp_22.bDU();
        for (int i = 0; i < n; ++i) {
            int[] nArray = anp_22.tj(i);
            this.E(nArray[0], nArray[1], (short)nArray[2]);
        }
    }
}


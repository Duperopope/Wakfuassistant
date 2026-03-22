/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWZ
 */
public class ewz_2 {
    private final int[] rCX;
    private final boolean[] rCY;

    public ewz_2() {
        int n = exx_2.fOO() + 1;
        this.rCX = new int[n];
        this.rCY = new boolean[n];
        for (exx_2 exx_22 : exx_2.values()) {
            this.a(exx_22, exx_22.aZb());
        }
    }

    public int i(pt_0 pt_02) {
        return this.rCX[pt_02.aJr()];
    }

    public void a(pt_0 pt_02, int n) {
        this.rCX[pt_02.aJr()] = n;
        this.rCY[pt_02.aJr()] = true;
    }

    public boolean g(pt_0 pt_02) {
        return this.rCY[pt_02.aJr()];
    }
}


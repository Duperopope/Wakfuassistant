/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avn
 */
public class avn_1
extends avv_1 {
    private int[] dhN = new int[]{0};

    @Override
    public boolean bMV() {
        if (!super.bMV()) {
            return false;
        }
        this.dhS.alGenFilters(this.dhN.length, this.dhN, 0);
        if (!this.bNa()) {
            return false;
        }
        this.dhS.alFilteri(this.dhN[0], 32769, 1);
        return this.bNa();
    }

    @Override
    public void bmX() {
        if (this.dhN[0] != 0) {
            this.dhS.alDeleteFilters(this.dhN.length, this.dhN, 0);
            this.bNa();
            this.dhN[0] = 0;
        }
        this.dhN = null;
        super.bmX();
    }

    @Override
    public avg_2 bMW() {
        return avg_2.dhs;
    }
}


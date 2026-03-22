/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avk
 */
public class avk_2
extends avv_1 {
    private int[] dhL = new int[]{0};
    private int[] dhM = new int[]{0};

    @Override
    public boolean bMV() {
        if (!super.bMV()) {
            return false;
        }
        this.dhS.alGenAuxiliaryEffectSlots(this.dhM.length, this.dhM, 0);
        if (!this.bNa()) {
            return false;
        }
        this.dhS.alGenEffects(this.dhL.length, this.dhL, 0);
        return this.bNa();
    }

    @Override
    public void bmX() {
        if (this.dhM[0] != 0) {
            this.dhS.alDeleteAuxiliaryEffectSlots(this.dhM.length, this.dhM, 0);
            this.bNa();
            this.dhM[0] = 0;
        }
        if (this.dhL[0] != 0) {
            this.dhS.alDeleteEffects(this.dhL.length, this.dhL, 0);
            this.bNa();
            this.dhL[0] = 0;
        }
        this.dhL = null;
        this.dhM = null;
        super.bmX();
    }

    @Override
    public avg_2 bMW() {
        return avg_2.dhr;
    }
}


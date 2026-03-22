/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBi
 */
class fbi_1
implements fis_1 {
    final /* synthetic */ fbg_2 tRV;

    fbi_1(fbg_2 fbg_22) {
        this.tRV = fbg_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tRV.nax && !this.tRV.tRO && this.tRV.tRN) {
            this.tRV.gsH();
            return true;
        }
        if (this.tRV.tRO) {
            this.tRV.tRO = false;
        }
        return false;
    }
}


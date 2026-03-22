/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBZ
 */
class fbz_1
implements fis_1 {
    final /* synthetic */ fbw_2 tXe;

    fbz_1(fbw_2 fbw_22) {
        this.tXe = fbw_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tXe.tWW && this.tXe.isVisible()) {
            this.tXe.eKH();
        }
        return true;
    }
}


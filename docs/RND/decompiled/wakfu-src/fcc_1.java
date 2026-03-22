/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCc
 */
class fcc_1
implements fis_1 {
    final /* synthetic */ fcb_2 tXp;

    fcc_1(fcb_2 fcb_22) {
        this.tXp = fcb_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tXp.bmg) {
            fyw_0.gqw().tl(fcb_2.a(this.tXp).getId());
        }
        return false;
    }
}


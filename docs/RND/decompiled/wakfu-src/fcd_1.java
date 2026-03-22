/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCd
 */
class fcd_1
implements fis_1 {
    final /* synthetic */ fcb_2 tXq;

    fcd_1(fcb_2 fcb_22) {
        this.tXq = fcb_22;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (this.tXq.bmg && ((fhv_1)fiq_12.gBE()).getElementMap() != fcb_2.b(this.tXq)) {
            fyw_0.gqw().tl(fcb_2.c(this.tXq).getId());
        }
        return false;
    }
}


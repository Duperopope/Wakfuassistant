/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAr
 */
class far_2
implements fis_1 {
    final /* synthetic */ faj_1 tOj;

    far_2(faj_1 faj_12) {
        this.tOj = faj_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() != this.tOj) {
            return false;
        }
        fgb_2 fgb_22 = this.tOj.tNP;
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh && ((fgf_2)fgb_22).gzb() != null && ((fgf_2)fgb_22).gzb().getId() != null) {
            this.tOj.setCurrentCursorType(this.tOj.getActionCursorType(), fav_1.tOp);
        } else if (this.tOj.getTextBuilder().isSelectable()) {
            this.tOj.setCurrentCursorType(this.tOj.getSelectableCursorType(), fav_1.tOn);
        } else {
            this.tOj.setCurrentCursorType(this.tOj.getDefaultCursorType(), fav_1.tOo);
        }
        return false;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAq
 */
class faq_1
implements fis_1 {
    final /* synthetic */ faj_1 tOi;

    faq_1(faj_1 faj_12) {
        this.tOi = faj_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() != this.tOi) {
            return false;
        }
        fgb_2 fgb_22 = this.tOi.tNP;
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh && ((fgf_2)fgb_22).gzb() != null && ((fgf_2)fgb_22).gzb().getId() != null) {
            this.tOi.setCurrentCursorType(this.tOi.getActionCursorType(), fav_1.tOp);
        } else {
            this.tOi.setCurrentCursorType(this.tOi.getDefaultCursorType(), fav_1.tOo);
        }
        return false;
    }
}


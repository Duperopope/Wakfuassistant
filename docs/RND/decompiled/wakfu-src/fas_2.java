/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fAs
 */
class fas_2
implements fis_1 {
    final /* synthetic */ faj_1 tOk;

    fas_2(faj_1 faj_12) {
        this.tOk = faj_12;
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBE() == this.tOk) {
            if (this.tOk.getTextBuilder().isSelectable()) {
                this.tOk.setCurrentCursorType(this.tOk.getSelectableCursorType(), fav_1.tOn);
            } else {
                this.tOk.setCurrentCursorType(this.tOk.getDefaultCursorType(), fav_1.tOo);
            }
        }
        return false;
    }
}


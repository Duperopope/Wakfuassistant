/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHE
 */
class che_2
implements fis_1 {
    che_2() {
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (!chb_2.mZT && ((flp_2)fiq_12).gEm()) {
            chb_2.cancelAction();
            fbj_1.getInstance().b(fzq_0.tJU, this, true);
        }
        return false;
    }
}


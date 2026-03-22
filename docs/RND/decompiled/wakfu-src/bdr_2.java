/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from bdr
 */
final class bdr_2
implements adi_1 {
    private bsS hLi;

    bdr_2() {
    }

    public void p(bsS bsS2) {
        this.hLi = bsS2;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            this.ddB();
            return false;
        }
        return true;
    }

    private void ddB() {
        if (this.hLi == null) {
            return;
        }
        Collection collection = this.hLi.dGs();
        for (bgy bgy2 : collection) {
            bgy2.ddI().bd(bgy2.bcP());
        }
    }

    void ddz() {
        abb_2.bUA().b(this);
        if (this.hLi == null) {
            return;
        }
        bsj_0 bsj_02 = aue_0.cVJ().cVK().dmV();
        if (bsj_02 != null && this.hLi.d() == bsj_02.d()) {
            return;
        }
        Collection collection = this.hLi.dGs();
        for (bgy bgy2 : collection) {
            bgy2.ddI().ddk();
        }
    }

    @Override
    public long Sn() {
        return 176L;
    }

    @Override
    public void dC(long l) {
    }
}


/*
 * Decompiled with CFR 0.152.
 */
public class bTe
implements aeh_2 {
    public static final String lmR = "categories";
    public static final String lmS = "selectedCategory";
    public static final String lmT = "hasChallenges";
    private final bkm_0 lmU;
    private final aah_1<bTd> lmV = new aah_1();
    private bfS lmW = null;

    public bTe(bkm_0 bkm_02) {
        this.lmU = bkm_02;
        for (bfS bfS2 : bfS.values()) {
            this.lmV.b(bfS2.aJr(), new bTd(bfS2));
        }
        this.aPc();
    }

    public void a(bfS bfS2) {
        this.lmW = bfS2;
        fse_1.gFu().a((aef_2)this, lmS);
    }

    public void aPc() {
        Object object;
        Object object2;
        int n = this.lmV.bTR();
        for (int i = 0; i < n; ++i) {
            object2 = this.lmV.vU(i);
            ((bTd)object2).clear();
        }
        for (bkn_0 bkn_02 : this.lmU) {
            if (bkn_02.MJ() != -1L) continue;
            object2 = (bkk_0)bkn_02.ebj();
            bfM bfM2 = bgk.hZN.Cx(bkn_02.ebi());
            bfU bfU2 = bgd.diV().Cs(bfM2.clS());
            object = bfU2.dih();
            bTd bTd2 = this.lmV.vK(((bfS)object).aJr());
            bTd2.a((bkk_0)object2);
        }
        bTd bTd3 = this.lmW != null ? this.lmV.vK(this.lmW.aJr()) : null;
        object2 = this.lmW;
        this.lmW = null;
        if (bTd3 != null && bTd3.isEnabled()) {
            this.lmW = object2;
            fse_1.gFu().a((aef_2)bTd3, "items");
        } else {
            int n2 = this.lmV.bTR();
            for (int i = 0; i < n2; ++i) {
                object = this.lmV.vU(i);
                if (!((bTd)object).isEnabled()) continue;
                this.lmW = ((bTd)object).dih();
                break;
            }
        }
        fse_1.gFu().a((aef_2)this, lmR, lmS);
    }

    public void dhE() {
        for (bTd bTd2 : this.lmV) {
            bTd2.dhE();
        }
    }

    public void ebk() {
        int n = this.lmV.bTR();
        for (int i = 0; i < n; ++i) {
            this.lmV.vU(i).ebk();
        }
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lmS)) {
            return this.lmW != null ? this.lmV.vK(this.lmW.aJr()) : null;
        }
        if (string.equals(lmR)) {
            return this.lmV;
        }
        if (string.equals(lmT)) {
            return this.lmU.aVo() != 0;
        }
        return null;
    }
}


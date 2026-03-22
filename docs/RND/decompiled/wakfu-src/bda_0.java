/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bDA
 */
class bda_0
implements afj {
    final /* synthetic */ bDz jKG;

    bda_0(bDz bDz2) {
        this.jKG = bDz2;
    }

    @Override
    public boolean f(afh afh2, aeb_1 aeb_12) {
        afh afh3 = this.jKG.dQT();
        if (afh3 == null) {
            return false;
        }
        if (afh2 != afh3) {
            return false;
        }
        if (afh3 == afh.cpW) {
            bsz_2 bsz_22 = (bsz_2)aeb_12;
            bgt_0 bgt_02 = this.jKG.dQU();
            if (bgt_02 == null) {
                return false;
            }
            return bsz_22.KU() == bgt_02.Sn();
        }
        return true;
    }

    @Override
    public void g(afh afh2, aeb_1 aeb_12) {
        this.jKG.d(aeb_12);
        this.jKG.f(aeb_12);
    }

    @Override
    public void h(afh afh2, aeb_1 aeb_12) {
        this.jKG.e(aeb_12);
    }
}


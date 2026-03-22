/*
 * Decompiled with CFR 0.152.
 */
final class cgx
extends ceK<cqE, bsS> {
    cgx() {
    }

    public boolean a(cqE cqE2) {
        bsS bsS2 = bsU.dHk().Ft(cqE2.bha());
        if (bsS2 == null) {
            return false;
        }
        bgy bgy2 = bsS2.kq(cqE2.OO());
        if (bgy2 == null) {
            return false;
        }
        bdj_2 bdj_22 = bgy2.ddI();
        if (cqE2.aLB()) {
            btn_0.b(bdj_22, bdj_22.dcX());
        } else {
            bdj_22.dV("AnimStatique");
            bdj_22.dT("AnimStatique");
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqE)aam_22);
    }
}


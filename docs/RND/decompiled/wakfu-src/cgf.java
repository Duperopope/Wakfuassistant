/*
 * Decompiled with CFR 0.152.
 */
final class cgf
extends ceK<cov_0, bsS> {
    cgf() {
    }

    @Override
    public boolean b(cov_0 cov_02) {
        bgy bgy2 = bgg_0.dlO().ju(cov_02.evP());
        if (bgy2 != null && bgy2.bqo() != -1) {
            bsS bsS2 = bsU.dHk().Ft(bgy2.bqo());
            if (bsS2 == null) {
                return false;
            }
            if (bsS2.dGp() == etw_0.rqU) {
                aVm aVm2 = aVm.a(8, eui_1.rsz.aJr(), 0, bgy2, new acd_1(cov_02.getX(), cov_02.getY(), cov_02.bsy()), true);
                aVi.cWF().a(bgy2.bqo(), (aft_2)aVm2);
                aVi.cWF().m(bsS2);
            } else if (cov_02.ewP()) {
                bgy2.ddI().b(cov_02.getX(), cov_02.getY(), cov_02.bsy(), false, false);
            }
            return false;
        }
        return true;
    }
}


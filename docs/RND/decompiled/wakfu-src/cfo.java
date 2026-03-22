/*
 * Decompiled with CFR 0.152.
 */
final class cfo
extends ceK<coe, bsj_0> {
    cfo() {
    }

    @Override
    public boolean b(coe coe2) {
        bgy bgy2 = bgg_0.dlO().ju(coe2.evP());
        if (bgy2 == null) {
            return false;
        }
        if (!((bsj_0)this.jkR).bl(bgy2)) {
            return true;
        }
        aWj aWj2 = new aWj(bgy2.Sn(), new acd_1(coe2.getX(), coe2.getY(), coe2.bdi()), abi_1.wG(coe2.coI()));
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)aWj2);
        aVi.cWF().m(this.jkR);
        return false;
    }
}


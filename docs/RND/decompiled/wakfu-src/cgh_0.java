/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgH
 */
final class cgh_0
extends ceK<cri, bsj_0> {
    cgh_0() {
    }

    public boolean a(cri cri2) {
        aVU aVU2 = new aVU(cri2.caO(), cri2.eza().aJr(), cri2.avZ(), ((bsj_0)this.jkR).d());
        aVU2.hB(cri2.OO());
        aVU2.iF(ue_0.bjV().getTimeInMillis() + cri2.bhu());
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)aVU2);
        aVi.cWF().m(this.jkR);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cri)aam_22);
    }
}


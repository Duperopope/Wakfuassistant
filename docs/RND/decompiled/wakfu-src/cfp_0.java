/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfP
 */
final class cfp_0
extends ceK<cqj_0, bsj_0> {
    cfp_0() {
    }

    public boolean c(cqj_0 cqj_02) {
        aWy[] aWyArray;
        if (!cqj_02.eyR()) {
            return true;
        }
        if (this.jkR != null) {
            ((bsj_0)this.jkR).a(cqj_02.eyQ());
        }
        aWm aWm2 = aWm.a(cqj_02);
        aVi.cWF().a((bsj_0)this.jkR, (aft_2)aWm2);
        for (aWy aWy2 : aWyArray = aWy.b(cqj_02)) {
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)aWy2);
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.c((cqj_0)aam_22);
    }
}


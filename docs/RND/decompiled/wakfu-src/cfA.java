/*
 * Decompiled with CFR 0.152.
 */
final class cfA
extends ceK<cqu_0, bsj_0> {
    cfA() {
    }

    public boolean a(cqu_0 cqu_02) {
        cfC.lTb.lSY = true;
        if (!cqu_02.ezl()) {
            ((bsj_0)this.jkR).Q(cqu_02.ezj());
            ((bsj_0)this.jkR).O(cqu_02.ezi());
        }
        aVO aVO2 = new aVO(cqu_02.caO(), cqu_02.eza().aJr(), cqu_02.avZ(), ((bsj_0)this.jkR).d(), cqu_02.ezl());
        if (cqu_02.ezl()) {
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)aVO2);
            aVi.cWF().m(this.jkR);
        } else {
            ((bsj_0)this.jkR).dGy().f(aVO2);
        }
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqu_0)aam_22);
    }
}


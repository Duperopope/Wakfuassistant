/*
 * Decompiled with CFR 0.152.
 */
final class ceS
extends ceK<cqy_0, bsj_0> {
    ceS() {
    }

    public boolean a(cqy_0 cqy_02) {
        aUV aUV2;
        if (((bsj_0)this.jkR).dGo().fKY()) {
            byte by = cqy_02.eza().aJr();
            aUV2 = new aVP(cqy_02.caO(), by, 0, ((bsj_0)this.jkR).d(), cqy_02.ezp(), ((bsj_0)this.jkR).dGO(), ((bsj_0)this.jkR).dGo());
        } else {
            aUV2 = new avn_0(cqy_02.caO(), 0, ((bsj_0)this.jkR).d());
        }
        ((bsj_0)this.jkR).dGy().f(aUV2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqy_0)aam_22);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baO
 */
final class bao_2
implements qq_0 {
    bao_2() {
    }

    @Override
    public void e(QD qD) {
        bgy bgy2;
        qu_0 qu_02 = qD.bbd();
        if (qu_02 instanceof bgy) {
            bgy2 = (bgy)qu_02;
            if (bvz_0.ju(bgy2.Sn()) == null) {
                return;
            }
            bgy2.ddI().b((ero_0)qD, false);
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().b((ero_0)qD, true);
        }
        if (((ero_0)qD).fHt()) {
            return;
        }
        if (qu_02 instanceof bgy && qD.Ty()) {
            bgy2 = (bgy)qu_02;
            if (bvz_0.ju(bgy2.Sn()) == null) {
                return;
            }
            bgy2.a(new exe_2((ero_0)qD));
        }
    }

    @Override
    public void b(QD qD) {
        bgy bgy2;
        qu_0 qu_02 = qD.bbd();
        if (qu_02 instanceof bgy) {
            bgy2 = (bgy)qu_02;
            if (bvz_0.ju(bgy2.Sn()) == null) {
                return;
            }
            bgy2.ddI().c((ero_0)qD, false);
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().c((ero_0)qD, true);
        }
        if (((ero_0)qD).fHt()) {
            return;
        }
        if (qu_02 == null) {
            return;
        }
        if (qu_02.baz() != null && !qD.aZQ() && qD.Ty()) {
            qu_02.baz().p(qD);
        }
        if (qu_02 instanceof bgy) {
            bgy2 = (bgy)qu_02;
            if (bvz_0.ju(bgy2.Sn()) == null) {
                return;
            }
            bgy2.a(new exe_2((ero_0)qD));
        }
    }

    @Override
    public void d(QD qD) {
    }

    @Override
    public void f(QD qD) {
        bgy bgy2;
        qu_0 qu_02 = qD.bbd();
        if (qu_02 instanceof bgy) {
            bgy2 = (bgy)qu_02;
            if (bvz_0.ju(bgy2.Sn()) == null) {
                return;
            }
            bgy2.ddI().a((ero_0)qD, false);
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().a((ero_0)qD, true);
        }
        if (!((ero_0)qD).fHt() && qu_02 instanceof bgy && qD.Ty()) {
            bgy2 = (bgy)qu_02;
            if (bvz_0.ju(bgy2.Sn()) == null) {
                return;
            }
            bgy2.a(new exh_2((ero_0)qD));
        }
    }
}


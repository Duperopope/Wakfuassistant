/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from baQ
 */
public final class baq_2
implements qq_0 {
    private final bgy hzw;

    public baq_2(bgy bgy2) {
        this.hzw = bgy2;
    }

    @Override
    public void b(QD qD) {
        if (qD.bbd() != null && qD.bbd() instanceof bgy) {
            ((bgy)qD.bbd()).ddI().c((ero_0)qD, false);
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().c((ero_0)qD, true);
        }
        if (!((ero_0)qD).fHt() && qD.bbd() != null) {
            if (qD.bbd().baz() != null && !qD.aZQ() && qD.Ty()) {
                qD.bbd().baz().p(qD);
            }
            if (qD.bbd() instanceof bgy) {
                ((bgy)qD.bbd()).a(new exe_2((ero_0)qD));
            }
        }
    }

    @Override
    public void f(QD qD) {
        bgy bgy2;
        this.hzw.ddI().a((ero_0)qD, false);
        if (!((ero_0)qD).fHt() && qD.Ty() && (bgy2 = (bgy)qD.bbd()) != null) {
            bgy2.a(new exh_2((ero_0)qD));
        }
    }

    @Override
    public void d(QD qD) {
    }

    @Override
    public void e(QD qD) {
        this.hzw.ddI().b((ero_0)qD, false);
        if (!((ero_0)qD).fHt() && qD.Ty()) {
            ((bgy)qD.bbd()).a(new exe_2((ero_0)qD));
        }
    }
}


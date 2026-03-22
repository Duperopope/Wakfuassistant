/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;

final class bsP
implements qp_0,
qq_0 {
    private static final Logger jjq = Logger.getLogger(bsP.class);
    final Set<Qo> jjr = new HashSet<Qo>();

    bsP() {
    }

    @Override
    public void b(QD qD) {
        qu_0 qu_02;
        ero_0 ero_02 = (ero_0)qD;
        if (qD.bbd() != null) {
            if (qD.bbd().baz() != null && !qD.aZQ() && qD.Ty() && !qD.aZD()) {
                qD.bbd().baz().p(qD);
            }
            if (qD.bbd() instanceof bgy) {
                ((bgy)qD.bbd()).a(new exe_2(ero_02));
            }
        }
        if ((qu_02 = qD.aZD() || qD.bbC() && !qD.bbB() ? qD.bbc() : qD.bbd()) == null) {
            jjq.warn((Object)("Pas de cible sur laquelle appliquer les HMI pour l'effet " + qD.d()));
        }
        if (qu_02 != null && qu_02 instanceof bgy) {
            ((bgy)qu_02).ddI().c((ero_0)qD, qD.bbC());
        }
    }

    @Override
    public void d(QD qD) {
        ero_0 ero_02 = (ero_0)qD;
        qu_0 qu_02 = qD.bbd();
        if (qu_02 != null && qu_02 instanceof bgy) {
            ((bgy)qu_02).ddI().c(ero_02, false);
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().c(ero_02, true);
        }
        if (ero_02.fHt()) {
            return;
        }
        if (qu_02 != null && qu_02 instanceof bgy) {
            ((bgy)qu_02).a(new exe_2(ero_02));
        }
    }

    @Override
    public void e(QD qD) {
        qu_0 qu_02 = qD.bbd();
        if (qu_02 != null && qu_02 instanceof bgy) {
            ((bgy)qu_02).ddI().b((ero_0)qD, false);
        } else if (qD.bbc() != null && qD.bbc() instanceof bgy) {
            ((bgy)qD.bbc()).ddI().b((ero_0)qD, true);
        }
        if (((ero_0)qD).fHt()) {
            return;
        }
        if (qu_02 == null) {
            return;
        }
        if (qu_02 instanceof bgy && qD.Ty()) {
            ((bgy)qu_02).a(new exe_2((ero_0)qD));
        }
    }

    @Override
    public void f(QD qD) {
        qu_0 qu_02;
        if (!qD.Ty()) {
            return;
        }
        qu_0 qu_03 = qu_02 = qD.bbq() == null ? null : qD.bbq().bci();
        if (qu_02 != null && qu_02 instanceof bgy) {
            ((bgy)qu_02).ddI().a((ero_0)qD, false);
        }
        if (qD.bbd() != null && qD.bbd() instanceof bgy && qD.Ty()) {
            ((bgy)qD.bbd()).a(new exh_2((ero_0)qD));
        }
    }

    @Override
    public void a(Qo qo) {
        this.jjr.add(qo);
    }

    @Override
    public void c(QD qD) {
        this.jjr.removeIf(qo -> qo.a(qD));
    }
}


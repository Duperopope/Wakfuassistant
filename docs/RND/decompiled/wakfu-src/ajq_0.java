/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

/*
 * Renamed from aJQ
 */
final class ajq_0
implements aJK {
    private static final Logger eco = Logger.getLogger(ajq_0.class);

    ajq_0() {
    }

    @Override
    public void a(bsS bsS2, bgy bgy2) {
        bgy2.ddI().bA(true);
        if (bgy2.dlw()) {
            return;
        }
        bgy2.ddI().setVisible(true);
    }

    @Override
    public void b(bsS bsS2, bgy bgy2) {
        aJL.g(bgy2);
    }

    @Override
    public void a(bsS bsS2, QQ qQ) {
        aJL.d(bsS2, qQ);
    }

    @Override
    public void b(bsS bsS2, QQ qQ) {
        akj_0.ciY().o(qQ);
        akj_0.ciY().l(qQ);
    }

    @Override
    public void c(bsS bsS2, QQ qQ) {
        aJL.k(qQ);
    }

    @Override
    public boolean chJ() {
        return true;
    }

    @Override
    public boolean chK() {
        return true;
    }

    @Override
    public void a(bsi_0 bsi_02) {
        eco.error((Object)"[Fight][View] On ne doit pas demander de regles de visualisation pour un combat externe en train d'etre cr\u00e9er");
    }

    @Override
    public void a(bsS bsS2) {
        aJL.h(bsS2);
        aJL.f(bsS2);
        Collection collection = bsS2.dGs();
        for (amg_1 amg_12 : collection) {
            if (((bgy)amg_12).dlw()) {
                ((bgy)amg_12).ddI().setVisible(false);
                continue;
            }
            aJL.g((bgy)amg_12);
            ((bgy)amg_12).ddI().bd(((bgy)amg_12).bcP());
            ((bgy)amg_12).ddI().i(((exP)amg_12).bcB());
            ((bgy)amg_12).ddI().bA(true);
        }
        Iterator<Object> iterator = afh_0.bxU().bxX();
        while (iterator.hasNext()) {
            amg_1 amg_12;
            amg_12 = (afk_0)iterator.next();
            if (amg_12 == null || ((afk_0)amg_12).aVD() == null) continue;
            ((ZC)amg_12).setVisible(((ZC)amg_12).isVisible() && ((afk_0)amg_12).aVD().isVisible());
        }
        aJL.i(bsS2);
        if (bsS2 instanceof bsj_0) {
            ((bsj_0)bsS2).gT(true);
        }
    }
}


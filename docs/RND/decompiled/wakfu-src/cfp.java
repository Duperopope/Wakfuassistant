/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.stream.Collectors;
import org.apache.log4j.Logger;

final class cfp
extends ceK<cov_0, bsj_0> {
    private static final Logger lSO = Logger.getLogger(cfp.class);

    cfp() {
    }

    @Override
    public boolean b(cov_0 cov_02) {
        bgy bgy3 = (bgy)((bsj_0)this.jkR).qJ(cov_02.evP());
        if (bgy3 == null) {
            lSO.error((Object)("Impossible de t\u00e9l\u00e9porter un personnage qui n'est pas dans le combat " + cov_02.evP() + " ; fighters = " + ((bsj_0)this.jkR).dGs().stream().map(bgy2 -> String.valueOf(bgy2 instanceof bhJ ? bgy2.Sn() : (long)bgy2.doV().aWP())).collect(Collectors.joining(", "))));
            return true;
        }
        if (cfC.lTb.lSZ) {
            cfC.lTb.lTa.a(bgy3, new acd_1(cov_02.getX(), cov_02.getY(), cov_02.bsy()));
            return false;
        }
        if (cfC.lTb.lSY || ((bsj_0)this.jkR).dGp() == etw_0.rqT || ((bsj_0)this.jkR).dGp() == etw_0.rqV) {
            aVm aVm2 = aVm.a(agb_1.cbm(), eui_1.rsz.aJr(), 0, bgy3, new acd_1(cov_02.getX(), cov_02.getY(), cov_02.bsy()), cov_02.ewP());
            aVi.cWF().a((bsj_0)this.jkR, (aft_2)aVm2);
            aVi.cWF().m(this.jkR);
            return false;
        }
        lSO.error((Object)("Impossible de t\u00e9l\u00e9porter un personnage du combat " + cov_02.evP()));
        return true;
    }
}


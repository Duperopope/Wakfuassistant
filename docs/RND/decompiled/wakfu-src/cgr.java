/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cgr
extends ceK<cqv_0, bsi_0> {
    private static final Logger lTH = Logger.getLogger(cgr.class);

    cgr() {
    }

    public boolean a(cqv_0 cqv_02) {
        bsS bsS2 = bsU.dHk().Ft(cqv_02.bha());
        boolean bl = aue_0.cVJ().cVK().dkZ() == null;
        long l = cqv_02.OO();
        lTH.info((Object)("Starting join procedure for " + l));
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            lTH.error((Object)("Unknown Fighter " + l));
            return false;
        }
        bgy2.eu(cqv_02.eyy());
        bgy2.CI(cqv_02.bha());
        bgy2.lo(true);
        bsi_0 bsi_02 = (bsi_0)bsS2;
        bsi_02.a(bgy2, cqv_02.bcP());
        if (bl) {
            bgy2.ddI().bd(cqv_02.bcP());
            if (bgy2.aFW() == 1 && (bsS2.dGp() == etw_0.rqT || bsS2.dGp() == etw_0.rqV)) {
                bgy2.ddI().bf((byte)-1);
            }
        }
        aJP.cig().a(bgy2, cqv_02.bha());
        bgy2.dkL();
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqv_0)aam_22);
    }
}


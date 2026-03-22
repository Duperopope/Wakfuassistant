/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

class cgc {
    private static final Logger lTl = Logger.getLogger(cgl.class);

    cgc() {
    }

    protected void a(euv_0 euv_02) {
        String string = null;
        switch (euv_02) {
            case ryU: {
                string = aum_0.cWf().c("fight.protector.already.ended", new Object[0]);
                break;
            }
            case ryV: {
                string = aum_0.cWf().c("attacked.protector.joinInFight", new Object[0]);
                break;
            }
            case ryW: {
                string = aum_0.cWf().c("attacked.protector.joinInFight", new Object[0]);
            }
        }
        if (string != null) {
            this.oo(string);
        }
    }

    private void oo(String string) {
        fiq_2.gCw().d(fik_2.gBZ().vE(string).vG(ccp_2.mRF.byf()).abQ(1));
    }

    protected void b(euv_0 euv_02) {
        aPh.czg().iY(this.c(euv_02));
    }

    protected String c(euv_0 euv_02) {
        String string;
        switch (euv_02) {
            case ryy: {
                string = aum_0.cWf().c("fight.impossible.battleground.creation", new Object[0]);
                break;
            }
            case ryJ: 
            case ryI: 
            case ryH: {
                string = aum_0.cWf().c("systemNotification.instanceConfig.cannotFight", new Object[0]);
                break;
            }
            case ryG: {
                string = aum_0.cWf().c("systemNotification.moderatedZone.cannotFight", new Object[0]);
                break;
            }
            case ryN: {
                string = aum_0.cWf().c("fight.creation.no.path.between.fighters", new Object[0]);
                break;
            }
            case rys: 
            case ryF: {
                string = aum_0.cWf().c("fight.creation.target.busy", new Object[0]);
                break;
            }
            case ryT: {
                string = aum_0.cWf().c("fight.error.monster.protected", new Object[0]);
                break;
            }
            default: {
                string = aum_0.cWf().c("fight.creation.error", new Object[0]);
                lTl.info((Object)("Cr\u00e9ation du combat impossible : " + String.valueOf((Object)euv_02)));
            }
        }
        return string;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfj
 */
final class cfj_0
extends ceK<crn, bsj_0> {
    private static final Logger lSM = Logger.getLogger(cfj_0.class);

    cfj_0() {
    }

    public boolean a(crn crn2) {
        Object object;
        byte by = crn2.eza().aJr();
        QD qD = (QD)enf_0.fBb().pU(crn2.ezG());
        if (qD == null) {
            lSM.error((Object)("Impossible d'instancier un runningEffect :" + crn2.ezG() + " inconnu"));
            return false;
        }
        ero_0 ero_02 = (ero_0)qD.b((qm_0)null);
        if (ero_02.bbh() == null) {
            object = bsU.dHk().Ft(crn2.bha());
            if (object != null) {
                ero_02.a(object.bbh());
            } else {
                ero_02.a(bas_2.cZC());
            }
        }
        object = ero_02.dr(crn2.ezH());
        aUY aUY2 = new aUY(crn2.caO(), by, crn2.bha(), crn2.avZ(), ero_02);
        aUY2.xR(crn2.ezb());
        if (((im_1)object).Qy() != 0L) {
            aUY2.fg(((im_1)object).Qy());
        }
        aVi.cWF().a(crn2.bha(), (aft_2)aUY2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crn)aam_22);
    }
}


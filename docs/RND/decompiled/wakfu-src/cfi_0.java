/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfi
 */
final class cfi_0
extends ceK<crm, bsj_0> {
    private static final Logger lSL = Logger.getLogger(cfi_0.class);

    cfi_0() {
    }

    public boolean a(crm crm2) {
        Object object;
        byte by = crm2.eza().aJr();
        QD qD = (QD)enf_0.fBb().pU(crm2.ezG());
        if (qD == null) {
            lSL.error((Object)("Impossible d'instancier un runningEffect :" + crm2.ezG() + " inconnu"));
            return false;
        }
        ero_0 ero_02 = (ero_0)qD.b((qm_0)null);
        if (ero_02.bbh() == null) {
            object = bsU.dHk().Ft(crm2.bha());
            if (object != null) {
                ero_02.a(object.bbh());
            } else {
                ero_02.a(bas_2.cZC());
            }
        }
        object = ero_02.dr(crm2.ezH());
        aWv aWv2 = new aWv(crm2.caO(), by, crm2.avZ(), crm2.bha(), ero_02, crm2.ezI());
        aWv2.xR(crm2.ezb());
        aWv2.cXn();
        if (((im_1)object).Qy() != 0L) {
            aWv2.fg(((im_1)object).Qy());
        }
        if (((im_1)object).Qw() != 0L) {
            aWv2.iG(((im_1)object).Qw());
        }
        aVi.cWF().a(crm2.bha(), (aft_2)aWv2);
        aWv2.f(new aga_1(aWv2.caS()));
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((crm)aam_22);
    }
}


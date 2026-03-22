/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cfk
 */
final class cfk_0
extends ceK<cro, bsj_0> {
    private static final Logger lSN = Logger.getLogger(cfk_0.class);

    cfk_0() {
    }

    public boolean a(cro cro2) {
        byte by = cro2.eza().aJr();
        QD qD = (QD)enf_0.fBb().pU(cro2.ezG());
        if (qD == null) {
            lSN.error((Object)("Impossible d'instancier un runningEffect :" + cro2.ezG() + " inconnu"));
            return false;
        }
        aWG aWG2 = new aWG(cro2.caO(), by, cro2.bha(), cro2.avZ(), qD, cro2.ezJ(), cro2.Qy(), cro2.ezH());
        aWG2.xR(cro2.ezb());
        aVi.cWF().a(cro2.bha(), (aft_2)aWG2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cro)aam_22);
    }
}


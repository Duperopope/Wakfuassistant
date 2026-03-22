/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class aXF
implements aaq_2<cpt_0> {
    private static final Logger hxb = Logger.getLogger(aXF.class);

    aXF() {
    }

    @Override
    public boolean a(cpt_0 cpt_02) {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        eJS eJS2 = eJN.qAF.O(aUQ2.xl(), cpt_02.doL());
        if (eJS2 == null) {
            hxb.error((Object)("Impossible de modifier le nom du compagnon " + cpt_02.doL()));
            return false;
        }
        eJJ eJJ2 = new eJJ(eJS2);
        try {
            long l = cpt_02.pf();
            long l2 = eJS2.pf();
            short s = mz_1.aVX.cR(l);
            long l3 = mz_1.aVX.nG(s + 1) - l;
            short s2 = (short)(s - mz_1.aVX.cR(l2));
            String string = eJS2.getName().length() > 0 ? eJS2.getName() : bja_1.drJ().bC(eJS2.aWP()).getName();
            String string2 = aum_0.cWf().c("infoPop.xpGain", string, l - l2, l3, aPc.eww, s2);
            aPh.czg().iZ(string2);
            eJJ2.ij(l);
        }
        catch (eJM eJM2) {
            hxb.error((Object)"Exception levee", (Throwable)eJM2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13663;
    }
}


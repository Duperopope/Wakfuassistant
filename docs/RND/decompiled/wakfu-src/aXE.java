/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class aXE
implements aaq_2<cps> {
    private static final Logger hxa = Logger.getLogger(aXE.class);

    aXE() {
    }

    @Override
    public boolean a(cps cps2) {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        eJS eJS2 = eJN.qAF.O(aUQ2.xl(), cps2.doL());
        if (eJS2 == null) {
            hxa.error((Object)("Impossible de modifier le nom du compagnon " + cps2.doL()));
            return false;
        }
        eJS2.lD(cps2.efO());
        return false;
    }

    @Override
    public int bkq() {
        return 12251;
    }
}


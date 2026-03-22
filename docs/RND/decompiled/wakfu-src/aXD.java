/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class aXD
implements aaq_2<cpr> {
    private static final Logger hwZ = Logger.getLogger(aXD.class);

    aXD() {
    }

    @Override
    public boolean a(cpr cpr2) {
        aUQ aUQ2 = aue_0.cVJ().cVO();
        eJS eJS2 = eJN.qAF.O(aUQ2.xl(), cpr2.doL());
        if (eJS2 == null) {
            hwZ.error((Object)("Impossible de modifier le nom du compagnon " + cpr2.doL()));
            return false;
        }
        eJJ eJJ2 = new eJJ(eJS2);
        try {
            eJJ2.sm(cpr2.getName());
        }
        catch (eJM eJM2) {
            hwZ.error((Object)"Exception levee", (Throwable)eJM2);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12811;
    }
}


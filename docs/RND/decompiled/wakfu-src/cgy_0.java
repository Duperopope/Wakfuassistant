/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cgY
 */
final class cgy_0
implements aaq_2<crr_0> {
    private static final Logger lTU = Logger.getLogger(cgy_0.class);

    cgy_0() {
    }

    @Override
    public boolean a(crr_0 crr_02) {
        eww eww2 = eww.ev(crr_02.bks());
        if (eww2 != eww.oHf) {
            lTU.error((Object)("[H\u00e9ros] Impossible d'ajouter un H\u00e9ros : errorId " + eww2.aJr()));
            aPd.e("error.cantAddHero" + eww2.aJr(), new Object[0]);
            ctu_2.nJd.ePN();
        }
        bly_0.ivl.setNetEnabled(true);
        cxh_2.eWL();
        return false;
    }

    @Override
    public int bkq() {
        return 12396;
    }
}


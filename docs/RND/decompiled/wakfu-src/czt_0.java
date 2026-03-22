/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from czT
 */
public final class czt_0
implements aaq_2<cta_0> {
    private static final Logger mnr = Logger.getLogger(czt_0.class);

    @Override
    public boolean a(cta_0 cta_02) {
        boolean bl;
        bhx_0 bhx_02 = (bhx_0)bgg_0.dlO().ju(cta_02.KU());
        if (bhx_02 == null) {
            mnr.error((Object)"Tentative de modification des \u00e9tats d'un NPC qui n'existe pas");
            return false;
        }
        byte by = cta_02.eCo();
        boolean bl2 = bl = by < 0;
        if (bl) {
            by = (byte)Math.abs(by);
        }
        ezj_0 ezj_02 = ezj_0.Pl(by);
        if (bl) {
            bjn_2.drQ().b(bhx_02, ezj_02);
        } else {
            if (ezj_02 == ezj_0.psF && !bhx_02.doP() && !bhx_02.djT()) {
                bhx_02.doF();
            }
            bjn_2.drQ().a(bhx_02, ezj_02);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13764;
    }
}


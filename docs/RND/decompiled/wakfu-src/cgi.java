/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

final class cgi
extends ceK<cqu_0, bsi_0> {
    private static final Logger lTo = Logger.getLogger(cgi.class);

    cgi() {
    }

    public boolean a(cqu_0 cqu_02) {
        byte by = cqu_02.eza().aJr();
        bsS bsS2 = bsU.dHk().Ft(cqu_02.bha());
        if (bsS2 == null) {
            lTo.warn((Object)"On re\u00e7oit une fin de combat exterieur sur un combat qu'on ne connait pas");
            return false;
        }
        bsS2.bag().a(false, false);
        avh_0 avh_02 = new avh_0(cqu_02.caO(), by, cqu_02.avZ(), cqu_02.bha());
        avh_02.m(cqu_02.ezj());
        avh_02.n(cqu_02.ezi());
        avh_02.o(cqu_02.ezk());
        aVi.cWF().a(cqu_02.bha(), (aft_2)avh_02);
        aVi.cWF().m(bsS2);
        return false;
    }

    @Override
    public /* synthetic */ boolean b(aam_2 aam_22) {
        return this.a((cqu_0)aam_22);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chl
 */
public class chl_0
implements aaq_2<cmd> {
    @Override
    public boolean a(cmd cmd2) {
        fiu_1.uCW.N("marketFulfillOfferLock", true);
        if (cmd2.evK().aHz()) {
            bNG.a(byh_1.lAz, cmd2.evL(), new Object[0]);
            return false;
        }
        cfp_1.closeOfferFulfillWindow();
        if (cwl_1.eVz() || cwl_1.eVB()) {
            bhz_2.dWn().dWF().dWe();
        } else {
            cwl_1.eVl().M(bhz_2.dWn().dWx().GW(1), true);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13902;
    }
}


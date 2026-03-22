/*
 * Decompiled with CFR 0.152.
 */
public class chl
implements aAQ<cmd> {
    @Override
    public boolean a(cmd cmd2) {
        fIU.uCW.N("marketFulfillOfferLock", true);
        if (cmd2.evK().aHz()) {
            bNG.a(bYH.lAz, cmd2.evL(), new Object[0]);
            return false;
        }
        cFp.closeOfferFulfillWindow();
        if (cWl.eVz() || cWl.eVB()) {
            bHz.dWn().dWF().dWe();
        } else {
            cWl.eVl().M(bHz.dWn().dWx().GW(1), true);
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13902;
    }
}

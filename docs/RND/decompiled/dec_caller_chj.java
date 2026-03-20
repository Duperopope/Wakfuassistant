/*
 * Decompiled with CFR 0.152.
 */
public class chj
implements aAQ<clZ> {
    @Override
    public boolean a(clZ clZ2) {
        fIU.uCW.N("marketSellViewLock", true);
        if (clZ2.evK().aHz()) {
            bNG.a(bYH.lAz, clZ2.evL(), new Object[0]);
            return false;
        }
        if (cWl.eVB()) {
            bHz.dWn().dWJ().o(bHz.dWn().dWJ().duo());
            bHz.dWn().dWF().dVY();
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12842;
    }
}

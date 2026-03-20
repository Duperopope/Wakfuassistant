/*
 * Decompiled with CFR 0.152.
 */
public class chh
implements aAQ<clX> {
    @Override
    public boolean a(clX clX2) {
        fIU.uCW.N("marketSearchesLock", true);
        if (clX2.evK().aHz()) {
            bNG.a(bYH.lAz, clX2.evL(), new Object[0]);
            return false;
        }
        switch (clX2.evB()) {
            case swu: {
                bHz.dWn().e(clX2.evC());
                break;
            }
            case swv: {
                bHz.dWn().dWF().d(clX2.evC());
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12294;
    }
}

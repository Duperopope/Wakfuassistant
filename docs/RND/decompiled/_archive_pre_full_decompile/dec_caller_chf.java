/*
 * Decompiled with CFR 0.152.
 */
public class chf
implements aAQ<clU> {
    @Override
    public boolean a(clU clU2) {
        fIU.uCW.N("marketSearchesLock", true);
        if (clU2.evK().aHz()) {
            bNG.a(bYH.lAz, clU2.evL(), new Object[0]);
            return false;
        }
        switch (clU2.evB()) {
            case sww: {
                bHz.dWn().e(clU2.evA());
                break;
            }
            case swx: {
                bHz.dWn().dWF().d(clU2.evA());
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13653;
    }
}

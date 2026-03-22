/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chh
 */
public class chh_0
implements aaq_2<clX> {
    @Override
    public boolean a(clX clX2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (clX2.evK().aHz()) {
            bNG.a(byh_1.lAz, clX2.evL(), new Object[0]);
            return false;
        }
        switch (clX2.evB()) {
            case swu: {
                bhz_2.dWn().e(clX2.evC());
                break;
            }
            case swv: {
                bhz_2.dWn().dWF().d(clX2.evC());
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 12294;
    }
}


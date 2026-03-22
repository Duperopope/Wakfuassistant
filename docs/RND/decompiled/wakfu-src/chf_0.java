/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chf
 */
public class chf_0
implements aaq_2<clU> {
    @Override
    public boolean a(clU clU2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (clU2.evK().aHz()) {
            bNG.a(byh_1.lAz, clU2.evL(), new Object[0]);
            return false;
        }
        switch (clU2.evB()) {
            case sww: {
                bhz_2.dWn().e(clU2.evA());
                break;
            }
            case swx: {
                bhz_2.dWn().dWF().d(clU2.evA());
            }
        }
        return false;
    }

    @Override
    public int bkq() {
        return 13653;
    }
}


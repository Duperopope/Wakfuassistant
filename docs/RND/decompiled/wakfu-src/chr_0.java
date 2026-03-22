/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chr
 */
public class chr_0
implements aaq_2<cmo> {
    @Override
    public boolean a(cmo cmo2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (cmo2.evK().aHz()) {
            bNG.a(byh_1.lAz, cmo2.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().d(cmo2.evH());
        return false;
    }

    @Override
    public int bkq() {
        return 12925;
    }
}


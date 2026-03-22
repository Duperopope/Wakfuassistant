/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chm
 */
public class chm_0
implements aaq_2<cmf> {
    @Override
    public boolean a(cmf cmf2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (cmf2.evK().aHz()) {
            bNG.a(byh_1.lAz, cmf2.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().f(cmf2.evD());
        return false;
    }

    @Override
    public int bkq() {
        return 13483;
    }
}


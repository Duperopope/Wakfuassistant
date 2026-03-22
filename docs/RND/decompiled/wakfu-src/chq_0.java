/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chq
 */
public class chq_0
implements aaq_2<cmm> {
    @Override
    public boolean a(cmm cmm2) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (cmm2.evK().aHz()) {
            bNG.a(byh_1.lAz, cmm2.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().f(cmm2.evG());
        return false;
    }

    @Override
    public int bkq() {
        return 13728;
    }
}


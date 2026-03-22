/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chn
 */
public class chn_0
implements aaq_2<cmh_0> {
    @Override
    public boolean a(cmh_0 cmh_02) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (cmh_02.evK().aHz()) {
            bNG.a(byh_1.lAz, cmh_02.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().g(cmh_02.evE());
        return false;
    }

    @Override
    public int bkq() {
        return 12594;
    }
}


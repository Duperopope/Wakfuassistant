/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chz
 */
public class chz_0
implements aaq_2<cmg_0> {
    @Override
    public boolean a(cmg_0 cmg_02) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (cmg_02.evK().aHz()) {
            bNG.a(byh_1.lAz, cmg_02.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().d(cmg_02.evN());
        return false;
    }

    @Override
    public int bkq() {
        return 13303;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cht
 */
public class cht_0
implements aaq_2<cms_0> {
    @Override
    public boolean a(cms_0 cms_02) {
        fiu_1.uCW.N("marketSearchesLock", true);
        if (cms_02.evK().aHz()) {
            bNG.a(byh_1.lAz, cms_02.evL(), new Object[0]);
            return false;
        }
        bhz_2.dWn().d(cms_02.evJ());
        return false;
    }

    @Override
    public int bkq() {
        return 13516;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;

/*
 * Renamed from cXt
 */
class cxt_1
implements aao_2 {
    final /* synthetic */ bvi_0 nWk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cxt_1(cxs_1 cxs_12, bvi_0 bvi_02) {
        this.nWk = bvi_02;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        eyp_1 eyp_12 = this.nWk.dKL();
        if (eyp_12 == null) {
            return false;
        }
        TLongObjectIterator tLongObjectIterator = eyp_12.fPG().iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            bhJ bhJ2 = (bhJ)bvz_0.ju(tLongObjectIterator.key());
            if (bhJ2 == null) continue;
            bhJ2.jJ(((aba_2)aam_22).bUz());
        }
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }
}


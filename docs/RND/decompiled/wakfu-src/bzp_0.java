/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzp
 */
final class bzp_0
extends bzn {
    @Override
    public boolean a(bzm_0 bzm_02, RG rG) {
        boolean bl;
        if (!(rG instanceof bgt_0)) {
            return false;
        }
        bgt_0 bgt_02 = (bgt_0)rG;
        long l = bgt_02.aqZ();
        bjn_1 bjn_12 = (bjn_1)((fad)((Object)rG)).dpZ();
        bnv_2 bnv_22 = bgt_02.dnw();
        boolean bl2 = bl = bnv_22 != null && bnv_22.Xi() == bgt_02.Sn();
        if (bl) {
            return true;
        }
        boolean bl3 = bnv_22 != null && bjn_12.jP(bnv_22.Xi()) != null;
        boolean bl4 = bzn.a(l, bjn_12);
        return bl4 || bl3;
    }
}


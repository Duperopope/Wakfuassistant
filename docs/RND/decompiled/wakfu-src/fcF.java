/*
 * Decompiled with CFR 0.152.
 */
final class fcF
extends fcz {
    @Override
    public eww a(fcy fcy2) {
        boolean bl;
        if (!ewo_0.oBF.k(ewr_0.oEg)) {
            return eww.oHf;
        }
        eKd eKd2 = fcy2.fSA();
        if (eKd2 == null) {
            return eww.oHo;
        }
        long l = eKd2.Ya();
        boolean bl2 = bl = l == fcy2.fSE() || fcy2.fSE() == 0L;
        if (!bl) {
            return eww.oHn;
        }
        long l2 = fcy2.fSF();
        if (l2 == 0L) {
            return eww.oHf;
        }
        boolean bl3 = l == l2;
        return bl3 ? eww.oHf : eww.oHk;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bsV {
    private bsV() {
    }

    public static eUw a(@NotNull fpr_0 fpr_02, @NotNull exP exP2) {
        boolean bl;
        boolean bl2 = fpr_02 instanceof bhJ;
        boolean bl3 = exP2 instanceof bhJ;
        boolean bl4 = exP2 instanceof bhx_0;
        bzq_2 bzq_22 = bzp_2.eqt().mA(exP2.aqZ());
        boolean bl5 = bl = bzq_22 != null && bzq_22.eqw();
        if (bl) {
            return bsV.b(fpr_02, exP2);
        }
        fjn_0 fjn_02 = fpr_02.ffF();
        int n = fjn_02.Xt();
        int n2 = exP2.ffM();
        fjn_0 fjn_03 = exP2.ffF();
        boolean bl6 = fjn_02.dkC() != fpu_0.sRd && fjn_03.dkC() != fpu_0.sRd;
        boolean bl7 = fjn_03.WC(n2);
        if (bl2 && bl3) {
            return bl6 || bl7 && n == n2 ? eUw.rva : eUw.ruS;
        }
        if (bl2 && !bl4) {
            return eUw.ruG;
        }
        return eUy.bn(exP2);
    }

    @Nullable
    private static eUw b(@NotNull fpr_0 fpr_02, @NotNull exP exP2) {
        boolean bl = fpr_02 instanceof bhJ;
        boolean bl2 = exP2 instanceof bhJ;
        boolean bl3 = exP2.i(ezj_0.puv);
        boolean bl4 = exP2.i(ezj_0.pus);
        if (bl && bl2) {
            return eUw.ruQ;
        }
        if (bl && bl3) {
            return eUw.ruP;
        }
        if (bl && bl4) {
            return eUw.ruR;
        }
        return eUy.bn(exP2);
    }
}


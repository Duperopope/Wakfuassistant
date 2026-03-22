/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.text.ParseException;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cEm
 */
@fyf_0
public class cem_2 {
    public static final String PACKAGE = "wakfu.dimensionalBag.craftFee";
    public static final String mUv = "equipment";

    public static void toggleFreeForGuild(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17123);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void toggleStepsFallthroughEnabled(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16103);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void onFeeChanged(fle_2 fle_22, bnk_1 bnk_12) {
        if (!fle_22.gDO()) {
            cem_2.a((fdu_1)fle_22.gBE(), bnk_12, true);
        }
    }

    public static void onFeeChanged(fli_2 fli_22, bnk_1 bnk_12) {
        cem_2.a((fdu_1)fli_22.gBE(), bnk_12, false);
    }

    private static void a(fdu_1 fdu_12, bnk_1 bnk_12, boolean bl) {
        aaw_1.bUq().h(new dcx(bnk_12.dyn(), mUv.equals(fdu_12.getId()), cem_2.b(fdu_12), bl));
    }

    @Nullable
    protected static Integer b(fdu_1 fdu_12) {
        String string = fdu_12.getText();
        if (string.isEmpty()) {
            return null;
        }
        try {
            int n = aum_0.cWf().cR(string);
            return GC.a(n, 0, 2000000000);
        }
        catch (ParseException parseException) {
            return 0;
        }
    }

    public static void clearFeeForStep(flp_2 flp_22, bnk_1 bnk_12) {
        aaw_1.bUq().h(new dcy(bnk_12.dyn()));
    }

    public static void toggleOverriddenDialog(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(16168));
    }

    public static void onFeeChanged(fle_2 fle_22, bnx_2 bnx_22) {
        if (!fle_22.gDO()) {
            cem_2.a((fdu_1)fle_22.gBE(), bnx_22, true);
        }
    }

    public static void onFeeChanged(fli_2 fli_22, bnx_2 bnx_22) {
        cem_2.a((fdu_1)fli_22.gBE(), bnx_22, false);
    }

    private static void a(fdu_1 fdu_12, bnx_2 bnx_22, boolean bl) {
        aaw_1.bUq().h(new dcw(bnx_22.dxR().d(), cem_2.b(fdu_12), bl));
    }

    public static void resetOverriddenFeesFilter(fiq_1 fiq_12, fdu_1 fdu_12) {
        fdu_12.guD();
    }

    public static void displayInfo(flp_2 flp_22, bnx_2 bnx_22) {
        if (!flp_22.gEm()) {
            return;
        }
        dae_0 dae_02 = new dae_0(17765);
        dae_02.D(bnx_22.dxR());
        aaw_1.bUq().h(dae_02);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.ParseException;
import org.apache.log4j.Logger;

/*
 * Renamed from cFs
 */
@fyf_0
public class cfs_1 {
    protected static final Logger mVY = Logger.getLogger(cfs_1.class);
    public static final String PACKAGE = "wakfu.merchant.tax";

    public static void priceChangedWithIntCap(fiq_1 fiq_12) {
        long l;
        ayx_2 ayx_22;
        if (fiq_12 instanceof fli_2 && ((flf_2)(ayx_22 = (fli_2)fiq_12)).gDQ() && !((fli_2)ayx_22).r('V')) {
            return;
        }
        ayx_22 = (fdu_1)fiq_12.gBE();
        String string = ((fdu_1)ayx_22).getText();
        if (string.isEmpty()) {
            string = "0";
        }
        try {
            l = GC.cw(aum_0.cWf().cQ(string));
        }
        catch (ParseException parseException) {
            mVY.error((Object)"Error reversing number format", (Throwable)parseException);
            l = 0L;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16200);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }

    public static void priceChanged(fiq_1 fiq_12) {
        long l;
        ayx_2 ayx_22;
        if (fiq_12 instanceof fli_2 && ((flf_2)(ayx_22 = (fli_2)fiq_12)).gDQ() && !((fli_2)ayx_22).r('V')) {
            return;
        }
        ayx_22 = (fdu_1)fiq_12.gBE();
        String string = ((fdu_1)ayx_22).getText();
        if (string.isEmpty()) {
            string = "0";
        }
        try {
            l = aum_0.cWf().cQ(string);
        }
        catch (ParseException parseException) {
            mVY.error((Object)"Error reversing number format", (Throwable)parseException);
            l = 0L;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16200);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }

    public static void packChanged(flk_2 flk_22) {
        if (flk_22.bqr()) {
            bED bED2 = (bED)flk_22.getValue();
            dab_0 dab_02 = new dab_0();
            dab_02.a(bED2.dSx());
            dab_02.lK(16236);
            aaw_1.bUq().h(dab_02);
        }
    }

    public static void durationChanged(flk_2 flk_22) {
        if (flk_22.bqr()) {
            beb_0 beb_02 = (beb_0)flk_22.getValue();
            daa_0 daa_02 = new daa_0();
            daa_02.a(beb_02.dSu());
            daa_02.lK(16516);
            aaw_1.bUq().h(daa_02);
        }
    }

    public static void valid(fiq_1 fiq_12) {
        if (fiq_12 instanceof fli_2 && ((fli_2)fiq_12).bCC() != 10) {
            return;
        }
        bea_0 bea_02 = (bea_0)fse_1.gFu().vY("merchantItem");
        if (bea_02.eAU() <= 0L) {
            return;
        }
        dae_0.cV((short)19129);
    }

    public static void cancel(fiq_1 fiq_12) {
        dae_0.cV((short)16316);
    }
}


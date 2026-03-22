/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cFD
 */
@fyf_0
public class cfd_1 {
    protected static final Logger mWB = Logger.getLogger(cfd_1.class);
    public static final String PACKAGE = "wakfu.nationSelectionPanel";

    public static void chooseNation(fiq_1 fiq_12, bsq_2 bsq_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.sY(bsq_22.Xt());
        dae_02.lK(16891);
        aaw_1.bUq().h(dae_02);
    }

    public static void onMouseOverElement(fiq_1 fiq_12, bsq_2 bsq_22) {
        fcv_1 fcv_12;
        if (!(fiq_12 instanceof flp_2)) {
            return;
        }
        if (!fjo_0.a(aue_0.cVJ().cVK().ffF().ems(), fjo_0.sys)) {
            return;
        }
        flp_2 flp_22 = (flp_2)fiq_12;
        Object t = fiq_12.gBE();
        fbz_2 fbz_22 = (fbz_2)((fhv_1)t).getElementMap().uH("list");
        bsq_2 bsq_23 = (bsq_2)fse_1.gFu().vY("selectedNation");
        if (bsq_23 != null && ((fcv_12 = fbz_22.getRenderableByOffset(fbz_22.getOffsetByValue(bsq_23))).getScreenX() > flp_22.getScreenX() || fcv_12.getScreenX() + fcv_12.getWidth() < flp_22.getScreenX() || fcv_12.getScreenY() > flp_22.getScreenY() || fcv_12.getScreenY() + fcv_12.getHeight() < flp_22.getScreenY())) {
            return;
        }
        fse_1.gFu().f("selectedNation", bsq_22);
    }

    public static void onMouseOutElement(fiq_1 fiq_12) {
        fcv_1 fcv_12;
        if (!(fiq_12 instanceof flp_2)) {
            return;
        }
        if (!fjo_0.a(fjo_0.sys, aue_0.cVJ().cVK().ffF().ems())) {
            return;
        }
        flp_2 flp_22 = (flp_2)fiq_12;
        Object t = fiq_12.gBE();
        fbz_2 fbz_22 = (fbz_2)((fhv_1)t).getElementMap().uH("list");
        bsq_2 bsq_22 = (bsq_2)fse_1.gFu().vY("selectedNation");
        if (bsq_22 != null && (fcv_12 = fbz_22.getRenderableByOffset(fbz_22.getOffsetByValue(bsq_22))).getScreenX() <= flp_22.getScreenX() && fcv_12.getScreenX() + fcv_12.getWidth() >= flp_22.getScreenX() && fcv_12.getScreenY() <= flp_22.getScreenY() && fcv_12.getScreenY() + fcv_12.getHeight() >= flp_22.getScreenY()) {
            return;
        }
        fse_1.gFu().f("selectedNation", (Object)null);
    }
}


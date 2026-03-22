/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cDQ
 */
@fyf_0
public class cdq_1 {
    protected static final Logger mUj = Logger.getLogger(cdq_1.class);
    public static final String PACKAGE = "wakfu.chatOptions";

    public static void createView(fiq_1 fiq_12) {
        fas_1 fas_12 = (fas_1)((fhv_1)fiq_12.gBD()).getElementMap().uH("windowsComboBox");
        try {
            aPt aPt2 = aPt.cAg();
            aPt2.ze((Integer)fas_12.getSelectedValue()).czP();
            fse_1.gFu().a((aef_2)aPt.cAg(), aPt.eyQ);
            aPt.cAg().cAw();
        }
        catch (Exception exception) {
            mUj.error((Object)"Exception during createView", (Throwable)exception);
        }
    }

    public static void selectView(flg_2 flg_22) {
        fse_1.gFu().f("chat.editedView", flg_22.getItemValue());
    }

    public static void transferView(flk_2 flk_22) {
        int n;
        apn_0 apn_02 = (apn_0)fse_1.gFu().vY("chat.editedView");
        int n2 = (Integer)flk_22.gDZ().getItemValue();
        if (n2 == (n = aPt.cAg().d(apn_02))) {
            return;
        }
        aPt.cAg().a(apn_02, n, n2);
        fse_1.gFu().aT("chat.editedView", "windowId");
        aPt.cAg().cAw();
    }

    public static void changeChannel(flk_2 flk_22) {
        apn_0 apn_02 = (apn_0)fse_1.gFu().vY("chat.editedView");
        aPR aPR2 = (aPR)flk_22.gDZ().getItemValue();
        aPt.cAg().cAw();
    }
}


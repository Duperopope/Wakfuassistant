/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cFE
 */
@fyf_0
public class cfe_2 {
    private static final Logger mWC = Logger.getLogger(cfe_2.class);
    public static final String PACKAGE = "wakfu.newServerChoice";
    private static final String mWD = "invisibleContainer";
    private static final String mWE = "black60";
    private static final String mWF = "achievementTile";
    private static final String mWG = "achievementTileHover";
    private static final String mWH = "achievementTilePressed";

    public static void goBackToAuthentication(fiq_1 fiq_12) {
        czc_1.b("newServerChoiceDialog", () -> {
            aue_0.cVJ().b(crm_2.eMO());
            fiu_1.uCW.N("loginLock", true);
            aue_0.cVJ().a(csn_2.eNY());
        });
    }

    public static void goBackToServerModeChoiceDialog(fiq_1 fiq_12) {
        if (crm_2.eMO().eMP().enJ().size() == 1) {
            cfe_2.goBackToAuthentication(fiq_12);
            return;
        }
        czc_1.b("newServerChoiceDialog", () -> {
            fyw_0.gqw().tl("newServerChoiceDialog");
            czc_1.j("serverModeChoiceDialog", 8192L);
            aaw_1.bUq().h(new dae_0(17273));
        });
    }

    public static void selectCategory(fiq_1 fiq_12, btu_1 btu_12) {
        dae_0.b((short)17182, (Object)btu_12.enC());
    }

    public static void selectGroup(fiq_1 fiq_12, bty_1 bty_12) {
        btx_1 btx_12 = crm_2.eMO().eMP();
        if (btx_12.enK() == bty_12) {
            return;
        }
        dae_0.b((short)19451, bty_12);
    }

    public static void toggleServerGroupCollapse(fiq_1 fiq_12, bty_1 bty_12) {
        bty_12.dLG();
    }

    public static boolean selectServer(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bta_2)) {
            return false;
        }
        bta_2 bta_22 = (bta_2)object;
        dae_0.b((short)17317, bta_22);
        return true;
    }

    public static void enterServer(fiq_1 fiq_12, bta_2 bta_22) {
        dae_0 dae_02 = new dae_0(17198);
        dae_02.sY(bta_22.enY().d());
        aaw_1.bUq().h(dae_02);
    }

    public static void enterServerDoubleClick(flg_2 flg_22) {
        Object object = flg_22.getItemValue();
        if (!(object instanceof bta_2)) {
            return;
        }
        bta_2 bta_22 = (bta_2)object;
        cfe_2.enterServer(flg_22, bta_22);
    }

    public static void forceAccountOnServer(fiq_1 fiq_12, bta_2 bta_22) {
        fiq_2.gCw().d(fik_2.b(string -> {
            if (string == null || string.isEmpty()) {
                return;
            }
            dae_0 dae_02 = new dae_0(19676);
            dae_02.sY(bta_22.enY().d());
            dae_02.gj(Long.parseLong(string));
            aaw_1.bUq().h(dae_02);
        }).vE(aum_0.cWf().c("force.account.enter.id", new Object[0])).abQ(1).pe(true));
    }

    public static void enterDescriptionContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setStyle(mWE);
    }

    public static void leaveDescriptionContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setStyle(mWD);
    }

    public static void enterServerGroupContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setStyle(mWG);
    }

    public static void leaveServerGroupContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setStyle(mWF);
    }

    public static void mousePressServerGroupContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setStyle(mWH);
    }

    public static void mouseReleaseServerGroupContainer(fiq_1 fiq_12, fes_2 fes_22) {
        fes_22.setStyle(mWF);
    }
}


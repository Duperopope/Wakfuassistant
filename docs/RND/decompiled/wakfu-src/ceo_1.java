/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cEo
 */
@fyf_0
public class ceo_1 {
    public static final String PACKAGE = "wakfu.roomManager";
    protected static final Logger mUz = Logger.getLogger(ceo_1.class);

    public static void addUser(fiq_1 fiq_12, bnv_2 bnv_22, fdu_1 fdu_12) {
        mUz.error((Object)"DimensionalBagRoomManagerDialogAction.addUser()");
    }

    public static void removeUser(fiq_1 fiq_12, fix_2 fix_22, bnv_2 bnv_22) {
        mUz.error((Object)"DimensionalBagRoomManagerDialogAction.removeUser()");
    }

    public void a(fiq_1 fiq_12, fix_2 fix_22) {
        cmT cmT2 = new cmT();
        aue_0.cVJ().etu().d(cmT2);
    }

    public static void changeUserPermission(fiq_1 fiq_12, fix_2 fix_22, bnv_2 bnv_22) {
        mUz.error((Object)"DimensionalBagRoomManagerDialogAction.changeUserPermission()");
    }

    public void b(fiq_1 fiq_12, fix_2 fix_22) {
        cmW cmW2 = new cmW();
        aue_0.cVJ().etu().d(cmW2);
    }

    public static void onClicktRoom(fiq_1 fiq_12, bnv_2 bnv_22, String string) {
        mUz.error((Object)"DimensionalBagRoomManagerDialog.onClicktRoom()");
    }

    public static void changeGroupePermission(fiq_1 fiq_12, fix_2 fix_22, bnv_2 bnv_22) {
        mUz.error((Object)"DimensionalBagRoomManagerDialogAction.changeGroupePermission()");
    }

    public static void closeDimensionalBagRoomManagerDialog(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("dimensionalBagRoomManagerDialog")) {
            fse_1.gFu().f("showRoomBagDetails", false);
            aue_0.cVJ().b(ctt_2.eRh());
        }
    }

    public static void changeBagName(fiq_1 fiq_12, bnv_2 bnv_22, fdu_1 fdu_12) {
        mUz.error((Object)"DimensionalBagRoomManagerDialogActiob.changeBagRoom()");
    }

    public static void showInfos(fiq_1 fiq_12, fey_2 fey_22, String string) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            fes_2 fes_22;
            fes_22.setVisible(!(fes_22 = (fes_2)fey_22.getElementMap().uH(string + "Info")).isVisible());
            fes_2 fes_23 = (fes_2)fey_22.getElementMap().uH(string + "Button");
            if (fes_23.getStyle().equals("add")) {
                fes_23.setStyle("remove");
            } else {
                fes_23.setStyle("add");
            }
        }
    }

    public static void closeRoomDetail(flp_2 flp_22) {
        fse_1.gFu().f("showRoomBagDetails", false);
    }

    public static void emptyTextEditor(flp_2 flp_22, fey_2 fey_22, fdu_1 fdu_12) {
        if (flp_22.gBy() == fzq_0.tJT && fdu_12.getId().equals("tempAccessTextEditor") && fse_1.gFu().dp("isTempAccessTexteditorDefault")) {
            fdu_12.setText("");
            fse_1.gFu().f("isTempAccessTexteditorDefault", true);
        }
    }

    public static void setTempAccessTexteditorProperty(fli_2 fli_22, bnv_2 bnv_22, fdu_1 fdu_12) {
        mUz.error((Object)"DimensionalBagRoomManagerDialogAction.setTempAccessTexteditorProperty()");
    }

    public static void setPermissionsToDefault(flp_2 flp_22) {
        mUz.warn((Object)"(pas fait : ) Remise des permissions aux valeurs par d\u00e9faut ");
    }

    public static void dropItem(fla_2 fla_22, String string) {
        Object object = fla_22.gDy();
        if (object instanceof bnq_1) {
            bnq_1 bnq_12 = (bnq_1)object;
            dbl_0 dbl_02 = new dbl_0();
            dbl_02.setItem(bnq_12.dzy());
            dbl_02.cC(true);
            dbl_02.ay(Bw.q(string));
            dbl_02.sY(bnq_12.dzz());
            dbl_02.lK(19611);
            aaw_1.bUq().h(dbl_02);
        } else if (object instanceof ffV) {
            dbl_0 dbl_03 = new dbl_0();
            dbl_03.setSourceUniqueId(che_1.getSourceUniqueId());
            dbl_03.setSourcePosition(che_1.getSourcePosition());
            dbl_03.setSourceUniqueId(che_1.getSourceUniqueId());
            dbl_03.setItem((ffV)object);
            dbl_03.cC(false);
            dbl_03.ay(Bw.q(string));
            dbl_03.lK(19611);
            aaw_1.bUq().h(dbl_03);
        }
    }

    public static void closeDialog(fiq_1 fiq_12) {
        aue_0.cVJ().b(ctt_2.eRh());
    }
}


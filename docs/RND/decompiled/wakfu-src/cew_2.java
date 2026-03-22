/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from cEW
 */
@fyf_0
public class cew_2 {
    public static final String PACKAGE = "wakfu.guildManagement";
    private static int mVn;
    private static bve mVo;
    private static int mVp;

    public static void closeDialog(fiq_1 fiq_12) {
        aue_0.cVJ().b(cvg_2.eTB());
    }

    public static void onRankDropped(fla_2 fla_22) {
        Object t = fla_22.gBE();
        if (t == null || ((fhv_1)t).getRenderableParent() == null) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16142);
        dae_02.az((short)mVn);
        dae_02.gj(mVo.Sn());
        aaw_1.bUq().h(dae_02);
        mVo = null;
        mVn = -1;
        mVp = -1;
        fse_1.gFu().f("draggedGuildRank", (Object)null);
    }

    public static void onRankDragged(flu_1 flu_12) {
        Object t = flu_12.gBE();
        fbz_2 fbz_22 = (fbz_2)((fhv_1)t).getElementMap().uH("rankList");
        mVo = (bve)flu_12.gDy();
        mVp = fbz_22.getOffsetByRenderable(((fhv_1)t).getRenderableParent());
        fse_1.gFu().f("draggedGuildRank", mVo);
    }

    public static void onRankDropOut(flc_2 flc_22) {
        fbd_1 fbd_12 = flc_22.getDragNDropable();
        if (fbd_12 == null || fbd_12.getRenderableParent() == null) {
            return;
        }
        fbz_2 fbz_22 = (fbz_2)fbd_12.getElementMap().uH("rankList");
        fbz_22.g(mVo, mVp);
        mVo = null;
        mVn = -1;
        mVp = -1;
        fse_1.gFu().f("draggedGuildRank", (Object)null);
        bvk.dJZ().ha(true);
    }

    public static void onRankDraggedOver(fly_1 fly_12) {
        fbd_1 fbd_12 = fly_12.gDE();
        if (mVo == null || fbd_12 == null || fbd_12.getRenderableParent() == null) {
            return;
        }
        fbz_2 fbz_22 = (fbz_2)fbd_12.getElementMap().uH("rankList");
        if (fbz_22 == null) {
            return;
        }
        int n = fbz_22.getOffsetByRenderable(fbd_12.getRenderableParent());
        bve bve2 = (bve)fbz_22.getValue(n);
        if (!bve2.dJP()) {
            return;
        }
        mVn = n;
        fbz_22.g(mVo, mVn);
    }

    public static void onMouseEnter(fiq_1 fiq_12, faw_2 faw_22, bve bve2) {
        bve bve3 = (bve)fse_1.gFu().vY("draggedGuildRank");
        if (bve3 != null) {
            return;
        }
        if (!bve2.dJP()) {
            return;
        }
        fse_1.gFu().f("overGuildRank", bve2);
        bvk.dJZ().ha(true);
    }

    public static void onMouseExit(fiq_1 fiq_12, faw_2 faw_22, bve bve2) {
        bve bve3 = (bve)fse_1.gFu().vY("draggedGuildRank");
        if (bve3 != null) {
            return;
        }
        fse_1.gFu().f("overGuildRank", (Object)null);
        bvk.dJZ().ha(true);
    }

    public static void switchRank(flk_2 flk_22, Long l) {
        if (flk_22.bqr()) {
            dbu dbu2 = new dbu(l, ((bve)flk_22.getValue()).Sn());
            aaw_1.bUq().h(dbu2);
        }
    }

    public static void addToGuild(fiq_1 fiq_12, fdu_1 fdu_12, fad_1 fad_12) {
        String string = fdu_12.getText();
        if (fiq_12.gBy() == fzq_0.tJG && ((fli_2)fiq_12).bCC() != 10) {
            fad_12.setEnabled(!StringUtils.isEmpty((CharSequence)string));
            return;
        }
        if (!StringUtils.isEmpty((CharSequence)string)) {
            ezu_1 ezu_12 = bvk.dJZ().drl();
            if (ezu_12.isFull()) {
                String string2 = aum_0.cWf().c("notification.guildMaxCountMembersRaisedText", new Object[0]);
                cwy_2.nUc.y(string2, 4);
            } else {
                fad_12.setEnabled(false);
                dae_0 dae_02 = new dae_0();
                dae_02.lK(18796);
                dae_02.fa(string);
                aaw_1.bUq().h(dae_02);
                fdu_12.setText("");
                fhw_2.gAL().s(null);
            }
        }
    }

    public static void excludeCharacter(fiq_1 fiq_12, Long l) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(19382);
        dae_02.gj(l);
        aaw_1.bUq().h(dae_02);
    }

    public static void leaveGuild(fiq_1 fiq_12) {
        dae_0.cV(bvk.dJZ().dKm() ? (short)19815 : 18663);
    }

    public static void openRenameDialog(fiq_1 fiq_12) {
        if (!aue_0.cVJ().c(cva_1.eTu())) {
            bzX bzX2 = new bzX();
            bzV bzV2 = (bzV)bzX2.dNo();
            cva_1.eTu().a(bzV2, bvd_0.juB);
        }
    }

    public static void createRank(fiq_1 fiq_12) {
        dae_0.cV((short)16055);
    }

    public static void deleteRank(fiq_1 fiq_12, bve bve2) {
        dae_0 dae_02 = new dae_0();
        dae_02.gj(bve2.Sn());
        dae_02.lK(18200);
        aaw_1.bUq().h(dae_02);
    }

    public static void applyRankModifications(fiq_1 fiq_12) {
        dae_0.cV((short)17969);
    }

    public static void displayDisconnectedMembers(flv_2 flv_22) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16613);
        dae_02.cC(flv_22.bqr());
        aaw_1.bUq().h(dae_02);
    }

    public static void addToParty(fiq_1 fiq_12, Long l) {
        bvj bvj2 = bvk.dJZ().kK(l);
        if (bvj2 == null) {
            return;
        }
        dbs dbs2 = new dbs();
        dbs2.c(Vf.bxK);
        dbs2.setName(bvj2.getName());
        aaw_1.bUq().h(dbs2);
    }

    public static void addToFriendlist(fiq_1 fiq_12, Long l) {
        bvj bvj2 = bvk.dJZ().kK(l);
        if (bvj2 == null) {
            return;
        }
        apa_0.jl(bvj2.getName());
        fes_2 fes_22 = (fes_2)fiq_12.gBE();
        fes_22.setEnabled(false);
    }

    public static void addPrivatePipe(fiq_1 fiq_12, Long l) {
        bvj bvj2 = bvk.dJZ().kK(l);
        if (bvj2 == null) {
            return;
        }
        cdc_1.addPrivatePipe(fiq_12, bvj2.getName());
    }

    public static void editPersonalNote(fiq_1 fiq_12) {
    }

    public static void changeRankName(fli_2 fli_22) {
        if (fli_22.bCC() == 10 && cew_2.checkRankModificationDirty()) {
            cew_2.applyRankModifications(fli_22);
            return;
        }
        bvi bvi2 = (bvi)fse_1.gFu().vY("selectedGuildRank");
        if (bvi2 == null) {
            return;
        }
        fdu_1 fdu_12 = (fdu_1)((fhv_1)fli_22.gBD()).getElementMap().uH("guildName");
        bvi2.setName(fdu_12.getText());
        cew_2.checkRankModificationDirty();
    }

    public static void checkAuthorisation(flp_2 flp_22, buG buG2) {
        fdd_2 fdd_22 = (fdd_2)flp_22.gBD();
        buG2.gX(fdd_22.getSelected());
        cew_2.checkRankModificationDirty();
    }

    public static boolean checkRankModificationDirty() {
        bve bve2 = (bve)fse_1.gFu().vY("selectedGuildRank");
        if (bve2 == null) {
            return false;
        }
        boolean bl = !bve2.equals(bvk.dJZ().kI(bve2.Sn()));
        fse_1.gFu().f("rankModificationDirty", bl);
        return bl;
    }

    public static void selectRank(flg_2 flg_22) {
        bve bve2 = (bve)flg_22.getItemValue();
        fdu_1 fdu_12 = (fdu_1)((fhv_1)flg_22.gBE()).getElementMap().uH("guildName");
        fdu_12.setText(bve2.getName());
        fse_1.gFu().f("selectedGuildRank", bve2.dJT());
        bvk.dJZ().ha(true);
    }

    public static void displayPage(flv_2 flv_22) {
        if (flv_22.bqr()) {
            fcu_1 fcu_12 = (fcu_1)flv_22.gBE();
            int n = Integer.valueOf(fcu_12.getValue());
            fse_1.gFu().a("currentPage", (Object)n, fcu_12.getElementMap());
        }
    }

    public static void openMessagesEditionDialog(fiq_1 fiq_12) {
        fse_1.gFu().f("isEditingGuildDescs", true);
        ccj_2.g("guildTextEditorDialog", 256L);
    }

    public static void onKeyEvent(fiq_1 fiq_12, fad_1 fad_12) {
        if (fiq_12.gBy() == fzq_0.tJF) {
            String string;
            fli_2 fli_22;
            fdu_1 fdu_12 = (fdu_1)fiq_12.gBE();
            if (cfz_2.checkText(fdu_12, (fli_22 = (fli_2)fiq_12).gDW() == '\n')) {
                // empty if block
            }
            if ((string = fdu_12.getText()) != null && string.length() > 0) {
                fad_12.setEnabled(true);
            }
        }
    }

    private static void a(String string2, fdu_1 fdu_12) {
        fiq_2.gCw().d(fik_2.gBZ().vE(string2).vG(ccp_2.mRF.byf()).abQ(1).a((n, string) -> fhw_2.gAL().s(fdu_12)));
    }

    public static void applyGuildDescription(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        String string2 = bYV.nU(string);
        fdu_12.setText(string2);
        if (string2.length() == 0 && string.length() != 0) {
            cew_2.a(aum_0.cWf().c("error.censoredSentence", new Object[0]), fdu_12);
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17703);
        dae_02.fa(string2);
        aaw_1.bUq().h(dae_02);
        ((fad_1)fiq_12.gBE()).setEnabled(false);
    }

    public static void applyGuildMessage(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = fdu_12.getText();
        String string2 = bYV.nU(string);
        fdu_12.setText(string2);
        if (string2.length() == 0 && string.length() != 0) {
            cew_2.a(aum_0.cWf().c("error.censoredSentence", new Object[0]), fdu_12);
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.lK(17622);
        dae_02.fa(string2);
        aaw_1.bUq().h(dae_02);
        ((fad_1)fiq_12.gBE()).setEnabled(false);
    }

    public static void applyGuildPersonalDescription(fiq_1 fiq_12, fdu_1 fdu_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(18873);
        dae_02.fa(fdu_12.getText());
        aaw_1.bUq().h(dae_02);
        ((fad_1)fiq_12.gBE()).setEnabled(false);
    }

    public static void chooseSmiley(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0();
            dae_02.ay((byte)((bue_0)flk_22.getValue()).dJk());
            dae_02.lK(19296);
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void acceptQuest(fiq_1 fiq_12, bci_1 bci_12) {
        dae_0 dae_02 = new dae_0();
        dae_02.lK(16333);
        dae_02.sY(bci_12.d());
        aaw_1.bUq().h(dae_02);
    }

    public static void switchContainerVisibility(fiq_1 fiq_12, faw_2 faw_22, fad_1 fad_12) {
        boolean bl = !faw_22.isVisible();
        faw_22.setVisible(bl);
        fad_12.setStyle(bl ? "YellowUpArrow" : "YellowDownArrow");
    }

    public static void selectUpgradeSubCategory(fiq_1 fiq_12, buS buS2) {
        buS2.dJz();
    }
}


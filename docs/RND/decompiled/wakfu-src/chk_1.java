/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cHk
 */
@fyf_0
public class chk_1 {
    protected static final Logger mZz = Logger.getLogger(chk_1.class);
    public static final String PACKAGE = "wakfu.temporaryInventory";
    private static aao_2 mUy;
    private static long duS;

    public static void selectHero(flp_2 flp_22, bgt_0 bgt_02) {
        dae_0 dae_02 = new dae_0(16179);
        dae_02.gj(bgt_02.Sn());
        aaw_1.bUq().h(dae_02);
    }

    public static void closeTemporaryInventory(fiq_1 fiq_12) {
        if (fiq_12.gBy() == fzq_0.tJU) {
            dae_0.cV((short)16837);
        }
    }

    public static void minimizeMaximizeDialog(flp_2 flp_22, fey_2 fey_22) {
        if (flp_22.gBy() == fzq_0.tJV) {
            fes_2 fes_22 = (fes_2)fey_22.getElementMap().uH("contentWindow");
            if (!fes_22.isVisible()) {
                fey_22.setPrefSize(new fsm_1(0, 0));
            } else {
                fey_22.setPrefSize(new fsm_1(0, fes_22.getHeight()));
            }
            fes_22.setVisible(!fes_22.isVisible());
            fes_2 fes_23 = (fes_2)fey_22.getElementMap().uH("barCloseButton");
            fes_23.setVisible(!fes_23.isVisible());
        }
    }

    public static void showItemDetailPopup(flg_2 flg_22, fey_2 fey_22) {
        Object object = flg_22.getItemValue();
        cgn_1.showPopup((aef_2)object, 500);
    }

    public static void dropOut(flc_2 flc_22) {
        if (flc_22.getValue() instanceof ffV) {
            ffV ffV2 = (ffV)flc_22.getValue();
            if (fbj_1.getInstance().getWidget(flc_22.getScreenX(), flc_22.getScreenY()) == fbj_1.getInstance()) {
                if (ffV2.dOg().a(ffj_0.sgf) != null && !ffV2.dOg().a(ffj_0.sgf).b(aue_0.cVJ().cVK(), aue_0.cVJ().cVK().aZw(), ffV2, aue_0.cVJ().cVK().fgg())) {
                    aPd.e("item.unDroppable", ffV2.bfd(), ffV2.getName());
                    return;
                }
                if (ffV2.LV() == duS) {
                    dbl_0 dbl_02 = new dbl_0();
                    dbl_02.setItem(ffV2);
                    dbl_02.ak(ffV2.bfd());
                    dbl_02.lK(18339);
                    dbl_02.setDestinationUniqueId(-1L);
                    aaw_1.bUq().h(dbl_02);
                }
            }
        }
    }

    public static void dragItem(flu_1 flu_12) {
        if (fyw_0.gqw().to("splitStackDialog")) {
            fyw_0.gqw().tl("splitStackDialog");
        }
        if (flu_12.gDy() instanceof ffV) {
            ffV ffV2 = (ffV)flu_12.gDy();
            duS = ffV2.LV();
            fse_1.gFu().f("temporaryInventory.currentDragItemId", ffV2.LV());
        }
    }

    public static void onItemDoubleClick(flg_2 flg_22) {
        if (fyw_0.gqw().to("splitStackDialog")) {
            fyw_0.gqw().tl("splitStackDialog");
        }
        ffV ffV2 = (ffV)flg_22.getItemValue();
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.lK(18339);
        dbl_02.setItem(ffV2);
        dbl_02.ak(ffV2.bfd());
        bdl_0 bdl_02 = cvo_2.daL().dno();
        ffs_0 ffs_02 = bdl_02.cx(ffV2);
        byte by = (byte)(ffs_02 == null ? -1L : (long)ffs_02.cr(ffs_02.UH(ffV2.avr())));
        if (ffs_02 == null && (ffs_02 = bdl_02.ct(ffV2)) != null) {
            by = (byte)ffs_02.beO();
        }
        if (ffs_02 == null) {
            return;
        }
        duS = ffV2.LV();
        fse_1.gFu().f("temporaryInventory.currentDragItemId", ffV2.LV());
        dbl_02.setDestinationUniqueId(ffs_02.Lx());
        dbl_02.setDestinationPosition(by);
        aaw_1.bUq().h(dbl_02);
    }

    public static void retrieveAll(fiq_1 fiq_12) {
        dae_0.cV((short)17504);
    }

    public static void recycleAll(fiq_1 fiq_12) {
        dae_0.cV((short)17400);
    }
}


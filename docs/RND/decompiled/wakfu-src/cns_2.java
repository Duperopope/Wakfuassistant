/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNS
 */
public class cns_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "splitStackContainer";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setNonBlocking(false);
        faw_22.setPack(true);
        faw_22.setStickWithinContainer(true);
        faw_22.setStyle("windowBackgroundSecondary");
        faw_22.guy();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(8, 8, 8, 8));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHgap((short)6);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        faw_22.X(faw_24);
        faw_24.guy();
        frz_2 frz_23 = frz_2.checkOut();
        frz_23.setHgap((short)2);
        faw_24.X(frz_23);
        frz_23.guy();
        frz_23.onChildrenAdded();
        faw_2 faw_25 = faw_2.checkOut();
        faw_25.setElementMap(fhs_23);
        faw_24.X(faw_25);
        faw_25.guy();
        frz_2 frz_24 = frz_2.checkOut();
        frz_24.setHgap((short)2);
        faw_25.X(frz_24);
        frz_24.guy();
        frz_24.onChildrenAdded();
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        fad_12.setExpandable(false);
        fmh_2 fmh_22 = new fmh_2();
        fmh_22.vw("wakfu.split:decreaseSplitCountToOne(quantityTextEditor)");
        fad_12.setOnMousePress(fmh_22);
        fad_12.setPrefSize(new fsm_1(36, 36));
        fad_12.setStyle("doubleArrowLeftSecondarySmall");
        faw_25.X(fad_12);
        fad_12.guy();
        fad_12.onChildrenAdded();
        fad_1 fad_13 = new fad_1();
        fad_13.aVI();
        fad_13.setElementMap(fhs_23);
        fad_13.setExpandable(false);
        fmh_2 fmh_23 = new fmh_2();
        fmh_23.vw("wakfu.split:decreaseSplitCount(quantityTextEditor)");
        fad_13.setOnMousePress(fmh_23);
        fad_13.setPrefSize(new fsm_1(36, 36));
        fad_13.setStyle("arrowLeftSecondarySmall");
        faw_25.X(fad_13);
        fad_13.guy();
        fad_13.onChildrenAdded();
        faw_25.onChildrenAdded();
        String string2 = "quantityTextEditor";
        fdu_1 fdu_12 = new fdu_1();
        fdu_12.aVI();
        fdu_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fdu_12);
        }
        fdu_12.setFocusable(true);
        fdu_12.setFocused(true);
        fdu_12.abk(10);
        fmu_2 fmu_22 = new fmu_2();
        fmu_22.vw("wakfu.split:keyType(quantityTextEditor)");
        fdu_12.setOnKeyType(fmu_22);
        fdu_12.setPrefSize(new fsm_1(50, 12));
        fdu_12.setRestrict("[0-9,\\\\.\u00a0\u202f]+");
        fdu_12.setSelectOnFocus(true);
        fdu_12.setStyle("defaultTextEditor");
        faw_24.X(fdu_12);
        fdu_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("text");
        fsj_22.setName("itemToSplit");
        fdu_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fdu_1 fdu_13 = fdu_12;
        fzq fzq2 = (fzq)((fes_2)fdu_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLO);
        fdu_12.X(fzq2);
        fzq2.guy();
        fzq2.onChildrenAdded();
        fdu_12.onChildrenAdded();
        faw_2 faw_26 = faw_2.checkOut();
        faw_26.setElementMap(fhs_23);
        faw_24.X(faw_26);
        faw_26.guy();
        frz_2 frz_25 = frz_2.checkOut();
        frz_25.setHgap((short)2);
        faw_26.X(frz_25);
        frz_25.guy();
        frz_25.onChildrenAdded();
        fad_1 fad_14 = new fad_1();
        fad_14.aVI();
        fad_14.setElementMap(fhs_23);
        fad_14.setExpandable(false);
        fmh_2 fmh_24 = new fmh_2();
        fmh_24.vw("wakfu.split:increaseSplitCount(quantityTextEditor)");
        fad_14.setOnMousePress(fmh_24);
        fad_14.setPrefSize(new fsm_1(36, 36));
        fad_14.setStyle("arrowRightSecondarySmall");
        faw_26.X(fad_14);
        fad_14.guy();
        fad_14.onChildrenAdded();
        fad_1 fad_15 = new fad_1();
        fad_15.aVI();
        fad_15.setElementMap(fhs_23);
        fad_15.setExpandable(false);
        fmh_2 fmh_25 = new fmh_2();
        fmh_25.vw("wakfu.split:increaseSplitCountToMax(quantityTextEditor)");
        fad_15.setOnMousePress(fmh_25);
        fad_15.setPrefSize(new fsm_1(36, 36));
        fad_15.setStyle("doubleArrowRightSecondarySmall");
        faw_26.X(fad_15);
        fad_15.guy();
        fad_15.onChildrenAdded();
        faw_26.onChildrenAdded();
        faw_24.onChildrenAdded();
        fad_1 fad_16 = new fad_1();
        fad_16.aVI();
        fad_16.setElementMap(fhs_23);
        fad_16.setExpandable(false);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.split:validSplit");
        fad_16.setOnClick(fmz_12);
        fad_16.setPrefSize(new fsm_1(36, 36));
        fad_16.setStyle("tickPrimarySmall");
        faw_22.X(fad_16);
        fad_16.guy();
        fad_16.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


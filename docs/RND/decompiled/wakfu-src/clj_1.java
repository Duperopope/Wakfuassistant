/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLJ
 */
public class clj_1
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "popup";
        frx_1 frx_12 = new frx_1();
        frx_12.aVI();
        frx_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, frx_12);
        }
        frx_12.setAlign(faa_2.tLK);
        frx_12.setHideOnClick(false);
        frx_12.setHotSpotPosition(faa_2.tLS);
        frx_12.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setSize(new fsm_1(-2, -2));
        frx_12.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        frx_12.X(faw_22);
        faw_22.guy();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        String string2 = "container";
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, faw_23);
        }
        faw_23.setStyle("chatBubble");
        faw_22.X(faw_23);
        faw_23.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        faw_23.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        faw_2 faw_24 = faw_23;
        fys_0 fys_02 = ((fes_2)faw_24).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_23.X(fys_02);
        fys_02.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(0, 0, 15, 0));
        fys_02.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(10, 15, 10, 15));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setMaxWidth(200);
        fdy_12.setStyle("smallboldMap");
        faw_23.X(fdy_12);
        fdy_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("text");
        fsj_22.setName("mapPopupDescription");
        fdy_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("visible");
        fsj_23.setName("mapPopupIsEditing");
        fdy_12.X(fsj_23);
        fsj_23.guy();
        fjt_2 fjt_22 = new fjt_2();
        fjt_22.aVI();
        fjt_22.setElementMap(fhs_23);
        fsj_23.X(fjt_22);
        fjt_22.guy();
        fjw_2 fjw_22 = new fjw_2();
        fjw_22.aVI();
        fjw_22.setElementMap(fhs_23);
        fjt_22.X(fjw_22);
        fjw_22.guy();
        fjw_22.onChildrenAdded();
        fjt_22.onChildrenAdded();
        fsj_23.onChildrenAdded();
        fdy_12.onChildrenAdded();
        String string3 = "textEditor";
        fdu_1 fdu_12 = new fdu_1();
        fdu_12.aVI();
        fdu_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fdu_12);
        }
        fdu_12.setFocusable(true);
        fdu_12.abk(200);
        fdu_12.setMaxWidth(200);
        fdu_12.setMinWidth(200);
        fms_2 fms_22 = new fms_2();
        fms_22.vw("wakfu.map:onTextEditorKeyPress");
        fdu_12.setOnKeyPress(fms_22);
        fmu_2 fmu_22 = new fmu_2();
        fmu_22.vw("wakfu.map:onTextEditorChange");
        fdu_12.setOnKeyType(fmu_22);
        fdu_12.setSelectOnFocus(true);
        fdu_12.setStyle("withoutBorder");
        faw_23.X(fdu_12);
        fdu_12.guy();
        fsj_2 fsj_24 = fsj_2.checkOut();
        fsj_24.setElementMap(fhs_23);
        fsj_24.setAttribute("text");
        fsj_24.setName("mapPopupDescription");
        fdu_12.X(fsj_24);
        fsj_24.guy();
        fsj_24.onChildrenAdded();
        fsj_2 fsj_25 = fsj_2.checkOut();
        fsj_25.setElementMap(fhs_23);
        fsj_25.setAttribute("visible");
        fsj_25.setName("mapPopupIsEditing");
        fdu_12.X(fsj_25);
        fsj_25.guy();
        fsj_25.onChildrenAdded();
        fsj_2 fsj_26 = fsj_2.checkOut();
        fsj_26.setElementMap(fhs_23);
        fsj_26.setAttribute("focused");
        fsj_26.setName("mapPopupIsEditing");
        fdu_12.X(fsj_26);
        fsj_26.guy();
        fsj_26.onChildrenAdded();
        fdu_12.onChildrenAdded();
        String string4 = "valid";
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fad_12);
        }
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.map:applyNote");
        fad_12.setOnClick(fmz_12);
        fad_12.setStyle("smallValid");
        faw_23.X(fad_12);
        fad_12.guy();
        fsj_2 fsj_27 = fsj_2.checkOut();
        fsj_27.setElementMap(fhs_23);
        fsj_27.setAttribute("visible");
        fsj_27.setName("mapPopupIsEditing");
        fad_12.X(fsj_27);
        fsj_27.guy();
        fsj_27.onChildrenAdded();
        fad_12.onChildrenAdded();
        faw_23.onChildrenAdded();
        String string5 = "image";
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fbt_12);
        }
        fbt_12.setNonBlocking(true);
        fbt_12.setStyle("BubbleArrowRight");
        faw_22.X(fbt_12);
        fbt_12.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLo);
        frp_14.setSize(new fsm_1(-2, -2));
        fbt_12.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        fbt_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        frx_12.onChildrenAdded();
        return frx_12;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cOc
 */
public class coc_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fey_2 fey_22 = new fey_2();
        fey_22.aVI();
        fey_22.setElementMap(fhs_23);
        fey_22.setNonBlocking(true);
        fey_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLa);
        frp_12.setResizeOnce(true);
        fey_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        fey_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        faw_22.setNonBlocking(true);
        fey_22.X(faw_22);
        faw_22.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setAlign(fzw_0.tLg);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        faw_22.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        faw_23.setExpandable(false);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.toast:closeCurrentToast");
        faw_23.setOnClick(fmz_12);
        fme_1 fme_12 = new fme_1();
        fme_12.vw("wakfu.toast:enterToast");
        faw_23.setOnMouseEnter(fme_12);
        fmf_2 fmf_22 = new fmf_2();
        fmf_22.vw("wakfu.toast:exitToast");
        faw_23.setOnMouseExit(fmf_22);
        faw_23.setPrefSize(new fsm_1(14, 28));
        faw_22.X(faw_23);
        faw_23.guy();
        faw_2 faw_24 = faw_23;
        fys_0 fys_02 = ((fes_2)faw_24).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_23.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(18, 25, 24, 25));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("style");
        fsj_22.setField("style");
        fsj_22.setLocal(true);
        fsj_22.setName("textToast");
        faw_23.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setExpandable(false);
        fdy_12.setMaxWidth(800);
        fdy_12.setMinWidth(200);
        fdy_12.setMultiline(true);
        fdy_12.setStyle("wipLight16BoldBordered");
        faw_23.X(fdy_12);
        fdy_12.guy();
        fdy_1 fdy_13 = fdy_12;
        fzq fzq2 = (fzq)((fes_2)fdy_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlignment(faa_2.tLO);
        fdy_12.X(fzq2);
        fzq2.guy();
        fzq2.onChildrenAdded();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("text");
        fsj_23.setField("text");
        fsj_23.setLocal(true);
        fsj_23.setName("textToast");
        fdy_12.X(fsj_23);
        fsj_23.guy();
        fsj_23.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_23.onChildrenAdded();
        faw_2 faw_25 = faw_2.checkOut();
        faw_25.setElementMap(fhs_23);
        faw_25.setNonBlocking(true);
        faw_22.X(faw_25);
        faw_25.guy();
        faw_25.onChildrenAdded();
        faw_22.onChildrenAdded();
        fey_22.onChildrenAdded();
        return fey_22;
    }
}


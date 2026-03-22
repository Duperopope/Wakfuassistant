/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cJz
 */
public class cjz_2
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
        frx_12.setAlign(faa_2.tLM);
        frx_12.setHideOnClick(false);
        frx_12.setHotSpotPosition(faa_2.tLQ);
        frx_12.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setSize(new fsm_1(-2, -2));
        frx_12.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        String string2 = "container";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, faw_22);
        }
        frx_12.X(faw_22);
        faw_22.guy();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        fbt_12.setNonBlocking(true);
        faw_22.X(fbt_12);
        fbt_12.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setAlign(fzw_0.tLg);
        frp_13.setSize(new fsm_1(-2, -2));
        fbt_12.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fbt_12.X(fze2);
        fze2.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("texture");
        fsj_22.setName("currentMapScrollDecoratorPath");
        fze2.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fze2.onChildrenAdded();
        fbt_12.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setEnableAutoZoomShrink(true);
        fdy_12.setExpandable(false);
        fdy_12.setMaxWidth(150);
        fdy_12.setMultiline(false);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("backgroundBold");
        faw_22.X(fdy_12);
        fdy_12.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLg);
        frp_14.setSize(new fsm_1(-2, -2));
        fdy_12.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        fdy_1 fdy_13 = fdy_12;
        fzq fzq2 = (fzq)((fes_2)fdy_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fdy_12.X(fzq2);
        fzq2.guy();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("defaultLightColor"));
        fzq2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(30, 15, 15, 15));
        fzq2.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fzq2.onChildrenAdded();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("text");
        fsj_23.setName("mapPopupDescription");
        fdy_12.X(fsj_23);
        fsj_23.guy();
        fsj_23.onChildrenAdded();
        fsj_2 fsj_24 = fsj_2.checkOut();
        fsj_24.setElementMap(fhs_23);
        fsj_24.setAttribute("visible");
        fsj_24.setName("mapPopupIsEditing");
        fdy_12.X(fsj_24);
        fsj_24.guy();
        fjt_2 fjt_22 = new fjt_2();
        fjt_22.aVI();
        fjt_22.setElementMap(fhs_23);
        fsj_24.X(fjt_22);
        fjt_22.guy();
        fjw_2 fjw_22 = new fjw_2();
        fjw_22.aVI();
        fjw_22.setElementMap(fhs_23);
        fjt_22.X(fjw_22);
        fjw_22.guy();
        fjw_22.onChildrenAdded();
        fjt_22.onChildrenAdded();
        fsj_24.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        frx_12.onChildrenAdded();
        return frx_12;
    }
}


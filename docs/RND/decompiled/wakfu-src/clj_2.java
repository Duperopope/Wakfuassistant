/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLj
 */
public class clj_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        chj_2 chj_22 = new chj_2();
        chj_22.aVI();
        chj_22.setElementMap(fhs_23);
        chj_22.setNonBlocking(false);
        chj_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setInitValue(true);
        chj_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        faw_22.setPrefSize(new fsm_1(150, 20));
        chj_22.X(faw_22);
        faw_22.guy();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(4, 4, 4, 4));
        fys_02.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fys_02.onChildrenAdded();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        faw_22.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setAlign(faa_2.tLO);
        frz_22.setHorizontal(false);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setExpandable(true);
        fdy_12.setMaxWidth(300);
        fdy_12.setThemeElementName("text");
        fdy_12.setThemeElementParentType("interactiveBubble");
        faw_22.X(fdy_12);
        fdy_12.guy();
        fdy_1 fdy_13 = fdy_12;
        fzq fzq2 = (fzq)((fes_2)fdy_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlignment(faa_2.tLO);
        fdy_12.X(fzq2);
        fzq2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontName14"));
        fyW2.setElementMap(fhs_23);
        fzq2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("WPColor"));
        fzq2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzq2.onChildrenAdded();
        fdy_12.onChildrenAdded();
        fde_1 fde_12 = new fde_1();
        fde_12.aVI();
        fde_12.setElementMap(fhs_23);
        faw_22.X(fde_12);
        fde_12.guy();
        fde_12.onChildrenAdded();
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        faw_24.setExpandable(false);
        faw_24.setThemeElementName("buttonContainer");
        faw_24.setThemeElementParentType("interactiveBubble");
        faw_22.X(faw_24);
        faw_24.guy();
        frz_2 frz_23 = frz_2.checkOut();
        frz_23.setAlign(faa_2.tLO);
        frz_23.setHgap((short)100);
        faw_24.X(frz_23);
        frz_23.guy();
        frz_23.onChildrenAdded();
        faw_24.onChildrenAdded();
        fbv_2 fbv_22 = new fbv_2();
        fbv_22.aVI();
        fbv_22.setElementMap(fhs_23);
        fbv_22.setExpandable(false);
        fbv_22.setStyle("small");
        String string = "%leftClick.continue%";
        string = string.replace("%leftClick.continue%", fyw_0.gqw().k("leftClick.continue", new Object[0]));
        fbv_22.setText(string);
        fbv_22.setThemeElementName("clickLabel");
        fbv_22.setThemeElementParentType("interactiveBubble");
        fbv_22.setVisible(false);
        faw_22.X(fbv_22);
        fbv_22.guy();
        fbv_2 fbv_23 = fbv_22;
        fzq fzq3 = (fzq)((fes_2)fbv_23).getAppearance();
        fzq3.setElementMap(fhs_23);
        fzq3.setAlign(faa_2.tLO);
        fbv_22.X(fzq3);
        fzq3.guy();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new awx_2(0.5f, 0.5f, 0.25f, 1.0f));
        fyp_03.setName("text");
        fzq3.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fzq3.onChildrenAdded();
        fbv_22.onChildrenAdded();
        faw_22.onChildrenAdded();
        chj_22.onChildrenAdded();
        return chj_22;
    }
}


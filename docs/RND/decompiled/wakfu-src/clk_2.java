/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLk
 */
public class clk_2
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
        frp_12.setSize(new fsm_1(-2, -2));
        chj_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        chj_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        faw_22.setPrefSize(new fsm_1(10, 40));
        faw_22.setStyle("ChatBubbleBackground");
        faw_22.setVisible(false);
        chj_22.X(faw_22);
        faw_22.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        faw_22.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(5, 10, 10, 10));
        fys_02.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(5, 5, 5, 5));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        faw_22.onChildrenAdded();
        String string = "container";
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_24);
        }
        faw_24.setStyle("chatBubble");
        chj_22.X(faw_24);
        faw_24.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLk);
        faw_24.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        faw_2 faw_25 = faw_24;
        fys_0 fys_03 = ((fes_2)faw_25).getAppearance();
        fys_03.setElementMap(fhs_23);
        faw_24.X(fys_03);
        fys_03.guy();
        fzv fzv3 = fzv.checkOut();
        fzv3.setElementMap(fhs_23);
        fzv3.setInsets(new Insets(10, 15, 15, 15));
        fys_03.X(fzv3);
        fzv3.guy();
        fzv3.onChildrenAdded();
        fzx fzx3 = new fzx();
        fzx3.aVI();
        fzx3.setElementMap(fhs_23);
        fzx3.setInsets(new Insets(10, 15, 10, 15));
        fys_03.X(fzx3);
        fzx3.guy();
        fzx3.onChildrenAdded();
        fys_03.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setMaxWidth(350);
        fdy_12.setMinWidth(10);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("DefaultDarkBold14");
        fdy_12.setThemeElementName("text");
        fdy_12.setThemeElementParentType("interactiveBubble");
        faw_24.X(fdy_12);
        fdy_12.guy();
        frb_1 frb_12 = new frb_1();
        frb_12.aVI();
        frb_12.setElementMap(fhs_23);
        frb_12.setAlign(faa_2.tLO);
        fdy_12.X(frb_12);
        frb_12.guy();
        frb_12.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_2 faw_26 = faw_2.checkOut();
        faw_26.setElementMap(fhs_23);
        faw_26.setThemeElementName("buttonContainer");
        faw_26.setThemeElementParentType("interactiveBubble");
        faw_24.X(faw_26);
        faw_26.guy();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setAlign(faa_2.tLP);
        frz_22.setHgap((short)5);
        faw_26.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        faw_26.onChildrenAdded();
        faw_24.onChildrenAdded();
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        fbt_12.setNonBlocking(true);
        fbt_12.setStyle("BubbleArrowTopRight");
        chj_22.X(fbt_12);
        fbt_12.guy();
        frp_1 frp_15 = new frp_1();
        frp_15.aVI();
        frp_15.setElementMap(fhs_23);
        frp_15.setAlign(fzw_0.tLc);
        frp_15.setSize(new fsm_1(60, 10));
        fbt_12.X(frp_15);
        frp_15.guy();
        frp_15.onChildrenAdded();
        fbt_12.onChildrenAdded();
        chj_22.onChildrenAdded();
        return chj_22;
    }
}


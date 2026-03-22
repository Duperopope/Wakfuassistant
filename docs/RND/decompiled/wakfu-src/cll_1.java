/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLl
 */
public class cll_1
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
        String string = "container";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setPrefSize(new fsm_1(240, 40));
        faw_22.setStyle("backgroundPopup");
        chj_22.X(faw_22);
        faw_22.guy();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(10, 10, 10, 10));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setMaxWidth(220);
        fdy_12.setMinWidth(220);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("white");
        fdy_12.setThemeElementName("text");
        fdy_12.setThemeElementParentType("interactiveBubble");
        faw_22.X(fdy_12);
        fdy_12.guy();
        frb_1 frb_12 = new frb_1();
        frb_12.aVI();
        frb_12.setElementMap(fhs_23);
        frb_12.setAlign(faa_2.tLO);
        fdy_12.X(frb_12);
        frb_12.guy();
        frb_12.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        faw_24.setThemeElementName("buttonContainer");
        faw_24.setThemeElementParentType("interactiveBubble");
        faw_22.X(faw_24);
        faw_24.guy();
        frz_2 frz_23 = frz_2.checkOut();
        frz_23.setAlign(faa_2.tLP);
        frz_23.setHgap((short)5);
        faw_24.X(frz_23);
        frz_23.guy();
        frz_23.onChildrenAdded();
        faw_24.onChildrenAdded();
        faw_22.onChildrenAdded();
        chj_22.onChildrenAdded();
        return chj_22;
    }
}


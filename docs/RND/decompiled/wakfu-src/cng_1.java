/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNg
 */
public class cng_1
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fbu_2 fbu_22 = new fbu_2();
        fbu_22.aVI();
        fbu_22.setElementMap(fhs_23);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.petDialog:validOrSetNextMessage");
        fbu_22.setOnClick(fmz_12);
        fbu_22.setPack(true);
        fbu_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setSize(new fsm_1(-2, -2));
        fbu_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        fbu_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        String string = "container";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setStyle("petBubble");
        fbu_22.X(faw_22);
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
        fzv2.setInsets(new Insets(23, 0, 20, 0));
        fys_02.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fys_02.onChildrenAdded();
        String string2 = "text";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fdy_12);
        }
        fdy_12.setMaxWidth(250);
        fdy_12.setMinWidth(10);
        fdy_12.setStyle("DefaultBold14");
        faw_22.X(fdy_12);
        fdy_12.guy();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        String string3 = "image";
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fbt_12);
        }
        fbt_12.setStyle("petBubble");
        fbu_22.X(fbt_12);
        fbt_12.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tKY);
        frp_14.setSize(new fsm_1(-2, -2));
        frp_14.setXOffset(20);
        fbt_12.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        fbt_12.onChildrenAdded();
        fbu_22.onChildrenAdded();
        return fbu_22;
    }
}


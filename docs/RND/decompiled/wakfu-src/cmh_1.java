/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cMH
 */
public class cmh_1
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
        frx_12.setAlign(faa_2.tLL);
        frx_12.setHideOnClick(false);
        frx_12.setHotSpotPosition(faa_2.tLR);
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
        faw_22.setStyle("popup");
        frx_12.X(faw_22);
        faw_22.guy();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setMaxWidth(200);
        fdy_12.setStyle("white");
        faw_22.X(fdy_12);
        fdy_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("text");
        fsj_22.setName("minimapPopupDescription");
        fdy_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        frx_12.onChildrenAdded();
        return frx_12;
    }
}


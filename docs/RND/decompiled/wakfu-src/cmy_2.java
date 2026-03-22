/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cMY
 */
public class cmy_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "container1";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setYOffset(200);
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        String string2 = "container2";
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, faw_23);
        }
        faw_22.X(faw_23);
        faw_23.guy();
        String string3 = "text";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fdy_12);
        }
        fdy_12.setMaxWidth(800);
        fdy_12.setNonBlocking(true);
        fdy_12.setPrefSize(new fsm_1(0, 600));
        fdy_12.setStyle("notificationMessage");
        faw_23.X(fdy_12);
        fdy_12.guy();
        fdy_12.onChildrenAdded();
        faw_23.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


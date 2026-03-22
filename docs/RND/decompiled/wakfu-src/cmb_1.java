/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cMB
 */
public class cmb_1
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
        String string3 = "animatedElement";
        fax_1 fax_12 = new fax_1();
        fax_12.aVI();
        fax_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fax_12);
        }
        fax_12.setNonBlocking(true);
        faw_23.X(fax_12);
        fax_12.guy();
        fax_12.onChildrenAdded();
        faw_23.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


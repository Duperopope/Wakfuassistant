/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cIN
 */
public class cin_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fdd_1 fdd_12 = new fdd_1();
        fdd_12.aVI();
        fdd_12.setElementMap(fhs_23);
        fdd_12.setNonBlocking(true);
        fdd_12.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setSize(new fsm_1(32, 32));
        fdd_12.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        String string = "animatedElementViewer";
        fax_1 fax_12 = new fax_1();
        fax_12.aVI();
        fax_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fax_12);
        }
        fax_12.setDirection(2);
        fax_12.setNonBlocking(true);
        fax_12.setPrefSize(new fsm_1(32, 32));
        fax_12.setScale(1.5f);
        fdd_12.X(fax_12);
        fax_12.guy();
        fax_12.onChildrenAdded();
        fdd_12.onChildrenAdded();
        return fdd_12;
    }
}


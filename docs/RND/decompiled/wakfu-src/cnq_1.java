/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cNQ
 */
public class cnq_1
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
        fey_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        fey_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        fey_22.X(faw_22);
        faw_22.guy();
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("unloadDialog");
        fbt_12.setOnClick(fmz_12);
        faw_22.X(fbt_12);
        fbt_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fbt_12.X(fze2);
        fze2.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("texture");
        fsj_22.setName("splashScreenIconUrl");
        fze2.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fze2.onChildrenAdded();
        fbt_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        fey_22.onChildrenAdded();
        return fey_22;
    }
}


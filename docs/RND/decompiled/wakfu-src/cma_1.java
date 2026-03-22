/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cMA
 */
public class cma_1
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
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        String string2 = "bannerImage";
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fbt_12);
        }
        fbt_12.setNonBlocking(true);
        faw_22.X(fbt_12);
        fbt_12.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
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
        fsj_22.setLocal(true);
        fsj_22.setName("bannerImageIconUrl");
        fze2.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fze2.onChildrenAdded();
        fbt_12.onChildrenAdded();
        String string3 = "text";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fdy_12);
        }
        fdy_12.setMaxWidth(700);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("bigBordered");
        faw_22.X(fdy_12);
        fdy_12.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setSize(new fsm_1(100.0f, 100.0f));
        fdy_12.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        fdy_1 fdy_13 = fdy_12;
        fzq fzq2 = (fzq)((fes_2)fdy_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLR);
        fdy_12.X(fzq2);
        fzq2.guy();
        fzq2.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cNP
 */
public class cnp_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "mainContainer";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setNonBlocking(true);
        faw_22.setStyle("genericSplash");
        faw_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setYOffset(160);
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setAlign(faa_2.tLR);
        frz_22.setHorizontal(false);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        String string2 = "text";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fdy_12);
        }
        fdy_12.setMaxWidth(350);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("BigBordered");
        faw_22.X(fdy_12);
        fdy_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("text");
        fsj_22.setName("splashText");
        fdy_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


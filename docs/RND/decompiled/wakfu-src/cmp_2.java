/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cMP
 */
public class cmp_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "mru";
        fdp_1 fdp_12 = new fdp_1();
        fdp_12.aVI();
        fdp_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fdp_12);
        }
        fdp_12.guy();
        String string2 = "popup";
        frx_1 frx_12 = new frx_1();
        frx_12.aVI();
        frx_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, frx_12);
        }
        frx_12.setAlign(faa_2.tLL);
        frx_12.setHotSpotPosition(faa_2.tLR);
        fdp_12.X(frx_12);
        frx_12.guy();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        faw_22.setStyle("popup");
        frx_12.X(faw_22);
        faw_22.guy();
        String string3 = "popupText";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fdy_12);
        }
        fdy_12.setStyle("DefaultWhite");
        faw_22.X(fdy_12);
        fdy_12.guy();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        frx_12.onChildrenAdded();
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        fdp_12.X(fad_12);
        fad_12.guy();
        fad_12.onChildrenAdded();
        fdp_12.onChildrenAdded();
        return fdp_12;
    }
}


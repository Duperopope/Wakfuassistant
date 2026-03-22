/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cKa
 */
public class cka_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        fad_12.setNonBlocking(false);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.displayButton:nextStep()");
        fad_12.setOnClick(fmz_12);
        fad_12.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLo);
        frp_12.setInitValue(true);
        frp_12.setSize(new fsm_1(-2, -2));
        frp_12.setXOffset(-10);
        frp_12.setYOffset(10);
        fad_12.X(frp_12);
        frp_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("xOffset");
        fsj_22.setField("xOffset");
        fsj_22.setName("displayButton");
        frp_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("yOffset");
        fsj_23.setField("yOffset");
        fsj_23.setName("displayButton");
        frp_12.X(fsj_23);
        fsj_23.guy();
        fsj_23.onChildrenAdded();
        fsj_2 fsj_24 = fsj_2.checkOut();
        fsj_24.setElementMap(fhs_23);
        fsj_24.setAttribute("align");
        fsj_24.setField("alignment");
        fsj_24.setName("displayButton");
        frp_12.X(fsj_24);
        fsj_24.guy();
        fsj_24.onChildrenAdded();
        frp_12.onChildrenAdded();
        fsj_2 fsj_25 = fsj_2.checkOut();
        fsj_25.setElementMap(fhs_23);
        fsj_25.setAttribute("text");
        fsj_25.setField("text");
        fsj_25.setName("displayButton");
        fad_12.X(fsj_25);
        fsj_25.guy();
        fsj_25.onChildrenAdded();
        fad_12.onChildrenAdded();
        return fad_12;
    }
}


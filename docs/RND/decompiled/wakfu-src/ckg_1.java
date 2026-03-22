/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cKg
 */
public class ckg_1
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        faw_22.setNonBlocking(false);
        faw_22.setPrefSize(new fsm_1(200, 200));
        faw_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setSize(new fsm_1(200, 200));
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        fax_1 fax_12 = new fax_1();
        fax_12.aVI();
        fax_12.setElementMap(fhs_23);
        fax_12.setNonBlocking(true);
        fax_12.setOffsetY(-80.0f);
        fax_12.setPrefSize(new fsm_1(200, 200));
        fax_12.setScale(2.5f);
        faw_22.X(fax_12);
        fax_12.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(200, 200));
        fax_12.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("filePath");
        fsj_22.setLocal(true);
        fsj_22.setName("filePath");
        fax_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("animName");
        fsj_23.setLocal(true);
        fsj_23.setName("animName");
        fax_12.X(fsj_23);
        fsj_23.guy();
        fsj_23.onChildrenAdded();
        fsj_2 fsj_24 = fsj_2.checkOut();
        fsj_24.setElementMap(fhs_23);
        fsj_24.setAttribute("direction");
        fsj_24.setLocal(true);
        fsj_24.setName("direction");
        fax_12.X(fsj_24);
        fsj_24.guy();
        fsj_24.onChildrenAdded();
        fax_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


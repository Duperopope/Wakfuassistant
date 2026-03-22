/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dxA
 */
public class dxa_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fys_0 fys_02 = fes_23.getAppearance();
        fys_02.setElementMap(fhs_23);
        fes_22.X(fys_02);
        fys_02.guy();
        fkk_1 fkk_12 = new fkk_1();
        fkk_12.aVI();
        fkk_12.setElementMap(fhs_23);
        fkk_12.setScaled(false);
        fys_02.X(fkk_12);
        fkk_12.guy();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new awx_2(0.0f, 0.0f, 0.0f, 0.5f));
        fkk_12.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fkk_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}


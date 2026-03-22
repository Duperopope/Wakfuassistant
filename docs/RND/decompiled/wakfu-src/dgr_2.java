/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from dGr
 */
public class dgr_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fyY fyY2 = (fyY)fes_23.getAppearance();
        fyY2.setElementMap(fhs_23);
        fes_22.X(fyY2);
        fyY2.guy();
        fkm_1 fkm_12 = new fkm_1();
        fkm_12.aVI();
        fkm_12.setElementMap(fhs_23);
        fkm_12.setInsets(new Insets(2, 2, 2, 2));
        fyY2.X(fkm_12);
        fkm_12.guy();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("defaultLightColor"));
        fkm_12.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fkm_12.onChildrenAdded();
        fyY2.onChildrenAdded();
    }
}


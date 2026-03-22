/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dXj
 */
public class dxj_0
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        chl_2 chl_22 = (chl_2)fes_23.getAppearance();
        chl_22.setElementMap(fhs_23);
        fes_22.X(chl_22);
        chl_22.guy();
        chl_22.onChildrenAdded();
    }
}


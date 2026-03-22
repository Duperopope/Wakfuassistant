/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from egj
 */
public class egj_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fes_2 fes_24 = fes_22;
        fys_0 fys_02 = fes_24.getAppearance();
        fys_02.setElementMap(fhs_23);
        fes_22.X(fys_02);
        fys_02.guy();
        fkm_1 fkm_12 = new fkm_1();
        fkm_12.aVI();
        fkm_12.setElementMap(fhs_23);
        fkm_12.setColor(new fhl_2("mainTextTitleColor", 0.3f));
        fkm_12.setInsets(new Insets(0, 0, 1, 0));
        fys_02.X(fkm_12);
        fkm_12.guy();
        fkm_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}


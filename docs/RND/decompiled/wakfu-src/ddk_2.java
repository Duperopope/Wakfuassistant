/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dDK
 */
public class ddk_2
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
        fka_1 fka_12 = new fka_1();
        fka_12.aVI();
        fka_12.setElementMap(fhs_23);
        fka_12.setAlignment(faa_2.tLO);
        fka_12.setFile("6001077.xps");
        fka_12.setLevel(1);
        fyY2.X(fka_12);
        fka_12.guy();
        fka_12.onChildrenAdded();
        fyY2.onChildrenAdded();
    }
}


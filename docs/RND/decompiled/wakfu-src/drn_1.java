/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from drn
 */
public class drn_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzs fzs2 = (fzs)fes_23.getAppearance();
        fzs2.setElementMap(fhs_23);
        fzs2.setAlignment(faa_2.tLN);
        fzs2.setState("default");
        fes_22.X(fzs2);
        fzs2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault16"));
        fyW2.setElementMap(fhs_23);
        fzs2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("mainTextLightColor"));
        fzs2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzs2.onChildrenAdded();
    }
}


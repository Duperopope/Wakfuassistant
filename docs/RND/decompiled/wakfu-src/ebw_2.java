/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebW
 */
public class ebw_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzg fzg2 = (fzg)fes_23.getAppearance();
        fzg2.setElementMap(fhs_23);
        fes_22.X(fzg2);
        fzg2.guy();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("xpPremiumColor"));
        fzg2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzg2.onChildrenAdded();
    }
}


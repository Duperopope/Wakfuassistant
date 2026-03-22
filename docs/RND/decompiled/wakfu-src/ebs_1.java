/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebS
 */
public class ebs_1
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
        fyp_02.setColor(new fhl_2("xpColorCompanion"));
        fzg2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzg2.onChildrenAdded();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(12);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple2"));
        fze2.setWidth(1);
        fze2.setX(299);
        fze2.setY(254);
        fes_22.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dWb
 */
public class dwb_0
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
        fes_2 fes_24 = fyY2.getParentOfType(fes_2.class);
        fyY fyY3 = (fyY)fes_24.getAppearance();
        fyY3.setElementMap(fhs_23);
        fyY3.setScaled(true);
        fyY3.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(6);
        fze2.setPosition(fzw_0.tLg);
        fze2.setRotation(asp_1.dad);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(13);
        fze2.setX(415);
        fze2.setY(771);
        fyY3.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fyY3.onChildrenAdded();
        fyY2.onChildrenAdded();
    }
}


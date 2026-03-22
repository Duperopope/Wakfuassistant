/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dSs
 */
public class dss_1
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
        fyY2.setScaled(false);
        fes_22.X(fyY2);
        fyY2.guy();
        String string = "pmLaurel";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(18);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(21);
        fze2.setX(294);
        fze2.setY(615);
        fyY2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fyY2.onChildrenAdded();
    }
}


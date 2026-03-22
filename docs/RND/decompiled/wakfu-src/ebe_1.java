/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebe
 */
public class ebe_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzb fzb2 = (fzb)fes_23.getAppearance();
        fzb2.setElementMap(fhs_23);
        fzb2.setEndX(1813);
        fzb2.setEndY(921);
        fzb2.setStartX(205);
        fzb2.setStartY(114);
        fes_22.X(fzb2);
        fzb2.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(1120);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txMapFrame"));
        fze2.setWidth(2048);
        fze2.setX(0);
        fze2.setY(0);
        fzb2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fzb2.onChildrenAdded();
    }
}


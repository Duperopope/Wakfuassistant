/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from eov
 */
public class eov_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(1, 1, 1, 1));
        fes_22.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_02 = (fym_0)fes_24.getAppearance();
        fym_02.setElementMap(fhs_23);
        fym_02.setState("default");
        fes_22.X(fym_02);
        fym_02.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(12);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(10);
        fze2.setX(131);
        fze2.setY(1);
        fym_02.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_03 = (fym_0)fes_25.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(12);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(10);
        fze3.setX(131);
        fze3.setY(1);
        fym_03.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_04 = (fym_0)fes_26.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(12);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themePressed"));
        fze4.setWidth(10);
        fze4.setX(131);
        fze4.setY(1);
        fym_04.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fym_04.onChildrenAdded();
    }
}


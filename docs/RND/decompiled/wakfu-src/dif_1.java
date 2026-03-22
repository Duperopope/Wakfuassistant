/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from diF
 */
public class dif_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fym_0 fym_02 = (fym_0)fes_23.getAppearance();
        fym_02.setElementMap(fhs_23);
        fym_02.setState("default");
        fes_22.X(fym_02);
        fym_02.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(11);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(11);
        fze2.setX(1470);
        fze2.setY(266);
        fym_02.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new awx_2(1.0f, 1.0f, 1.0f, 1.0f));
        fyp_02.setDecoratorSwitch(true);
        fyp_02.setName("modulation");
        fym_02.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setState("disabled");
        fes_22.X(fym_03);
        fym_03.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(11);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeSimple"));
        fze3.setWidth(11);
        fze3.setX(1470);
        fze3.setY(266);
        fym_03.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new awx_2(0.7f, 0.7f, 0.7f, 0.4f));
        fyp_03.setDecoratorSwitch(true);
        fyp_03.setName("modulation");
        fym_03.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fym_03.onChildrenAdded();
    }
}


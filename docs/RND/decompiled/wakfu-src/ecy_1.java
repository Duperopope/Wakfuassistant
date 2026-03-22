/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ecy
 */
public class ecy_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzk fzk2 = (fzk)fes_23.getAppearance();
        fzk2.setElementMap(fhs_23);
        fzk2.setAlignment(faa_2.tLO);
        fzk2.setState("default");
        fes_22.X(fzk2);
        fzk2.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(28);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(28);
        fze2.setX(1414);
        fze2.setY(266);
        fzk2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new awx_2(1.0f, 1.0f, 1.0f, 1.0f));
        fyp_02.setDecoratorSwitch(true);
        fyp_02.setName("modulation");
        fzk2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzk2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzk fzk3 = (fzk)fes_24.getAppearance();
        fzk3.setElementMap(fhs_23);
        fzk3.setState("pressed");
        fes_22.X(fzk3);
        fzk3.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(28);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeSimple"));
        fze3.setWidth(28);
        fze3.setX(1382);
        fze3.setY(266);
        fzk3.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new awx_2(1.0f, 1.0f, 1.0f, 1.0f));
        fyp_03.setDecoratorSwitch(true);
        fyp_03.setName("modulation");
        fzk3.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fzk3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzk fzk4 = (fzk)fes_25.getAppearance();
        fzk4.setElementMap(fhs_23);
        fzk4.setAlignment(faa_2.tLO);
        fzk4.setState("disabled");
        fes_22.X(fzk4);
        fzk4.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(28);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themeSimple"));
        fze4.setWidth(28);
        fze4.setX(1414);
        fze4.setY(266);
        fzk4.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fyp_0 fyp_04 = fyp_0.checkOut();
        fyp_04.setElementMap(fhs_23);
        fyp_04.setColor(new awx_2(0.7f, 0.7f, 0.7f, 0.4f));
        fyp_04.setDecoratorSwitch(true);
        fyp_04.setName("modulation");
        fzk4.X(fyp_04);
        fyp_04.guy();
        fyp_04.onChildrenAdded();
        fzk4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzk fzk5 = (fzk)fes_26.getAppearance();
        fzk5.setElementMap(fhs_23);
        fzk5.setAlignment(faa_2.tLO);
        fzk5.setState("selected");
        fes_22.X(fzk5);
        fzk5.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(28);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("themeSimple"));
        fze5.setWidth(28);
        fze5.setX(1382);
        fze5.setY(266);
        fzk5.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fyp_0 fyp_05 = fyp_0.checkOut();
        fyp_05.setElementMap(fhs_23);
        fyp_05.setColor(new awx_2(1.0f, 1.0f, 1.0f, 1.0f));
        fyp_05.setDecoratorSwitch(true);
        fyp_05.setName("modulation");
        fzk5.X(fyp_05);
        fyp_05.guy();
        fyp_05.onChildrenAdded();
        fzk5.onChildrenAdded();
    }
}


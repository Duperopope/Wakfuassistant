/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dpX
 */
public class dpx_0
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
        fym_02.setAlignment(faa_2.tLO);
        fym_02.setState("default");
        fes_22.X(fym_02);
        fym_02.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault10Bold"));
        fyW2.setElementMap(fhs_23);
        fym_02.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("whiteColor"));
        fym_02.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        fkd_12.setScaled(true);
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(68);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(212);
        fze2.setX(773);
        fze2.setY(188);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setAlignment(faa_2.tLO);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        fkd_13.setScaled(true);
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(68);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(212);
        fze3.setX(773);
        fze3.setY(188);
        fkd_13.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fkd_13.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setAlignment(faa_2.tLO);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        fkd_14.setScaled(true);
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(68);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themePressed"));
        fze4.setWidth(212);
        fze4.setX(773);
        fze4.setY(188);
        fkd_14.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fym_04.onChildrenAdded();
    }
}


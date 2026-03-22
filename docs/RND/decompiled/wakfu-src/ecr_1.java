/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ecr
 */
public class ecr_1
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
        fze2.setHeight(16);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(16);
        fze2.setX(22);
        fze2.setY(401);
        fzk2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fzk2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzk fzk3 = (fzk)fes_24.getAppearance();
        fzk3.setElementMap(fhs_23);
        fzk3.setAlignment(faa_2.tLO);
        fzk3.setState("mouseHover");
        fes_22.X(fzk3);
        fzk3.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(16);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(16);
        fze3.setX(22);
        fze3.setY(401);
        fzk3.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fzk3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzk fzk4 = (fzk)fes_25.getAppearance();
        fzk4.setElementMap(fhs_23);
        fzk4.setAlignment(faa_2.tLO);
        fzk4.setState("pressed");
        fes_22.X(fzk4);
        fzk4.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(16);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themePressed"));
        fze4.setWidth(16);
        fze4.setX(22);
        fze4.setY(401);
        fzk4.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
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
        fze5.setHeight(16);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("themeDefaultSelected"));
        fze5.setWidth(16);
        fze5.setX(22);
        fze5.setY(401);
        fzk5.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fzk5.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fzk fzk6 = (fzk)fes_27.getAppearance();
        fzk6.setElementMap(fhs_23);
        fzk6.setAlignment(faa_2.tLO);
        fzk6.setState("mouseHoverSelected");
        fes_22.X(fzk6);
        fzk6.guy();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(16);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("themeOverSelected"));
        fze6.setWidth(16);
        fze6.setX(22);
        fze6.setY(401);
        fzk6.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fzk6.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fzk fzk7 = (fzk)fes_28.getAppearance();
        fzk7.setElementMap(fhs_23);
        fzk7.setAlignment(faa_2.tLO);
        fzk7.setState("pressedSelected");
        fes_22.X(fzk7);
        fzk7.guy();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(16);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("themePressedSelected"));
        fze7.setWidth(16);
        fze7.setX(22);
        fze7.setY(401);
        fzk7.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fzk7.onChildrenAdded();
    }
}


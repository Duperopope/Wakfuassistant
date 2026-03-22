/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class dqO
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzs fzs2 = (fzs)fes_23.getAppearance();
        fzs2.setElementMap(fhs_23);
        fzs2.setState("default");
        fes_22.X(fzs2);
        fzs2.guy();
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        fkd_12.setScaled(true);
        fzs2.X(fkd_12);
        fkd_12.guy();
        String string = "fightBarButtonDefaultPixmap";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(35);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(33);
        fze2.setX(297);
        fze2.setY(525);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fzs2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzs fzs3 = (fzs)fes_24.getAppearance();
        fzs3.setElementMap(fhs_23);
        fzs3.setState("pressed");
        fes_22.X(fzs3);
        fzs3.guy();
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        fkd_13.setScaled(true);
        fzs3.X(fkd_13);
        fkd_13.guy();
        String string2 = "fightBarButtonPressedPixmap";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(35);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themePressed"));
        fze3.setWidth(33);
        fze3.setX(297);
        fze3.setY(525);
        fkd_13.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fkd_13.onChildrenAdded();
        fzs3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzs fzs4 = (fzs)fes_25.getAppearance();
        fzs4.setElementMap(fhs_23);
        fzs4.setState("mouseHover");
        fes_22.X(fzs4);
        fzs4.guy();
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        fkd_14.setScaled(true);
        fzs4.X(fkd_14);
        fkd_14.guy();
        String string3 = "fightBarButtonOverPixmap";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(35);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themeOver"));
        fze4.setWidth(33);
        fze4.setX(297);
        fze4.setY(525);
        fkd_14.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fzs4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzs fzs5 = (fzs)fes_26.getAppearance();
        fzs5.setElementMap(fhs_23);
        fzs5.setState("disabled");
        fes_22.X(fzs5);
        fzs5.guy();
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        fkd_15.setScaled(true);
        fzs5.X(fkd_15);
        fkd_15.guy();
        String string4 = "fightBarButtonDisabledPixmap";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(35);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("themeDisabled"));
        fze5.setWidth(33);
        fze5.setX(297);
        fze5.setY(525);
        fkd_15.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fzs5.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fzs fzs6 = (fzs)fes_27.getAppearance();
        fzs6.setElementMap(fhs_23);
        fzs6.setState("selected");
        fes_22.X(fzs6);
        fzs6.guy();
        fkd_1 fkd_16 = fkd_1.checkOut();
        fkd_16.setElementMap(fhs_23);
        fkd_16.setScaled(true);
        fzs6.X(fkd_16);
        fkd_16.guy();
        String string5 = "fightBarButtonSelectedPixmap";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(35);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("themeDefaultSelected"));
        fze6.setWidth(33);
        fze6.setX(297);
        fze6.setY(525);
        fkd_16.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fkd_16.onChildrenAdded();
        fzs6.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fzs fzs7 = (fzs)fes_28.getAppearance();
        fzs7.setElementMap(fhs_23);
        fzs7.setState("pressedSelected");
        fes_22.X(fzs7);
        fzs7.guy();
        fkd_1 fkd_17 = fkd_1.checkOut();
        fkd_17.setElementMap(fhs_23);
        fkd_17.setScaled(true);
        fzs7.X(fkd_17);
        fkd_17.guy();
        String string6 = "fightBarButtonSelectedPressedPixmap";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze7);
        }
        fze7.setHeight(35);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("themePressedSelected"));
        fze7.setWidth(33);
        fze7.setX(297);
        fze7.setY(525);
        fkd_17.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fkd_17.onChildrenAdded();
        fzs7.onChildrenAdded();
        fes_2 fes_29 = fes_22;
        fzs fzs8 = (fzs)fes_29.getAppearance();
        fzs8.setElementMap(fhs_23);
        fzs8.setState("mouseHoverSelected");
        fes_22.X(fzs8);
        fzs8.guy();
        fkd_1 fkd_18 = fkd_1.checkOut();
        fkd_18.setElementMap(fhs_23);
        fkd_18.setScaled(true);
        fzs8.X(fkd_18);
        fkd_18.guy();
        String string7 = "fightBarButtonSelectedOverPixmap";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setHeight(35);
        fze8.setPosition(fzw_0.tLg);
        fze8.setTexture(this.okR.uF("themeOverSelected"));
        fze8.setWidth(33);
        fze8.setX(297);
        fze8.setY(525);
        fkd_18.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fkd_18.onChildrenAdded();
        fzs8.onChildrenAdded();
        fes_2 fes_210 = fes_22;
        fzs fzs9 = (fzs)fes_210.getAppearance();
        fzs9.setElementMap(fhs_23);
        fzs9.setState("disabledSelected");
        fes_22.X(fzs9);
        fzs9.guy();
        fkd_1 fkd_19 = fkd_1.checkOut();
        fkd_19.setElementMap(fhs_23);
        fkd_19.setScaled(true);
        fzs9.X(fkd_19);
        fkd_19.guy();
        String string8 = "fightBarButtonSelectedDisabledPixmap";
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fze9);
        }
        fze9.setHeight(35);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("themeDisabledSelected"));
        fze9.setWidth(33);
        fze9.setX(297);
        fze9.setY(525);
        fkd_19.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkd_19.onChildrenAdded();
        fzs9.onChildrenAdded();
    }
}


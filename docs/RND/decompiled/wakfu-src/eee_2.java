/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eee
 */
public class eee_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fes_2 fes_24 = fes_22;
        fym_0 fym_02 = (fym_0)fes_24.getAppearance();
        fym_02.setElementMap(fhs_23);
        fym_02.setState("default");
        fes_22.X(fym_02);
        fym_02.guy();
        String string = "pmSmallLeftSideArrow2Default";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(16);
        fze2.setPosition(fzw_0.tLg);
        fze2.setRotation(asp_1.daf);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(28);
        fze2.setX(173);
        fze2.setY(431);
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
        String string2 = "pmSmallLeftSideArrow2Over";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(16);
        fze3.setPosition(fzw_0.tLg);
        fze3.setRotation(asp_1.daf);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(28);
        fze3.setX(173);
        fze3.setY(431);
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
        String string3 = "pmSmallLeftSideArrow2Pressed";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(16);
        fze4.setPosition(fzw_0.tLg);
        fze4.setRotation(asp_1.daf);
        fze4.setTexture(this.okR.uF("themePressed"));
        fze4.setWidth(28);
        fze4.setX(173);
        fze4.setY(431);
        fym_04.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fym_0 fym_05 = (fym_0)fes_27.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string4 = "pmSmallLeftSideArrow2Disabled";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(16);
        fze5.setPosition(fzw_0.tLg);
        fze5.setRotation(asp_1.daf);
        fze5.setTexture(this.okR.uF("themeDisabled"));
        fze5.setWidth(28);
        fze5.setX(173);
        fze5.setY(431);
        fym_05.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fym_05.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fym_0 fym_06 = (fym_0)fes_28.getAppearance();
        fym_06.setElementMap(fhs_23);
        fym_06.setState("selected");
        fes_22.X(fym_06);
        fym_06.guy();
        String string5 = "pmSmallLeftSideArrow2DefaultSelected";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(16);
        fze6.setPosition(fzw_0.tLg);
        fze6.setRotation(asp_1.daf);
        fze6.setTexture(this.okR.uF("themeDefaultSelected"));
        fze6.setWidth(28);
        fze6.setX(173);
        fze6.setY(431);
        fym_06.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fym_06.onChildrenAdded();
        fes_2 fes_29 = fes_22;
        fym_0 fym_07 = (fym_0)fes_29.getAppearance();
        fym_07.setElementMap(fhs_23);
        fym_07.setState("mouseHoverSelected");
        fes_22.X(fym_07);
        fym_07.guy();
        String string6 = "pmSmallLeftSideArrow2OverSelected";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze7);
        }
        fze7.setHeight(16);
        fze7.setPosition(fzw_0.tLg);
        fze7.setRotation(asp_1.daf);
        fze7.setTexture(this.okR.uF("themeOverSelected"));
        fze7.setWidth(28);
        fze7.setX(173);
        fze7.setY(431);
        fym_07.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fym_07.onChildrenAdded();
        fes_2 fes_210 = fes_22;
        fym_0 fym_08 = (fym_0)fes_210.getAppearance();
        fym_08.setElementMap(fhs_23);
        fym_08.setState("pressedSelected");
        fes_22.X(fym_08);
        fym_08.guy();
        String string7 = "pmSmallLeftSideArrow2PressedSelected";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setHeight(16);
        fze8.setPosition(fzw_0.tLg);
        fze8.setRotation(asp_1.daf);
        fze8.setTexture(this.okR.uF("themePressedSelected"));
        fze8.setWidth(28);
        fze8.setX(173);
        fze8.setY(431);
        fym_08.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fym_08.onChildrenAdded();
        fes_2 fes_211 = fes_22;
        fym_0 fym_09 = (fym_0)fes_211.getAppearance();
        fym_09.setElementMap(fhs_23);
        fym_09.setState("disabledSelected");
        fes_22.X(fym_09);
        fym_09.guy();
        String string8 = "pmSmallLeftSideArrow2DisabledSelected";
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fze9);
        }
        fze9.setHeight(16);
        fze9.setPosition(fzw_0.tLg);
        fze9.setRotation(asp_1.daf);
        fze9.setTexture(this.okR.uF("themeDisabledSelected"));
        fze9.setWidth(28);
        fze9.setX(173);
        fze9.setY(431);
        fym_09.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fym_09.onChildrenAdded();
    }
}


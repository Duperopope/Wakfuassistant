/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class doM
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
        String string = "pmItemsWhite100";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(16);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txItems"));
        fze2.setWidth(16);
        fze2.setX(2);
        fze2.setY(46);
        fym_02.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        String string2 = "pmbDefaultButtonToggleTop";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_12);
        }
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(23);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txToggleButton"));
        fze3.setWidth(30);
        fze3.setX(0);
        fze3.setY(0);
        fkd_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        String string3 = "pmItemsWhite100";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(16);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txItems"));
        fze4.setWidth(16);
        fze4.setX(2);
        fze4.setY(46);
        fym_03.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        String string4 = "pmbHoverButtonButtonToggleTop";
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fkd_13);
        }
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(23);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txToggleButton"));
        fze5.setWidth(30);
        fze5.setX(0);
        fze5.setY(26);
        fkd_13.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fkd_13.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        String string5 = "pmItemsWhite100";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(16);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("txItems"));
        fze6.setWidth(16);
        fze6.setX(2);
        fze6.setY(46);
        fym_04.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        String string6 = "pmbPressedButtonButtonToggleTop";
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fkd_14);
        }
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(23);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txToggleButton"));
        fze7.setWidth(30);
        fze7.setX(0);
        fze7.setY(52);
        fkd_14.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string7 = "pmItemsWhite25";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setHeight(16);
        fze8.setPosition(fzw_0.tLg);
        fze8.setTexture(this.okR.uF("txItems"));
        fze8.setWidth(16);
        fze8.setX(2);
        fze8.setY(90);
        fym_05.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        String string8 = "pmbDisabledButtonButtonToggleTop";
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fkd_15);
        }
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(23);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("txToggleButton"));
        fze9.setWidth(30);
        fze9.setX(0);
        fze9.setY(78);
        fkd_15.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}


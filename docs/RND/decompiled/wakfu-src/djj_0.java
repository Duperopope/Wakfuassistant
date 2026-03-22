/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from djJ
 */
public class djj_0
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
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(0, 5, 0, 0));
        fym_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault16"));
        fyW2.setElementMap(fhs_23);
        fym_02.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        String string = "pmExchangeChevronsUp";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(18);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txExchangeChevrons"));
        fze2.setWidth(18);
        fze2.setX(1);
        fze2.setY(0);
        fym_02.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        String string2 = "pmbExchangeButtonDefault";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_12);
        }
        fkd_12.setRepeated(false);
        fkd_12.setScaled(false);
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(52);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txExchangeButton"));
        fze3.setWidth(25);
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
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("mainTextLightColor"));
        fym_03.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        String string3 = "pmExchangeChevronsUp";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(18);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txExchangeChevrons"));
        fze4.setWidth(18);
        fze4.setX(1);
        fze4.setY(0);
        fym_03.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        String string4 = "pmbExchangeButtonHover";
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fkd_13);
        }
        fkd_13.setRepeated(false);
        fkd_13.setScaled(false);
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(52);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txExchangeButton"));
        fze5.setWidth(25);
        fze5.setX(0);
        fze5.setY(54);
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
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new fhl_2("mainTextTitleColor"));
        fym_04.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        String string5 = "pmExchangeChevronsUp";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(18);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("txExchangeChevrons"));
        fze6.setWidth(18);
        fze6.setX(1);
        fze6.setY(0);
        fym_04.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        String string6 = "pmbExchangeButtonPressed";
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fkd_14);
        }
        fkd_14.setRepeated(false);
        fkd_14.setScaled(false);
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(52);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txExchangeButton"));
        fze7.setWidth(25);
        fze7.setX(0);
        fze7.setY(108);
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
        fyp_0 fyp_04 = fyp_0.checkOut();
        fyp_04.setElementMap(fhs_23);
        fyp_04.setColor(new fhl_2("disabledTextColor"));
        fym_05.X(fyp_04);
        fyp_04.guy();
        fyp_04.onChildrenAdded();
        String string7 = "pmExchangeChevronsUp";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setHeight(18);
        fze8.setPosition(fzw_0.tLg);
        fze8.setTexture(this.okR.uF("txExchangeChevrons"));
        fze8.setWidth(18);
        fze8.setX(1);
        fze8.setY(0);
        fym_05.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        String string8 = "pmbExchangeButtonDisabled";
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fkd_15);
        }
        fkd_15.setRepeated(false);
        fkd_15.setScaled(false);
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(52);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("txExchangeButton"));
        fze9.setWidth(25);
        fze9.setX(0);
        fze9.setY(162);
        fkd_15.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}


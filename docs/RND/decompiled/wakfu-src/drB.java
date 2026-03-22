/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

public class drB
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
        String string = "pmbExchangeToggleButtonDefault";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fkd_12.setRepeated(false);
        fkd_12.setScaled(false);
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(54);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze2.setWidth(54);
        fze2.setX(6);
        fze2.setY(0);
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
        String string2 = "pmbExchangeToggleButtonHover";
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_13);
        }
        fkd_13.setRepeated(false);
        fkd_13.setScaled(false);
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(54);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze3.setWidth(54);
        fze3.setX(6);
        fze3.setY(68);
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
        String string3 = "pmbExchangeToggleButtonPressed";
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fkd_14);
        }
        fkd_14.setRepeated(false);
        fkd_14.setScaled(false);
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(54);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze4.setWidth(54);
        fze4.setX(6);
        fze4.setY(136);
        fkd_14.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setAlignment(faa_2.tLO);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string4 = "pmbExchangeToggleButtonDisabled";
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fkd_15);
        }
        fkd_15.setRepeated(false);
        fkd_15.setScaled(false);
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(54);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze5.setWidth(54);
        fze5.setX(6);
        fze5.setY(204);
        fkd_15.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fym_05.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fym_0 fym_06 = (fym_0)fes_27.getAppearance();
        fym_06.setElementMap(fhs_23);
        fym_06.setAlignment(faa_2.tLO);
        fym_06.setState("selected");
        fes_22.X(fym_06);
        fym_06.guy();
        String string5 = "pmbExchangeToggleButtonDefaultSelected";
        fkd_1 fkd_16 = fkd_1.checkOut();
        fkd_16.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fkd_16);
        }
        fkd_16.setRepeated(false);
        fkd_16.setScaled(false);
        fym_06.X(fkd_16);
        fkd_16.guy();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(66);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze6.setWidth(66);
        fze6.setX(0);
        fze6.setY(266);
        fkd_16.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fkd_16.onChildrenAdded();
        fym_06.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fym_0 fym_07 = (fym_0)fes_28.getAppearance();
        fym_07.setElementMap(fhs_23);
        fym_07.setAlignment(faa_2.tLO);
        fym_07.setState("mouseHoverSelected");
        fes_22.X(fym_07);
        fym_07.guy();
        String string6 = "pmbExchangeToggleButtonHoverSelected";
        fkd_1 fkd_17 = fkd_1.checkOut();
        fkd_17.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fkd_17);
        }
        fkd_17.setRepeated(false);
        fkd_17.setScaled(false);
        fym_07.X(fkd_17);
        fkd_17.guy();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(66);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze7.setWidth(66);
        fze7.setX(0);
        fze7.setY(334);
        fkd_17.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fkd_17.onChildrenAdded();
        fym_07.onChildrenAdded();
        fes_2 fes_29 = fes_22;
        fym_0 fym_08 = (fym_0)fes_29.getAppearance();
        fym_08.setElementMap(fhs_23);
        fym_08.setAlignment(faa_2.tLO);
        fym_08.setState("pressedSelected");
        fes_22.X(fym_08);
        fym_08.guy();
        String string7 = "pmbExchangeToggleButtonPressedSelected";
        fkd_1 fkd_18 = fkd_1.checkOut();
        fkd_18.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fkd_18);
        }
        fkd_18.setRepeated(false);
        fkd_18.setScaled(false);
        fym_08.X(fkd_18);
        fkd_18.guy();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(66);
        fze8.setPosition(fzw_0.tLg);
        fze8.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze8.setWidth(66);
        fze8.setX(0);
        fze8.setY(402);
        fkd_18.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fkd_18.onChildrenAdded();
        fym_08.onChildrenAdded();
        fes_2 fes_210 = fes_22;
        fym_0 fym_09 = (fym_0)fes_210.getAppearance();
        fym_09.setElementMap(fhs_23);
        fym_09.setAlignment(faa_2.tLO);
        fym_09.setState("disabledSelected");
        fes_22.X(fym_09);
        fym_09.guy();
        String string8 = "pmbExchangeToggleButtonDisabledSelected";
        fkd_1 fkd_19 = fkd_1.checkOut();
        fkd_19.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fkd_19);
        }
        fkd_19.setRepeated(false);
        fkd_19.setScaled(false);
        fym_09.X(fkd_19);
        fkd_19.guy();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(66);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("txExchangeToggleButton"));
        fze9.setWidth(66);
        fze9.setX(0);
        fze9.setY(470);
        fkd_19.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkd_19.onChildrenAdded();
        fym_09.onChildrenAdded();
    }
}


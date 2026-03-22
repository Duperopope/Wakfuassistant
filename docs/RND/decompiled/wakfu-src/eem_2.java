/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eeM
 */
public class eem_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        fhv_1 fhv_12;
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fys_0 fys_02 = fes_23.getAppearance();
        fys_02.setElementMap(fhs_23);
        fes_22.X(fys_02);
        fys_02.guy();
        String string = "pmbExpendableSpellSlider";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fkd_12.setScaled(true);
        fys_02.X(fkd_12);
        fkd_12.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(3);
        fze2.setPosition(fzw_0.tKY);
        fze2.setTexture(this.okR.uF("txSliderBackground"));
        fze2.setWidth(3);
        fze2.setX(0);
        fze2.setY(0);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(3);
        fze3.setPosition(fzw_0.tLa);
        fze3.setTexture(this.okR.uF("txSliderBackground"));
        fze3.setWidth(1);
        fze3.setX(8);
        fze3.setY(0);
        fkd_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(3);
        fze4.setPosition(fzw_0.tLc);
        fze4.setTexture(this.okR.uF("txSliderBackground"));
        fze4.setWidth(3);
        fze4.setX(13);
        fze4.setY(0);
        fkd_12.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(1);
        fze5.setPosition(fzw_0.tLf);
        fze5.setTexture(this.okR.uF("txSliderBackground"));
        fze5.setWidth(3);
        fze5.setX(0);
        fze5.setY(3);
        fkd_12.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(3);
        fze6.setPosition(fzw_0.tLk);
        fze6.setTexture(this.okR.uF("txSliderBackground"));
        fze6.setWidth(3);
        fze6.setX(0);
        fze6.setY(5);
        fkd_12.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(1);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txSliderBackground"));
        fze7.setWidth(1);
        fze7.setX(7);
        fze7.setY(3);
        fkd_12.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(3);
        fze8.setPosition(fzw_0.tLm);
        fze8.setTexture(this.okR.uF("txSliderBackground"));
        fze8.setWidth(1);
        fze8.setX(8);
        fze8.setY(5);
        fkd_12.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(1);
        fze9.setPosition(fzw_0.tLh);
        fze9.setTexture(this.okR.uF("txSliderBackground"));
        fze9.setWidth(3);
        fze9.setX(13);
        fze9.setY(3);
        fkd_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fze fze10 = fze.checkOut();
        fze10.setElementMap(fhs_23);
        fze10.setHeight(3);
        fze10.setPosition(fzw_0.tLo);
        fze10.setTexture(this.okR.uF("txSliderBackground"));
        fze10.setWidth(3);
        fze10.setX(13);
        fze10.setY(5);
        fkd_12.X(fze10);
        fze10.guy();
        fze10.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fes_2 fes_24 = fys_02.getParentOfType(fes_2.class);
        fes_2 fes_25 = fes_24.getWidgetByThemeElementName("horizontalButton", false);
        if (fes_25 != null) {
            fhv_12 = fes_25;
            fym_0 fym_02 = (fym_0)((fes_2)fhv_12).getAppearance();
            fym_02.setElementMap(fhs_23);
            fym_02.setState("default");
            fes_25.X(fym_02);
            fym_02.guy();
            String string2 = "pmSliderButtonDefault";
            fze fze11 = fze.checkOut();
            fze11.setElementMap(fhs_23);
            if (fhs_23 != null && string2 != null) {
                fhs_23.a(string2, fze11);
            }
            fze11.setHeight(22);
            fze11.setPosition(fzw_0.tLg);
            fze11.setTexture(this.okR.uF("txSliderButton"));
            fze11.setWidth(22);
            fze11.setX(0);
            fze11.setY(0);
            fym_02.X(fze11);
            fze11.guy();
            fze11.onChildrenAdded();
            fym_02.onChildrenAdded();
            fes_2 fes_26 = fes_25;
            fym_0 fym_03 = (fym_0)fes_26.getAppearance();
            fym_03.setElementMap(fhs_23);
            fym_03.setState("mouseHover");
            fes_25.X(fym_03);
            fym_03.guy();
            String string3 = "pmSliderButtonHover";
            fze fze12 = fze.checkOut();
            fze12.setElementMap(fhs_23);
            if (fhs_23 != null && string3 != null) {
                fhs_23.a(string3, fze12);
            }
            fze12.setHeight(22);
            fze12.setPosition(fzw_0.tLg);
            fze12.setTexture(this.okR.uF("txSliderButton"));
            fze12.setWidth(22);
            fze12.setX(0);
            fze12.setY(24);
            fym_03.X(fze12);
            fze12.guy();
            fze12.onChildrenAdded();
            fym_03.onChildrenAdded();
            fes_2 fes_27 = fes_25;
            fym_0 fym_04 = (fym_0)fes_27.getAppearance();
            fym_04.setElementMap(fhs_23);
            fym_04.setState("pressed");
            fes_25.X(fym_04);
            fym_04.guy();
            String string4 = "pmSliderButtonPressed";
            fze fze13 = fze.checkOut();
            fze13.setElementMap(fhs_23);
            if (fhs_23 != null && string4 != null) {
                fhs_23.a(string4, fze13);
            }
            fze13.setHeight(22);
            fze13.setPosition(fzw_0.tLg);
            fze13.setTexture(this.okR.uF("txSliderButton"));
            fze13.setWidth(22);
            fze13.setX(0);
            fze13.setY(48);
            fym_04.X(fze13);
            fze13.guy();
            fze13.onChildrenAdded();
            fym_04.onChildrenAdded();
            fes_2 fes_28 = fes_25;
            fym_0 fym_05 = (fym_0)fes_28.getAppearance();
            fym_05.setElementMap(fhs_23);
            fym_05.setState("disabled");
            fes_25.X(fym_05);
            fym_05.guy();
            String string5 = "pmSliderButtonDisabled";
            fze fze14 = fze.checkOut();
            fze14.setElementMap(fhs_23);
            if (fhs_23 != null && string5 != null) {
                fhs_23.a(string5, fze14);
            }
            fze14.setHeight(22);
            fze14.setPosition(fzw_0.tLg);
            fze14.setTexture(this.okR.uF("txSliderButton"));
            fze14.setWidth(22);
            fze14.setX(0);
            fze14.setY(72);
            fym_05.X(fze14);
            fze14.guy();
            fze14.onChildrenAdded();
            fym_05.onChildrenAdded();
        }
        fhv_12 = fze.checkOut();
        fhv_12.setElementMap(fhs_23);
        ((fze)fhv_12).setHeight(12);
        ((fze)fhv_12).setPosition(fzw_0.tLg);
        ((fze)fhv_12).setTexture(this.okR.uF("themeSimple2"));
        ((fze)fhv_12).setWidth(3);
        ((fze)fhv_12).setX(298);
        ((fze)fhv_12).setY(254);
        fys_02.X(fhv_12);
        fhv_12.guy();
        fhv_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}


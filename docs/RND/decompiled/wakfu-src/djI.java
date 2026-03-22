/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

public class djI
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
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(3, 3, 3, 3));
        fym_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        String string = "transferOutDefaultPixmap";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(22);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(22);
        fze2.setX(881);
        fze2.setY(260);
        fym_02.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        String string2 = "buttonCircleBackgroundDefault";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fkd_12);
        }
        fkd_12.setScaled(true);
        fym_02.X(fkd_12);
        fkd_12.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(34);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeDefault"));
        fze3.setWidth(34);
        fze3.setX(950);
        fze3.setY(284);
        fkd_12.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setAlignment(faa_2.tLO);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        String string3 = "transferOutOverPixmap";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(22);
        fze4.setTexture(this.okR.uF("themeOver"));
        fze4.setWidth(22);
        fze4.setX(881);
        fze4.setY(260);
        fym_03.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        String string4 = "buttonCircleBackgroundOver";
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fkd_13);
        }
        fkd_13.setEnabled(false);
        fkd_13.setScaled(true);
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(34);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("themeOver"));
        fze5.setWidth(34);
        fze5.setX(950);
        fze5.setY(284);
        fkd_13.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fkd_13.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setAlignment(faa_2.tLO);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        String string5 = "transferOutPressedPixmap";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(22);
        fze6.setTexture(this.okR.uF("themePressed"));
        fze6.setWidth(22);
        fze6.setX(881);
        fze6.setY(260);
        fym_04.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        String string6 = "buttonCircleBackgroundPressed";
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fkd_14);
        }
        fkd_14.setEnabled(false);
        fkd_14.setScaled(true);
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(34);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("themePressed"));
        fze7.setWidth(34);
        fze7.setX(950);
        fze7.setY(284);
        fkd_14.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fkd_14.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setAlignment(faa_2.tLO);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string7 = "transferOutDisabledPixmap";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setHeight(22);
        fze8.setTexture(this.okR.uF("themeDisabled"));
        fze8.setWidth(22);
        fze8.setX(881);
        fze8.setY(260);
        fym_05.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        String string8 = "buttonCircleBackgroundDisabled";
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fkd_15);
        }
        fkd_15.setEnabled(false);
        fkd_15.setScaled(true);
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(34);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("themeDisabled"));
        fze9.setWidth(34);
        fze9.setX(950);
        fze9.setY(284);
        fkd_15.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkd_15.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}


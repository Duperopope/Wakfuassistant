/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dik
 */
public class dik_0
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
        String string = "pmbDefaultButtonSecondaryXS";
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
        fze2.setHeight(28);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txSecondaryXSButton"));
        fze2.setWidth(28);
        fze2.setX(0);
        fze2.setY(0);
        fkd_12.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fkd_12.onChildrenAdded();
        String string2 = "pmChevronBottomWhite100";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(16);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txChevronBottom"));
        fze3.setWidth(16);
        fze3.setX(2);
        fze3.setY(46);
        fym_02.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        String string3 = "pmbHoverButtonSecondaryXS";
        fkd_1 fkd_13 = fkd_1.checkOut();
        fkd_13.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fkd_13);
        }
        fkd_13.setRepeated(false);
        fkd_13.setScaled(false);
        fym_03.X(fkd_13);
        fkd_13.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(28);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txSecondaryXSButton"));
        fze4.setWidth(28);
        fze4.setX(0);
        fze4.setY(30);
        fkd_13.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fkd_13.onChildrenAdded();
        String string4 = "pmChevronBottomWhite100";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(16);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txChevronBottom"));
        fze5.setWidth(16);
        fze5.setX(2);
        fze5.setY(46);
        fym_03.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        String string5 = "pmbPressedButtonSecondaryXS";
        fkd_1 fkd_14 = fkd_1.checkOut();
        fkd_14.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fkd_14);
        }
        fkd_14.setRepeated(false);
        fkd_14.setScaled(false);
        fym_04.X(fkd_14);
        fkd_14.guy();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(28);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("txSecondaryXSButton"));
        fze6.setWidth(28);
        fze6.setX(0);
        fze6.setY(60);
        fkd_14.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fkd_14.onChildrenAdded();
        String string6 = "pmChevronBottomWhite100";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze7);
        }
        fze7.setHeight(16);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txChevronBottom"));
        fze7.setWidth(16);
        fze7.setX(2);
        fze7.setY(46);
        fym_04.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string7 = "pmbDisabledButtonSecondaryXS";
        fkd_1 fkd_15 = fkd_1.checkOut();
        fkd_15.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fkd_15);
        }
        fkd_15.setRepeated(false);
        fkd_15.setScaled(false);
        fym_05.X(fkd_15);
        fkd_15.guy();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(28);
        fze8.setPosition(fzw_0.tLg);
        fze8.setTexture(this.okR.uF("txSecondaryXSButton"));
        fze8.setWidth(28);
        fze8.setX(0);
        fze8.setY(90);
        fkd_15.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fkd_15.onChildrenAdded();
        String string8 = "pmChevronBottomWhite25";
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fze9);
        }
        fze9.setHeight(16);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("txChevronBottom"));
        fze9.setWidth(16);
        fze9.setX(2);
        fze9.setY(90);
        fym_05.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}


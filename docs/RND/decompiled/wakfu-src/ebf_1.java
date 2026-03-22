/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ebf
 */
public class ebf_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        fhv_1 fhv_12;
        fha_2 fha_22;
        fhv_1 fhv_13;
        fhv_1 fhv_14;
        fha_2 fha_23;
        fhv_1 fhv_15;
        fhv_1 fhv_16;
        fhv_1 fhv_17;
        fes_2 fes_23;
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_24 = fes_22;
        fys_0 fys_02 = fes_24.getAppearance();
        fys_02.setElementMap(fhs_23);
        fes_22.X(fys_02);
        fys_02.guy();
        fes_2 fes_25 = fys_02.getParentOfType(fes_2.class);
        fes_2 fes_26 = fes_25.getWidgetByThemeElementName("decreaseButton", false);
        if (fes_26 != null) {
            fes_23 = fes_26;
            fhv_17 = (fym_0)fes_23.getAppearance();
            fhv_17.setElementMap(fhs_23);
            ((fzq)fhv_17).setAlignment(faa_2.tLO);
            ((fys_0)fhv_17).setState("default");
            fes_26.X(fhv_17);
            fhv_17.guy();
            fhv_16 = fze.checkOut();
            fhv_16.setElementMap(fhs_23);
            ((fze)fhv_16).setHeight(30);
            ((fze)fhv_16).setPosition(fzw_0.tLg);
            ((fze)fhv_16).setTexture(this.okR.uF("themeDefault"));
            ((fze)fhv_16).setWidth(28);
            ((fze)fhv_16).setX(217);
            ((fze)fhv_16).setY(490);
            fhv_17.X(fhv_16);
            fhv_16.guy();
            fhv_16.onChildrenAdded();
            fhv_17.onChildrenAdded();
            fhv_15 = fes_26;
            fha_23 = (fym_0)((fes_2)fhv_15).getAppearance();
            fha_23.setElementMap(fhs_23);
            ((fzq)fha_23).setAlignment(faa_2.tLO);
            ((fys_0)fha_23).setState("mouseHover");
            fes_26.X(fha_23);
            fha_23.guy();
            fhv_14 = fze.checkOut();
            fhv_14.setElementMap(fhs_23);
            ((fze)fhv_14).setHeight(30);
            ((fze)fhv_14).setPosition(fzw_0.tLg);
            ((fze)fhv_14).setTexture(this.okR.uF("themeOver"));
            ((fze)fhv_14).setWidth(28);
            ((fze)fhv_14).setX(217);
            ((fze)fhv_14).setY(490);
            fha_23.X(fhv_14);
            fhv_14.guy();
            fhv_14.onChildrenAdded();
            fha_23.onChildrenAdded();
            fhv_13 = fes_26;
            fha_22 = (fym_0)((fes_2)fhv_13).getAppearance();
            fha_22.setElementMap(fhs_23);
            ((fzq)fha_22).setAlignment(faa_2.tLO);
            ((fys_0)fha_22).setState("pressed");
            fes_26.X(fha_22);
            fha_22.guy();
            fhv_12 = fze.checkOut();
            fhv_12.setElementMap(fhs_23);
            ((fze)fhv_12).setHeight(30);
            ((fze)fhv_12).setPosition(fzw_0.tLg);
            ((fze)fhv_12).setTexture(this.okR.uF("themePressed"));
            ((fze)fhv_12).setWidth(28);
            ((fze)fhv_12).setX(217);
            ((fze)fhv_12).setY(490);
            fha_22.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
            fha_22.onChildrenAdded();
        }
        if ((fhv_17 = (fes_23 = fys_02.getParentOfType(fes_2.class)).getWidgetByThemeElementName("increaseButton", false)) != null) {
            fhv_16 = (fes_2)fhv_17;
            fhv_15 = (fym_0)((fes_2)fhv_16).getAppearance();
            fhv_15.setElementMap(fhs_23);
            ((fzq)fhv_15).setAlignment(faa_2.tLO);
            ((fys_0)fhv_15).setState("default");
            fhv_17.X(fhv_15);
            fhv_15.guy();
            fha_23 = fze.checkOut();
            fha_23.setElementMap(fhs_23);
            ((fze)fha_23).setHeight(30);
            ((fze)fha_23).setPosition(fzw_0.tLg);
            ((fze)fha_23).setTexture(this.okR.uF("themeDefault"));
            ((fze)fha_23).setWidth(28);
            ((fze)fha_23).setX(217);
            ((fze)fha_23).setY(541);
            fhv_15.X(fha_23);
            fha_23.guy();
            fha_23.onChildrenAdded();
            fhv_15.onChildrenAdded();
            fhv_14 = (fes_2)fhv_17;
            fhv_13 = (fym_0)((fes_2)fhv_14).getAppearance();
            fhv_13.setElementMap(fhs_23);
            ((fzq)fhv_13).setAlignment(faa_2.tLO);
            ((fys_0)fhv_13).setState("mouseHover");
            fhv_17.X(fhv_13);
            fhv_13.guy();
            fha_22 = fze.checkOut();
            fha_22.setElementMap(fhs_23);
            ((fze)fha_22).setHeight(30);
            ((fze)fha_22).setPosition(fzw_0.tLg);
            ((fze)fha_22).setTexture(this.okR.uF("themeOver"));
            ((fze)fha_22).setWidth(28);
            ((fze)fha_22).setX(217);
            ((fze)fha_22).setY(541);
            fhv_13.X(fha_22);
            fha_22.guy();
            fha_22.onChildrenAdded();
            fhv_13.onChildrenAdded();
            fhv_12 = (fes_2)fhv_17;
            fym_0 fym_02 = (fym_0)((fes_2)fhv_12).getAppearance();
            fym_02.setElementMap(fhs_23);
            fym_02.setAlignment(faa_2.tLO);
            fym_02.setState("pressed");
            fhv_17.X(fym_02);
            fym_02.guy();
            fze fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            fze2.setHeight(30);
            fze2.setPosition(fzw_0.tLg);
            fze2.setTexture(this.okR.uF("themePressed"));
            fze2.setWidth(28);
            fze2.setX(217);
            fze2.setY(541);
            fym_02.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
            fym_02.onChildrenAdded();
        }
        fys_02.onChildrenAdded();
    }
}


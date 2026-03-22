/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ejl
 */
public class ejl_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        fkq_2 fkq_22;
        fkp_2 fkp_22;
        Object object;
        fhv_1 fhv_12;
        Object object2;
        fhv_1 fhv_13;
        fes_2 fes_23;
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_24 = fes_22;
        fzp fzp2 = (fzp)fes_24.getAppearance();
        fzp2.setElementMap(fhs_23);
        fzp2.setClearButtonDisplaySize(new fsm_1(10, 10));
        fzp2.setPadding(new Insets(-3, 0, -3, 0));
        fzp2.setSearchButtonDisplaySize(new fsm_1(15, 15));
        fes_22.X(fzp2);
        fzp2.guy();
        fes_2 fes_25 = fzp2.getParentOfType(fes_2.class);
        fes_2 fes_26 = fes_25.getWidgetByThemeElementName("textEditor", false);
        if (fes_26 != null) {
            fes_23 = fes_26;
            fhv_13 = (fzq)fes_23.getAppearance();
            fhv_13.setElementMap(fhs_23);
            ((fzq)fhv_13).setAlign(faa_2.tLN);
            ((fzm)fhv_13).setPadding(new Insets(0, 5, 0, 5));
            ((fys_0)fhv_13).setState("default");
            fes_26.X(fhv_13);
            fhv_13.guy();
            object2 = fyW.checkOut();
            ((fyW)object2).setRenderer(fyw_0.gqw().gqB().uG("fontDefault10"));
            ((fhv_1)object2).setElementMap(fhs_23);
            fhv_13.X((fhi_2)object2);
            ((fhi_2)object2).guy();
            ((fhv_1)object2).onChildrenAdded();
            fhv_12 = fyp_0.checkOut();
            fhv_12.setElementMap(fhs_23);
            ((fyp_0)fhv_12).setColor(new fhl_2("defaultLightColor"));
            fhv_13.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
            object = fyp_0.checkOut();
            ((fhv_1)object).setElementMap(fhs_23);
            ((fyp_0)object).setColor(new fhl_2("textDarkTextEditorColor"));
            ((fyp_0)object).setName("text");
            fhv_13.X((fhi_2)object);
            ((fhi_2)object).guy();
            ((fhv_1)object).onChildrenAdded();
            fkp_22 = fyp_0.checkOut();
            fkp_22.setElementMap(fhs_23);
            ((fyp_0)fkp_22).setColor(new fhl_2("selectionDarkTextEditorColor"));
            ((fyp_0)fkp_22).setName("selection");
            fhv_13.X(fkp_22);
            fkp_22.guy();
            fkp_22.onChildrenAdded();
            fkq_22 = fyp_0.checkOut();
            fkq_22.setElementMap(fhs_23);
            ((fyp_0)fkq_22).setColor(new fhl_2("selectionDarkTextEditorColor"));
            ((fyp_0)fkq_22).setName("cursor");
            fhv_13.X(fkq_22);
            fkq_22.guy();
            fkq_22.onChildrenAdded();
            fhv_13.onChildrenAdded();
        }
        if ((fhv_13 = (fes_23 = fzp2.getParentOfType(fes_2.class)).getWidgetByThemeElementName("searchButton", false)) != null) {
            object2 = "pmMagnifyingGlass";
            fhv_12 = fze.checkOut();
            fhv_12.setElementMap(fhs_23);
            if (fhs_23 != null && object2 != null) {
                fhs_23.a((String)object2, fhv_12);
            }
            ((fze)fhv_12).setHeight(15);
            ((fze)fhv_12).setPosition(fzw_0.tLg);
            ((fze)fhv_12).setTexture(this.okR.uF("themeSimple"));
            ((fze)fhv_12).setWidth(15);
            ((fze)fhv_12).setX(788);
            ((fze)fhv_12).setY(111);
            fhv_13.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
        }
        if ((fhv_12 = ((fes_2)(object2 = fzp2.getParentOfType(fes_2.class))).getWidgetByThemeElementName("clearButton", false)) != null) {
            object = "pmGrayCancel";
            fkp_22 = fze.checkOut();
            fkp_22.setElementMap(fhs_23);
            if (fhs_23 != null && object != null) {
                fhs_23.a((String)object, fkp_22);
            }
            ((fze)fkp_22).setHeight(10);
            ((fze)fkp_22).setPosition(fzw_0.tLg);
            ((fze)fkp_22).setTexture(this.okR.uF("themeSimple"));
            ((fze)fkp_22).setWidth(10);
            ((fze)fkp_22).setX(1867);
            ((fze)fkp_22).setY(304);
            fhv_12.X(fkp_22);
            fkp_22.guy();
            fkp_22.onChildrenAdded();
        }
        object = "textEditorDarkBorder";
        fkp_22 = new fkh_1();
        ((fkh_1)fkp_22).aVI();
        fkp_22.setElementMap(fhs_23);
        if (fhs_23 != null && object != null) {
            fhs_23.a((String)object, fkp_22);
        }
        fzp2.X(fkp_22);
        fkp_22.guy();
        fkq_22 = fze.checkOut();
        fkq_22.setElementMap(fhs_23);
        ((fze)fkq_22).setHeight(4);
        ((fze)fkq_22).setPosition(fzw_0.tKY);
        ((fze)fkq_22).setTexture(this.okR.uF("themeSimple"));
        ((fze)fkq_22).setWidth(4);
        ((fze)fkq_22).setX(396);
        ((fze)fkq_22).setY(172);
        fkp_22.X(fkq_22);
        fkq_22.guy();
        fkq_22.onChildrenAdded();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(4);
        fze2.setPosition(fzw_0.tLa);
        fze2.setTexture(this.okR.uF("themeSimple"));
        fze2.setWidth(20);
        fze2.setX(400);
        fze2.setY(172);
        fkp_22.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(4);
        fze3.setPosition(fzw_0.tLc);
        fze3.setTexture(this.okR.uF("themeSimple"));
        fze3.setWidth(4);
        fze3.setX(420);
        fze3.setY(172);
        fkp_22.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(7);
        fze4.setPosition(fzw_0.tLh);
        fze4.setTexture(this.okR.uF("themeSimple"));
        fze4.setWidth(4);
        fze4.setX(420);
        fze4.setY(176);
        fkp_22.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(3);
        fze5.setPosition(fzw_0.tLo);
        fze5.setTexture(this.okR.uF("themeSimple"));
        fze5.setWidth(4);
        fze5.setX(420);
        fze5.setY(183);
        fkp_22.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        fze6.setHeight(3);
        fze6.setPosition(fzw_0.tLm);
        fze6.setTexture(this.okR.uF("themeSimple"));
        fze6.setWidth(20);
        fze6.setX(400);
        fze6.setY(183);
        fkp_22.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        fze7.setHeight(3);
        fze7.setPosition(fzw_0.tLk);
        fze7.setTexture(this.okR.uF("themeSimple"));
        fze7.setWidth(4);
        fze7.setX(396);
        fze7.setY(183);
        fkp_22.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        fze8.setHeight(7);
        fze8.setPosition(fzw_0.tLf);
        fze8.setTexture(this.okR.uF("themeSimple"));
        fze8.setWidth(4);
        fze8.setX(396);
        fze8.setY(176);
        fkp_22.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fkp_22.onChildrenAdded();
        String string = "textEditorDarkBackground";
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkd_12);
        }
        fkd_12.setScaled(true);
        fzp2.X(fkd_12);
        fkd_12.guy();
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        fze9.setHeight(7);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("themeSimple"));
        fze9.setWidth(20);
        fze9.setX(400);
        fze9.setY(176);
        fkd_12.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fkd_12.onChildrenAdded();
        fzp2.onChildrenAdded();
    }
}


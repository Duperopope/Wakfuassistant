/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ekP
 */
public class ekp_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        fhv_1 fhv_12;
        Object object;
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
            object = fyW.checkOut();
            ((fyW)object).setRenderer(fyw_0.gqw().gqB().uG("fontName12"));
            ((fhv_1)object).setElementMap(fhs_23);
            fhv_13.X((fhi_2)object);
            ((fhi_2)object).guy();
            ((fhv_1)object).onChildrenAdded();
            fhv_12 = fyp_0.checkOut();
            fhv_12.setElementMap(fhs_23);
            ((fyp_0)fhv_12).setColor(new fhl_2("mecanicBlueColor"));
            fhv_13.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
            fhv_13.onChildrenAdded();
        }
        if ((fhv_13 = (fes_23 = fzp2.getParentOfType(fes_2.class)).getWidgetByThemeElementName("searchButton", false)) != null) {
            object = "pmMagnifyingGlass";
            fhv_12 = fze.checkOut();
            fhv_12.setElementMap(fhs_23);
            if (fhs_23 != null && object != null) {
                fhs_23.a((String)object, fhv_12);
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
        if ((fhv_12 = ((fes_2)(object = fzp2.getParentOfType(fes_2.class))).getWidgetByThemeElementName("clearButton", false)) != null) {
            String string = "pmGrayCancel";
            fze fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            if (fhs_23 != null && string != null) {
                fhs_23.a(string, fze2);
            }
            fze2.setHeight(10);
            fze2.setPosition(fzw_0.tLg);
            fze2.setTexture(this.okR.uF("themeSimple"));
            fze2.setWidth(10);
            fze2.setX(1867);
            fze2.setY(304);
            fhv_12.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
        }
        fzp2.onChildrenAdded();
    }
}


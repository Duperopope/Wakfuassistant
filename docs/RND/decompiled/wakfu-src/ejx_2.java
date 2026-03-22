/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ejX
 */
public class ejx_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
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
            ((fyW)object2).setRenderer(fyw_0.gqw().gqB().uG("fontDefault9Bold"));
            ((fhv_1)object2).setElementMap(fhs_23);
            fhv_13.X((fhi_2)object2);
            ((fhi_2)object2).guy();
            ((fhv_1)object2).onChildrenAdded();
            fhv_12 = fyp_0.checkOut();
            fhv_12.setElementMap(fhs_23);
            ((fyp_0)fhv_12).setColor(new fhl_2("defaultDarkColor"));
            fhv_13.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
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
            fze fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            if (fhs_23 != null && object != null) {
                fhs_23.a((String)object, fze2);
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
        object = new fkk_1();
        ((fkk_1)object).aVI();
        ((fhv_1)object).setElementMap(fhs_23);
        ((fkk_1)object).setColor(new awx_2(0.0f, 0.0f, 0.0f, 0.0f));
        fzp2.X((fhi_2)object);
        ((fhi_2)object).guy();
        ((fhv_1)object).onChildrenAdded();
        fzp2.onChildrenAdded();
    }
}


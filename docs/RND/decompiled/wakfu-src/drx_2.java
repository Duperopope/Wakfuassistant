/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from drX
 */
public class drx_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        fhv_1 fhv_12;
        fhv_1 fhv_13;
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
        fes_2 fes_26 = fes_25.getWidgetByThemeElementName("cursor", false);
        if (fes_26 != null) {
            fes_23 = fes_26;
            fhv_13 = (fyY)fes_23.getAppearance();
            fhv_13.setElementMap(fhs_23);
            fes_26.X(fhv_13);
            fhv_13.guy();
            fhv_12 = fze.checkOut();
            fhv_12.setElementMap(fhs_23);
            ((fze)fhv_12).setHeight(11);
            ((fze)fhv_12).setPosition(fzw_0.tLg);
            ((fze)fhv_12).setTexture(this.okR.uF("themeSimple"));
            ((fze)fhv_12).setWidth(11);
            ((fze)fhv_12).setX(1569);
            ((fze)fhv_12).setY(267);
            fhv_13.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
            fhv_13.onChildrenAdded();
        }
        if ((fhv_13 = (fes_23 = fys_02.getParentOfType(fes_2.class)).getWidgetByThemeElementName("slider", false)) != null) {
            fhv_12 = (fes_2)fhv_13;
            fyY fyY2 = (fyY)((fes_2)fhv_12).getAppearance();
            fyY2.setElementMap(fhs_23);
            fhv_13.X(fyY2);
            fyY2.guy();
            fze fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            fze2.setHeight(14);
            fze2.setPosition(fzw_0.tLg);
            fze2.setTexture(this.okR.uF("themeSimple"));
            fze2.setWidth(20);
            fze2.setX(1545);
            fze2.setY(270);
            fyY2.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
            fyY2.onChildrenAdded();
        }
        fys_02.onChildrenAdded();
    }
}


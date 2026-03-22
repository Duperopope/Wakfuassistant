/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eeS
 */
public class ees_2
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
        fes_2 fes_24 = fys_02.getParentOfType(fes_2.class);
        fes_2 fes_25 = fes_24.getWidgetByThemeElementName("verticalButton", false);
        if (fes_25 != null) {
            fhv_12 = fes_25;
            fym_0 fym_02 = (fym_0)((fes_2)fhv_12).getAppearance();
            fym_02.setElementMap(fhs_23);
            fes_25.X(fym_02);
            fym_02.guy();
            fze fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            fze2.setHeight(26);
            fze2.setPosition(fzw_0.tLg);
            fze2.setTexture(this.okR.uF("themeSimple3"));
            fze2.setWidth(25);
            fze2.setX(833);
            fze2.setY(656);
            fym_02.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
            fym_02.onChildrenAdded();
        }
        fhv_12 = fze.checkOut();
        fhv_12.setElementMap(fhs_23);
        ((fze)fhv_12).setHeight(12);
        ((fze)fhv_12).setPosition(fzw_0.tLg);
        ((fze)fhv_12).setTexture(this.okR.uF("themeSimple2"));
        ((fze)fhv_12).setWidth(1);
        ((fze)fhv_12).setX(295);
        ((fze)fhv_12).setY(254);
        fys_02.X(fhv_12);
        fhv_12.guy();
        fhv_12.onChildrenAdded();
        fys_02.onChildrenAdded();
    }
}


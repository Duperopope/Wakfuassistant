/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eeI
 */
public class eei_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fys_0 fys_02 = fes_23.getAppearance();
        fys_02.setElementMap(fhs_23);
        fes_22.X(fys_02);
        fys_02.guy();
        fes_2 fes_24 = fys_02.getParentOfType(fes_2.class);
        fes_2 fes_25 = fes_24.getWidgetByThemeElementName("horizontalButton", false);
        if (fes_25 != null) {
            fes_2 fes_26 = fes_25;
            fym_0 fym_02 = (fym_0)fes_26.getAppearance();
            fym_02.setElementMap(fhs_23);
            fym_02.setState("default");
            fes_25.X(fym_02);
            fym_02.guy();
            String string = "pmCurrentWakfuSlider";
            fze fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            if (fhs_23 != null && string != null) {
                fhs_23.a(string, fze2);
            }
            fze2.setHeight(12);
            fze2.setPosition(fzw_0.tLg);
            fze2.setTexture(this.okR.uF("themeSimple"));
            fze2.setWidth(23);
            fze2.setX(847);
            fze2.setY(675);
            fym_02.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
            fym_02.onChildrenAdded();
        }
        fys_02.onChildrenAdded();
    }
}


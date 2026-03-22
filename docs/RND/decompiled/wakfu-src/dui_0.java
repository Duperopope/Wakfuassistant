/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from duI
 */
public class dui_0
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        fze fze2;
        fha_2 fha_22;
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
        fes_2 fes_26 = fes_25.getWidgetByThemeElementName("progressBar", false);
        if (fes_26 != null) {
            fes_23 = fes_26;
            fhv_13 = (fzg)fes_23.getAppearance();
            fhv_13.setElementMap(fhs_23);
            fes_26.X(fhv_13);
            fhv_13.guy();
            fhv_12 = fze.checkOut();
            fhv_12.setElementMap(fhs_23);
            ((fze)fhv_12).setHeight(32);
            ((fze)fhv_12).setPosition(fzw_0.tKY);
            ((fze)fhv_12).setTexture(this.okR.uF("whiteAlpha"));
            ((fze)fhv_12).setWidth(32);
            ((fze)fhv_12).setX(0);
            ((fze)fhv_12).setY(0);
            fhv_13.X(fhv_12);
            fhv_12.guy();
            fhv_12.onChildrenAdded();
            fha_22 = fze.checkOut();
            fha_22.setElementMap(fhs_23);
            ((fze)fha_22).setHeight(32);
            ((fze)fha_22).setPosition(fzw_0.tLa);
            ((fze)fha_22).setTexture(this.okR.uF("whiteAlpha"));
            ((fze)fha_22).setWidth(32);
            ((fze)fha_22).setX(0);
            ((fze)fha_22).setY(0);
            fhv_13.X(fha_22);
            fha_22.guy();
            fha_22.onChildrenAdded();
            fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            fze2.setHeight(32);
            fze2.setPosition(fzw_0.tLc);
            fze2.setTexture(this.okR.uF("whiteAlpha"));
            fze2.setWidth(32);
            fze2.setX(0);
            fze2.setY(0);
            fhv_13.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
            fze fze3 = fze.checkOut();
            fze3.setElementMap(fhs_23);
            fze3.setHeight(32);
            fze3.setPosition(fzw_0.tLf);
            fze3.setTexture(this.okR.uF("whiteAlpha"));
            fze3.setWidth(32);
            fze3.setX(0);
            fze3.setY(0);
            fhv_13.X(fze3);
            fze3.guy();
            fze3.onChildrenAdded();
            fze fze4 = fze.checkOut();
            fze4.setElementMap(fhs_23);
            fze4.setHeight(32);
            fze4.setPosition(fzw_0.tLg);
            fze4.setTexture(this.okR.uF("whiteAlpha"));
            fze4.setWidth(32);
            fze4.setX(0);
            fze4.setY(0);
            fhv_13.X(fze4);
            fze4.guy();
            fze4.onChildrenAdded();
            fze fze5 = fze.checkOut();
            fze5.setElementMap(fhs_23);
            fze5.setHeight(32);
            fze5.setPosition(fzw_0.tLh);
            fze5.setTexture(this.okR.uF("whiteAlpha"));
            fze5.setWidth(32);
            fze5.setX(0);
            fze5.setY(0);
            fhv_13.X(fze5);
            fze5.guy();
            fze5.onChildrenAdded();
            fze fze6 = fze.checkOut();
            fze6.setElementMap(fhs_23);
            fze6.setHeight(32);
            fze6.setPosition(fzw_0.tLk);
            fze6.setTexture(this.okR.uF("whiteAlpha"));
            fze6.setWidth(32);
            fze6.setX(0);
            fze6.setY(0);
            fhv_13.X(fze6);
            fze6.guy();
            fze6.onChildrenAdded();
            fze fze7 = fze.checkOut();
            fze7.setElementMap(fhs_23);
            fze7.setHeight(32);
            fze7.setPosition(fzw_0.tLm);
            fze7.setTexture(this.okR.uF("whiteAlpha"));
            fze7.setWidth(32);
            fze7.setX(0);
            fze7.setY(0);
            fhv_13.X(fze7);
            fze7.guy();
            fze7.onChildrenAdded();
            fze fze8 = fze.checkOut();
            fze8.setElementMap(fhs_23);
            fze8.setHeight(32);
            fze8.setPosition(fzw_0.tLo);
            fze8.setTexture(this.okR.uF("whiteAlpha"));
            fze8.setWidth(32);
            fze8.setX(0);
            fze8.setY(0);
            fhv_13.X(fze8);
            fze8.guy();
            fze8.onChildrenAdded();
            fhv_13.onChildrenAdded();
        }
        if ((fhv_13 = (fes_23 = fys_02.getParentOfType(fes_2.class)).getWidgetByThemeElementName("compassOrientation", false)) != null) {
            fhv_12 = (fes_2)fhv_13;
            fha_22 = (fyY)((fes_2)fhv_12).getAppearance();
            fha_22.setElementMap(fhs_23);
            ((fyY)fha_22).setScaled(false);
            fhv_13.X(fha_22);
            fha_22.guy();
            fze2 = fze.checkOut();
            fze2.setElementMap(fhs_23);
            fze2.setHeight(48);
            fze2.setPosition(fzw_0.tLg);
            fze2.setTexture(this.okR.uF("arrow"));
            fze2.setWidth(48);
            fze2.setX(0);
            fze2.setY(0);
            fha_22.X(fze2);
            fze2.guy();
            fze2.onChildrenAdded();
            fha_22.onChildrenAdded();
        }
        fys_02.onChildrenAdded();
    }
}


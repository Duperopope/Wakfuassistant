/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dpL
 */
public class dpl_1
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
        String string = "smallWhiteTopArrowDefault";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(22);
        fze2.setPosition(fzw_0.tLg);
        fze2.setRotation(asp_1.dad);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(18);
        fze2.setX(280);
        fze2.setY(58);
        fym_02.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        String string2 = "smallWhiteTopArrowOver";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(22);
        fze3.setPosition(fzw_0.tLg);
        fze3.setRotation(asp_1.dad);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(18);
        fze3.setX(280);
        fze3.setY(58);
        fym_03.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        String string3 = "smallWhiteTopArrowPressed";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(22);
        fze4.setPosition(fzw_0.tLg);
        fze4.setRotation(asp_1.dad);
        fze4.setTexture(this.okR.uF("themePressed"));
        fze4.setWidth(18);
        fze4.setX(280);
        fze4.setY(58);
        fym_04.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        String string4 = "smallWhiteTopArrowDisabled";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(22);
        fze5.setPosition(fzw_0.tLg);
        fze5.setRotation(asp_1.dad);
        fze5.setTexture(this.okR.uF("themeDisabled"));
        fze5.setWidth(18);
        fze5.setX(280);
        fze5.setY(58);
        fym_05.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dqL
 */
public class dql_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzs fzs2 = (fzs)fes_23.getAppearance();
        fzs2.setElementMap(fhs_23);
        fzs2.setAlignment(faa_2.tLO);
        fzs2.setState("default");
        fes_22.X(fzs2);
        fzs2.guy();
        String string = "emotesButtonDefaultPixmap";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(18);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(34);
        fze2.setX(425);
        fze2.setY(537);
        fzs2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fzs2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzs fzs3 = (fzs)fes_24.getAppearance();
        fzs3.setElementMap(fhs_23);
        fzs3.setAlignment(faa_2.tLO);
        fzs3.setState("mouseHover");
        fes_22.X(fzs3);
        fzs3.guy();
        String string2 = "emotesButtonOverPixmap";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(18);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(34);
        fze3.setX(425);
        fze3.setY(537);
        fzs3.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fzs3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzs fzs4 = (fzs)fes_25.getAppearance();
        fzs4.setElementMap(fhs_23);
        fzs4.setAlignment(faa_2.tLO);
        fzs4.setState("pressed");
        fes_22.X(fzs4);
        fzs4.guy();
        String string3 = "emotesButtonPressedPixmap";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(18);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themePressed"));
        fze4.setWidth(34);
        fze4.setX(425);
        fze4.setY(537);
        fzs4.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fzs4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzs fzs5 = (fzs)fes_26.getAppearance();
        fzs5.setElementMap(fhs_23);
        fzs5.setAlignment(faa_2.tLO);
        fzs5.setState("selected");
        fes_22.X(fzs5);
        fzs5.guy();
        String string4 = "emotesButtonSelectedPixmap";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(18);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("themeDefaultSelected"));
        fze5.setWidth(34);
        fze5.setX(425);
        fze5.setY(537);
        fzs5.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fzs5.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fzs fzs6 = (fzs)fes_27.getAppearance();
        fzs6.setElementMap(fhs_23);
        fzs6.setAlignment(faa_2.tLO);
        fzs6.setState("mouseHoverSelected");
        fes_22.X(fzs6);
        fzs6.guy();
        String string5 = "emotesButtonSelectedOverPixmap";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(18);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("themeOverSelected"));
        fze6.setWidth(34);
        fze6.setX(425);
        fze6.setY(537);
        fzs6.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fzs6.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fzs fzs7 = (fzs)fes_28.getAppearance();
        fzs7.setElementMap(fhs_23);
        fzs7.setAlignment(faa_2.tLO);
        fzs7.setState("pressedSelected");
        fes_22.X(fzs7);
        fzs7.guy();
        String string6 = "emotesButtonSelectedPressedPixmap";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze7);
        }
        fze7.setHeight(18);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("themePressedSelected"));
        fze7.setWidth(34);
        fze7.setX(425);
        fze7.setY(537);
        fzs7.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fzs7.onChildrenAdded();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dnW
 */
public class dnw_1
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
        fzs2.setAlignment(faa_2.tLN);
        fzs2.setState("default");
        fes_22.X(fzs2);
        fzs2.guy();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fze2.setHeight(94);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("themeDefault"));
        fze2.setWidth(94);
        fze2.setX(918);
        fze2.setY(812);
        fzs2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fzs2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzs fzs3 = (fzs)fes_24.getAppearance();
        fzs3.setElementMap(fhs_23);
        fzs3.setAlignment(faa_2.tLN);
        fzs3.setState("mouseHover");
        fes_22.X(fzs3);
        fzs3.guy();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fze3.setHeight(94);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("themeOver"));
        fze3.setWidth(94);
        fze3.setX(918);
        fze3.setY(812);
        fzs3.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fzs3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzs fzs4 = (fzs)fes_25.getAppearance();
        fzs4.setElementMap(fhs_23);
        fzs4.setAlignment(faa_2.tLN);
        fzs4.setState("disabled");
        fes_22.X(fzs4);
        fzs4.guy();
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        fze4.setHeight(94);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("themeDisabled"));
        fze4.setWidth(94);
        fze4.setX(918);
        fze4.setY(812);
        fzs4.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fzs4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzs fzs5 = (fzs)fes_26.getAppearance();
        fzs5.setElementMap(fhs_23);
        fzs5.setAlignment(faa_2.tLN);
        fzs5.setState("pressed");
        fes_22.X(fzs5);
        fzs5.guy();
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        fze5.setHeight(94);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("themePressed"));
        fze5.setWidth(94);
        fze5.setX(918);
        fze5.setY(812);
        fzs5.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fzs5.onChildrenAdded();
    }
}


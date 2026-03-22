/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dqJ
 */
public class dqj_1
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
        fzs2.setState("default");
        fes_22.X(fzs2);
        fzs2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault12Bold"));
        fyW2.setElementMap(fhs_23);
        fzs2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("mainTextLightColor"));
        fzs2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        String string = "pmDefaultChatFilterCheckBox";
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fze2);
        }
        fze2.setHeight(20);
        fze2.setPosition(fzw_0.tLg);
        fze2.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze2.setWidth(20);
        fze2.setX(0);
        fze2.setY(0);
        fzs2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fzs2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzs fzs3 = (fzs)fes_24.getAppearance();
        fzs3.setElementMap(fhs_23);
        fzs3.setState("mouseHover");
        fes_22.X(fzs3);
        fzs3.guy();
        String string2 = "pmHoverChatFilterCheckBox";
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fze3);
        }
        fze3.setHeight(20);
        fze3.setPosition(fzw_0.tLg);
        fze3.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze3.setWidth(20);
        fze3.setX(0);
        fze3.setY(22);
        fzs3.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fzs3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzs fzs4 = (fzs)fes_25.getAppearance();
        fzs4.setElementMap(fhs_23);
        fzs4.setState("pressed");
        fes_22.X(fzs4);
        fzs4.guy();
        String string3 = "pmPressedChatFilterCheckBox";
        fze fze4 = fze.checkOut();
        fze4.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fze4);
        }
        fze4.setHeight(20);
        fze4.setPosition(fzw_0.tLg);
        fze4.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze4.setWidth(20);
        fze4.setX(0);
        fze4.setY(44);
        fzs4.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fzs4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzs fzs5 = (fzs)fes_26.getAppearance();
        fzs5.setElementMap(fhs_23);
        fzs5.setState("disabled");
        fes_22.X(fzs5);
        fzs5.guy();
        String string4 = "pmDisabledChatFilterCheckBox";
        fze fze5 = fze.checkOut();
        fze5.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fze5);
        }
        fze5.setHeight(20);
        fze5.setPosition(fzw_0.tLg);
        fze5.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze5.setWidth(20);
        fze5.setX(0);
        fze5.setY(66);
        fzs5.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fzs5.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fzs fzs6 = (fzs)fes_27.getAppearance();
        fzs6.setElementMap(fhs_23);
        fzs6.setState("selected");
        fes_22.X(fzs6);
        fzs6.guy();
        String string5 = "pmDefaultSelectedChatFilterCheckBox";
        fze fze6 = fze.checkOut();
        fze6.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fze6);
        }
        fze6.setHeight(20);
        fze6.setPosition(fzw_0.tLg);
        fze6.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze6.setWidth(20);
        fze6.setX(0);
        fze6.setY(88);
        fzs6.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fzs6.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fzs fzs7 = (fzs)fes_28.getAppearance();
        fzs7.setElementMap(fhs_23);
        fzs7.setState("mouseHoverSelected");
        fes_22.X(fzs7);
        fzs7.guy();
        String string6 = "pmHoverSelectedChatFilterCheckBox";
        fze fze7 = fze.checkOut();
        fze7.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fze7);
        }
        fze7.setHeight(20);
        fze7.setPosition(fzw_0.tLg);
        fze7.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze7.setWidth(20);
        fze7.setX(0);
        fze7.setY(110);
        fzs7.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fzs7.onChildrenAdded();
        fes_2 fes_29 = fes_22;
        fzs fzs8 = (fzs)fes_29.getAppearance();
        fzs8.setElementMap(fhs_23);
        fzs8.setState("pressedSelected");
        fes_22.X(fzs8);
        fzs8.guy();
        String string7 = "pmPressedSelectedChatFilterCheckBox";
        fze fze8 = fze.checkOut();
        fze8.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fze8);
        }
        fze8.setHeight(20);
        fze8.setPosition(fzw_0.tLg);
        fze8.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze8.setWidth(20);
        fze8.setX(0);
        fze8.setY(132);
        fzs8.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fzs8.onChildrenAdded();
        fes_2 fes_210 = fes_22;
        fzs fzs9 = (fzs)fes_210.getAppearance();
        fzs9.setElementMap(fhs_23);
        fzs9.setState("disabledSelected");
        fes_22.X(fzs9);
        fzs9.guy();
        String string8 = "pmDisabledSelectedChatFilterCheckBox";
        fze fze9 = fze.checkOut();
        fze9.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fze9);
        }
        fze9.setHeight(20);
        fze9.setPosition(fzw_0.tLg);
        fze9.setTexture(this.okR.uF("txChatFilterCheckBox"));
        fze9.setWidth(20);
        fze9.setX(0);
        fze9.setY(154);
        fzs9.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fzs9.onChildrenAdded();
    }
}


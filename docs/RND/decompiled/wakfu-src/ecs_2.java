/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from ecs
 */
public class ecs_2
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzk fzk2 = (fzk)fes_23.getAppearance();
        fzk2.setElementMap(fhs_23);
        fzk2.setState("default");
        fes_22.X(fzk2);
        fzk2.guy();
        String string = "pmPressedSelectedChatFilterCheckBox";
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
        fze2.setY(132);
        fzk2.X(fze2);
        fze2.guy();
        fze2.onChildrenAdded();
        fzk2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzk fzk3 = (fzk)fes_24.getAppearance();
        fzk3.setElementMap(fhs_23);
        fzk3.setState("mouseHover");
        fes_22.X(fzk3);
        fzk3.guy();
        String string2 = "pmPressedSelectedChatFilterCheckBox";
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
        fze3.setY(132);
        fzk3.X(fze3);
        fze3.guy();
        fze3.onChildrenAdded();
        fzk3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzk fzk4 = (fzk)fes_25.getAppearance();
        fzk4.setElementMap(fhs_23);
        fzk4.setState("pressed");
        fes_22.X(fzk4);
        fzk4.guy();
        String string3 = "pmPressedSelectedChatFilterCheckBox";
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
        fze4.setY(132);
        fzk4.X(fze4);
        fze4.guy();
        fze4.onChildrenAdded();
        fzk4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzk fzk5 = (fzk)fes_26.getAppearance();
        fzk5.setElementMap(fhs_23);
        fzk5.setState("disabled");
        fes_22.X(fzk5);
        fzk5.guy();
        String string4 = "pmPressedSelectedChatFilterCheckBox";
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
        fze5.setY(132);
        fzk5.X(fze5);
        fze5.guy();
        fze5.onChildrenAdded();
        fzk5.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fzk fzk6 = (fzk)fes_27.getAppearance();
        fzk6.setElementMap(fhs_23);
        fzk6.setState("selected");
        fes_22.X(fzk6);
        fzk6.guy();
        String string5 = "pmPressedSelectedChatFilterCheckBox";
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
        fze6.setY(132);
        fzk6.X(fze6);
        fze6.guy();
        fze6.onChildrenAdded();
        fzk6.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fzk fzk7 = (fzk)fes_28.getAppearance();
        fzk7.setElementMap(fhs_23);
        fzk7.setState("mouseHoverSelected");
        fes_22.X(fzk7);
        fzk7.guy();
        String string6 = "pmPressedSelectedChatFilterCheckBox";
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
        fze7.setY(132);
        fzk7.X(fze7);
        fze7.guy();
        fze7.onChildrenAdded();
        fzk7.onChildrenAdded();
        fes_2 fes_29 = fes_22;
        fzk fzk8 = (fzk)fes_29.getAppearance();
        fzk8.setElementMap(fhs_23);
        fzk8.setState("pressedSelected");
        fes_22.X(fzk8);
        fzk8.guy();
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
        fzk8.X(fze8);
        fze8.guy();
        fze8.onChildrenAdded();
        fzk8.onChildrenAdded();
        fes_2 fes_210 = fes_22;
        fzk fzk9 = (fzk)fes_210.getAppearance();
        fzk9.setElementMap(fhs_23);
        fzk9.setState("disabledSelected");
        fes_22.X(fzk9);
        fzk9.guy();
        String string8 = "pmPressedSelectedChatFilterCheckBox";
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
        fze9.setY(132);
        fzk9.X(fze9);
        fze9.guy();
        fze9.onChildrenAdded();
        fzk9.onChildrenAdded();
    }
}


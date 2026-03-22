/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from edq
 */
public class edq_2
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
        fzk2.setAlign(faa_2.tLR);
        fzk2.setState("default");
        fes_22.X(fzk2);
        fzk2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontTitle21Shadowed"));
        fyW2.setElementMap(fhs_23);
        fzk2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("mainTextTitleColor"));
        fzk2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fzk2.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fzk fzk3 = (fzk)fes_24.getAppearance();
        fzk3.setElementMap(fhs_23);
        fzk3.setState("mouseHover");
        fes_22.X(fzk3);
        fzk3.guy();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new fhl_2("mainTextLightColor"));
        fzk3.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fzk3.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fzk fzk4 = (fzk)fes_25.getAppearance();
        fzk4.setElementMap(fhs_23);
        fzk4.setState("pressed");
        fes_22.X(fzk4);
        fzk4.guy();
        fyp_0 fyp_04 = fyp_0.checkOut();
        fyp_04.setElementMap(fhs_23);
        fyp_04.setColor(new fhl_2("mainTextLightColor"));
        fzk4.X(fyp_04);
        fyp_04.guy();
        fyp_04.onChildrenAdded();
        fzk4.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fzk fzk5 = (fzk)fes_26.getAppearance();
        fzk5.setElementMap(fhs_23);
        fzk5.setState("disabled");
        fes_22.X(fzk5);
        fzk5.guy();
        fyp_0 fyp_05 = fyp_0.checkOut();
        fyp_05.setElementMap(fhs_23);
        fyp_05.setColor(new fhl_2("defaultDisabledColor"));
        fzk5.X(fyp_05);
        fyp_05.guy();
        fyp_05.onChildrenAdded();
        fzk5.onChildrenAdded();
        fes_2 fes_27 = fes_22;
        fzk fzk6 = (fzk)fes_27.getAppearance();
        fzk6.setElementMap(fhs_23);
        fzk6.setState("selected");
        fes_22.X(fzk6);
        fzk6.guy();
        fyp_0 fyp_06 = fyp_0.checkOut();
        fyp_06.setElementMap(fhs_23);
        fyp_06.setColor(new fhl_2("mainTextLightColor"));
        fzk6.X(fyp_06);
        fyp_06.guy();
        fyp_06.onChildrenAdded();
        fzk6.onChildrenAdded();
        fes_2 fes_28 = fes_22;
        fzk fzk7 = (fzk)fes_28.getAppearance();
        fzk7.setElementMap(fhs_23);
        fzk7.setState("mouseHoverSelected");
        fes_22.X(fzk7);
        fzk7.guy();
        fyp_0 fyp_07 = fyp_0.checkOut();
        fyp_07.setElementMap(fhs_23);
        fyp_07.setColor(new fhl_2("mainTextLightColor"));
        fzk7.X(fyp_07);
        fyp_07.guy();
        fyp_07.onChildrenAdded();
        fzk7.onChildrenAdded();
        fes_2 fes_29 = fes_22;
        fzk fzk8 = (fzk)fes_29.getAppearance();
        fzk8.setElementMap(fhs_23);
        fzk8.setState("pressedSelected");
        fes_22.X(fzk8);
        fzk8.guy();
        fyp_0 fyp_08 = fyp_0.checkOut();
        fyp_08.setElementMap(fhs_23);
        fyp_08.setColor(new fhl_2("mainTextLightColor"));
        fzk8.X(fyp_08);
        fyp_08.guy();
        fyp_08.onChildrenAdded();
        fzk8.onChildrenAdded();
        fes_2 fes_210 = fes_22;
        fzk fzk9 = (fzk)fes_210.getAppearance();
        fzk9.setElementMap(fhs_23);
        fzk9.setState("disabledSelected");
        fes_22.X(fzk9);
        fzk9.guy();
        fyp_0 fyp_09 = fyp_0.checkOut();
        fyp_09.setElementMap(fhs_23);
        fyp_09.setColor(new fhl_2("defaultDisabledColor"));
        fzk9.X(fyp_09);
        fyp_09.guy();
        fyp_09.onChildrenAdded();
        fzk9.onChildrenAdded();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from dmX
 */
public class dmx_1
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
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault16"));
        fyW2.setElementMap(fhs_23);
        fym_02.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("mainTextLightColor"));
        fym_02.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fym_02.onChildrenAdded();
        fes_2 fes_24 = fes_22;
        fym_0 fym_03 = (fym_0)fes_24.getAppearance();
        fym_03.setElementMap(fhs_23);
        fym_03.setState("mouseHover");
        fes_22.X(fym_03);
        fym_03.guy();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new fhl_2("mainTextLightColor"));
        fym_03.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fym_03.onChildrenAdded();
        fes_2 fes_25 = fes_22;
        fym_0 fym_04 = (fym_0)fes_25.getAppearance();
        fym_04.setElementMap(fhs_23);
        fym_04.setState("pressed");
        fes_22.X(fym_04);
        fym_04.guy();
        fyp_0 fyp_04 = fyp_0.checkOut();
        fyp_04.setElementMap(fhs_23);
        fyp_04.setColor(new fhl_2("mainTextTitleColor"));
        fym_04.X(fyp_04);
        fyp_04.guy();
        fyp_04.onChildrenAdded();
        fym_04.onChildrenAdded();
        fes_2 fes_26 = fes_22;
        fym_0 fym_05 = (fym_0)fes_26.getAppearance();
        fym_05.setElementMap(fhs_23);
        fym_05.setState("disabled");
        fes_22.X(fym_05);
        fym_05.guy();
        fyp_0 fyp_05 = fyp_0.checkOut();
        fyp_05.setElementMap(fhs_23);
        fyp_05.setColor(new fhl_2("disabledTextColor"));
        fym_05.X(fyp_05);
        fyp_05.guy();
        fyp_05.onChildrenAdded();
        fym_05.onChildrenAdded();
    }
}


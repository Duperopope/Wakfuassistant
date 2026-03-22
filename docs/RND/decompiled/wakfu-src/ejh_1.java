/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from ejH
 */
public class ejh_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fes_2 fes_24 = fes_22;
        fzq fzq2 = (fzq)fes_24.getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLN);
        fzq2.setPadding(new Insets(0, 4, 0, 4));
        fzq2.setState("default");
        fes_22.X(fzq2);
        fzq2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault16"));
        fyW2.setElementMap(fhs_23);
        fzq2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("mainTextLightColor"));
        fzq2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new fhl_2("mainTextTitleColor"));
        fyp_03.setName("text");
        fzq2.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fyp_0 fyp_04 = fyp_0.checkOut();
        fyp_04.setElementMap(fhs_23);
        fyp_04.setColor(new fhl_2("mainTextTitleColor", 0.5f));
        fyp_04.setName("ghostText");
        fzq2.X(fyp_04);
        fyp_04.guy();
        fyp_04.onChildrenAdded();
        fyp_0 fyp_05 = fyp_0.checkOut();
        fyp_05.setElementMap(fhs_23);
        fyp_05.setColor(new fhl_2("mainTextTitleColor"));
        fyp_05.setName("selection");
        fzq2.X(fyp_05);
        fyp_05.guy();
        fyp_05.onChildrenAdded();
        fyp_0 fyp_06 = fyp_0.checkOut();
        fyp_06.setElementMap(fhs_23);
        fyp_06.setColor(new fhl_2("mainTextTitleColor"));
        fyp_06.setName("cursor");
        fzq2.X(fyp_06);
        fyp_06.guy();
        fyp_06.onChildrenAdded();
        fzq2.onChildrenAdded();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from eiF
 */
public class eif_1
implements fhh_2 {
    private fhq_2 okR;
    private Stack<fhs_2> nei = new Stack();

    @Override
    public void a(fhs_2 fhs_22, fhq_2 fhq_22, fes_2 fes_22) {
        this.okR = fhq_22;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fes_2 fes_23 = fes_22;
        fzq fzq2 = (fzq)fes_23.getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLN);
        fzq2.setState("default");
        fes_22.X(fzq2);
        fzq2.guy();
        fyW fyW2 = fyW.checkOut();
        fyW2.setRenderer(fyw_0.gqw().gqB().uG("fontDefault12Bold"));
        fyW2.setElementMap(fhs_23);
        fzq2.X(fyW2);
        fyW2.guy();
        fyW2.onChildrenAdded();
        fyp_0 fyp_02 = fyp_0.checkOut();
        fyp_02.setElementMap(fhs_23);
        fyp_02.setColor(new fhl_2("defaultLightColor"));
        fzq2.X(fyp_02);
        fyp_02.guy();
        fyp_02.onChildrenAdded();
        fkh_1 fkh_12 = new fkh_1();
        fkh_12.aVI();
        fkh_12.setElementMap(fhs_23);
        fzq2.X(fkh_12);
        fkh_12.guy();
        fkh_12.onChildrenAdded();
        fkd_1 fkd_12 = fkd_1.checkOut();
        fkd_12.setElementMap(fhs_23);
        fzq2.X(fkd_12);
        fkd_12.guy();
        fkd_12.onChildrenAdded();
        fyp_0 fyp_03 = fyp_0.checkOut();
        fyp_03.setElementMap(fhs_23);
        fyp_03.setColor(new fhl_2("textDarkTextEditorColor"));
        fyp_03.setName("text");
        fzq2.X(fyp_03);
        fyp_03.guy();
        fyp_03.onChildrenAdded();
        fyp_0 fyp_04 = fyp_0.checkOut();
        fyp_04.setElementMap(fhs_23);
        fyp_04.setColor(new fhl_2("selectionDarkTextEditorColor"));
        fyp_04.setName("selection");
        fzq2.X(fyp_04);
        fyp_04.guy();
        fyp_04.onChildrenAdded();
        fyp_0 fyp_05 = fyp_0.checkOut();
        fyp_05.setElementMap(fhs_23);
        fyp_05.setColor(new fhl_2("selectionDarkTextEditorColor"));
        fyp_05.setName("cursor");
        fzq2.X(fyp_05);
        fyp_05.guy();
        fyp_05.onChildrenAdded();
        fzq2.onChildrenAdded();
    }
}


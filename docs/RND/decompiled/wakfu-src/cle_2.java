/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cLe
 */
public class cle_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        faw_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        String string = "plainBackground";
        fkk_1 fkk_12 = new fkk_1();
        fkk_12.aVI();
        fkk_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fkk_12);
        }
        fkk_12.setColor(new fhl_2("pandoraBackground"));
        fys_02.X(fkk_12);
        fkk_12.guy();
        fkk_12.onChildrenAdded();
        fys_02.onChildrenAdded();
        String string2 = "illustration2";
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fbt_12);
        }
        fbt_12.setFitHeightMode(true);
        fbt_12.setKeepAspectRatio(false);
        fbt_12.setVisible(true);
        faw_22.X(fbt_12);
        fbt_12.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setAlign(fzw_0.tLg);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        fbt_12.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        fze fze2 = fze.checkOut();
        fze2.setElementMap(fhs_23);
        fbt_12.X(fze2);
        fze2.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("texture");
        fsj_22.setField("illustration2");
        fsj_22.setName("outGameIllustration");
        fze2.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fze2.onChildrenAdded();
        fbt_12.onChildrenAdded();
        String string3 = "illustration1";
        fbt_1 fbt_13 = new fbt_1();
        fbt_13.aVI();
        fbt_13.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fbt_13);
        }
        fbt_13.setFitHeightMode(true);
        fbt_13.setKeepAspectRatio(false);
        fbt_13.setVisible(true);
        faw_22.X(fbt_13);
        fbt_13.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLg);
        frp_14.setSize(new fsm_1(100.0f, 100.0f));
        fbt_13.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        fze fze3 = fze.checkOut();
        fze3.setElementMap(fhs_23);
        fbt_13.X(fze3);
        fze3.guy();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("texture");
        fsj_23.setField("illustration1");
        fsj_23.setName("outGameIllustration");
        fze3.X(fsj_23);
        fsj_23.guy();
        fsj_23.onChildrenAdded();
        fze3.onChildrenAdded();
        fbt_13.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


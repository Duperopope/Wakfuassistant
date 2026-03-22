/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cNI
 */
public class cni_2
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
        faw_22.setNonBlocking(true);
        faw_22.setStyle("popup");
        faw_22.guy();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        fys_02.setModulationColor(new awx_2(1.0f, 1.0f, 1.0f, 0.6f));
        faw_22.X(fys_02);
        fys_02.guy();
        fys_02.onChildrenAdded();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLc);
        frp_12.setXOffset(-50);
        frp_12.setYOffset(-5);
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        fbv_2 fbv_22 = new fbv_2();
        fbv_22.aVI();
        fbv_22.setElementMap(fhs_23);
        fbv_22.setStyle("popupInformation");
        String string = "%timedSession.remaining%";
        string = string.replace("%timedSession.remaining%", fyw_0.gqw().k("timedSession.remaining", new Object[0]));
        fbv_22.setText(string);
        faw_22.X(fbv_22);
        fbv_22.guy();
        fbv_22.onChildrenAdded();
        String string2 = "text";
        fbv_2 fbv_23 = new fbv_2();
        fbv_23.aVI();
        fbv_23.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fbv_23);
        }
        fbv_23.setNonBlocking(true);
        fbv_23.setStyle("whitebold");
        faw_22.X(fbv_23);
        fbv_23.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setAlign(fzw_0.tLg);
        fbv_23.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        fbv_2 fbv_24 = fbv_23;
        fzq fzq2 = (fzq)((fes_2)fbv_24).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlignment(faa_2.tLO);
        fbv_23.X(fzq2);
        fzq2.guy();
        fzq2.onChildrenAdded();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("text");
        fsj_22.setField("remainingTimeField");
        fsj_22.setName("sessionTimer");
        fbv_23.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
        fbv_23.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


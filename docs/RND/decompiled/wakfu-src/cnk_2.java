/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cNk
 */
public class cnk_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "popupMenu";
        fcb_2 fcb_22 = new fcb_2();
        fcb_22.aVI();
        fcb_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fcb_22);
        }
        fcb_22.setHotSpotPosition(faa_2.tLL);
        fcb_22.guy();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        frz_22.setVgap((short)4);
        fcb_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        fad_12.setPrefSize(new fsm_1(0, 36));
        fad_12.setStyle("secondaryMedium");
        fcb_22.X(fad_12);
        fad_12.guy();
        fad_12.onChildrenAdded();
        fbv_2 fbv_22 = new fbv_2();
        fbv_22.aVI();
        fbv_22.setElementMap(fhs_23);
        fbv_22.setStyle("wipLightTitle17");
        fcb_22.X(fbv_22);
        fbv_22.guy();
        fbv_2 fbv_23 = fbv_22;
        fzq fzq2 = (fzq)((fes_2)fbv_23).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLO);
        fbv_22.X(fzq2);
        fzq2.guy();
        fzq2.onChildrenAdded();
        fbv_22.onChildrenAdded();
        fcy_2 fcy_22 = new fcy_2();
        fcy_22.aVI();
        fcy_22.setElementMap(fhs_23);
        fcy_22.setStyle("defaultHorizontal");
        fcb_22.X(fcy_22);
        fcy_22.guy();
        fcy_22.onChildrenAdded();
        fcb_22.onChildrenAdded();
        return fcb_22;
    }
}


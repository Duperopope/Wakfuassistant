/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cKD
 */
public class ckd_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "mainWindow";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setNonBlocking(false);
        faw_22.setStyle("backgroundPopup");
        faw_22.guy();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(7, 10, 9, 10));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setSize(new fsm_1(100.0f, -2));
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setHorizontal(false);
        faw_22.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        String string2 = "closeButton";
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fad_12);
        }
        fad_12.setExpandable(false);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.fresco:closeDialog");
        fad_12.setOnClick(fmz_12);
        fad_12.setStyle("close");
        faw_22.X(fad_12);
        fad_12.guy();
        frb_1 frb_12 = new frb_1();
        frb_12.aVI();
        frb_12.setElementMap(fhs_23);
        frb_12.setAlign(faa_2.tLP);
        fad_12.X(frb_12);
        frb_12.guy();
        frb_12.onChildrenAdded();
        fad_12.onChildrenAdded();
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        faw_22.X(faw_24);
        faw_24.guy();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        faw_24.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        String string3 = "multipleImage";
        fbn_2 fbn_22 = new fbn_2();
        fbn_22.aVI();
        fbn_22.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fbn_22);
        }
        fbn_22.setManualInnerMove(true);
        fbn_22.setShrinkToImageHeight(true);
        faw_24.X(fbn_22);
        fbn_22.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        fbn_22.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        String string4 = "internalPopup";
        faw_2 faw_25 = faw_2.checkOut();
        faw_25.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, faw_25);
        }
        faw_25.setStyle("popup");
        fbn_22.X(faw_25);
        faw_25.guy();
        String string5 = "internalPopupTextView";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fdy_12);
        }
        fdy_12.setMinWidth(250);
        fdy_12.setStyle("white");
        faw_25.X(fdy_12);
        fdy_12.guy();
        fdy_12.onChildrenAdded();
        faw_25.onChildrenAdded();
        fbn_22.onChildrenAdded();
        String string6 = "leftArrowContainer";
        faw_2 faw_26 = faw_2.checkOut();
        faw_26.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, faw_26);
        }
        faw_26.setStyle("leftArrowParticle");
        faw_24.X(faw_26);
        faw_26.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLf);
        frp_14.setSize(new fsm_1(50, 50));
        faw_26.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        faw_26.onChildrenAdded();
        String string7 = "rightArrowContainer";
        faw_2 faw_27 = faw_2.checkOut();
        faw_27.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, faw_27);
        }
        faw_27.setStyle("rightArrowParticle");
        faw_24.X(faw_27);
        faw_27.guy();
        frp_1 frp_15 = new frp_1();
        frp_15.aVI();
        frp_15.setElementMap(fhs_23);
        frp_15.setAlign(fzw_0.tLh);
        frp_15.setSize(new fsm_1(50, 50));
        faw_27.X(frp_15);
        frp_15.guy();
        frp_15.onChildrenAdded();
        faw_27.onChildrenAdded();
        faw_24.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cLm
 */
public class clm_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        chj_2 chj_22 = new chj_2();
        chj_22.aVI();
        chj_22.setElementMap(fhs_23);
        chj_22.setNonBlocking(true);
        chj_22.guy();
        fey_2 fey_22 = new fey_2();
        fey_22.aVI();
        fey_22.setElementMap(fhs_23);
        chj_22.X(fey_22);
        fey_22.guy();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        fey_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        fey_22.X(faw_22);
        faw_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        faw_23.setStyle("windowNew");
        fey_22.X(faw_23);
        faw_23.guy();
        faw_2 faw_24 = faw_23;
        fys_0 fys_02 = ((fes_2)faw_24).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_23.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(10, 5, 12, 5));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        faw_23.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        frz_2 frz_22 = frz_2.checkOut();
        frz_22.setAlign(faa_2.tLL);
        frz_22.setHorizontal(false);
        faw_23.X(frz_22);
        frz_22.guy();
        frz_22.onChildrenAdded();
        faw_2 faw_25 = faw_2.checkOut();
        faw_25.setElementMap(fhs_23);
        faw_23.X(faw_25);
        faw_25.guy();
        faw_2 faw_26 = faw_25;
        fys_0 fys_03 = ((fes_2)faw_26).getAppearance();
        fys_03.setElementMap(fhs_23);
        faw_25.X(fys_03);
        fys_03.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(0, 12, 0, 12));
        fys_03.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fys_03.onChildrenAdded();
        String string = "windowContentContainer";
        faw_2 faw_27 = faw_2.checkOut();
        faw_27.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_27);
        }
        faw_25.X(faw_27);
        faw_27.guy();
        faw_2 faw_28 = faw_27;
        fys_0 fys_04 = ((fes_2)faw_28).getAppearance();
        fys_04.setElementMap(fhs_23);
        faw_27.X(fys_04);
        fys_04.guy();
        fzx fzx3 = new fzx();
        fzx3.aVI();
        fzx3.setElementMap(fhs_23);
        fzx3.setInsets(new Insets(5, 5, 0, 5));
        fys_04.X(fzx3);
        fzx3.guy();
        fzx3.onChildrenAdded();
        fys_04.onChildrenAdded();
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        fbt_12.setStyle("Ogrest");
        faw_27.X(fbt_12);
        fbt_12.guy();
        fbt_12.onChildrenAdded();
        String string2 = "container";
        faw_2 faw_29 = faw_2.checkOut();
        faw_29.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, faw_29);
        }
        faw_27.X(faw_29);
        faw_29.guy();
        frz_2 frz_23 = frz_2.checkOut();
        frz_23.setHorizontal(false);
        faw_29.X(frz_23);
        frz_23.guy();
        frz_23.onChildrenAdded();
        faw_2 faw_210 = faw_29;
        fys_0 fys_05 = ((fes_2)faw_210).getAppearance();
        fys_05.setElementMap(fhs_23);
        faw_29.X(fys_05);
        fys_05.guy();
        fzx fzx4 = new fzx();
        fzx4.aVI();
        fzx4.setElementMap(fhs_23);
        fzx4.setInsets(new Insets(0, 5, 0, 0));
        fys_05.X(fzx4);
        fzx4.guy();
        fzx4.onChildrenAdded();
        fys_05.onChildrenAdded();
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("Bold");
        fdy_12.setThemeElementName("text");
        fdy_12.setThemeElementParentType("interactiveBubble");
        faw_29.X(fdy_12);
        fdy_12.guy();
        fro_1 fro_13 = new fro_1();
        fro_13.aVI();
        fro_13.setAdaptToContentSize(true);
        fdy_12.X(fro_13);
        fro_13.guy();
        fro_13.onChildrenAdded();
        frb_1 frb_12 = new frb_1();
        frb_12.aVI();
        frb_12.setElementMap(fhs_23);
        frb_12.setAlign(faa_2.tLO);
        fdy_12.X(frb_12);
        frb_12.guy();
        frb_12.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_29.onChildrenAdded();
        faw_27.onChildrenAdded();
        faw_25.onChildrenAdded();
        faw_23.onChildrenAdded();
        faw_2 faw_211 = faw_2.checkOut();
        faw_211.setElementMap(fhs_23);
        fey_22.X(faw_211);
        faw_211.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setSize(new fsm_1(100.0f, 100.0f));
        faw_211.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        faw_211.onChildrenAdded();
        fey_22.onChildrenAdded();
        chj_22.onChildrenAdded();
        return chj_22;
    }
}


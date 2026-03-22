/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cMz
 */
public class cmz_1
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "container1";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setYOffset(200);
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fro_12.setAdaptToContentSize(true);
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        String string2 = "container2";
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, faw_23);
        }
        faw_22.X(faw_23);
        faw_23.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        faw_23.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        fro_1 fro_13 = new fro_1();
        fro_13.aVI();
        fro_13.setAdaptToContentSize(true);
        faw_23.X(fro_13);
        fro_13.guy();
        fro_13.onChildrenAdded();
        String string3 = "animatedElementLeft";
        fax_1 fax_12 = new fax_1();
        fax_12.aVI();
        fax_12.setElementMap(fhs_23);
        if (fhs_23 != null && string3 != null) {
            fhs_23.a(string3, fax_12);
        }
        fax_12.setExpandable(false);
        fax_12.setNonBlocking(true);
        fax_12.setOffsetX(238.0f);
        fax_12.setOffsetY(-13.0f);
        fax_12.setPrefSize(new fsm_1(220, 84));
        faw_23.X(fax_12);
        fax_12.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLf);
        frp_14.setSize(new fsm_1(-2, 100.0f));
        fax_12.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        fax_12.onChildrenAdded();
        String string4 = "animatedElementRight";
        fax_1 fax_13 = new fax_1();
        fax_13.aVI();
        fax_13.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fax_13);
        }
        fax_13.setExpandable(false);
        fax_13.setNonBlocking(true);
        fax_13.setOffsetX(-238.0f);
        fax_13.setOffsetY(-13.0f);
        fax_13.setPrefSize(new fsm_1(220, 84));
        faw_23.X(fax_13);
        fax_13.guy();
        frp_1 frp_15 = new frp_1();
        frp_15.aVI();
        frp_15.setElementMap(fhs_23);
        frp_15.setAlign(fzw_0.tLh);
        frp_15.setSize(new fsm_1(-2, -2));
        fax_13.X(frp_15);
        frp_15.guy();
        frp_15.onChildrenAdded();
        fax_13.onChildrenAdded();
        faw_23.onChildrenAdded();
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        faw_22.X(faw_24);
        faw_24.guy();
        faw_2 faw_25 = faw_24;
        fys_0 fys_02 = ((fes_2)faw_25).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_24.X(fys_02);
        fys_02.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(0, 165, 5, 165));
        fys_02.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fys_02.onChildrenAdded();
        frp_1 frp_16 = new frp_1();
        frp_16.aVI();
        frp_16.setElementMap(fhs_23);
        frp_16.setSize(new fsm_1(100.0f, -2));
        faw_24.X(frp_16);
        frp_16.guy();
        frp_16.onChildrenAdded();
        String string5 = "image1";
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        if (fhs_23 != null && string5 != null) {
            fhs_23.a(string5, fbt_12);
        }
        fbt_12.setExpandable(false);
        fbt_12.setNonBlocking(true);
        fbt_12.setStyle("ZoneNameLeft");
        faw_24.X(fbt_12);
        fbt_12.guy();
        fbt_12.onChildrenAdded();
        String string6 = "image2";
        fbt_1 fbt_13 = new fbt_1();
        fbt_13.aVI();
        fbt_13.setElementMap(fhs_23);
        if (fhs_23 != null && string6 != null) {
            fhs_23.a(string6, fbt_13);
        }
        fbt_13.setExpandable(true);
        fbt_13.setKeepAspectRatio(false);
        fbt_13.setNonBlocking(true);
        fbt_13.setScaled(true);
        fbt_13.setStyle("ZoneNameCenter");
        faw_24.X(fbt_13);
        fbt_13.guy();
        fbt_13.onChildrenAdded();
        String string7 = "image3";
        fbt_1 fbt_14 = new fbt_1();
        fbt_14.aVI();
        fbt_14.setElementMap(fhs_23);
        if (fhs_23 != null && string7 != null) {
            fhs_23.a(string7, fbt_14);
        }
        fbt_14.setExpandable(false);
        fbt_14.setNonBlocking(true);
        fbt_14.setStyle("ZoneNameRight");
        faw_24.X(fbt_14);
        fbt_14.guy();
        fbt_14.onChildrenAdded();
        faw_24.onChildrenAdded();
        String string8 = "text";
        fdy_1 fdy_12 = new fdy_1();
        fdy_12.aVI();
        fdy_12.setElementMap(fhs_23);
        if (fhs_23 != null && string8 != null) {
            fhs_23.a(string8, fdy_12);
        }
        fdy_12.setMaxWidth(700);
        fdy_12.setNonBlocking(true);
        fdy_12.setStyle("bigBordered");
        faw_22.X(fdy_12);
        fdy_12.guy();
        frp_1 frp_17 = new frp_1();
        frp_17.aVI();
        frp_17.setElementMap(fhs_23);
        frp_17.setSize(new fsm_1(100.0f, 100.0f));
        fdy_12.X(frp_17);
        frp_17.guy();
        frp_17.onChildrenAdded();
        fdy_1 fdy_13 = fdy_12;
        fzq fzq2 = (fzq)((fes_2)fdy_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLR);
        fdy_12.X(fzq2);
        fzq2.guy();
        fzv fzv3 = fzv.checkOut();
        fzv3.setElementMap(fhs_23);
        fzv3.setInsets(new Insets(0, 250, 5, 250));
        fzq2.X(fzv3);
        fzv3.guy();
        fzv3.onChildrenAdded();
        fzq2.onChildrenAdded();
        fdy_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


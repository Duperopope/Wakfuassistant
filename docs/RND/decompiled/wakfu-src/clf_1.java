/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cLF
 */
public class clf_1
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        fey_2 fey_22 = new fey_2();
        fey_22.aVI();
        fey_22.setElementMap(fhs_23);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("unloadDialog");
        fey_22.setOnClick(fmz_12);
        fey_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        fey_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        fey_2 fey_23 = fey_22;
        fys_0 fys_02 = ((fes_2)fey_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        fey_22.X(fys_02);
        fys_02.guy();
        fkk_1 fkk_12 = new fkk_1();
        fkk_12.aVI();
        fkk_12.setElementMap(fhs_23);
        fkk_12.setColor(new awx_2(0.05f, 0.06f, 0.07f, 1.0f));
        fys_02.X(fkk_12);
        fkk_12.guy();
        fkk_12.onChildrenAdded();
        fys_02.onChildrenAdded();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        fey_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        fey_22.X(faw_22);
        faw_22.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setAlign(fzw_0.tLg);
        faw_22.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        String string = "logo";
        fbt_1 fbt_12 = new fbt_1();
        fbt_12.aVI();
        fbt_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fbt_12);
        }
        fbt_12.setDisplaySize(new fsm_1(576, 720));
        fbt_12.setKeepAspectRatio(true);
        fbt_12.setNonBlocking(true);
        fbt_12.setStyle("ankamaLogo");
        faw_22.X(fbt_12);
        fbt_12.guy();
        frb_1 frb_12 = new frb_1();
        frb_12.aVI();
        frb_12.setElementMap(fhs_23);
        frb_12.setAlign(faa_2.tLO);
        fbt_12.X(frb_12);
        frb_12.guy();
        frb_12.onChildrenAdded();
        fbt_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        fey_22.onChildrenAdded();
        return fey_22;
    }
}


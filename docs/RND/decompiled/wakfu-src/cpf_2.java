/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cPf
 */
public class cpf_2
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
        faw_22.setNonBlocking(false);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.videoLoading:onClick");
        faw_22.setOnClick(fmz_12);
        faw_22.guy();
        fro_1 fro_12 = new fro_1();
        fro_12.aVI();
        faw_22.X(fro_12);
        fro_12.guy();
        fro_12.onChildrenAdded();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLg);
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        faw_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        faw_2 faw_23 = faw_22;
        fys_0 fys_02 = ((fes_2)faw_23).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_22.X(fys_02);
        fys_02.guy();
        fkk_1 fkk_12 = new fkk_1();
        fkk_12.aVI();
        fkk_12.setElementMap(fhs_23);
        fkk_12.setColor(new awx_2(0.0f, 0.0f, 0.0f, 1.0f));
        fys_02.X(fkk_12);
        fkk_12.guy();
        fkk_12.onChildrenAdded();
        fys_02.onChildrenAdded();
        String string = "video";
        fed_1 fed_12 = fed_1.checkOut();
        fed_12.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, fed_12);
        }
        faw_22.X(fed_12);
        fed_12.guy();
        frp_1 frp_13 = new frp_1();
        frp_13.aVI();
        frp_13.setElementMap(fhs_23);
        frp_13.setAlign(fzw_0.tLg);
        frp_13.setSize(new fsm_1(100.0f, 100.0f));
        fed_12.X(frp_13);
        frp_13.guy();
        frp_13.onChildrenAdded();
        fed_12.onChildrenAdded();
        faw_2 faw_24 = faw_2.checkOut();
        faw_24.setElementMap(fhs_23);
        faw_22.X(faw_24);
        faw_24.guy();
        frp_1 frp_14 = new frp_1();
        frp_14.aVI();
        frp_14.setElementMap(fhs_23);
        frp_14.setAlign(fzw_0.tLo);
        frp_14.setSize(new fsm_1(110, 110));
        faw_24.X(frp_14);
        frp_14.guy();
        frp_14.onChildrenAdded();
        String string2 = "animatedElementViewer";
        fax_1 fax_12 = new fax_1();
        fax_12.aVI();
        fax_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fax_12);
        }
        fax_12.setAnimName("AnimVideoLoading");
        fax_12.setFilePath("animVideoLoading.anm");
        fax_12.setOffsetX(0.0f);
        fax_12.setOffsetY(0.0f);
        fax_12.setScale(1.0f);
        faw_24.X(fax_12);
        fax_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("animName");
        fsj_22.setName("isNewWorldReady");
        fax_12.X(fsj_22);
        fsj_22.guy();
        fjt_2 fjt_22 = new fjt_2();
        fjt_22.aVI();
        fjt_22.setElementMap(fhs_23);
        fjt_22.setElseValue("AnimVideoLoading");
        fjt_22.setValue("AnimVideoLoaded");
        fsj_22.X(fjt_22);
        fjt_22.guy();
        fjl_1 fjl_12 = new fjl_1();
        fjl_12.aVI();
        fjl_12.setElementMap(fhs_23);
        fjt_22.X(fjl_12);
        fjl_12.guy();
        fjl_12.onChildrenAdded();
        fjt_22.onChildrenAdded();
        fsj_22.onChildrenAdded();
        fax_12.onChildrenAdded();
        faw_24.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


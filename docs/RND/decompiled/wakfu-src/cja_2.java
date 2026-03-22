/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cJa
 */
public class cja_2
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
        fey_22.setMovable(true);
        fey_22.guy();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setElementMap(fhs_23);
        frp_12.setAlign(fzw_0.tLf);
        frp_12.setInitValue(true);
        frp_12.setXOffset(20);
        fey_22.X(frp_12);
        frp_12.guy();
        frp_12.onChildrenAdded();
        String string = "challengeInputContainer";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setNonBlocking(true);
        faw_22.setPack(true);
        faw_22.setStyle("spellInventory");
        fey_22.X(faw_22);
        faw_22.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("visible");
        fsj_22.setName("waitingForInputChallenge");
        faw_22.X(fsj_22);
        fsj_22.guy();
        fjt_2 fjt_22 = new fjt_2();
        fjt_22.aVI();
        fjt_22.setElementMap(fhs_23);
        fsj_22.X(fjt_22);
        fjt_22.guy();
        fjd_1 fjd_12 = new fjd_1();
        fjd_12.aVI();
        fjd_12.setElementMap(fhs_23);
        fjt_22.X(fjd_12);
        fjd_12.guy();
        fjd_12.onChildrenAdded();
        fjt_22.onChildrenAdded();
        fsj_22.onChildrenAdded();
        String string2 = "challenge";
        frv_1 frv_12 = new frv_1();
        frv_12.aVI();
        frv_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, frv_12);
        }
        faw_22.X(frv_12);
        frv_12.guy();
        fsj_2 fsj_23 = fsj_2.checkOut();
        fsj_23.setElementMap(fhs_23);
        fsj_23.setAttribute("value");
        fsj_23.setName("waitingForInputChallenge");
        frv_12.X(fsj_23);
        fsj_23.guy();
        fsj_23.onChildrenAdded();
        frv_12.onChildrenAdded();
        fea_1 fea_12 = new fea_1();
        fea_12.aVI();
        fea_12.setElementMap(fhs_23);
        faw_22.X(fea_12);
        fea_12.guy();
        fea_1 fea_13 = fea_12;
        fys_0 fys_02 = ((fes_2)fea_13).getAppearance();
        fys_02.setElementMap(fhs_23);
        fea_12.X(fys_02);
        fys_02.guy();
        fzx fzx2 = new fzx();
        fzx2.aVI();
        fzx2.setElementMap(fhs_23);
        fzx2.setInsets(new Insets(10, 10, 10, 10));
        fys_02.X(fzx2);
        fzx2.guy();
        fzx2.onChildrenAdded();
        fys_02.onChildrenAdded();
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        fea_12.X(faw_23);
        faw_23.guy();
        frt_2 frt_22 = new frt_2();
        frt_22.aVI();
        faw_23.X(frt_22);
        frt_22.guy();
        frt_22.onChildrenAdded();
        fbv_2 fbv_22 = new fbv_2();
        fbv_22.aVI();
        fbv_22.setElementMap(fhs_23);
        fbv_22.setNonBlocking(true);
        fbv_22.setStyle("white");
        String string3 = "%challenge.question%";
        string3 = string3.replace("%challenge.question%", fyw_0.gqw().k("challenge.question", new Object[0]));
        fbv_22.setText(string3);
        faw_23.X(fbv_22);
        fbv_22.guy();
        fru_1 fru_12 = fru_1.checkOut();
        fru_12.setElementMap(fhs_23);
        fru_12.setData(fzt_0.tKx);
        fbv_22.X(fru_12);
        fru_12.guy();
        fru_12.onChildrenAdded();
        fbv_22.onChildrenAdded();
        String string4 = "textEditor";
        fdu_1 fdu_12 = new fdu_1();
        fdu_12.aVI();
        fdu_12.setElementMap(fhs_23);
        if (fhs_23 != null && string4 != null) {
            fhs_23.a(string4, fdu_12);
        }
        fdu_12.setFocused(true);
        fdu_12.abk(10);
        fms_2 fms_22 = new fms_2();
        fms_22.vw("wakfu.challenge:parseInput(textEditor,challenge)");
        fdu_12.setOnKeyPress(fms_22);
        fdu_12.setPrefSize(new fsm_1(80, 0));
        fdu_12.setRestrict("[0-9]+");
        fdu_12.setStyle("dark");
        faw_23.X(fdu_12);
        fdu_12.guy();
        fru_1 fru_13 = fru_1.checkOut();
        fru_13.setElementMap(fhs_23);
        fru_13.setData(fzt_0.tKw);
        fdu_12.X(fru_13);
        fru_13.guy();
        fru_13.onChildrenAdded();
        fdu_1 fdu_13 = fdu_12;
        fzq fzq2 = (fzq)((fes_2)fdu_13).getAppearance();
        fzq2.setElementMap(fhs_23);
        fzq2.setAlign(faa_2.tLP);
        fdu_12.X(fzq2);
        fzq2.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(8, 5, 5, 0));
        fzq2.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fzq2.onChildrenAdded();
        fdu_12.onChildrenAdded();
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.challenge:parseInput(textEditor,challenge)");
        fad_12.setOnClick(fmz_12);
        fad_12.setStyle("smallValid");
        faw_23.X(fad_12);
        fad_12.guy();
        fru_1 fru_14 = fru_1.checkOut();
        fru_14.setElementMap(fhs_23);
        fru_14.setData(fzt_0.tKz);
        fad_12.X(fru_14);
        fru_14.guy();
        fru_14.onChildrenAdded();
        fad_1 fad_13 = fad_12;
        fym_0 fym_02 = (fym_0)((fes_2)fad_13).getAppearance();
        fym_02.setElementMap(fhs_23);
        fad_12.X(fym_02);
        fym_02.guy();
        fzv fzv3 = fzv.checkOut();
        fzv3.setElementMap(fhs_23);
        fzv3.setInsets(new Insets(3, 5, 0, 5));
        fym_02.X(fzv3);
        fzv3.guy();
        fzv3.onChildrenAdded();
        fym_02.onChildrenAdded();
        fad_12.onChildrenAdded();
        faw_23.onChildrenAdded();
        fea_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        fey_22.onChildrenAdded();
        return fey_22;
    }
}


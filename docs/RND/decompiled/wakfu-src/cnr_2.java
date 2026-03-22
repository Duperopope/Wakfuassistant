/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Insets;
import java.util.Stack;

/*
 * Renamed from cNR
 */
public class cnr_2
implements fhk_1 {
    private Stack<fhs_2> nei = new Stack();
    private fhu_1 nej;

    @Override
    public fhi_2 a(fhu_1 fhu_12, fhs_2 fhs_22) {
        this.nej = fhu_12;
        this.nei.push(fhs_22);
        fhs_2 fhs_23 = this.nei.peek();
        String string = "splitExchangeCashContainer";
        faw_2 faw_22 = faw_2.checkOut();
        faw_22.setElementMap(fhs_23);
        if (fhs_23 != null && string != null) {
            fhs_23.a(string, faw_22);
        }
        faw_22.setPack(true);
        faw_22.setStyle("spellInventory");
        faw_22.guy();
        frt_2 frt_22 = new frt_2();
        frt_22.aVI();
        faw_22.X(frt_22);
        frt_22.guy();
        frt_22.onChildrenAdded();
        faw_2 faw_23 = faw_2.checkOut();
        faw_23.setElementMap(fhs_23);
        faw_22.X(faw_23);
        faw_23.guy();
        faw_2 faw_24 = faw_23;
        fys_0 fys_02 = ((fes_2)faw_24).getAppearance();
        fys_02.setElementMap(fhs_23);
        faw_23.X(fys_02);
        fys_02.guy();
        fzv fzv2 = fzv.checkOut();
        fzv2.setElementMap(fhs_23);
        fzv2.setInsets(new Insets(0, 5, 0, 0));
        fys_02.X(fzv2);
        fzv2.guy();
        fzv2.onChildrenAdded();
        fys_02.onChildrenAdded();
        fru_1 fru_12 = fru_1.checkOut();
        fru_12.setElementMap(fhs_23);
        fru_12.setData(fzt_0.tKw);
        faw_23.X(fru_12);
        fru_12.guy();
        fru_12.onChildrenAdded();
        frt_2 frt_23 = new frt_2();
        frt_23.aVI();
        faw_23.X(frt_23);
        frt_23.guy();
        frt_23.onChildrenAdded();
        String string2 = "quantityTextEditor";
        fdu_1 fdu_12 = new fdu_1();
        fdu_12.aVI();
        fdu_12.setElementMap(fhs_23);
        if (fhs_23 != null && string2 != null) {
            fhs_23.a(string2, fdu_12);
        }
        fdu_12.setFocused(true);
        fdu_12.abk(10);
        fmu_2 fmu_22 = new fmu_2();
        fmu_22.vw("wakfu.exchange:keyType(quantityTextEditor)");
        fdu_12.setOnKeyType(fmu_22);
        fdu_12.setPrefSize(new fsm_1(80, 0));
        fdu_12.setRestrict("[0-9]+");
        fdu_12.setSelectOnFocus(true);
        fdu_12.setStyle("dark");
        faw_23.X(fdu_12);
        fdu_12.guy();
        fsj_2 fsj_22 = fsj_2.checkOut();
        fsj_22.setElementMap(fhs_23);
        fsj_22.setAttribute("text");
        fsj_22.setName("exchange.amountOfCash");
        fdu_12.X(fsj_22);
        fsj_22.guy();
        fsj_22.onChildrenAdded();
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
        fzv fzv3 = fzv.checkOut();
        fzv3.setElementMap(fhs_23);
        fzv3.setInsets(new Insets(8, 0, 5, 0));
        fzq2.X(fzv3);
        fzv3.guy();
        fzv3.onChildrenAdded();
        fzq2.onChildrenAdded();
        fdu_12.onChildrenAdded();
        faw_23.onChildrenAdded();
        fad_1 fad_12 = new fad_1();
        fad_12.aVI();
        fad_12.setElementMap(fhs_23);
        fmz_1 fmz_12 = new fmz_1();
        fmz_12.vw("wakfu.exchange:applyQuantity");
        fad_12.setOnClick(fmz_12);
        fad_12.setStyle("smallValid");
        faw_22.X(fad_12);
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
        fzv fzv4 = fzv.checkOut();
        fzv4.setElementMap(fhs_23);
        fzv4.setInsets(new Insets(3, 5, 0, 5));
        fym_02.X(fzv4);
        fzv4.guy();
        fzv4.onChildrenAdded();
        fym_02.onChildrenAdded();
        fad_12.onChildrenAdded();
        faw_22.onChildrenAdded();
        return faw_22;
    }
}


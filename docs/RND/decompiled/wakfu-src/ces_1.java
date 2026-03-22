/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cES
 */
@fyf_0
public class ces_1 {
    public static final String PACKAGE = "wakfu.guildBannerCreator";

    public static void selectColor(flg_2 flg_22) {
        dbt dbt2 = new dbt();
        dbt2.lK(18039);
        dbt2.setColor((axb_2)flg_22.getItemValue());
        aaw_1.bUq().h(dbt2);
    }

    public static void selectBackground(flg_2 flg_22) {
        dae_0 dae_02 = new dae_0(16585);
        bvy bvy2 = (bvy)flg_22.getItemValue();
        dae_02.sY(bvy2.d());
        aaw_1.bUq().h(dae_02);
    }

    public static void selectEmblem(flg_2 flg_22) {
        dae_0 dae_02 = new dae_0(18259);
        bvy bvy2 = (bvy)flg_22.getItemValue();
        dae_02.sY(bvy2.d());
        aaw_1.bUq().h(dae_02);
    }

    public static void createGuild(fiq_1 fiq_12, fdu_1 fdu_12, String string) {
        String string2 = ces_1.c(fdu_12);
        dbv dbv2 = new dbv();
        dbv2.setName(string2);
        aaw_1.bUq().h(dbv2);
    }

    @NotNull
    private static String c(fdu_1 fdu_12) {
        String string = fdu_12.getText();
        String string2 = BH.aS(string).replaceAll("[?]", "");
        if (!string2.equals(string)) {
            fdu_12.setTextImmediate(string2);
        }
        return string2;
    }

    public static void validateBlazonChange(fiq_1 fiq_12) {
        dae_0 dae_02 = new dae_0(16936);
        aaw_1.bUq().h(dae_02);
    }

    public static void validateNameChange(fiq_1 fiq_12, fdu_1 fdu_12) {
        String string = ces_1.c(fdu_12);
        dae_0 dae_02 = new dae_0(19556);
        dae_02.fa(string);
        aaw_1.bUq().h(dae_02);
    }

    public static void notifyNameChange(fle_2 fle_22) {
        if (!fle_22.gDO()) {
            fdu_1 fdu_12 = (fdu_1)fle_22.gBE();
            String string = ces_1.c(fdu_12);
            dae_0 dae_02 = new dae_0(17203);
            dae_02.fa(string);
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void onIconTypeChanged(flv_2 flv_22, String string) {
        if (!flv_22.bqr()) {
            return;
        }
        dae_0 dae_02 = new dae_0(19872);
        dae_02.sY(Integer.parseInt(string));
        aaw_1.bUq().h(dae_02);
    }

    public static void selectEmblemCategory(flk_2 flk_22) {
        if (flk_22.bqr()) {
            dae_0 dae_02 = new dae_0(17537);
            dae_02.D(flk_22.getValue());
            aaw_1.bUq().h(dae_02);
        }
    }

    public static void closeDialog(fiq_1 fiq_12) {
        aue_0.cVJ().b(cva_1.eTu());
    }

    public static void restoreBlazon(fiq_1 fiq_12) {
        aaw_1.bUq().h(new dae_0(19017));
    }

    public static void openShop(fiq_1 fiq_12) {
        cyr_2.eYA().qU("wakfu_service");
        aaw_1.bUq().h(new dae_0(17546));
    }
}


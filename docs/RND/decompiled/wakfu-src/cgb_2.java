/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGB
 */
@fyf_0
public class cgb_2 {
    public static final String PACKAGE = "wakfu.osamodasSymbiot";
    private static final Logger mYH = Logger.getLogger(cgb_2.class);

    public static void selectCreature(fiq_1 fiq_12) {
        if (fiq_12 == null || fzq_0.tJB != fiq_12.gBy()) {
            return;
        }
        flg_2 flg_22 = (flg_2)fiq_12;
        if (!(flg_22.getItemValue() instanceof bmb_1)) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bmb_1 bmb_12 = (bmb_1)flg_22.getItemValue();
        blx_1 blx_12 = bgt_02.dmN();
        if (blx_12 == null) {
            return;
        }
        if (flg_22.gEk()) {
            dae_0 dae_02 = new dae_0();
            dae_02.lK(16471);
            dae_02.ay(blx_12.c(bmb_12));
            aaw_1.bUq().h(dae_02);
        } else if (flg_22.gEm()) {
            cxo_2.eWM().a(bmb_12);
        }
    }

    public static void selectNextCreature(fiq_1 fiq_12) {
        if (fiq_12 != null && fzq_0.tJW == fiq_12.gBy()) {
            flp_2 flp_22 = (flp_2)fiq_12;
            dae_0.cV((short)16525);
        }
    }

    public static boolean validateChangeNameForm(fix_2 fix_22) {
        fix_22.gBS();
        fsf_1 fsf_12 = fix_22.getProperty("osamodasSymbiot.describedCreature");
        if (fsf_12 != null) {
            String string = fsf_12.wc("name");
            String string2 = eii_0.sb(string);
            if (!string2.equals(string)) {
                fsf_12.c("name", (Object)string2);
            }
            return cdd_2.checkNameValidity(string);
        }
        return true;
    }

    public static void setCreatureName(fiq_1 fiq_12, bmb_1 bmb_12, fdu_1 fdu_12) {
        if (fiq_12.gBy() != fzq_0.tJU && (fiq_12.gBy() != fzq_0.tJF || ((fli_2)fiq_12).bCC() != 10)) {
            return;
        }
        blx_1 blx_12 = aue_0.cVJ().cVK().dmN();
        if (blx_12 == null) {
            return;
        }
        if (!fdu_12.isValid()) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.fa(fdu_12.getText());
        dae_02.ay(blx_12.c(bmb_12));
        dae_02.lK(17151);
        aaw_1.bUq().h(dae_02);
    }

    public static void freeCreature(fiq_1 fiq_12, bmb_1 bmb_12) {
        blx_1 blx_12 = aue_0.cVJ().cVK().dmN();
        if (blx_12 == null) {
            return;
        }
        dae_0 dae_02 = new dae_0();
        dae_02.ay(blx_12.c(bmb_12));
        dae_02.lK(19909);
        aaw_1.bUq().h(dae_02);
    }

    public static void monsterPopup(fiq_1 fiq_12) {
        short s = aue_0.cVJ().cVK().cmL();
        bmx_0 bmx_02 = bmb_0.eeV().h(7348, s);
        if (bmx_02 == null) {
            return;
        }
        fse_1.gFu().f("describedSpell", bmx_02);
        fse_1.gFu().f("describedSpellRealLevel", bmx_02.cmL());
    }

    public static void closeMonsterPopup(fiq_1 fiq_12) {
        fse_1.gFu().f("describedSpell", (Object)null);
    }
}


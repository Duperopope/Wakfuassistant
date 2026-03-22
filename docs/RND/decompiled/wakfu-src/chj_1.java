/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.debug.anim.AnmDebuggerCommand;

/*
 * Renamed from cHj
 */
@fyf_0
public class chj_1 {
    public static final String PACKAGE = "wakfu.stuffPreviewDebug";
    private static long mSK = -1L;

    public static void equipItem(ffV ffV2, String string) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.setItem(ffV2);
        dbl_02.ay(Byte.valueOf(string));
        dbl_02.lK(19557);
        aaw_1.bUq().h(dbl_02);
    }

    public static void unequipItem(byte by) {
        dbl_0 dbl_02 = new dbl_0();
        dbl_02.ay(by);
        dbl_02.lK(17074);
        aaw_1.bUq().h(dbl_02);
        chj_1.setDraggedItemId(-1L);
    }

    public static void unequip(flg_2 flg_22, String string) {
        chj_1.unequipItem(Byte.parseByte(string));
    }

    public static void itemDropOut(flc_2 flc_22, String string) {
        chj_1.unequipItem(Byte.parseByte(string));
    }

    public static void equipmentDropItem(fla_2 fla_22, String string) {
        if (!(fla_22.getValue() instanceof ffV)) {
            return;
        }
        ffV ffV2 = (ffV)fla_22.getValue();
        cfe_1.onDropItem();
        chj_1.equipItem(ffV2, string);
    }

    public static void dragItem(flu_1 flu_12) {
        ffV ffV2 = (ffV)flu_12.getValue();
        chj_1.setDraggedItemId(ffV2.avr());
    }

    public static long getDraggedItemId() {
        return mSK;
    }

    public static void setDraggedItemId(long l) {
        mSK = l;
    }

    public static void changeItemBackground(flp_2 flp_22, String string, fey_2 fey_22) {
        chj_1.changeItemBackground(flp_22, null, null, string, fey_22, null);
    }

    public static void changeItemBackground(flp_2 flp_22, aef_2 aef_22, ffV ffV2, String string, fey_2 fey_22, frx_1 frx_12) {
        String string2 = "";
        fes_2 fes_22 = (fes_2)flp_22.gBE();
        if (bsl_0.jfZ.dFt() != null && fse_1.gFu().vY("exchange.sourceBag") instanceof bde_0) {
            return;
        }
        if (string != null) {
            ffV2 = cys_2.eXV().eXW().cw(Byte.parseByte(string));
        }
        if (ffV2 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                string2 = ffV2.dOg().dpq() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (flp_22.gBy() == fzq_0.tJR) {
                string2 = bEf.b(ffV2, fes_22.getElementMap().getId());
            }
            fes_22.setStyle(string2);
        }
        if (frx_12 != null) {
            if (flp_22.gBy() == fzq_0.tJQ) {
                cgn_1.showPopup(flp_22, ffV2, frx_12, fes_22);
            } else {
                cgn_1.closePopup(flp_22);
            }
        }
    }

    public static void turnClockWise(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(17958));
    }

    public static void turnCounterClockWise(flp_2 flp_22) {
        aaw_1.bUq().h(new dae_0(16673));
    }

    public static void setStaticAnimation(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(19795);
        dae_02.fa("AnimStatique");
        aaw_1.bUq().h(dae_02);
    }

    public static void setWalkAnimation(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(19795);
        dae_02.fa("AnimMarche");
        aaw_1.bUq().h(dae_02);
    }

    public static void setRunAnimation(flp_2 flp_22) {
        dae_0 dae_02 = new dae_0(19795);
        dae_02.fa("AnimCourse");
        aaw_1.bUq().h(dae_02);
    }

    public static void setNextHairStyle(fiq_1 fiq_12) {
        dae_0.cV((short)18420);
    }

    public static void setPreviousHairStyle(fiq_1 fiq_12) {
        dae_0.cV((short)19560);
    }

    public static void setNextDressStyle(fiq_1 fiq_12) {
        dae_0.cV((short)17282);
    }

    public static void setPreviousDressStyle(fiq_1 fiq_12) {
        dae_0.cV((short)19188);
    }

    public static void loadAnmDebugger(fiq_1 fiq_12) {
        if (fyw_0.gqw().to("debugAnmDialog")) {
            fyw_0.gqw().tl("debugAnmDialog");
        } else {
            AnmDebuggerCommand.cUf();
        }
    }
}


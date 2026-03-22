/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cDU
 */
@fyf_0
public abstract class cdu_1 {
    public static final String PACKAGE = "wakfu.companionsEmbedded";

    public static void selectCompanion(flg_2 flg_22, fey_2 fey_22) {
        String string = fey_22.getElementMap().getId();
        bli_1 bli_12 = (bli_1)flg_22.getItemValue();
        cdu_1.selectCompanion(string, bli_12.xT());
    }

    public static void selectCompanion(fiq_1 fiq_12, bli_1 bli_12, fey_2 fey_22) {
        String string = fey_22.getElementMap().getId();
        cdu_1.selectCompanion(string, bli_12.xT());
    }

    public static void selectHero(@Nullable fiq_1 fiq_12, bhJ bhJ2, fey_2 fey_22) {
        blh_1 blh_12 = new blh_1(bhJ2);
        bgl_0 bgl_02 = bwa_0.jwi.a(blh_12);
        fhs_2 fhs_22 = fey_22.getElementMap();
        String string = fhs_22.getId();
        fse_1.gFu().b("characterSheet", bgl_02, string);
        if ("inventoryDialog".equals(string)) {
            fcq_2 fcq_22 = (fcq_2)fhs_22.uH("inventoriesScrollContainer");
            fcq_22.setVerticalScrollBarPosition(1.0f);
            dae_0 dae_02 = new dae_0(19148);
            dae_02.gj(blh_12.Sn());
            aaw_1.bUq().h(dae_02);
        } else if ("characterSheetDialog".equals(string)) {
            dae_0 dae_03 = new dae_0(18695);
            dae_03.gj(blh_12.Sn());
            aaw_1.bUq().h(dae_03);
        } else if ("heroBuildDialog".equals(string)) {
            dae_0 dae_04 = new dae_0(16143);
            dae_04.gj(blh_12.Sn());
            aaw_1.bUq().h(dae_04);
        }
    }

    public static void selectCompanion(String string, int n) {
        bgl_0 bgl_02 = cts_1.MC(n);
        fse_1.gFu().b("characterSheet", bgl_02, string);
        if ("heroBuildDialog".equals(string)) {
            dae_0 dae_02 = new dae_0(19430);
            dae_02.sY(n);
            aaw_1.bUq().h(dae_02);
        } else {
            dae_0 dae_03 = new dae_0();
            dae_03.lK(17574);
            dae_03.fa(string);
            dae_03.sY(n);
            aaw_1.bUq().h(dae_03);
        }
    }

    public static void openSpellDescription(int n, bmx_0 bmx_02, String string) {
        dcC dcC2 = new dcC();
        dcC2.g(bmx_02.ic(false));
        dcC2.NQ(n);
        dcC2.fa(string);
        dcC2.lK(18231);
        aaw_1.bUq().h(dcC2);
    }

    public static void openSpellDescription(flg_2 flg_22) {
        cdu_1.openSpellDescription(flg_22, null);
    }

    public static void openSpellDescription(flg_2 flg_22, bgl_0 bgl_02) {
        bmx_0 bmx_02 = flg_22.getItemValue() instanceof bmx_0 ? (bmx_0)flg_22.getItemValue() : (bgl_02 != null ? new bmx_0((bmt_0)flg_22.getItemValue(), 0, -1L, bgl_02.dcP()) : new bmx_0((bmt_0)flg_22.getItemValue(), 0, -1L, aue_0.cVJ().cVK()));
        fhs_2 fhs_22 = ((fhv_1)flg_22.gBD()).getElementMap();
        cdu_1.openSpellDescription(flg_22.fca(), bmx_02, fhs_22.getId());
        fdh_1 fdh_12 = (fdh_1)fhs_22.uH("tabbedContainer");
        if (fdh_12 != null) {
            fdh_12.setSelectedTabIndex(0);
        }
        if (bgl_02 != null && bgl_02.aXd()) {
            blp_0 blp_02 = (blp_0)bgl_02;
            cdu_1.a(bmx_02, fhs_22, blp_02);
        }
    }

    private static void a(bmx_0 bmx_02, fhs_2 fhs_22, blp_0 blp_02) {
        int n;
        bls_0 bls_02 = blp_02.DD(bmx_02.axA());
        if (bls_02 == null) {
            return;
        }
        ArrayList<String> arrayList = bls_02.dtD();
        fax_1 fax_12 = (fax_1)fhs_22.uH("animatedElementViewer");
        if (arrayList != null && arrayList.size() > 0) {
            fax_12.setAnimName(arrayList.get(0));
            if (arrayList.size() > 1) {
                ZC zC = fax_12.getAnimatedElement();
                zC.a(new cdv_2(fax_12, arrayList, zC));
            }
        }
        if ((n = bls_02.dtE()) != -1) {
            abg_2.bUP().a((Runnable)new cdw_1(n, fax_12), bls_02.dtF(), 1);
        }
    }

    private static void c(fes_2 fes_22) {
        fes_22.getAppearance().setModulationColor(new awx_2(1.0f, 0.87f, 0.0f, 1.0f));
    }

    public static void onMouseOverSpell(fiq_1 fiq_12, faw_2 faw_22) {
        cdu_1.c(faw_22);
    }

    public static void onMouseOutSpell(fiq_1 fiq_12, faw_2 faw_22, Object object) {
        String string = faw_22.getRenderableParent().getElementMap().getId();
        bmx_0 bmx_02 = (bmx_0)fse_1.gFu().aW("describedSpell", string);
        if (object instanceof bmt_0 && bmx_02 != null && ((bmt_0)object).d() == bmx_02.avr()) {
            return;
        }
        if (object instanceof bmx_0 && bmx_02 != null && ((bmx_0)object).avr() == bmx_02.avr()) {
            return;
        }
        faw_22.getAppearance().setModulationColor(new awx_2(1.0f, 1.0f, 1.0f, 1.0f));
    }

    public static void openCloseDescription(flg_2 flg_22) {
        cgz_2.openCloseDescription(flg_22, "spellPopup");
    }
}


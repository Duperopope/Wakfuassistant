/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cGZ
 */
@fyf_0
public class cgz_2 {
    public static final String PACKAGE = "wakfu.spellDetails";
    static int mZg = -1;

    public static void setSpellLevel(fiq_1 fiq_12) {
        if (fiq_12 instanceof flw_2) {
            fhs_2 fhs_22;
            short s = (short)((flw_2)fiq_12).getValue();
            if (s > mh_1.aWP.aVe()) {
                s = mh_1.aWP.aVe();
            }
            if ((fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap()) == null) {
                return;
            }
            cgz_2.b(s, fhs_22);
        }
    }

    public static void keyType(fiq_1 fiq_12, fdu_1 fdu_12) {
        fhs_2 fhs_22;
        if (fdu_12.getText().length() == 0) {
            return;
        }
        short s = Bw.r(fdu_12.getText());
        if (s > mh_1.aWP.aVe()) {
            s = mh_1.aWP.aVe();
        }
        if ((fhs_22 = ((fhv_1)fiq_12.gBE()).getElementMap()) == null) {
            return;
        }
        cgz_2.b(s, fhs_22);
    }

    public static void processText(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12) {
        cgz_2.processText(fiq_12, fes_22, frx_12, null);
    }

    public static void processText(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12, @Nullable frx_1 frx_13) {
        String string;
        String string2;
        String[] stringArray;
        String string3;
        fgk_2 fgk_22;
        fdy_1 fdy_12 = (fdy_1)fiq_12.gBE();
        fgb_2 fgb_22 = fdy_12.getBlockUnderMouse();
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uuh) {
            fgk_22 = fgb_22.gyW();
            if (fgk_22 == null) {
                return;
            }
            if (fgk_22.gzE() == ahr_2.dSC && (string3 = ((fgm_1)fgk_22).getId()) != null && string3.length() > 0 && (stringArray = string3.split("_")).length == 2) {
                string2 = stringArray[0];
                string = stringArray[1];
                if (string2 == null || string2.length() == 0) {
                    return;
                }
                if (string2.equals("state")) {
                    var11_11 = Integer.parseInt(string);
                    short s = GC.mS(var11_11);
                    short s2 = GC.mT(var11_11);
                    bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(s);
                    if (bmq_02.cmL() != s2) {
                        bmq_02 = bmq_02.cl(s2);
                    }
                    if (fiq_12.gBy() == fzq_0.tJU) {
                        bmx_0 bmx_02;
                        fhs_2 fhs_22;
                        dbo dbo2 = new dbo();
                        dbo2.b(bmq_02);
                        fhs_2 fhs_23 = fhs_22 = fes_22.getElementMap().getId() == null ? fes_22.getElementMap().gAv() : fes_22.getElementMap();
                        if (fhs_22 != null && (bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fhs_22.getId())) != null) {
                            dbo2.sY(((bmt_0)bmx_02.giP()).d());
                        }
                        dbo2.fa(fhs_22.getId());
                        aaw_1.bUq().h(dbo2);
                    } else {
                        fse_1.gFu().f("describedState", bmq_02);
                        fyd_0.popup(frx_12, fes_22);
                        fes_22.a(fzq_0.tJY, new cha_1(fes_22), true);
                    }
                } else if (string2.equals("glyph")) {
                    var11_11 = Integer.parseInt(string);
                    short s = GC.mS(var11_11);
                    short s3 = GC.mT(var11_11);
                    eSS eSS2 = eTo.fIZ().iY(s);
                    bmf_1 bmf_12 = new bmf_1(eSS2, s3);
                    if (fiq_12.gBy() == fzq_0.tJU) {
                        bmx_0 bmx_03;
                        fhs_2 fhs_24;
                        dbk dbk2 = new dbk(bmf_12);
                        fhs_2 fhs_25 = fhs_24 = fes_22.getElementMap().getId() == null ? fes_22.getElementMap().gAv() : fes_22.getElementMap();
                        if (fhs_24 != null && (bmx_03 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fhs_24.getId())) != null) {
                            dbk2.sY(((bmt_0)bmx_03.giP()).d());
                        }
                        dbk2.fa(fhs_24.getId());
                        aaw_1.bUq().h(dbk2);
                    } else {
                        fse_1.gFu().f("describedState", bmf_12);
                        fyd_0.popup(frx_12, fes_22);
                        fes_22.a(fzq_0.tJY, new chb_1(fes_22), true);
                    }
                } else if (string2.equals("spell")) {
                    var11_11 = Integer.parseInt(string);
                    bmt_0 bmt_02 = bmb_0.eeV().If(var11_11);
                    if (bmt_02 == null) {
                        return;
                    }
                    bmx_0 bmx_04 = new bmx_0(bmt_02, 0, -1L, new bgo_0());
                    if (fiq_12.gBy() == fzq_0.tJU) {
                        fhs_2 fhs_26 = fes_22.getElementMap().getId() == null ? fes_22.getElementMap().gAv() : fes_22.getElementMap();
                        cdu_1.openSpellDescription(3, bmx_04, fhs_26.getId());
                    } else if (frx_13 != null) {
                        fse_1.gFu().f("describedSpell", bmx_04);
                        fyd_0.popup(frx_13, fes_22);
                        fes_22.a(fzq_0.tJY, new chc_2(fes_22), true);
                    }
                }
            }
        }
        if (fgb_22 != null && fgb_22.gyV() == fgc_2.uui) {
            fgk_22 = fgb_22.gyW();
            if (fgk_22 == null) {
                return;
            }
            if (fgk_22.gzE() == ahr_2.dSD) {
                fse_1.gFu().f("describedState", (Object)null);
                string3 = ((fgl_2)fgk_22).gzI();
                if (string3 == null) {
                    return;
                }
                stringArray = string3.split("_");
                string2 = stringArray[0];
                if (stringArray.length > 1) {
                    Object[] objectArray = stringArray[1].split(",");
                    string = aum_0.cWf().c(string2, objectArray);
                } else {
                    string = aum_0.cWf().c(string2, new Object[0]);
                }
                fse_1.gFu().f("describedIcon", string);
                fyd_0.popup(frx_12, fdy_12);
                fes_22.a(fzq_0.tJY, new chd_1(fes_22), true);
            }
        }
    }

    public static void updateBlocks(fiq_1 fiq_12, fes_2 fes_22, frx_1 frx_12, frx_1 frx_13) {
        fdy_1 fdy_12 = (fdy_1)fiq_12.gBE();
        fgb_2 fgb_22 = fdy_12.getBlockUnderMouse();
        if (fgb_22 != null && mZg != fgb_22.hashCode()) {
            mZg = fgb_22.hashCode();
            cgz_2.processText(fiq_12, fes_22, frx_12, frx_13);
        }
    }

    public static void addSpellLevel(fiq_1 fiq_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBD()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        bmx_0 bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fhs_22.getId());
        short s = GC.cu(bmx_02.cmL() + 1);
        if (s > mh_1.aWP.aVe()) {
            s = mh_1.aWP.aVe();
        }
        cgz_2.b(s, fhs_22);
    }

    public static void removeSpellLevel(fiq_1 fiq_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBD()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        bmx_0 bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fhs_22.getId());
        short s = GC.cu(bmx_02.cmL() - 1);
        if (s < 0) {
            s = 0;
        }
        cgz_2.b(s, fhs_22);
    }

    public static void restore(fiq_1 fiq_12) {
        fhs_2 fhs_22 = ((fhv_1)fiq_12.gBD()).getElementMap();
        if (fhs_22 == null) {
            return;
        }
        short s = (Short)fse_1.gFu().aW("describedSpellRealLevel", fhs_22.getId());
        cgz_2.b(s, fhs_22);
    }

    private static void b(short s, fhs_2 fhs_22) {
        bmx_0 bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fhs_22.getId());
        if (bmx_02 == null) {
            return;
        }
        bmx_02.cj(s);
        fdh_1 fdh_12 = (fdh_1)fhs_22.uH("tabbedContainer");
        if (fdh_12 == null) {
            return;
        }
        boolean bl = fdh_12.getSelectedTabIndex() == 0;
        fse_1.gFu().a((aef_2)bmx_02, "level", "levelTextShort", "ap", "castInterval", "wp", "chrage", "mp", "castOnlyInLine", "range", "areaOfEffectIconURL", "conditionsDescription", "criticalDescription", "shortDescription", "testLineOfSight", "modifiableRange", "hasEvolutionCondition", "evolutionText", "shortOrCriticalDescription");
        cgz_2.a(bmx_02, bmx_02, bl);
    }

    public static void updateSpellLevel(flv_2 flv_22) {
        fhs_2 fhs_22 = ((fhv_1)flv_22.gBE()).getElementMap();
        bmx_0 bmx_02 = (bmx_0)fse_1.gFu().aW("editableDescribedSpell", fhs_22.getId());
        bmx_02.id(flv_22.bqr());
    }

    private static void a(Qk qk, bmx_0 bmx_02, boolean bl) {
        for (enk_0 enk_02 : qk) {
            boolean bl2 = enk_02.df(1L);
            if (bl2 && bl || !bl2 && !bl || bmx_02.cmL() > enk_02.fAw() || bmx_02.cmL() < enk_02.fAv()) continue;
            int n = enk_02.fAn();
            Object[] objectArray = new Object[n];
            for (int i = 0; i < n; ++i) {
                objectArray[i] = enk_02.a(i, bmx_02.cmL(), ene_0.qPu);
            }
            if (enh_0.qWn.contains(enk_02.avZ())) {
                cgz_2.a(bmi_0.giD().Za(enk_02.aZH()), bmx_02, bl);
                continue;
            }
            if (enk_02.avZ() == enf_0.qUR.d()) {
                cyq_1.eXS().ac(((bmt_0)bmx_02.giP()).d(), enk_02.a(0, bmx_02.cmL(), ene_0.qPu), (short)enk_02.a(1, bmx_02.cmL(), ene_0.qPu));
                continue;
            }
            QQ<enk_0, etj_0> qQ = emt_0.c(enk_02.avZ(), objectArray);
            if (qQ == null) continue;
            cgz_2.a(qQ, bmx_02, bl);
        }
    }

    public static void openCloseDescription(flg_2 flg_22, String string) {
        bmx_0 bmx_02;
        if (flg_22 == null || flg_22.getItemValue() == null) {
            return;
        }
        if (flg_22.getItemValue() instanceof bmx_0) {
            bmx_02 = (bmx_0)flg_22.getItemValue();
        } else if (flg_22.getItemValue() instanceof bmd_0) {
            bmx_02 = ((bmd_0)flg_22.getItemValue()).eeW();
        } else if (flg_22.getItemValue() instanceof bmt_0) {
            bgt_0 bgt_02 = cvu_2.eUm() != null ? cvu_2.eUm() : aue_0.cVJ().cVK();
            bmx_02 = new bmx_0((bmt_0)flg_22.getItemValue(), bgt_02.cmL(), -1L, bgt_02);
        } else {
            return;
        }
        if (bmx_02 == null) {
            return;
        }
        cgz_2.openCloseDescription(flg_22, bmx_02, string);
    }

    public static void openCloseDescription(flg_2 flg_22, bmx_0 bmx_02, String string) {
        if (flg_22 == null || flg_22.getItemValue() == null) {
            return;
        }
        if (bmx_02 == null) {
            return;
        }
        exP exP2 = bmx_02.eeL();
        bmx_0 bmx_03 = bmx_02.ic(false);
        if (exP2 != null) {
            bmx_03.cj(bmx_02.c(exP2.dnM()));
        }
        fse_1.gFu().f("describedSpell", bmx_03);
        fse_1.gFu().f("describedSpellRealLevel", bmx_03.cmL());
        faw_2 faw_22 = (faw_2)flg_22.gBE();
        frx_1 frx_12 = (frx_1)faw_22.getElementMap().uH(string);
        if (flg_22.gBy() == fzq_0.tJE && !fbj_1.getInstance().isDragging()) {
            fyd_0.popup(frx_12, faw_22);
        } else if (flg_22.gBy() == fzq_0.tJD || flg_22.gBy() == fzq_0.tJC) {
            fse_1.gFu().f("describedSpell", (Object)null);
            fse_1.gFu().f("describedSpellRealLevel", (short)-1);
            fyd_0.closePopup(flg_22, frx_12);
        }
    }
}


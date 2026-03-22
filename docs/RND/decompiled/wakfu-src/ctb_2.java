/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cTB
 */
public class ctb_2
implements adi_1 {
    private static final ctb_2 nJC = new ctb_2();
    public static final String nJD = "cosmeticPresetsWindow";
    private final alx_2 nJE = string -> {
        if (string.equals("cosmeticPresetsDialog")) {
            aue_0.cVJ().b(nJC);
        }
    };
    private boolean iNr = false;
    private bhJ kxv;
    private final Map<fm_1, Set<Integer>> nJF = new EnumMap<fm_1, Set<Integer>>(fm_1.class);
    private final bmb nJG = new bmb();
    @Nullable
    private blP nJH;
    private boolean nJI = false;

    public static ctb_2 eQr() {
        return nJC;
    }

    private ctb_2() {
    }

    public boolean dtg() {
        return this.iNr;
    }

    public void setReadOnly(boolean bl) {
        this.iNr = bl;
    }

    public void aE(bhJ bhJ2) {
        this.kxv = bhJ2;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        bmk bmk2 = bmh.dvr().dvA();
        blR blR2 = bmh.dvr().dvz();
        switch (aam_22.d()) {
            case 16567: {
                long l = ((dae_0)aam_22).bCp();
                bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
                if (bgt_02 == null) {
                    return false;
                }
                if (bgt_02.Sn() == this.kxv.Sn()) {
                    return false;
                }
                this.kxv = bgt_02;
                bmh.dvr().dvv();
                return false;
            }
            case 18823: {
                if (!this.eQv()) {
                    return false;
                }
                blU blU2 = blU.DM(bmh.dvr().Cs());
                ctb_2.a(blU2);
                return false;
            }
            case 19348: {
                if (this.dtg()) {
                    return false;
                }
                blU blU3 = blU.a(bmk2);
                ctb_2.a(blU3);
                return false;
            }
            case 16985: {
                if (!this.eQv()) {
                    return false;
                }
                blU blU4 = blU.b(bmk2);
                ctb_2.a(blU4);
                return false;
            }
            case 16027: {
                if (!this.eQv()) {
                    return false;
                }
                String string3 = ((dae_0)aam_22).bCt();
                cjG cjG2 = new cjG(bjf_1.lM(string3));
                aue_0.cVJ().etu().d(cjG2);
                return false;
            }
            case 18030: {
                if (this.dtg()) {
                    return false;
                }
                dae_0 dae_02 = (dae_0)aam_22;
                String string4 = dae_02.bCt();
                blW blW2 = (blW)dae_02.bCv();
                cjI cjI2 = new cjI(bmk2.d());
                if (!string4.isBlank()) {
                    cjI2.ov(string4);
                }
                ctb_2.b(blW2).ifPresent(cjI2::KT);
                aue_0.cVJ().etu().d(cjI2);
                return false;
            }
            case 16999: {
                if (!this.eQv()) {
                    return false;
                }
                dae_0 dae_03 = (dae_0)aam_22;
                String string5 = dae_03.bCt();
                blW blW3 = (blW)dae_03.bCv();
                cjF cjF2 = new cjF(bmk2.d(), ctb_2.b(blW3).orElse(-1), bjf_1.lM(string5));
                aue_0.cVJ().etu().d(cjF2);
                return false;
            }
            case 16371: {
                if (!this.eQv()) {
                    return false;
                }
                fiq_2.gCw().d(fik_2.a((String string) -> {
                    cjH cjH2 = new cjH(bmk2.d());
                    aue_0.cVJ().etu().d(cjH2);
                }).l("cosmetic.preset.delete.confirmation", bmk2.getName()).vG(ccp_2.mRE.byf()).abQ(1));
                return false;
            }
            case 16809: {
                blZ blZ2 = (blZ)((dae_0)aam_22).bCv();
                bmh.dvr().DS(blZ2.BJ());
                return false;
            }
            case 18435: {
                String string6 = ((dae_0)aam_22).bCt();
                bmh.dvr().mc(string6);
                return false;
            }
            case 18114: {
                daH daH2 = (daH)aam_22;
                bmh.dvr().a(daH2.fab(), daH2.fac());
                return false;
            }
            case 19113: {
                if (this.dtg()) {
                    return false;
                }
                int n = ((dae_0)aam_22).bCo();
                ctb_2.a(n, this.kxv);
                return false;
            }
            case 19311: {
                if (!this.eQv() && !this.dtg()) {
                    return false;
                }
                boolean bl = ((dae_0)aam_22).bCu();
                if (bmk2.dva() == bl) {
                    return false;
                }
                if (this.dtg()) {
                    eks_0 eks_02 = eks_0.a(bmk2.dvM(), bmk2.bnd(), bmk2.getName(), bl);
                    bbs_2.a(eva_1.owz).ifPresent(ekr_02 -> ekr_02.a(bmk2.d(), eks_02));
                    bmh.dvr().dvu();
                } else {
                    cjI cjI3 = new cjI(bmk2.d());
                    cjI3.gx(bl);
                    aue_0.cVJ().etu().d(cjI3);
                }
                return false;
            }
            case 18040: {
                if (!this.eQv()) {
                    return false;
                }
                String string7 = blT.a(bmk2.dvM());
                eks_0 eks_03 = this.eQs();
                String string8 = blT.a(eks_03);
                this.nJG.b(bmk2.d(), string7, string8);
                return false;
            }
            case 17837: {
                if (!this.eQv()) {
                    return false;
                }
                String string9 = ((dae_0)aam_22).bCt();
                Optional<String> optional = ctb_2.qq(string9);
                optional.ifPresent(string2 -> this.nJG.b(bmk2.d(), (String)string2, string9));
                return false;
            }
            case 17045: {
                bmh.dvr().dvB();
                return false;
            }
            case 18402: {
                String string10 = ((dae_0)aam_22).bCt();
                if (string10 == null || string10.isBlank()) {
                    string10 = null;
                }
                bmh.dvr().lW(string10);
                return false;
            }
            case 16625: {
                blQ blQ2 = (blQ)((Object)((dae_0)aam_22).bCv());
                bmh.dvr().a(blQ2);
                return false;
            }
            case 16199: {
                bln_0 bln_03 = (bln_0)((dae_0)aam_22).bCv();
                bln_03.dLG();
                return false;
            }
            case 19575: {
                boolean bl = ((dae_0)aam_22).bCu();
                bmh.dvr().f(bln_02 -> bln_02.fm(bl));
                return false;
            }
            case 18422: {
                blP blP2 = (blP)((dae_0)aam_22).bCv();
                if (!blP2.duq()) {
                    return false;
                }
                blP2.gw(false);
                this.nJF.computeIfAbsent(blP2.duf(), fm_12 -> new HashSet()).add(blP2.dut());
                return false;
            }
            case 19019: {
                if (!this.eQv()) {
                    return false;
                }
                if (fyw_0.gqw().to("cosmeticPresetsPetColorationsDialog")) {
                    fyw_0.gqw().tl("cosmeticPresetsPetColorationsDialog");
                } else {
                    blR2.duA();
                    fey_2 fey_22 = (fey_2)ccj_2.g("cosmeticPresetsPetColorationsDialog", 163840L);
                    fhm_1.bH(fey_22);
                }
                return false;
            }
            case 16263: {
                if (!this.eQv()) {
                    return false;
                }
                daI daI2 = (daI)aam_22;
                bmi bmi2 = bmk2.r(daI2.duW());
                ekp_0 ekp_03 = bmi2.dvG();
                if (ekp_03 == null) {
                    return false;
                }
                blR2.duA();
                Object object = daI2.fad() == null ? (Integer)ekp_03.fxV().orElse(null) : (daI2.fad() == 0 ? null : daI2.fad());
                Object object2 = daI2.fae() == null ? (Integer)ekp_03.fxW().orElse(null) : (daI2.fae() == 0 ? null : daI2.fae());
                ekp_0 ekp_04 = new ekp_0(ekp_03.AK(), (Integer)object, (Integer)object2);
                if (ekp_04.equals(ekp_03)) {
                    return false;
                }
                bmi2.e(ekp_04);
                cjK cjK2 = cjK.a(bmk2.d(), ekt_0.f(ekp_04), daI2.duW());
                aue_0.cVJ().etu().d(cjK2);
                this.nJG.a(bmk2.d(), daI2.duW(), ekp_04, ekp_03);
                return false;
            }
            case 17427: {
                bmi bmi3 = (bmi)((dae_0)aam_22).bCv();
                if (bmi3.bqr()) {
                    bmh.dvr().dvD();
                } else {
                    bmh.dvr().q(bmi3.duf());
                }
                return false;
            }
            case 18022: {
                if (!this.eQv()) {
                    return false;
                }
                if (bmk2.d() == -1) {
                    return false;
                }
                blP blP3 = (blP)((dae_0)aam_22).bCv();
                fm_1 fm_13 = blP3.duf();
                bmi bmi4 = bmk2.r(fm_13);
                if (bmi4.DW(blP3.dut())) {
                    return false;
                }
                ekp_0 ekp_05 = ctb_2.a(fm_13, blP3.dus());
                this.nJG.a(bmk2.d(), fm_13, blP3.dus(), ekp_05);
                return false;
            }
            case 18203: {
                if (!this.eQv()) {
                    return false;
                }
                int n = bmh.dvr().Cs();
                this.nJH = (blP)((dae_0)aam_22).bCv();
                cjG cjG3 = new cjG(blU.DL(n));
                aue_0.cVJ().etu().d(cjG3);
                return false;
            }
            case 19840: {
                ekp_0 ekp_06;
                fm_1 fm_14;
                if (!this.eQv()) {
                    return false;
                }
                if (bmk2.d() == -1) {
                    return false;
                }
                dae_0 dae_04 = (dae_0)aam_22;
                if (dae_04.bCv() instanceof blP) {
                    fm_14 = ((blP)dae_04.bCv()).duf();
                    ekp_06 = ((blP)dae_04.bCv()).dus();
                } else if (dae_04.bCv() instanceof bmi) {
                    fm_14 = ((bmi)dae_04.bCv()).duf();
                    ekp_06 = ((bmi)dae_04.bCv()).dvG();
                } else {
                    return false;
                }
                if (ekp_06 == null) {
                    return false;
                }
                Optional<ekp_0> optional = ctb_2.b(fm_14, ekp_06.AK());
                optional.ifPresent(ekp_02 -> this.nJG.a(bmk2.d(), fm_14, (ekp_0)ekp_02));
                return false;
            }
            case 19572: {
                int n;
                if (this.dtg()) {
                    return false;
                }
                bmi bmi5 = (bmi)((dae_0)aam_22).bCv();
                boolean bl = bmi5.dvI();
                if (bl || bmi5.dvG() == null) {
                    bmi5.gy(false);
                    n = -1;
                } else {
                    bmi5.gy(true);
                    for (bmi bmi6 : bmk2.dvP()) {
                        if (bmi6.duf() == bmi5.duf()) continue;
                        bmi6.gy(false);
                    }
                    n = bmi5.dvH();
                }
                ctb_2.eG(bmk2.d(), n);
                return false;
            }
            case 18720: {
                if (!this.eQv()) {
                    return false;
                }
                Optional<bmc> optional = this.nJG.DO(bmk2.d());
                optional.ifPresent(bmc2 -> {
                    switch (bmc2.dvh()) {
                        case iyG: {
                            if (bmc2.dvj() != null) {
                                ctb_2.a(bmc2.duW(), bmc2.dvj());
                                break;
                            }
                            ctb_2.b(bmc2.duW(), bmc2.dvi().AK());
                            break;
                        }
                        case iyH: {
                            ctb_2.a(bmc2.duW(), bmc2.dvj());
                            break;
                        }
                        case iyI: {
                            ctb_2.qq(bmc2.dvk());
                        }
                    }
                });
                return false;
            }
            case 17956: {
                if (!this.eQv()) {
                    return false;
                }
                Optional<bmc> optional = this.nJG.DP(bmk2.d());
                optional.ifPresent(bmc2 -> {
                    if (bmc2.dvh() == bme.iyG) {
                        ctb_2.a(bmc2.duW(), bmc2.dvi());
                    } else if (bmc2.dvh() == bme.iyH) {
                        ctb_2.b(bmc2.duW(), bmc2.dvj().AK());
                    } else if (bmc2.dvh() == bme.iyI) {
                        ctb_2.qq(bmc2.dvl());
                    }
                });
                return false;
            }
            case 17244: {
                dae_0 dae_05 = (dae_0)aam_22;
                if (dae_05.bCv() instanceof abi_1) {
                    blR2.a((abi_1)dae_05.bCv());
                } else {
                    blR2.DK(dae_05.bCo());
                }
                return false;
            }
            case 18149: {
                blR2.duw();
                return false;
            }
            case 19893: {
                boolean bl = ((dae_0)aam_22).bCu();
                if (bl == blR2.dux()) {
                    return false;
                }
                blR2.duy();
                return false;
            }
            case 18211: {
                boolean bl = ((dae_0)aam_22).bCu();
                if (bl == blR2.duz()) {
                    return false;
                }
                blR2.duC();
                return false;
            }
            case 17630: {
                if (((dae_0)aam_22).bCu() == blR2.duD()) {
                    return false;
                }
                blR2.duG();
                return false;
            }
            case 18342: {
                if (((dae_0)aam_22).bCu() == blR2.duH()) {
                    return false;
                }
                blR2.duK();
                return false;
            }
            case 19828: {
                blP blP4 = (blP)((dae_0)aam_22).bCv();
                ctb_2.k(blP4);
                return false;
            }
        }
        return true;
    }

    @Nullable
    private static ekp_0 a(@NotNull fm_1 fm_12, @NotNull ekp_0 ekp_02) {
        bmk bmk2 = bmh.dvr().dvA();
        fb_2 fb_22 = ekt_0.f(ekp_02);
        bmi bmi2 = bmk2.r(fm_12);
        ekp_0 ekp_03 = bmi2.dvG();
        bmi2.e(ekp_02);
        bmh.dvr().p(fm_12).DI(ekp_02.AK());
        if (bjf_1.a(fm_12)) {
            bmh.dvr().p(fm_12).y(ekp_02.AK());
            if (fm_12 == fm_1.pv) {
                bmh.dvr().dvz().duA();
            } else if (fm_12 == fm_1.pu) {
                bmh.dvr().dvz().duE();
            } else if (fm_12 == fm_1.pz) {
                bmh.dvr().dvz().duI();
            }
        }
        bmk2.dvN();
        cjK cjK2 = cjK.a(bmk2.d(), fb_22, fm_12);
        aue_0.cVJ().etu().d(cjK2);
        if (bmk2.bnd() == -1 && bjf_1.l(fm_12) || bmi2.dvI() && bmi2.zT() == 1) {
            ctb_2.eG(bmk2.d(), ekp_02.AK());
        }
        return ekj_0.z(fm_12) ? null : ekp_03;
    }

    private static Optional<ekp_0> b(@NotNull fm_1 fm_12, int n) {
        bmk bmk2 = bmh.dvr().dvA();
        fb_2 fb_22 = fb_2.AQ().cv(n).AW();
        bmi bmi2 = bmk2.r(fm_12);
        if (!bmi2.aaz()) {
            return Optional.empty();
        }
        Optional<ekp_0> optional = bmi2.DU(n);
        bmh.dvr().p(fm_12).DJ(n);
        bmi2.DV(n);
        if (bjf_1.a(fm_12)) {
            bmh.dvr().p(fm_12).y(null);
        }
        bmk2.dvN();
        cjK cjK2 = cjK.b(bmk2.d(), fb_22, fm_12);
        aue_0.cVJ().etu().d(cjK2);
        if (bmi2.dvI()) {
            if (!bmi2.aaz()) {
                ctb_2.eG(bmk2.d(), -1);
            } else if (bmi2.dvH() != bmk2.bnd()) {
                ctb_2.eG(bmk2.d(), bmi2.dvH());
            }
        }
        return optional;
    }

    private eks_0 eQs() {
        EnumMap<fm_1, List<ekp_0>> enumMap = new EnumMap<fm_1, List<ekp_0>>(fm_1.class);
        for (bln_0 object2 : bmh.dvr().dcb()) {
            List<blP> n = object2.due();
            if (GC.aNJ() < 1.0f / (float)(n.size() + 1)) continue;
            GC.h(n).ifPresent(blP2 -> {
                ekp_0 ekp_02 = switch (object2.duf()) {
                    case fm_1.pv, fm_1.pu -> {
                        Integer var4_3 = bjf_1.Dj(blP2.dut()).flatMap(GC::f).orElse(null);
                        Integer var5_4 = bjf_1.Dk(blP2.dut()).flatMap(GC::f).orElse(null);
                        yield new ekp_0(blP2.dut(), var4_3, var5_4);
                    }
                    default -> blP2.dus();
                };
                enumMap.put(object2.duf(), List.of(ekp_02));
            });
        }
        bmk bmk2 = bmh.dvr().dvA();
        List<fm_1> list = enumMap.keySet().stream().filter(bjf_1::l).toList();
        int n = GC.h(list).map(enumMap::get).map(List::getFirst).map(ekp_0::AK).orElse(-1);
        boolean bl = GC.aNI();
        this.nJI = true;
        eks_0 eks_02 = bmk2.dvM().b(enumMap, n);
        cjJ cjJ2 = new cjJ(bmk2.d(), ekt_0.f(eks_02));
        aue_0.cVJ().etu().d(cjJ2);
        ctb_2.eG(bmk2.d(), n);
        if (bl != eks_02.dva()) {
            cjI cjI2 = new cjI(bmk2.d());
            cjI2.gx(bl);
            aue_0.cVJ().etu().d(cjI2);
        }
        return eks_02;
    }

    private static Optional<String> qq(String string) {
        bmk bmk2 = bmh.dvr().dvA();
        Optional<eks_0> optional = blT.lY(string);
        if (optional.isEmpty()) {
            aPd.e("cosmetic.preset.code.invalid", new Object[0]);
            return Optional.empty();
        }
        eks_0 eks_02 = optional.get();
        ctb_2.e(eks_02);
        int n = bmk2.d();
        cjJ cjJ2 = new cjJ(n, ekt_0.f(eks_02));
        aue_0.cVJ().etu().d(cjJ2);
        if (bmk2.bnd() != -1) {
            Optional<bmi> optional2 = bmk2.Ea(bmk2.bnd());
            if (optional2.isEmpty()) {
                ctb_2.eG(bmk2.d(), -1);
            } else {
                fm_1 fm_12 = optional2.get().duf();
                List<ekp_0> list = eks_02.fye().get((Object)fm_12);
                if (list != null && !list.isEmpty()) {
                    ctb_2.eG(bmk2.d(), list.get(0).AK());
                } else {
                    ctb_2.eG(bmk2.d(), -1);
                }
            }
        }
        return Optional.of(blT.a(bmk2.dvM()));
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        fyw_0.gqw().a(this.nJE);
        fyw_0.gqw().d("wakfu.cosmeticPresets", cee_2.class);
        aie_0.cfn().bmE().a(bma.iyq, true);
        fse_1.gFu().f("cosmeticPresets", bmh.dvr());
        if (this.kxv == null) {
            this.kxv = aue_0.cVJ().cVK();
        }
        bmh.dvr().bkZ();
        this.nJF.clear();
        this.nJH = null;
        if (this.dtg()) {
            bmh.dvr().DS(Integer.MAX_VALUE);
        }
        fey_2 fey_22 = (fey_2)ccj_2.g("cosmeticPresetsDialog", 32768L);
        fhm_1.bJ(fey_22);
        fse_1.gFu().b("characterSheet", this.kxv, "cosmeticPresetsDialog");
        cAY.eHc().nP(600012L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bmh.dvr().clean();
        fse_1.gFu().b("characterSheet", (Object)null, "cosmeticPresetsDialog");
        fyw_0.gqw().tl("cosmeticPresetEditionDialog");
        fyw_0.gqw().tl("cosmeticPresetsPetColorationsDialog");
        fyw_0.gqw().tl("cosmeticPresetsDialog");
        fyw_0.gqw().b(this.nJE);
        fyw_0.gqw().tc("wakfu.cosmeticPresets");
        aie_0.cfn().bmE().a(bma.iyq);
        this.eQt();
        fse_1.gFu().vX("cosmeticPresets");
        fse_1.gFu().vX("cosmeticPresetEdition");
        this.iNr = false;
        this.kxv = null;
        cAY.eHc().nP(600013L);
    }

    private void eQt() {
        this.nJF.forEach((fm_12, set) -> {
            if (set.isEmpty()) {
                return;
            }
            bjf_1.a(fm_12, set);
        });
        this.nJF.clear();
    }

    private static void a(blU blU2) {
        if (fyw_0.gqw().to("cosmeticPresetEditionDialog")) {
            return;
        }
        fse_1.gFu().f("cosmeticPresetEdition", blU2);
        ccj_2.g("cosmeticPresetEditionDialog", 33024L);
    }

    public static void a(int n, bhJ bhJ2) {
        if (!ctb_2.aF(bhJ2)) {
            return;
        }
        Optional optional = bbs_2.a(eva_1.owz);
        if (optional.isEmpty()) {
            return;
        }
        if (((ekr_0)optional.get()).Qu(n).isEmpty()) {
            return;
        }
        boolean bl = ((ekr_0)optional.get()).C(n, bhJ2.Sn());
        cjE cjE2 = new cjE(n, bhJ2.Sn(), !bl);
        aue_0.cVJ().etu().d(cjE2);
    }

    public void MG(int n) {
        if (bmh.dvr().dvA().d() == n) {
            bmh.dvr().dvx();
            if (this.nJI) {
                blR blR2 = bmh.dvr().dvz();
                blR2.duA();
                blR2.duE();
                blR2.duI();
                this.nJI = false;
            }
        }
    }

    public static void MH(int n) {
        if (bmh.dvr().dvA().d() == n) {
            bmh.dvr().o(() -> bmh.dvr().dvx());
        }
    }

    private static void k(blP blP2) {
        if (!bjf_1.a(blP2.duf())) {
            return;
        }
        if (!bmh.dvr().dvA().dvL()) {
            return;
        }
        blR blR2 = bmh.dvr().dvz();
        bln_0 bln_02 = bmh.dvr().p(blP2.duf());
        if (blR2.i(blP2)) {
            bln_02.duh();
            blR2.n(blP2.duf());
        } else {
            bln_02.y(blP2.dut());
            blR2.g(blP2);
        }
    }

    private static void eG(int n, int n2) {
        cjI cjI2 = new cjI(n);
        cjI2.KT(n2);
        aue_0.cVJ().etu().d(cjI2);
    }

    public boolean eQu() {
        if (this.nJH == null) {
            return false;
        }
        dae_0 dae_02 = new dae_0(18022);
        dae_02.D(this.nJH);
        aaw_1.bUq().h(dae_02);
        this.nJH = null;
        return true;
    }

    private static OptionalInt b(blW blW2) {
        if (blW2 == null) {
            return OptionalInt.empty();
        }
        int n = bmh.dvr().dvA().r(blW2.duW()).dvH();
        if (n == 0) {
            return OptionalInt.empty();
        }
        return OptionalInt.of(n);
    }

    private static void e(eks_0 eks_02) {
        Optional optional = bbs_2.a(eva_1.owy);
        if (optional.isEmpty()) {
            return;
        }
        ekn_0 ekn_02 = (ekn_0)optional.get();
        ArrayList arrayList = new ArrayList();
        eks_02.fye().forEach((fm_12, list2) -> {
            for (ekp_0 ekp_02 : list2) {
                if (ekn_02.a((fm_1)((Object)fm_12), ekp_02.AK())) continue;
                if (fm_12 == fm_1.pA && bmj.DZ(ekp_02.AK())) {
                    arrayList.add(bmj.DX(ekp_02.AK()));
                    continue;
                }
                Object r = fgD.fXh().Vd(ekp_02.AK());
                if (r == null || ((fhc_0)r).c(fgg_0.siv) || !bgv_2.Do(ekp_02.AK())) continue;
                arrayList.add(bgv_2.Dm(ekp_02.AK()));
            }
        });
        if (arrayList.isEmpty()) {
            return;
        }
        aPd.e("cosmetic.preset.code.missing.cosmetics", String.join((CharSequence)", ", arrayList));
    }

    public boolean eQv() {
        return ctb_2.aF(this.kxv) && !this.iNr;
    }

    public static boolean aF(bhJ bhJ2) {
        return !bhJ2.djT();
    }

    public static bhJ eQw() {
        return ctb_2.nJC.kxv;
    }

    public static boolean eQx() {
        return aue_0.cVJ().c(nJC);
    }

    public static void eQy() {
        if (!bmh.dvr().dvz().dux()) {
            return;
        }
        bmh.dvr().dvz().deS();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}


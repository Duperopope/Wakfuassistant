/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectIntHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TObjectIntHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cSP
 */
public class csp_1
implements adi_1 {
    static final Logger nGQ = Logger.getLogger(csp_1.class);
    private static final csp_1 nGR = new csp_1();
    private static final String nGS = "characterColorTextEditor";
    private static final String nGT = "characterSexRadioGroup";
    private static final alx_2 nGU = string -> {
        if ("cosmeticPresetsDialog".equals(string)) {
            nGR.v(null);
        }
    };
    private boolean nGV;
    private boolean nGW;
    ArrayList<bgx_0> nGX;
    private ArrayList<bgx_0> nGY;
    private final ArrayList<bfx_2> nGZ = new ArrayList();
    private final ArrayList<bfv_2> nHa = new ArrayList();
    private final ArrayList<bfv_2> nHb = new ArrayList();
    private long aDh = -1L;
    private String aFD;
    ccc_1 lPj = ccc_1.lPl;
    bhJ lPi;
    private short iiM;
    private boolean lPk;
    private boolean nHc = false;
    @Nullable
    private Runnable nHd;
    private static final long nHe = TimeUnit.MINUTES.toMillis(1L);
    private long nHf;
    public static final String[] nHg = new String[]{"AnimEmote-Victoire", "AnimEmote-Effrayee", "AnimEmote-Bailler", "AnimEmote-Rire", "AnimEmote-Huss-Debut", "AnimEmote-Chercher", "AnimEmote-Huss-Debut", "AnimEmote-DAB"};
    public static final String nHh = "AnimStatique";
    public static final String nHi = "-BlackAndWhite";
    private fka_1 jjX;
    fax_1 nHj;
    fbz_2 nHk;
    private fbt_1 nHl;
    fbt_1 nHm;
    fbt_1 nHn;
    private fdh_1 nHo;
    private boolean nHp;
    private static final TObjectIntHashMap<eym> nHq = new TObjectIntHashMap();
    final Collection<awk_1> nHr = new ArrayList<awk_1>();

    public static csp_1 eOC() {
        return nGR;
    }

    public void db(long l) {
        this.aDh = l;
    }

    public void dm(String string) {
        this.aFD = string;
    }

    public void a(ccc_1 ccc_12) {
        this.lPj = ccc_12;
    }

    public void cx(short s) {
        this.iiM = s;
    }

    public void at(bhJ bhJ2) {
        this.lPi = bhJ2;
    }

    public void jd(boolean bl) {
        this.lPk = bl;
    }

    private static void a(bhJ bhJ2, boolean bl) {
        bhJ2.dkp();
        bhJ2.c((byte)0, false);
        bhJ2.d((byte)0, false);
        bhJ2.dkq();
        if (bl) {
            fse_1.gFu().f("characterCreation.currentDressStyleIndex", bhJ2.dlz() + 1);
            fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(bhJ2.dlz()));
            fse_1.gFu().f("characterCreation.currentHairStyleIndex", bhJ2.dlA() + 1);
            fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(bhJ2.dlA()));
            fse_1.gFu().f("characterCreation.totalDressStyleIndex", bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO()));
            fse_1.gFu().f("characterCreation.totalHairStyleIndex", bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO()));
        }
    }

    public void v(@Nullable Runnable runnable) {
        this.nHd = runnable;
    }

    @NotNull
    public static bhJ eOD() {
        bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
        if (bhJ2 == null) {
            bhJ2 = new bhJ();
            fse_1.gFu().f("characterCreation.editablePlayerInfo", bhJ2);
        }
        return bhJ2;
    }

    public ArrayList<bfx_2> eOE() {
        return this.nGZ;
    }

    private csp_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        fse_1 fse_12 = fse_1.gFu();
        bhJ bhJ2 = csp_1.eOD();
        if (aam_22 instanceof aba_2) {
            abb_2.bUA().b(this);
            if (!(this.nGV || bhJ2.bcB() != abi_1.dzm && bhJ2.bcB() != abi_1.dzk)) {
                bdj_2 bdj_22 = bhJ2.ddI();
                String string2 = bdj_22.bkI();
                if (string2.equals(bdj_22.bpT())) {
                    String string3 = csp_1.eOS();
                    this.nHj.setAnimName(string3);
                    fse_12.aT("characterCreation.editablePlayerInfo", "actorDescriptorLibrary");
                    fse_12.aT("characterCreation.editablePlayerInfo", "actorLinkage");
                } else {
                    bdj_22.dT(bdj_22.bpT());
                }
            }
            return false;
        }
        switch (aam_22.d()) {
            case 18465: {
                czc_1.b("characterCreationDialog", () -> {
                    ccz_1.etG().jc(true);
                    csm_1.eOv().kb(true);
                    aue_0.cVJ().a(ccz_1.etG());
                    aue_0.cVJ().b(ccb_1.etJ());
                });
                return false;
            }
            case 18401: {
                daq daq2 = (daq)aam_22;
                this.ePb();
                this.c(bhJ2, daq2.bCt());
                return false;
            }
            case 16424: {
                das das2 = (das)aam_22;
                this.ePb();
                bgx_0 bgx_02 = das2.eZM();
                boolean bl = das2.bCu();
                short s = bhJ2.aWP();
                if (this.a(bhJ2, bgx_02, bl)) {
                    return false;
                }
                csp_1.Mv(bjd_1.inc.r(csp_1.eOD()));
                String string4 = bjd_1.inc.t(csp_1.eOD());
                fse_1.gFu().f("characterCreation.colorizablePartDescription", string4.toUpperCase());
                if (!bl) {
                    bhJ2.a(s, bhJ2.aWO(), bhJ2.dlz());
                }
                return false;
            }
            case 17879: {
                if (this.nHp) {
                    return false;
                }
                dae_0 dae_02 = (dae_0)aam_22;
                if (this.lPj != ccc_1.lPl && !exw_0.dh(this.iiM)) {
                    return false;
                }
                this.ePb();
                int n = dae_02.bCo();
                for (bfx_2 bfx_22 : this.nGZ) {
                    if (bfx_22.d() != n) continue;
                    bfx_2 bfx_23 = (bfx_2)fse_1.gFu().vY("characterCreation.roleFilter");
                    fse_1.gFu().f("characterCreation.roleFilter", bfx_23 == bfx_22 ? null : bfx_22);
                    this.eOQ();
                }
                return false;
            }
            case 16365: {
                daq daq3 = (daq)aam_22;
                this.ePb();
                byte by = daq3.bCn();
                if (bhJ2.aWO() == by) {
                    return false;
                }
                if (this.nGV) {
                    return false;
                }
                this.ee(by);
                this.kd(true);
                return false;
            }
            case 18364: {
                dae_0 dae_03 = (dae_0)aam_22;
                Optional<bjd_1> optional = bjd_1.lL(dae_03.bCt());
                if (optional.isEmpty()) {
                    return false;
                }
                this.ePb();
                optional.get().a(bhJ2, dae_03.bCo());
                awx_2 awx_22 = new awx_2(dae_03.bCo());
                fse_12.a((aef_2)bhJ2, "actorDescriptorLibrary");
                fse_12.f("characterCreation.colorPickerHexValue", awx_22.bQk().toUpperCase());
                fse_12.f("characterCreation.colorPickerValue", awx_22);
                this.eOY();
                return false;
            }
            case 16913: {
                dae_0 dae_04 = (dae_0)aam_22;
                this.ePb();
                String string5 = dae_04.bCt();
                Optional<bjd_1> optional = bjd_1.lL(string5);
                if (optional.isEmpty()) {
                    return false;
                }
                optional.get().s(bhJ2);
                fse_12.a((aef_2)bhJ2, "actorDescriptorLibrary");
                if (string5.equals(cdz_2.getColorizablePartName())) {
                    csp_1.Mv(optional.get().r(bhJ2));
                }
                this.eOY();
                return false;
            }
            case 16216: {
                this.ePb();
                fim_2 fim_22 = string -> {
                    bhJ2.d((byte)0, true);
                    fse_1.gFu().f("characterCreation.currentHairStyleIndex", 1);
                    fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.getFirst());
                    bhJ2.c((byte)0, true);
                    fse_1.gFu().f("characterCreation.currentDressStyleIndex", 1);
                    fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.getFirst());
                    for (bjd_1 bjd_13 : bjd_1.values()) {
                        bjd_13.s(bhJ2);
                    }
                    fse_12.a((aef_2)bhJ2, "actorDescriptorLibrary", "hairAvailability", "skinAvailability", "pupilAvailability");
                    String string2 = cdz_2.getColorizablePartName();
                    Optional<bjd_1> optional = bjd_1.lL(string2);
                    optional.ifPresent(bjd_12 -> csp_1.Mv(bjd_12.r(bhJ2)));
                    this.eOY();
                };
                fiq_2.gCw().d(fik_2.a(fim_22).l("characterCreation.question.reset", new Object[0]).vG(ccp_2.mRE.byf()));
                return false;
            }
            case 19253: {
                dae_0 dae_05 = (dae_0)aam_22;
                Optional<bjd_1> optional = bjd_1.lL(dae_05.bCt());
                if (optional.isEmpty()) {
                    return false;
                }
                this.ePb();
                int n = bft_2.dgq();
                optional.get().a(bhJ2, n);
                fse_12.a((aef_2)bhJ2, "actorDescriptorLibrary");
                csp_1.Mv(n);
                this.eOY();
                return false;
            }
            case 18420: {
                this.ePb();
                int n = bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO());
                byte by = (byte)fse_1.gFu().dq("characterCreation.currentHairStyleIndex");
                by = (byte)(by + 1);
                if (by > n) {
                    by = 1;
                }
                bhJ2.d((byte)(by - 1), true);
                fse_1.gFu().f("characterCreation.currentHairStyleIndex", by);
                fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(by - 1));
                this.eOY();
                return false;
            }
            case 19560: {
                this.ePb();
                int n = bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO());
                byte by = (byte)fse_1.gFu().dq("characterCreation.currentHairStyleIndex");
                by = (byte)(by - 1);
                if (by <= 0) {
                    by = (byte)n;
                }
                bhJ2.d((byte)(by - 1), true);
                fse_1.gFu().f("characterCreation.currentHairStyleIndex", by);
                fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(by - 1));
                this.eOY();
                return false;
            }
            case 17282: {
                this.ePb();
                int n = bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO());
                byte by = (byte)fse_1.gFu().dq("characterCreation.currentDressStyleIndex");
                by = (byte)(by + 1);
                if (by > n) {
                    by = 1;
                }
                bhJ2.c((byte)(by - 1), true);
                fse_1.gFu().f("characterCreation.currentDressStyleIndex", by);
                fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(by - 1));
                bhJ2.dpm();
                fse_1.gFu().a((aef_2)bhJ2, "hairAvailability", "skinAvailability", "pupilAvailability");
                this.eOY();
                return false;
            }
            case 19188: {
                this.ePb();
                int n = bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO());
                byte by = (byte)fse_1.gFu().dq("characterCreation.currentDressStyleIndex");
                by = (byte)(by - 1);
                if (by <= 0) {
                    by = (byte)n;
                }
                bhJ2.c((byte)(by - 1), true);
                fse_1.gFu().f("characterCreation.currentDressStyleIndex", by);
                fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(by - 1));
                bhJ2.dpm();
                fse_1.gFu().a((aef_2)bhJ2, "hairAvailability", "skinAvailability", "pupilAvailability");
                this.eOY();
                return false;
            }
            case 18920: {
                boolean bl;
                boolean bl2;
                this.ePb();
                if (this.lPj == ccc_1.lPm) {
                    bl2 = exw_0.dj(this.iiM);
                    bl = exw_0.di(this.iiM);
                } else {
                    bl2 = true;
                    bl = true;
                }
                dar dar2 = (dar)aam_22;
                if (dar2.eZK()) {
                    csp_1.b(bhJ2, bl2, bl, fse_12);
                }
                if (dar2.eZL()) {
                    csp_1.a(bhJ2, bl2, bl, fse_12);
                }
                this.eOY();
                return false;
            }
            case 22621: {
                ccz_1.etG().jc(true);
                aue_0.cVJ().a(ccz_1.etG());
                aue_0.cVJ().b(ccb_1.etJ());
                crh_2.eML().bCj();
                ccz_1.etG().b(aam_22);
                return false;
            }
            case 18826: {
                dae_0 dae_06 = (dae_0)aam_22;
                bfv_2 bfv_22 = (bfv_2)dae_06.bCv();
                byte by = bfv_22.deO();
                this.ePb();
                bhJ2.d(by, true);
                fse_1.gFu().f("characterCreation.currentHairStyleIndex", by + 1);
                fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(by));
                this.eOY();
                return false;
            }
            case 19111: {
                dae_0 dae_07 = (dae_0)aam_22;
                bfv_2 bfv_23 = (bfv_2)dae_07.bCv();
                byte by = bfv_23.deO();
                this.ePb();
                byte by2 = bhJ2.dlz();
                bhJ2.c(by, true);
                bhJ2.a(bhJ2.aWP(), bhJ2.aWO(), by2);
                this.aC(bhJ2);
                fse_1.gFu().f("characterCreation.currentDressStyleIndex", by + 1);
                fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(by));
                int n = fse_1.gFu().dq("characterCreation.currentHairStyleIndex");
                fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(n - 1));
                this.eOY();
                return false;
            }
        }
        return true;
    }

    private static void a(bhJ bhJ2, boolean bl, boolean bl2, fse_1 fse_12) {
        int n = bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO());
        byte by = bl ? (byte)GC.mR(n) : bhJ2.dlz();
        int n2 = bl2 ? bft_2.dgq() : bhJ2.dph().sI();
        int n3 = bl2 ? bft_2.dgq() : bhJ2.dph().sK();
        int n4 = bl2 ? bft_2.dgq() : bhJ2.dph().sM();
        int n5 = bl2 ? bft_2.dgq() : bhJ2.dph().sO();
        int n6 = bl2 ? bft_2.dgq() : bhJ2.dph().sQ();
        int n7 = bl2 ? bft_2.dgq() : bhJ2.dph().sS();
        bhJ2.c(by, true);
        fse_1.gFu().f("characterCreation.currentDressStyleIndex", by + 1);
        fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(by));
        bhJ2.a(arx_1.cTB, n2, true);
        bhJ2.a(arx_1.cTC, n3, true);
        bhJ2.a(arx_1.cTD, n4, true);
        bhJ2.a(arx_1.cTE, n5, true);
        bhJ2.a(arx_1.cTF, n6, true);
        bhJ2.a(arx_1.cTG, n7, true);
        fse_12.a((aef_2)bhJ2, "actorDescriptorLibrary", "skinAvailability");
        String string = cdz_2.getColorizablePartName();
        Optional<bjd_1> optional = bjd_1.lL(string);
        optional.ifPresent(bjd_12 -> csp_1.Mv(bjd_12.r(bhJ2)));
    }

    private static void b(bhJ bhJ2, boolean bl, boolean bl2, fse_1 fse_12) {
        int n = bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO());
        byte by = bl ? (byte)GC.mR(n) : bhJ2.dlA();
        int n2 = bl2 ? bft_2.dgq() : bhJ2.dph().sC();
        int n3 = bl2 ? bft_2.dgq() : bhJ2.dph().sE();
        int n4 = bl2 && bft_2.dgp().n(bhJ2.dfW().aWP(), bhJ2.aWO(), bhJ2.dlz()) ? bft_2.dgq() : bhJ2.dph().sG();
        bhJ2.d(by, true);
        fse_1.gFu().f("characterCreation.currentHairStyleIndex", by + 1);
        fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(by));
        bhJ2.v(n2, true);
        bhJ2.w(n3, true);
        bhJ2.x(n4, true);
        fse_12.a((aef_2)bhJ2, "actorDescriptorLibrary", "hairAvailability", "pupilAvailability");
    }

    public static void Mv(int n) {
        awx_2 awx_22 = new awx_2(n);
        fse_1.gFu().f("characterCreation.colorPickerValue", awx_22);
        fse_1.gFu().f("characterCreation.colorPickerHexValue", awx_22.bQk().toUpperCase());
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        if (fhs_22 == null) {
            return;
        }
        fdu_1 fdu_12 = (fdu_1)fhs_22.uH(nGS);
        if (fdu_12 == null) {
            return;
        }
        fdu_12.setText(awx_22.bQk().toUpperCase());
    }

    private boolean a(bhJ bhJ2, bgx_0 bgx_02, boolean bl) {
        eym eym2 = bgx_02.dfW();
        if (bhJ2.dfW() == eym2) {
            return true;
        }
        if (this.nGV) {
            return true;
        }
        if (!bgx_02.isEnabled()) {
            return true;
        }
        if (bgx_02 instanceof csv_2) {
            bgx_0 bgx_03 = null;
            while (bgx_03 == null || bgx_03.dfW() == bhJ2.dfW()) {
                bgx_03 = this.nGX.get(this.b(this.lPj));
                nGQ.error((Object)bgx_03.dfW().name());
            }
            this.a(bgx_03, false);
        } else {
            this.a(bgx_02, bl);
        }
        this.eOG();
        return false;
    }

    public ccc_1 eOF() {
        return this.lPj;
    }

    private boolean eOG() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        csp_1.aD(csp_1.eOD());
        if (fhs_22 == null) {
            return true;
        }
        fdv_1 fdv_12 = (fdv_1)fhs_22.uH("nameHelpTextEditor");
        fhw_2.gAL().s(fdv_12);
        cAY.eHc().a(600012L, false, 600);
        this.eOW();
        this.ok(0L);
        return false;
    }

    void a(bhJ bhJ2, byte by) {
        this.nGW = false;
        if (by == 1 && !fse_1.gFu().dp("characterCreation.femaleEnabled")) {
            by = 0;
            this.nGW = true;
        }
        if (bhJ2.aWO() == by) {
            return;
        }
        byte by2 = bhJ2.aWO();
        csp_1.b(bhJ2, by);
        this.aC(bhJ2);
        fse_1.gFu().f("characterCreation.currentDressStyleIndex", bhJ2.dlz() + 1);
        fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(bhJ2.dlz()));
        fse_1.gFu().f("characterCreation.currentHairStyleIndex", bhJ2.dlA() + 1);
        fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(bhJ2.dlA()));
        fse_1.gFu().f("characterCreation.totalDressStyleIndex", bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO()));
        fse_1.gFu().f("characterCreation.totalHairStyleIndex", bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO()));
        this.ed(by);
        bhJ2.a(bhJ2.aWP(), by2, bhJ2.dlz());
        this.eOY();
    }

    private void c(bhJ bhJ2, String string) {
        cAY.eHc().nP(600003L);
        bhJ2.setName(string);
        crh_2.eML().cB(true).g(aum_0.cWf().c("createCharacter.progress", new Object[0]), 0);
        cye_0 cye_02 = new cye_0();
        cye_02.db(this.aDh);
        cye_02.cG(bhJ2.dfW().aWP());
        boolean bl = bft_2.dgp().n(bhJ2.aWP(), bhJ2.aWO(), bhJ2.dlz());
        dR dR2 = dR.ti().ba(bhJ2.aWO()).aP(bhJ2.dph().sC()).aQ(bhJ2.dph().sE()).aR(bl ? bhJ2.dph().sG() : -1).aY(bhJ2.dlz()).aZ(bhJ2.dlA()).aS(bhJ2.dph().sI()).aT(bhJ2.dph().sK()).aU(bhJ2.dph().sM()).aV(bhJ2.dph().sO()).aW(bhJ2.dph().sQ()).aX(bhJ2.dph().sS()).to();
        cye_02.d(dR2);
        cye_02.setName(bhJ2.getName());
        cye_02.jv(this.lPj == ccc_1.lPn);
        aue_0.cVJ().etu().d(cye_02);
        bgr_0.dmo().lJ(bhJ2.getName());
    }

    private static void b(bhJ bhJ2, byte by) {
        csp_1.c(bhJ2, by);
        bhJ2.aQ(by);
        bhJ2.dpo();
        bhJ2.dpr();
        csp_1.aD(bhJ2);
    }

    private static void c(bhJ bhJ2, byte by) {
        int n = bft_2.dgp().b(bhJ2.aWP(), by);
        bhJ2.d(bhJ2.dlA() >= n ? (byte)0 : bhJ2.dlA(), false);
        int n2 = bft_2.dgp().a(bhJ2.aWP(), by);
        bhJ2.c(bhJ2.dlz() >= n2 ? (byte)0 : bhJ2.dlz(), false);
    }

    @Override
    public long Sn() {
        return this.hashCode();
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            bfq_2.dge().dgi();
            this.ePa();
            if (this.lPj != ccc_1.lPm) {
                this.iiM = (short)127;
            }
            aue_0.cVJ().a(cyq_1.eXS());
            cvz_1.eUC();
            this.nHc = this.iiM == 127;
            fse_1.gFu().f("characterCreation.buttonText", this.eON());
            this.eOQ();
            this.eOR();
            this.nHf = 0L;
            fse_1.gFu().f("characterCreation.breedOver", (Object)null);
            fse_1.gFu().f("characterCreation.roleFilter", (Object)null);
            fse_1.gFu().f("characterCreation.randomNameActivated", csp_1.eOH());
            fse_1.gFu().f("characterCreation.enableCancel", this.lPk || this.lPj.etL());
            fse_1.gFu().f("characterCreation.enableNameChange", exw_0.dg(this.iiM));
            fse_1.gFu().f("characterCreation.enableSexChange", exw_0.df(this.iiM));
            fse_1.gFu().f("characterCreation.enableAppearanceChange", exw_0.dj(this.iiM));
            fse_1.gFu().f("characterCreation.enableColorChange", exw_0.di(this.iiM));
            fse_1.gFu().f("characterCreation.hasAnyCosmetics", csp_1.eOI());
            boolean bl2 = evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.ouZ);
            fse_1.gFu().f("characterCreation.regex", bl2 ? "[\\p{L} '\\-\\u00b7\\[\\]]+" : "[\\p{L} '\\-]+");
            fse_1.gFu().f("characterCreation.maxChars", (short)25);
            fhv_1 fhv_12 = czc_1.j("characterCreationDialog", 8192L);
            this.f(fhv_12);
            fhs_2 fhs_22 = fhv_12.getElementMap();
            this.nHm = (fbt_1)fhs_22.uH("maleImage");
            this.nHn = (fbt_1)fhs_22.uH("femaleImage");
            (this.eOJ() == 0 ? this.nHn : this.nHm).setVisible(false);
            fyw_0.gqw().a(new csq_2(this, fhv_12), true);
            this.nHj = (fax_1)fhs_22.uH("characterAEV");
            if (this.aFD != null) {
                fdv_1 fdv_12 = (fdv_1)fhs_22.uH("nameHelpTextEditor");
                fbv_2 fbv_22 = (fbv_2)fhs_22.uH("characterNameEditorText");
                fdv_12.setText(this.aFD);
                fbv_22.setVisible(false);
                this.aFD = null;
            } else {
                this.eOL();
            }
            csp_1.eOD().aQ(this.eOJ());
            this.nHo = (fdh_1)fhs_22.uH("breedTabbedContainer");
            if (this.iiM != 127 && (exw_0.di(this.iiM) || exw_0.dj(this.iiM))) {
                this.nHo.setSelectedTabIndex(1);
            }
            cdz_2.setCreateCharacterFlag(false);
            fyw_0.gqw().d("wakfu.characterCreation", cdz_2.class);
            fyw_0.gqw().d("wakfu.spellDetails", cgz_2.class);
            fyw_0.gqw().d("wakfu.itemDetails", cfg_2.class);
            cAY.eHc().nP(600012L);
            cAY.eHc().eGX();
            fyw_0.gqw().a(nGU);
            this.ePc();
        }
    }

    private static boolean eOH() {
        return auc_0.cVq().b("enableRandomCharacterName", bjz_2.dsb().dsc());
    }

    private static boolean eOI() {
        return bbs_2.a(eva_1.owy).map(ekn_02 -> {
            for (fm_1 fm_12 : ekj_0.qBp) {
                if (!bjf_1.i(fm_12) || ekn_02.D(fm_12).isEmpty()) continue;
                return true;
            }
            return false;
        }).orElse(false);
    }

    private void f(fhv_1 fhv_12) {
        this.nHk = (fbz_2)fhv_12.getElementMap().uH("breedList2");
        this.nHl = (fbt_1)fhv_12.getElementMap().uH("breedIllustration");
        this.nHk.a(new csr_1(this, fhv_12));
    }

    byte eOJ() {
        return this.lPj.etM() && this.lPi != null ? this.lPi.aWO() : (byte)0;
    }

    public void eOK() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        fbv_2 fbv_22 = (fbv_2)fhs_22.uH("characterNameEditorText");
        fbv_22.x(fsa_2.class);
        fbv_22.setVisible(false);
    }

    private void eOL() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        fbv_2 fbv_22 = (fbv_2)fhs_22.uH("characterNameEditorText");
        awx_2 awx_22 = new awx_2(awx_2.dnF);
        awx_2 awx_23 = new awx_2(awx_2.dnC);
        fbv_22.x(fsa_2.class);
        fsa_2 fsa_22 = new fsa_2(awx_22, awx_23, fbv_22, 0, 1000, -1, true, abn.cdr);
        fbv_22.a(fsa_22);
    }

    private int eOM() {
        return GC.mR(this.nGX.size() - 1);
    }

    int g(eym eym2) {
        int n = this.nGX.size();
        for (int i = 0; i < n; ++i) {
            bgx_0 bgx_02 = this.nGX.get(i);
            if (bgx_02.dfW() != eym2) continue;
            return i;
        }
        return 0;
    }

    int b(ccc_1 ccc_12) {
        int n;
        int n2 = 0;
        int n3 = this.nGX.size();
        for (n = 0; n < n3; ++n) {
            if (!this.nGX.get(n).isEnabled()) continue;
            ++n2;
        }
        if (n2 == 0) {
            return 0;
        }
        while (!this.nGX.get(n = this.eOM()).isEnabled()) {
        }
        return n;
    }

    private String eON() {
        String string = this.iiM == 127 ? (this.nHc ? "character.creation.button.change.appearance" : "create") : "recustom.change";
        return aum_0.cWf().c(string, new Object[0]);
    }

    public void eOO() {
        this.nHc = false;
        fse_1.gFu().f("characterCreation.buttonText", this.eON());
    }

    public boolean eOP() {
        return this.nHc;
    }

    private void eOQ() {
        int n;
        this.nGX = new ArrayList();
        bfo_2[] bfo_2Array = bfq_2.dge().dgj();
        for (n = 0; n < bfo_2Array.length; ++n) {
            eym eym2 = bfo_2Array[n].dfW();
            if (eyn.fhZ().contains(eym2)) continue;
            bgx_0 bgx_02 = new bgx_0(eym2);
            bgx_02.CG(nHq.get((Object)eym2));
            boolean bl = this.h(eym2);
            bgx_02.setEnabled(bl);
            this.nGX.add(bgx_02);
        }
        n = 0;
        int n2 = this.nGX.size();
        for (int i = 0; i < n2; ++i) {
            if (!this.nGX.get(i).isEnabled()) continue;
            ++n;
        }
        if (this.nGX.size() > 1) {
            csv_2 csv_22 = new csv_2(this);
            csv_22.setEnabled(n > 1);
            this.nGX.add(csv_22);
        }
        this.nGX.sort(new css_2(this));
        fse_1.gFu().f("characterCreation.breedInfoList", this.nGX);
        fse_1.gFu().f("characterCreation.breedsAvailableNumber", bfo_2Array.length);
        this.nGY = new ArrayList();
        for (int i = 0; i < bfo_2Array.length; ++i) {
            eym eym3 = bfo_2Array[i].dfW();
            if (!eyn.fhZ().contains(eym3)) continue;
            bgx_0 bgx_03 = new bgx_0(eym3);
            bgx_03.setEnabled(true);
            this.nGY.add(bgx_03);
        }
        fse_1.gFu().f("characterCreation.debugBreedInfoList", this.nGY.isEmpty() ? null : this.nGY);
    }

    private void eOR() {
        this.nGZ.clear();
        for (eyA eyA2 : eyA.values()) {
            if (eyA2 == eyA.pjJ) continue;
            this.nGZ.add(new bfx_2(eyA2));
        }
        fse_1.gFu().f("characterCreation.roleList", this.nGZ);
    }

    private boolean h(eym eym2) {
        boolean bl = exw_0.dh(this.iiM) == (this.lPi != null && this.lPi.dfW() != eym2);
        boolean bl2 = this.lPj != ccc_1.lPm || bl;
        boolean bl3 = eyn.h(eym2);
        boolean bl4 = false;
        bfx_2 bfx_22 = (bfx_2)fse_1.gFu().vY("characterCreation.roleFilter");
        if (bfx_22 != null) {
            bl4 = !eym2.fhU().contains((Object)bfx_22.dgD());
        }
        return bl3 && bl2 && !bl4;
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.aDh = -1L;
            this.aFD = null;
            this.lPj = ccc_1.lPl;
            this.nGX.clear();
            this.nHd = null;
            aue_0.cVJ().b(cyq_1.eXS());
            aue_0.cVJ().b(ctb_2.eQr());
            bbs_2.a(eva_1.owz).ifPresent(ekr_02 -> ekr_02.Qr(Integer.MAX_VALUE));
            for (awk_1 awk_12 : this.nHr) {
                awk_12.bsI();
            }
            this.nHr.clear();
            csp_1.eOD().ddI().bpI();
            bhJ bhJ2 = (bhJ)fse_1.gFu().vY("characterCreation.editablePlayerInfo");
            if (bhJ2 != null) {
                bhJ2.aZp();
            }
            fse_1.gFu().vX("characterCreation.editablePlayerInfo");
            fse_1.gFu().vX("characterCreation.breedInfoList");
            fse_1.gFu().vX("characterCreation.debugBreedInfoList");
            fse_1.gFu().vX("characterCreation.breedsAvailableNumber");
            fse_1.gFu().vX("characterCreation.currentHairStyleIndex");
            fse_1.gFu().vX("characterCreation.totalHairStyleIndex");
            fse_1.gFu().vX("characterCreation.currentDressStyleIndex");
            fse_1.gFu().vX("characterCreation.currentDressStyle");
            fse_1.gFu().vX("characterCreation.totalDressStyleIndex");
            fse_1.gFu().vX("characterCreation.breedOver");
            fse_1.gFu().vX("characterCreation.randomNameActivated");
            fse_1.gFu().vX("characterCreation.roleFilter");
            fyw_0.gqw().tl("characterCreationDialog");
            fyw_0.gqw().tl("characterCreationColorPickerDialog");
            fyw_0.gqw().tc("wakfu.characterCreation");
            abb_2.bUA().b(this);
            fyw_0.gqw().b(nGU);
            this.jjX = null;
            this.nHj = null;
            this.nHo = null;
            bjz_2.dsb().clean();
        }
    }

    private void ok(long l) {
        abb_2.bUA().b(this);
        abb_2.bUA().a(nGR, l, 0, 1L);
    }

    private static String eOS() {
        return nHg[GD.aNP().nextInt(nHg.length)];
    }

    private void a(bgx_0 bgx_02, boolean bl) {
        fse_1.gFu().f("characterCreation.femaleEnabled", true);
        bhJ bhJ2 = csp_1.eOD();
        short s = csp_1.eOD().aWP();
        byte by = csp_1.eOD().aWO();
        byte by2 = csp_1.eOD().dlz();
        if (bl && this.eOT()) {
            bhJ2.b(this.lPi.dfW());
            bhJ2.dph().a(this.lPi.dph());
            bhJ2.aQ(this.lPi.aWO());
            bhJ2.jK(this.lPi.HP());
            bhJ2.dkr();
            this.aC(bhJ2);
            fse_1.gFu().f("characterCreation.currentHairStyleIndex", this.lPi.dlA() + 1);
            fse_1.gFu().f("characterCreation.currentHairStyle", csp_1.nGR.nHa.get(this.lPi.dlA()));
            fse_1.gFu().f("characterCreation.currentDressStyleIndex", this.lPi.dlz() + 1);
            int n = bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO());
            int n2 = bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO());
            fse_1.gFu().f("characterCreation.totalDressStyleIndex", n);
            fse_1.gFu().f("characterCreation.currentDressStyle", csp_1.nGR.nHb.get(this.lPi.dlz()));
            fse_1.gFu().f("characterCreation.totalHairStyleIndex", n2);
        } else {
            csp_1.a(bhJ2, false);
            bhJ2.b(bgx_02.dfW());
            bhJ2.dpr();
            bhJ2.a(s, by, by2);
            this.a(bhJ2, this.nGW ? (byte)1 : bhJ2.aWO());
            this.aC(bhJ2);
            csp_1.a(bhJ2, true);
        }
        bhJ2.a(abi_1.dzm);
        this.nHk.setSelectedValue(bgx_02);
        btx_1 btx_12 = crm_2.eMO().eMP();
        btx_12.nE(nHi);
        btx_12.n(bfo_2.b(bgx_02.dfW()));
        this.ea(bhJ2.aWO());
        this.eOY();
    }

    private void aC(bhJ bhJ2) {
        String string;
        byte by;
        int n = bft_2.dgp().a(bhJ2.aWP(), bhJ2.aWO());
        byte by2 = bft_2.dgp().b(bhJ2.aWP(), bhJ2.aWO());
        this.nHa.clear();
        for (by = 0; by < by2; by = (byte)(by + 1)) {
            string = csp_1.d(bhJ2, by);
            this.nHa.add(new bfv_2(by, string));
        }
        this.nHb.clear();
        for (by = 0; by < n; by = (byte)(by + 1)) {
            string = csp_1.e(bhJ2, by);
            this.nHb.add(new bfv_2(by, string));
        }
        fse_1.gFu().a("characterCreation.hairStyles", this.nHa, "characterCreationDialog", true);
        fse_1.gFu().a("characterCreation.dressStyles", this.nHb, "characterCreationDialog", true);
    }

    @Nullable
    private static String d(bhJ bhJ2, byte by) {
        String string = bft_2.a(bhJ2.aWP(), bhJ2.aWO(), (short)bhJ2.dlz(), by);
        try {
            String string2 = auc_0.kG("breedHairIconPath");
            return String.format(string2, string);
        }
        catch (fu_0 fu_02) {
            nGQ.warn((Object)"Missing configuration when retrieving hair Style Icon", (Throwable)fu_02);
            return null;
        }
    }

    @Nullable
    private static String e(bhJ bhJ2, byte by) {
        String string = bft_2.d(bhJ2.aWP(), bhJ2.aWO(), by);
        try {
            String string2 = auc_0.kG("breedDressIconPath");
            return String.format(string2, string);
        }
        catch (fu_0 fu_02) {
            nGQ.warn((Object)"Missing configuration when retrieving dress Style Icon", (Throwable)fu_02);
            return null;
        }
    }

    private boolean eOT() {
        if (this.lPi == null) {
            return false;
        }
        bgx_0 bgx_02 = this.nGX.get(this.g(this.lPi.dfW()));
        return bgx_02 != null && bgx_02.isEnabled();
    }

    private void eOU() {
        fcv_1 fcv_12 = this.nHk.getSelected();
        if (fcv_12 == null) {
            return;
        }
        fhs_2 fhs_22 = fcv_12.getInnerElementMap();
        csp_1.S((fbt_1)fhs_22.uH("breedSelectionNW"));
        csp_1.S((fbt_1)fhs_22.uH("breedSelectionSW"));
        csp_1.S((fbt_1)fhs_22.uH("breedSelectionNE"));
        csp_1.S((fbt_1)fhs_22.uH("breedSelectionSE"));
    }

    private static void S(fbt_1 fbt_12) {
        awx_2 awx_22 = new awx_2(awx_2.dnF);
        fbt_12.x(fsa_2.class);
        fbt_12.setModulationColor(awx_22);
        fbt_12.x(fsx_2.class);
        fbt_12.getImageMesh().B(1.0f, 1.0f, 1.0f);
    }

    private void eOV() {
        fcv_1 fcv_12 = this.nHk.getSelected();
        if (fcv_12 == null) {
            return;
        }
        fhs_2 fhs_22 = fcv_12.getInnerElementMap();
        csp_1.T((fbt_1)fhs_22.uH("breedSelectionNW"));
        csp_1.T((fbt_1)fhs_22.uH("breedSelectionSW"));
        csp_1.T((fbt_1)fhs_22.uH("breedSelectionNE"));
        csp_1.T((fbt_1)fhs_22.uH("breedSelectionSE"));
    }

    private static void T(fbt_1 fbt_12) {
        fbt_12.x(fsx_2.class);
        fsx_2 fsx_22 = new fsx_2(Float.valueOf(0.8f), Float.valueOf(1.0f), fbt_12, 0, 300, abn.cdr, fbt_12.getImageMesh(), -1);
        fbt_12.a(fsx_22);
    }

    private static void aD(bhJ bhJ2) {
        fse_1 fse_12 = fse_1.gFu();
        fse_12.a((aef_2)bhJ2, "sex", "actorDescriptorLibrary", "actorAnimationPath", "actorLinkage", "hairDescription", "skinDescription", "pupilDescription", "hairAvailability", "skinAvailability", "pupilAvailability", "breedInfo", "characterBreedIcon", "naturalState", "spellsInventory", "skinColor", "hairColor", "pupilColor", "costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color", "elementalSpells", "activeSpells", "passiveSpells", "showcasedSpells", "skinHexColor", "hairHexColor", "pupilHexColor", "costume1HexColor", "costume2HexColor", "costume3HexColor", "costume4HexColor", "costume5HexColor", "costume6HexColor", "costume1Description", "costume2Description", "costume3Description", "costume4Description", "costume5Description", "costume6Description", "breedChartValues");
    }

    private void eOW() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("characterCreationDialog");
        if (fhs_22 == null) {
            return;
        }
        fbt_1 fbt_12 = (fbt_1)fhs_22.uH("bigBackground");
        if (fbt_12 == null) {
            return;
        }
        if (this.jjX == null) {
            this.jjX = new fka_1();
            this.jjX.aVI();
            this.jjX.setAlignment(faa_2.tLO);
            this.jjX.setX((int)this.jjX.getPosition().bVA());
            this.jjX.setY((int)(this.jjX.getPosition().bVB() + 20.0f));
            this.jjX.setLevel(1);
        }
        this.jjX.setFile(bft_2.dgp().BP(csp_1.eOD().dfW().aWP()));
        fbt_12.getAppearance().d(this.jjX);
    }

    private void ea(byte by) {
        csp_1.a(this.nHl, awx_2.dnC, awx_2.dnF);
        csp_1.a(this.nHm, awx_2.dnC, csp_1.eb(by));
        csp_1.a(this.nHn, awx_2.dnC, csp_1.ec(by));
    }

    private static axb_2 eb(byte by) {
        return by == 0 ? awx_2.dnF : awx_2.dnC;
    }

    private static axb_2 ec(byte by) {
        return by == 1 ? awx_2.dnF : awx_2.dnC;
    }

    private void ed(byte by) {
        axb_2 axb_22 = by == 1 ? awx_2.dnF : awx_2.dnC;
        axb_2 axb_23 = by == 1 ? awx_2.dnC : awx_2.dnF;
        csp_1.a(this.nHm, axb_22, axb_23);
        csp_1.a(this.nHn, axb_23, axb_22);
    }

    private static void a(fbt_1 fbt_12, axb_2 axb_22, axb_2 axb_23) {
        if (fbt_12 == null) {
            return;
        }
        awx_2 awx_22 = new awx_2(axb_22);
        awx_2 awx_23 = new awx_2(axb_23);
        fbt_12.x(fsa_2.class);
        fsa_2 fsa_22 = new fsa_2(awx_22, awx_23, fbt_12, 0, 300, 1, false, abn.cdr);
        fbt_12.a(fsa_22);
    }

    public boolean eOX() {
        return this.nGV;
    }

    private void ee(byte by) {
        this.eOZ();
        csu_2 csu_22 = new csu_2(this, by);
        csu_22.ePg();
    }

    private void eOY() {
        if (this.nHd != null) {
            this.nHd.run();
        }
    }

    private void kd(boolean bl) {
        ahk_1 ahk_12;
        this.nHp = true;
        if (bl && (ahk_12 = cAY.eHc().nP(600158L)) != null) {
            ahk_12.cI(0.5f);
        }
        abg_2.bUP().a(() -> {
            for (fcv_1 fcv_12 : this.nHk.getRenderables()) {
                fhs_2 fhs_22 = fcv_12.getInnerElementMap();
                if (fhs_22 == null) continue;
                ((fbm_1)fhs_22.uH("flippingImage")).start();
            }
            this.nHp = false;
        }, 20L, 1);
    }

    private void eOZ() {
        this.nGV = true;
        fse_1.gFu().f("characterCreation.controlsLocked", true);
    }

    void ePa() {
        this.nGV = false;
        fse_1.gFu().f("characterCreation.controlsLocked", false);
    }

    public void ePb() {
        long l = System.currentTimeMillis();
        if (this.nHf + nHe > l) {
            return;
        }
        aue_0.cVJ().etu().d(new nw_1(2, 0));
        this.nHf = l;
    }

    private void ePc() {
        bfo_2[] bfo_2Array = bfq_2.dge().dgj();
        cst_1 cst_12 = new cst_1(this, bfo_2Array);
        cst_12.start();
    }

    static {
        nHq.put((Object)eym.pie, 1);
        nHq.put((Object)eym.pib, 2);
        nHq.put((Object)eym.pig, 3);
        nHq.put((Object)eym.pij, 4);
        nHq.put((Object)eym.phZ, 5);
        nHq.put((Object)eym.pik, 6);
        nHq.put((Object)eym.pid, 7);
        nHq.put((Object)eym.pic, 8);
        nHq.put((Object)eym.phW, 9);
        nHq.put((Object)eym.pif, 10);
        nHq.put((Object)eym.phY, 11);
        nHq.put((Object)eym.pin, 12);
        nHq.put((Object)eym.pil, 13);
        nHq.put((Object)eym.pio, 14);
        nHq.put((Object)eym.pia, 15);
        nHq.put((Object)eym.phX, 16);
        nHq.put((Object)eym.pih, 17);
        nHq.put((Object)eym.pii, 18);
    }
}


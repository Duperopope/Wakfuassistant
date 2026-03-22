/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from cSb
 */
public class csb_1
extends crw_2 {
    private static final Logger nEz = Logger.getLogger(csb_1.class);
    public static final csb_1 nEA = new csb_1();
    public static final awx_2 nEB = new awx_2(21, 23, 27, 255);
    private static final awx_2 nEC = new awx_2(113, 113, 113, 255);
    private alx_2 ikv;
    private bkx_1 nED;
    private bky_1 nEE;
    private boolean ifc;

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18687: {
                dae_0 dae_02 = (dae_0)aam_22;
                String string = dae_02.bCt();
                if (BH.aU(string)) {
                    return false;
                }
                Optional<bkz_1> optional = this.nED.lR(string);
                if (optional.isEmpty()) {
                    return false;
                }
                if (optional.get().bqr()) {
                    return false;
                }
                this.nED.lT(string);
                this.a(new clf_0(string));
                return false;
            }
            case 19219: {
                daf_0 daf_02 = (daf_0)aam_22;
                if (!eju_0.sk(daf_02.getName())) {
                    return false;
                }
                if (!eju_0.sl(daf_02.ajo())) {
                    return false;
                }
                Optional<bkz_1> optional = this.nED.lR(daf_02.ajm());
                if (optional.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_12 = optional.get();
                axb_2 axb_22 = csb_1.H(daf_02.ajo(), bkz_12.dtk());
                bkz_12.g(axb_22);
                String string = csb_1.a(daf_02.getName(), bkz_12.dtk(), bkz_12.bEr());
                bkz_12.setName(string);
                fse_1.gFu().a((aef_2)bkz_12, "color", "name", "textColor");
                if (Objects.equals(daf_02.ajm(), this.nEE.getId())) {
                    this.nEE.setName(string);
                    this.nEE.setColor(axb_22);
                    fse_1.gFu().a((aef_2)this.nEE, "color", "title");
                }
                aue_0.cVJ().etu().d(new clj_0(daf_02.ajm(), string, daf_02.ajo()));
                return false;
            }
            case 19109: {
                if (this.ifc) {
                    return false;
                }
                dae_0 dae_03 = (dae_0)aam_22;
                bkz_1 bkz_13 = (bkz_1)dae_03.bCv();
                Optional<bkz_1> optional = this.nED.a(bkz_13);
                if (optional.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_14 = optional.get();
                if (bkz_14.dtk()) {
                    return false;
                }
                bkz_13.gk(false);
                fse_1.gFu().a((aef_2)bkz_13, "hovered");
                this.a(new clh_0(bkz_14.getId(), bkz_13.getId()));
                return false;
            }
            case 17110: {
                if (this.ifc) {
                    return false;
                }
                dae_0 dae_04 = (dae_0)aam_22;
                bkz_1 bkz_15 = (bkz_1)dae_04.bCv();
                Optional<bkz_1> optional = this.nED.b(bkz_15);
                if (optional.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_16 = optional.get();
                if (bkz_16.dtk()) {
                    return false;
                }
                bkz_15.gk(false);
                fse_1.gFu().a((aef_2)bkz_15, "hovered");
                this.a(new clh_0(bkz_15.getId(), bkz_16.getId()));
                return false;
            }
            case 19259: {
                if (this.ifc) {
                    return false;
                }
                dbl_0 dbl_02 = (dbl_0)aam_22;
                String string = dbl_02.bCt();
                if (string == null || string.isEmpty()) {
                    return false;
                }
                ffV ffV2 = dbl_02.getItem();
                if (ffV2 == null) {
                    return false;
                }
                Optional<bkz_1> optional = this.nED.lR(string);
                if (optional.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_17 = optional.get();
                if (bkz_17.dtk()) {
                    return false;
                }
                if (!Objects.equals(this.nEE.getId(), string) && bkz_17.isFull()) {
                    return false;
                }
                bgt_0 bgt_02 = cvo_2.daL();
                fhc_0 fhc_02 = ffV2.dOg();
                if (fhc_02.a(ffj_0.sgf) != null && !fhc_02.a(ffj_0.sgf).b(bgt_02, -1, fhc_02, bgt_02.bdV())) {
                    return false;
                }
                if (fhc_02.a(ffj_0.sgg) != null && !fhc_02.a(ffj_0.sgg).b(bgt_02, -1, fhc_02, bgt_02.bdV())) {
                    return false;
                }
                if (ffV2.fUY() != null && ffV2.fUY().fXu().fXx()) {
                    return false;
                }
                int n2 = dbl_02.getDestinationPosition();
                if (n2 < -1 || n2 >= bkz_17.ajt()) {
                    return false;
                }
                short s = dbl_02.bfd();
                if (Objects.equals(this.nEE.getId(), string)) {
                    Optional<ffV> optional2;
                    if (n2 == -1 && (optional2 = this.nEE.j(ffV2)).isPresent()) {
                        ffV ffV3 = optional2.get();
                        n2 = this.nEE.jY(ffV3.LV());
                        s = GC.cu(Math.min(s, ffV3.bfe() - ffV3.bfd()));
                    }
                    if (n2 == -1 && !this.nEE.dti()) {
                        return false;
                    }
                    if (n2 >= 0 && (optional2 = this.nEE.Dz(n2)).isPresent() && (!ffV2.n(optional2.get()) || optional2.get().fWa() <= 0)) {
                        return false;
                    }
                }
                if (s < 1) {
                    return false;
                }
                this.a(new clc_0(string, n2, ffV2.LV(), s));
                return false;
            }
            case 16385: {
                if (this.ifc) {
                    return false;
                }
                dbp_0 dbp_02 = (dbp_0)aam_22;
                List<ffV> list = dbp_02.fba();
                if (list.isEmpty()) {
                    return false;
                }
                String string = dbp_02.ajm();
                if (BH.aU(string)) {
                    return false;
                }
                Optional<bkz_1> optional = this.nED.lR(string);
                if (optional.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_18 = optional.get();
                if (bkz_18.dtk()) {
                    return false;
                }
                if (!Objects.equals(this.nEE.getId(), string)) {
                    return false;
                }
                HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
                int n3 = this.nEE.dtj();
                clg_0 clg_02 = new clg_0(string);
                for (ffV ffV4 : list) {
                    boolean bl;
                    if (!ffV4.fWi().fZt() || ffV4.dXg() || !(bl = this.nEE.k(ffV4))) continue;
                    long l = ffV4.LV();
                    short s = ffV4.bfd();
                    int n4 = -1;
                    Integer[] integerArray = this.nEE.l(ffV4);
                    if (integerArray.length > 0) {
                        boolean bl2 = false;
                        Integer[] integerArray2 = integerArray;
                        int n5 = integerArray2.length;
                        for (int i = 0; i < n5; ++i) {
                            boolean bl3;
                            int n6;
                            int n7 = integerArray2[i];
                            if (hashMap.containsKey(n7)) {
                                n6 = (Integer)hashMap.get(n7);
                            } else {
                                ffV ffV5 = this.nEE.Dz(n7).get();
                                n6 = ffV5.bfe() - ffV5.bfd();
                                hashMap.put(n7, n6);
                            }
                            boolean bl4 = bl3 = s <= GC.cu(n6);
                            if (!bl3) {
                                if (n6 == 0) continue;
                                clg_02.c(l, (short)n7, (short)n6);
                                hashMap.replace(n7, 0);
                                continue;
                            }
                            hashMap.replace(n7, n6 - s);
                            clg_02.c(l, (short)n7, s);
                            bl2 = true;
                            break;
                        }
                        if (bl2) continue;
                    }
                    if (n3 == 0) continue;
                    clg_02.c(l, (short)-1, s);
                    --n3;
                }
                this.a(clg_02);
                return false;
            }
            case 19013: {
                if (this.ifc) {
                    return false;
                }
                dae_0 dae_05 = (dae_0)aam_22;
                String string = dae_05.bCt();
                if (BH.aU(string)) {
                    return false;
                }
                Optional<bkz_1> optional = this.nED.lR(string);
                if (optional.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_19 = optional.get();
                if (bkz_19.dtk()) {
                    return false;
                }
                if (!Objects.equals(this.nEE.getId(), string)) {
                    return false;
                }
                bgx_1 bgx_12 = (bgx_1)dae_05.bCv();
                bgt_0 bgt_03 = bgx_12.dUF();
                if (bgt_03 == null) {
                    return false;
                }
                int n8 = this.nEE.ajt();
                Set<Integer> set = IntStream.range(0, n8).boxed().collect(Collectors.toSet());
                clg_0 clg_03 = new clg_0(string);
                short s = dae_05.bCq();
                for (ffV ffV6 : bgx_12.dUG()) {
                    if (!cvu_1.b(bgt_03, ffV6)) continue;
                    this.a(ffV6, s, set).ifPresent(n -> {
                        set.remove(n);
                        clg_03.c(ffV6.LV(), (short)n, ffV6.bfd());
                    });
                }
                this.a(clg_03);
                return false;
            }
            case 19868: {
                Optional<ffV> optional;
                if (this.ifc) {
                    return false;
                }
                dbl_0 dbl_03 = (dbl_0)aam_22;
                ffV ffV7 = dbl_03.getItem();
                if (ffV7 == null) {
                    return false;
                }
                String string = dbl_03.bCt();
                if (string == null || string.isEmpty()) {
                    return false;
                }
                Optional<bkz_1> optional3 = this.nED.lR(string);
                if (optional3.isEmpty()) {
                    return false;
                }
                bkz_1 bkz_110 = optional3.get();
                if (bkz_110.dtk()) {
                    return false;
                }
                if (!Objects.equals(this.nEE.getId(), string) && bkz_110.isFull()) {
                    return false;
                }
                short s = dbl_03.getDestinationPosition();
                if (s < -1 || s >= bkz_110.ajt()) {
                    return false;
                }
                if (Objects.equals(this.nEE.getId(), string) && s == -1) {
                    return false;
                }
                if (s >= 0 && (optional = this.nEE.Dz(s)).isPresent()) {
                    this.a(new clI(this.nEE.getId(), ffV7.LV(), optional.get().LV()));
                    return false;
                }
                this.a(new cld_0(this.nEE.getId(), ffV7.LV(), string, Integer.valueOf(s)));
                return false;
            }
            case 16514: {
                if (this.ifc) {
                    return false;
                }
                dbl_0 dbl_04 = (dbl_0)aam_22;
                Optional<bgt_0> optional = dbl_04.faW();
                if (optional.isEmpty()) {
                    return false;
                }
                optional.get().dno().a(dbl_04).ifPresentOrElse(bdg_02 -> this.a(new cle_0(this.nEE.getId(), ((bgt_0)optional.get()).Sn(), dbl_04.getItem().avr(), dbl_04.getItem().LV(), bdg_02.dRh().Lx(), bdg_02.dRi(), dbl_04.bfd())), () -> {
                    String string = aum_0.cWf().c("error.flea.buy.inventoryfull", new Object[0]);
                    byj_1.epo().a(byc_1.c(byh_1.lAA, string));
                });
                return false;
            }
            case 19386: {
                dae_0 dae_06 = (dae_0)aam_22;
                if (dae_06.bCt() == null) {
                    return false;
                }
                this.nED.lS(dae_06.bCt());
                this.nED.dtf();
                return false;
            }
            case 18111: {
                dae_0 dae_07 = (dae_0)aam_22;
                if (dae_07.bCt() == null) {
                    return false;
                }
                csb_1.eNE();
                this.nEE.lU(dae_07.bCt());
                this.nEE.dth();
                return false;
            }
            case 19550: {
                dae_0 dae_08 = (dae_0)aam_22;
                if (fyw_0.gqw().to("accountChestModificationsDialog")) {
                    fyw_0.gqw().tl("accountChestModificationsDialog");
                } else {
                    ccj_2.g("accountChestModificationsDialog", 33024L);
                    fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("accountChestModificationsDialog");
                    fdu_1 fdu_12 = (fdu_1)fhs_22.uH("compartmentName");
                    fdu_1 fdu_13 = (fdu_1)fhs_22.uH("compartmentColor");
                    bkz_1 bkz_111 = (bkz_1)dae_08.bCv();
                    fse_1.gFu().b("compartmentColorPickerValue", bkz_111.getColor(), "accountChestModificationsDialog");
                    fse_1.gFu().b("compartmentColorPreview", bkz_111.getColor(), "accountChestModificationsDialog");
                    fdu_12.setText(bkz_111.getName());
                    fdu_13.setText(bkz_111.getColor().bQk());
                }
                return false;
            }
        }
        return true;
    }

    private OptionalInt a(@NotNull ffV ffV2, int n, @Unmodifiable Set<Integer> set) {
        int n2 = this.nEE.ajt();
        int n3 = n;
        for (int i = 0; i < n2; ++i) {
            if (set.contains(n3)) {
                Optional<ffV> optional = this.nEE.Dz(n3);
                if (optional.isEmpty()) {
                    return OptionalInt.of(n3);
                }
                ffV ffV3 = optional.get();
                if (ffV3.n(ffV2) && ffV3.bfd() + ffV2.bfd() <= ffV3.bfe()) {
                    return OptionalInt.of(n3);
                }
            }
            n3 = (n3 + 1) % 100;
        }
        return OptionalInt.empty();
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        super.a(aye_22, bl);
        if (!bl) {
            this.ikv = string -> {
                if (string.equals("accountChestDialog")) {
                    aue_0.cVJ().b(nEA);
                }
            };
            fyw_0.gqw().a(this.ikv);
            aue_0.cVJ().b(czi_2.eYU());
            this.nEE = new bky_1();
            fse_1.gFu().f("accountChestContentView", this.nEE);
            fse_1.gFu().f("accountChestCompartmentModification", false);
            this.ifc = true;
            fey_2 fey_22 = (fey_2)ccj_2.g("accountChestDialog", 32768L);
            this.bB(fey_22);
            fyw_0.gqw().d("wakfu.accountChest", cdb_2.class);
            cAY.eHc().nP(600012L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        super.b(aye_22, bl);
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("accountChestDialog");
            fyw_0.gqw().tl("accountChestModificationsDialog");
            this.nEE = null;
            fse_1.gFu().f("accountChestContentView", (Object)null);
            this.nED = null;
            fse_1.gFu().f("accountChestCompartments", (Object)null);
            fse_1.gFu().f("accountChestCompartmentModification", false);
            fse_1.gFu().f("compartmentColorPreview", (Object)null);
            fyw_0.gqw().tc("wakfu.accountChest");
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            if (bgt_02 != null && bgt_02.dps() != null) {
                bgt_02.i(false, true);
            }
            aue_0.cVJ().a(czi_2.eYU());
            cAY.eHc().nP(600013L);
            csb_1.eNE();
            this.ifc = false;
        }
    }

    private void a(nv_0 nv_02) {
        aue_0.cVJ().etu().d(nv_02);
        this.ifc = true;
    }

    private static void eNE() {
        if (ffV.fWh().fWG() != null) {
            ffV.fWh().fWG().dRW();
        }
    }

    public void d(lt_1 lt_12) {
        if (lt_12 == null || lt_12.abn() == 0) {
            nEz.error((Object)("[Account Chest] No compartment retrieved for account " + aue_0.cVJ().cVO().xl()));
            return;
        }
        List<bkz_1> list = lt_12.abl().stream().map(csb_1::e).collect(Collectors.toList());
        list.add(new bla_1());
        list.sort((bkz_12, bkz_13) -> {
            if (bkz_12.chv() && bkz_13.chv()) {
                return Integer.compare(bkz_12.bEr(), bkz_13.bEr());
            }
            if (bkz_12.chv()) {
                return 1;
            }
            if (bkz_13.chv()) {
                return -1;
            }
            if (bkz_12.dtk() && bkz_13.dtk()) {
                return Integer.compare(bkz_12.bEr(), bkz_13.bEr());
            }
            if (bkz_12.dtk()) {
                return 1;
            }
            if (bkz_13.dtk()) {
                return -1;
            }
            return Integer.compare(bkz_12.bEr(), bkz_13.bEr());
        });
        boolean bl = evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.otm);
        this.nED = new bkx_1(list, bl);
        fse_1.gFu().f("accountChestCompartments", this.nED);
        bkz_1 bkz_14 = list.get(0);
        bkz_14.setSelected(true);
        aue_0.cVJ().etu().d(new clf_0(bkz_14.getId()));
        fse_1.gFu().a((aef_2)this.nED, "selectedCompartment");
    }

    public static void e(lt_1 lt_12) {
        if (lt_12 == null || lt_12.abn() == 0) {
            return;
        }
        lt_12.abl().stream().filter(lx_02 -> !lx_02.ajv()).filter(lx_02 -> BH.aU(lx_02.getName())).forEach(lx_02 -> aue_0.cVJ().etu().d(new clj_0(lx_02.ajm(), csb_1.h(lx_02), lx_02.ajo())));
    }

    private static bkz_1 e(lx_0 lx_02) {
        bkz_1 bkz_12 = new bkz_1(lx_02.ajm(), csb_1.h(lx_02), csb_1.g(lx_02), (short)lx_02.wp(), lx_02.ajv());
        bkz_12.rk(lx_02.ajt());
        bkz_12.DB(lx_02.ajt() - lx_02.ajr());
        return bkz_12;
    }

    public void f(@NotNull lx_0 lx_02) {
        ejt_0 ejt_02 = ejt_0.a(lx_02.ajx(), lx_02.ajt());
        this.nEE.a(ejt_02);
        this.nEE.setId(lx_02.ajm());
        this.nEE.setColor(csb_1.g(lx_02));
        this.nEE.setName(csb_1.h(lx_02));
        this.nEE.setReadOnly(lx_02.ajv());
        csb_1.eNE();
        this.nEE.dth();
        fse_1.gFu().a((aef_2)this.nEE, bky_1.isC);
        fse_1.gFu().a((aef_2)this.nED, "selectedCompartment");
    }

    public void t(String string, int n) {
        bkz_1 bkz_12;
        this.nED.t(string, n);
        Optional<bkz_1> optional = this.nED.lR(string);
        if (optional.isEmpty()) {
            return;
        }
        bkz_1 bkz_13 = optional.get();
        if (!bkz_13.dtk() || bkz_13.dtl() != 0) {
            return;
        }
        Optional<bkz_1> optional2 = this.nED.a(bkz_13);
        if (optional2.isPresent()) {
            bkz_12 = optional2.get();
        } else {
            Optional<bkz_1> optional3 = this.nED.b(bkz_13);
            if (optional3.isEmpty()) {
                return;
            }
            bkz_12 = optional3.get();
        }
        aPd.f("account.chest.compartment.removed", bkz_13.getName());
        this.nED.c(bkz_13);
        this.nED.lT(bkz_12.getId());
        this.a(new clf_0(bkz_12.getId()));
    }

    private static axb_2 g(lx_0 lx_02) {
        return csb_1.H(lx_02.ajo(), lx_02.ajv());
    }

    private static axb_2 H(String string, boolean bl) {
        if (!BH.aU(string)) {
            try {
                return awx_2.gD(string);
            }
            catch (RuntimeException runtimeException) {
                nEz.error((Object)("Error when creating color from hexa " + string), (Throwable)runtimeException);
            }
        }
        return bl ? nEC : nEB;
    }

    private static String h(lx_0 lx_02) {
        return csb_1.a(lx_02.getName(), lx_02.ajv(), lx_02.wp());
    }

    private static String a(String string, boolean bl, int n) {
        if (BH.aU(string)) {
            return aum_0.cWf().c(bl ? "account.chest.compartment.readonly.name" : "account.chest.compartment.default.name", n + 1);
        }
        return string;
    }

    public bkx_1 eNF() {
        return this.nED;
    }

    public bky_1 eNG() {
        return this.nEE;
    }

    public boolean dnj() {
        return this.ifc;
    }

    public void fY(boolean bl) {
        this.ifc = bl;
    }

    public static void a(ejv_0 ejv_02) {
        String string;
        if (ejv_02 == ejv_0.qzM) {
            string = "account.storage.result.error";
        } else if (ejv_02 == ejv_0.qzN) {
            string = "account.storage.result.maintenance";
        } else if (ejv_02 == ejv_0.qzO) {
            string = "account.chest.action.result.temporary.inventory";
        } else {
            return;
        }
        fiq_2.gCw().d(fik_2.gBZ().l(string, new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }
}


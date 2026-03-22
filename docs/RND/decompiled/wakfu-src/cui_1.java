/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import java.util.OptionalInt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from cUi
 */
public class cui_1
implements adi_1,
bex_0 {
    private static final cui_1 nLv = new cui_1();
    public static final String nLw = "enchantmentWindow";
    private final alx_2 nLx = string -> {
        if (string.equals("enchantmentDialog")) {
            aue_0.cVJ().b(nLv);
        }
    };
    private boolean nLy;
    @Nullable
    private ffV nLz;
    private bon_0 nLA;

    public static cui_1 eRw() {
        return nLv;
    }

    private cui_1() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18599: {
                this.nLA.a((bov_1)((Object)((dae_0)aam_22).bCv()));
                return false;
            }
            case 19886: {
                this.nLA.dBZ().cUQ();
                return false;
            }
            case 17490: {
                this.nLA.dBZ().a((bug_0)((dae_0)aam_22).bCv());
                return false;
            }
            case 19650: {
                this.nLA.dBZ().a((fhw_0)((Object)((dae_0)aam_22).bCv()));
                return false;
            }
            case 19559: {
                ffV ffV2 = (ffV)((dae_0)aam_22).bCv();
                if (!bej_1.aM(ffV2)) {
                    return false;
                }
                if (!bop_1.E(ffV2) || ffV2.fWs()) {
                    return false;
                }
                this.nLA.y(ffV2);
                return false;
            }
            case 18555: {
                this.nLA.y(null);
                return false;
            }
            case 16722: {
                if (this.nLA.dBW() == null) {
                    return false;
                }
                this.nLA.dBW().dAW().a((fhw_0)((Object)((dae_0)aam_22).bCv()));
                return false;
            }
            case 19615: {
                if (this.nLA.dBW() == null) {
                    return false;
                }
                this.nLA.dBW().dAW().a((bug_0)((dae_0)aam_22).bCv());
                return false;
            }
            case 16078: {
                if (this.nLA.dBW() == null) {
                    return false;
                }
                this.nLA.dBW().s((ffV)((dae_0)aam_22).bCv());
                return false;
            }
            case 17954: {
                rb_0 rb_02 = (rb_0)((Object)((dae_0)aam_22).bCv());
                if (this.nLA.dBW() == null) {
                    return false;
                }
                this.nLA.dBW().a(rb_02);
                return false;
            }
            case 17188: {
                if (this.nLA.dBW() == null) {
                    return false;
                }
                if (!this.nLA.dBW().dBa()) {
                    return false;
                }
                ffV ffV3 = this.nLA.dBU();
                ffV ffV4 = this.nLA.dBW().dAZ();
                if (ffV3 == null || ffV4 == null) {
                    return false;
                }
                if (ffV4.fVX() >= 4) {
                    fiq_2.gCw().d(fik_2.b(string -> aue_0.cVJ().etu().d(this.nLA.dBW().dBb())).l("enchantment.confirmation.maxSlotShards", new Object[0]).vG(ccp_2.mRE.byf()));
                    return false;
                }
                aue_0.cVJ().etu().d(this.nLA.dBW().dBb());
                return false;
            }
            case 19911: {
                if (!this.nLA.dBS()) {
                    return false;
                }
                cjx_0 cjx_02 = new cjx_0(this.nLA.dBU().LV(), this.nLA.dBY());
                aue_0.cVJ().etu().d(cjx_02);
                return false;
            }
            case 19039: {
                if (this.nLA.dBV() == null) {
                    return false;
                }
                for (bok_0 bok_02 : this.nLA.dBV().dBL()) {
                    bok_02.dBt();
                }
                return false;
            }
            case 18065: {
                if (this.nLA.dBV() == null) {
                    return false;
                }
                this.nLA.dBV().dBq();
                return false;
            }
            case 17753: {
                if (this.nLA.dBU() == null) {
                    return false;
                }
                if (this.nLA.dBV() == null) {
                    return false;
                }
                if (!this.nLA.dBV().dBI()) {
                    return false;
                }
                cjy_0 cjy_02 = new cjy_0(this.nLA.dBU().LV());
                List<bok_0> list = this.nLA.dBV().dBL();
                for (int i = 0; i < list.size(); ++i) {
                    if (!list.get(i).dBu()) continue;
                    cjy_02.a((byte)i, list.get(i).dBD());
                }
                aue_0.cVJ().etu().d(cjy_02);
                return false;
            }
            case 17798: {
                this.nLA.dCa().a((bug_0)((dae_0)aam_22).bCv());
                return false;
            }
            case 19256: {
                if (this.nLA.dBU() == null) {
                    return false;
                }
                boolean bl = ((dae_0)aam_22).bCu();
                this.nLA.dCa().b(this.nLA.dBU(), bl);
                return false;
            }
            case 16320: {
                this.nLA.dCa().a((bpa_0)((Object)((dae_0)aam_22).bCv()));
                return false;
            }
            case 16039: {
                int n = ((dae_0)aam_22).bCo();
                this.nLA.dCa().H(n);
                return false;
            }
            case 16180: {
                ffV ffV5 = this.nLA.dBU();
                if (ffV5 == null) {
                    return false;
                }
                OptionalInt optionalInt = this.nLA.dCa().dCs();
                if (optionalInt.isEmpty() || !this.nLA.dCa().dCw()) {
                    return false;
                }
                boolean bl = this.nLA.dCa().dCr();
                int n = fhk_0.l(ffV5, bl);
                fim_2 fim_22 = string -> {
                    cjU cjU2 = new cjU(ffV5.LV(), optionalInt.getAsInt());
                    aue_0.cVJ().etu().d(cjU2);
                };
                if (n > 0) {
                    fiq_2.gCw().d(fik_2.a(fim_22).l("enchantment.replace.sublimation.confirmation", cui_1.MU(n), cui_1.MU(optionalInt.getAsInt())));
                } else {
                    fim_22.onButtonClick(null);
                }
                return false;
            }
            case 17215: {
                ffV ffV6 = this.nLA.dBU();
                if (ffV6 == null) {
                    return false;
                }
                if (!this.nLA.dCa().dCt()) {
                    return false;
                }
                boolean bl = this.nLA.dCa().dCr();
                int n = fhk_0.l(ffV6, bl);
                fiq_2.gCw().d(new fik_2().l("enchantment.remove.sublimation.confirmation", cui_1.MU(n)).a(fil_2.gCo()).a(fil_2.gCn().c(string -> {
                    cjV cjV2 = new cjV(ffV6.LV(), bl);
                    aue_0.cVJ().etu().d(cjV2);
                })));
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bon_0 bon_02 = new bon_0(bov_1.iPD);
        bon_02.a(this.nLA);
        this.nLA = bon_02;
        fse_1.gFu().f("enchantment", this.nLA);
        bey_0.dTc().a(this);
        this.eRx();
        if (this.nLz != null && bej_1.aM(this.nLz)) {
            this.nLA.y(this.nLz);
        }
        this.nLz = null;
    }

    private void eRx() {
        fyw_0.gqw().d("wakfu.enchantment", cex_1.class);
        aie_0.cfn().bmE().a(bou_1.iPC, true);
        fyw_0.gqw().a(this.nLx);
        ccj_2.g("enchantmentDialog", 32768L);
        cAY.eHc().nP(600012L);
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (bl) {
            return;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 != null && bgt_02.dps() != null && bgt_02.dps().dsm() == 30) {
            bgt_02.dnY();
        }
        fse_1.gFu().f("enchantment", (Object)null);
        bey_0.dTc().b(this);
        this.eRy();
    }

    private void eRy() {
        fyw_0.gqw().tc("wakfu.enchantment");
        aie_0.cfn().bmE().a(bou_1.iPC);
        fyw_0.gqw().b(this.nLx);
        fyw_0.gqw().tl("enchantmentDialog");
        cAY.eHc().nP(600013L);
    }

    @Nullable
    public ffV dBU() {
        return this.nLA.dBU();
    }

    public void dBN() {
        this.nLA.dBN();
    }

    public void a(@NotNull ffV ffV2, @NotNull fhi_0 fhi_02, @NotNull rb_0 rb_02) {
        if (rb_02 == rb_0.bjq) {
            this.nLA.z(ffV2);
            bow_0.dAU();
        } else {
            this.nLA.A(ffV2);
            bow_0.a(ffV2.eAZ(), fhi_02);
        }
    }

    public void a(@NotNull ffV ffV2, @NotNull fhi_0 fhi_02, @NotNull rc_0 rc_02) {
        this.nLA.A(ffV2);
        bow_0.a(ffV2.eAZ(), fhi_02, rc_02);
    }

    public void c(@NotNull ffV ffV2, @NotNull fhi_0 fhi_02) {
        this.nLA.B(ffV2);
        bow_0.b(fhi_02, ffV2.eAZ());
    }

    public void c(@NotNull ffV ffV2, fhr_0 fhr_02) {
        this.nLA.a(ffV2, false, fhr_02 != fhr_0.sqz);
        bow_0.a(fhr_02);
    }

    public void d(@NotNull ffV ffV2, fhr_0 fhr_02) {
        this.nLA.a(ffV2, true, fhr_02 != fhr_0.sqz);
        bow_0.a(fhr_02);
    }

    public void C(@NotNull ffV ffV2) {
        this.nLA.C(ffV2);
    }

    @Override
    public void d(@Nullable Sl sl) {
        RT rT;
        boolean bl = true;
        if (sl instanceof Sn) {
            rT = ((Sn)sl).bfD();
            if (rT instanceof ffV && !((ffV)rT).dOg().fbT()) {
                bl = false;
            }
        } else {
            rT = null;
        }
        this.nLA.dBN();
        if (bl) {
            this.nLA.dBZ().dCb();
            if (rT != null && this.nLA.dBW() != null) {
                this.nLA.dBW().ES(rT.avr());
            }
        } else if (((ffV)rT).dCC() != null) {
            this.nLA.dCa().gL(true);
        }
        if ((sl == null || rT != null && rT.avr() == 27083) && this.nLA.dBV() != null) {
            this.nLA.dBV().dBG();
        }
    }

    public void t(@NotNull ffV ffV2) {
        this.nLA.dBZ().dCb();
        if (this.nLA.dBW() != null) {
            this.nLA.dBW().t(ffV2);
        }
    }

    private static String MU(int n) {
        String string = bgv_2.Dm(n);
        return new ahv_2().ceu().c(string).cev().c(" ").a(auc_0.cVq().a((fjm)aue_0.cVJ().cVK(), n), 32, 32, null).ceL();
    }

    public void eRz() {
        if (aue_0.cVJ().cVK().fhv() == 24) {
            return;
        }
        this.nLz = null;
        if (cui_1.eQx()) {
            this.km(true);
        } else {
            this.nLy = true;
            aue_0.cVJ().a(this);
        }
    }

    public void bC(@NotNull ffV ffV3) {
        short s = aue_0.cVJ().cVK().fhv();
        if (s == 24) {
            return;
        }
        if (!bej_1.aM(ffV3)) {
            return;
        }
        bej_1.li(ffV3.LV()).ifPresent(ffV2 -> {
            boolean bl = this.nLy = s == 30;
            if (cui_1.eQx()) {
                this.nLA.y((ffV)ffV2);
            } else {
                this.nLz = ffV2;
                aue_0.cVJ().a(this);
            }
        });
    }

    public void km(boolean bl) {
        boolean bl2 = this.nLy;
        this.nLy = bl;
        if (bl2 != bl) {
            this.nLA.dBk();
        }
    }

    public static boolean eRA() {
        return cui_1.nLv.nLy;
    }

    public static boolean eQx() {
        return aue_0.cVJ().c(nLv);
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public long Sn() {
        return 0L;
    }
}


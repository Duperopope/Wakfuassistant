/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cXx
 */
public class cxx_1
implements adi_1,
bex_0 {
    protected static final Logger nWo = Logger.getLogger(cxx_1.class);
    private static final cxx_1 nWp = new cxx_1();
    private alx_2 ikv;
    String nWq = null;
    private final TLongObjectHashMap<cxb_1> nWr = new TLongObjectHashMap();
    final Runnable nWs = new cxy_2(this);

    void eXe() {
        Object object = fse_1.gFu().aW("pet", "petDialog");
        if (object == null) {
            return;
        }
        fse_1.gFu().a((aef_2)((bjm_0)object), ((bjm_0)object).bxk());
    }

    private int d(fnl_0 fnl_02) {
        uz_0 uz_02 = fnl_02.geO().l(ue_0.bjV().bjc());
        return uz_02.f(fnl_02.geL().gfv());
    }

    public static cxx_1 eXf() {
        return nWp;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 17533: {
                bjm_0 bjm_02;
                dbo_0 dbo_02 = (dbo_0)aam_22;
                fsf_1 fsf_12 = fse_1.gFu().aX("pet", "petDialog");
                long l = -1L;
                if (fsf_12 != null && fsf_12.getValue() instanceof bjm_0) {
                    l = ((bjm_0)fsf_12.getValue()).eai().LV();
                }
                if ((bjm_02 = (bjm_0)dbo_02.dRY()) == null) {
                    nWo.error((Object)"Impossible de r\u00e9cup\u00e9rer le familier \u00e0 d\u00e9crire");
                    return false;
                }
                if (l != -1L && l != bjm_02.eai().LV()) {
                    cxx_1.c(bjm_02);
                } else {
                    String string = dbo_02.eZJ();
                    fyw_0.gqw().tl(this.nWq);
                    if (!fyw_0.gqw().to("petDialog")) {
                        String string2 = "petDialog";
                        if (string == null) {
                            fey_2 fey_22 = (fey_2)fyw_0.gqw().az("petDialog", ccj_2.pe("petDialog"));
                            fey_22.a(new cxz_1(this, fey_22, dbo_02));
                        } else {
                            fyw_0.gqw().a("petDialog", ccj_2.pe("petDialog"), this.nWq == null ? string : this.nWq, string, "petDialog");
                        }
                        cxx_1.c(bjm_02);
                        this.nWq = "petDialog";
                        cxx_1.eXf().eXg();
                    } else {
                        fyw_0.gqw().tl("petDialog");
                    }
                }
                return false;
            }
            case 18798: {
                bjg_0 bjg_02 = (bjg_0)((dae_0)aam_22).bCv();
                cxx_1.a(bjg_02);
                return false;
            }
            case 16938: {
                dck dck2 = (dck)aam_22;
                ffV ffV2 = dck2.getItem();
                if (ffV2 == null) {
                    return false;
                }
                bjm_0 bjm_03 = dck2.fbI();
                if (bjm_03 == null) {
                    return false;
                }
                this.a(bjm_03, ffV2, dck2.bfd(), false);
                return false;
            }
            case 17520: {
                bjm_0 bjm_04 = (bjm_0)((dae_0)aam_22).bCv();
                if (bjm_04.eaf() == null) {
                    return false;
                }
                int n = bjm_04.eaf().avr();
                LW lW = new LW();
                fcL.rUh.b(bbs_2.xl(), exP2 -> {
                    ffV ffV2 = exP2.dod().UK(n);
                    if (ffV2 instanceof ffV) {
                        lW.v(ffV2);
                        return false;
                    }
                    return true;
                });
                if (lW.aTx() != null) {
                    this.a(bjm_04, (ffV)lW.aTx(), (short)1, ((dae_0)aam_22).bCu());
                }
                return false;
            }
            case 19052: {
                dcl dcl2 = (dcl)aam_22;
                String string = dcl2.bCt();
                bjm_0 bjm_05 = dcl2.fbI();
                if (bYV.bkY().dB(string) && string.length() > 0 && !string.equals(bjm_05.getName())) {
                    cnv_0 cnv_02 = new cnv_0();
                    cnv_02.nb(bjm_05.eai().LV());
                    cnv_02.ou(string);
                    aue_0.cVJ().etu().d(cnv_02);
                } else {
                    aPd.e("error.chat.operationNotPermited", new Object[0]);
                }
                return false;
            }
            case 19532: {
                ama_1 ama_12 = (ama_1)aam_22;
                int n = ama_12.bCo();
                bjm_0 bjm_06 = (bjm_0)fse_1.gFu().aW("pet", "petDialog");
                if (bjm_06 == null) {
                    return false;
                }
                if (bej_1.lh(bjm_06.eai().LV()).isEmpty()) {
                    return false;
                }
                bjm_0 bjm_07 = (bjm_0)fse_1.gFu().aW("pet", "petDialog");
                if (bjm_07 == null) {
                    return false;
                }
                bjm_07.Hl(n);
                cnw_0 cnw_02 = new cnw_0();
                cnw_02.nE(bjm_06.eae());
                cnw_02.lP(n);
                aue_0.cVJ().etu().d(cnw_02);
                return false;
            }
            case 16446: {
                int n;
                dbl_0 dbl_02 = (dbl_0)aam_22;
                if (bej_1.lh(dbl_02.bCp()).isEmpty()) {
                    return false;
                }
                bjm_0 bjm_08 = (bjm_0)fse_1.gFu().aW("pet", "petDialog");
                if (bjm_08 == null) {
                    return false;
                }
                fov_0 fov_02 = bjm_08.dvo();
                if (fov_02 == null) {
                    return false;
                }
                ffV ffV3 = dbl_02.getItem();
                int n2 = n = ffV3 != null ? ffV3.avr() : fov_02.gfD();
                if (!fov_02.XK(n)) {
                    return false;
                }
                cnu_0 cnu_02 = new cnu_0();
                cnu_02.Lf(n);
                cnu_02.nE(((dae_0)aam_22).bCp());
                aue_0.cVJ().etu().d(cnu_02);
                return false;
            }
        }
        return true;
    }

    private static void a(@NotNull bjg_0 bjg_02) {
        boolean bl;
        bjg_0 bjg_03 = (bjg_0)fse_1.gFu().aW("pet", "petFeedingDialog");
        boolean bl2 = fyw_0.gqw().to("petFeedingDialog");
        boolean bl3 = bl = bjg_03 != null && bjg_03.eae() != bjg_02.eae();
        if (!bl2 || bl) {
            if (!bl2) {
                ccj_2.g("petFeedingDialog", 163840L);
                bey_0.dTc().a(nWp);
            }
            bjg_02.dZW();
            fse_1.gFu().b("pet", bjg_02, "petFeedingDialog");
        } else {
            fyw_0.gqw().tl("petFeedingDialog");
            bey_0.dTc().b(nWp);
            fse_1.gFu().b("pet", (Object)null, "petFeedingDialog");
        }
    }

    private void a(bjm_0 bjm_02, ffV ffV2, short s, boolean bl) {
        short s2;
        fnl_0 fnl_02 = bjm_02.ead();
        fov_0 fov_02 = fnl_02.geL();
        int n = ffV2.avr();
        boolean bl2 = fov_02.XL(n);
        boolean bl3 = fov_02.XF(n);
        boolean bl4 = fov_02.XG(n);
        if (!(bl2 || bl3 || bl4)) {
            aPd.e("pet.chat.feedWithBadItem", bjm_02.getName());
            return;
        }
        if (this.a(ffV2, bjm_02)) {
            ape_0.a(ezj_0.ptR);
            return;
        }
        boolean bl5 = fnp_0.a(fnl_02, n);
        if (fnp_0.i(fnl_02) && bl5) {
            aPd.e("error.feedFullHealPet", new Object[0]);
            return;
        }
        bgt_0 bgt_02 = (bgt_0)fcI.ac(aue_0.cVJ().cVK().Xi(), ffV2.LV());
        if (bgt_02 == null) {
            aPd.e("pet.feedUnauthorizedNotFromInventory", new Object[0]);
            return;
        }
        if (bgt_02.djT()) {
            aPd.e("error.impossibleDuringFight", new Object[0]);
            return;
        }
        ang_2 ang_22 = ffV2.dOg().a(ffj_0.sgj);
        if (ffV2.dOg().fUZ() instanceof bfl_1 || ffV2.adO() || ang_22 != null && !ang_22.b(bgt_02, ffV2, ffV2, bgt_02.dpy())) {
            aPd.e("pet.feedUnauthorized", new Object[0]);
            return;
        }
        fgl_0 fgl_02 = ffV2.dOg().fUZ();
        if (fgl_02 != null && fgl_02.dTl() == fgM.skQ && fnp_0.j(fnl_02)) {
            aPd.e("pet.xpItem.alreadyMaxLevel", new Object[0]);
            return;
        }
        if (bl5) {
            bfd_2 bfd_22;
            int n2 = fgl_02 != null && fgl_02.dTl() == fgM.skR ? ((bfd_22 = (bfd_2)fgl_02).dTu() < 0 ? fov_02.agM() : bfd_22.dTu()) : fov_02.XH(n);
            s2 = fov_02.agM() < fnl_02.agM() + n2 * s ? cxx_1.f(fov_02.agM(), fnl_02.agM(), n2) : s;
        } else {
            s2 = s;
        }
        if (bl) {
            this.a(bjm_02, ffV2, s2);
            return;
        }
        fiq_2.gCw().d(fik_2.a((String string) -> this.a(bjm_02, ffV2, s2)).l("question.feedPet", ffV2.getName()).vG(ccp_2.mRE.byf()).abQ(1));
    }

    private void a(bjm_0 bjm_02, ffV ffV2, short s) {
        cnx_0 cnx_02 = new cnx_0();
        cnx_02.nb(ffV2.LV());
        cnx_02.nE(bjm_02.eai().LV());
        cnx_02.Lg(s);
        aue_0.cVJ().etu().d(cnx_02);
        this.b(bjm_02, ffV2, s);
    }

    public static void b(@NotNull bjg_0 bjg_02) {
        if (fyw_0.gqw().to("petDialog") || fyw_0.gqw().to("petFeedingDialog")) {
            cxx_1.c(bjg_02);
        }
    }

    private static void c(@NotNull bjg_0 bjg_02) {
        bjg_0 bjg_03 = (bjg_0)fse_1.gFu().aW("pet", "petFeedingDialog");
        fse_1.gFu().b("pet", bjg_02, "petDialog");
        if (fyw_0.gqw().to("petFeedingDialog")) {
            bji_0 bji_02 = bjg_03 == null || bjg_03.eae() != bjg_02.eae() ? null : bjg_03.eaf();
            bjg_02.a(bji_02);
            fse_1.gFu().b("pet", bjg_02, "petFeedingDialog");
        }
    }

    private static short f(double d2, double d3, double d4) {
        return (short)Math.ceil((d2 - d3) / d4);
    }

    private boolean a(ffV ffV2, bjm_0 bjm_02) {
        return aue_0.cVJ().cVK().a(ezj_0.ptR) && (!fnp_0.b(bjm_02.eai().ead(), ffV2.avr()) || fnp_0.a(bjm_02.eai().ead(), ue_0.bjV().bjc())) && !fnp_0.a(bjm_02.eai().ead(), ffV2.avr());
    }

    private void b(bjm_0 bjm_02, ffV ffV2, short s) {
        String string;
        fnl_0 fnl_02 = bjm_02.eai().ead();
        ux_0 ux_02 = ue_0.bjV().bjc();
        bdf_1 bdf_12 = bjm_02.eak();
        fgl_0 fgl_02 = ffV2.dOg().fUZ();
        if (fnl_02.geL().XL(ffV2.avr())) {
            bdf_12.dT("AnimEmote-Effrayee");
            bdf_12.bpC();
            string = aum_0.cWf().c("pet.chat.sleeping", uc_0.k(fnl_02.geL().XM(ffV2.avr())));
        } else if (fnp_0.a(fnl_02, ffV2.avr())) {
            bfd_2 bfd_22;
            bdf_12.dT("AnimEmote-Rire");
            bdf_12.bpC();
            int n = fgl_02 != null && fgl_02.dTl() == fgM.skR ? ((bfd_22 = (bfd_2)fgl_02).dTu() < 0 ? fnl_02.geL().agM() : bfd_22.dTu() * s) : fnl_02.geL().XH(ffV2.avr()) * s;
            string = aum_0.cWf().c("pet.chat.healing", n);
        } else if (!fnp_0.b(fnl_02, ffV2.avr())) {
            bdf_12.dT("AnimEmote-Effrayee");
            bdf_12.bpC();
            string = aum_0.cWf().c("pet.chat.feedWithBadItem", bjm_02.getName());
        } else if (fnp_0.a(fnl_02, ux_02)) {
            if (fgl_02 != null && fgl_02.dTl() == fgM.skQ) {
                return;
            }
            bdf_12.dT("AnimEmote-Effrayee");
            bdf_12.bpC();
            boolean bl = aue_0.cVJ().cVK().dpL().b(evv_1.oxp);
            string = bl ? aum_0.cWf().c("pet.chat.feedNotHungry", new Object[0]) : aum_0.cWf().c("pet.chat.feedNotHungry", fnl_02.geL().a(foq_0.sLq));
        } else if (fgl_02 != null && fgl_02.dTl() == fgM.skQ) {
            bdf_12.dT("AnimEmote-Rire");
            bdf_12.bpC();
            bfe_1 bfe_12 = (bfe_1)fgl_02;
            int n = bfe_12.dTv() * fnl_02.geL().csH();
            string = aum_0.cWf().c("pet.chat.feedGood", n);
        } else {
            bdf_12.dT("AnimEmote-Rire");
            bdf_12.bpC();
            string = aum_0.cWf().c("pet.chat.feedGood", fnl_02.geL().gfw());
        }
        aPh.czg().iZ(string);
    }

    @Override
    public void d(Sl sl) {
        RT rT;
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().aW("pet", "petFeedingDialog");
        if (bjm_02 == null) {
            return;
        }
        boolean bl = true;
        if (sl instanceof Sn && (rT = ((Sn)sl).bfD()) instanceof ffV && !bjm_02.Hp(rT.avr())) {
            bl = false;
        }
        if (bl) {
            bjm_02.dZW();
        }
    }

    private String bO(ffV ffV2) {
        return "petDialog_" + ffV2.LV();
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cxa_1(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.pet", cgk_2.class);
            abg_2.bUP().a(this.nWs, 1000L, -1);
            this.kO(false);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.eXl();
            abg_2.bUP().h(this.nWs);
            this.nWq = null;
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tc("wakfu.pet");
            cdv_0.euj().e(this);
        }
    }

    public void bP(ffV ffV2) {
        if (this.nWr.contains(ffV2.LV())) {
            return;
        }
        cxb_1 cxb_12 = new cxb_1(this, ffV2);
        this.nWr.put(ffV2.LV(), (Object)cxb_12);
    }

    public void bQ(ffV ffV2) {
        if (!this.nWr.contains(ffV2.LV())) {
            return;
        }
        ffV2.ead().b((fns_0)this.nWr.get(ffV2.LV()));
        this.nWr.remove(ffV2.LV());
    }

    public void eXg() {
        abg_2.bUP().h(this.nWs);
        abg_2.bUP().a(this.nWs, 1000L, -1);
    }

    public boolean eXh() {
        if (this.nWq != null) {
            return false;
        }
        return fse_1.gFu().aW("pet", "inventoryDialog") == null;
    }

    public void eXi() {
        if (!this.eXh()) {
            return;
        }
        abg_2.bUP().h(this.nWs);
    }

    public boolean a(bjm_0 bjm_02) {
        return this.bR(bjm_02.eai());
    }

    public boolean bR(ffV ffV2) {
        if (this.nWq == null) {
            return false;
        }
        return this.nWq.contains(this.bO(ffV2));
    }

    public void eXj() {
        if (this.nWq == null) {
            return;
        }
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().aW("pet", this.nWq);
        bjm_02.dZX();
        bjm_02.eaj();
        this.eXk();
    }

    private void eXk() {
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().aW("pet", "inventoryDialog");
        if (bjm_02 == null) {
            return;
        }
        ffV ffV2 = bjm_02.eai();
        if (ffV2 == null) {
            return;
        }
        if (ffV2.dOg() == null) {
            return;
        }
        bjm_02.dZX();
        bjm_02.eaj();
    }

    public void bS(ffV ffV2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        if (this.bR(ffV2)) {
            fyw_0.gqw().tl(this.bO(ffV2));
        }
        this.eXj();
        this.kO(true);
    }

    private void kO(boolean bl) {
        this.eXl();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return;
        }
        bdl_0 bdl_02 = bgt_02.dno();
        if (bdl_02 != null) {
            for (ffV ffV3 : bdl_02.dRx()) {
                this.f(ffV3, bl);
            }
        }
        Optional<ffV> optional = bgt_02.dnP().B(bgt_02.dmL().t(ffS.sgX));
        optional.ifPresent(ffV2 -> this.f((ffV)ffV2, bl));
        Optional<ffV> optional2 = bgt_02.dnP().B(bgt_02.dmL().t(ffS.sgZ));
        optional2.ifPresent(ffV2 -> this.f((ffV)ffV2, bl));
    }

    private void f(ffV ffV2, boolean bl) {
        if (!ffV2.adO()) {
            return;
        }
        this.bP(ffV2);
        if (bl) {
            return;
        }
        fnl_0 fnl_02 = ffV2.ead();
        if (fnl_02.geO().g(fnl_02.geN())) {
            return;
        }
        if (fnl_02.agM() == 0) {
            this.bT(ffV2);
        } else if (this.d(fnl_02) > 0) {
            this.bU(ffV2);
        }
    }

    private void eXl() {
        this.nWr.forEachValue(cxb_12 -> {
            cxb_12.nWx.ead().b((fns_0)cxb_12);
            return true;
        });
        this.nWr.clear();
    }

    public void bT(ffV ffV2) {
        fnl_0 fnl_02 = ffV2.ead();
        String string = fnl_02.getName() != null && fnl_02.getName().length() > 0 ? fnl_02.getName() : ffV2.getName();
        aPd.f("pet.chat.weak", string);
    }

    public void bU(ffV ffV2) {
        fnl_0 fnl_02 = ffV2.ead();
        if (fnl_02.agM() == 0) {
            return;
        }
        boolean bl = aue_0.cVJ().cVK().dpL().b(evv_1.oxp);
        if (bl) {
            return;
        }
        int n = fnl_02.geL().a(foq_0.sLp);
        String string = fnl_02.getName() != null && fnl_02.getName().length() > 0 ? fnl_02.getName() : ffV2.getName();
        aPd.f("pet.chat.hungry", string, n);
    }

    public void bV(ffV ffV2) {
        if (this.nWq == null) {
            return;
        }
        int n = ffV2.avr();
        bjm_0 bjm_02 = (bjm_0)fse_1.gFu().aW("pet", this.nWq);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(this.nWq);
        fnl_0 fnl_02 = bjm_02.eai().ead();
        if (fnl_02.geL().XK(n)) {
            fbt_1 fbt_12 = (fbt_1)fhs_22.uH("colorImageContainer");
            this.U(fbt_12);
        } else if (fnl_02.geL().XJ(n)) {
            fbt_1 fbt_13 = (fbt_1)fhs_22.uH("equipmentImageContainer");
            this.U(fbt_13);
        } else if (fnp_0.b(fnl_02, n) || fnp_0.a(fnl_02, n) || fnl_02.geL().XL(n)) {
            fbt_1 fbt_14 = (fbt_1)fhs_22.uH("petPortrait");
            this.U(fbt_14);
        }
    }

    private void U(fbt_1 fbt_12) {
        fyY fyY2 = fbt_12.getAppearance();
        awx_2 awx_22 = new awx_2(awx_2.dnF.aTn());
        awx_2 awx_23 = new awx_2(awx_2.dnE.aTn());
        fyY2.x(fsa_2.class);
        ((fys_0)fyY2).setModulationColor(awx_22);
        fsa_2 fsa_22 = new fsa_2(awx_22, awx_23, fyY2, 0, 300, -1, abn.cdr);
        fyY2.a(fsa_22);
    }

    public void eXm() {
        if (this.nWq == null) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR(this.nWq);
        this.a(fhs_22, "colorImageContainer");
        this.a(fhs_22, "equipmentImageContainer");
        this.a(fhs_22, "petPortrait");
    }

    private void a(fhs_2 fhs_22, String string) {
        try {
            fbt_1 fbt_12 = (fbt_1)fhs_22.uH(string);
            if (fbt_12 == null || fbt_12.isUnloading()) {
                return;
            }
            fbt_12.getAppearance().x(fsa_2.class);
        }
        catch (Exception exception) {
            nWo.error((Object)"", (Throwable)exception);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.procedure.TLongObjectProcedure;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bly
 */
public class bly_0
implements aeh_2 {
    private static final Logger iuV = Logger.getLogger(bly_0.class);
    public static final String iuW = "mainSlot";
    public static final String iuX = "heroSlot0";
    public static final String iuY = "heroSlot1";
    public static final String iuZ = "isPartyValid";
    public static final String iva = "companyAwardsList";
    public static final String ivb = "companyAwardsPreview";
    public static final String ivc = "selectedReward";
    public static final TLongObjectProcedure<bgl_0> ivd = new blz_0();
    static final azz_1<bsu_0> ive = new azz_1<bsu_0>(new bla_0());
    final blx_0 ivf = new blx_0(-1);
    private final blx_0 ivg = new blx_0(0);
    private final blx_0 ivh = new blx_0(1);
    private bnw_1 ivi;
    private bsu_0 ivj;
    private boolean ivk = true;
    public static final bly_0 ivl;
    public final byg_2 ivm = new byg_2();
    final eyu_1 ivn = new blc_1(this);

    public bsu_0 dtR() {
        return this.ivj;
    }

    public void ka(long l) {
        bgy bgy2 = this.ivf.dtO().dcP();
        bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
        if (bgt_02 != null && bgt_02.aZj() == bgy2.aZj()) {
            this.ivf.a(bwa_0.jwi.aj(bgt_02));
            if (this.ivg.dtO() != null && this.ivg.dtO().dcP().Sn() == l) {
                this.ivg.a(bwa_0.jwi.aj((bhJ)bgy2));
            }
            if (this.ivh.dtO() != null && this.ivh.dtO().dcP().Sn() == l) {
                this.ivh.a(bwa_0.jwi.aj((bhJ)bgy2));
            }
            this.ivi = null;
        }
    }

    public int dtS() {
        int n = 0;
        if (this.ivg.dtO() != null) {
            ++n;
        }
        if (this.ivh.dtO() != null) {
            ++n;
        }
        return n;
    }

    public int dtT() {
        int n = 0;
        if (this.ivg.dtO() != null && !this.ivg.dtO().aXd()) {
            ++n;
        }
        if (this.ivh.dtO() != null && !this.ivh.dtO().aXd()) {
            ++n;
        }
        return n;
    }

    public boolean b(bgl_0 bgl_02) {
        boolean bl = false;
        if (this.ivg.dtO() != null) {
            bl = this.ivg.dtO().equals(bgl_02);
        }
        boolean bl2 = false;
        if (this.ivh.dtO() != null) {
            bl2 = this.ivh.dtO().equals(bgl_02);
        }
        return bl || bl2;
    }

    public static boolean c(bgl_0 bgl_02) {
        bvi_0 bvi_02 = aue_0.cVJ().cVK().dnQ();
        if (!bvi_02.dfG()) {
            return false;
        }
        return bvi_02.dKL().fa(bgl_02.Sn());
    }

    bgl_0 a(exz_1 exz_12) {
        ctu_2 ctu_22 = ctu_2.nJd;
        if (!exz_12.aXd()) {
            return ctu_22.om(exz_12.KU());
        }
        return ctu_22.om(-exz_12.aWP());
    }

    private bgl_0 aN(bgy bgy2) {
        ctu_2 ctu_22 = ctu_2.nJd;
        if (!bgy2.dmc()) {
            return ctu_22.om(-bgy2.aWP());
        }
        return ctu_22.om(bgy2.Sn());
    }

    @Nullable
    public bgl_0 kb(long l) {
        ctu_2 ctu_22 = ctu_2.nJd;
        if (l == 0L) {
            return null;
        }
        if (this.ivf.dtO().Sn() == l) {
            return this.ivf.dtO();
        }
        return ctu_22.om(l);
    }

    public void bkZ() {
        if (fcI.fSM() || fcI.fSN()) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            this.ivf.a(bwa_0.jwi.aj(bgt_02));
        }
        this.dtU();
    }

    public void dtU() {
        this.s(aue_0.cVJ().cVK());
    }

    public void s(bgt_0 bgt_02) {
        bvi_0 bvi_02 = bgt_02.dnQ();
        bvi_02.a(new bld_1(this));
    }

    public void gu(boolean bl) {
        if (this.ivg.dtO() != null) {
            if (bl) {
                this.a(this.ivg.dtO(), true);
            } else {
                this.a(this.ivg, true);
            }
        }
        if (this.ivh.dtO() != null) {
            if (bl) {
                this.a(this.ivh.dtO(), true);
            } else {
                this.a(this.ivh, true);
            }
        }
        ctu_2.nJd.ePN();
    }

    public void clear() {
        this.ivf.a(null);
        this.ivg.a(null);
        this.ivh.a(null);
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iuW)) {
            return this.ivf;
        }
        if (string.equals(iuX)) {
            return this.ivg;
        }
        if (string.equals(iuY)) {
            return this.ivh;
        }
        if (string.equals(iuZ)) {
            Object object;
            bgl_0 bgl_02 = this.ivf.dtO();
            if (bgl_02 == null) {
                return false;
            }
            bgy bgy2 = bgl_02.dcP();
            if (!(bgy2 instanceof bgt_0)) {
                return false;
            }
            bgt_0 bgt_02 = (bgt_0)bgy2;
            bgl_0 bgl_03 = this.ivg.dtO();
            bgl_0 bgl_04 = this.ivh.dtO();
            fcy fcy2 = new fcy();
            this.a(bgt_02, fcy2);
            eww eww2 = eww.oHf;
            if (bgl_03 != null && !bgl_03.aXd()) {
                object = bgl_03.dcP();
                int n = bgr_0.dmo().az((bgy)object);
                fcy2.se(bgr_0.dmo().aA((bgy)object));
                fcy2.sg(((exP)object).Ya());
                fcy2.Ub(n);
                eww2 = fcz.rTU.a(fcy2);
            }
            object = eww.oHf;
            if (bgl_04 != null && !bgl_04.aXd()) {
                bgy bgy3 = bgl_04.dcP();
                int n = bgr_0.dmo().az(bgy3);
                fcy2.se(bgr_0.dmo().aA(bgy3));
                fcy2.sg(bgy3.Ya());
                fcy2.Ub(n);
                object = fcz.rTU.a(fcy2);
            }
            if (eww2 != eww.oHf) {
                iuV.error((Object)"Invalid hero on slot 0");
                return false;
            }
            if (object != eww.oHf) {
                iuV.error((Object)"Invalid hero on slot 1");
                return false;
            }
            return true;
        }
        if (string.equals(iva)) {
            return ive;
        }
        if (string.equals(ivb)) {
            if (this.ivi == null) {
                Object t = fcL.rUh.sw(fcK.rUe.sq(aue_0.cVJ().cVK().Xi()));
                this.ivi = new bnw_1((bgt_0)t);
            }
            return this.ivi;
        }
        if (string.equals(ivc)) {
            return this.ivj;
        }
        return null;
    }

    public void d(bgl_0 bgl_02) {
        if (this.f(bgl_02)) {
            this.j(bgl_02);
            return;
        }
        if (fcz.rTU.a(bgl_02.dmb()) != eww.oHf && !bgl_02.aXd()) {
            return;
        }
        this.e(bgl_02);
    }

    public void e(bgl_0 bgl_02) {
        if (this.ivg.dtO() != null && this.ivh.dtO() != null) {
            return;
        }
        blx_0 blx_02 = !bgl_02.aXd() ? this.i(bgl_02) : this.h(bgl_02);
        this.g(bgl_02);
        ctu_2.nJd.ePN();
        if (blx_02 != null) {
            this.a(blx_02, true, false);
        }
    }

    private void a(bgt_0 bgt_02, fcy fcy2) {
        Optional<Object> optional = bbs_2.a(eva_1.owr);
        fcy2.a(optional.orElse(null));
        boolean bl = fcI.fSO();
        evd_2 evd_22 = bgt_02.dpL();
        boolean bl2 = evd_22.b(evv_1.oxo);
        fcy2.mR(bl || bl2);
        fcy2.TZ(this.dtT());
        fcy2.sd(bgr_0.dmo().aA(bgt_02));
        if (fcy2.fSC() == 0L) {
            fcy2.sd(bgt_02.aqZ());
        }
        fcy2.sf(bgt_02.Ya());
        fcy2.Ua(bgt_02.Xt());
        fcy2.mS(bgt_02.dkZ() != null && bgt_02.dkZ().dGp() != etw_0.rqT);
    }

    private boolean f(bgl_0 bgl_02) {
        return this.a(this.ivg, bgl_02) || this.a(this.ivh, bgl_02);
    }

    private boolean a(blx_0 blx_02, bgl_0 bgl_02) {
        return blx_02.dtO() != null && blx_02.dtO().equals(bgl_02);
    }

    public void g(bgl_0 bgl_02) {
        fse_1.gFu().a((aef_2)bgl_02, "isInParty");
        fse_1.gFu().a((aef_2)bgl_02, "isInSlot");
        fse_1.gFu().a((aef_2)bgl_02, "isInCompanyGuild");
        fse_1.gFu().a((aef_2)bgl_02, "isInCompanyNation");
        fse_1.gFu().a((aef_2)bgl_02, "canAddToParty");
        fse_1.gFu().a((aef_2)bgl_02, "addToPartyError");
        fse_1.gFu().f("heroesDisplayer", (Object)null);
        fse_1.gFu().f("heroesDisplayer", this);
        ctu_2.nJd.b(ivd);
    }

    private blx_0 h(bgl_0 bgl_02) {
        if (this.ivg.dtO() == null && (!this.ivg.dtP() || this.ivh.dtO() != null || this.ivh.dtP())) {
            this.ivg.a(bgl_02);
            return this.ivg;
        }
        if (this.ivg.dtO() != null && this.ivg.dtO().Sn() == bgl_02.Sn()) {
            return this.ivg;
        }
        if (this.ivh.dtO() == null) {
            this.ivh.a(bgl_02);
            return this.ivh;
        }
        if (this.ivh.dtO().Sn() == bgl_02.Sn()) {
            return this.ivh;
        }
        return null;
    }

    private blx_0 i(bgl_0 bgl_02) {
        if (this.ivg.dtP()) {
            if (this.ivg.dtO() == null) {
                this.ivg.a(bgl_02);
                return this.ivg;
            }
            if (this.ivg.dtO().Sn() == bgl_02.Sn()) {
                return this.ivg;
            }
        }
        if (this.ivh.dtP()) {
            if (this.ivh.dtO() == null) {
                this.ivh.a(bgl_02);
                return this.ivh;
            }
            if (this.ivh.dtO().Sn() == bgl_02.Sn()) {
                return this.ivh;
            }
        }
        return null;
    }

    public boolean a(blx_0 blx_02, boolean bl, boolean bl2) {
        String string;
        if (blx_02 == null) {
            return false;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("companionsManagementDialog");
        if (fhs_22 == null) {
            return false;
        }
        fax_1 fax_12 = (fax_1)fhs_22.uH(blx_02.dtN());
        if (fax_12 == null) {
            return false;
        }
        fax_12.setAnimatedElement(blx_02.dtO().dcP().ddI());
        ZG zG = (ZG)fax_12.getAnimatedElement();
        String string2 = string = bl ? "AnimApparition" : "AnimMort";
        if (!zG.dZ("AnimApparition")) {
            fax_12.setAnimName("AnimStatique");
            return false;
        }
        fax_12.setAnimName(string);
        if (bl) {
            zG.a(new ble_1(this, fax_12, zG));
        } else {
            blf_1 blf_12 = new blf_1(this, blx_02, bl2);
            fyw_0.gqw().a(blf_12);
            zG.a(new blg_1(this, blf_12, blx_02, bl2, zG));
        }
        return true;
    }

    void a(blx_0 blx_02, boolean bl) {
        bgl_0 bgl_02 = blx_02.dtO();
        blx_02.a(null);
        this.g(bgl_02);
        if (!bl) {
            this.dtV();
        }
    }

    public void a(bgl_0 bgl_02, boolean bl) {
        blx_0 blx_02 = null;
        if (bgl_02.equals(this.ivg.dtO())) {
            blx_02 = this.ivg;
        } else if (bgl_02.equals(this.ivh.dtO())) {
            blx_02 = this.ivh;
        }
        if (blx_02 != null && !this.a(blx_02, false, bl)) {
            this.a(blx_02, bl);
        }
    }

    public void j(bgl_0 bgl_02) {
        this.a(bgl_02, false);
    }

    private void dtV() {
        bgl_0 bgl_02 = this.ivg.dtO();
        bgl_0 bgl_03 = this.ivh.dtO();
        if (this.ivg.dtP() && !this.ivh.dtP() && bgl_02 != null && bgl_02.aXd() && bgl_03 == null) {
            this.ivg.a(null);
            this.ivh.a(bgl_02);
            this.a(this.ivh, true, true);
        }
        if (this.ivh.dtP() && bgl_03 != null && bgl_02 == null) {
            this.ivh.a(null);
            this.ivg.a(bgl_03);
            this.a(this.ivg, true, true);
        }
        fse_1.gFu().a((aef_2)this.ivg, "hero");
        fse_1.gFu().a((aef_2)this.ivh, "hero");
        ctu_2.nJd.ePN();
    }

    public boolean dtW() {
        return this.ivg.dtP() && this.ivg.dtO() == null || this.ivh.dtP() && this.ivh.dtO() == null;
    }

    public void dtX() {
        fse_1.gFu().a((aef_2)this.ivg, "remainingTime", "isUpgraded");
        fse_1.gFu().a((aef_2)this.ivh, "remainingTime", "isUpgraded");
        ctu_2.nJd.ePN();
    }

    public void setNetEnabled(boolean bl) {
        this.ivk = bl;
    }

    public boolean dtY() {
        return this.ivk;
    }

    public void a(bsu_0 bsu_02) {
        fov_0 fov_02;
        boolean bl;
        this.clean();
        this.ivj = bsu_02;
        fse_1.gFu().a((aef_2)this, ivc, ivb);
        bmj_2 bmj_22 = bsu_02.dFW();
        if (bmj_22 == null) {
            return;
        }
        byte by = this.b(this.ivj);
        if (by == -1) {
            return;
        }
        bgv_2 bgv_22 = bmj_22.duo();
        if (bgv_22.adO() && (bl = (fov_02 = foy_0.sLJ.XQ(bgv_22.d())).gfz())) {
            this.ivi.f(fov_02);
        }
        this.ivi.c(fgD.fXh().Ve(bgv_22.d()), by);
    }

    private byte b(bsu_0 bsu_02) {
        bmj_2 bmj_22 = bsu_02.dFW();
        if (bmj_22 == null) {
            return -1;
        }
        bgv_2 bgv_22 = bmj_22.duo();
        ffS[] ffSArray = bgv_22.dGh().fZq();
        if (ffSArray.length == 0) {
            return -1;
        }
        return ffSArray[0].aJr();
    }

    public void clean() {
        this.ivj = null;
        this.ivi = null;
        fse_1.gFu().a((aef_2)this, ivc, ivb);
    }

    static {
        fds_0 fds_02 = (fds_0)fda_0.rWI.a(fdv_0.rZi, 150);
        fds_02.W(new blb_0());
        ivl = new bly_0();
    }
}


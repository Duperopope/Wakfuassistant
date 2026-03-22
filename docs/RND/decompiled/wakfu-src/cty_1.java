/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.console.command.commonIn.RideMountCommand;
import com.ankamagames.wakfu.client.console.command.display.EnableMiniMapCommand;
import java.time.Duration;
import java.util.Optional;

/*
 * Renamed from cTy
 */
public class cty_1
implements adi_1 {
    private static final cty_1 nJn = new cty_1();
    public static final String nJo = "hudButtonsContainer";
    private fey_2 nJp;
    private final fis_1 nJq = fiq_12 -> {
        if (fiq_12.gBy() != fzq_0.tJS) {
            return false;
        }
        fse_1.gFu().f("hudButtonMenuExpanded", false);
        this.eQd();
        return false;
    };
    private static final byte nJr = 0;
    private frx_1 nJs;
    private final fte_1 nJt = new fte_1();

    public static cty_1 ePV() {
        return nJn;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22 instanceof aba_2) {
            int n = ((aba_2)aam_22).bUy();
            switch (n) {
                case 0: {
                    bik_2.dZl().dXO();
                }
            }
            return false;
        }
        switch (aam_22.d()) {
            case 16221: {
                dae_0 dae_02 = (dae_0)aam_22;
                this.o(dae_02.bCu(), false);
                return false;
            }
            case 19096: {
                boolean bl = fse_1.gFu().dp("player.displayStates");
                fse_1.gFu().f("player.displayStates", !bl);
                return false;
            }
            case 16075: {
                aue_0.cVJ().a(cxh_2.eWD());
                return false;
            }
            case 19014: {
                this.eQk();
                return false;
            }
        }
        return true;
    }

    public void kg(boolean bl) {
        this.ePW().ifPresent(fhs_22 -> {
            fes_2 fes_22 = (fes_2)fhs_22.uH("nwButton");
            if (fes_22 != null) {
                fes_22.setEnabled(bl);
            }
            if ((fes_22 = (fes_2)fhs_22.uH("neButton")) != null) {
                fes_22.setEnabled(bl);
            }
            if ((fes_22 = (fes_2)fhs_22.uH("swButton")) != null) {
                fes_22.setEnabled(bl);
            }
            if ((fes_22 = (fes_2)fhs_22.uH("seButton")) != null) {
                fes_22.setEnabled(bl);
            }
        });
    }

    @Override
    public long Sn() {
        return 10L;
    }

    @Override
    public void dC(long l) {
    }

    private Optional<fhs_2> ePW() {
        return Optional.ofNullable(fyw_0.gqw().gqC().uR("worldAndFightBarDialog"));
    }

    public fey_2 getWindow() {
        return this.nJp;
    }

    public void ePX() {
        this.ePW().map(fhs_22 -> (fes_2)fhs_22.uH("fightInfoBtn")).ifPresent(czu_2::h);
    }

    public void ePY() {
        this.ePW().map(fhs_22 -> (fes_2)fhs_22.uH("symbiotBtn")).ifPresent(czu_2::h);
    }

    public void ePZ() {
        this.ePW().map(fhs_22 -> (fes_2)fhs_22.uH("communityButton")).ifPresent(czu_2::h);
    }

    public void eQa() {
        this.ePW().map(fhs_22 -> (fes_2)fhs_22.uH("spellButton")).ifPresent(czu_2::h);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fse_1.gFu().f("isInFight", aue_0.cVJ().cVK().djT());
            fse_1.gFu().f("isFightSpectator", false);
            fse_1.gFu().f("hudButtonMenuExpanded", false);
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bgt_02.dlG().edF();
            fse_1.gFu().f("challengeDetailsVisible", false);
            fse_1.gFu().f("chat.enable.interactions", !bgt_02.i(ezj_0.ptr));
            fse_1.gFu().f("aptitude.enable.interactions", !bgt_02.i(ezj_0.pug));
            fse_1.gFu().f("fighter.enable.interactions", !bgt_02.i(ezj_0.puh));
            fse_1.gFu().f("quests.enable.interactions", !bgt_02.i(ezj_0.puk));
            fse_1.gFu().f("spells.enable.interactions", !bgt_02.i(ezj_0.pul));
            fse_1.gFu().f("inventory.enable.interactions", !bgt_02.i(ezj_0.puj));
            fse_1.gFu().f("character.sheet.enable.interactions", !bgt_02.i(ezj_0.pum));
            fse_1.gFu().f("followed.achievements.enable.interactions", !bgt_02.i(ezj_0.pts));
            czm_2.eZa();
            this.eQe();
            this.eQg();
            this.eQi();
            aue_0.cVJ().a(cxd_2.eXp());
            aue_0.cVJ().a(cyn_2.eXP());
            this.nJp = (fey_2)ccj_2.g("worldAndFightBarDialog", 270336L);
            fyw_0.gqw().d("wakfu.controlCenter", cea_2.class);
            fse_1.gFu().f("controlCenter.forcePopup", true);
            cdv_0.euj().d(this);
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            if (bsg_12.a(bsn_1.lkW)) {
                abg_2.bUP().a(() -> fse_1.gFu().f("hudButtonMenuExpanded", bsg_12.a(bsn_1.lkX)), Duration.ofSeconds(1L), 1);
            }
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.eQh();
            this.eQf();
            this.eQj();
            fyw_0.gqw().tl("worldAndFightBarDialog");
            this.nJp = null;
            this.eQd();
            fyw_0.gqw().tc("wakfu.controlCenter");
            aue_0.cVJ().b(cxd_2.eXp());
            aue_0.cVJ().b(cyn_2.eXP());
            cdv_0.euj().e(this);
        }
    }

    public void eQb() {
        if (fse_1.gFu().dp("hudButtonMenuExpanded")) {
            this.eQc();
        } else {
            this.eQd();
        }
    }

    private void eQc() {
        if (((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkW)) {
            return;
        }
        fbj_1.getInstance().a(fzq_0.tJS, this.nJq, false);
    }

    private void eQd() {
        fbj_1.getInstance().b(fzq_0.tJS, this.nJq, false);
    }

    private void eQe() {
        bik_2.dZl().dXL();
        ccj_2.g("minimapPopup", 8200L);
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("minimapPopup");
        if (fhs_22 != null) {
            this.nJs = (frx_1)fhs_22.uH("popup");
        }
        fhv_1 fhv_12 = ccj_2.g("minimapDialog", 57344L);
        this.nJt.l(fhv_12.getElementMap());
        fbb_2 fbb_22 = (fbb_2)fhv_12.getElementMap().uH("navigator");
        bik_2.dZl().a(fbb_22);
        bik_2.dZl().dYi().dYG();
        abb_2.bUA().a(this, 200L, 0, -1L);
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        boolean bl = bsg_12.a(bsn_1.ljK);
        EnableMiniMapCommand.eW(bl);
    }

    private void eQf() {
        abb_2.bUA().a(this, 0);
        fyw_0.gqw().tl("minimapDialog");
        fyw_0.gqw().tl("minimapPopup");
        this.nJt.l(null);
        this.nJs = null;
        bik_2.dZl().a((fba_2)null);
    }

    public final void a(fln_2 fln_22) {
        String string = fln_22.gEi().getName();
        if (string == null || string.length() == 0) {
            return;
        }
        fse_1.gFu().f("minimapPopupDescription", string);
        fbb_2 fbb_22 = (fbb_2)fln_22.gBE();
        this.nJt.ace(fln_22.gEe() + fbb_22.getScreenX() - fln_22.gEg() / 2);
        this.nJt.acf(fln_22.gEf() + fbb_22.getScreenY() - fln_22.gEh() / 2);
        this.nJt.setWidth(fln_22.gEg());
        this.nJt.setHeight(fln_22.gEh());
        this.nJs.b(this.nJt);
    }

    public void o(boolean bl, boolean bl2) {
        fes_2 fes_22;
        if (!bl2 && bl == EnableMiniMapCommand.cUs()) {
            return;
        }
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("minimapDialog");
        if (fhs_22 != null && (fes_22 = (fes_2)fhs_22.uH("window")) != null) {
            fes_22.setVisible(bl);
            bik_2.dZl().a((fba_2)fhs_22.uH("navigator"));
            bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
            bsg_12.a((afe)bsn_1.ljK, bl);
        }
    }

    private void eQg() {
        if (!fyw_0.gqw().to("sundialDialog")) {
            ccj_2.g("sundialDialog", 8192L);
        }
    }

    public void eQh() {
        fyw_0.gqw().tl("sundialDialog");
    }

    private void eQi() {
        if (!fyw_0.gqw().to("topHudDialog")) {
            ccj_2.g("topHudDialog", 8192L);
        }
    }

    public void eQj() {
        fyw_0.gqw().tl("topHudDialog");
    }

    public void kh(boolean bl) {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("sundialDialog");
        if (fhs_22 == null) {
            return;
        }
        fes_2 fes_22 = (fes_2)fhs_22.uH("mainContainer");
        if (fes_22 == null) {
            return;
        }
        fes_22.setVisible(bl);
    }

    private void eQk() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        RideMountCommand.e(bgt_02);
    }
}


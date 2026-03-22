/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cUV
 */
public class cuv_2
implements adi_1 {
    private static final cuv_2 nOh = new cuv_2();
    private alx_2 ikv;
    private bls_2 nOi;
    protected static Logger oO = Logger.getLogger(cuv_2.class);
    private static final byte nOj = 0;
    private static final byte nOk = 1;
    private int nOl;
    private final ewp_0 nOm = (ewr_02, object) -> {
        if (ewr_02 != ewr_0.oGh) {
            return;
        }
        fse_1.gFu().a((aef_2)buc_0.dJg(), "giftEnabled");
    };

    public static cuv_2 eTk() {
        return nOh;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18393: {
                bsu_0 bsu_02 = (bsu_0)((ama_1)aam_22).bCv();
                bmj_2 bmj_22 = bsu_02.dFW();
                String string = bmj_22.aDK().aBH();
                String string2 = bmj_22.aEv().aBH();
                long l = aue_0.cVJ().cVK().Sn();
                cnq_0 cnq_02 = new cnq_0(string, string2, l);
                aue_0.cVJ().etu().d(cnq_02);
                return false;
            }
            case 16564: {
                blt_2 blt_22 = this.nOi.ecD();
                blu_2 blu_22 = this.nOi.ecE();
                cnp_0 cnp_02 = new cnp_0(aue_0.cVJ().cVK().Sn());
                if (blu_22.ecH() != null) {
                    cnp_02.c(ax_0.lI(blu_22.ecH().d()));
                }
                if (blt_22.ecG() != null) {
                    cnp_02.c(aq_0.lv(blt_22.ecG().d()));
                }
                aue_0.cVJ().etu().d(cnp_02);
                return false;
            }
            case 17690: {
                dae_0 dae_02 = (dae_0)aam_22;
                blu_2 blu_23 = (blu_2)dae_02.bCv();
                this.nOi.a(blu_23);
                return false;
            }
            case 17736: {
                dae_0 dae_03 = (dae_0)aam_22;
                byte by = dae_03.bCn();
                cuv_2.dZ(by);
                return false;
            }
            case 19680: {
                dae_0 dae_04 = (dae_0)aam_22;
                blt_2 blt_23 = (blt_2)dae_04.bCv();
                this.nOi.a(blt_23);
                return false;
            }
            case 18277: {
                if (aue_0.cVJ().cVK().a(ezj_0.ptU)) {
                    ape_0.a(ezj_0.ptU);
                    return false;
                }
                dcn_0 dcn_02 = (dcn_0)aam_22;
                buc_0.dJg().a(dcn_02.dJb());
                return false;
            }
            case 17475: {
                if (aue_0.cVJ().cVK().a(ezj_0.ptU)) {
                    ape_0.a(ezj_0.ptU);
                    return false;
                }
                dcm dcm2 = (dcm)aam_22;
                bub_0 bub_02 = dcm2.dJc();
                boolean bl = dcm2.bCu();
                bud_0 bud_02 = (bud_0)dcm2.bCv();
                buc_0.dJg().a(bud_02, bub_02, bl);
                this.kp(false);
                ckl_0 ckl_02 = new ckl_0();
                ckl_02.ow(bub_02.dJe());
                ckl_02.h(bl);
                aue_0.cVJ().etu().d(ckl_02);
                return false;
            }
            case 19674: {
                if (aue_0.cVJ().cVK().a(ezj_0.ptU)) {
                    ape_0.a(ezj_0.ptU);
                    return false;
                }
                this.nOl = 0;
                dae_0 dae_05 = (dae_0)aam_22;
                bud_0 bud_03 = (bud_0)dae_05.bCv();
                this.b(bud_03);
                return false;
            }
            case 19864: {
                if (aue_0.cVJ().cVK().a(ezj_0.ptU)) {
                    ape_0.a(ezj_0.ptU);
                    return false;
                }
                this.nOl = 0;
                ArrayList<bud_0> arrayList = buc_0.dJg().dJf();
                for (bud_0 bud_04 : arrayList) {
                    this.b(bud_04);
                }
                return false;
            }
            case 18366: {
                if (fyw_0.gqw().to("giftRewardDialog")) {
                    fyw_0.gqw().tl("giftRewardDialog");
                    fiu_1.uCW.vO("giftLock");
                } else {
                    if (aue_0.cVJ().cVK().a(ezj_0.ptU)) {
                        ape_0.a(ezj_0.ptU);
                        return false;
                    }
                    fiu_1.uCW.vN("giftLock");
                    ccj_2.g("giftRewardDialog", 32768L);
                }
                return false;
            }
            case 16000: {
                ama_1 ama_12 = (ama_1)aam_22;
                bud_0 bud_05 = (bud_0)ama_12.bCv();
                bud_05.dLG();
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            aue_0.cVJ().etu().d(new cnr_0(aue_0.cVJ().cVK().Sn()));
            this.nOi = new bls_2();
            this.nOi.ecF();
            fse_1.gFu().f("rewardsView", this.nOi);
            this.ikv = new cuw_1(this);
            fyw_0.gqw().a(this.ikv);
            fyw_0.gqw().d("wakfu.giftReward", cep_1.class);
            ccj_2.g("giftRewardDialog", 32768L);
            ewo_0.oBF.a(this.nOm);
            cAY.eHc().nP(600012L);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().d("wakfu.giftReward", cep_1.class);
            cAY.eHc().nP(600013L);
            fse_1.gFu().vX("rewardsView");
            ewo_0.oBF.b(this.nOm);
            cuv_2.eTm();
        }
    }

    public void kp(boolean bl) {
        fiu_1.uCW.N("giftLock", bl);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private void b(bud_0 bud_02) {
        ArrayList<buz_0> arrayList = bud_02.dJj();
        int n = aue_0.cVJ().cVK().dno().fVd();
        arrayList.forEach(buz_02 -> {
            if (buz_02 instanceof bub_0) {
                bub_0 bub_02 = (bub_0)buz_02;
                if (n > this.nOl) {
                    buc_0.dJg().a(bud_02, bub_02, true);
                    this.kp(false);
                    ckl_0 ckl_02 = new ckl_0();
                    ckl_02.ow(bub_02.dJe());
                    ckl_02.h(true);
                    aue_0.cVJ().etu().d(ckl_02);
                    ++this.nOl;
                }
            }
        });
    }

    public void kq(boolean bl) {
        if (aue_0.cVJ().c(this)) {
            if (bl) {
                if (fse_1.gFu().dq("giftRewardViewTab") == 0) {
                    cuv_2.eTm();
                } else {
                    cuv_2.dZ((byte)0);
                }
            } else if (fse_1.gFu().dq("giftRewardViewTab") == 1) {
                cuv_2.eTm();
            } else {
                cuv_2.dZ((byte)1);
            }
        } else {
            cuv_2.dZ(bl ? (byte)0 : 1);
            cuv_2.eTl();
        }
    }

    private static void eTl() {
        if (aue_0.cVJ().cVK().a(ezj_0.ptU)) {
            ape_0.a(ezj_0.ptU);
            return;
        }
        aue_0.cVJ().a(nOh);
    }

    private static void dZ(byte by) {
        fse_1.gFu().f("giftRewardViewTab", by);
    }

    private static void eTm() {
        fyw_0.gqw().tl("giftRewardDialog");
        cAY.eHc().nP(600046L);
    }
}


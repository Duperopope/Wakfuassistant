/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cVa
 */
public class cva_1
implements adi_1 {
    protected static final Logger nOB = Logger.getLogger(cva_1.class);
    private static final cva_1 nOC = new cva_1();
    private bzV nOD;
    private bvz nOE;
    private alx_2 ikv;

    public static cva_1 eTu() {
        return nOC;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 18039: {
                dbt dbt2 = (dbt)aam_22;
                switch (this.nOE.dKD()) {
                    case 1: {
                        this.nOE.setBackgroundColor(dbt2.getColor());
                        break;
                    }
                    case 0: {
                        this.nOE.m(dbt2.getColor());
                    }
                }
                return false;
            }
            case 16585: {
                if (this.nOE.dKE() == bvd_0.juB) {
                    return false;
                }
                dae_0 dae_02 = (dae_0)aam_22;
                short s = (short)dae_02.bCo();
                this.nOE.bR(s);
                return false;
            }
            case 18259: {
                if (this.nOE.dKE() == bvd_0.juB) {
                    return false;
                }
                dae_0 dae_03 = (dae_0)aam_22;
                short s = (short)dae_03.bCo();
                this.nOE.bS(s);
                return false;
            }
            case 18530: {
                dbv dbv2 = (dbv)aam_22;
                String string3 = eii_0.sb(dbv2.getName());
                fsf_1 fsf_12 = fse_1.gFu().getProperty("guildCreation.hasItem");
                if (fsf_12 == null || !fsf_12.gFz()) {
                    return false;
                }
                eik_0 eik_02 = eii_0.se(string3);
                eij_0 eij_02 = eik_02.fwM();
                if (eij_02 != eij_0.qxf) {
                    fiq_2.gCw().d(fik_2.gBZ().vE(this.a(eij_02)).abQ(3).vG(ccp_2.mRF.byf()));
                    return false;
                }
                fiq_2.gCw().d(fik_2.b(string2 -> {
                    ckp_0 ckp_02 = new ckp_0(string3, this.nOE.dJv());
                    aue_0.cVJ().etu().d(ckp_02);
                }).l("guild.creation.validate", string3).vG(ccp_2.mRI.byf()).abQ(3));
                return false;
            }
            case 16936: {
                fsf_1 fsf_13 = fse_1.gFu().getProperty("guildBlazonChange.hasItem");
                if (fsf_13 == null || !fsf_13.gFz()) {
                    return false;
                }
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                long l = bgt_02.dpI().Yc();
                long l2 = this.nOE.dJv().Sn();
                if (l2 == l) {
                    fiq_2.gCw().d(fik_2.gBZ().l("guild.error.same.blazon", new Object[0]).abQ(3).vG(ccp_2.mRF.byf()));
                    return false;
                }
                fiq_2.gCw().d(fik_2.b(string -> aue_0.cVJ().etu().d(new ckn_0(this.nOE.dJv().Sn()))).l("guild.change.blazon.validate", new Object[0]).vG(ccp_2.mRI.byf()).abQ(3));
                return false;
            }
            case 19556: {
                fsf_1 fsf_14 = fse_1.gFu().getProperty("guildNameChange.hasItem");
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                String string4 = bgt_03.dpI().getName();
                boolean bl = ezo_1.rML.matcher(string4).find();
                if (!(fsf_14 != null && fsf_14.gFz() || bl)) {
                    return false;
                }
                dae_0 dae_04 = (dae_0)aam_22;
                String string5 = eii_0.sb(dae_04.bCt());
                eik_0 eik_03 = eii_0.se(string5);
                eij_0 eij_03 = eik_03.fwM();
                if (eij_03 != eij_0.qxf) {
                    fiq_2.gCw().d(fik_2.gBZ().vE(this.a(eij_03)).abQ(3).vG(ccp_2.mRF.byf()));
                    return false;
                }
                if (string5.equalsIgnoreCase(string4)) {
                    fiq_2.gCw().d(fik_2.gBZ().l("guild.error.same.name", new Object[0]).abQ(3).vG(ccp_2.mRF.byf()));
                    return false;
                }
                fiq_2.gCw().d(fik_2.b(string2 -> aue_0.cVJ().etu().d(new cko_0(string5))).l("guild.change.name.validate", string5).vG(ccp_2.mRI.byf()).abQ(3));
                return false;
            }
            case 17537: {
                dae_0 dae_05 = (dae_0)aam_22;
                bvC bvC2 = (bvC)dae_05.bCv();
                this.nOE.a(bvC2);
                return false;
            }
            case 19872: {
                dae_0 dae_06 = (dae_0)aam_22;
                int n = dae_06.bCo();
                this.nOE.FM(n);
                return false;
            }
            case 17546: {
                aue_0.cVJ().b(nOC);
                return false;
            }
            case 19017: {
                this.nOE.dKy();
                return false;
            }
            case 17203: {
                dae_0 dae_07 = (dae_0)aam_22;
                this.nOE.my(dae_07.bCt());
                return false;
            }
        }
        return true;
    }

    private String a(eij_0 eij_02) {
        return switch (eij_02) {
            case eij_0.qxr -> aum_0.cWf().c("error.guild.creation.forbiddenName", new Object[0]);
            case eij_0.qxs -> aum_0.cWf().c("error.guild.creation.invalidDashPosition", new Object[0]);
            case eij_0.qxj -> aum_0.cWf().c("error.characterCreation.tooManyConsonant", new Object[0]);
            case eij_0.qxk -> aum_0.cWf().c("error.characterCreation.tooManyVowel", new Object[0]);
            case eij_0.qxh -> aum_0.cWf().c("error.characterCreation.nameTooLong", new Object[0]);
            case eij_0.qxg -> aum_0.cWf().c("error.characterCreation.nameTooShort", new Object[0]);
            case eij_0.qxi -> aum_0.cWf().c("error.characterCreation.badChar", new Object[0]);
            case eij_0.qxl -> aum_0.cWf().c("error.characterCreation.tooManyConsecutiveIdentical", new Object[0]);
            case eij_0.qxm -> aum_0.cWf().c("error.characterCreation.tooFewVowelInPart", new Object[0]);
            case eij_0.qxn -> aum_0.cWf().c("error.characterCreation.tooFewConsonantInPart", new Object[0]);
            case eij_0.qxo -> aum_0.cWf().c("error.characterCreation.tooManySpecialInPart", new Object[0]);
            case eij_0.qxp -> aum_0.cWf().c("error.characterCreation.parTooLong", new Object[0]);
            case eij_0.qxq -> aum_0.cWf().c("error.characterCreation.tooManySpecial", new Object[0]);
            case eij_0.qxt -> aum_0.cWf().c("error.guild.creation.nameWithBadCase", new Object[0]);
            default -> aum_0.cWf().c("error.guild.creation.invalidName", new Object[0]);
        };
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    private void eTv() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.cWp().exS();
        int n = ezl.ppq.fmq();
        int n2 = ezl.ppq.fmp();
        int n3 = ezl.ppq.fmr();
        int n4 = ezl.ppq.fms();
        ffV ffV2 = bgt_02.dno().UK(n);
        ffV ffV3 = bgt_02.dno().UK(n3);
        ffV ffV4 = bgt_02.dno().UK(n4);
        fse_1.gFu().f("guildCreation.hasItem", ffV2 != null);
        fse_1.gFu().f("guildCreation.itemDescription", fgD.fXh().Vd(n));
        fse_1.gFu().f("guildBlazonChange.hasItem", ffV3 != null);
        fse_1.gFu().f("guildBlazonChange.itemDescription", fgD.fXh().Vd(n3));
        fse_1.gFu().f("guildNameChange.hasItem", ffV4 != null);
        fse_1.gFu().f("guildNameChange.itemDescription", fgD.fXh().Vd(n4));
        fse_1.gFu().f("guildCreation.hasMoney", l >= (long)n2);
        fse_1.gFu().f("guildCreation.feeDescription", n2);
        fse_1.gFu().f("guildBannerColors", buH.dJn().dJo());
        fse_1.gFu().f("guildCreationView", this.nOE);
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cvb_2(this);
            this.nOD.aVQ();
            this.eTv();
            fyw_0.gqw().a(this.ikv);
            ccj_2.g("guildCreatorDialog", 33024L);
            fyw_0.gqw().d("wakfu.guildBannerCreator", ces_1.class);
        }
    }

    @NotNull
    private bvz eTw() {
        if (this.nOE == null) {
            this.nOE = new bvz();
            this.nOE.my("");
        }
        return this.nOE;
    }

    public void a(bzV bzV2, bvd_0 bvd_02) {
        if (!aue_0.cVJ().c(this)) {
            this.nOD = bzV2;
            bvz bvz2 = this.eTw();
            bvz2.a(bvd_02);
            bvz2.FM(0);
            if (bvd_02 == bvd_0.juz) {
                if (bvz2.dKF() == null) {
                    bvz2.f(buK.dJw().dJx());
                }
            } else {
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                ezb ezb2 = new ezb(bgt_02.dpI().Yc());
                if (bvd_02 == bvd_0.juB || bvz2.dKF() == null) {
                    bvz2.f(new buJ(ezb2));
                }
                bvz2.g(new buJ(ezb2));
                if (bvd_02 == bvd_0.juA || BH.aU(bvz2.HR())) {
                    bvz2.my(bgt_02.dpI().getName());
                }
            }
            aue_0.cVJ().a(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.nOD.aVQ();
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("guildCreatorDialog");
            fyw_0.gqw().tc("wakfu.guildBannerCreator");
            fse_1.gFu().vX("guildBannerColors");
        }
    }

    public void eTx() {
        if (this.nOE != null) {
            this.nOE.dKC();
            this.nOE.my("");
        }
    }

    public void a(bzV bzV2) {
        this.nOD = bzV2;
    }
}


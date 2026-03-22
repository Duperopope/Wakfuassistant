/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.procedure.TObjectProcedure;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from cdL
 */
public class cdl_0
implements adi_1 {
    protected static final Logger lQW = Logger.getLogger(cdl_0.class);
    public static final cdl_0 lQX = new cdl_0();

    private cdl_0() {
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 15524: {
                cvb_0 cvb_02 = (cvb_0)aam_22;
                aPd.f("[PVP] Score : " + cvb_02.auH() + ", Classement : " + cvb_02.bgM() + " (" + cvb_02.eDH().name() + ")", new Object[0]);
                return false;
            }
            case 15067: {
                cva_0 cva_02 = (cva_0)aam_22;
                fph_0 fph_02 = cva_02.eDG();
                cux_2.eSa().a(fph_02);
                this.ebq();
                return false;
            }
            case 15447: {
                cyz cyz2 = (cyz)aam_22;
                bku_2.koj.a(cyz2.eFz(), (int)Math.ceil((double)cyz2.eEl() / 10.0), cyz2.eFA());
                return false;
            }
            case 14160: {
                cyy cyy2 = (cyy)aam_22;
                if (cyy2.ebp() != null) {
                    bkt_2.a(cyy2.ebp(), false);
                }
                return false;
            }
            case 15008: {
                cyx cyx2 = (cyx)aam_22;
                if (cyx2.ebp() != null) {
                    bkt_2.a(cyx2.ebp(), true);
                }
                return false;
            }
            case 15438: {
                cyw cyw2 = (cyw)aam_22;
                ImmutableList immutableList = cyw2.ebp() != null ? ImmutableList.of((Object)cyw2.ebp()) : ImmutableList.of();
                bku_2.koj.a(0, 1, (List<fpq_0>)immutableList);
                return false;
            }
            case 15811: {
                cyu cyu2 = (cyu)aam_22;
                bfa bfa2 = (bfa)fse_1.gFu().vY("battlegroundListView");
                if (cyu2.aul() != null && !cyu2.aul().isEmpty()) {
                    bfa2.F(cyu2.aul());
                }
                return false;
            }
            case 15434: {
                if (!((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljE)) {
                    return false;
                }
                short s = fcL.rUh.sB(aue_0.cVJ().cVO().xl());
                if (s <= 51) {
                    return false;
                }
                cyv cyv2 = (cyv)aam_22;
                int n = cyv2.clk();
                String string = aum_0.cWf().a(66, (long)n, new Object[0]);
                String string2 = aUn.cUM().kj("battlegroundList").cUy();
                String string3 = aum_0.cWf().c("battleground.start.notification", string, string2);
                String string4 = aum_0.cWf().c("battleground.start.notification.title", new Object[0]);
                aaw_1.bUq().h(new dcd(string4, string3, biu_1.kiI));
                return false;
            }
            case 12912: {
                cuy_0 cuy_02 = (cuy_0)aam_22;
                this.a(cuy_02);
                return false;
            }
            case 12298: {
                cvg_0 cvg_02 = (cvg_0)aam_22;
                bgy bgy3 = bgg_0.dlO().ju(cvg_02.KU());
                if (bgy3 == null) {
                    return false;
                }
                bhJ bhJ2 = (bhJ)bgy3;
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                fpu_0 fpu_02 = bgt_02.dkC();
                fjn_0 fjn_02 = bhJ2.ffF();
                fjn_02.c(cvg_02.dkC());
                fjn_02.ix(cvg_02.aJG());
                if (bhJ2.Sn() != bgt_02.Sn() && fpu_02 == fpu_0.sRd) {
                    return false;
                }
                if (bhJ2.Sn() != bgt_02.Sn() || fpu_02 == fjn_02.dkC()) {
                    bhJ2.djo();
                    return false;
                }
                bgg_0.dlO().m((TObjectProcedure<bgy>)((TObjectProcedure)bgy2 -> {
                    if (bgy2.dkC() == fpu_0.sRd) {
                        return true;
                    }
                    bgy2.djo();
                    return true;
                }));
                return false;
            }
            case 12230: {
                cvf_0 cvf_02 = (cvf_0)aam_22;
                long l = cvf_02.eDN();
                ni_1 ni_12 = bzj_2.eqi().my(l);
                if (ni_12 == null) {
                    return false;
                }
                if (!(ni_12 instanceof bbl_1)) {
                    return false;
                }
                ((bbl_1)ni_12).dk(true);
                return false;
            }
            case 15003: {
                cya_0 cya_02 = (cya_0)aam_22;
                boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.lkz);
                for (fps_0 fps_02 : cya_02.eFB()) {
                    String string = aum_0.cWf().a(77, fps_02.bhh(), new Object[0]);
                    if (fps_02.dPE() == fpR.sQU && bl) {
                        biw_1.mU(aum_0.cWf().c("pvp.extraction.notification", string)).dZz();
                    }
                    cyt_1.eXX().eXY().a(fps_02, string);
                }
                return false;
            }
            case 14174: {
                cyb_0 cyb_02 = (cyb_0)aam_22;
                fpu_0 fpu_03 = cyb_02.eFC();
                Optional optional = bbs_2.a(eva_1.owx);
                if (optional.isEmpty()) {
                    return false;
                }
                fpQ fpQ2 = (fpQ)optional.get();
                if (fpu_03 != fpu_0.sRd) {
                    fpQ2.d(fpu_03);
                }
                cyt_1.eXX().eXY().b(fpu_03);
                return false;
            }
            case 13482: {
                cve_0 cve_02 = (cve_0)aam_22;
                cux_2.eSa().d(cve_02.eDM());
                return false;
            }
            case 13078: {
                Object object;
                Object object2;
                cuv_0 cuv_02 = (cuv_0)aam_22;
                long l = cuv_02.bDG();
                byte[] byArray = cuv_02.eDA();
                byte[] byArray2 = cuv_02.eDB();
                fpv fpv2 = fpd_0.gs(ByteBuffer.wrap(byArray));
                bfi_0 bfi_02 = new bfi_0(fpv2);
                bfi_02.jm(l);
                try {
                    ffT ffT2;
                    Object r;
                    object2 = zW.cH(byArray2);
                    object = ((zW)object2).aBl();
                    bfi_02.lu(((AS)object).aBH());
                    bfi_02.db(((AS)object).KU());
                    for (Ab generatedMessageV3 : ((AS)object).aFh()) {
                        if (generatedMessageV3.aBE() == ax_0.arR) {
                            r = fgD.fXh().Vd(blr_2.ksC.AK());
                            ffT2 = new ffT((fhc_0)r);
                            bfi_02.a(ffT2);
                            bfi_02.BK((int)generatedMessageV3.aBF());
                            continue;
                        }
                        if (generatedMessageV3.aBE() == ax_0.arS) {
                            r = fgD.fXh().Vd(blr_2.ksD.AK());
                            ffT2 = new ffT((fhc_0)r);
                            ffT2.ak((short)generatedMessageV3.aBF());
                            bfi_02.c(ffT2);
                            continue;
                        }
                        if (generatedMessageV3.aBE() != ax_0.arT) continue;
                        r = fgD.fXh().Vd(blr_2.ksE.AK());
                        ffT2 = new ffT((fhc_0)r);
                        ffT2.ak((short)generatedMessageV3.aBF());
                        bfi_02.d(ffT2);
                    }
                    for (aj_0 aj_02 : ((AS)object).aFe()) {
                        r = fgD.fXh().Vd(aj_02.acs());
                        ffT2 = new ffT((fhc_0)r);
                        ffT2.ak((short)aj_02.aEv().aBF());
                        bfi_02.b(ffT2);
                    }
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    lQW.error((Object)"Problem unserializing rewards data");
                }
                csq_1.eOb().c(bfi_02);
                object2 = fse_1.gFu().vY("battlegroundView");
                if (object2 instanceof bfi_0 && ((bfi_0)(object = (bfi_0)object2)).dfI().d() == fpv2.d()) {
                    fse_1.gFu().f("battlegroundView", bfi_02);
                }
                aue_0.cVJ().a(csq_1.eOb());
                return false;
            }
            case 12505: {
                cvc_0 cvc_02 = (cvc_0)aam_22;
                cux_0.mjE.b(cvc_02.dfI());
                return false;
            }
            case 13920: {
                cuw_0 cuw_02 = (cuw_0)aam_22;
                Optional<fpv> optional = cux_0.mjE.eDE();
                if (optional.isPresent()) {
                    fpv fpv3 = optional.get();
                    if (cuw_02.eDC()) {
                        fpv3.Yx(cuw_02.auH());
                    } else {
                        fpv3.Yv(cuw_02.auH());
                    }
                }
                return false;
            }
            case 12782: {
                cvd_0 cvd_02 = (cvd_0)aam_22;
                Optional<fpv> optional = cux_0.mjE.eDF();
                if (optional.isEmpty()) {
                    return false;
                }
                fpv fpv4 = optional.get();
                if (fpv4.d() != cvd_02.cln()) {
                    return false;
                }
                fpv4.Yv(cvd_02.eDI());
                fpv4.Yx(cvd_02.eDJ());
                fpv4.fv(cvd_02.eDK());
                fpv4.fw(cvd_02.eDL());
                css_1.eOc().eOd();
                return false;
            }
        }
        return true;
    }

    private void a(cuy_0 cuy_02) {
        cux_0.mjE.a(cuy_02.dfI());
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
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
    }

    public void ebq() {
        cxu_0 cxu_02 = new cxu_0(aue_0.cVJ().cVK().Sn());
        aue_0.cVJ().etu().d(cxu_02);
    }
}


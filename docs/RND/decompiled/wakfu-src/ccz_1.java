/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.WakfuClient;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from ccz
 */
public class ccz_1
implements adi_1 {
    protected static final Logger lPb = Logger.getLogger(ccz_1.class);
    private static final ccz_1 lPc = new ccz_1();
    private boolean lPd;

    public static ccz_1 etG() {
        return lPc;
    }

    public void jc(boolean bl) {
        this.lPd = bl;
    }

    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 23764: {
                czb czb2 = (czb)aam_22;
                this.a(czb2);
                return false;
            }
            case 23689: {
                cza cza2 = (cza)aam_22;
                this.a(cza2);
                return false;
            }
            case 22489: {
                cyt_0 cyt_02 = (cyt_0)aam_22;
                this.a(cyt_02);
                return false;
            }
            case 23345: {
                ccz_1.a((cyy_0)aam_22, this);
                return false;
            }
            case 22830: {
                this.etH();
                return false;
            }
            case 22621: {
                cyv_0 cyv_02 = (cyv_0)aam_22;
                this.a(cyv_02);
                return false;
            }
            case 23946: {
                cyw_0 cyw_02 = (cyw_0)aam_22;
                csm_1.eOv().a(cyw_02);
                return false;
            }
            case 428: {
                ciD ciD2 = (ciD)aam_22;
                if (ciD2.evi() != 0 && ciD2.evi() != 101) {
                    fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCt).l("error.worldSelection", new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
                    crh_2.eML().bCj();
                }
                return false;
            }
            case 23251: {
                fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCw).l("error.connection.deleteUnderModeration", new Object[0]).vG(ccp_2.mRF.byf()).abQ(2));
                return false;
            }
            case 15: {
                ny_0 ny_02 = (ny_0)aam_22;
                if (ny_02.aWp() == 1) {
                    ccv_1.etD().a(aam_22, "error.connection.loginServerDown", new Object[0]);
                    aue_0.cVJ().b(this);
                }
                return false;
            }
            case 439: {
                cco_0.a((cis_0)aam_22);
                return false;
            }
            case 23974: {
                cyz_0 cyz_02 = (cyz_0)aam_22;
                csm_1.eOv().kc(false);
                if (!cyz_02.aGv()) {
                    return false;
                }
                bgt_0 bgt_02 = (bgt_0)bgr_0.dmo().jB(cyz_02.eFQ());
                bgt_0 bgt_03 = (bgt_0)bgr_0.dmo().jB(cyz_02.eFR());
                bgt_02.bv(cyz_02.eFS());
                bgt_03.bv(cyz_02.eFT());
                bib_0.ilf.c(bgt_02, bgt_03);
                return false;
            }
        }
        return true;
    }

    private void a(czb czb2) {
        bgr_0.dmo().bl(czb2.eFW());
    }

    private void a(cza cza2) {
        ArrayList<byte[]> arrayList = cza2.eFU();
        if (!aue_0.cVJ().c(csm_1.eOv())) {
            aue_0.cVJ().a(csm_1.eOv());
        }
        aue_0.cVJ().b(cce_1.lPv);
        cca_1 cca_12 = new cca_1(this, arrayList.size());
        try {
            bgr_0.dmo().a(arrayList, cca_12);
        }
        catch (Exception exception) {
            lPb.error((Object)"Probl\u00e8me \u00e0 la d\u00e9s\u00e9rialisation de la liste des personnages", (Throwable)exception);
        }
        bgr_0.dmo().a(cza2.eFV());
        if (bgr_0.dmo().dmr() > 0) {
            bgy bgy2 = bgr_0.dmo().dms();
            csm_1.eOv();
            csm_1.bX(bgy2);
        }
        bgr_0.dmo().dmw();
        short s = bgr_0.dmo().dmy();
        fse_1.gFu().f("hideDownscaling", eIA.dF(s));
        if (arrayList.isEmpty()) {
            ccz_1.etI();
        } else {
            crh_2.eML().bCi().g(aum_0.cWf().c("charactersLoading.progress", new Object[0]), 0);
        }
    }

    private void a(cyt_0 cyt_02) {
        if (cyt_02.eFM().aGv()) {
            long l = cyt_02.KU();
            fcL.rUh.ss(l);
            bgr_0.dmo().jA(l);
            csm_1.eOv().eOz();
            bgr_0.dmo().dmw();
            fhp.sop.aK(aue_0.cVJ().cVO().xl(), l);
            bbs_2.a(eva_1.owq).ifPresent(eig_02 -> eig_02.jt(l));
        } else {
            String string = cyt_02.eFM() == eie_0.qwO ? "error.character.deletion.daily.limit" : "error.characterDeletion";
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCw).l(string, new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
        }
    }

    private void etH() {
        aue_0.cVJ().b(lPc);
        aue_0.cVJ().a(ccv_1.etD());
        bgr_0.dmo().dmp();
        ccz_1.etI();
    }

    private void a(cyv_0 cyv_02) {
        long l = cyv_02.KU();
        String string = cyv_02.eFO();
        long l2 = cyv_02.eFP();
        csm_1.eOv().a(l, l2, string, true);
    }

    public static boolean a(cyy_0 cyy_02, adi_1 adi_12) {
        if (cyy_02.evi() == 0) {
            aue_0.cVJ().b(adi_12);
            aue_0.cVJ().a(cdw_0.lQP);
            aue_0.cVJ().a(cdb.lQg);
            aue_0.cVJ().a(cdv_0.euj());
            aue_0.cVJ().a(cdq.lQA);
            aue_0.cVJ().a(cdl_0.lQX);
            aue_0.cVJ().a(cdr_0.lRi);
            aue_0.cVJ().a(chc.lTY);
            aue_0.cVJ().a(cdm_0.lQY);
            if (fse_1.gFu().dp("demo")) {
                aue_0.cVJ().a(cek_0.euy());
            }
            aUm.cUI().p("world", true);
            aUm.cUI().p("common", true);
            aUm.cUI().p("binding", true);
            bgr_0.dmo().dmp();
            aie_0.cfn().cfJ();
            return true;
        }
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCx).l("error.characterSelection", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
        return false;
    }

    public static void etI() {
        crh_2.eML().bCj();
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
            if (!aue_0.cVJ().c(cdw_0.lQP)) {
                aue_0.cVJ().a(cdw_0.lQP);
            }
            if (WakfuClient.dSV.cfl().cgg()) {
                lPb.info((Object)"[WEB-TOKEN-DEBUG] Send request for shopApiKey !");
            }
            aue_0.cVJ().etu().d(new cyl_0(aum_0.cWf().aUXX().aUP()));
            if (this.lPd) {
                aue_0.cVJ().a(csm_1.eOv());
            }
            bon.dAK().setEnabled(false);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            fyw_0.gqw().tl("renameCharacterDialog");
            aue_0.cVJ().b(csm_1.eOv());
        }
    }
}


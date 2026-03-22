/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankama.haapi.client.okhttp.ApiCallback$Callback
 *  com.ankama.haapi.client.okhttp.ApiCallback$Request
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$getCallback
 *  com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi$getRequest
 *  com.google.protobuf.InvalidProtocolBufferException
 *  gnu.trove.iterator.TIntObjectIterator
 *  org.apache.log4j.Level
 *  org.apache.log4j.Logger
 */
import com.ankama.haapi.client.okhttp.ApiCallback;
import com.ankama.haapi.client.okhttp.ankama.api.CmsPollInGameApi;
import com.ankamagames.wakfu.client.WakfuClient;
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import com.ankamagames.wakfu.client.chat.console.command.TimeCommand;
import com.google.protobuf.InvalidProtocolBufferException;
import gnu.trove.iterator.TIntObjectIterator;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/*
 * Renamed from cdV
 */
public class cdv_0
implements adi_1 {
    static final Logger lRu = Logger.getLogger(cdv_0.class);
    private static final cdv_0 lRv = new cdv_0();
    private static final int lRw = 59;
    public static final int lRx = 977;
    public static final String lRy = "WAKFU";
    private long lRz;
    private long lRA;
    private boolean lRB;
    private adi_1[] lRC;
    private adi_1[] lRD;
    private ArrayList<adi_1> lRE;
    private ceb_0 lRF;

    public static cdv_0 euj() {
        return lRv;
    }

    public long euk() {
        return this.lRz;
    }

    public long eul() {
        return this.lRA;
    }

    public static void a(bgy bgy2, long l, bgt_0 bgt_02) {
        Object object;
        bdj_2 bdj_22 = bgt_02.ddI();
        bdj_22.setVisible(true);
        if (bgt_02.bwb()) {
            if (bgt_02.dpf() == null) {
                cdv_0.W(bgt_02);
            }
            object = bgt_02.dpf();
            bdj_22.a(bdj_22.a((bjo_0)object));
            bdj_22.bwc();
        }
        bdj_22.bpC();
        bdj_22.c(bzj_2.eqi());
        bgt_02.b(bgy2.aZw());
        bdj_22.a(bzj_2.eqi());
        bdj_22.dds();
        bgt_02.a(bgy2.bcB());
        bdj_22.a(bzt_1.lCY);
        bdj_22.fp(true);
        bdj_22.p(bgt_02);
        bgt_02.fK(l);
        bdj_22.ddp();
        adn_0.bvh().g(bdj_22);
        object = aie_0.cfn().bmC();
        ((afV)object).b(bdj_22);
        ((aaj_0)object).bqT();
    }

    public static void U(bgt_0 bgt_02) {
        cdv_0.V(bgt_02);
        bgt_02.fZ(true);
        bgt_02.djv();
        bgt_02.djo();
        bgt_02.ddO();
    }

    public static void V(bgt_0 bgt_02) {
        cdv_0.X(bgt_02);
        cdv_0.W(bgt_02);
    }

    public static void W(bgt_0 bgt_02) {
        Optional<ffV> optional = bgt_02.dnP().B(bgt_02.dmL().t(ffS.sgZ));
        if (optional.isPresent() && optional.get().adO()) {
            fnl_0 fnl_02 = optional.get().ead();
            fb_2 fb_22 = ekj_0.b(bgt_02.aZj(), bgt_02.Sn(), fm_1.pu);
            bgt_02.c(fnl_02.geL().d(), ekj_0.a(fnl_02, fb_22), ekj_0.b(fnl_02, fb_22), fnl_02.agT(), fnl_02.agM());
        }
    }

    private static void X(bgt_0 bgt_02) {
        Optional<ffV> optional = bgt_02.dnP().B(bgt_02.dmL().t(ffS.sgX));
        if (optional.isPresent() && optional.get().adO()) {
            fnr_0 fnr_02 = (fnr_0)optional.get().ead();
            fb_2 fb_22 = ekj_0.b(bgt_02.aZj(), bgt_02.Sn(), fm_1.pv);
            bgt_02.b(fnr_02.geL().d(), ekj_0.a(fnr_02, fb_22), ekj_0.b(fnr_02, fb_22), fnr_02.agT(), fnr_02.agM());
        }
    }

    private static void a(aue_0 aue_02) {
        bdj_2 bdj_22;
        bgt_0 bgt_02 = aue_02.cVK();
        long l = bgt_02.aqZ();
        cdv_0.eum();
        bqm_0.jbp.b(new bry(l));
        long l2 = WX.bhh();
        lRu.info((Object)("on quitte le monde " + l2));
        aIq.cgr().ia(l2);
        bgt_02.dpc();
        bgt_02.dpd();
        bdj_2 bdj_23 = bdj_22 = bgt_02 == null ? null : bgt_02.ddI();
        if (bdj_22 != null) {
            adn_0.bvh().k(bdj_22);
            bdj_22.dcO();
        }
        bzj_2.eqi().clear();
        cyi_2.eXN().clear();
        aie_0.cfn().cfH();
    }

    private static void Y(bgt_0 bgt_02) {
        if (bgt_02.dkG()) {
            if (fyw_0.gqw().to("furnitureListDialog")) {
                fyw_0.gqw().tl("furnitureListDialog");
            }
            if (fyw_0.gqw().to("havenWorldResourcesCollectorDialog")) {
                fyw_0.gqw().tl("havenWorldResourcesCollectorDialog");
            }
        }
        cvh_1 cvh_12 = bDr.dQP();
        if (aue_0.cVJ().c(cvh_12)) {
            aue_0.cVJ().b(cvh_12);
        }
    }

    private static void eum() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        long l = bgt_02.Xi();
        TIntObjectIterator<bsS> tIntObjectIterator = bsU.dHk().dHl();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bsS bsS2 = (bsS)tIntObjectIterator.value();
            List<bgy> list = bsS2.dGs().stream().filter(Objects::nonNull).filter(bgy2 -> bgy2.Xi() != l).toList();
            list.forEach(bgy2 -> bgg_0.dlO().av((bgy)bgy2));
        }
    }

    private static void a(adi_1 ... adi_1Array) {
        aue_0 aue_02 = aue_0.cVJ();
        for (adi_1 adi_12 : adi_1Array) {
            if (aue_02.c(adi_12)) continue;
            aue_02.a(adi_12);
        }
    }

    public static void Z(bgt_0 bgt_02) {
        aub_0.cVb().dm(bgt_02.getName());
        bsg_1 bsg_12 = (bsg_1)aie_0.cfn().bmH();
        bqm_0.jbp.dEE();
        bsz_2 bsz_22 = (bsz_2)bsg_12.fO(bgt_02.Sn());
        if (bsz_22 == null) {
            bsz_2 bsz_23 = new bsz_2(bgt_02);
            bsg_12.a(bsz_23);
            try {
                bsz_23.buq();
            }
            catch (IOException iOException) {
                lRu.warn((Object)"Error occurred on load of AccountPreferenceStore", (Throwable)iOException);
            }
        } else {
            bsz_2 bsz_24 = (bsz_2)bsg_12.bxm();
            bsg_12.a(bsz_24.KU(), bsz_24);
            bsg_12.a(bsz_22);
        }
        bqo_0.dEF();
        bgt_02.dlE().dqR();
        if (!aub_0.cVb().i((byte)3, "displayAllCharacteristics")) {
            aub_0.cVb().b((byte)3, "displayAllCharacteristics", false);
        }
    }

    private static void eun() {
        Ox ox = new Ox();
        aue_0.cVJ().etu().d(ox);
    }

    private void aa(bgt_0 bgt_02) {
        if (exc.oTO.contains(bgt_02.aqZ())) {
            return;
        }
        CmsPollInGameApi.getRequest getRequest2 = CmsPollInGameApi.getRequest().site(lRy).lang(aum_0.cWf().aUXX().aUP()).page(Long.valueOf(1L)).count(Long.valueOf(10L));
        CmsPollInGameApi.getCallback getCallback2 = CmsPollInGameApi.getCallback().on200(apiResponse -> cxc_2.aC((List)apiResponse.getData())).onDefault(apiResponse -> lRu.error((Object)("Error when consulting Polls " + (String)apiResponse.getData()))).onException(throwable -> lRu.error((Object)"Error when consulting Polls ", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)getRequest2, (ApiCallback.Callback)getCallback2);
    }

    private void euo() {
        bci_2.hDG.daR();
        bcx_2 bcx_22 = (bcx_2)fse_1.gFu().aW("displayedAchievement", "logBookDialog");
        if (bcx_22 != null) {
            bcx_22.daR();
        }
    }

    private void eup() {
        this.lRC = new adi_1[]{cvu_1.eUX(), cye_1.eYk(), czi_2.eYU(), cwd_2.eVe(), cwp_2.eVR(), cxx_2.eXH(), csj_2.eOt(), csz_1.ePn(), cxq_1.eWO(), cux_1.eTn(), cwy_2.nUc, cxe_1.eXq(), cyk_1.eXO(), cyq_1.eXS(), cuf_2.eRt(), csc_1.eNJ(), cyt_1.eXX(), cwz_1.eWv(), cxx_1.eXf(), cuz_1.eTq(), cty_1.ePV()};
        this.lRE = new ArrayList<adi_1>(Arrays.asList(this.lRC));
    }

    private void euq() {
        this.lRD = new adi_1[]{cco_0.etB(), cdO.eug(), cer_0.lSi, ccn_0.lOz, cde_0.lQm, cdp.lQy, cdn_0.lRa, cdU.lRt, cdd_0.lQk, cdt_0.eub(), ceH.euE(), cco_1.etV(), cdu_0.euc(), ccm_0.etT(), cdJ.lQU, cct_1.etY(), ccn_1.etU(), aXJ.hxe, cci_1.lPB, cdh_0.lQS, cdj_0.lQp, cdf_0.lQn, ccg_1.lPx, cch_1.lPz, cgv_0.lTS, ccv_0.lQc, chb_0.lTX, chJ.lUg, cel_0.lSc, bnc_1.kAp};
    }

    public void eur() {
        this.euq();
        cdv_0.a(this.lRD);
    }

    public void eus() {
        this.eup();
        cdv_0.a(this.lRC);
    }

    public void eut() {
        this.eup();
        aue_0 aue_02 = aue_0.cVJ();
        for (adi_1 adi_12 : this.lRC) {
            if (aue_02.c(adi_12)) {
                aue_02.b(adi_12);
                continue;
            }
            this.lRE.remove(adi_12);
        }
        byj_1.epo().epq();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(aam_2 aam_22) {
        aue_0 aue_02 = aue_0.cVJ();
        aie_0 aie_02 = aie_0.cfn();
        switch (aam_22.d()) {
            case 12292: {
                com com2 = (com)aam_22;
                byte[] byArray = com2.evU();
                bex_1.dSm().removeAll();
                for (int i = 0; i < com2.ewb().length; ++i) {
                    bex_1.dSm().lj(com2.ewb()[i]);
                }
                cAY.eHc().jy(false);
                fse_1.gFu().f("isAlive", true);
                bgt_0 bgt_02 = new bgt_0(false);
                bgr_0.dmo().ax(bgt_02);
                bgt_02.dkp();
                bgt_02.b(eIl.ey(com2.evZ()));
                bgt_02.a(eHN.ex(com2.ewa()));
                bgt_02.as(byArray);
                cAY.eHc().jy(true);
                bsf.dEU().a(bse.dEP());
                cdv_0.Z(bgt_02);
                aue_02.f(bgt_02);
                fcL.rUh.d(bgt_02.aZj(), bgt_02);
                fse_1.gFu().f("heroesPartyIsFull", false);
                int n2 = bgt_02.e(exx_2.rGi).aYC();
                bgt_02.aPg();
                Object object = fjt.syH.eCu();
                while (object.hasNext()) {
                    object.advance();
                    ((fjo_0)object.value()).a(new bra_2((fjo_0)object.value()));
                    ((fjo_0)object.value()).a(brx_2.laQ);
                }
                eim_0.qxx.pI(bgt_02.Sn());
                abo_2.dyC.b(bna_0.kDO);
                bgt_02.OC(n2);
                cAY.eHc().eGW();
                bly_0.ivl.bkZ();
                boi.iMT.clear();
                frn.sXO.a(byl_2.lyU);
                cgw_2.mYX = true;
                this.lRz = abb_2.bUA().a(new cdW(this, bgt_02), 300000L, 159159160, -1L);
                this.lRA = abb_2.bUA().a(new cdx_0(this, aue_02), 4000L, 159159161);
                fse_1.gFu().f("isInDimensionalBag", false);
                fse_1.gFu().f("isInOwnDimensionalBag", false);
                fse_1.gFu().f("isInJail", false);
                fse_1.gFu().f("hasOccupation", false);
                fse_1.gFu().f("inventory.occupation.allows.interaction", true);
                object = (bsg_1)aie_02.bmH();
                try {
                    if (((aez_0)object).a(bsn_1.liu)) {
                        aPt.cAg().cAx();
                        ((aez_0)object).a((afe)bsn_1.liu, false);
                    }
                    aym_0.cYm();
                }
                catch (Exception exception) {
                    lRu.error((Object)("Erreur \u00e0 l'initialisation du chat, impossible de le charger : " + exception.getMessage()));
                }
                bgt_02.dkq();
                fcK.rUe.ar(bgt_02.aZj(), bgt_02.Sn());
                fse_1.gFu().f("heroesParty", List.of(bgt_02));
                fcL.rUh.au(bgt_02.aZj(), bgt_02.Sn());
                boolean bl = fcI.fSM();
                fse_1.gFu().f("heroesEnabled", bl);
                fse_1.gFu().f("hideDownscaling", eIA.pH(bgt_02.Xi()));
                blh_1 blh_12 = new blh_1(bgt_02);
                ArrayList<blh_1> arrayList = new ArrayList<blh_1>();
                arrayList.add(0, blh_12);
                fse_1.gFu().f("mainCharacterViewForTemplate", arrayList);
                if (bl || fcI.fSN()) {
                    ctu_2.nJd.ePN();
                }
                bMV.a(bgt_02.dnM(), bgt_02.dkB(), bgt_02.dlG());
                if (aue_02.c(ccp_1.etW())) {
                    aue_02.b(ccp_1.etW());
                }
                fse_1.gFu().f("exchange.itemTrade", (Object)null);
                evp_2 evp_22 = evp_2.H(aue_0.cVJ().cVO().cWq());
                if ((evp_22 == evp_2.ovB || evp_22 == evp_2.ovz || evp_22 == evp_2.ovy) && ewo_0.oBF.k(ewr_0.oEq)) {
                    aPd.f("moderationPanel.invisibleNotif", new Object[0]);
                }
                this.aa(bgt_02);
                aue_0.cVJ().etu().d(new cnr_0(aue_0.cVJ().cVK().Sn()));
                aue_0.cVJ().etu().d(new clM());
                return false;
            }
            case 12065: {
                bsj_0 bsj_02;
                bgt_0 bgt_03 = aue_0.cVJ().cVK();
                if (bgt_03 == null) {
                    // empty if block
                }
                if ((bsj_02 = bgt_03.dnB()) != null) {
                    aVi.cWF().zY(bsj_02.d());
                    btw_0 btw_02 = new btw_0();
                    btw_02.bGy();
                }
                cdv_0.Y(bgt_03);
                cdv_0.a(aue_02);
                return false;
            }
            case 12830: {
                Object object;
                boolean bl;
                void var16_161;
                Object object2;
                cok cok2 = (cok)aam_22;
                long l = WX.bhh();
                fyw_0.gqw().gqL();
                aie_0.cfn().cfG();
                bzj_2.eqi().clear();
                if (aue_0.cVJ().c(cwh_1.eVi())) {
                    aue_0.cVJ().b(cwh_1.eVi());
                }
                if (aue_02.c(ccp_1.etW())) {
                    aue_02.b(ccp_1.etW());
                }
                WX.clear();
                bgo_0 bgo_02 = new bgo_0();
                ((exP)bgo_02).dmj().a(((exP)bgo_02).dmj().fis(), cok2.evU());
                ((exP)bgo_02).dmj().a(((exP)bgo_02).dmj().fir(), cok2.evU());
                ((exP)bgo_02).dmj().a(((exP)bgo_02).dmj().fiv(), cok2.evU());
                long l2 = bgo_02.aqZ();
                eMW eMW2 = eMX.eC(cok2.evX());
                can_0.lHv.b(l2, eMW2);
                fse_1.gFu().f("currentInstanceMaxLevel", eMW2.Fq());
                fcL.rUh.b(aue_02.cVO().xl(), exP2 -> {
                    bzj_2.eqi().b((afp)((Object)exP2));
                    return true;
                });
                aub_0.cVb().fK(l2);
                bzq_2 bzq_22 = bzp_2.eqt().mA(l2);
                boolean bl3 = caf_2.lFq.eqR();
                if (bl3) {
                    caf_2.lFq.eqL();
                    aue_02.a(cut_1.eTd());
                } else if (cap_1.erG().erI()) {
                    cap_1.erG().mK(l2);
                } else {
                    WX.a(l2, WV.bnj());
                }
                if (!bl3 && l2 != 9L) {
                    aue_02.b(cut_1.eTd());
                }
                fse_1.gFu().f("isInHavenWorld", bl3);
                fse_1.gFu().f("isInOwnHavenWorld", bDr.la(l2));
                fse_1.gFu().a((aef_2)bTj.eno(), "havenBagCharacterPortrait");
                bzl_2.eqr().fy(l2);
                acd_1 acd_12 = bgo_02.aZw();
                bTl.lnl.Ck(-1);
                bjx_0.klY.clear();
                ArrayList<byte[]> arrayList = cok2.evV();
                for (byte[] byArray : arrayList) {
                    object2 = (bJr)bJD.kmg.gq(ByteBuffer.wrap(byArray));
                    bjx_0.klY.c((bJr)object2);
                }
                ArrayList<fnd_0> arrayList2 = cok2.evW();
                int bl2 = arrayList2.size() - 1;
                while (var16_161 >= 0) {
                    object2 = (fnd_0)arrayList2.get((int)var16_161);
                    if (((fnd_0)object2).ems() != null) {
                        if (((fnd_0)object2).ems().gbC().Xc(((fnd_0)object2).d())) {
                            fnf_0.ah(((fnd_0)object2).d(), ((fnd_0)object2).exj());
                            fnf_0.gb(((fnd_0)object2).d(), ((fnd_0)object2).emO());
                        } else {
                            fnf_0.c((fnd_0)object2);
                        }
                    }
                    --var16_161;
                }
                bJJ.kmp.lC(l2);
                if (l != l2) {
                    bfP.dhT().a(ewc_0.oIj);
                    bfP.dhT().dhX();
                }
                acz_0.cgH.btI();
                ue_0.bjV().b(acz_0.cgH);
                ue_0.bjV().b(aJy.chI());
                aJy.chI().ep(false);
                boolean bl4 = bzq_22.lEx;
                if (bl4) {
                    acz_0.cgH.c(ue_0.bjV());
                    ue_0.bjV().a(acz_0.cgH);
                    ue_0.bjV().a(aJy.chI());
                    aJy.chI().ep(true);
                }
                ue_0.bjV().a(cBs.mxw);
                fse_1.gFu().f("wakfuEcosystemEnabled", false);
                fse_1.gFu().f("isInExterior", bl4);
                fse_1.gFu().f("isInWakfuStasisInstance", bzq_22.lEB);
                fse_1.gFu().f("player.displayStates", true);
                fse_1.gFu().f("osamodasSymbiotCreatureCapturedState", false);
                fse_1.gFu().f("havenWorld", (Object)null);
                fse_1.gFu().f("basicHavenWorld", (Object)null);
                fse_1.gFu().f("exchange.itemTrade", (Object)null);
                fse_1.gFu().f("equipment.can.transfer.bag", false);
                fse_1.gFu().f("isInDungeon", cdv_0.c(bzq_22));
                fse_1.gFu().f("isInBattleground", bzq_22.eqw());
                fse_1.gFu().f("isInJail", cdv_0.mQ(l2));
                long l3 = ewo_0.oBF.j(ewr_0.oCk);
                fse_1.gFu().f("max.character.level", String.valueOf(l3));
                fse_1.gFu().f("spellsRestatManager", (Object)null);
                fse_1.gFu().f("stasisDungeonInfoView", cdv_0.c(bzq_22) ? bog.iMI : null);
                try {
                    bl = auc_0.cVq().aK("activateStuffPreview");
                }
                catch (fu_0 fu_02) {
                    bl = false;
                }
                fse_1.gFu().f("stuffPreviewActivated", bl);
                this.eus();
                this.eur();
                aUm.cUI().cD(true);
                aam_0 aam_02 = aie_02.bmC();
                aam_02.bqL().co(false);
                if (bl4) {
                    acq_0.cge.a(acz_0.cgH);
                    acq_0.cge.a(aJs.eaS);
                }
                bgt_0 bgt_02 = aue_0.cVJ().cVK();
                bdj_2 bdj_22 = bgt_02.ddI();
                bdj_22.bqb();
                bRq.ekK().ekL();
                bir_1.dZt().removeAll();
                bzl_2.eqr().clear();
                caz_1.lId.clear();
                cAY.eHc().eHy();
                agX.c(bdj_22);
                WX.a(aam_02, acd_12.getX(), acd_12.getY(), acd_12.bdi());
                bzj_2.eqi().o(bgo_02.bcC(), bgo_02.bcD(), true);
                bzl_2.eqr().eg(bzj_2.eqi().eqm(), bzj_2.eqi().eqn());
                boa_2.ehn().b(bzq_22);
                bsw_2.lgW.aPg();
                bgt_02.dkp();
                if (bgg_0.dlO().ju(bgt_02.Sn()) == null) {
                    bgg_0.dlO().aq(bgt_02);
                }
                cdv_0.a(bgo_02, l2, bgt_02);
                bif_2.dYO().dXL();
                adu.buC().fJ(l2);
                this.euo();
                cAY.eHc().eHz();
                int n2 = bgt_02.e(exx_2.rGi).aYC();
                bgt_02.e(bgt_02.fgg());
                bgt_02.e(exx_2.rGi).op(n2);
                if (l2 == 9L) {
                    object = bgt_02.dnw();
                    aaa_0.brC().a((aaB)object);
                    aaa_0.brC().a((aan_0)object);
                    ((bnv_2)object).dyK();
                    bni_1.dyk().b((bnv_2)object);
                }
                bni_1.dyk().b(bdj_22);
                aam_02.bM(true);
                object = new cdy_0(this, aam_02, bgt_02, l2, bzq_22, aie_02, bdj_22, acd_12);
                if (asj_2.bJt().bJu()) {
                    asj_2.bJt().a((asi_2)object);
                } else {
                    object.buf();
                    object.bue();
                    object.bug();
                }
                aam_02.dw(true);
                cdv_0.U(bgt_02);
                bon.dAK().setEnabled(true);
                fyw_0.gqw().d("wakfu.windowStick", chx_1.class);
                bqm_0.jbp.b(new brn_0(l, l2));
                ckm_0 ckm_02 = new ckm_0();
                ckm_02.os(aum_0.cWf().aUXX().aUR());
                aue_0.cVJ().etu().d(ckm_02);
                bgt_02.dkq();
                AwayCommand.cAY();
                cxh_2.eWL();
                if (this.lRB) {
                    this.lRB = false;
                    cdv_0.eun();
                }
                aym_0.cYl().cYn();
                bgn_1.dUk().dUm();
                boolean bl5 = evm_2.a(bgt_02.dpL().cWq(), evp_2.ovz);
                fse_1.gFu().f("isInAdministratorGroup", bl5);
                ccd_2.eti().iZ(bl5);
                if (cvu_2.eQx()) {
                    cvu_2.eTO().eTT();
                }
                return false;
            }
            case 13121: {
                String string2 = aum_0.cWf().c("player.unstuck", new Object[0]);
                cdv_0.on(string2);
                return false;
            }
            case 12045: {
                ctg ctg2 = (ctg)aam_22;
                bgt_0 bgt_05 = aue_02.cVK();
                bnv_2 bnv_22 = bgt_05.dnw();
                if (bnv_22 == null) {
                    return false;
                }
                bnn_1 bnn_12 = bnv_22.dyV();
                bnn_12.au(ctg2.buM());
                bnn_12.ur(ctg2.ccf());
                if (bgt_05.dnx() == bnv_22) {
                    cwb_1.eVa().eVc();
                }
                bnv_22.dze();
                return false;
            }
            case 12915: {
                cuj cuj2 = (cuj)aam_22;
                lRu.debug((Object)("PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=" + cuj2.eDb() + ")"));
                bgt_0 bgt_06 = aue_02.cVK();
                if (cuj2.eDb()) {
                    bnv_2 bnv_23;
                    if (cuj2.eDd()) {
                        cdv_0.ab(bgt_06);
                        bnv_23 = bgt_06.dnx();
                        bnv_23.gH(cuj2.dyN());
                        bnv_23.gI(cuj2.dyO());
                        bnv_23.Ez(cuj2.dyP());
                    } else {
                        bnv_23 = new bnv_2();
                        bnv_23.b(cuj2.eDc());
                    }
                    bnv_23.dze();
                    bns_2.iHL.ke(bgt_06.aqZ());
                    fse_1.gFu().f("isInOwnDimensionalBag", cuj2.eDd());
                    fse_1.gFu().f("isInDimensionalBag", true);
                    bgt_06.a(bnv_23);
                    aue_02.a(ccl_1.etS());
                    aue_02.a(cut_1.eTd());
                    aue_02.b(cxk_1.eXu());
                    if (cuj2.eDd()) {
                        bon.dAK().a(bor.iPb, null);
                    }
                } else {
                    bgt_06.ddI().dT("AnimStatique");
                    if (cuj2.eDd()) {
                        bzj_2.eqi().mz(0L);
                    }
                    aue_02.cVK().fY(false);
                }
                return false;
            }
            case 12897: {
                lRu.debug((Object)"PERSONAL_SPACE_LEAVE_RESULT_MESSAGE");
                bgt_0 bgt_07 = aue_02.cVK();
                bnv_2 bnv_24 = bgt_07.dnw();
                bnv_24.dzb();
                aaa_0.brC().b(bnv_24);
                aaa_0.brC().b(bnv_24);
                aue_02.b(ctt_2.eRh());
                aue_02.b(ctp_2.eQZ());
                aue_02.b(cwe_1.eVh());
                aue_02.b(ctr_1.eRg());
                aue_02.b(cto_2.eQY());
                aue_02.b(ctg_1.eQG());
                aue_02.b(cut_1.eTd());
                if (fyw_0.gqw().to("exchangeDialog")) {
                    aue_02.b(cup_1.eRM());
                }
                if (aue_02.c(cur_1.eRP())) {
                    aue_02.b(cur_1.eRP());
                }
                cwd_2.eVe().eVg();
                if (fyw_0.gqw().to("furnitureListDialog")) {
                    fyw_0.gqw().tl("furnitureListDialog");
                }
                bni_1.dyk().dyl();
                fse_1.gFu().f("isInDimensionalBag", false);
                fse_1.gFu().f("isInOwnDimensionalBag", false);
                aue_02.b(ccl_1.etS());
                return false;
            }
            case 13584: {
                cwk_0 cwk_02 = (cwk_0)aam_22;
                int n4 = cwk_02.ezG();
                ero_0 ero_02 = (ero_0)enf_0.fBb().pU(n4);
                if (ero_02 != null) {
                    QD qD = ero_02.bbo();
                    qD.a(aue_0.cVJ().cVK().dke());
                    qD.dr(cwk_02.ezH());
                    bgy bgy2 = bvz_0.ju(cwk_02.Qy());
                    bgy2.ddI().b((ero_0)qD, false);
                    bgy2.doc().p(qD);
                }
                return false;
            }
            case 13559: {
                cwl_0 cwl_02 = (cwl_0)aam_22;
                long l = cwl_02.Qy();
                long l4 = cwl_02.eEK();
                bgy bgy3 = bvz_0.ju(l);
                if (bgy3 != null) {
                    QD qD = bgy3.doc().dm(l4);
                    if (qD != null) {
                        bgy3.f(qD);
                    } else {
                        lRu.error((Object)("R\u00e9ception d'un RunningEffectWorldUnapplicationMessage pour un runningEffect d'uid=" + l4 + " que le characterInfo=[" + String.valueOf(bgy3) + "] ne poss\u00e9de pas"));
                    }
                } else {
                    lRu.error((Object)("R\u00e9ception d'un RunningEffectWorldUnapplicationMessage pour un characterinfo inconnu d'id=" + l));
                }
                return false;
            }
            case 12265: {
                cwj_0 cwj_02 = (cwj_0)aam_22;
                byte by = cwj_02.eEH().aJr();
                QD qD = (QD)enf_0.fBb().pU(cwj_02.ezG());
                if (qD == null) {
                    lRu.error((Object)("Impossible d'instancier un runningEffect :" + cwj_02.ezG() + " inconnu"));
                    return false;
                }
                ero_0 ero_03 = (ero_0)qD.b(bas_2.cZC());
                ero_03.dr(cwj_02.ezH());
                if (cwj_02.eEI() != null) {
                    for (azy_1<Integer, Integer, Long> azy_12 : cwj_02.eEI()) {
                        bgy bgy4 = bvz_0.ju(azy_12.bTE());
                        aws_0 aws_02 = new aws_0(cwj_02.caO(), by, azy_12.getFirst(), ero_03, cwj_02.ezI());
                        aws_02.xR(azy_12.aHI());
                        aws_02.f(new aga_1(aws_02.caS()));
                        if (bgy4 == null || !bgy4.djT()) {
                            awm_0.cXG().h(aws_02);
                            continue;
                        }
                        aVi.cWF().a(bgy4.bqo(), (aft_2)aws_02);
                    }
                } else {
                    aws_0 aws_03 = new aws_0(cwj_02.caO(), by, cwj_02.avZ(), ero_03, cwj_02.ezI());
                    aws_03.xR(cwj_02.ezb());
                    awm_0.cXG().h(aws_03);
                    aws_03.f(new aga_1(aws_03.caS()));
                }
                awm_0.cXG().cbg();
                return false;
            }
            case 12963: {
                awm_0.cXG().cbg();
                return false;
            }
            case 12027: {
                ctt ctt2 = (ctt)aam_22;
                String string3 = aum_0.cWf().c("offlineFlea.transactionSummary", ctt2.eCg(), ctt2.eCf());
                cdv_0.on(string3);
                return false;
            }
            case 13806: {
                cto cto2 = (cto)aam_22;
                Object r = fgD.fXh().Vd(cto2.AK());
                String string4 = ((fhc_0)r).getName();
                String string5 = aum_0.cWf().c("onlineFlea.transaction", cto2.bfd(), string4, cto2.eCa());
                cdv_0.on(string5);
                return false;
            }
            case 23923: {
                cyu_0 cyu_02 = (cyu_0)aam_22;
                long l = cyu_02.eFN();
                short s = (short)(l / 31536000000L);
                short s2 = (short)((l -= (long)s * 31536000000L) / 2678400000L);
                short s3 = (short)((l -= (long)s2 * 2678400000L) / 86400000L);
                short s4 = (short)((l -= (long)s3 * 86400000L) / 3600000L);
                short s5 = (short)((l -= (long)s4 * 3600000L) / 60000L);
                short s6 = (short)((l -= (long)s5 * 60000L) / 1000L);
                aum_0 aum_02 = aum_0.cWf();
                aPd.f("dateFormat.yearMonthDayHourMinuteSecond.playedTime", s, s2, s3, s4, s5, s6);
                return false;
            }
            case 22953: {
                String string6;
                czo czo2 = (czo)aam_22;
                String string7 = czo2.xO();
                switch (czo2.eGj()) {
                    case 0: {
                        string6 = aum_0.cWf().c("who.is.user.result", string7, czo2.eGi(), czo2.bSr() ? 1 : 0, aub_0.cVb().cVp());
                        break;
                    }
                    case 1: {
                        string6 = aum_0.cWf().c("error.chat.userNotFound", string7);
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                cdv_0.on(string6);
                cdv_0.on(TimeCommand.cBa());
                lRu.info((Object)("Whois : " + string6));
                return false;
            }
            case 12913: {
                aWy[] aWyArray;
                cqj_0 cqj_02 = (cqj_0)aam_22;
                if (aue_0.cVJ().c(ceG.euA()) && cqj_02.eyR()) {
                    return true;
                }
                aWm aWm2 = aWm.a(cqj_02);
                awm_0.cXG().h(aWm2);
                for (aWy aWy2 : aWyArray = aWy.b(cqj_02)) {
                    awm_0.cXG().h(aWy2);
                }
                awm_0.cXG().cbg();
                return false;
            }
            case 13065: {
                cos_0 cos_02 = (cos_0)aam_22;
                byte by = cos_02.ewi();
                short s = cos_02.ewj();
                List<Short> list = cos_02.ewk();
                String string8 = cos_02.aav();
                int n5 = list.stream().mapToInt(Short::intValue).sum();
                String string9 = list.stream().map(Object::toString).collect(Collectors.joining(" + "));
                aPd.f("chat.random.result", string8, by, s, n5, string9);
                return false;
            }
            case 12145: {
                cpm cpm2 = (cpm)aam_22;
                foM foM2 = fpk.sNF.Yn(cpm2.clk());
                if (foM2 == null) {
                    lRu.warn((Object)"On re\u00e9oit un update de chaos de territoire pour un territoire non charg\u00e9.");
                    return false;
                }
                if (cpm2.exj()) {
                    ((fpi)foM2.gfO()).ean();
                } else {
                    ((fpi)foM2.gfO()).eao();
                }
                return false;
            }
            case 12054: {
                cpj cpj2 = (cpj)aam_22;
                Object object = "";
                Object object3 = cpj2.exh().iterator();
                while (object3.hasNext()) {
                    object3.advance();
                    short s = object3.key();
                    object = (String)object + aum_0.cWf().a(103, (long)s, new Object[0]);
                    object = (String)object + aum_0.cWf().c("colon", new Object[0]) + object3.value();
                    if (object3.hasNext()) {
                        object = (String)object + ", ";
                        continue;
                    }
                    object = (String)object + ".";
                }
                object3 = new dcd(aum_0.cWf().c("notification.IEDestroyedTitle", new Object[0]), aum_0.cWf().c("notification.IEDestroyedText", object), biu_1.kiC);
                aaw_1.bUq().h((aam_2)object3);
                return false;
            }
            case 15689: {
                bgt_0 bgt_08;
                cte_0 cte_02 = (cte_0)aam_22;
                long l = cte_02.KU();
                byte[] byArray = cte_02.eCr();
                bgt_0 bgt_09 = aue_0.cVJ().cVK();
                bgt_0 bgt_03 = bgt_08 = bgt_09 != null && l == bgt_09.Sn() ? bgt_09 : (bgt_0)fcL.rUh.aw(aue_0.cVJ().cVO().xl(), l);
                if (bgt_08 == null) {
                    eim_0.qxx.a(l, new cdZ(this, l, byArray));
                } else {
                    int n6 = bgt_08.Xt();
                    bgt_08.as(byArray);
                    int n7 = bgt_08.Xt();
                    if (n7 != n6) {
                        bqm_0.jbp.b(new brc_0(n6, n7));
                    }
                }
                return false;
            }
            case 13150: {
                ctz_0 ctz_02 = (ctz_0)aam_22;
                long l = ctz_02.awb();
                bgy bgy5 = bgg_0.dlO().ju(l);
                String string10 = bgy5.getName();
                String string11 = aum_0.cWf().c(ctz_02.eCn(), new Object[0]);
                api_0 api_02 = new api_0(string10, l, string11);
                api_02.m(aPl.exq);
                aPh.czg().d(api_02);
                return false;
            }
            case 12880: {
                frl_0 frl_02;
                cox_0 cox_02 = (cox_0)aam_22;
                fre_0 fre_02 = cox_02.dQh();
                long l = cox_02.dGf();
                long l5 = cox_02.ewo();
                switch (fre_02) {
                    case sZc: {
                        frg_0 frg_02 = frb_0.sYO.uH(l5);
                        frl_02 = frg_02.fTP();
                        break;
                    }
                    case sZb: {
                        frh_0 frh_02 = (frh_0)frb_0.sYO.a(fre_02, l);
                        frI frI2 = frh_02.ZE((int)l5);
                        frl_02 = frI2.fTP();
                        break;
                    }
                    case sYZ: {
                        frn_0 frn_02 = (frn_0)frb_0.sYO.a(fre_02, l);
                        frl_02 = frn_02.fTP();
                        break;
                    }
                    case sZa: {
                        frj_0 frj_02 = (frj_0)frb_0.sYO.a(fre_02, l);
                        frl_02 = frj_02.fTP();
                        break;
                    }
                    default: {
                        lRu.error((Object)("Impossible de r\u00e9cup\u00e9rer le LOADING correspondant au travel " + String.valueOf(fre_02)));
                        return false;
                    }
                }
                cdv_0.a(frl_02);
                return false;
            }
            case 12614: {
                cow cow2 = (cow)aam_22;
                int n8 = cow2.ewm();
                int n9 = cow2.ewn();
                fdf_0 fdf_02 = (fdf_0)fda_0.rWI.a(fdv_0.rZc, n8);
                fdg_0 fdg_02 = fdf_02.Ul(n9);
                frl_0 frl_03 = fdg_02.fTP();
                cdv_0.a(frl_03);
                return false;
            }
            case 13416: {
                ctj ctj2 = (ctj)aam_22;
                ((bgt_0)fcL.rUh.sw(ctj2.KU())).dnX().cJ(ctj2.eBU());
                return false;
            }
            case 13441: {
                cvm_0 cvm_02 = (cvm_0)aam_22;
                short s = cvm_02.dpx();
                if (s != 127) {
                    crh_2.eML().cB(true).g(aum_0.cWf().c("recustom.enterTheDressingRoom", new Object[0]), 0);
                } else {
                    crh_2.eML().cB(true).g(aum_0.cWf().c("charactersLoading.progress", new Object[0]), 0);
                }
                return false;
            }
            case 23341: {
                cvl_0 cvl_02 = (cvl_0)aam_22;
                bgt_0 bgt_011 = aue_0.cVJ().cVK();
                bhJ bhJ2 = bgt_011.dpU();
                aie_0.cfn().bmW();
                aue_0.cVJ().a(cdT.eui());
                aue_0.cVJ().a(cyt_1.eXX());
                aue_0.cVJ().a(ccd_1.etO());
                ccb_1.etJ().db(cvl_02.KU());
                ccb_1.etJ().dm(cvl_02.xO());
                ccb_1.etJ().a(ccc_1.lPm);
                ccb_1.etJ().cx(cvl_02.dpx());
                ccb_1.etJ().at(bhJ2);
                ccb_1.etJ().jd(false);
                aue_0.cVJ().a(ccb_1.etJ());
                return false;
            }
            case 12591: {
                czm czm2 = (czm)aam_22;
                boolean bl = czm2.eGf();
                boolean bl5 = czm2.eGg();
                String string12 = bl5 ? aum_0.cWf().c(czm2.getMessage(), new Object[0]) : czm2.getMessage();
                fik_2 fik_22 = new fik_2().a(fin_2.uCB).vE(string12).abQ(2).vG(ccp_2.mRF.byf()).pd(true).a(fil_2.gCp()).a((int n, String string) -> {
                    if (!bl) {
                        return;
                    }
                    dae_0 dae_02 = new dae_0();
                    dae_02.lK(19776);
                    dae_02.fa(czm2.eGe());
                    aaw_1.bUq().h(dae_02);
                });
                fiq_2.gCw().d(fik_22);
                aPh.czg().iY(string12);
                return false;
            }
            case 12991: {
                cop_0 cop_02 = (cop_0)aam_22;
                long l = cop_02.KU();
                boolean bl = cop_02.doP();
                bgy bgy6 = bgg_0.dlO().ju(l);
                bgy6.gf(bl);
                return false;
            }
            case 12632: {
                cpi cpi2 = (cpi)aam_22;
                long l = cpi2.KU();
                byte by = cpi2.deO();
                eIn eIn2 = new eIn();
                eIn2.O(l, by);
                return false;
            }
            case 13878: {
                an_0 an_02;
                cvs_0 cvs_02 = (cvs_0)aam_22;
                byte[] byArray = cvs_02.aKU();
                try {
                    an_02 = an_0.cR(byArray);
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    lRu.error((Object)"Error parsing rewards info", (Throwable)invalidProtocolBufferException);
                    return false;
                }
                aue_0.cVJ().cVO().f(an_02);
                if (aue_0.cVJ().c(cuv_2.eTk())) {
                    return false;
                }
                if (an_02.aAR().isEmpty()) {
                    return false;
                }
                if (an_02.aAR().stream().mapToInt(aS -> aS.aFg() + aS.aFj()).sum() <= 0) {
                    return false;
                }
                aPd.f("pending.rewards.notification", new Object[0]);
                biw_1.mU(aum_0.cWf().c("pending.rewards.notification", new Object[0])).hR(true).r(() -> {
                    if (!aue_0.cVJ().c(cuv_2.eTk())) {
                        cuv_2.eTk().kq(false);
                    }
                }).mV("pending.rewards.button").Hi(9).dZz();
                return false;
            }
            case 13934: {
                cpk cpk2 = (cpk)aam_22;
                long l = cpk2.bhh();
                boolean bl = cpk2.exi();
                long l6 = aue_0.cVJ().cVK().aqZ();
                if (l6 != l) {
                    return false;
                }
                aiy_0.dYv.clear();
                aiy_0.dYv.yC(bl ? 42 : -1);
                return false;
            }
            case 13434: {
                cwg_0 cwg_02 = (cwg_0)aam_22;
                boolean bl = cwg_02.bfb();
                boolean bl6 = cwg_02.eEG();
                aue_0.cVJ().cVO().bl(bl);
                StringBuilder stringBuilder = new StringBuilder();
                if (bl) {
                    stringBuilder.append(aum_0.cWf().c("security.account.locked", new Object[0]));
                } else if (bl6) {
                    stringBuilder.append(aum_0.cWf().c("security.account.locked.offline", new Object[0]));
                } else {
                    stringBuilder.append(aum_0.cWf().c("security.account.unlocked", new Object[0]));
                }
                cdv_0.on(stringBuilder.toString());
                bYU.nT(stringBuilder.toString());
                return false;
            }
            case 13524: {
                bYU.epD();
                return false;
            }
            case 13067: {
                bYU.epE();
                return false;
            }
            case 13954: {
                bYU.epF();
                return false;
            }
            case 13447: {
                cdv_0.on(aum_0.cWf().c("security.returned.loot.text", new Object[0]));
                bYU.epG();
                return false;
            }
            case 12953: {
                cco_0.etB().jb(((coh)aam_22).evR());
                return false;
            }
            case 13495: {
                cqw_0 cqw_02 = (cqw_0)aam_22;
                long l = cqw_02.aXb();
                bgy bgy7 = bgg_0.dlO().ju(l);
                if (bgy7 == null) {
                    return false;
                }
                String string13 = aum_0.cWf().c("fight.join.request", bgy7.getName());
                biw_1.mT(string13).Hi(5).hR(true).r(() -> aue_0.cVJ().etu().d(new ckj(l, true))).hS(true).s(() -> aue_0.cVJ().etu().d(new ckj(l, false))).t(() -> aue_0.cVJ().etu().d(new ckj(l, false))).dZz();
                return false;
            }
        }
        return true;
    }

    private static boolean c(bzq_2 bzq_22) {
        if (!bzq_22.eqx()) {
            return false;
        }
        return eId.quO.pC(bzq_22.lEo).isPresent();
    }

    private static boolean mQ(long l) {
        return exc.oTQ.contains(l);
    }

    private static void on(String string) {
        aPh.czg().iZ(string);
    }

    private static void a(frl_0 frl_02) {
        ada ada2 = ada.buh();
        ada2.el(frl_02.aJi());
        ada2.rJ(frl_02.gkq());
        ada2.rK(frl_02.bui());
        ada2.rL(frl_02.buj());
    }

    public static void a(aaO[] aaOArray, bzq_2 bzq_22) {
        int n = bzq_22 == null ? 0 : bzq_22.eqC();
        aam_0 aam_02 = aie_0.cfn().bmC();
        aam_02.brg();
        if (n == 0) {
            return;
        }
        if (n > aaOArray.length) {
            lRu.warn((Object)"trop de parallax");
        }
        for (int i = 0; i < n; ++i) {
            mo_1 mo_12 = bzq_22.JP(i);
            aaOArray[i].a(mo_12);
            aam_02.a(aaOArray[i]);
        }
    }

    private static void ab(bgt_0 bgt_02) {
        byv_0 byv_02 = (byv_0)bcw_0.dQn().dw(59L);
        if (byv_02 == null) {
            lRu.error((Object)"[ItemAction] Impossible de spawn visuellement le havre-sac");
            return;
        }
        if (bgt_02.dnw() != null) {
            return;
        }
        byv_02.dC(0L);
        byv_02.b(bgt_02.ddI().bqg());
        byv_02.dD(bgt_02.aqZ());
        byv_02.bU((short)1);
        byv_02.ac((short)2);
        byv_02.setVisible(true);
        byv_02.setSelectable(false);
        byv_02.aVQ();
        for (ng_1 ng_12 : byv_02.aVG()) {
            if (!(ng_12 instanceof afk_0)) continue;
            afk_0 afk_02 = (afk_0)ng_12;
            afh_0.bxU().a(afk_02);
            afk_02.qR(afX.csm.byy());
            agX.c(afk_02);
        }
        bzj_2.eqi().k(byv_02);
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        aue_0.cVJ().a(cdl.etZ());
        aue_0.cVJ().a(cdp_0.euh());
        aue_0.cVJ().a(ccs_1.lPW);
        aue_0.cVJ().a(czh_2.eYT());
        aue_0.cVJ().a(ceE.euz());
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        fse_1.gFu().vX("player.displayStates");
        fse_1.gFu().vX("isInExterior");
        fse_1.gFu().vX("isInWakfuStasisInstance");
        aue_0.cVJ().b(cdl.etZ());
        aue_0.cVJ().b(cdp_0.euh());
        aue_0.cVJ().b(czh_2.eYT());
        aue_0.cVJ().b(ceE.euz());
    }

    public void je(boolean bl) {
        this.lRB = bl;
    }

    public void a(ceb_0 ceb_02) {
        this.lRF = ceb_02;
    }

    public void d(adi_1 adi_12) {
        if (this.lRE == null) {
            return;
        }
        if (!this.lRE.contains(adi_12)) {
            this.lRE.add(adi_12);
        }
        if (this.lRF != null && this.lRE.size() == this.lRC.length) {
            this.lRF.eux();
        }
    }

    public void e(adi_1 adi_12) {
        if (this.lRE == null) {
            return;
        }
        this.lRE.remove(adi_12);
        if (this.lRF != null && this.lRE.isEmpty()) {
            this.lRF.euw();
        }
    }

    public void clean() {
        this.lRF = null;
        this.lRE = null;
    }

    static {
        lRu.setLevel(Level.TRACE);
    }
}


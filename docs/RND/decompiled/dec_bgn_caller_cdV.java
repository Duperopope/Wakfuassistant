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

public class cdV
implements aDI {
    static final Logger lRu = Logger.getLogger(cdV.class);
    private static final cdV lRv = new cdV();
    private static final int lRw = 59;
    public static final int lRx = 977;
    public static final String lRy = "WAKFU";
    private long lRz;
    private long lRA;
    private boolean lRB;
    private aDI[] lRC;
    private aDI[] lRD;
    private ArrayList<aDI> lRE;
    private ceb lRF;

    public static cdV euj() {
        return lRv;
    }

    public long euk() {
        return this.lRz;
    }

    public long eul() {
        return this.lRA;
    }

    public static void a(bgy bgy2, long l, bgT bgT2) {
        Object object;
        bdj bdj2 = bgT2.ddI();
        bdj2.setVisible(true);
        if (bgT2.bwb()) {
            if (bgT2.dpf() == null) {
                cdV.W(bgT2);
            }
            object = bgT2.dpf();
            bdj2.a(bdj2.a((bJo)object));
            bdj2.bwc();
        }
        bdj2.bpC();
        bdj2.c(bZJ.eqi());
        bgT2.b(bgy2.aZw());
        bdj2.a(bZJ.eqi());
        bdj2.dds();
        bgT2.a(bgy2.bcB());
        bdj2.a(bZt.lCY);
        bdj2.fp(true);
        bdj2.p(bgT2);
        bgT2.fK(l);
        bdj2.ddp();
        adN.bvh().g(bdj2);
        object = aIe.cfn().bmC();
        ((afV)object).b(bdj2);
        ((aaj)object).bqT();
    }

    public static void U(bgT bgT2) {
        cdV.V(bgT2);
        bgT2.fZ(true);
        bgT2.djv();
        bgT2.djo();
        bgT2.ddO();
    }

    public static void V(bgT bgT2) {
        cdV.X(bgT2);
        cdV.W(bgT2);
    }

    public static void W(bgT bgT2) {
        Optional<ffV> optional = bgT2.dnP().B(bgT2.dmL().t(ffS.sgZ));
        if (optional.isPresent() && optional.get().adO()) {
            fnL fnL2 = optional.get().ead();
            fB fB2 = eKj.b(bgT2.aZj(), bgT2.Sn(), fm.pu);
            bgT2.c(fnL2.geL().d(), eKj.a(fnL2, fB2), eKj.b(fnL2, fB2), fnL2.agT(), fnL2.agM());
        }
    }

    private static void X(bgT bgT2) {
        Optional<ffV> optional = bgT2.dnP().B(bgT2.dmL().t(ffS.sgX));
        if (optional.isPresent() && optional.get().adO()) {
            fnR fnR2 = (fnR)optional.get().ead();
            fB fB2 = eKj.b(bgT2.aZj(), bgT2.Sn(), fm.pv);
            bgT2.b(fnR2.geL().d(), eKj.a(fnR2, fB2), eKj.b(fnR2, fB2), fnR2.agT(), fnR2.agM());
        }
    }

    private static void a(aUE aUE2) {
        bdj bdj2;
        bgT bgT2 = aUE2.cVK();
        long l = bgT2.aqZ();
        cdV.eum();
        bqM.jbp.b(new bry(l));
        long l2 = WX.bhh();
        lRu.info((Object)("on quitte le monde " + l2));
        aIq.cgr().ia(l2);
        bgT2.dpc();
        bgT2.dpd();
        bdj bdj3 = bdj2 = bgT2 == null ? null : bgT2.ddI();
        if (bdj2 != null) {
            adN.bvh().k(bdj2);
            bdj2.dcO();
        }
        bZJ.eqi().clear();
        cYi.eXN().clear();
        aIe.cfn().cfH();
    }

    private static void Y(bgT bgT2) {
        if (bgT2.dkG()) {
            if (fyw.gqw().to("furnitureListDialog")) {
                fyw.gqw().tl("furnitureListDialog");
            }
            if (fyw.gqw().to("havenWorldResourcesCollectorDialog")) {
                fyw.gqw().tl("havenWorldResourcesCollectorDialog");
            }
        }
        cVH cVH2 = bDr.dQP();
        if (aUE.cVJ().c(cVH2)) {
            aUE.cVJ().b(cVH2);
        }
    }

    private static void eum() {
        bgT bgT2 = aUE.cVJ().cVK();
        long l = bgT2.Xi();
        TIntObjectIterator<bsS> tIntObjectIterator = bsU.dHk().dHl();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            bsS bsS2 = (bsS)tIntObjectIterator.value();
            List<bgy> list = bsS2.dGs().stream().filter(Objects::nonNull).filter(bgy2 -> bgy2.Xi() != l).toList();
            list.forEach(bgy2 -> bgG.dlO().av((bgy)bgy2));
        }
    }

    private static void a(aDI ... aDIArray) {
        aUE aUE2 = aUE.cVJ();
        for (aDI aDI2 : aDIArray) {
            if (aUE2.c(aDI2)) continue;
            aUE2.a(aDI2);
        }
    }

    public static void Z(bgT bgT2) {
        aUB.cVb().dm(bgT2.getName());
        bSG bSG2 = (bSG)aIe.cfn().bmH();
        bqM.jbp.dEE();
        bSz bSz2 = (bSz)bSG2.fO(bgT2.Sn());
        if (bSz2 == null) {
            bSz bSz3 = new bSz(bgT2);
            bSG2.a(bSz3);
            try {
                bSz3.buq();
            }
            catch (IOException iOException) {
                lRu.warn((Object)"Error occurred on load of AccountPreferenceStore", (Throwable)iOException);
            }
        } else {
            bSz bSz4 = (bSz)bSG2.bxm();
            bSG2.a(bSz4.KU(), bSz4);
            bSG2.a(bSz2);
        }
        bqO.dEF();
        bgT2.dlE().dqR();
        if (!aUB.cVb().i((byte)3, "displayAllCharacteristics")) {
            aUB.cVb().b((byte)3, "displayAllCharacteristics", false);
        }
    }

    private static void eun() {
        Ox ox = new Ox();
        aUE.cVJ().etu().d(ox);
    }

    private void aa(bgT bgT2) {
        if (exc.oTO.contains(bgT2.aqZ())) {
            return;
        }
        CmsPollInGameApi.getRequest getRequest2 = CmsPollInGameApi.getRequest().site(lRy).lang(aUM.cWf().aUXX().aUP()).page(Long.valueOf(1L)).count(Long.valueOf(10L));
        CmsPollInGameApi.getCallback getCallback2 = CmsPollInGameApi.getCallback().on200(apiResponse -> cXC.aC((List)apiResponse.getData())).onDefault(apiResponse -> lRu.error((Object)("Error when consulting Polls " + (String)apiResponse.getData()))).onException(throwable -> lRu.error((Object)"Error when consulting Polls ", throwable));
        WakfuClient.ceU().sendAsync((ApiCallback.Request)getRequest2, (ApiCallback.Callback)getCallback2);
    }

    private void euo() {
        bci.hDG.daR();
        bcx bcx2 = (bcx)fSe.gFu().aW("displayedAchievement", "logBookDialog");
        if (bcx2 != null) {
            bcx2.daR();
        }
    }

    private void eup() {
        this.lRC = new aDI[]{cVU.eUX(), cYE.eYk(), cZi.eYU(), cWd.eVe(), cWp.eVR(), cXX.eXH(), cSJ.eOt(), cSZ.ePn(), cXq.eWO(), cUX.eTn(), cWY.nUc, cXE.eXq(), cYk.eXO(), cYq.eXS(), cUf.eRt(), cSc.eNJ(), cYt.eXX(), cWZ.eWv(), cXx.eXf(), cUZ.eTq(), cTy.ePV()};
        this.lRE = new ArrayList<aDI>(Arrays.asList(this.lRC));
    }

    private void euq() {
        this.lRD = new aDI[]{cco.etB(), cdO.eug(), cer.lSi, ccn.lOz, cde.lQm, cdp.lQy, cdN.lRa, cdU.lRt, cdd.lQk, cdt.eub(), ceH.euE(), ccO.etV(), cdu.euc(), ccM.etT(), cdJ.lQU, ccT.etY(), ccN.etU(), aXJ.hxe, ccI.lPB, cdH.lQS, cdj.lQp, cdf.lQn, ccG.lPx, ccH.lPz, cgV.lTS, ccV.lQc, chb.lTX, chJ.lUg, cel.lSc, bNc.kAp};
    }

    public void eur() {
        this.euq();
        cdV.a(this.lRD);
    }

    public void eus() {
        this.eup();
        cdV.a(this.lRC);
    }

    public void eut() {
        this.eup();
        aUE aUE2 = aUE.cVJ();
        for (aDI aDI2 : this.lRC) {
            if (aUE2.c(aDI2)) {
                aUE2.b(aDI2);
                continue;
            }
            this.lRE.remove(aDI2);
        }
        bYJ.epo().epq();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean b(aAM aAM2) {
        aUE aUE2 = aUE.cVJ();
        aIe aIe2 = aIe.cfn();
        switch (aAM2.d()) {
            case 12292: {
                com com2 = (com)aAM2;
                byte[] byArray = com2.evU();
                bEx.dSm().removeAll();
                for (int i = 0; i < com2.ewb().length; ++i) {
                    bEx.dSm().lj(com2.ewb()[i]);
                }
                cAY.eHc().jy(false);
                fSe.gFu().f("isAlive", true);
                bgT bgT2 = new bgT(false);
                bgR.dmo().ax(bgT2);
                bgT2.dkp();
                bgT2.b(eIl.ey(com2.evZ()));
                bgT2.a(eHN.ex(com2.ewa()));
                bgT2.as(byArray);
                cAY.eHc().jy(true);
                bsf.dEU().a(bse.dEP());
                cdV.Z(bgT2);
                aUE2.f(bgT2);
                fcL.rUh.d(bgT2.aZj(), bgT2);
                fSe.gFu().f("heroesPartyIsFull", false);
                int n2 = bgT2.e(eXx.rGi).aYC();
                bgT2.aPg();
                Object object = fjt.syH.eCu();
                while (object.hasNext()) {
                    object.advance();
                    ((fjo)object.value()).a(new bRA((fjo)object.value()));
                    ((fjo)object.value()).a(bRx.laQ);
                }
                eIM.qxx.pI(bgT2.Sn());
                aBo.dyC.b(bNA.kDO);
                bgT2.OC(n2);
                cAY.eHc().eGW();
                bly.ivl.bkZ();
                boi.iMT.clear();
                frn.sXO.a(bYl.lyU);
                cGW.mYX = true;
                this.lRz = aBb.bUA().a(new cdW(this, bgT2), 300000L, 159159160, -1L);
                this.lRA = aBb.bUA().a(new cdX(this, aUE2), 4000L, 159159161);
                fSe.gFu().f("isInDimensionalBag", false);
                fSe.gFu().f("isInOwnDimensionalBag", false);
                fSe.gFu().f("isInJail", false);
                fSe.gFu().f("hasOccupation", false);
                fSe.gFu().f("inventory.occupation.allows.interaction", true);
                object = (bSG)aIe2.bmH();
                try {
                    if (((aeZ)object).a(bSN.liu)) {
                        aPt.cAg().cAx();
                        ((aeZ)object).a((afe)bSN.liu, false);
                    }
                    aYm.cYm();
                }
                catch (Exception exception) {
                    lRu.error((Object)("Erreur \u00e0 l'initialisation du chat, impossible de le charger : " + exception.getMessage()));
                }
                bgT2.dkq();
                fcK.rUe.ar(bgT2.aZj(), bgT2.Sn());
                fSe.gFu().f("heroesParty", List.of(bgT2));
                fcL.rUh.au(bgT2.aZj(), bgT2.Sn());
                boolean bl = fcI.fSM();
                fSe.gFu().f("heroesEnabled", bl);
                fSe.gFu().f("hideDownscaling", eIA.pH(bgT2.Xi()));
                blH blH2 = new blH(bgT2);
                ArrayList<blH> arrayList = new ArrayList<blH>();
                arrayList.add(0, blH2);
                fSe.gFu().f("mainCharacterViewForTemplate", arrayList);
                if (bl || fcI.fSN()) {
                    cTu.nJd.ePN();
                }
                bMV.a(bgT2.dnM(), bgT2.dkB(), bgT2.dlG());
                if (aUE2.c(ccP.etW())) {
                    aUE2.b(ccP.etW());
                }
                fSe.gFu().f("exchange.itemTrade", (Object)null);
                evp evp2 = evp.H(aUE.cVJ().cVO().cWq());
                if ((evp2 == evp.ovB || evp2 == evp.ovz || evp2 == evp.ovy) && ewo.oBF.k(ewr.oEq)) {
                    aPd.f("moderationPanel.invisibleNotif", new Object[0]);
                }
                this.aa(bgT2);
                aUE.cVJ().etu().d(new cnR(aUE.cVJ().cVK().Sn()));
                aUE.cVJ().etu().d(new clM());
                return false;
            }
            case 12065: {
                bsJ bsJ2;
                bgT bgT3 = aUE.cVJ().cVK();
                if (bgT3 == null) {
                    // empty if block
                }
                if ((bsJ2 = bgT3.dnB()) != null) {
                    aVi.cWF().zY(bsJ2.d());
                    btW btW2 = new btW();
                    btW2.bGy();
                }
                cdV.Y(bgT3);
                cdV.a(aUE2);
                return false;
            }
            case 12830: {
                Object object;
                boolean bl;
                void var16_161;
                Object object2;
                cok cok2 = (cok)aAM2;
                long l = WX.bhh();
                fyw.gqw().gqL();
                aIe.cfn().cfG();
                bZJ.eqi().clear();
                if (aUE.cVJ().c(cWh.eVi())) {
                    aUE.cVJ().b(cWh.eVi());
                }
                if (aUE2.c(ccP.etW())) {
                    aUE2.b(ccP.etW());
                }
                WX.clear();
                bgO bgO2 = new bgO();
                ((exP)bgO2).dmj().a(((exP)bgO2).dmj().fis(), cok2.evU());
                ((exP)bgO2).dmj().a(((exP)bgO2).dmj().fir(), cok2.evU());
                ((exP)bgO2).dmj().a(((exP)bgO2).dmj().fiv(), cok2.evU());
                long l2 = bgO2.aqZ();
                eMW eMW2 = eMX.eC(cok2.evX());
                caN.lHv.b(l2, eMW2);
                fSe.gFu().f("currentInstanceMaxLevel", eMW2.Fq());
                fcL.rUh.b(aUE2.cVO().xl(), exP2 -> {
                    bZJ.eqi().b((afp)((Object)exP2));
                    return true;
                });
                aUB.cVb().fK(l2);
                bZQ bZQ2 = bZP.eqt().mA(l2);
                boolean bl3 = caf.lFq.eqR();
                if (bl3) {
                    caf.lFq.eqL();
                    aUE2.a(cUT.eTd());
                } else if (caP.erG().erI()) {
                    caP.erG().mK(l2);
                } else {
                    WX.a(l2, WV.bnj());
                }
                if (!bl3 && l2 != 9L) {
                    aUE2.b(cUT.eTd());
                }
                fSe.gFu().f("isInHavenWorld", bl3);
                fSe.gFu().f("isInOwnHavenWorld", bDr.la(l2));
                fSe.gFu().a((aEF)bTj.eno(), "havenBagCharacterPortrait");
                bZL.eqr().fy(l2);
                aCd aCd2 = bgO2.aZw();
                bTl.lnl.Ck(-1);
                bJx.klY.clear();
                ArrayList<byte[]> arrayList = cok2.evV();
                for (byte[] byArray : arrayList) {
                    object2 = (bJr)bJD.kmg.gq(ByteBuffer.wrap(byArray));
                    bJx.klY.c((bJr)object2);
                }
                ArrayList<fnd> arrayList2 = cok2.evW();
                int bl2 = arrayList2.size() - 1;
                while (var16_161 >= 0) {
                    object2 = (fnd)arrayList2.get((int)var16_161);
                    if (((fnd)object2).ems() != null) {
                        if (((fnd)object2).ems().gbC().Xc(((fnd)object2).d())) {
                            fnf.ah(((fnd)object2).d(), ((fnd)object2).exj());
                            fnf.gb(((fnd)object2).d(), ((fnd)object2).emO());
                        } else {
                            fnf.c((fnd)object2);
                        }
                    }
                    --var16_161;
                }
                bJJ.kmp.lC(l2);
                if (l != l2) {
                    bfP.dhT().a(ewC.oIj);
                    bfP.dhT().dhX();
                }
                acz.cgH.btI();
                UE.bjV().b(acz.cgH);
                UE.bjV().b(aJy.chI());
                aJy.chI().ep(false);
                boolean bl4 = bZQ2.lEx;
                if (bl4) {
                    acz.cgH.c(UE.bjV());
                    UE.bjV().a(acz.cgH);
                    UE.bjV().a(aJy.chI());
                    aJy.chI().ep(true);
                }
                UE.bjV().a(cBs.mxw);
                fSe.gFu().f("wakfuEcosystemEnabled", false);
                fSe.gFu().f("isInExterior", bl4);
                fSe.gFu().f("isInWakfuStasisInstance", bZQ2.lEB);
                fSe.gFu().f("player.displayStates", true);
                fSe.gFu().f("osamodasSymbiotCreatureCapturedState", false);
                fSe.gFu().f("havenWorld", (Object)null);
                fSe.gFu().f("basicHavenWorld", (Object)null);
                fSe.gFu().f("exchange.itemTrade", (Object)null);
                fSe.gFu().f("equipment.can.transfer.bag", false);
                fSe.gFu().f("isInDungeon", cdV.c(bZQ2));
                fSe.gFu().f("isInBattleground", bZQ2.eqw());
                fSe.gFu().f("isInJail", cdV.mQ(l2));
                long l3 = ewo.oBF.j(ewr.oCk);
                fSe.gFu().f("max.character.level", String.valueOf(l3));
                fSe.gFu().f("spellsRestatManager", (Object)null);
                fSe.gFu().f("stasisDungeonInfoView", cdV.c(bZQ2) ? bog.iMI : null);
                try {
                    bl = aUC.cVq().aK("activateStuffPreview");
                }
                catch (Fu fu) {
                    bl = false;
                }
                fSe.gFu().f("stuffPreviewActivated", bl);
                this.eus();
                this.eur();
                aUm.cUI().cD(true);
                aam aam2 = aIe2.bmC();
                aam2.bqL().co(false);
                if (bl4) {
                    acq.cge.a(acz.cgH);
                    acq.cge.a(aJs.eaS);
                }
                bgT bgT2 = aUE.cVJ().cVK();
                bdj bdj2 = bgT2.ddI();
                bdj2.bqb();
                bRq.ekK().ekL();
                bIR.dZt().removeAll();
                bZL.eqr().clear();
                caZ.lId.clear();
                cAY.eHc().eHy();
                agX.c(bdj2);
                WX.a(aam2, aCd2.getX(), aCd2.getY(), aCd2.bdi());
                bZJ.eqi().o(bgO2.bcC(), bgO2.bcD(), true);
                bZL.eqr().eg(bZJ.eqi().eqm(), bZJ.eqi().eqn());
                bOA.ehn().b(bZQ2);
                bSw.lgW.aPg();
                bgT2.dkp();
                if (bgG.dlO().ju(bgT2.Sn()) == null) {
                    bgG.dlO().aq(bgT2);
                }
                cdV.a(bgO2, l2, bgT2);
                bIF.dYO().dXL();
                adu.buC().fJ(l2);
                this.euo();
                cAY.eHc().eHz();
                int n2 = bgT2.e(eXx.rGi).aYC();
                bgT2.e(bgT2.fgg());
                bgT2.e(eXx.rGi).op(n2);
                if (l2 == 9L) {
                    object = bgT2.dnw();
                    aaA.brC().a((aaB)object);
                    aaA.brC().a((aaN)object);
                    ((bnv)object).dyK();
                    bni.dyk().b((bnv)object);
                }
                bni.dyk().b(bdj2);
                aam2.bM(true);
                object = new cdY(this, aam2, bgT2, l2, bZQ2, aIe2, bdj2, aCd2);
                if (asj.bJt().bJu()) {
                    asj.bJt().a((asi)object);
                } else {
                    object.buf();
                    object.bue();
                    object.bug();
                }
                aam2.dw(true);
                cdV.U(bgT2);
                bon.dAK().setEnabled(true);
                fyw.gqw().d("wakfu.windowStick", cHx.class);
                bqM.jbp.b(new brn(l, l2));
                ckM ckM2 = new ckM();
                ckM2.os(aUM.cWf().aUXX().aUR());
                aUE.cVJ().etu().d(ckM2);
                bgT2.dkq();
                AwayCommand.cAY();
                cXh.eWL();
                if (this.lRB) {
                    this.lRB = false;
                    cdV.eun();
                }
                aYm.cYl().cYn();
                bGN.dUk().dUm();
                boolean bl5 = evm.a(bgT2.dpL().cWq(), evp.ovz);
                fSe.gFu().f("isInAdministratorGroup", bl5);
                ccd.eti().iZ(bl5);
                if (cVu.eQx()) {
                    cVu.eTO().eTT();
                }
                return false;
            }
            case 13121: {
                String string2 = aUM.cWf().c("player.unstuck", new Object[0]);
                cdV.on(string2);
                return false;
            }
            case 12045: {
                ctg ctg2 = (ctg)aAM2;
                bgT bgT5 = aUE2.cVK();
                bnv bnv2 = bgT5.dnw();
                if (bnv2 == null) {
                    return false;
                }
                bnn bnn2 = bnv2.dyV();
                bnn2.au(ctg2.buM());
                bnn2.ur(ctg2.ccf());
                if (bgT5.dnx() == bnv2) {
                    cWb.eVa().eVc();
                }
                bnv2.dze();
                return false;
            }
            case 12915: {
                cuj cuj2 = (cuj)aAM2;
                lRu.debug((Object)("PERSONAL_SPACE_ENTER_RESULT_MESSAGE (success=" + cuj2.eDb() + ")"));
                bgT bgT6 = aUE2.cVK();
                if (cuj2.eDb()) {
                    bnv bnv3;
                    if (cuj2.eDd()) {
                        cdV.ab(bgT6);
                        bnv3 = bgT6.dnx();
                        bnv3.gH(cuj2.dyN());
                        bnv3.gI(cuj2.dyO());
                        bnv3.Ez(cuj2.dyP());
                    } else {
                        bnv3 = new bnv();
                        bnv3.b(cuj2.eDc());
                    }
                    bnv3.dze();
                    bns.iHL.ke(bgT6.aqZ());
                    fSe.gFu().f("isInOwnDimensionalBag", cuj2.eDd());
                    fSe.gFu().f("isInDimensionalBag", true);
                    bgT6.a(bnv3);
                    aUE2.a(ccL.etS());
                    aUE2.a(cUT.eTd());
                    aUE2.b(cXK.eXu());
                    if (cuj2.eDd()) {
                        bon.dAK().a(bor.iPb, null);
                    }
                } else {
                    bgT6.ddI().dT("AnimStatique");
                    if (cuj2.eDd()) {
                        bZJ.eqi().mz(0L);
                    }
                    aUE2.cVK().fY(false);
                }
                return false;
            }
            case 12897: {
                lRu.debug((Object)"PERSONAL_SPACE_LEAVE_RESULT_MESSAGE");
                bgT bgT7 = aUE2.cVK();
                bnv bnv4 = bgT7.dnw();
                bnv4.dzb();
                aaA.brC().b(bnv4);
                aaA.brC().b(bnv4);
                aUE2.b(cTT.eRh());
                aUE2.b(cTP.eQZ());
                aUE2.b(cWe.eVh());
                aUE2.b(cTR.eRg());
                aUE2.b(cTO.eQY());
                aUE2.b(cTG.eQG());
                aUE2.b(cUT.eTd());
                if (fyw.gqw().to("exchangeDialog")) {
                    aUE2.b(cUp.eRM());
                }
                if (aUE2.c(cUr.eRP())) {
                    aUE2.b(cUr.eRP());
                }
                cWd.eVe().eVg();
                if (fyw.gqw().to("furnitureListDialog")) {
                    fyw.gqw().tl("furnitureListDialog");
                }
                bni.dyk().dyl();
                fSe.gFu().f("isInDimensionalBag", false);
                fSe.gFu().f("isInOwnDimensionalBag", false);
                aUE2.b(ccL.etS());
                return false;
            }
            case 13584: {
                cwk cwk2 = (cwk)aAM2;
                int n4 = cwk2.ezG();
                eRO eRO2 = (eRO)eNf.fBb().pU(n4);
                if (eRO2 != null) {
                    QD qD = eRO2.bbo();
                    qD.a(aUE.cVJ().cVK().dke());
                    qD.dr(cwk2.ezH());
                    bgy bgy2 = bvZ.ju(cwk2.Qy());
                    bgy2.ddI().b((eRO)qD, false);
                    bgy2.doc().p(qD);
                }
                return false;
            }
            case 13559: {
                cwl cwl2 = (cwl)aAM2;
                long l = cwl2.Qy();
                long l4 = cwl2.eEK();
                bgy bgy3 = bvZ.ju(l);
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
                cwj cwj2 = (cwj)aAM2;
                byte by = cwj2.eEH().aJr();
                QD qD = (QD)eNf.fBb().pU(cwj2.ezG());
                if (qD == null) {
                    lRu.error((Object)("Impossible d'instancier un runningEffect :" + cwj2.ezG() + " inconnu"));
                    return false;
                }
                eRO eRO3 = (eRO)qD.b(baS.cZC());
                eRO3.dr(cwj2.ezH());
                if (cwj2.eEI() != null) {
                    for (azy<Integer, Integer, Long> azy2 : cwj2.eEI()) {
                        bgy bgy4 = bvZ.ju(azy2.bTE());
                        aWS aWS2 = new aWS(cwj2.caO(), by, azy2.getFirst(), eRO3, cwj2.ezI());
                        aWS2.xR(azy2.aHI());
                        aWS2.f(new aGA(aWS2.caS()));
                        if (bgy4 == null || !bgy4.djT()) {
                            aWM.cXG().h(aWS2);
                            continue;
                        }
                        aVi.cWF().a(bgy4.bqo(), (aFT)aWS2);
                    }
                } else {
                    aWS aWS3 = new aWS(cwj2.caO(), by, cwj2.avZ(), eRO3, cwj2.ezI());
                    aWS3.xR(cwj2.ezb());
                    aWM.cXG().h(aWS3);
                    aWS3.f(new aGA(aWS3.caS()));
                }
                aWM.cXG().cbg();
                return false;
            }
            case 12963: {
                aWM.cXG().cbg();
                return false;
            }
            case 12027: {
                ctt ctt2 = (ctt)aAM2;
                String string3 = aUM.cWf().c("offlineFlea.transactionSummary", ctt2.eCg(), ctt2.eCf());
                cdV.on(string3);
                return false;
            }
            case 13806: {
                cto cto2 = (cto)aAM2;
                Object r = fgD.fXh().Vd(cto2.AK());
                String string4 = ((fhC)r).getName();
                String string5 = aUM.cWf().c("onlineFlea.transaction", cto2.bfd(), string4, cto2.eCa());
                cdV.on(string5);
                return false;
            }
            case 23923: {
                cyU cyU2 = (cyU)aAM2;
                long l = cyU2.eFN();
                short s = (short)(l / 31536000000L);
                short s2 = (short)((l -= (long)s * 31536000000L) / 2678400000L);
                short s3 = (short)((l -= (long)s2 * 2678400000L) / 86400000L);
                short s4 = (short)((l -= (long)s3 * 86400000L) / 3600000L);
                short s5 = (short)((l -= (long)s4 * 3600000L) / 60000L);
                short s6 = (short)((l -= (long)s5 * 60000L) / 1000L);
                aUM aUM2 = aUM.cWf();
                aPd.f("dateFormat.yearMonthDayHourMinuteSecond.playedTime", s, s2, s3, s4, s5, s6);
                return false;
            }
            case 22953: {
                String string6;
                czo czo2 = (czo)aAM2;
                String string7 = czo2.xO();
                switch (czo2.eGj()) {
                    case 0: {
                        string6 = aUM.cWf().c("who.is.user.result", string7, czo2.eGi(), czo2.bSr() ? 1 : 0, aUB.cVb().cVp());
                        break;
                    }
                    case 1: {
                        string6 = aUM.cWf().c("error.chat.userNotFound", string7);
                        break;
                    }
                    default: {
                        return false;
                    }
                }
                cdV.on(string6);
                cdV.on(TimeCommand.cBa());
                lRu.info((Object)("Whois : " + string6));
                return false;
            }
            case 12913: {
                aWy[] aWyArray;
                cqJ cqJ2 = (cqJ)aAM2;
                if (aUE.cVJ().c(ceG.euA()) && cqJ2.eyR()) {
                    return true;
                }
                aWm aWm2 = aWm.a(cqJ2);
                aWM.cXG().h(aWm2);
                for (aWy aWy2 : aWyArray = aWy.b(cqJ2)) {
                    aWM.cXG().h(aWy2);
                }
                aWM.cXG().cbg();
                return false;
            }
            case 13065: {
                cos cos2 = (cos)aAM2;
                byte by = cos2.ewi();
                short s = cos2.ewj();
                List<Short> list = cos2.ewk();
                String string8 = cos2.aav();
                int n5 = list.stream().mapToInt(Short::intValue).sum();
                String string9 = list.stream().map(Object::toString).collect(Collectors.joining(" + "));
                aPd.f("chat.random.result", string8, by, s, n5, string9);
                return false;
            }
            case 12145: {
                cpm cpm2 = (cpm)aAM2;
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
                cpj cpj2 = (cpj)aAM2;
                Object object = "";
                Object object3 = cpj2.exh().iterator();
                while (object3.hasNext()) {
                    object3.advance();
                    short s = object3.key();
                    object = (String)object + aUM.cWf().a(103, (long)s, new Object[0]);
                    object = (String)object + aUM.cWf().c("colon", new Object[0]) + object3.value();
                    if (object3.hasNext()) {
                        object = (String)object + ", ";
                        continue;
                    }
                    object = (String)object + ".";
                }
                object3 = new dcd(aUM.cWf().c("notification.IEDestroyedTitle", new Object[0]), aUM.cWf().c("notification.IEDestroyedText", object), bIU.kiC);
                aAW.bUq().h((aAM)object3);
                return false;
            }
            case 15689: {
                bgT bgT8;
                ctE ctE2 = (ctE)aAM2;
                long l = ctE2.KU();
                byte[] byArray = ctE2.eCr();
                bgT bgT9 = aUE.cVJ().cVK();
                bgT bgT3 = bgT8 = bgT9 != null && l == bgT9.Sn() ? bgT9 : (bgT)fcL.rUh.aw(aUE.cVJ().cVO().xl(), l);
                if (bgT8 == null) {
                    eIM.qxx.a(l, new cdZ(this, l, byArray));
                } else {
                    int n6 = bgT8.Xt();
                    bgT8.as(byArray);
                    int n7 = bgT8.Xt();
                    if (n7 != n6) {
                        bqM.jbp.b(new brC(n6, n7));
                    }
                }
                return false;
            }
            case 13150: {
                ctz ctz2 = (ctz)aAM2;
                long l = ctz2.awb();
                bgy bgy5 = bgG.dlO().ju(l);
                String string10 = bgy5.getName();
                String string11 = aUM.cWf().c(ctz2.eCn(), new Object[0]);
                aPi aPi2 = new aPi(string10, l, string11);
                aPi2.m(aPl.exq);
                aPh.czg().d(aPi2);
                return false;
            }
            case 12880: {
                frL frL2;
                cox cox2 = (cox)aAM2;
                frE frE2 = cox2.dQh();
                long l = cox2.dGf();
                long l5 = cox2.ewo();
                switch (frE2) {
                    case sZc: {
                        frG frG2 = frB.sYO.uH(l5);
                        frL2 = frG2.fTP();
                        break;
                    }
                    case sZb: {
                        frH frH2 = (frH)frB.sYO.a(frE2, l);
                        frI frI2 = frH2.ZE((int)l5);
                        frL2 = frI2.fTP();
                        break;
                    }
                    case sYZ: {
                        frN frN2 = (frN)frB.sYO.a(frE2, l);
                        frL2 = frN2.fTP();
                        break;
                    }
                    case sZa: {
                        frJ frJ2 = (frJ)frB.sYO.a(frE2, l);
                        frL2 = frJ2.fTP();
                        break;
                    }
                    default: {
                        lRu.error((Object)("Impossible de r\u00e9cup\u00e9rer le LOADING correspondant au travel " + String.valueOf(frE2)));
                        return false;
                    }
                }
                cdV.a(frL2);
                return false;
            }
            case 12614: {
                cow cow2 = (cow)aAM2;
                int n8 = cow2.ewm();
                int n9 = cow2.ewn();
                fdF fdF2 = (fdF)fdA.rWI.a(fdV.rZc, n8);
                fdG fdG2 = fdF2.Ul(n9);
                frL frL3 = fdG2.fTP();
                cdV.a(frL3);
                return false;
            }
            case 13416: {
                ctj ctj2 = (ctj)aAM2;
                ((bgT)fcL.rUh.sw(ctj2.KU())).dnX().cJ(ctj2.eBU());
                return false;
            }
            case 13441: {
                cvm cvm2 = (cvm)aAM2;
                short s = cvm2.dpx();
                if (s != 127) {
                    cRH.eML().cB(true).g(aUM.cWf().c("recustom.enterTheDressingRoom", new Object[0]), 0);
                } else {
                    cRH.eML().cB(true).g(aUM.cWf().c("charactersLoading.progress", new Object[0]), 0);
                }
                return false;
            }
            case 23341: {
                cvl cvl2 = (cvl)aAM2;
                bgT bgT11 = aUE.cVJ().cVK();
                bhJ bhJ2 = bgT11.dpU();
                aIe.cfn().bmW();
                aUE.cVJ().a(cdT.eui());
                aUE.cVJ().a(cYt.eXX());
                aUE.cVJ().a(ccD.etO());
                ccB.etJ().db(cvl2.KU());
                ccB.etJ().dm(cvl2.xO());
                ccB.etJ().a(ccC.lPm);
                ccB.etJ().cx(cvl2.dpx());
                ccB.etJ().at(bhJ2);
                ccB.etJ().jd(false);
                aUE.cVJ().a(ccB.etJ());
                return false;
            }
            case 12591: {
                czm czm2 = (czm)aAM2;
                boolean bl = czm2.eGf();
                boolean bl5 = czm2.eGg();
                String string12 = bl5 ? aUM.cWf().c(czm2.getMessage(), new Object[0]) : czm2.getMessage();
                fIK fIK2 = new fIK().a(fIN.uCB).vE(string12).abQ(2).vG(cCP.mRF.byf()).pd(true).a(fIL.gCp()).a((int n, String string) -> {
                    if (!bl) {
                        return;
                    }
                    dae dae2 = new dae();
                    dae2.lK(19776);
                    dae2.fa(czm2.eGe());
                    aAW.bUq().h(dae2);
                });
                fIQ.gCw().d(fIK2);
                aPh.czg().iY(string12);
                return false;
            }
            case 12991: {
                cop cop2 = (cop)aAM2;
                long l = cop2.KU();
                boolean bl = cop2.doP();
                bgy bgy6 = bgG.dlO().ju(l);
                bgy6.gf(bl);
                return false;
            }
            case 12632: {
                cpi cpi2 = (cpi)aAM2;
                long l = cpi2.KU();
                byte by = cpi2.deO();
                eIn eIn2 = new eIn();
                eIn2.O(l, by);
                return false;
            }
            case 13878: {
                AN aN;
                cvs cvs2 = (cvs)aAM2;
                byte[] byArray = cvs2.aKU();
                try {
                    aN = AN.cR(byArray);
                }
                catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                    lRu.error((Object)"Error parsing rewards info", (Throwable)invalidProtocolBufferException);
                    return false;
                }
                aUE.cVJ().cVO().f(aN);
                if (aUE.cVJ().c(cUV.eTk())) {
                    return false;
                }
                if (aN.aAR().isEmpty()) {
                    return false;
                }
                if (aN.aAR().stream().mapToInt(aS -> aS.aFg() + aS.aFj()).sum() <= 0) {
                    return false;
                }
                aPd.f("pending.rewards.notification", new Object[0]);
                bIW.mU(aUM.cWf().c("pending.rewards.notification", new Object[0])).hR(true).r(() -> {
                    if (!aUE.cVJ().c(cUV.eTk())) {
                        cUV.eTk().kq(false);
                    }
                }).mV("pending.rewards.button").Hi(9).dZz();
                return false;
            }
            case 13934: {
                cpk cpk2 = (cpk)aAM2;
                long l = cpk2.bhh();
                boolean bl = cpk2.exi();
                long l6 = aUE.cVJ().cVK().aqZ();
                if (l6 != l) {
                    return false;
                }
                aIy.dYv.clear();
                aIy.dYv.yC(bl ? 42 : -1);
                return false;
            }
            case 13434: {
                cwg cwg2 = (cwg)aAM2;
                boolean bl = cwg2.bfb();
                boolean bl6 = cwg2.eEG();
                aUE.cVJ().cVO().bl(bl);
                StringBuilder stringBuilder = new StringBuilder();
                if (bl) {
                    stringBuilder.append(aUM.cWf().c("security.account.locked", new Object[0]));
                } else if (bl6) {
                    stringBuilder.append(aUM.cWf().c("security.account.locked.offline", new Object[0]));
                } else {
                    stringBuilder.append(aUM.cWf().c("security.account.unlocked", new Object[0]));
                }
                cdV.on(stringBuilder.toString());
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
                cdV.on(aUM.cWf().c("security.returned.loot.text", new Object[0]));
                bYU.epG();
                return false;
            }
            case 12953: {
                cco.etB().jb(((coh)aAM2).evR());
                return false;
            }
            case 13495: {
                cqw cqw2 = (cqw)aAM2;
                long l = cqw2.aXb();
                bgy bgy7 = bgG.dlO().ju(l);
                if (bgy7 == null) {
                    return false;
                }
                String string13 = aUM.cWf().c("fight.join.request", bgy7.getName());
                bIW.mT(string13).Hi(5).hR(true).r(() -> aUE.cVJ().etu().d(new ckj(l, true))).hS(true).s(() -> aUE.cVJ().etu().d(new ckj(l, false))).t(() -> aUE.cVJ().etu().d(new ckj(l, false))).dZz();
                return false;
            }
        }
        return true;
    }

    private static boolean c(bZQ bZQ2) {
        if (!bZQ2.eqx()) {
            return false;
        }
        return eId.quO.pC(bZQ2.lEo).isPresent();
    }

    private static boolean mQ(long l) {
        return exc.oTQ.contains(l);
    }

    private static void on(String string) {
        aPh.czg().iZ(string);
    }

    private static void a(frL frL2) {
        ada ada2 = ada.buh();
        ada2.el(frL2.aJi());
        ada2.rJ(frL2.gkq());
        ada2.rK(frL2.bui());
        ada2.rL(frL2.buj());
    }

    public static void a(aaO[] aaOArray, bZQ bZQ2) {
        int n = bZQ2 == null ? 0 : bZQ2.eqC();
        aam aam2 = aIe.cfn().bmC();
        aam2.brg();
        if (n == 0) {
            return;
        }
        if (n > aaOArray.length) {
            lRu.warn((Object)"trop de parallax");
        }
        for (int i = 0; i < n; ++i) {
            MO mO = bZQ2.JP(i);
            aaOArray[i].a(mO);
            aam2.a(aaOArray[i]);
        }
    }

    private static void ab(bgT bgT2) {
        byV byV2 = (byV)bCw.dQn().dw(59L);
        if (byV2 == null) {
            lRu.error((Object)"[ItemAction] Impossible de spawn visuellement le havre-sac");
            return;
        }
        if (bgT2.dnw() != null) {
            return;
        }
        byV2.dC(0L);
        byV2.b(bgT2.ddI().bqg());
        byV2.dD(bgT2.aqZ());
        byV2.bU((short)1);
        byV2.ac((short)2);
        byV2.setVisible(true);
        byV2.setSelectable(false);
        byV2.aVQ();
        for (Ng ng : byV2.aVG()) {
            if (!(ng instanceof afK)) continue;
            afK afK2 = (afK)ng;
            afH.bxU().a(afK2);
            afK2.qR(afX.csm.byy());
            agX.c(afK2);
        }
        bZJ.eqi().k(byV2);
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    @Override
    public void a(ayE ayE2, boolean bl) {
        aUE.cVJ().a(cdl.etZ());
        aUE.cVJ().a(cdP.euh());
        aUE.cVJ().a(ccS.lPW);
        aUE.cVJ().a(cZh.eYT());
        aUE.cVJ().a(ceE.euz());
    }

    @Override
    public void b(ayE ayE2, boolean bl) {
        fSe.gFu().vX("player.displayStates");
        fSe.gFu().vX("isInExterior");
        fSe.gFu().vX("isInWakfuStasisInstance");
        aUE.cVJ().b(cdl.etZ());
        aUE.cVJ().b(cdP.euh());
        aUE.cVJ().b(cZh.eYT());
        aUE.cVJ().b(ceE.euz());
    }

    public void je(boolean bl) {
        this.lRB = bl;
    }

    public void a(ceb ceb2) {
        this.lRF = ceb2;
    }

    public void d(aDI aDI2) {
        if (this.lRE == null) {
            return;
        }
        if (!this.lRE.contains(aDI2)) {
            this.lRE.add(aDI2);
        }
        if (this.lRF != null && this.lRE.size() == this.lRC.length) {
            this.lRF.eux();
        }
    }

    public void e(aDI aDI2) {
        if (this.lRE == null) {
            return;
        }
        this.lRE.remove(aDI2);
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

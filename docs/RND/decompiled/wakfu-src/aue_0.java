/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TIntObjectIterator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.stream.IntStream;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aUE
 */
public class aue_0
extends ccg_0 {
    private static final Logger hqT = Logger.getLogger(aue_0.class);
    private static final aue_0 hqU = new aue_0();
    private final aut_0 hqV = new aut_0();
    private aUQ hqW;
    private bgt_0 hqX;
    private auz_0 hqY;
    private final awy_0 hqZ = new awy_0();
    private fik_2 hra;

    public static aue_0 cVJ() {
        return hqU;
    }

    public static byte[] iy(long l) {
        byte[] byArray = BH.aP(aue_0.cVJ().etm());
        byte by = (byte)byArray.length;
        byte[] byArray2 = BH.aP(aue_0.cVJ().etn());
        byte by2 = (byte)byArray2.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + by + 1 + by2);
        byteBuffer.putLong(l);
        byteBuffer.put(by);
        byteBuffer.put(byArray);
        byteBuffer.put(by2);
        byteBuffer.put(byArray2);
        byte[] byArray3 = byteBuffer.array();
        return cam_0.mnz.eo(byArray3);
    }

    public static byte[] iz(long l) {
        byte[] byArray = BH.aP(aue_0.cVJ().bDO());
        byte by = (byte)byArray.length;
        ByteBuffer byteBuffer = ByteBuffer.allocate(9 + by);
        byteBuffer.putLong(l);
        byteBuffer.put(by);
        byteBuffer.put(byArray);
        byte[] byArray2 = byteBuffer.array();
        return cam_0.mnz.eo(byArray2);
    }

    public bgt_0 cVK() {
        if (this.hqX != null && this.hqX.djT()) {
            bgy bgy2 = cul_2.eST().eSH();
            if (bgy2 != null && bgy2.bvY()) {
                return (bgt_0)bgy2;
            }
            if (!fse_1.gFu().dp("isInFightCreationOrPlacement")) {
                return (bgt_0)bvz_0.x(this.hqX);
            }
        }
        return this.hqX;
    }

    public bgt_0 cVL() {
        return this.hqX;
    }

    @Nullable
    public bgy cVM() {
        bgt_0 bgt_02 = this.cVK();
        if (bgt_02 == null) {
            return null;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        if (bsj_02 != null) {
            return bsj_02.dHe();
        }
        return bgt_02;
    }

    @Nullable
    public blh_2 cVN() {
        bgy bgy2 = this.cVM();
        if (bgy2 == null) {
            return null;
        }
        return bgy2.dlG();
    }

    public void f(bgt_0 bgt_02) {
        if (this.hqX != null) {
            this.hqX.dnY();
            this.hqX.ddI().c(bzj_2.eqi());
            this.hqX.dmF();
            this.hqX.djf();
        }
        this.hqX = bgt_02;
        byf_2.R(this.hqX);
        Bz.e(this.hqX == null ? (byte)0 : this.hqX.aWO());
        Bz.setName(this.hqX == null ? "Unknown" : this.hqX.getName());
        Bz.aN(this.hqX == null ? "Unknown" : this.hqX.dkD().getName());
        String string = this.hqX != null ? aum_0.cWf().a(39, (long)this.hqX.ffF().Xt(), new Object[0]) : null;
        Bz.aM(this.hqX == null ? "Unknown" : string);
        fse_1.gFu().f("localPlayer", bgt_02);
        fse_1.gFu().f("isInGame", bgt_02 != null);
        if (bgt_02 != null) {
            bgt_02.ddI().a(bzj_2.eqi());
        }
        this.r(bgt_02);
        aie_0.cfn().a(bgt_02);
    }

    public void r(bgy bgy2) {
        fse_1.gFu().f("observedCharacter", bgy2);
    }

    public aUQ cVO() {
        return this.hqW;
    }

    public void a(aUQ aUQ2) {
        this.hqW = aUQ2;
        fse_1.gFu().f("localAccount", aUQ2);
        byf_2.c(aUQ2);
    }

    @Override
    public void zS(int n) {
        super.zS(n);
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.ljV, n);
    }

    public void a(auz_0 auz_02) {
        this.hqY = auz_02;
    }

    public auz_0 cVP() {
        return this.hqY;
    }

    @Override
    public void bmW() {
        super.bmW();
        bsU.dHk().bmX();
        bLe.ecw().ecv();
        buc_0.dJg().clear();
        bif_2.dYO().removeAll();
        anr_2.bEe();
        bjr_1.ioi.bmX();
        cun_1.eRJ().reset();
        bse.dEP().clear();
        bly_0.ivl.clear();
        bvk_0.dKN();
        this.hqW.f(null);
        bgt_0 bgt_02 = this.hqX;
        if (bgt_02 != null) {
            aPt.cAg().cAw();
            aPt.cAg().clean();
            bkb_0 bkb_02 = bgt_02.dps();
            if (bkb_02 != null) {
                bkb_02.k(true, false);
            }
            bgt_02.dmz().eer();
            bgt_02.djv();
            ((fec_0)bgt_02.a(fez_0.sep)).dQY();
            fcL.rUh.st(bgt_02.Xi());
            bwb_0.dLo();
        }
        cts_1.ePI();
        adn_0.bvh().bvj();
        bbq_2.dao().removeAll();
        bzj_2.eqi().clear();
        bgd.diV().clean();
        apd_0.cAO().clear();
        long l = cdv_0.euj().euk();
        if (l > 0L) {
            abb_2.bUA().hk(l);
        }
        if ((l = cdv_0.euj().eul()) > 0L) {
            abb_2.bUA().hk(l);
        }
        bfN.dhv().bhk();
        cAY.eHc().eHg();
        ue_0.bjV().b(cBs.mxw);
        ue_0.bjV().b(acz_0.cgH);
        ue_0.bjV().b(aJy.chI());
        awm_0.cXG().clear();
        aJP.cig().reset();
        TIntObjectIterator<fjo_0> tIntObjectIterator = fjt.syH.eCu();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((fjo_0)tIntObjectIterator.value()).b(brx_2.laQ);
        }
        brx_2.laQ.clean();
        if (cvu_2.eQx()) {
            cvu_2.eTO().eUa();
        }
        bgg_0.dlO().dlR();
        fcL.rUh.fSP();
        bly_0.ivl.setNetEnabled(true);
        bbe_0.hAP.clear();
        bsl_0.jfZ.a(null);
        bcm_1.hIK.bmX();
        bck_1.hDV.bhk();
        bRb.kYS.clear();
        bkt_2.clear();
        bdq_0.dRC().dRD();
        abo_2.dyC.a(bna_0.kDO);
        this.f(null);
        this.r(null);
        cxe_1.eXq().clear();
        aIq.cgr().reset();
    }

    @Override
    public void bSk() {
        super.bSk();
        hqU.b(cvo_2.eUK());
        hqU.a(cwv_1.nSI);
        hqU.a(aXJ.hxe);
    }

    @Override
    public void bmX() {
        super.bmX();
        baj_2.hzf.cZs();
    }

    public void a(ezt_0 ezt_02) {
        this.cV((byte)26);
        ezv_0 ezv_02 = ezt_02.fni().fnp();
        List<oo_0> list = IntStream.of(ezv_02.fno()).mapToObj(n -> new oo_0(ezv_02.fnn(), n)).toList();
        this.hqV.reset();
        this.hqV.A(list);
        this.hqV.l(this::cVQ);
        this.hqV.bXW();
    }

    private void cVQ() {
        this.kH("Proxy connection error");
        this.cVR();
    }

    public void B(List<oo_0> list) {
        this.cV((byte)26);
        if (!aUxx.gzd.cUY()) {
            hqT.warn((Object)("Connection try refused : client not in a valid state " + String.valueOf((Object)aUxx.gzd.cUX())));
            return;
        }
        aUxx.gzd.a(auy_0.gzg);
        this.hqV.reset();
        this.hqV.A(list);
        this.hqV.l(this::cVR);
        this.hqV.bXW();
    }

    private void cVR() {
        hqT.error((Object)"Unable to connect to proxy");
        this.cV((byte)80);
        crh_2.eML().bCj();
        fiu_1.uCW.N("loginLock", true);
        aUxx.gzd.a(auy_0.gzf);
        this.cVU();
    }

    public boolean cVS() {
        if (this.hqZ.bSr()) {
            hqT.error((Object)"[CHAT] Inter chat already connected. Disconnecting now");
            this.hqZ.bXT();
        }
        this.hqZ.beZ();
        String string = auc_0.cVq().l("interChatUrl", "");
        String[] stringArray = string.split(":");
        if (stringArray.length != 2 || stringArray[0].isEmpty() || stringArray[1].isEmpty()) {
            hqT.error((Object)("[CHAT] Invalid url for inter chat, connection cancelled. url=" + string));
            return false;
        }
        String string2 = stringArray[0];
        int n = Integer.parseInt(stringArray[1]);
        awz_0 awz_02 = new awz_0(this.hqZ, string2);
        awx_0 awx_02 = new awx_0((ChannelHandler)awz_02, string2, n);
        return awx_02.a(this.hqZ);
    }

    @Override
    public void cVT() {
    }

    @Override
    public void zT(int n) {
        hqT.info((Object)("queryResultCode : " + n));
    }

    @Override
    public void dN(byte[] byArray) {
        this.a(csn_2.eNY());
        String string = aum_0.cWf().c("link.support", new Object[0]);
        String string2 = aum_0.cWf().c("logon.invalidClientVersion", exH.es(exH.pdv), exH.es(byArray), string);
        fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).vE(string2).vG(ccp_2.mRF.byf()).abQ(2));
        crh_2.eML().bCj();
        fiu_1.uCW.N("loginLock", true);
        this.kH("Invalid Client Version");
    }

    @Override
    protected void cVU() {
        aaw_1.bUq().h(new vt_0(() -> {
            this.a(csn_2.eNY());
            crh_2.eML().bCj();
            fiu_1.uCW.N("loginLock", true);
            fiq_2.gCw().d(fik_2.gBZ().a(fin_2.uCs).l("logon.noProxyAvailable", new Object[0]).vG(ccp_2.mRF.byf()).abQ(1));
        }));
    }

    @Override
    protected void cVV() {
        if (this.hqY == null) {
            hqT.error((Object)"Aucune phase de login n'a \u00e9t\u00e9 \u00e9tablie !");
            return;
        }
        crh_2.eML().cB(true).g(aum_0.cWf().c("logon.progress", new Object[0]), 0);
        cio_0 cio_02 = new cio_0();
        this.etu().d(cio_02);
        cin_0 cin_02 = new cin_0(this.hqY.aWj());
        this.etu().d(cin_02);
    }

    @Override
    protected void cVW() {
        if (this.hra != null) {
            fiq_2.gCw().a(this.hra, false);
        }
        this.hra = fik_2.a((String string) -> {
            this.b(cwq_2.eVS());
            this.b(cdv_0.euj());
            cdv_0.euj().eut();
            bgt_0 bgt_02 = this.cVK();
            if (bgt_02 != null && (bgt_02.dps() == null || bgt_02.dps().dsm() != 4)) {
                auf_0 auf_02 = new auf_0(this);
                this.a(bgt_02, auf_02);
            } else {
                this.cVX();
            }
        }, string -> aie_0.cfn().ej(false)).l(aie_0.cfn().cfI() ? "question.change.server" : "question.disconnect", new Object[0]).abQ(1).vG(ccp_2.mRE.byf());
        fiq_2.gCw().d(this.hra);
    }

    public void a(bgy bgy2, ZJ zJ) {
        String string;
        bgy2.i(false, false);
        bdj_2 bdj_22 = bgy2.ddI();
        bdj_22.a(zJ);
        bdj_22.a(abi_1.dzk);
        String[] stringArray = new String[]{"AnimEmote-Coucou", "AnimEmote-Huss-Boucle", "AnimEmoteMarket-LeverMain"};
        String string2 = string = bdj_22.bvW() ? "AnimArtefact-Nager-Debut" : stringArray[GC.mR(stringArray.length)];
        if (bdj_22.dZ(string)) {
            bdj_22.dT(string);
        } else {
            zJ.animationEnded(bdj_22);
        }
    }

    void cVX() {
        crh_2.eML().cB(true).g(aum_0.cWf().c("disconnection.progress", new Object[0]), 0);
        bbs_2.das();
        this.kH("LogOff");
        if (!this.c(csn_2.eNY())) {
            this.a(csn_2.eNY());
        }
    }

    @Override
    protected void cVY() {
        aie_0.cfn().ej(true);
        this.kH("Going to World Selection");
    }

    @Override
    protected void cVZ() {
        fiq_2.gCw().d(new fik_2().l("question.quit", new Object[0]).vG(ccp_2.mRE.byf()).abQ(1).a(fil_2.gCn().c((String string) -> {
            this.kH("Quit Request From Client");
            aie_0.cfn().bmB().close();
        })).a(fil_2.gCo()));
    }

    public void kH(@Nullable String string) {
        if (this.hqX != null) {
            fcL.rUh.b(this.hqW.xl(), bgt_02 -> {
                bgt_02.dlG().edw();
                return true;
            });
            long l = cdv_0.euj().euk();
            if (l > 0L) {
                abb_2.bUA().hk(l);
            }
        }
        hqU.b(cdw_0.lQP);
        if (this.etu() != null) {
            hqT.info((Object)("Sending DisconnectionMessage to Servers. Reason : {" + string + "}"));
            this.etu().bSq();
        }
        if (this.hqY == auz_0.gzm || this.hqY == auz_0.gzn) {
            this.cWa();
        }
    }

    public void cWa() {
        ChannelFuture channelFuture = this.hqZ.bXT();
        if (channelFuture == null) {
            return;
        }
        channelFuture.addListener(future -> apl_0.eAC.beZ());
    }

    public void d(aam_2 aam_22) {
        throw new UnsupportedOperationException("Pas d'envoi de message \u00ef\u00bf\u00bd l'aide de cette entit\u00ef\u00bf\u00bd : voir : getNetworkEntity()");
    }

    public static void a(bdf_1 bdf_12) {
        if (aue_0.hqU.hqX == null) {
            return;
        }
        bdj_2 bdj_22 = aue_0.hqU.hqX.ddI();
        if (bdf_12 == bdj_22) {
            return;
        }
        int n = bdf_12.bcC() - bdj_22.bcC();
        int n2 = bdf_12.bcD() - bdj_22.bcD();
        if (Math.abs(n) > 54 || Math.abs(n2) > 54) {
            hqT.warn((Object)("acteur (" + bdf_12.Sn() + ") se d\u00e9pla\u00e7ant trop loin (probl\u00e8me avec PartitionIntersectorCache?) camera=" + String.valueOf(bdj_22.bqg()) + " acteurPos=" + String.valueOf(bdf_12.bqg())));
        }
    }

    public awy_0 cWb() {
        return this.hqZ;
    }
}


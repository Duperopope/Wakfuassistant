/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.iterator.TShortIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TShortIntHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.iterator.TShortIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TShortIntHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bhJ
extends bgy
implements PO<bcd_2>,
qf_0,
Vg,
ekf_0,
eve_2,
fad,
frt_0 {
    public static final String ihl = "skinColor";
    public static final String ihm = "hairColor";
    public static final String ihn = "pupilColor";
    public static final String iho = "costume1Color";
    public static final String ihp = "costume2Color";
    public static final String ihq = "costume3Color";
    public static final String ihr = "costume4Color";
    public static final String ihs = "costume5Color";
    public static final String iht = "costume6Color";
    public static final String ihu = "skinHexColor";
    public static final String ihv = "hairHexColor";
    public static final String ihw = "pupilHexColor";
    public static final String ihx = "costume1HexColor";
    public static final String ihy = "costume2HexColor";
    public static final String ihz = "costume3HexColor";
    public static final String ihA = "costume4HexColor";
    public static final String ihB = "costume5HexColor";
    public static final String ihC = "costume6HexColor";
    public static final String ihD = "clothIndex";
    public static final String ihE = "faceIndex";
    public static final String ihF = "skinDescription";
    public static final String ihG = "hairDescription";
    public static final String ihH = "pupilDescription";
    public static final String ihI = "costume1Description";
    public static final String ihJ = "costume2Description";
    public static final String ihK = "costume3Description";
    public static final String ihL = "costume4Description";
    public static final String ihM = "costume5Description";
    public static final String ihN = "costume6Description";
    public static final String ihO = "skinAvailability";
    public static final String ihP = "hairAvailability";
    public static final String ihQ = "pupilAvailability";
    public static final String ihR = "breedIconUrl";
    public static final String ihS = "breedPopupIconUrl";
    public static final String ihT = "illustrationUrl";
    public static final String ihU = "characterSelectionIllustrationsUrl";
    public static final String ihV = "characterChoiceIllustrationUrl";
    public static final String ihW = "characterSheetIllustrationUrl";
    public static final String ihX = "characterSheetSmallIllustrationUrl";
    public static final String ihY = "characterSheetCircleIllustrationUrl";
    public static final String ihZ = "setIndex";
    public static final String iia = "hasRecustom";
    public static final String iib = "needsRename";
    public static final String iic = "canRename";
    public static final String iid = "currentTitleId";
    public static final String iie = "currentTitle";
    public static final String iif = "currentTitleRarityColor";
    public static final String iig = "currentTitleObject";
    public static final String iih = "hasGuild";
    public static final String iii = "guildName";
    public static final String iij = "guildBlazon";
    public static final String iik = "hasNation";
    public static final String iil = "characterNationStamp";
    public static final String iim = "characterListNation";
    public static final String iin = "characterListNewPlayer";
    public static final String iio = "characterListNationIconUrl";
    public static final String iip = "characterListNationStamp";
    public static final String iiq = "characterListNewPlayerIconUrl";
    public static final String iir = "citizen";
    public static final String iis = "breedAptitudesTitle";
    public static final String iit = "smileyIconUrl";
    public static final String iiu = "nameAndLevel";
    public static final String iiv = "instanceName";
    public static final String iiw = "breedCharacValue";
    public static final String iix = "breedCharacDescription";
    public static final String iiy = "breedCharacImage";
    public static final String iiz = "breedCharacSmallImage";
    public static final String iiA = "breedCharacIconUrl";
    public static final String iiB = "breedChartValues";
    public static final String[] iiC = new String[]{"costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color", "costume1HexColor", "costume2HexColor", "costume3HexColor", "costume4HexColor", "costume5HexColor", "costume6HexColor"};
    public static final String[] iiD = new String[]{"hairColor", "skinColor", "pupilColor", "costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color", "skinHexColor", "hairHexColor", "pupilHexColor", "costume1HexColor", "costume2HexColor", "costume3HexColor", "costume4HexColor", "costume5HexColor", "costume6HexColor"};
    public static final String[] iiE = new String[]{"illustrationUrl", "characterChoiceIllustrationUrl", "setIndex", "hasRecustom", "needsRename", "hairDescription", "skinDescription", "pupilDescription", "currentTitle", "currentTitleRarityColor", "hasGuild", "hasNation", "nameAndLevel", "skinColor", "hairColor", "pupilColor", "costume1Color", "costume2Color", "costume3Color", "costume4Color", "costume5Color", "costume6Color", "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", "costume1HexColor", "skinHexColor", "hairHexColor", "pupilHexColor", "costume2HexColor", "costume3HexColor", "costume4HexColor", "costume5HexColor", "costume6HexColor", "breedChartValues"};
    public static final String[] iiF = new String[iiE.length + bgy.ibP.length];
    protected final eyt_0 iiG = new eyt_0();
    private final ArrayList<cps_1> iiH = new ArrayList<cps_1>(Arrays.asList(cps_1.njz, cps_1.niF, cps_1.njB, cps_1.niz, cps_1.niD, cps_1.niA, cps_1.niB, cps_1.njC, cps_1.niP, cps_1.njR, cps_1.niT, cps_1.njx, cps_1.niZ, cps_1.nje, cps_1.njn));
    protected eIF iiI;
    protected int ciZ;
    protected boolean iiJ;
    protected boolean iiK;
    boolean iiL;
    short iiM;
    protected TByteIntHashMap iiN;
    protected byte iiO;
    protected bkb_0 iiP;
    private static final afr_1[] iiQ;
    private biu_0 iiR;
    protected frw_0 iiS;
    public boolean bXs;
    protected yu_1 iiT;
    private final ejg_0 iiU = new eji_0();
    private final bgm_0 iiV;
    private final bhi_0 iiW = new bhi_0(this);
    protected bmw_0 iiX;
    final evd_2 iiY;
    short iiZ;
    @NotNull
    final bjn_1 ija;
    private bjo_0 ijb;
    protected bjo_0 ijc;
    long ijd;
    private final eko_0 ije = new eko_0();
    private short ijf;
    private eMS ijg = new eMS();
    boolean ijh;
    boolean iji = false;
    private short ejt;

    public bhJ() {
        this.icm = new bgw_0(this);
        this.pgd = new exh_1();
        this.icn = new bim_0(this);
        this.iiV = new bgm_0(4000.0, (exf_2)this.pgd.b(exx_2.rGi));
        this.pgf.a(bat_2.cZD());
        this.iiY = this.dmB();
        this.ija = this.dmC();
        this.iiI = new eIF();
        this.icx = new bjm_1(this.ija);
        this.dmI();
        int n = ewo_0.oBF.i(ewr_0.oCo);
        if (n > 0) {
            this.CK(n);
        }
        this.a(ewr_0.oCq);
    }

    protected evd_2 dmB() {
        return new aur_0();
    }

    protected bjn_1 dmC() {
        return new bjq_1();
    }

    @Override
    public void dmI() {
        super.dmI();
        new bhO(this, this.iiG.fkH());
        new bht_0(this, this.iiG.fkY());
        new bhY(this, this.iiG.fkD());
        new bil(this, this.iiG.fkE());
        new bim(this, this.iiG.fkF());
        new bhR(this, this.iiG.flf());
        new bii(this, this.iiG.fkT());
        new bhS(this, this.iiG.fiz());
        new bie(this, this.iiG.fli());
        new bhX(this, this.iiG.flp());
        new bhV(this, this.iiG.fll());
        new bhw_0(this, this.iiG.flm());
        new bhu_0(this, this.iiG.fln());
        new bhz_0(this, this.iiG.flo());
        new bib(this, this.iiG.fls());
        new bhP(this, this.iiG.flt());
        new bid(this, this.iiG.flv());
        new bic(this, this.iiG.flw());
        new bia(this, this.iiG.fkJ());
        new bij_0(this, this.iiG.fly());
        new bif_0(this, this.iiG.fkK());
        new bih(this, this.iiG.fkQ());
        new big(this, this.iiG.flz());
        new bik_0(this, this.iiG.flH());
        new bhq_0(this, this.iiG.fkL());
        new bhN(this, this.iiG.flA());
        new bkt_0(this.iiG.flF(), this);
        new bkr_1(this, this.iiG.fiF());
        new bks_1(this, this.iiG.fkW());
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ija.clear();
        this.ijd = 0L;
        this.iiL = false;
        this.iiM = 0;
        this.ije.gg(true);
    }

    @Override
    public void aVH() {
        if (this.iiR != null) {
            this.iiR.clear();
            this.iiR = null;
        }
        long l = this.Sn();
        super.aVH();
        this.iiG.clear();
        this.dpc();
        this.dpd();
        this.iiU.clear();
        this.ija.clear();
        this.ijd = 0L;
        this.ije.gg(true);
        bcd_2 bcd_22 = bbw_2.hCq.je(l);
        if (bcd_22 != null) {
            ((bhp_0)bcd_22.daE()).bmX();
        }
    }

    @Override
    public int doZ() {
        return this.ije.duZ();
    }

    @Override
    public boolean doJ() {
        return this.ije.doJ();
    }

    @Override
    public void L(int n, int n2) {
    }

    @Override
    public void aYw() {
    }

    public short dpa() {
        return this.iiZ;
    }

    public void b(int n, int n2, int n3, int n4, int n5) {
        ffV ffV2;
        if (this.ijb != null) {
            this.b(this.ijb);
        }
        fov_0 fov_02 = foy_0.sLJ.XP(n);
        fnl_0 fnl_02 = fno_0.sKx.g(fov_02);
        this.ijb = new bjo_0(this, fnl_02);
        this.ddI().a((WT)this.ijb);
        if (this.bvY() && (ffV2 = this.dmL().a(bgr_1.jVu.tu(this.aXv), ffS.sgX)) != null && ffV2.ead() != null && ffV2.ead().geL().d() == fnl_02.geL().d()) {
            ffV2.ead().a(this.ijb.eal());
        }
        this.a(n2, n3, n4, n5, this.ijb);
    }

    public void c(int n, int n2, int n3, int n4, int n5) {
        ffV ffV2;
        fns_0 fns_02;
        fns_0 fns_03 = fns_02 = this.ijc != null ? this.ijc.eal() : null;
        if (this.ijc != null) {
            this.dpd();
        }
        fov_0 fov_02 = foy_0.sLJ.XP(n);
        fnl_0 fnl_02 = fno_0.sKx.g(fov_02);
        this.ijc = new bjj_0(this, fnl_02);
        this.ddI().a((WT)this.ijc);
        if (this.bvY() && (ffV2 = this.dmL().a(bgr_1.jVu.tu(this.aXv), ffS.sgZ)) != null && ffV2.ead() != null && ffV2.ead().geL().d() == fnl_02.geL().d()) {
            ffV2.ead().b(fns_02);
            ffV2.ead().a(this.ijc.eal());
        }
        this.a(n2, n3, n4, n5, this.ijc);
        this.dpb();
    }

    private void dpb() {
        if (this.bwb()) {
            this.ddI().ddv().ifPresent(bke_22 -> this.dni());
        } else {
            this.dnh();
        }
    }

    private void a(int n, int n2, int n3, int n4, bjo_0 bjo_02) {
        fnm_0 fnm_02 = new fnm_0(bjo_02);
        fnl_0 fnl_02 = bjo_02.ead();
        try {
            fnm_02.Xt(n4);
            if (n2 > 0) {
                fnm_02.Xs(n2);
            } else if (n2 <= 0 && fnl_02.agK() > 0) {
                fnm_02.geS();
            }
            fnm_02.Xu(n);
            if (n3 > 0 && fnl_02.agT() <= 0) {
                fnm_02.Xw(n3);
                fnm_02.af(ue_0.bjV().bjc());
            } else if (n3 <= 0 && fnl_02.agT() > 0) {
                fnm_02.geU();
                fnm_02.geV();
            }
        }
        catch (foD foD2) {
            pfX.error((Object)("Erreur lors de l'initialisation du familier dans le monde pour le joueur " + String.valueOf(this)), (Throwable)foD2);
        }
    }

    public void dpc() {
        this.b(this.ijb);
        this.ijb = null;
    }

    public void dpd() {
        this.b(this.ijc);
        this.ijc = null;
    }

    private void b(bjo_0 bjo_02) {
        if (bjo_02 == null) {
            return;
        }
        if (this.dkO()) {
            this.ddI().b(bjo_02);
        }
        bjo_02.eag();
    }

    public bjo_0 dpe() {
        return this.ijb;
    }

    public bjo_0 dpf() {
        return this.ijc;
    }

    @Override
    protected void dny() {
        if (this.fhp() != eyh_0.pka) {
            return;
        }
        this.a(new bin());
    }

    @Override
    public void a(ety_0 ety_02) {
        this.dny();
        super.a(ety_02);
        this.hKX.ddv().ifPresent(bke_22 -> bke_22.r(this.hKX));
        if (this.dmc()) {
            this.ddI().setVisible(true);
        }
        this.djv();
        this.djo();
        this.a(this.dfW());
    }

    @NotNull
    public bgm_0 dpg() {
        return this.iiV;
    }

    @Override
    protected eyp dmk() {
        return eym.phV;
    }

    @Override
    protected byte dml() {
        return 0;
    }

    @Override
    public boolean dmh() {
        return false;
    }

    @Override
    public void CV(int n) {
        if (this.ciZ == n) {
            return;
        }
        this.ciZ = n;
        for (eyk_0 eyk_02 : this.pga) {
            eyk_02.j(this);
        }
        this.dkr();
    }

    public eym dfW() {
        return (eym)super.doV();
    }

    @Override
    public int aVt() {
        int n = super.aVt();
        if (n != 0) {
            return n;
        }
        return this.ciZ;
    }

    public eIF dph() {
        return this.iiI;
    }

    public void v(int n, boolean bl) {
        this.iiI.BQ(n);
        if (bl) {
            this.dpi();
            fse_1.gFu().a((aef_2)this, ihl);
            fse_1.gFu().a((aef_2)this, ihu);
        }
    }

    private void dpi() {
        this.b(this.ddI(), true);
    }

    public void w(int n, boolean bl) {
        this.iiI.BR(n);
        if (bl) {
            this.dpj();
            fse_1.gFu().a((aef_2)this, ihm);
            fse_1.gFu().a((aef_2)this, ihv);
        }
    }

    private void dpj() {
        this.a(this.ddI(), true);
    }

    public void x(int n, boolean bl) {
        this.iiI.BS(n);
        if (bl) {
            this.dpk();
            fse_1.gFu().a((aef_2)this, ihn);
            fse_1.gFu().a((aef_2)this, ihw);
        }
    }

    private void dpk() {
        bjc_1.a(new bjc_1(this.iiI.sG()), (ZC)this.ddI(), arx_1.cTz, true);
    }

    private void a(arx_1 arx_12, int n) {
        switch (arx_12) {
            case cTB: {
                this.iiI.BT(n);
                break;
            }
            case cTC: {
                this.iiI.BU(n);
                break;
            }
            case cTD: {
                this.iiI.BV(n);
                break;
            }
            case cTE: {
                this.iiI.BW(n);
                break;
            }
            case cTF: {
                this.iiI.BX(n);
                break;
            }
            case cTG: {
                this.iiI.BY(n);
            }
        }
    }

    public void a(arx_1 arx_12, int n, boolean bl) {
        if (!arx_1.a(arx_12)) {
            return;
        }
        this.a(arx_12, n);
        if (bl) {
            this.c(arx_12);
            fse_1.gFu().a((aef_2)this, iiC);
        }
    }

    public void a(dR dR2, boolean bl) {
        this.a(arx_1.cTB, dR2.sI());
        this.a(arx_1.cTC, dR2.sK());
        this.a(arx_1.cTD, dR2.sM());
        this.a(arx_1.cTE, dR2.sO());
        this.a(arx_1.cTF, dR2.sQ());
        this.a(arx_1.cTG, dR2.sS());
        if (bl) {
            this.dpl();
            fse_1.gFu().a((aef_2)this, iiC);
        }
    }

    private int b(arx_1 arx_12) {
        switch (arx_12) {
            case cTB: {
                return this.iiI.sI();
            }
            case cTC: {
                return this.iiI.sK();
            }
            case cTD: {
                return this.iiI.sM();
            }
            case cTE: {
                return this.iiI.sO();
            }
            case cTF: {
                return this.iiI.sQ();
            }
            case cTG: {
                return this.iiI.sS();
            }
        }
        throw new IllegalArgumentException("Not a costume: " + String.valueOf((Object)arx_12));
    }

    private void c(arx_1 arx_12) {
        if (!arx_1.a(arx_12)) {
            return;
        }
        bjc_1.a(new bjc_1(this.b(arx_12)), (ZC)this.ddI(), arx_12, true);
    }

    private void dpl() {
        for (arx_1 arx_12 : arx_1.cTH) {
            this.c(arx_12);
        }
    }

    private void a(ZC zC, boolean bl) {
        bjc_1 bjc_12 = new bjc_1(this.iiI.sE());
        bjc_1.a(bjc_12, zC, arx_1.cTt, bl);
    }

    private void b(ZC zC, boolean bl) {
        bjc_1 bjc_12 = new bjc_1(this.iiI.sC());
        bjc_1.a(bjc_12, zC, arx_1.cTs, bl);
    }

    private void c(ZC zC, boolean bl) {
        bjc_1 bjc_12 = new bjc_1(this.iiI.sG());
        bjc_1.a(bjc_12, zC, arx_1.cTz, bl);
    }

    private void a(arx_1 arx_12, ZC zC, boolean bl) {
        if (!arx_1.a(arx_12)) {
            return;
        }
        bjc_1 bjc_12 = new bjc_1(this.b(arx_12));
        bjc_1.a(bjc_12, zC, arx_12, bl);
    }

    @Override
    protected final void dkw() {
        this.dpj();
        this.dpk();
        this.dpi();
        this.dpl();
    }

    public void dpm() {
        this.w(bft_2.dgp().d(this.aWP(), this.aWO(), this.dlz()), true);
        this.v(bft_2.dgp().c((int)this.aWP(), this.aWO(), (short)this.dlz()), true);
        this.x(bft_2.dgp().e(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx_1.cTB, bft_2.dgp().f(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx_1.cTC, bft_2.dgp().g(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx_1.cTD, bft_2.dgp().h(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx_1.cTE, bft_2.dgp().i(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx_1.cTF, bft_2.dgp().j(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx_1.cTG, bft_2.dgp().k(this.aWP(), this.aWO(), this.dlz()), true);
    }

    public void a(short s, byte by, byte by2) {
        if (s == -1) {
            this.dpm();
        }
        short s2 = this.aWP();
        byte by3 = this.aWO();
        byte by4 = this.dlz();
        if (this.iiI.sE() == bft_2.dgp().d(s, by, by2)) {
            this.w(bft_2.dgp().d(s2, by3, by4), true);
        }
        if (this.iiI.sC() == bft_2.dgp().c((int)s, by, (short)by2)) {
            this.v(bft_2.dgp().c((int)s2, by3, (short)by4), true);
        }
        if (this.iiI.sG() == bft_2.dgp().e(s, by, by2)) {
            this.x(bft_2.dgp().e(s2, by3, by4), true);
        }
        if (this.iiI.sI() == bft_2.dgp().f(s, by, by2)) {
            this.a(arx_1.cTB, bft_2.dgp().f(s2, by3, by4), true);
        }
        if (this.iiI.sK() == bft_2.dgp().g(s, by, by2)) {
            this.a(arx_1.cTC, bft_2.dgp().g(s2, by3, by4), true);
        }
        if (this.iiI.sM() == bft_2.dgp().h(s, by, by2)) {
            this.a(arx_1.cTD, bft_2.dgp().h(s2, by3, by4), true);
        }
        if (this.iiI.sO() == bft_2.dgp().i(s, by, by2)) {
            this.a(arx_1.cTE, bft_2.dgp().i(s2, by3, by4), true);
        }
        if (this.iiI.sQ() == bft_2.dgp().j(s, by, by2)) {
            this.a(arx_1.cTF, bft_2.dgp().j(s2, by3, by4), true);
        }
        if (this.iiI.sS() == bft_2.dgp().k(s, by, by2)) {
            this.a(arx_1.cTG, bft_2.dgp().k(s2, by3, by4), true);
        }
    }

    @Override
    public String dlx() {
        if (this.iiI.dlA() < 0) {
            return null;
        }
        return bft_2.dgp().a(this.ltt.aWP(), this.aWO(), this.iiI.dlz(), this.iiI.dlA());
    }

    @Override
    public String dly() {
        if (this.iiI.dlz() < 0) {
            return null;
        }
        return bft_2.dgp().o(this.ltt.aWP(), this.aWO(), this.iiI.dlz());
    }

    @Override
    public byte dlz() {
        return this.iiI.dlz();
    }

    @Override
    public void c(byte by, boolean bl) {
        this.iiI.eR(by);
        this.dpo();
        if (bl) {
            this.dkr();
        }
    }

    @Override
    public byte dlA() {
        return this.iiI.dlA();
    }

    @Override
    public void d(byte by, boolean bl) {
        this.iiI.eS(by);
        if (bl) {
            this.dkr();
        }
    }

    public boolean dpn() {
        return this.iiL;
    }

    @Override
    public void dkl() {
        ((exh_1)this.fgM()).a(this);
        bNB.kDS.a(this.dlc());
    }

    @Override
    public void dkm() {
        ((exh_1)this.fgM()).b(this);
        bNB.kDS.b(this.dlc());
    }

    public void CW(int n) {
        this.ije.DN(n);
    }

    public void gg(boolean bl) {
        this.ije.gg(bl);
    }

    public void bx(short s) {
        this.ijf = s;
        fse_1.gFu().a((aef_2)this, iiu, "downscaleLevel");
    }

    @Override
    protected final void dkz() {
        super.dkz();
        this.ddI().ddo();
    }

    public void dpo() {
        this.CV(this.c(this.dfW().aWP(), this.aWO()));
    }

    public short c(short s, byte by) {
        return bft_2.dgp().b(s, by, (short)this.dlz());
    }

    public void b(eyp eyp2) {
        this.c(eyp2);
        this.iiO = 0;
        this.dpo();
    }

    @Override
    public void aQ(byte by) {
        super.aQ(by);
        this.iiI.aQ(by);
        this.dpo();
    }

    @Override
    @NotNull
    public ejg_0 dmn() {
        return this.iiU;
    }

    public void dpp() {
        this.p = bjz_2.dsb().dsa();
    }

    public short dpq() {
        short[] sArray = bEr.dSi().f(this.dfW().aWP(), this.aWO());
        return sArray[this.iiO];
    }

    public void dpr() {
        short[] sArray = bEr.dSi().f(this.dfW().aWP(), this.aWO());
        this.iiO = 0;
        if (sArray != null && sArray.length > 0) {
            this.by(sArray[this.iiO]);
        }
    }

    public bkb_0 dps() {
        return this.iiP;
    }

    @Override
    public void a(eid_0 eid_02) {
        this.iiP = (bkb_0)eid_02;
    }

    @Override
    public boolean i(boolean bl, boolean bl2) {
        if (this.iiP == null) {
            return true;
        }
        if (this.iiP.k(bl, bl2)) {
            this.iiP = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean dnY() {
        return this.gd(true);
    }

    @Override
    public boolean gd(boolean bl) {
        if (this.iiP == null) {
            return true;
        }
        if (this.iiP.gq(bl)) {
            short s = this.iiP.dsm();
            this.iiP = null;
            long l = fcK.rUe.sq(this.ePP);
            if (this.bvY() && this.aXv == l && s == 4) {
                fcL.rUh.b(this.ePP, exP2 -> {
                    if (exP2.Sn() == l) {
                        return true;
                    }
                    exP2.gf(false);
                    return true;
                });
            }
            return true;
        }
        return false;
    }

    @Override
    public void dpt() {
        this.dnY();
    }

    @Override
    public long dmi() {
        return 0L;
    }

    @Override
    public long jw(long l) {
        return 0L;
    }

    @Override
    public long jx(long l) {
        return 0L;
    }

    public void by(short s) {
        if (bhJ.a(s, this.ddI(), this.aWO())) {
            fse_1.gFu().a((aef_2)this, ihZ);
        }
    }

    public static boolean a(short s, bdf_1 bdf_12, byte by) {
        bEq bEq2 = bEr.dSi().bW(s);
        if (bEq2 != null) {
            boolean bl = false;
            for (bgv_2 bgv_22 : bEq2) {
                if (bgv_22 != null) {
                    ffS[] ffSArray;
                    ffV ffV2 = new ffV();
                    ffV2.l(bgv_22);
                    if (ffV2.fWi() == null || (ffSArray = ffV2.fWi().fZq()).length <= 0) continue;
                    short s2 = ffSArray[0].shb;
                    bdf_12.a(bgv_22, s2, by);
                    bl = true;
                    continue;
                }
                pfX.error((Object)"Impossible de cree l'item , reference item null");
            }
            return bl;
        }
        pfX.error((Object)("Impossible d'appliquer le set " + s + " \u00e0 un personnage : set inconnu"));
        return false;
    }

    @Override
    public String[] bxk() {
        return iiF;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "clothIndex": {
                return (int)this.dlz();
            }
            case "faceIndex": {
                return (int)this.dlA();
            }
            case "skinColor": {
                return new awx_2(this.iiI.sC());
            }
            case "hairColor": {
                return new awx_2(this.iiI.sE());
            }
            case "pupilColor": {
                return new awx_2(this.iiI.sG());
            }
            case "costume1Color": {
                return new awx_2(this.iiI.sI());
            }
            case "costume2Color": {
                return new awx_2(this.iiI.sK());
            }
            case "costume3Color": {
                return new awx_2(this.iiI.sM());
            }
            case "costume4Color": {
                return new awx_2(this.iiI.sO());
            }
            case "costume5Color": {
                return new awx_2(this.iiI.sQ());
            }
            case "costume6Color": {
                return new awx_2(this.iiI.sS());
            }
            case "skinHexColor": {
                return new awx_2(this.iiI.sC()).bQk().toUpperCase();
            }
            case "hairHexColor": {
                return new awx_2(this.iiI.sE()).bQk().toUpperCase();
            }
            case "pupilHexColor": {
                return new awx_2(this.iiI.sG()).bQk().toUpperCase();
            }
            case "costume1HexColor": {
                return new awx_2(this.iiI.sI()).bQk().toUpperCase();
            }
            case "costume2HexColor": {
                return new awx_2(this.iiI.sK()).bQk().toUpperCase();
            }
            case "costume3HexColor": {
                return new awx_2(this.iiI.sM()).bQk().toUpperCase();
            }
            case "costume4HexColor": {
                return new awx_2(this.iiI.sO()).bQk().toUpperCase();
            }
            case "costume5HexColor": {
                return new awx_2(this.iiI.sQ()).bQk().toUpperCase();
            }
            case "costume6HexColor": {
                return new awx_2(this.iiI.sS()).bQk().toUpperCase();
            }
            case "hairAvailability": {
                return bft_2.dgp().l(this.dfW().aWP(), this.aWO(), this.dlz());
            }
            case "skinAvailability": {
                return bft_2.dgp().m(this.dfW().aWP(), this.aWO(), this.dlz());
            }
            case "pupilAvailability": {
                return bft_2.dgp().n(this.dfW().aWP(), this.aWO(), this.dlz());
            }
            case "hairDescription": {
                return bft_2.dgp().h(this.dfW().aWP(), this.aWO());
            }
            case "skinDescription": {
                return bft_2.dgp().g(this.dfW().aWP(), this.aWO());
            }
            case "hasRecustom": {
                return this.iiL;
            }
            case "needsRename": {
                return bgr_0.dmo().jz(this.Sn());
            }
            case "canRename": {
                return this.dpW();
            }
            case "illustrationUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedIllustrationPath"), this.dfW().aWP(), this.aWO());
                }
                catch (fu_0 fu_02) {
                    pfX.error((Object)"PropertyException during getFieldValue for ILLUSTRATION_URL_FIELD", (Throwable)fu_02);
                    break;
                }
            }
            case "characterChoiceIllustrationUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedCharacterChoiceIllustrationPath"), this.dfW().aWP(), this.aWO());
                }
                catch (fu_0 fu_03) {
                    pfX.error((Object)"PropertyException during getFieldValue for CHARACTER_CHOICE_ILLUSTRATION_URL_FIELD", (Throwable)fu_03);
                    break;
                }
            }
            case "characterSheetIllustrationUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedCharacterSheetIllustrationPath"), this.aWP(), this.aWO());
                }
                catch (fu_0 fu_04) {
                    pfX.error((Object)"PropertyException during getFieldValue for breedCharacterSheetIllustrationPath", (Throwable)fu_04);
                    break;
                }
            }
            case "characterSheetSmallIllustrationUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedCharacterPortrait80Path"), this.ltt.aWP() + String.valueOf(this.aZm));
                }
                catch (fu_0 fu_05) {
                    pfX.error((Object)"PropertyException during getFieldValue for CHARACTER_SHEET_SMALL_ILLUSTRATION_URL", (Throwable)fu_05);
                    break;
                }
            }
            case "characterSheetCircleIllustrationUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedCircleIllustrationPath"), this.ltt.aWP() + String.valueOf(this.aZm));
                }
                catch (fu_0 fu_06) {
                    pfX.error((Object)"PropertyException during getFieldValue for CHARACTER_SHEET_SMALL_ILLUSTRATION_URL", (Throwable)fu_06);
                    break;
                }
            }
            case "breedIconUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedIconPath"), this.aWP());
                }
                catch (fu_0 fu_07) {
                    pfX.error((Object)fu_07.getMessage(), (Throwable)fu_07);
                    break;
                }
            }
            case "breedPopupIconUrl": {
                try {
                    return String.format(auc_0.cVq().bS("popupIconPath"), "breed" + this.aWP());
                }
                catch (fu_0 fu_08) {
                    pfX.error((Object)fu_08.getMessage(), (Throwable)fu_08);
                    break;
                }
            }
            case "characterSelectionIllustrationsUrl": {
                try {
                    return String.format(auc_0.cVq().bS("breedCharacterSelectionIllustrationPath"), this.aWP(), this.aZm);
                }
                catch (fu_0 fu_09) {
                    pfX.error((Object)"Error displaying character selection illustration", (Throwable)fu_09);
                    break;
                }
            }
            case "currentTitle": {
                return this.dpB();
            }
            case "currentTitleRarityColor": {
                return this.dpC();
            }
            case "hasGuild": {
                return this.dpO();
            }
            case "guildName": {
                return this.dpO() ? this.HR() : aum_0.cWf().c("company.shortDesc.noGuild", new Object[0]);
            }
            case "guildBlazon": {
                if (this.ijd <= 0L) {
                    return null;
                }
                return buO.kG(this.ijd);
            }
            case "instanceName": {
                if (this.aqZ() < 0L) {
                    return aum_0.cWf().c("desc.havenWorld", new Object[0]);
                }
                if (!aum_0.cWf().e(77, this.aqZ())) {
                    return null;
                }
                return aum_0.cWf().a(77, this.aqZ(), new Object[0]);
            }
            case "hasNation": {
                return this.dpu();
            }
            case "characterNationStamp": {
                if (!this.dpu()) {
                    return null;
                }
                int n = this.ffF().Xt();
                return auc_0.cVq().a("passportStampIconsPath", "defaultIconPath", n);
            }
            case "characterListNation": {
                return aum_0.cWf().a(39, (long)bgr_0.dmo().az(this), new Object[0]);
            }
            case "characterListNationIconUrl": {
                int n = bgr_0.dmo().az(this);
                return auc_0.cVq().a("nationFlagIconsPath", "defaultIconPath", n != 0 ? n : -1);
            }
            case "characterListNationStamp": {
                int n = bgr_0.dmo().az(this);
                return n == 0 ? null : auc_0.cVq().a("passportStampIconsPath", "defaultIconPath", n);
            }
            case "characterListNewPlayer": {
                return aum_0.cWf().c("character.sheet.newPlayer", new Object[0]);
            }
            case "characterListNewPlayerIconUrl": {
                return auc_0.cVq().a("mentorIconPath", "defaultIconPath", "newPlayer_41");
            }
            case "citizen": {
                return this.ffF();
            }
            case "breedAptitudesTitle": {
                return aum_0.cWf().c("breed.aptitudes", this.dkD().getName());
            }
            case "pupilDescription": {
                String string2 = String.format("breed.pupilDescription.%d%d", this.dfW().aWP(), this.aWO());
                return aum_0.cWf().cO(string2) ? aum_0.cWf().c(string2, new Object[0]) : aum_0.cWf().c("characterCreation.pupil", new Object[0]);
            }
            case "costume1Description": {
                return bft_2.dgp().dgs();
            }
            case "costume2Description": {
                return bft_2.dgp().dgt();
            }
            case "costume3Description": {
                return bft_2.dgp().dgu();
            }
            case "costume4Description": {
                return bft_2.dgp().dgv();
            }
            case "costume5Description": {
                return bft_2.dgp().dgw();
            }
            case "costume6Description": {
                return bft_2.dgp().dgx();
            }
            case "smileyIconUrl": {
                short s = this.aWP();
                byte by = this.aWO();
                return auc_0.cVq().kt((s < 10 ? "0" : "") + s + by);
            }
            case "nameAndLevel": {
                return this.s(this.getName(), this.dnE());
            }
            case "breedCharacValue": {
                return bfk_2.f(this).orElse(null);
            }
            case "breedCharacDescription": {
                return bfk_2.g(this).orElse(null);
            }
            case "breedCharacImage": {
                return bfk_2.i(this);
            }
            case "breedCharacSmallImage": {
                return bfk_2.j(this);
            }
            case "breedCharacIconUrl": {
                return bfk_2.k(this).orElse(null);
            }
            case "breedChartValues": {
                if (this.ltt != null) {
                    ArrayList<ftf_1> arrayList = new ArrayList<ftf_1>();
                    arrayList.add(bhJ.e((eym)this.ltt));
                    bgx_0 bgx_02 = (bgx_0)fse_1.gFu().vY("characterCreation.breedOver");
                    if (bgx_02 != null && bgx_02.dfW() != null && bgx_02.dfW() != this.ltt) {
                        eym eym2 = bgx_02.dfW();
                        arrayList.add(bhJ.e(eym2));
                    }
                    return arrayList;
                }
                return Collections.emptyList();
            }
        }
        return super.eu(string);
    }

    public boolean dpu() {
        return !fjo_0.a(this.ffF().ems(), fjo_0.sys);
    }

    @Override
    public fpu_0 dkC() {
        return this.ffF().dkC();
    }

    public eyt_0 dpv() {
        return this.iiG;
    }

    @Override
    public void dkA() {
        TByteIntHashMap tByteIntHashMap = this.dkE();
        if (tByteIntHashMap == null) {
            return;
        }
        TByteIntIterator tByteIntIterator = tByteIntHashMap.iterator();
        while (tByteIntIterator.hasNext()) {
            tByteIntIterator.advance();
            byte by = tByteIntIterator.key();
            int n = tByteIntIterator.value();
            int n2 = this.icA.get(tByteIntIterator.key());
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n2 > 0 ? n2 : n);
            if (bgv_22 == null) {
                pfX.error((Object)("Le ReferenceItem d'id " + n + " n'existe pas (skin r\u00e9f\u00e9renc\u00e9 : " + n2 + ")."));
                continue;
            }
            if (this.doZ() != 0 && !this.doJ() && bgv_22.v(ffS.sgB)) continue;
            this.ddI().a(bgv_22, (short)by);
        }
    }

    public TByteIntHashMap dpw() {
        return this.iiN;
    }

    @Override
    protected String dkU() {
        return "Smiley_" + this.aWP() + this.aWO();
    }

    @Override
    protected String dkV() {
        return "playerGfxPath";
    }

    public short dpx() {
        return this.iiM;
    }

    public bcd_2 dpy() {
        return bbw_2.hCq.je(this.Sn());
    }

    @Override
    public void aPg() {
        this.doc().a((qu_0)this, this.fgg());
        this.dlk();
        bcd_2 bcd_22 = bbw_2.hCq.je(this.Sn());
        if (bcd_22 != null) {
            bcd_22.daE().b(bcd_22);
        }
    }

    public void jJ(long l) {
        if (!this.djT()) {
            this.iiV.jp(l);
        }
    }

    @Override
    public void dld() {
        rp_2 rp_22 = this.iiG.fkT();
        this.dlc().clear();
        if (rp_22 != null) {
            if (rp_22.Xy != null) {
                this.doc().a(rp_22.Xy.SY, this.fgg());
            }
            if (rp_22.Xz != null) {
                this.doc();
                ers_0.a(rp_22.Xz.XD, this.pgf, this);
            }
        }
        this.hKX.a(bsw_2.lgW);
    }

    @Override
    public void dmg() {
        if (this.djT()) {
            this.pgd.aYH();
            this.ffO();
        }
    }

    public Optional<bnf_0> dpz() {
        return bnf_0.co(this.dpA());
    }

    public String b(bsb_1 bsb_12) {
        return bsb_1.a(bsb_12, this.getName(), this.iiY.dxH(), this.iiY.dxI());
    }

    @Override
    public short dpA() {
        return this.ije.elB();
    }

    @Nullable
    public String dpB() {
        Optional<bnf_0> optional = this.dpz();
        return optional.map(bnf_02 -> bnf_02.cC(this.aWO())).orElse(null);
    }

    @Nullable
    private axb_2 dpC() {
        Optional<bnf_0> optional = this.dpz();
        return optional.map(bnf_02 -> beo_0.d(bnf_02.egk().gkb())).orElse(null);
    }

    @Override
    public void bz(short s) {
        if (this.ije.elB() == s) {
            return;
        }
        this.ije.dP(s);
        fse_1.gFu().a((aef_2)this, iie, iif);
    }

    @Override
    public short dpD() {
        return this.dpA();
    }

    @Override
    public void dkf() {
        super.dkf();
        bth_0 bth_02 = this.hKX.dcX();
        if (bth_02 != null && bth_02 != btl_0.dHL()) {
            bth_02.u(this.hKX);
        }
        this.hKX.a(btl_0.dHL());
        btl_0.dHL().x(this.hKX);
        if (!this.dkZ().dGo().fKW()) {
            this.gf(false);
        }
        if (!this.dkZ().kv(this.Sn()) && this.c(exx_2.rGi) < 1 && this.baI()) {
            this.e(exx_2.rGi).op(1);
        }
        if (this.dmc()) {
            bgg_0.dlO().jt(this.Sn());
            this.ddI().ddm().e(this.ddI());
            this.gf(false);
        }
        if (this.bwb() && cdO.eug().au(this)) {
            this.dni();
        }
    }

    @Override
    public boolean bwb() {
        return this.ijh;
    }

    @Override
    protected void dpE() {
        super.dpE();
        this.djo();
    }

    @Override
    public int bvS() {
        int n = super.bvS();
        float f2 = 1.0f;
        return (int)((float)n / 1.0f);
    }

    @Override
    public int bvQ() {
        int n = super.bvQ();
        float f2 = 1.0f;
        return (int)((float)n / 1.0f);
    }

    @Override
    public float dmm() {
        return this.iiS == null ? 0.0f : this.iiS.gkE();
    }

    public void CR(int n) {
        if (this.iiS == null) {
            this.iiS = new frw_0();
            this.iiS.setValue(n);
            return;
        }
        int n2 = this.iiS.gkD();
        this.iiS.setValue(n);
        if (aue_0.cVJ().cVK().djT() && this.bqo() != aue_0.cVJ().cVK().bqo()) {
            return;
        }
        boolean bl = n == 10000 ? true : (n == -10000 ? false : this.iiS.gkD() >= n2);
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(bl ? 800067 : 800068);
        if (freeParticleSystem == null) {
            return;
        }
        freeParticleSystem.a(this.ddI());
        agZ.bzy().b(freeParticleSystem);
    }

    void a(yu_1 yu_12) {
        this.iiT = yu_12;
    }

    @Override
    public void dkS() {
        super.dkS();
        this.dpF();
        this.dpG();
    }

    @Override
    public void dlk() {
        if (this.bvY()) {
            super.dlk();
        } else {
            this.iiW.doY();
        }
        this.c("reloadItemEffects", () -> {
            this.dkr();
            this.dpF();
        });
    }

    @Override
    public void dpF() {
        bjh_1.Z(this);
    }

    public void dpG() {
        List<erh_0> list = this.doc().fHG().stream().filter(erh_02 -> erh_02.fGk().gjB()).toList();
        bdt_2 bdt_22 = this.ddI().ddm();
        list.forEach(erh_02 -> bdt_22.a((ero_0)erh_02, false));
        list.forEach(erh_02 -> bdt_22.b((ero_0)erh_02, false));
    }

    @Override
    public void f(QD qD) {
        boolean bl;
        super.f(qD);
        boolean bl2 = qD.bbf() != null && qD.bbf().bab() == 28;
        boolean bl3 = bl = qD.bbf() != null && qD.bbf().bab() == 32;
        if (!bl2 && !bl) {
            return;
        }
        this.doc().q(qD);
    }

    @Override
    @Nullable
    public fqP<bmx_0> dkB() {
        if (this.iiX == null) {
            return null;
        }
        return this.iiX.dkB();
    }

    @Override
    @Nullable
    public Iterable<? extends fqE> doM() {
        if (this.iiX == null) {
            return null;
        }
        return this.iiX.eeJ();
    }

    @Override
    public boolean CX(int n) {
        if (this.iiX == null) {
            return false;
        }
        fqP<bmx_0> fqP2 = this.iiX.eeJ();
        return fqP2 != null && fqP2.pb(n);
    }

    @Override
    public void f(zk_2 zk_22) {
        if (this.iiX == null) {
            this.iiX = new bmw_0(this);
        }
        this.iiX.dkB().g(zk_22);
    }

    @Override
    @Nullable
    public bmx_0 jr(long l) {
        if (this.iiX == null) {
            return null;
        }
        return this.iiX.jr(l);
    }

    @Override
    @Nullable
    public Iterable<bmx_0> dkJ() {
        if (this.iiX == null) {
            return null;
        }
        return this.iiX.dkJ();
    }

    public bmw_0 dpH() {
        return this.iiX;
    }

    @Override
    public long b(Vf vf) {
        switch (vf) {
            case bxK: {
                eyp_1 eyp_12 = aue_0.cVJ().cVK().dnQ().dKL();
                if (eyp_12 == null) {
                    return 0L;
                }
                return eyp_12.rw(this.Sn()) != null ? eyp_12.Sn() : 0L;
            }
        }
        return 0L;
    }

    @Override
    @Deprecated
    public boolean bko() {
        return false;
    }

    @NotNull
    public bjn_1 dpI() {
        return this.ija;
    }

    @Override
    @NotNull
    public Optional<eki_0> dpJ() {
        return baj_2.hzf.iJ(this.Xi());
    }

    @NotNull
    public eki_0 dpK() {
        return baj_2.hzf.iL(this.Xi());
    }

    public void a(eMS eMS2) {
        this.ijg = eMS2;
    }

    @Override
    public evd_2 dpL() {
        return this.iiY;
    }

    public boolean a(evv_1 evv_12) {
        return this.dpL() != null && this.dpL().b(evv_12);
    }

    public boolean dpM() {
        return (long)this.ffF().ems().gbp() == this.aqZ();
    }

    public void gh(boolean bl) {
        this.ijh = bl;
    }

    public void gi(boolean bl) {
        if (this.ijh == bl) {
            return;
        }
        this.gj(bl);
    }

    public void gj(boolean bl) {
        if (bl && cdO.eug().au(this)) {
            this.dni();
        } else {
            this.dnh();
        }
    }

    @Override
    public void dnh() {
        this.ijh = false;
        this.hKX.ddv().ifPresent(bke_22 -> bke_22.r(this.hKX));
        this.hKX.a((bke_2)null);
        this.iji = false;
    }

    @Override
    public void dni() {
        if (this.ijc == null) {
            return;
        }
        String string = this.hKX.bkI();
        if (string.startsWith("AnimStatique") || string.startsWith("AnimPosing") && !string.startsWith("AnimPosingAssis")) {
            this.ijh = true;
            this.dpN();
        } else {
            if (this.iji) {
                return;
            }
            this.iji = true;
            this.hKX.a(new bhk_0(this));
        }
    }

    void dpN() {
        if (this.ijc == null) {
            return;
        }
        boolean bl = this.hKX.ddv().isPresent();
        this.hKX.ddv().ifPresent(bke_22 -> bke_22.r(this.hKX));
        bke_2 bke_23 = this.ddI().a(this.ijc);
        this.hKX.a(bke_23);
        bke_23.dsM();
        if (!bl) {
            cdO.eug().D(this.hKX);
        }
        if (this.hKX.dcP().bvY()) {
            fse_1.gFu().a((aef_2)this, "isRiding");
        }
    }

    @Contract(pure=true)
    public boolean dpO() {
        return this.ija.Ya() > 0L || this.ijd > 0L;
    }

    public long HP() {
        return this.ijd;
    }

    public void jK(long l) {
        this.ijd = l;
    }

    public String HR() {
        return this.ija.getName();
    }

    @Override
    public long Ya() {
        return this.ija.Ya();
    }

    @Override
    public void a(int n, @Nullable HashMap<String, Object> hashMap, boolean bl) {
        if (this.ddI().bvW()) {
            return;
        }
        super.a(n, hashMap, bl);
        HashMap<String, Object> hashMap2 = new HashMap<String, Object>();
        hashMap2.put("playerId", this.Sn());
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        assert (afs_1.can().bYf() != null);
        String string = String.format("emotes/%d%s", n, afs_1.can().bLX());
        afs_1.can().a(string, iiQ, hashMap2, (afd_1)new bhL(this), false);
    }

    public ftO jF(long l) {
        this.ejt = mz_1.aVX.cR(l);
        return ftO.tgA.get();
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public short dnE() {
        return this.ijf;
    }

    public void h(long l, short s) {
    }

    public void dpP() {
        fse_1.gFu().a((aef_2)this, "level", "levelValue");
        this.dmK();
    }

    protected void dmK() {
    }

    @Override
    public byte dlf() {
        return 0;
    }

    @Override
    public String toString() {
        return this.dkD() != null ? super.toString() + " " + this.dkD().getName() : super.toString();
    }

    @Override
    public eyg_0 djD() {
        return bfw_2.dgB();
    }

    @Override
    public void a(rl_0 rl_02) {
        super.a(rl_02);
        if (this.iiR != null) {
            this.iiR.a(rl_02);
        }
    }

    @Override
    public void a(pv_0 pv_02, px_0 px_02) {
        if (pv_02 == null) {
            return;
        }
        super.a(pv_02, px_02);
        if (pv_02.aZd() == 1) {
            switch ((exe_1)pv_02) {
                case rDs: 
                case rDg: {
                    this.djo();
                    break;
                }
                case rDP: {
                    this.dkL();
                    break;
                }
                case rFd: {
                    bix_0.q(this);
                }
            }
        }
        if (pv_02.aZd() == 0) {
            switch ((ezj_0)pv_02) {
                case pss: {
                    this.djo();
                }
            }
        }
    }

    @Override
    public bgy a(long l, acd_1 acd_12, short s, ezw ezw2, tw_0 tw_02, boolean bl, ezg_0<exe_1> ezg_02) {
        bgy bgy2 = super.a(l, acd_12, s, ezw2, tw_02, bl, ezg_02);
        this.g(bgy2, true);
        return bgy2;
    }

    public void d(ZC zC, boolean bl) {
        this.a(zC, bl);
        this.b(zC, bl);
        this.c(zC, bl);
        for (arx_1 arx_12 : arx_1.cTH) {
            this.a(arx_12, zC, bl);
        }
    }

    public void g(bgy bgy2, boolean bl) {
        this.d(bgy2.ddI(), bl);
        fse_1.gFu().a((aef_2)bgy2, iiD);
    }

    @Override
    public aKr dlt() {
        if (this.ltt != null && this.ltt == eym.pia) {
            return ako_0.cjc();
        }
        return super.dlt();
    }

    @Override
    public int dlC() {
        float f2 = this.dmm();
        if (Math.abs(f2) < 0.3f) {
            return super.dlC();
        }
        if (f2 < 0.0f) {
            return 900018;
        }
        return 900017;
    }

    @Override
    public int dlD() {
        float f2 = this.dmm();
        if (Math.abs(f2) < 0.3f) {
            return super.dlD();
        }
        if (f2 < 0.0f) {
            return 900021;
        }
        return 900020;
    }

    public biu_0 dpQ() {
        return this.iiR;
    }

    public void a(biu_0 biu_02) {
        this.iiR = biu_02;
    }

    @Override
    public int dpR() {
        return this.ije.fxT();
    }

    public void CY(int n) {
        this.ije.Qo(n);
    }

    @Override
    public @Unmodifiable Collection<Integer> dpS() {
        return this.ije.fxS();
    }

    public void z(int[] nArray) {
        if (nArray == null) {
            return;
        }
        List<Integer> list = Arrays.stream(nArray).boxed().toList();
        this.ije.I(list);
    }

    @Override
    public int dpT() {
        return this.ije.fxU();
    }

    public void CZ(int n) {
        this.ije.Qp(n);
    }

    @Override
    public boolean a(eyp_0 eyp_02) {
        return eyp_0.pmO.a(eyp_02);
    }

    public static String a(exP exP2, Iterable<?> iterable) {
        ArrayList<enk_0> arrayList = new ArrayList<enk_0>();
        exP2.doc();
        TShortIntHashMap tShortIntHashMap = new TShortIntHashMap();
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (Object object : iterable) {
            Iterator<Object> iterator;
            short s = 0;
            if (object instanceof ffV) {
                ffV ffV2 = (ffV)object;
                if (!ffq_0.fVK().a(ffV2, (qu_0)exP2, exP2.bdV())) continue;
                int n = ffV2.dOg().d();
                if (!tIntHashSet.contains(n)) {
                    s = ffV2.dOg().dpq();
                    tIntHashSet.add(n);
                }
                if (!ffV2.apo()) continue;
                iterator = ffV2.iterator();
            } else {
                if (!(object instanceof bgv_2)) continue;
                bgv_2 bgv_22 = (bgv_2)object;
                if (!tIntHashSet.contains(bgv_22.d())) {
                    s = bgv_22.dpq();
                    tIntHashSet.add(bgv_22.d());
                }
                iterator = bgv_22.fYj();
            }
            if (s != 0) {
                tShortIntHashMap.put(s, tShortIntHashMap.contains(s) ? tShortIntHashMap.get(s) + 1 : 1);
            }
            while (iterator.hasNext()) {
                arrayList.add((enk_0)iterator.next());
            }
        }
        TShortIntIterator tShortIntIterator = tShortIntHashMap.iterator();
        while (tShortIntIterator.hasNext()) {
            Object object;
            tShortIntIterator.advance();
            object = bEr.dSi().bW(tShortIntIterator.key());
            ArrayList<fgm_0> arrayList2 = ((ffa_0)object).UR(tShortIntIterator.value());
            for (fgm_0 fgm_02 : arrayList2) {
                for (enk_0 enk_02 : fgm_02) {
                    arrayList.add(enk_02);
                }
            }
        }
        boolean bl = false;
        biR biR2 = new biR(aum_0.cWf(), arrayList, 0);
        return biR2.o(exP2);
    }

    public bhJ dpU() {
        bgt_0 bgt_02 = new bgt_0(false);
        bgt_02.c(this.ltt);
        bgt_02.aQ(this.aZm);
        bgt_02.setName(this.getName());
        bgt_02.CV(this.ciZ);
        bgt_02.w(this.iiI.sE(), true);
        bgt_02.v(this.iiI.sC(), true);
        bgt_02.x(this.iiI.sG(), true);
        bgt_02.a(this.iiI.fwG(), true);
        bgt_02.d(this.iiI.dlA(), false);
        bgt_02.c(this.iiI.dlz(), false);
        bgt_02.icx = this.icx;
        bgt_02.jK(this.ijd);
        return bgt_02;
    }

    @Override
    public cpm_1[] chR() {
        ArrayList<cpm_1> arrayList = new ArrayList<cpm_1>(Arrays.asList(super.chR()));
        for (cps_1 cps_12 : this.iiH) {
            arrayList.add((cpm_1)cps_12.eLI());
        }
        return arrayList.toArray(cpm_1.nip);
    }

    @Override
    protected void dks() {
        if (this.bwb() && cdO.eug().au(this)) {
            this.ddI().ddv().ifPresent(bke_2::dsM);
        }
    }

    @Override
    public eMS dpV() {
        return this.ijg;
    }

    @Override
    public bmq_0 djG() {
        bmq_0 bmq_02 = super.djG();
        if (bmq_02 == null) {
            pfX.warn((Object)String.format("No natural state found for breed %s !", this.ltt.aWP()));
        }
        return bmq_02;
    }

    @Nullable
    public bMn Da(int n) {
        List<QD> list = this.doc().oG(1);
        for (QD qD : list) {
            bmq_0 bmq_02;
            Object EC = qD.bbf();
            if (!(EC instanceof bmq_0) || (bmq_02 = (bmq_0)EC).eem() != n) continue;
            return this.icb.c(qD, -1L);
        }
        return null;
    }

    private static ftf_1 e(eym eym2) {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        for (short s : eym2.drx()) {
            arrayList.add(Float.valueOf((float)s / 4.0f));
        }
        return new ftf_1(arrayList, bfo_2.a(eym2), bfo_2.b(eym2));
    }

    public boolean dpW() {
        int[] nArray = aue_0.cVJ().cVO().cWq();
        if (evm_2.b(nArray, evn_2.ouW)) {
            return true;
        }
        return this.fhC();
    }

    @Override
    public /* synthetic */ bmd_1 dkI() {
        return this.dpH();
    }

    @Override
    public /* synthetic */ eyp doV() {
        return this.dfW();
    }

    @Override
    public /* synthetic */ eid_0 dpX() {
        return this.dps();
    }

    @Override
    public /* synthetic */ exP b(long l, acd_1 acd_12, short s, ezw ezw2, tw_0 tw_02, boolean bl, ezg_0 ezg_02) {
        return this.a(l, acd_12, s, ezw2, tw_02, bl, ezg_02);
    }

    @Override
    public /* synthetic */ eyl_0 dmj() {
        return this.dpv();
    }

    @Override
    public /* synthetic */ eur_1 dpY() {
        return this.dpL();
    }

    @Override
    @NotNull
    public /* synthetic */ eya_2 dpZ() {
        return this.dpI();
    }

    @Override
    public /* synthetic */ PN aYx() {
        return this.dpy();
    }

    static /* synthetic */ Collection m(bhJ bhJ2) {
        return bhJ2.pga;
    }

    static /* synthetic */ Logger aGi() {
        return pfX;
    }

    static /* synthetic */ Logger aGj() {
        return pfX;
    }

    static /* synthetic */ Logger aGR() {
        return pfX;
    }

    static /* synthetic */ Logger aGS() {
        return pfX;
    }

    static /* synthetic */ Logger dof() {
        return pfX;
    }

    static /* synthetic */ ern_0 n(bhJ bhJ2) {
        return bhJ2.pgf;
    }

    static /* synthetic */ Logger dog() {
        return pfX;
    }

    static /* synthetic */ Logger doh() {
        return pfX;
    }

    static /* synthetic */ Logger doi() {
        return pfX;
    }

    static /* synthetic */ Logger dqb() {
        return pfX;
    }

    static /* synthetic */ Logger doj() {
        return pfX;
    }

    static /* synthetic */ Logger dqc() {
        return pfX;
    }

    static /* synthetic */ Logger dqd() {
        return pfX;
    }

    static /* synthetic */ Logger dqe() {
        return pfX;
    }

    static /* synthetic */ Logger dok() {
        return pfX;
    }

    static /* synthetic */ Logger dol() {
        return pfX;
    }

    static /* synthetic */ long o(bhJ bhJ2) {
        return bhJ2.aXv;
    }

    static {
        System.arraycopy(iiE, 0, iiF, 0, iiE.length);
        System.arraycopy(bgy.ibP, 0, iiF, iiE.length, bgy.ibP.length);
        iiQ = new afr_1[]{ais_1.bBp(), aiq_2.bBo(), aiv_2.bBr()};
    }
}


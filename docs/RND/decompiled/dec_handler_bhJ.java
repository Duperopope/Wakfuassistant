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
implements PO<bcd>,
Qf,
Vg,
eKF,
eve,
fad,
frt {
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
    protected final eyT iiG = new eyT();
    private final ArrayList<cPS> iiH = new ArrayList<cPS>(Arrays.asList(cPS.njz, cPS.niF, cPS.njB, cPS.niz, cPS.niD, cPS.niA, cPS.niB, cPS.njC, cPS.niP, cPS.njR, cPS.niT, cPS.njx, cPS.niZ, cPS.nje, cPS.njn));
    protected eIF iiI;
    protected int ciZ;
    protected boolean iiJ;
    protected boolean iiK;
    boolean iiL;
    short iiM;
    protected TByteIntHashMap iiN;
    protected byte iiO;
    protected bkb iiP;
    private static final aFr[] iiQ;
    private biu iiR;
    protected frW iiS;
    public boolean bXs;
    protected yu iiT;
    private final eJg iiU = new eJi();
    private final bgM iiV;
    private final bhI iiW = new bhI(this);
    protected bMw iiX;
    final evd iiY;
    short iiZ;
    @NotNull
    final bjn ija;
    private bJo ijb;
    protected bJo ijc;
    long ijd;
    private final eKo ije = new eKo();
    private short ijf;
    private eMS ijg = new eMS();
    boolean ijh;
    boolean iji = false;
    private short ejt;

    public bhJ() {
        this.icm = new bgw(this);
        this.pgd = new eXh();
        this.icn = new biM(this);
        this.iiV = new bgM(4000.0, (eXf)this.pgd.b(eXx.rGi));
        this.pgf.a(baT.cZD());
        this.iiY = this.dmB();
        this.ija = this.dmC();
        this.iiI = new eIF();
        this.icx = new bjm(this.ija);
        this.dmI();
        int n = ewo.oBF.i(ewr.oCo);
        if (n > 0) {
            this.CK(n);
        }
        this.a(ewr.oCq);
    }

    protected evd dmB() {
        return new aUR();
    }

    protected bjn dmC() {
        return new bjq();
    }

    @Override
    public void dmI() {
        super.dmI();
        new bhO(this, this.iiG.fkH());
        new bhT(this, this.iiG.fkY());
        new bhY(this, this.iiG.fkD());
        new bil(this, this.iiG.fkE());
        new bim(this, this.iiG.fkF());
        new bhR(this, this.iiG.flf());
        new bii(this, this.iiG.fkT());
        new bhS(this, this.iiG.fiz());
        new bie(this, this.iiG.fli());
        new bhX(this, this.iiG.flp());
        new bhV(this, this.iiG.fll());
        new bhW(this, this.iiG.flm());
        new bhU(this, this.iiG.fln());
        new bhZ(this, this.iiG.flo());
        new bib(this, this.iiG.fls());
        new bhP(this, this.iiG.flt());
        new bid(this, this.iiG.flv());
        new bic(this, this.iiG.flw());
        new bia(this, this.iiG.fkJ());
        new bij(this, this.iiG.fly());
        new bif(this, this.iiG.fkK());
        new bih(this, this.iiG.fkQ());
        new big(this, this.iiG.flz());
        new bik(this, this.iiG.flH());
        new bhQ(this, this.iiG.fkL());
        new bhN(this, this.iiG.flA());
        new bkT(this.iiG.flF(), this);
        new bkR(this, this.iiG.fiF());
        new bkS(this, this.iiG.fkW());
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
        bcd bcd2 = bbW.hCq.je(l);
        if (bcd2 != null) {
            ((bhp)bcd2.daE()).bmX();
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
        fov fov2 = foy.sLJ.XP(n);
        fnL fnL2 = fnO.sKx.g(fov2);
        this.ijb = new bJo(this, fnL2);
        this.ddI().a((WT)this.ijb);
        if (this.bvY() && (ffV2 = this.dmL().a(bGr.jVu.tu(this.aXv), ffS.sgX)) != null && ffV2.ead() != null && ffV2.ead().geL().d() == fnL2.geL().d()) {
            ffV2.ead().a(this.ijb.eal());
        }
        this.a(n2, n3, n4, n5, this.ijb);
    }

    public void c(int n, int n2, int n3, int n4, int n5) {
        ffV ffV2;
        fnS fnS2;
        fnS fnS3 = fnS2 = this.ijc != null ? this.ijc.eal() : null;
        if (this.ijc != null) {
            this.dpd();
        }
        fov fov2 = foy.sLJ.XP(n);
        fnL fnL2 = fnO.sKx.g(fov2);
        this.ijc = new bJj(this, fnL2);
        this.ddI().a((WT)this.ijc);
        if (this.bvY() && (ffV2 = this.dmL().a(bGr.jVu.tu(this.aXv), ffS.sgZ)) != null && ffV2.ead() != null && ffV2.ead().geL().d() == fnL2.geL().d()) {
            ffV2.ead().b(fnS2);
            ffV2.ead().a(this.ijc.eal());
        }
        this.a(n2, n3, n4, n5, this.ijc);
        this.dpb();
    }

    private void dpb() {
        if (this.bwb()) {
            this.ddI().ddv().ifPresent(bkE2 -> this.dni());
        } else {
            this.dnh();
        }
    }

    private void a(int n, int n2, int n3, int n4, bJo bJo2) {
        fnM fnM2 = new fnM(bJo2);
        fnL fnL2 = bJo2.ead();
        try {
            fnM2.Xt(n4);
            if (n2 > 0) {
                fnM2.Xs(n2);
            } else if (n2 <= 0 && fnL2.agK() > 0) {
                fnM2.geS();
            }
            fnM2.Xu(n);
            if (n3 > 0 && fnL2.agT() <= 0) {
                fnM2.Xw(n3);
                fnM2.af(UE.bjV().bjc());
            } else if (n3 <= 0 && fnL2.agT() > 0) {
                fnM2.geU();
                fnM2.geV();
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

    private void b(bJo bJo2) {
        if (bJo2 == null) {
            return;
        }
        if (this.dkO()) {
            this.ddI().b(bJo2);
        }
        bJo2.eag();
    }

    public bJo dpe() {
        return this.ijb;
    }

    public bJo dpf() {
        return this.ijc;
    }

    @Override
    protected void dny() {
        if (this.fhp() != eyH.pka) {
            return;
        }
        this.a(new bin());
    }

    @Override
    public void a(eTY eTY2) {
        this.dny();
        super.a(eTY2);
        this.hKX.ddv().ifPresent(bkE2 -> bkE2.r(this.hKX));
        if (this.dmc()) {
            this.ddI().setVisible(true);
        }
        this.djv();
        this.djo();
        this.a(this.dfW());
    }

    @NotNull
    public bgM dpg() {
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
        for (eyK eyK2 : this.pga) {
            eyK2.j(this);
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
            fSe.gFu().a((aEF)this, ihl);
            fSe.gFu().a((aEF)this, ihu);
        }
    }

    private void dpi() {
        this.b(this.ddI(), true);
    }

    public void w(int n, boolean bl) {
        this.iiI.BR(n);
        if (bl) {
            this.dpj();
            fSe.gFu().a((aEF)this, ihm);
            fSe.gFu().a((aEF)this, ihv);
        }
    }

    private void dpj() {
        this.a(this.ddI(), true);
    }

    public void x(int n, boolean bl) {
        this.iiI.BS(n);
        if (bl) {
            this.dpk();
            fSe.gFu().a((aEF)this, ihn);
            fSe.gFu().a((aEF)this, ihw);
        }
    }

    private void dpk() {
        bjc.a(new bjc(this.iiI.sG()), (ZC)this.ddI(), arx.cTz, true);
    }

    private void a(arx arx2, int n) {
        switch (arx2) {
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

    public void a(arx arx2, int n, boolean bl) {
        if (!arx.a(arx2)) {
            return;
        }
        this.a(arx2, n);
        if (bl) {
            this.c(arx2);
            fSe.gFu().a((aEF)this, iiC);
        }
    }

    public void a(dR dR2, boolean bl) {
        this.a(arx.cTB, dR2.sI());
        this.a(arx.cTC, dR2.sK());
        this.a(arx.cTD, dR2.sM());
        this.a(arx.cTE, dR2.sO());
        this.a(arx.cTF, dR2.sQ());
        this.a(arx.cTG, dR2.sS());
        if (bl) {
            this.dpl();
            fSe.gFu().a((aEF)this, iiC);
        }
    }

    private int b(arx arx2) {
        switch (arx2) {
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
        throw new IllegalArgumentException("Not a costume: " + String.valueOf((Object)arx2));
    }

    private void c(arx arx2) {
        if (!arx.a(arx2)) {
            return;
        }
        bjc.a(new bjc(this.b(arx2)), (ZC)this.ddI(), arx2, true);
    }

    private void dpl() {
        for (arx arx2 : arx.cTH) {
            this.c(arx2);
        }
    }

    private void a(ZC zC, boolean bl) {
        bjc bjc2 = new bjc(this.iiI.sE());
        bjc.a(bjc2, zC, arx.cTt, bl);
    }

    private void b(ZC zC, boolean bl) {
        bjc bjc2 = new bjc(this.iiI.sC());
        bjc.a(bjc2, zC, arx.cTs, bl);
    }

    private void c(ZC zC, boolean bl) {
        bjc bjc2 = new bjc(this.iiI.sG());
        bjc.a(bjc2, zC, arx.cTz, bl);
    }

    private void a(arx arx2, ZC zC, boolean bl) {
        if (!arx.a(arx2)) {
            return;
        }
        bjc bjc2 = new bjc(this.b(arx2));
        bjc.a(bjc2, zC, arx2, bl);
    }

    @Override
    protected final void dkw() {
        this.dpj();
        this.dpk();
        this.dpi();
        this.dpl();
    }

    public void dpm() {
        this.w(bft.dgp().d(this.aWP(), this.aWO(), this.dlz()), true);
        this.v(bft.dgp().c((int)this.aWP(), this.aWO(), (short)this.dlz()), true);
        this.x(bft.dgp().e(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx.cTB, bft.dgp().f(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx.cTC, bft.dgp().g(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx.cTD, bft.dgp().h(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx.cTE, bft.dgp().i(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx.cTF, bft.dgp().j(this.aWP(), this.aWO(), this.dlz()), true);
        this.a(arx.cTG, bft.dgp().k(this.aWP(), this.aWO(), this.dlz()), true);
    }

    public void a(short s, byte by, byte by2) {
        if (s == -1) {
            this.dpm();
        }
        short s2 = this.aWP();
        byte by3 = this.aWO();
        byte by4 = this.dlz();
        if (this.iiI.sE() == bft.dgp().d(s, by, by2)) {
            this.w(bft.dgp().d(s2, by3, by4), true);
        }
        if (this.iiI.sC() == bft.dgp().c((int)s, by, (short)by2)) {
            this.v(bft.dgp().c((int)s2, by3, (short)by4), true);
        }
        if (this.iiI.sG() == bft.dgp().e(s, by, by2)) {
            this.x(bft.dgp().e(s2, by3, by4), true);
        }
        if (this.iiI.sI() == bft.dgp().f(s, by, by2)) {
            this.a(arx.cTB, bft.dgp().f(s2, by3, by4), true);
        }
        if (this.iiI.sK() == bft.dgp().g(s, by, by2)) {
            this.a(arx.cTC, bft.dgp().g(s2, by3, by4), true);
        }
        if (this.iiI.sM() == bft.dgp().h(s, by, by2)) {
            this.a(arx.cTD, bft.dgp().h(s2, by3, by4), true);
        }
        if (this.iiI.sO() == bft.dgp().i(s, by, by2)) {
            this.a(arx.cTE, bft.dgp().i(s2, by3, by4), true);
        }
        if (this.iiI.sQ() == bft.dgp().j(s, by, by2)) {
            this.a(arx.cTF, bft.dgp().j(s2, by3, by4), true);
        }
        if (this.iiI.sS() == bft.dgp().k(s, by, by2)) {
            this.a(arx.cTG, bft.dgp().k(s2, by3, by4), true);
        }
    }

    @Override
    public String dlx() {
        if (this.iiI.dlA() < 0) {
            return null;
        }
        return bft.dgp().a(this.ltt.aWP(), this.aWO(), this.iiI.dlz(), this.iiI.dlA());
    }

    @Override
    public String dly() {
        if (this.iiI.dlz() < 0) {
            return null;
        }
        return bft.dgp().o(this.ltt.aWP(), this.aWO(), this.iiI.dlz());
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
        ((eXh)this.fgM()).a(this);
        bNB.kDS.a(this.dlc());
    }

    @Override
    public void dkm() {
        ((eXh)this.fgM()).b(this);
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
        fSe.gFu().a((aEF)this, iiu, "downscaleLevel");
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
        return bft.dgp().b(s, by, (short)this.dlz());
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
    public eJg dmn() {
        return this.iiU;
    }

    public void dpp() {
        this.p = bjZ.dsb().dsa();
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

    public bkb dps() {
        return this.iiP;
    }

    @Override
    public void a(eID eID2) {
        this.iiP = (bkb)eID2;
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
            fSe.gFu().a((aEF)this, ihZ);
        }
    }

    public static boolean a(short s, bdf bdf2, byte by) {
        bEq bEq2 = bEr.dSi().bW(s);
        if (bEq2 != null) {
            boolean bl = false;
            for (bGV bGV2 : bEq2) {
                if (bGV2 != null) {
                    ffS[] ffSArray;
                    ffV ffV2 = new ffV();
                    ffV2.l(bGV2);
                    if (ffV2.fWi() == null || (ffSArray = ffV2.fWi().fZq()).length <= 0) continue;
                    short s2 = ffSArray[0].shb;
                    bdf2.a(bGV2, s2, by);
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
                return new awX(this.iiI.sC());
            }
            case "hairColor": {
                return new awX(this.iiI.sE());
            }
            case "pupilColor": {
                return new awX(this.iiI.sG());
            }
            case "costume1Color": {
                return new awX(this.iiI.sI());
            }
            case "costume2Color": {
                return new awX(this.iiI.sK());
            }
            case "costume3Color": {
                return new awX(this.iiI.sM());
            }
            case "costume4Color": {
                return new awX(this.iiI.sO());
            }
            case "costume5Color": {
                return new awX(this.iiI.sQ());
            }
            case "costume6Color": {
                return new awX(this.iiI.sS());
            }
            case "skinHexColor": {
                return new awX(this.iiI.sC()).bQk().toUpperCase();
            }
            case "hairHexColor": {
                return new awX(this.iiI.sE()).bQk().toUpperCase();
            }
            case "pupilHexColor": {
                return new awX(this.iiI.sG()).bQk().toUpperCase();
            }
            case "costume1HexColor": {
                return new awX(this.iiI.sI()).bQk().toUpperCase();
            }
            case "costume2HexColor": {
                return new awX(this.iiI.sK()).bQk().toUpperCase();
            }
            case "costume3HexColor": {
                return new awX(this.iiI.sM()).bQk().toUpperCase();
            }
            case "costume4HexColor": {
                return new awX(this.iiI.sO()).bQk().toUpperCase();
            }
            case "costume5HexColor": {
                return new awX(this.iiI.sQ()).bQk().toUpperCase();
            }
            case "costume6HexColor": {
                return new awX(this.iiI.sS()).bQk().toUpperCase();
            }
            case "hairAvailability": {
                return bft.dgp().l(this.dfW().aWP(), this.aWO(), this.dlz());
            }
            case "skinAvailability": {
                return bft.dgp().m(this.dfW().aWP(), this.aWO(), this.dlz());
            }
            case "pupilAvailability": {
                return bft.dgp().n(this.dfW().aWP(), this.aWO(), this.dlz());
            }
            case "hairDescription": {
                return bft.dgp().h(this.dfW().aWP(), this.aWO());
            }
            case "skinDescription": {
                return bft.dgp().g(this.dfW().aWP(), this.aWO());
            }
            case "hasRecustom": {
                return this.iiL;
            }
            case "needsRename": {
                return bgR.dmo().jz(this.Sn());
            }
            case "canRename": {
                return this.dpW();
            }
            case "illustrationUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedIllustrationPath"), this.dfW().aWP(), this.aWO());
                }
                catch (Fu fu) {
                    pfX.error((Object)"PropertyException during getFieldValue for ILLUSTRATION_URL_FIELD", (Throwable)fu);
                    break;
                }
            }
            case "characterChoiceIllustrationUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedCharacterChoiceIllustrationPath"), this.dfW().aWP(), this.aWO());
                }
                catch (Fu fu) {
                    pfX.error((Object)"PropertyException during getFieldValue for CHARACTER_CHOICE_ILLUSTRATION_URL_FIELD", (Throwable)fu);
                    break;
                }
            }
            case "characterSheetIllustrationUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedCharacterSheetIllustrationPath"), this.aWP(), this.aWO());
                }
                catch (Fu fu) {
                    pfX.error((Object)"PropertyException during getFieldValue for breedCharacterSheetIllustrationPath", (Throwable)fu);
                    break;
                }
            }
            case "characterSheetSmallIllustrationUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedCharacterPortrait80Path"), this.ltt.aWP() + String.valueOf(this.aZm));
                }
                catch (Fu fu) {
                    pfX.error((Object)"PropertyException during getFieldValue for CHARACTER_SHEET_SMALL_ILLUSTRATION_URL", (Throwable)fu);
                    break;
                }
            }
            case "characterSheetCircleIllustrationUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedCircleIllustrationPath"), this.ltt.aWP() + String.valueOf(this.aZm));
                }
                catch (Fu fu) {
                    pfX.error((Object)"PropertyException during getFieldValue for CHARACTER_SHEET_SMALL_ILLUSTRATION_URL", (Throwable)fu);
                    break;
                }
            }
            case "breedIconUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedIconPath"), this.aWP());
                }
                catch (Fu fu) {
                    pfX.error((Object)fu.getMessage(), (Throwable)fu);
                    break;
                }
            }
            case "breedPopupIconUrl": {
                try {
                    return String.format(aUC.cVq().bS("popupIconPath"), "breed" + this.aWP());
                }
                catch (Fu fu) {
                    pfX.error((Object)fu.getMessage(), (Throwable)fu);
                    break;
                }
            }
            case "characterSelectionIllustrationsUrl": {
                try {
                    return String.format(aUC.cVq().bS("breedCharacterSelectionIllustrationPath"), this.aWP(), this.aZm);
                }
                catch (Fu fu) {
                    pfX.error((Object)"Error displaying character selection illustration", (Throwable)fu);
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
                return this.dpO() ? this.HR() : aUM.cWf().c("company.shortDesc.noGuild", new Object[0]);
            }
            case "guildBlazon": {
                if (this.ijd <= 0L) {
                    return null;
                }
                return buO.kG(this.ijd);
            }
            case "instanceName": {
                if (this.aqZ() < 0L) {
                    return aUM.cWf().c("desc.havenWorld", new Object[0]);
                }
                if (!aUM.cWf().e(77, this.aqZ())) {
                    return null;
                }
                return aUM.cWf().a(77, this.aqZ(), new Object[0]);
            }
            case "hasNation": {
                return this.dpu();
            }
            case "characterNationStamp": {
                if (!this.dpu()) {
                    return null;
                }
                int n = this.ffF().Xt();
                return aUC.cVq().a("passportStampIconsPath", "defaultIconPath", n);
            }
            case "characterListNation": {
                return aUM.cWf().a(39, (long)bgR.dmo().az(this), new Object[0]);
            }
            case "characterListNationIconUrl": {
                int n = bgR.dmo().az(this);
                return aUC.cVq().a("nationFlagIconsPath", "defaultIconPath", n != 0 ? n : -1);
            }
            case "characterListNationStamp": {
                int n = bgR.dmo().az(this);
                return n == 0 ? null : aUC.cVq().a("passportStampIconsPath", "defaultIconPath", n);
            }
            case "characterListNewPlayer": {
                return aUM.cWf().c("character.sheet.newPlayer", new Object[0]);
            }
            case "characterListNewPlayerIconUrl": {
                return aUC.cVq().a("mentorIconPath", "defaultIconPath", "newPlayer_41");
            }
            case "citizen": {
                return this.ffF();
            }
            case "breedAptitudesTitle": {
                return aUM.cWf().c("breed.aptitudes", this.dkD().getName());
            }
            case "pupilDescription": {
                String string2 = String.format("breed.pupilDescription.%d%d", this.dfW().aWP(), this.aWO());
                return aUM.cWf().cO(string2) ? aUM.cWf().c(string2, new Object[0]) : aUM.cWf().c("characterCreation.pupil", new Object[0]);
            }
            case "costume1Description": {
                return bft.dgp().dgs();
            }
            case "costume2Description": {
                return bft.dgp().dgt();
            }
            case "costume3Description": {
                return bft.dgp().dgu();
            }
            case "costume4Description": {
                return bft.dgp().dgv();
            }
            case "costume5Description": {
                return bft.dgp().dgw();
            }
            case "costume6Description": {
                return bft.dgp().dgx();
            }
            case "smileyIconUrl": {
                short s = this.aWP();
                byte by = this.aWO();
                return aUC.cVq().kt((s < 10 ? "0" : "") + s + by);
            }
            case "nameAndLevel": {
                return this.s(this.getName(), this.dnE());
            }
            case "breedCharacValue": {
                return bfk.f(this).orElse(null);
            }
            case "breedCharacDescription": {
                return bfk.g(this).orElse(null);
            }
            case "breedCharacImage": {
                return bfk.i(this);
            }
            case "breedCharacSmallImage": {
                return bfk.j(this);
            }
            case "breedCharacIconUrl": {
                return bfk.k(this).orElse(null);
            }
            case "breedChartValues": {
                if (this.ltt != null) {
                    ArrayList<fTf> arrayList = new ArrayList<fTf>();
                    arrayList.add(bhJ.e((eym)this.ltt));
                    bgx bgx2 = (bgx)fSe.gFu().vY("characterCreation.breedOver");
                    if (bgx2 != null && bgx2.dfW() != null && bgx2.dfW() != this.ltt) {
                        eym eym2 = bgx2.dfW();
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
        return !fjo.a(this.ffF().ems(), fjo.sys);
    }

    @Override
    public fpU dkC() {
        return this.ffF().dkC();
    }

    public eyT dpv() {
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
            bGV bGV2 = (bGV)fgD.fXh().Vd(n2 > 0 ? n2 : n);
            if (bGV2 == null) {
                pfX.error((Object)("Le ReferenceItem d'id " + n + " n'existe pas (skin r\u00e9f\u00e9renc\u00e9 : " + n2 + ")."));
                continue;
            }
            if (this.doZ() != 0 && !this.doJ() && bGV2.v(ffS.sgB)) continue;
            this.ddI().a(bGV2, (short)by);
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

    public bcd dpy() {
        return bbW.hCq.je(this.Sn());
    }

    @Override
    public void aPg() {
        this.doc().a((Qu)this, this.fgg());
        this.dlk();
        bcd bcd2 = bbW.hCq.je(this.Sn());
        if (bcd2 != null) {
            bcd2.daE().b(bcd2);
        }
    }

    public void jJ(long l) {
        if (!this.djT()) {
            this.iiV.jp(l);
        }
    }

    @Override
    public void dld() {
        rP rP2 = this.iiG.fkT();
        this.dlc().clear();
        if (rP2 != null) {
            if (rP2.Xy != null) {
                this.doc().a(rP2.Xy.SY, this.fgg());
            }
            if (rP2.Xz != null) {
                this.doc();
                eRS.a(rP2.Xz.XD, this.pgf, this);
            }
        }
        this.hKX.a(bSw.lgW);
    }

    @Override
    public void dmg() {
        if (this.djT()) {
            this.pgd.aYH();
            this.ffO();
        }
    }

    public Optional<bNF> dpz() {
        return bNF.co(this.dpA());
    }

    public String b(bSB bSB2) {
        return bSB.a(bSB2, this.getName(), this.iiY.dxH(), this.iiY.dxI());
    }

    @Override
    public short dpA() {
        return this.ije.elB();
    }

    @Nullable
    public String dpB() {
        Optional<bNF> optional = this.dpz();
        return optional.map(bNF2 -> bNF2.cC(this.aWO())).orElse(null);
    }

    @Nullable
    private axb dpC() {
        Optional<bNF> optional = this.dpz();
        return optional.map(bNF2 -> bEo.d(bNF2.egk().gkb())).orElse(null);
    }

    @Override
    public void bz(short s) {
        if (this.ije.elB() == s) {
            return;
        }
        this.ije.dP(s);
        fSe.gFu().a((aEF)this, iie, iif);
    }

    @Override
    public short dpD() {
        return this.dpA();
    }

    @Override
    public void dkf() {
        super.dkf();
        bth bth2 = this.hKX.dcX();
        if (bth2 != null && bth2 != btl.dHL()) {
            bth2.u(this.hKX);
        }
        this.hKX.a(btl.dHL());
        btl.dHL().x(this.hKX);
        if (!this.dkZ().dGo().fKW()) {
            this.gf(false);
        }
        if (!this.dkZ().kv(this.Sn()) && this.c(eXx.rGi) < 1 && this.baI()) {
            this.e(eXx.rGi).op(1);
        }
        if (this.dmc()) {
            bgG.dlO().jt(this.Sn());
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
        float f = 1.0f;
        return (int)((float)n / 1.0f);
    }

    @Override
    public int bvQ() {
        int n = super.bvQ();
        float f = 1.0f;
        return (int)((float)n / 1.0f);
    }

    @Override
    public float dmm() {
        return this.iiS == null ? 0.0f : this.iiS.gkE();
    }

    public void CR(int n) {
        if (this.iiS == null) {
            this.iiS = new frW();
            this.iiS.setValue(n);
            return;
        }
        int n2 = this.iiS.gkD();
        this.iiS.setValue(n);
        if (aUE.cVJ().cVK().djT() && this.bqo() != aUE.cVJ().cVK().bqo()) {
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

    void a(yu yu2) {
        this.iiT = yu2;
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
        bjh.Z(this);
    }

    public void dpG() {
        List<eRh> list = this.doc().fHG().stream().filter(eRh2 -> eRh2.fGk().gjB()).toList();
        bdt bdt2 = this.ddI().ddm();
        list.forEach(eRh2 -> bdt2.a((eRO)eRh2, false));
        list.forEach(eRh2 -> bdt2.b((eRO)eRh2, false));
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
    public fqP<bMx> dkB() {
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
        fqP<bMx> fqP2 = this.iiX.eeJ();
        return fqP2 != null && fqP2.pb(n);
    }

    @Override
    public void f(zk zk2) {
        if (this.iiX == null) {
            this.iiX = new bMw(this);
        }
        this.iiX.dkB().g(zk2);
    }

    @Override
    @Nullable
    public bMx jr(long l) {
        if (this.iiX == null) {
            return null;
        }
        return this.iiX.jr(l);
    }

    @Override
    @Nullable
    public Iterable<bMx> dkJ() {
        if (this.iiX == null) {
            return null;
        }
        return this.iiX.dkJ();
    }

    public bMw dpH() {
        return this.iiX;
    }

    @Override
    public long b(Vf vf) {
        switch (vf) {
            case bxK: {
                eYp eYp2 = aUE.cVJ().cVK().dnQ().dKL();
                if (eYp2 == null) {
                    return 0L;
                }
                return eYp2.rw(this.Sn()) != null ? eYp2.Sn() : 0L;
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
    public bjn dpI() {
        return this.ija;
    }

    @Override
    @NotNull
    public Optional<eKI> dpJ() {
        return baJ.hzf.iJ(this.Xi());
    }

    @NotNull
    public eKI dpK() {
        return baJ.hzf.iL(this.Xi());
    }

    public void a(eMS eMS2) {
        this.ijg = eMS2;
    }

    @Override
    public evd dpL() {
        return this.iiY;
    }

    public boolean a(evV evV2) {
        return this.dpL() != null && this.dpL().b(evV2);
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
        this.hKX.ddv().ifPresent(bkE2 -> bkE2.r(this.hKX));
        this.hKX.a((bkE)null);
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
            this.hKX.a(new bhK(this));
        }
    }

    void dpN() {
        if (this.ijc == null) {
            return;
        }
        boolean bl = this.hKX.ddv().isPresent();
        this.hKX.ddv().ifPresent(bkE2 -> bkE2.r(this.hKX));
        bkE bkE3 = this.ddI().a(this.ijc);
        this.hKX.a(bkE3);
        bkE3.dsM();
        if (!bl) {
            cdO.eug().D(this.hKX);
        }
        if (this.hKX.dcP().bvY()) {
            fSe.gFu().a((aEF)this, "isRiding");
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
        assert (aFs.can().bYf() != null);
        String string = String.format("emotes/%d%s", n, aFs.can().bLX());
        aFs.can().a(string, iiQ, hashMap2, (aFD)new bhL(this), false);
    }

    public ftO jF(long l) {
        this.ejt = Mz.aVX.cR(l);
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
        fSe.gFu().a((aEF)this, "level", "levelValue");
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
    public eyg djD() {
        return bfw.dgB();
    }

    @Override
    public void a(Rl rl2) {
        super.a(rl2);
        if (this.iiR != null) {
            this.iiR.a(rl2);
        }
    }

    @Override
    public void a(PV pV, PX pX) {
        if (pV == null) {
            return;
        }
        super.a(pV, pX);
        if (pV.aZd() == 1) {
            switch ((eXe)pV) {
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
                    bix.q(this);
                }
            }
        }
        if (pV.aZd() == 0) {
            switch ((ezJ)pV) {
                case pss: {
                    this.djo();
                }
            }
        }
    }

    @Override
    public bgy a(long l, aCd aCd2, short s, ezw ezw2, Tw tw, boolean bl, ezG<eXe> ezG2) {
        bgy bgy2 = super.a(l, aCd2, s, ezw2, tw, bl, ezG2);
        this.g(bgy2, true);
        return bgy2;
    }

    public void d(ZC zC, boolean bl) {
        this.a(zC, bl);
        this.b(zC, bl);
        this.c(zC, bl);
        for (arx arx2 : arx.cTH) {
            this.a(arx2, zC, bl);
        }
    }

    public void g(bgy bgy2, boolean bl) {
        this.d(bgy2.ddI(), bl);
        fSe.gFu().a((aEF)bgy2, iiD);
    }

    @Override
    public aKr dlt() {
        if (this.ltt != null && this.ltt == eym.pia) {
            return aKO.cjc();
        }
        return super.dlt();
    }

    @Override
    public int dlC() {
        float f = this.dmm();
        if (Math.abs(f) < 0.3f) {
            return super.dlC();
        }
        if (f < 0.0f) {
            return 900018;
        }
        return 900017;
    }

    @Override
    public int dlD() {
        float f = this.dmm();
        if (Math.abs(f) < 0.3f) {
            return super.dlD();
        }
        if (f < 0.0f) {
            return 900021;
        }
        return 900020;
    }

    public biu dpQ() {
        return this.iiR;
    }

    public void a(biu biu2) {
        this.iiR = biu2;
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
    public boolean a(eyP eyP2) {
        return eyP.pmO.a(eyP2);
    }

    public static String a(exP exP2, Iterable<?> iterable) {
        ArrayList<eNk> arrayList = new ArrayList<eNk>();
        exP2.doc();
        TShortIntHashMap tShortIntHashMap = new TShortIntHashMap();
        TIntHashSet tIntHashSet = new TIntHashSet();
        for (Object object : iterable) {
            Iterator<Object> iterator;
            short s = 0;
            if (object instanceof ffV) {
                ffV ffV2 = (ffV)object;
                if (!ffQ.fVK().a(ffV2, (Qu)exP2, exP2.bdV())) continue;
                int n = ffV2.dOg().d();
                if (!tIntHashSet.contains(n)) {
                    s = ffV2.dOg().dpq();
                    tIntHashSet.add(n);
                }
                if (!ffV2.apo()) continue;
                iterator = ffV2.iterator();
            } else {
                if (!(object instanceof bGV)) continue;
                bGV bGV2 = (bGV)object;
                if (!tIntHashSet.contains(bGV2.d())) {
                    s = bGV2.dpq();
                    tIntHashSet.add(bGV2.d());
                }
                iterator = bGV2.fYj();
            }
            if (s != 0) {
                tShortIntHashMap.put(s, tShortIntHashMap.contains(s) ? tShortIntHashMap.get(s) + 1 : 1);
            }
            while (iterator.hasNext()) {
                arrayList.add((eNk)iterator.next());
            }
        }
        TShortIntIterator tShortIntIterator = tShortIntHashMap.iterator();
        while (tShortIntIterator.hasNext()) {
            Object object;
            tShortIntIterator.advance();
            object = bEr.dSi().bW(tShortIntIterator.key());
            ArrayList<fgm> arrayList2 = ((ffA)object).UR(tShortIntIterator.value());
            for (fgm fgm2 : arrayList2) {
                for (eNk eNk2 : fgm2) {
                    arrayList.add(eNk2);
                }
            }
        }
        boolean bl = false;
        biR biR2 = new biR(aUM.cWf(), arrayList, 0);
        return biR2.o(exP2);
    }

    public bhJ dpU() {
        bgT bgT2 = new bgT(false);
        bgT2.c(this.ltt);
        bgT2.aQ(this.aZm);
        bgT2.setName(this.getName());
        bgT2.CV(this.ciZ);
        bgT2.w(this.iiI.sE(), true);
        bgT2.v(this.iiI.sC(), true);
        bgT2.x(this.iiI.sG(), true);
        bgT2.a(this.iiI.fwG(), true);
        bgT2.d(this.iiI.dlA(), false);
        bgT2.c(this.iiI.dlz(), false);
        bgT2.icx = this.icx;
        bgT2.jK(this.ijd);
        return bgT2;
    }

    @Override
    public cPM[] chR() {
        ArrayList<cPM> arrayList = new ArrayList<cPM>(Arrays.asList(super.chR()));
        for (cPS cPS2 : this.iiH) {
            arrayList.add((cPM)cPS2.eLI());
        }
        return arrayList.toArray(cPM.nip);
    }

    @Override
    protected void dks() {
        if (this.bwb() && cdO.eug().au(this)) {
            this.ddI().ddv().ifPresent(bkE::dsM);
        }
    }

    @Override
    public eMS dpV() {
        return this.ijg;
    }

    @Override
    public bMQ djG() {
        bMQ bMQ2 = super.djG();
        if (bMQ2 == null) {
            pfX.warn((Object)String.format("No natural state found for breed %s !", this.ltt.aWP()));
        }
        return bMQ2;
    }

    @Nullable
    public bMn Da(int n) {
        List<QD> list = this.doc().oG(1);
        for (QD qD : list) {
            bMQ bMQ2;
            Object EC = qD.bbf();
            if (!(EC instanceof bMQ) || (bMQ2 = (bMQ)EC).eem() != n) continue;
            return this.icb.c(qD, -1L);
        }
        return null;
    }

    private static fTf e(eym eym2) {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        for (short s : eym2.drx()) {
            arrayList.add(Float.valueOf((float)s / 4.0f));
        }
        return new fTf(arrayList, bfo.a(eym2), bfo.b(eym2));
    }

    public boolean dpW() {
        int[] nArray = aUE.cVJ().cVO().cWq();
        if (evm.b(nArray, evn.ouW)) {
            return true;
        }
        return this.fhC();
    }

    @Override
    public /* synthetic */ bMd dkI() {
        return this.dpH();
    }

    @Override
    public /* synthetic */ eyp doV() {
        return this.dfW();
    }

    @Override
    public /* synthetic */ eID dpX() {
        return this.dps();
    }

    @Override
    public /* synthetic */ exP b(long l, aCd aCd2, short s, ezw ezw2, Tw tw, boolean bl, ezG ezG2) {
        return this.a(l, aCd2, s, ezw2, tw, bl, ezG2);
    }

    @Override
    public /* synthetic */ eyL dmj() {
        return this.dpv();
    }

    @Override
    public /* synthetic */ euR dpY() {
        return this.dpL();
    }

    @Override
    @NotNull
    public /* synthetic */ eYA dpZ() {
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

    static /* synthetic */ eRN n(bhJ bhJ2) {
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
        iiQ = new aFr[]{ais.bBp(), aiq.bBo(), aiv.bBr()};
    }
}

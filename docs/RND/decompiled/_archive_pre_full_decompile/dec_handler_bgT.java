/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.google.common.base.Strings;
import gnu.trove.iterator.TLongIterator;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public class bgT
extends bhJ
implements PU,
Vg,
afp<adS, bZE>,
bvG,
eIt,
eMJ,
ezI<bLX>,
ffh,
fgK,
fgv,
fiC,
ftF {
    protected static final bsT idG = new bsT();
    public static final String idH = "bags";
    public static final String idI = "selectedItemInventoryDescription";
    public static final String idJ = "headEquipment";
    public static final String idK = "hairEquipment";
    public static final String idL = "faceEquipment";
    public static final String idM = "shoulderEquipment";
    public static final String idN = "neckEquipment";
    public static final String idO = "chestEquipment";
    public static final String idP = "armsEquipment";
    public static final String idQ = "leftHandEquipment";
    public static final String idR = "rightHandEquipment";
    public static final String idS = "beltEquipment";
    public static final String idT = "skirtEquipment";
    public static final String idU = "trousersEquipment";
    public static final String idV = "legsEquipment";
    public static final String idW = "petEquipment";
    public static final String idX = "mountEquipment";
    public static final String idY = "backEquipment";
    public static final String idZ = "wingEquipment";
    public static final String iea = "firstWeaponEquipment";
    public static final String ieb = "secondWeaponEquipment";
    public static final String iec = "accessoryEquipment";
    public static final String ied = "craft";
    public static final String iee = "kamas";
    public static final String ief = "formatedKamas";
    public static final String ieg = "tokens";
    public static final String ieh = "temporaryTransferInventory";
    public static final String iei = "isRealLevel";
    public static final String iej = "currentLevelPercentage";
    public static final String iek = "currentLevelPercentageInText";
    public static final String iel = "xpRatio";
    public static final String iem = "xpToNextLevel";
    public static final String ien = "currentExperience";
    public static final String ieo = "wakfuGauge";
    public static final String iep = "stasisGauge";
    public static final String ieq = "wakfuGaugePopupText";
    public static final String ier = "wakfuGaugeIconStyle";
    public static final String ies = "wakfuGaugeColor";
    public static final String iet = "nation";
    public static final String ieu = "characterIconUrl";
    public static final String iev = "isInSubscriberZone";
    public static final String iew = "companionList";
    public static final String iex = "actorAnimationName";
    public static final String iey = "actorStandardScale";
    public static final String iez = "availableLevels";
    public static final String ieA = "nameAndLevel";
    public static final String ieB = "walkOrRun";
    public static final String ieC = "isHatHidden";
    public static final String ieD = "rerollXpBonus";
    public static final String ieE = "rerollXpBonusValue";
    public static final String ieF = "rerollXpBonusDescription";
    public static final String ieG = "hasRerollXpBonus";
    public static final String ieH = "isRiding";
    public static final String ieI = "canRide";
    static final String[] ieJ = new String[]{"shortcutBarManager", "bags", "actorAnimationName", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "mountEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "kamas", "formatedKamas", "tokens", "temporaryTransferInventory", "currentLevelPercentage", "currentLevelPercentageInText", "xpRatio", "currentExperience", "xpToNextLevel", "wakfuGauge", "wakfuGaugePopupText", "wakfuGaugeIconStyle", "isInSubscriberZone", "companionList", "nameAndLevel", "isHatHidden"};
    public static final String[] ieK = new String[ieJ.length + bhJ.iiF.length];
    public static final String[] ieL;
    protected boolean ieM;
    short cLw;
    private final HashMap<bMx, Short> ieN = new HashMap();
    private final HashMap<ffV, Short> ieO = new HashMap();
    bhw ieP;
    final bLH ieQ = new bLH();
    final bRj ieR = new bRj();
    final fqk ieS = new fqk();
    final fey ieT = new fey();
    private final eIZ<bgT> ieU;
    final bDL ieV = new bDL();
    private boolean ieW = true;
    protected boolean ieX = false;
    private final bDX ieY;
    bnv ieZ;
    private bnv ifa;
    private bgP ifb;
    private boolean ifc = false;
    private final bKI ifd = new bKI();
    @NotNull
    private final bvI ife = new bvI(this);
    private boolean iff = true;
    private final bMl ifg = new bMl(this);
    final ftF ifh = new ftG(false);
    private final bkU ifi = new bkU();
    fiA ifj = null;
    private bJK ifk;
    private bsJ ifl;
    private final btX ifm = new btX();
    TIntHashSet ifn;
    TIntHashSet ifo;
    TIntHashSet ifp;
    final eHz ifq = new eHz();
    private long ifr;
    private boolean ifs = false;
    private final frf ift = new frf();
    private eHZ hUQ = new eHZ();
    @NotNull
    eIm hUL = new eIm();
    @NotNull
    private bgv ifu = bgv.iav;
    private final bfI ifv = new bfI(this);

    public bMl dmz() {
        return this.ifg;
    }

    public bgT(boolean bl) {
        this.ieM = bl;
        ((eXh)this.fgM()).a(this);
        this.ieT.b(fez.sep);
        this.ieT.b(fez.seq);
        feH feH2 = (feH)this.ieT.a(fez.seq);
        this.ieY = new bDX(feH2, this);
        feH2.a(this.ieY);
        this.ieU = new eIZ<bgT>(this);
        this.ifd.hU(true);
        this.bXs = false;
        this.ifi.a(() -> fSe.gFu().a((aEF)this, "states"));
        bNB.kDS.a(this.dlc());
        this.hUQ.a(new eHS(this));
        if (!bl) {
            fSe.gFu().f("inventory.occupation.allows.interaction", true);
        }
        int n = ((bSG)aIe.cfn().bmH()).d(bSN.ljS);
        this.ifu = bgv.CE(n);
    }

    private void dmA() {
        this.ifv.bkZ();
    }

    @Override
    protected evd dmB() {
        evd evd2 = new evd();
        evd2.a(new bit(this));
        return evd2;
    }

    @Override
    protected bjn dmC() {
        return new bjo();
    }

    @Override
    public boolean bvY() {
        return true;
    }

    @Override
    public fiA dmD() {
        return this.ifj;
    }

    @Override
    public eMI<bgT> dmE() {
        return this.ifv;
    }

    @Override
    public void dC(long l) {
        super.dC(l);
        this.ieQ.dC(l);
        bvE.dKK().a(l, this);
    }

    public void dmF() {
        bvE.dKK().b(this.aXv, this);
    }

    @Override
    public void aPg() {
        this.ifg.a(this.dlc());
        this.ddI().bA(((bSG)aIe.cfn().bmH()).a(bSN.liL));
        this.CI(-1);
        int n = this.e(eXx.rGi).aYC();
        this.dmH();
        this.ifg.clear();
        this.dmg();
        this.ift.a(this.iiX);
        this.dmA();
        this.dpg().jo(this.Sn());
        this.bXs = true;
        this.fhc();
        this.dmG();
        this.OC(n);
        this.fO(true);
        bcd bcd2 = bbW.hCq.je(this.Sn());
        bcd2.daE().b(bcd2);
        this.ieV.E(this);
    }

    private void dmG() {
        if (this.iiT != null) {
            eRS.a(this.iiT, this.pgf, this);
            this.iiT = null;
        }
    }

    private void dmH() {
        if (this.ltt == eym.phX && this.dmN() == null) {
            this.ieP = new bhw(this);
            this.a(new bLX(this.aXv));
        }
        if (this.ltt == eym.pio) {
            this.icn.dqU();
        }
    }

    @Override
    public boolean bay() {
        return this.bXs;
    }

    @Override
    public void dmI() {
        new bgX(this, this.iiG.fkG());
        super.dmI();
        new bgZ(this, this.iiG.fkU());
        new bha(this, this.iiG.fkI());
        new bhc(this, this.iiG.fkS());
        new bhb(this.iiG.flc());
        new bhj(this, this.iiG.fkZ());
        new bhg(this, this.iiG.fla());
        new bhi(this, this.iiG.fle());
        new bhl(this, this.iiG.flg());
        new bgW(this, this.iiG.fkP());
        new bhf(this, this.iiG.flE());
        new bhm(this, this.iiG.fkX());
        new bhd(this, this.iiG.flq());
        new bhh(this, this.iiG.flB());
        new bho(this, this.iiG.flC());
        new bgY(this, this.iiG.flG());
        new bhn(this, this.iiG.flx());
        new bhk(this, this.iiG.flI());
        new bhe(this, this.iiG.fiE());
    }

    @Override
    public void dmg() {
        this.fgM().aYH();
        this.ieU.fwU();
        this.dmn().clear();
        this.ffN();
        this.m(this);
        this.dmJ();
    }

    private void dmJ() {
        if (!(this.ltt instanceof eym)) {
            return;
        }
        ((eym)this.ltt).fhV().a(this.fgM(), this.cmL());
    }

    public void m(Qu qu) {
        for (eXx eXx2 : eXx.values()) {
            if (eXx2.isExpandable()) {
                qu.b(eXx2).ot(this.ltt.k(eXx2));
                continue;
            }
            qu.b(eXx2).op(this.ltt.k(eXx2));
        }
        qu.b(eXx.rGj).aYO();
        qu.b(eXx.rGk).aYO();
        qu.b(eXx.rGs).aYO();
        PR pR = qu.b(eXx.rGl);
        pR.aYO();
        eXv.a(qu.b(eXx.rHH), pR);
        this.fgL();
    }

    @Override
    protected void dmK() {
        fSe.gFu().a((aEF)this, iej, iek, iel, ien, iem);
    }

    @Override
    public fhk dmL() {
        eIj eIj2 = this.hUL.fwt();
        if (eIj2 == null) {
            return null;
        }
        int n = eIj2.wp();
        return this.CL((byte)n);
    }

    @Override
    @Nullable
    public fhk CL(int n) {
        fhm fhm2 = fhp.sop.aJ(this.ePP, this.aXv);
        if (fhm2 == null) {
            return null;
        }
        return fhm2.gq(GC.ct(n));
    }

    @Override
    public void b(eIm eIm2) {
        this.hUL = eIm2;
        for (eIj eIj2 : eIm2.uv().values()) {
            if (eIj2.getName() != null && !eIj2.getName().isBlank()) continue;
            if (eIj2.dhe()) {
                if (eIj2.tL() == -1) {
                    eIj2.setName(aUM.cWf().c("build.permanent.default.name", new Object[0]));
                    continue;
                }
                eIj2.setName(aUM.cWf().c("build.permanent.name", eIj2.tL()));
                continue;
            }
            eIj2.setName(cVu.Nh(eIj2.tL()));
        }
        this.ieQ.c(eIm2);
    }

    public ffV jC(long l) {
        Optional<ffV> optional = this.dnP().B(l);
        if (optional.isPresent() && optional.get().apo()) {
            return optional.get();
        }
        return this.ieV.tb(l);
    }

    public void fV(boolean bl) {
        this.ifs = bl;
    }

    private void dmM() {
        ffS[] ffSArray;
        if (this.iiN == null) {
            this.iiN = new TByteIntHashMap();
        } else {
            this.iiN.clear();
        }
        if (this.icA == null) {
            this.icA = new TByteIntHashMap();
        } else {
            this.icA.clear();
        }
        for (ffS ffS2 : ffSArray = ffS.values()) {
            Optional<ffV> optional = fht.b(this, ffS2);
            Optional<Integer> optional2 = optional.map(ffV2 -> this.a((ffV)ffV2, ffS2)).or(() -> this.a(ffS2));
            optional2.ifPresent(n -> this.icA.put(ffS2.shb, n.intValue()));
            if (!optional.isPresent()) continue;
            optional2.ifPresent(n -> this.iiN.put(ffS2.shb, n.intValue()));
        }
    }

    private int a(ffV ffV2, ffS ffS2) {
        int n = bjf.f(ffV2);
        return this.a(ffS2).orElse(n);
    }

    private Optional<Integer> a(ffS ffS2) {
        fB fB2 = eKj.a(this.Xi(), this.Sn(), ffS2);
        if (fB2.AK() == 0) {
            return Optional.empty();
        }
        bGV bGV2 = (bGV)bEm.dSb().Vd(fB2.AK());
        if (bGV2 != null && bGV2.fYr() != null) {
            return Optional.of(fB2.AK());
        }
        return Optional.empty();
    }

    @Override
    @Nullable
    public TByteIntHashMap dkE() {
        if (!this.ifs) {
            this.dmM();
        }
        return this.icA;
    }

    public bLX dmN() {
        if (this.ieP != null) {
            return this.ieP.dmN();
        }
        return null;
    }

    @Override
    public void a(bLX bLX2) {
        if (this.ieP == null) {
            this.ieP = new bhw(this);
        }
        this.ieP.a(bLX2);
        bLX2.a(this);
    }

    @Override
    public void dmO() {
        if (this.ieP != null) {
            this.ieP.dmO();
        }
    }

    @Override
    public void bm(byte by) {
        if (this.ieP != null) {
            this.ieP.bm(by);
        }
    }

    @Override
    public void bn(byte by) {
        if (this.ieP != null) {
            this.ieP.bn(by);
        }
    }

    @Override
    public boolean bo(byte by) {
        if (!this.djT() || this.baM()) {
            return false;
        }
        return this.bp(by) <= 0;
    }

    @Override
    public int bp(byte by) {
        if (this.dmN() == null) {
            return 0;
        }
        if (!this.djT() || this.baM()) {
            return 0;
        }
        fqQ fqQ2 = this.fhp().fgh();
        return fqQ2.a((exP)this, by, (int)this.dkZ().dGQ().bhJ());
    }

    public boolean dmP() {
        return this.ieW;
    }

    public void fW(boolean bl) {
        if (this.ieW != bl) {
            this.ieW = bl;
            cVO.ky(this.ieW);
        }
    }

    public void a(ffV ffV2, short s, short s2, long l, long l2) {
        if (!this.ieW) {
            return;
        }
        if (bDQ.dRC().ab(ffV2)) {
            return;
        }
        this.a(ffV2, s, l, l2, s2);
        cVO.eUK().eUQ();
        fBJ.getInstance().gtx();
    }

    private void a(ffV ffV2, short s, long l, long l2, short s2) {
        Object object;
        if (s == 0) {
            return;
        }
        int n = 1;
        long l3 = 0L;
        long l4 = ffV2.LV();
        ffs ffs2 = this.ieV.sY(l);
        ffs ffs3 = fcI.ap(this.ePP, l2);
        if (ffs3 == null) {
            return;
        }
        if (ffV2.bfd() > s && s != -1) {
            object = ffV2.fVT();
            try {
                l3 = ((ffV)object).LV();
                n = fdY.fUs().a(ffs2.fVb(), ffs3.fVb(), s2, ffV2, s, (ffV)object, this, this.fgg());
            }
            catch (Exception exception) {
                pfX.error((Object)"Exception survenue durant le transfert de bag ? bag (avec split) : ", (Throwable)exception);
            }
        } else {
            try {
                n = fdY.fUs().a(ffs2.fVb(), ffs3.fVb(), s2, ffV2, s, null, this, this.fgg());
            }
            catch (Exception exception) {
                pfX.error((Object)"Exception survenue durant le transfert de bag ? bag (sans split) : ", (Throwable)exception);
            }
        }
        if (n == 0) {
            object = new clp();
            ((cll)object).nl(l2);
            ((cll)object).nn(l);
            ((clp)object).setDestinationPosition(s2);
            ((cll)object).nk(l4);
            ((cll)object).nm(l3);
            ((clp)object).ak(s);
            aUE.cVJ().etu().d(object);
        }
    }

    @Override
    public eRN dmQ() {
        return this.pgf;
    }

    public void dmR() {
        this.ieN.clear();
    }

    @Override
    public void a(bMx bMx2) {
        Short s = this.ieN.get(bMx2);
        if (s == null) {
            s = 0;
        }
        s = (short)(s + 1);
        this.ieN.put(bMx2, s);
    }

    public ArrayList<azx<bMx, Short>> dmS() {
        ArrayList<azx<bMx, Short>> arrayList = new ArrayList<azx<bMx, Short>>();
        for (bMx bMx2 : this.ieN.keySet()) {
            Short s = this.ieN.get(bMx2);
            if (s == null) continue;
            arrayList.add(new azx<bMx, Short>(bMx2, s));
        }
        return arrayList;
    }

    public void dmT() {
        this.ieO.clear();
    }

    public void c(ffV ffV2) {
        Short s = this.ieO.get(ffV2);
        if (s == null) {
            s = 0;
        }
        s = (short)(s + 1);
        this.ieO.put(ffV2, s);
    }

    public ArrayList<azx<ffV, Short>> dmU() {
        ArrayList<azx<ffV, Short>> arrayList = new ArrayList<azx<ffV, Short>>();
        for (ffV ffV2 : this.ieO.keySet()) {
            Short s = this.ieO.get(ffV2);
            if (s == null) continue;
            arrayList.add(new azx<ffV, Short>(ffV2, s));
        }
        return arrayList;
    }

    public final void jD(long l) {
        boolean bl = ((bSG)aIe.cfn().bmH()).a(bSN.ljb);
        ckt ckt2 = new ckt(l, bl);
        aUE.cVJ().etu().d(ckt2);
    }

    private bgy aD(bgy bgy2) {
        bsI bsI2 = bgy2.dkW();
        byte by = bsI2.kp(bgy2.Sn());
        Collection<bgy> collection = bsI2.bK(by);
        Iterator<bgy> iterator = collection.iterator();
        bgy bgy3 = null;
        if (iterator.hasNext()) {
            bgy3 = iterator.next();
        }
        return bgy3;
    }

    public void aE(bgy bgy2) {
        cko cko2 = new cko();
        cko2.fg(bgy2.Sn());
        cko2.Y(bgy2.bcC(), bgy2.bcD(), bgy2.bcE());
        if (((bSG)aIe.cfn().bmH()).a(bSN.ljb)) {
            cko2.evv();
        }
        aUE.cVJ().etu().d(cko2);
    }

    public void CM(int n) {
        aUE.cVJ().etu().d(new cny(n));
    }

    public void a(adS adS2, bZE bZE2, bZE bZE3) {
        bqM.jbp.b(new bqI(bZE2, bZE3));
        bJK bJK2 = bJJ.kmp.dO(bZE3.getX(), bZE3.getY());
        if (bJK2 != this.ifk) {
            try {
                this.a(bJK2);
            }
            catch (Exception exception) {
                pfX.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public bsJ dmV() {
        if (this.dkZ() != null) {
            return this.dkZ();
        }
        return this.ifl;
    }

    public int dmW() {
        bsJ bsJ2 = this.dmV();
        return bsJ2 == null ? -1 : bsJ2.d();
    }

    public boolean dmX() {
        return !this.djT() && this.dnk();
    }

    public boolean b(eKR eKR2) {
        Iterator<Map.Entry<Integer, Bu<Short, Short>>> iterator = eKR2.fza();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Bu<Short, Short>> entry = iterator.next();
            if (this.e((int)entry.getKey(), entry.getValue().getFirst())) continue;
            return false;
        }
        return true;
    }

    public boolean e(int n, short s) {
        int n2 = 0;
        for (ffV ffg22 : this.ieV.pd(n)) {
            if ((n2 += ffg22.bfd()) < s) continue;
            return true;
        }
        feC feC2 = (feC)this.a(fez.sep);
        ffm ffm2 = feC2.UB(n);
        if (ffm2 == null) {
            return false;
        }
        return ffm2.bfd() >= s;
    }

    public int c(eKR eKR2) {
        int n = Integer.MAX_VALUE;
        Iterator<Map.Entry<Integer, Bu<Short, Short>>> iterator = eKR2.fza();
        while (iterator.hasNext()) {
            int n2;
            feC feC2;
            ffm ffm2;
            Map.Entry<Integer, Bu<Short, Short>> entry = iterator.next();
            int n3 = entry.getKey();
            int n4 = this.ieV.Gn(n3);
            if (n4 == 0 && (ffm2 = (feC2 = (feC)this.a(fez.sep)).UB(n3)) != null) {
                n4 = ffm2.bfd();
            }
            if ((n2 = n4 / entry.getValue().getFirst()) >= n) continue;
            n = n2;
        }
        return n;
    }

    public void dmY() {
        this.CN(800200);
    }

    private void CN(int n) {
        FreeParticleSystem freeParticleSystem = agY.bzw().sk(n);
        if (freeParticleSystem == null) {
            return;
        }
        freeParticleSystem.a(this.ddI());
        agZ.bzy().b(freeParticleSystem);
    }

    @Override
    public <T extends fff> T a(fez fez2) {
        return this.ieT.a(fez2);
    }

    @Override
    public void b(int n, eyc eyc2) {
        super.b(n, eyc2);
        this.ieQ.edg();
    }

    @Override
    protected void a(int n, eyc eyc2) {
        super.a(n, eyc2);
        bLO bLO2 = this.ieQ.edf();
        if (bLO2 != null) {
            bLO2.bK(this);
            bLO2.edQ();
        }
        this.ieQ.edg();
    }

    @Override
    public void dkM() {
        super.dkM();
        bMV.a(this.dnM(), this.dkB(), this.dlG());
        bLO bLO2 = this.ieQ.edf();
        if (bLO2 != null) {
            bLO2.aZp();
            bLO2.ecU();
        }
        this.ieQ.edh();
    }

    @Override
    public void a(awK awK2, String string) {
        if (awK2 != null) {
            fSe.gFu().a((aEF)this, ieu);
        } else {
            pfX.warn((Object)string);
        }
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "formatedKamas": {
                return aUM.cWf().cQ(this.cWp().exS());
            }
            case "kamas": {
                return this.cWp().exS();
            }
            case "availableLevels": {
                return this.dne();
            }
            case "shortcutBarManager": {
                return this.ieQ;
            }
            case "characterIconUrl": {
                return bvE.dKK().kM(this.Sn());
            }
            case "bags": {
                return this.ieV;
            }
            case "actorAnimationName": {
                return "AnimStatique";
            }
            case "headEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgB));
                return optional.orElse(null);
            }
            case "hairEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgC));
                return optional.orElse(null);
            }
            case "faceEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgD));
                return optional.orElse(null);
            }
            case "shoulderEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgE));
                return optional.orElse(null);
            }
            case "neckEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgF));
                return optional.orElse(null);
            }
            case "chestEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgG));
                return optional.orElse(null);
            }
            case "armsEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgH));
                return optional.orElse(null);
            }
            case "leftHandEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgI));
                return optional.orElse(null);
            }
            case "rightHandEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgJ));
                return optional.orElse(null);
            }
            case "beltEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgL));
                return optional.orElse(null);
            }
            case "skirtEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgK));
                return optional.orElse(null);
            }
            case "trousersEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgM));
                return optional.orElse(null);
            }
            case "legsEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgN));
                return optional.orElse(null);
            }
            case "backEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgO));
                return optional.orElse(null);
            }
            case "wingEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgP));
                return optional.orElse(null);
            }
            case "firstWeaponEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgQ));
                return optional.orElse(null);
            }
            case "secondWeaponEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgR));
                return optional.orElse(null);
            }
            case "accessoryEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgS));
                return optional.orElse(null);
            }
            case "petEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgX));
                return optional.orElse(null);
            }
            case "mountEquipment": {
                Optional<ffV> optional = this.dnP().B(this.dmL().t(ffS.sgZ));
                return optional.orElse(null);
            }
            case "craft": {
                bmw bmw2 = this.dnZ();
                return bmw2.aJG() ? null : bmw2;
            }
            case "temporaryTransferInventory": {
                return this.ieY;
            }
            case "currentLevelPercentage": {
                if (this.dnG() >= ewo.oBF.i(ewr.oCk)) {
                    return 1;
                }
                return Float.valueOf(this.dnI());
            }
            case "currentLevelPercentageInText": {
                return String.format("(%s %%)", GC.B(this.dnI() * 100.0f));
            }
            case "isReachedMaxLvl": {
                return this.dnG() >= ewo.oBF.i(ewr.oCk);
            }
            case "xpRatio": {
                if (this.dnG() >= ewo.oBF.i(ewr.oCk)) {
                    return aUM.cWf().c("maxLevel", new Object[0]);
                }
                return aUM.cWf().c(iel, aUM.cWf().cQ(this.dnH().cT(this.dlF())), aUM.cWf().cQ(this.dnH().N(this.dnG())));
            }
            case "currentExperience": {
                if (this.dnG() >= ewo.oBF.i(ewr.oCk)) {
                    return aUM.cWf().c("maxLevel", new Object[0]);
                }
                return this.dnH().cT(this.dlF());
            }
            case "xpToNextLevel": {
                return "/ " + aUM.cWf().cQ(this.dnH().N(this.dnG()));
            }
            case "wakfuGauge": {
                return Float.valueOf(this.dmm() > 0.0f ? this.dmm() : 0.0f);
            }
            case "stasisGauge": {
                return Float.valueOf(this.dmm() < 0.0f ? -this.dmm() : 0.0f);
            }
            case "wakfuGaugePopupText": {
                float f = this.dmm() * 100.0f;
                String string2 = Math.abs((int)f) + "% ";
                aHV aHV2 = new aHV();
                aHV2.c(aUM.cWf().c("wakfu.gaugePopup", new Object[0]));
                if (f > 0.0f) {
                    aHV2.c("\n").ih("28d2c4").c(string2).c(aUM.cWf().c("WAKFU", new Object[0])).ceD();
                } else if (f < 0.0f) {
                    aHV2.c("\n").ih("ab00ff").c(string2).c(aUM.cWf().c("STASIS", new Object[0])).ceD();
                } else {
                    return null;
                }
                return aHV2.ceL();
            }
            case "wakfuGaugeColor": {
                float f = this.dmm();
                float f2 = Math.abs(f);
                float[] fArray = f < 0.0f ? aId.dUC : aId.dUB;
                return GC.a(1.0f, fArray[0], f2) + "," + GC.a(1.0f, fArray[1], f2) + "," + GC.a(1.0f, fArray[2], f2);
            }
            case "wakfuGaugeIconStyle": {
                float f = this.dmm();
                return f < 0.0f ? "StasisIcon" : (f > 0.0f ? "wakfuIcon" : "");
            }
            case "nation": {
                return ((bRI)this.ffF()).ell();
            }
            case "isInSubscriberZone": {
                return evg.osQ.a(new eve[]{this});
            }
            case "companionList": {
                return this.dnf();
            }
            case "actorStandardScale": {
                return Float.valueOf(1.5f);
            }
            case "nameAndLevel": {
                return this.s(this.getName(), this.cmL());
            }
            case "isHatHidden": {
                return !this.doJ();
            }
            case "rerollXpBonus": {
                return this.dnb();
            }
            case "rerollXpBonusValue": {
                return Float.valueOf(this.dnc());
            }
            case "rerollXpBonusDescription": {
                return this.dmZ();
            }
            case "hasRerollXpBonus": {
                return this.dna();
            }
            case "isRealLevel": {
                return this.cmL() == this.dnG();
            }
            case "isRiding": {
                return this.bwb();
            }
            case "canRide": {
                return cdO.eug().au(this);
            }
        }
        return super.eu(string);
    }

    private String dmZ() {
        evT evT2 = evT.Oq(aUE.cVJ().cVO().arF());
        if (this.dnG() == Collections.max(bgT.jE(aUE.cVJ().cVO().xl())).shortValue()) {
            return aUM.cWf().c("rerollXp.info.onlyLowerLevelCharacters", new Object[0]);
        }
        if (evT2.b(evV.oxl)) {
            return aUM.cWf().c("rerollXp.info.hasRight", new Object[0]);
        }
        return aUM.cWf().c("rerollXp.info.notRight", Float.valueOf(this.fX(true)));
    }

    private boolean dna() {
        evT evT2 = evT.Oq(aUE.cVJ().cVO().arF());
        return evT2.b(evV.oxl);
    }

    private String dnb() {
        return aUM.cWf().c("rerollXp.factor", Float.valueOf(this.dnc()));
    }

    public float dnc() {
        return this.fX(this.dna());
    }

    private float fX(boolean bl) {
        long l = aUE.cVJ().cVO().xl();
        ArrayList<Short> arrayList = bgT.jE(l);
        return ftD.a(this.dnG(), arrayList, bl);
    }

    @NotNull
    private static ArrayList<Short> jE(long l) {
        ArrayList<Short> arrayList = new ArrayList<Short>();
        fcL.rUh.a(l, new bgU(arrayList));
        return arrayList;
    }

    private @Unmodifiable List<Integer> dnd() {
        return bjf.b(fm.pA);
    }

    private List<Short> dne() {
        eIi[] eIiArray;
        ArrayList<Short> arrayList = new ArrayList<Short>();
        arrayList.add(this.dnG());
        for (eIi eIi2 : eIiArray = eIi.values()) {
            arrayList.add(eIi2.cmL());
        }
        return arrayList;
    }

    public blI[] dnf() {
        int n = this.ife.dKL() != null ? this.ife.dKL().fPF() + 1 : 1;
        blI[] blIArray = new blI[n];
        blIArray[0] = new blH(this.Sn(), this.getName(), this.aWP(), this.aWO());
        if (!this.ife.dfG()) {
            return blIArray;
        }
        TLongObjectHashMap<eXZ> tLongObjectHashMap = this.ife.dKL().fPG();
        int n2 = 1;
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            eXZ eXZ2 = (eXZ)tLongObjectIterator.value();
            if (!(eXZ2 instanceof eXY)) continue;
            eJS eJS2 = ((eXY)eXZ2).fPk();
            long l = aUE.cVJ().cVO().xl();
            if (eJN.qAF.O(l, eJS2.Sn()) == null) continue;
            blIArray[n2++] = new blt(eJS2);
        }
        return blIArray;
    }

    @Override
    protected void djL() {
        if (this.icf == null || this.icg == null) {
            this.icf = new ArrayList();
            this.icg = new ArrayList();
            this.ich = new ArrayList();
            this.ici = new ArrayList();
            this.icj = new ArrayList();
            this.ick = new ArrayList();
            for (QD qD : this.ifg) {
                Object object;
                if (!this.z(qD)) continue;
                long l = -1L;
                block0 : switch (qD.bbf().bab()) {
                    case 18: {
                        Object object2;
                        if (this.djT()) break;
                        object = this.dnS().iterator();
                        while (object.hasNext()) {
                            object2 = (ftQ)object.next();
                            if ((long)((ftQ)object2).gmI() != qD.bbf().QF()) continue;
                            int n = ((ftQ)object2).gmL();
                            l = n != -1 ? (long)(n / 1000) : -1L;
                            break block0;
                        }
                        break;
                    }
                    case 1: {
                        short s = ((bMQ)qD.bbf()).gjy();
                        Object object2 = this.ifg.Sg(s);
                        if (object2 == null) break;
                        l = this.ifg.lN(((QD)object2).LV());
                        break;
                    }
                    default: {
                        l = this.ifg.lN(qD.LV());
                    }
                }
                if ((object = this.dlc().c(qD, l)) == null) continue;
                switch (qD.bbf().bab()) {
                    case 19: 
                    case 33: {
                        if (this.icg.contains(object)) break;
                        this.icg.add(object);
                        break;
                    }
                    default: {
                        if (this.icf.contains(object)) break;
                        this.icf.add(object);
                    }
                }
                if (this.ich.contains(object)) continue;
                this.ich.add(object);
                if (((bMn)object).eet() == fqY.sXg) {
                    this.ici.add(object);
                    continue;
                }
                if (((bMn)object).eet() == fqY.sXe) {
                    this.ick.add(object);
                    continue;
                }
                this.icj.add(object);
            }
            this.djM();
        }
    }

    @Override
    public String[] bxk() {
        return ieK;
    }

    @Override
    @Nullable
    public fqw a(fqt fqt2, byte by) {
        bLG bLG2 = null;
        try {
            bLG2 = this.ieQ.c(fqt2, by);
            return bLG2.edd();
        }
        catch (Exception exception) {
            pfX.error((Object)("Exception while trying to het shortcutbar " + String.valueOf((Object)fqt2) + " / " + by), (Throwable)exception);
            return null;
        }
    }

    @Override
    public fqr a(byte by, short s, fqE fqE2) {
        bLG bLG2 = this.ieQ.c(fqt.sTd, by);
        if (bLG2 == null) {
            return null;
        }
        bLB bLB2 = bLB.a(fqu.sTq, fqE2.LV(), fqE2.avr(), fqE2.aVt());
        bLG2.a(bLB2, s == -1 ? bLG2.beO() : s);
        bLG2.ecY();
        if (this.ieQ == cXX.eXH().dlG()) {
            cXX.eXH().ek(by);
        }
        return bLB2;
    }

    @Override
    public void a(byte by, short s, fqr fqr2) {
        bLG bLG2 = this.ieQ.c(fqt.sTd, by);
        if (bLG2 == null) {
            return;
        }
        if (fqr2 == null) {
            bLG2.a(s, true);
        } else {
            bLG2.c((bLB)fqr2);
        }
        bLG2.ecY();
        if (this.ieQ == cXX.eXH().dlG() && bLG2.aJG()) {
            cXX.eXH().r(by, true);
        }
    }

    @Override
    @NotNull
    public bLH dlG() {
        return this.ieQ;
    }

    public fqk dng() {
        return this.ieS;
    }

    @Override
    public void f(zk zk2) {
    }

    @Override
    public void dnh() {
        this.a(bSN.ljS);
        super.dnh();
        fSe.gFu().a((aEF)this, ieH);
    }

    @Override
    public void dni() {
        if (this.ijc == null) {
            cdV.W(this);
        }
        this.a(bSN.ljT);
        super.dni();
    }

    @Override
    private void a(bSN bSN2) {
        int n = ((bSG)aIe.cfn().bmH()).d(bSN2);
        this.ifu = bgv.CE(n);
    }

    public boolean dnj() {
        return this.ifc;
    }

    @Override
    public boolean dmc() {
        return this.ieM;
    }

    public void fY(boolean bl) {
        this.ifc = bl;
    }

    public boolean dnk() {
        return this.iff;
    }

    public void fZ(boolean bl) {
        this.iff = bl;
    }

    public eIZ<bgT> dnl() {
        return this.ieU;
    }

    @Override
    public void a(PR pR) {
        super.a(pR);
        this.c("characUpdate", () -> {
            this.dnm();
            this.dnn();
        });
    }

    private void dnm() {
        fhk fhk2 = this.dmL();
        if (fhk2 == null) {
            return;
        }
        Map<ffS, Long> map = fhk2.fUd();
        for (Map.Entry<ffS, Long> entry : map.entrySet()) {
            Optional<ffV> optional = this.dnP().B(entry.getValue());
            optional.ifPresent(ffV::bYg);
        }
    }

    private void dnn() {
        TLongObjectIterator<ffs> tLongObjectIterator = this.ieV.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (ffV ffV2 : (ffs)tLongObjectIterator.value()) {
                ffV2.bYg();
            }
        }
    }

    @Override
    public cPM[] chR() {
        ZH zH = this.dla();
        if (zH != null && zH instanceof bCs) {
            bCs bCs2 = (bCs)zH;
            cRD cRD2 = (cRD)((Object)bCs2.aVD());
            return cRD2.chR();
        }
        return cPM.nip;
    }

    @NotNull
    public bDL dno() {
        return this.ieV;
    }

    @Override
    public eHY dnp() {
        return this.hUQ.PI(this.hUL.fwt().wp());
    }

    @Override
    public eHY CO(int n) {
        return this.hUQ.PI(n);
    }

    @Override
    public void a(Qm qm2, boolean bl) {
        super.a(qm2, bl);
        this.fO(true);
    }

    @Override
    public void ga(boolean bl) {
        super.ga(bl);
        baN.hzt.b(this, bl);
        this.fO(true);
    }

    @Override
    public void dlk() {
        super.dlk();
        fhe fhe2 = this.dnP();
        Optional<ffV> optional = fhe2.B(this.dmL().t(ffS.sgQ));
        Optional<ffV> optional2 = fhe2.B(this.dmL().t(ffS.sgR));
        this.ieQ.a((ffV)optional.orElse(null), (ffV)optional2.orElse(null));
        Optional<ffV> optional3 = fhe2.B(this.dmL().t(ffS.sgZ));
        this.ieQ.bo(optional3.orElse(null));
    }

    public TIntHashSet dnq() {
        return this.ifo;
    }

    @Override
    public void gb(boolean bl) {
        baN.hzt.a(this, bl);
        this.fO(true);
    }

    @Override
    public void dnr() {
        baN.hzt.i(this);
        this.fO(true);
    }

    public TIntHashSet dns() {
        return this.ifn;
    }

    public TIntHashSet dnt() {
        return this.ifp;
    }

    public eHz dnu() {
        return this.ifq;
    }

    @Override
    public fpU dkC() {
        return bbS.a(evA.owx).map(evv2 -> (fpQ)evv2).map(fpQ::dkC).orElse(fpU.sRd);
    }

    public boolean dnv() {
        TLongIterator tLongIterator = fcL.rUh.sx(this.ePP).iterator();
        while (tLongIterator.hasNext()) {
            feH feH2 = (feH)((bgT)fcL.rUh.sw(tLongIterator.next())).a(fez.seq);
            if (feH2.aJG()) continue;
            return true;
        }
        return false;
    }

    public bnv dnw() {
        return this.ifa;
    }

    @Override
    public void a(bnv bnv2) {
        this.ifa = bnv2;
    }

    public bnv dnx() {
        return this.ieZ;
    }

    @Override
    public long dmi() {
        return this.cWp().exS();
    }

    @Override
    public long jw(long l) {
        long l2 = this.ieZ.cWp().exS();
        this.cWp().tt(l);
        return l2 - this.ieZ.cWp().exS();
    }

    @Override
    public long jx(long l) {
        long l2 = this.ieZ.cWp().exS();
        this.cWp().pK(l);
        return l2 - this.ieZ.cWp().exS();
    }

    @Override
    public void h(long l, short s) {
        this.jG(l);
        long l2 = this.dnH().nG(this.dnG() + 1) - this.dlF();
        String string = aUM.cWf().c("infoPop.xpGain", this.getName(), l, l2, aPc.eww, s);
        idG.ap(string);
        super.h(l, s);
    }

    @Override
    public void dkl() {
    }

    @Override
    public void dkm() {
    }

    @Override
    protected void dny() {
        if (this.fhp() != eyH.pka) {
            return;
        }
        this.a(new bhv());
    }

    @Override
    public void a(eTY eTY2) {
        this.dny();
        this.ieQ.edw();
        super.a(eTY2);
        if (this.dnC()) {
            new btW().bGy();
        } else if (eTY2.dGo() == eUw.rva && eTY2.aS(this) == 1 && ((bSG)aIe.cfn().bmH()).a(bSN.ljb)) {
            ckF ckF2 = new ckF();
            ckF2.jm(true);
            aUE.cVJ().etu().d(ckF2);
        }
        aJP.cig().yP(eTY2.d());
        if (!this.ieM) {
            aJP.cig().cij();
        }
    }

    @Override
    public void dkf() {
        bLX bLX2;
        super.dkf();
        eym eym2 = this.dfW();
        if (eym2 == eym.phX && (bLX2 = this.dmN()) != null) {
            bLX2.fmT();
        }
        this.fO(true);
    }

    @Override
    public void a(Rl rl2) {
        super.a(rl2);
        if (this.ifb != null) {
            this.ifb.a(rl2);
        }
    }

    public void dnz() {
        ZH zH = this.dla();
        if (zH != null) {
            this.l(null);
        }
    }

    @Override
    public boolean bvN() {
        boolean bl;
        if (this.djT()) {
            return false;
        }
        amc amc2 = aUm.cUI().fb(ieB);
        boolean bl2 = bl = amc2 != null && fII.gBX().hf(amc2.bCC(), amc2.bCD());
        if (this.ifu == bgv.iax) {
            return !bl;
        }
        return bl;
    }

    @Override
    public int bvM() {
        if (this.djT()) {
            return this.ltt.fhQ();
        }
        switch (this.ifu) {
            case iav: {
                return 0;
            }
            case iaw: {
                return 5;
            }
        }
        return this.ltt.bvM();
    }

    private boolean dnA() {
        if (this.ddI().bvU()) {
            return false;
        }
        if (this.dnv()) {
            cYv.eXZ().eYc();
            return false;
        }
        if (this.dnC()) {
            this.ifm.dIx();
            return false;
        }
        return true;
    }

    @Override
    protected void e(bsJ bsJ2) {
        super.e(bsJ2);
        aKe.cix().a(bsJ2);
        cZm.eZa();
        if (aUE.cVJ().c(cSX.ePi())) {
            if (bsJ2 != null) {
                cSX.ePi().t(bsJ2);
            } else {
                cSX.ePi().dkf();
            }
        }
    }

    public void f(bsJ bsJ2) {
        this.ifl = bsJ2;
        aKe.cix().a(bsJ2);
    }

    public bsJ dnB() {
        return this.ifl;
    }

    public boolean dnC() {
        return this.ifl != null;
    }

    public boolean a(anU anU2, boolean bl, boolean bl2) {
        if (!this.dnA()) {
            return false;
        }
        return this.ddI().a(anU2, bl, bl2);
    }

    public boolean b(aCd aCd2, boolean bl, boolean bl2) {
        if (!this.dnA()) {
            return false;
        }
        return this.ddI().b(aCd2, bl, bl2);
    }

    public boolean c(aCd aCd2, boolean bl, boolean bl2) {
        return this.dnA() && this.ddI().c(aCd2, bl, bl2);
    }

    public boolean b(boolean bl, boolean bl2, List<aCd> list) {
        return this.dnA() && this.ddI().b(bl, bl2, list);
    }

    public boolean b(int n, int n2, short s, boolean bl, boolean bl2) {
        return this.dnA() && this.ddI().b(n, n2, s, bl, bl2);
    }

    public boolean a(anP anP2, boolean bl) {
        return this.dnA() && this.ddI().a(anP2, bl);
    }

    public bKI dcM() {
        return this.ifd;
    }

    @Override
    public String getName() {
        try {
            String string = aUC.cVq().bS("nameForced");
            if (!Strings.isNullOrEmpty((String)string)) {
                return string;
            }
        }
        catch (Fu fu) {
            pfX.debug((Object)"[PROPERTY] Failed to load default name", (Throwable)fu);
        }
        return super.getName();
    }

    @Override
    public void a(fgJ fgJ2, long l2) {
        Object object;
        if (l2 != 0L) {
            object = l2 < 0L ? "kama.loss" : "kama.gain";
            aPd.f((String)object, Math.abs(l2));
        }
        object = fcL.rUh.sx(this.Xi());
        object.forEach(l -> {
            bgT bgT2 = (bgT)fcL.rUh.sw(l);
            fSe.gFu().a((aEF)bgT2, iee);
            fSe.gFu().a((aEF)bgT2, ief);
            return true;
        });
        fSe.gFu().a((aEF)bly.ivl, "companyAwardsList");
    }

    @Override
    public boolean CP(int n) {
        bfT bfT2 = bgd.diV().Cr(n);
        return bfT2 != null;
    }

    @Override
    public boolean dnD() {
        Optional<bfT> optional = bfP.dhT().dhS();
        return optional.map(bfT2 -> this.CP(bfT2.d())).orElse(false);
    }

    @Override
    public long dlF() {
        return this.ifh.dlF();
    }

    @Override
    public short cmL() {
        short s = this.hUL.ewW();
        return s == -1 ? this.dnG() : s;
    }

    @Override
    public short dnE() {
        return this.cmL();
    }

    public boolean dnF() {
        return this.iiK;
    }

    @Override
    public short dnG() {
        return this.ifh.cmL();
    }

    @Override
    public MJ dnH() {
        return this.ifh.dnH();
    }

    @Override
    public float dnI() {
        return this.ifh.dnI();
    }

    @Override
    public ftO jF(long l) {
        return this.ifh.jF(l);
    }

    @Override
    public ftO jG(long l) {
        ftO ftO2 = this.ifh.jG(l);
        this.a(ftO2);
        return ftO2;
    }

    @Override
    void a(ftO ftO2) {
        if (ftO2.gmA()) {
            short s = ftO2.gmw();
            cTy.ePV().ePX();
            Optional<evv> optional = evx.feo().a(this.ePP, evA.owr);
            if (optional.isPresent()) {
                eKd eKd2 = (eKd)optional.get();
                eKd2.Ql(s * 3);
            }
            fSe.gFu().a((aEF)this.iiX, this.iiX.bxk());
            if (this.ltt instanceof eym && !this.djT()) {
                ((eym)this.ltt).fhV().b(this.fgM(), (short)(this.dnG() - s), this.dnG());
                this.fgL();
            }
            short s2 = this.dnG();
            for (bMx bMx2 : this.iiX.dkB()) {
                bMx2.cj(s2);
            }
            fSe.gFu().a((aEF)this.iiX, this.iiX.bxk());
            bfP.dhT().dhV();
        }
        this.dpP();
    }

    @Override
    public ftO bu(short s) {
        ftO ftO2 = this.ifh.bu(s);
        this.a(ftO2);
        return ftO2;
    }

    @Override
    public void gc(boolean bl) {
        this.ieM = bl;
    }

    @Override
    @NotNull
    public frf dnJ() {
        return this.ift;
    }

    @Override
    public eIm dnK() {
        return this.hUL;
    }

    @Override
    public eIj dnL() {
        return this.hUL.PR(0);
    }

    @Override
    @Nullable
    public frd dnM() {
        eIj eIj2 = this.hUL.fwt();
        if (eIj2 == null) {
            return null;
        }
        return this.ift.Zx(eIj2.wp());
    }

    @Override
    public int djx() {
        eIj eIj2 = this.hUL.fwt();
        return eIj2.wp();
    }

    @Override
    public eHZ dnN() {
        return this.hUQ;
    }

    @Override
    public void a(eHZ eHZ2) {
        this.hUQ = eHZ2;
        this.hUQ.a(new eHS(this));
        this.hUQ.fwf();
    }

    @Override
    public fhm dnO() {
        return fhp.sop.aJ(this.ePP, this.aXv);
    }

    @Override
    public fhe dnP() {
        return bGr.jVu.tu(this.aXv);
    }

    public void djf() {
    }

    @Override
    public void a(@NotNull bgv bgv2) {
        this.ifu = bgv2;
    }

    @NotNull
    public bvI dnQ() {
        return this.ife;
    }

    public long dnR() {
        return this.ife.dnR();
    }

    @Override
    public long aZj() {
        return aUE.cVJ().cVO().xl();
    }

    public boolean CQ(int n) {
        return this.dnd().stream().anyMatch(n2 -> n2 == n);
    }

    @Override
    public void CR(int n) {
        super.CR(n);
        fSe.gFu().a((aEF)this, ieo, ieq, iep, ier, ies);
    }

    @Override
    public Collection<ftQ> dnS() {
        return this.ifi.dsY();
    }

    public bkU dnT() {
        return this.ifi;
    }

    @Override
    public void a(int n, fjn fjn2, fkd fkd2, int n2, int n3) {
        Object object;
        String string;
        Object object2;
        super.a(n, fjn2, fkd2, n2, n3);
        fkL fkL2 = this.ffF().emF();
        if (this.bXs && fkL2 != null && n2 < fkL2.ctc() && fjn2.Xt() == n) {
            object2 = aUM.cWf().c("notification.nationRankLostTitle", new Object[0]);
            string = cFH.createLink(aUM.cWf().c("notification.nationRankLostText", aUM.cWf().a(57, (long)((int)fkL2.Sn()), new Object[0])), bIU.kiz);
            object = new dcd((String)object2, string, bIU.kiz, 600132);
            aAW.bUq().h((aAM)object);
        }
        if (this.dkZ() == null) {
            this.dlk();
        }
        object2 = fkf.gcc().WJ(n2);
        if (this.bXs && fkd2 != object2) {
            string = aUM.cWf().c("notification.citizenRankTitle", new Object[0]);
            object = cFH.createLink(aUM.cWf().c("notification.citizenRankText", aUM.cWf().c(object2.clY(), new Object[0])), bIU.kix);
            dcd dcd2 = new dcd(string, (String)object, bIU.kix);
            aAW.bUq().h(dcd2);
        }
        bqM.jbp.b(new bre((fkd)object2, n2));
    }

    @Override
    public void a(bJK bJK2) {
        Object object;
        this.ifk = bJK2;
        if (bJK2 != null && bJK2.doW() != null) {
            object = (bKj)bJY.kmN.ebc();
            ((fpl)object).f((bJr)bJK2.doW());
            fpm.sNJ.b((fpl)object);
            bqM.jbp.b(new brM(bJK2.d()));
        } else {
            dae.cV((short)18865);
            bfP.dhT().a((bfT)null);
            bfP.dhT().dhZ();
            bOC.eht().clear();
            bOD.ehw().clear();
        }
        cuX.mjE.h(this.ifk);
        object = (bRI)this.ffF();
        bRH bRH2 = (bRH)((bRI)object).ell();
        fSe.gFu().a((aEF)bRH2, "currentNationCitizenScore", "nativeNationCitizenScore");
        bIG.dZe();
    }

    public bJK dnU() {
        return this.ifk;
    }

    public void b(bJK bJK2) {
        this.ifk = bJK2;
    }

    @Override
    public void fK(long l) {
        this.ifr = this.aqZ();
        if (bgR.dmo().ay(this)) {
            bgR.dmo().a(this, l);
        }
        bcM.hIK.n(this.aXv, l);
        super.fK(l);
    }

    @Override
    public long dnV() {
        return this.ifr;
    }

    @Override
    public void dlu() {
        super.dlu();
        this.ieQ.edH();
    }

    @Override
    public void CS(int n) {
        this.dpg().CB(n);
    }

    @Override
    public fgJ cWp() {
        return fit.srO.tG(this.ePP);
    }

    public boolean d(ffV ffV2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public ffs e(ffV ffV2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public VX dnW() {
        return bZJ.eqi().ble();
    }

    @Override
    public boolean a(Vf vf) {
        if (vf == Vf.bxK) {
            return this.dnR() != 0L;
        }
        return false;
    }

    @Override
    public long b(Vf vf) {
        if (vf == Vf.bxK) {
            return this.ife.dnR();
        }
        return 0L;
    }

    @Override
    public boolean bko() {
        return this.ife.dnR() != 0L || this.Ya() > 0L;
    }

    @Override
    public boolean Q(aCd aCd2) {
        boolean bl = super.Q(aCd2);
        this.dlH();
        return bl;
    }

    public bRj dnX() {
        return this.ieR;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ieQ.aZp();
        if (this.ieZ != null) {
            this.ieZ.aZp();
            this.ieZ = null;
        }
        bNB.kDS.b(this.dlc());
        this.ifb = null;
    }

    @Override
    public void a(PV pV, PX pX) {
        if (pV == null) {
            return;
        }
        super.a(pV, pX);
        if (pV.aZd() == 0) {
            switch ((ezJ)pV) {
                case ptr: {
                    fSe.gFu().f("chat.enable.interactions", !this.i(ezJ.ptr));
                    aPt.cAg().cAy();
                    break;
                }
                case pug: {
                    fSe.gFu().f("aptitude.enable.interactions", !this.i(ezJ.pug));
                    break;
                }
                case puh: {
                    fSe.gFu().f("fighter.enable.interactions", !this.i(ezJ.puh));
                    break;
                }
                case puj: {
                    fSe.gFu().f("inventory.enable.interactions", !this.i(ezJ.puj));
                    break;
                }
                case puk: {
                    fSe.gFu().f("quests.enable.interactions", !this.i(ezJ.puk));
                    break;
                }
                case pul: {
                    fSe.gFu().f("spells.enable.interactions", !this.i(ezJ.pul));
                    break;
                }
                case pum: {
                    fSe.gFu().f("character.sheet.enable.interactions", !this.i(ezJ.pum));
                    break;
                }
                case pts: {
                    fSe.gFu().f("followed.achievements.enable.interactions", !this.i(ezJ.pts));
                    cZm.eZa();
                    break;
                }
                case ptw: {
                    fSe.gFu().f("callHelpDisabled", this.a(pV));
                    break;
                }
                case ptx: {
                    fSe.gFu().f("lockFightDisabled", this.a(pV));
                    break;
                }
                case pty: {
                    fSe.gFu().f("cellReportDisabled", this.a(pV));
                    break;
                }
                case ptz: {
                    fSe.gFu().f("hideFightersDisabled", this.a(pV));
                    break;
                }
                case ptA: {
                    fSe.gFu().f("giveUpDisabled", this.a(pV));
                }
            }
        }
    }

    @Override
    public void a(eID eID2) {
        super.a(eID2);
        fSe.gFu().f("hasOccupation", true);
        boolean bl = fug.fP(this.fhv());
        if (bl && cVu.eQx()) {
            cVu.eTO().eTV();
        }
        fSe.gFu().f("inventory.occupation.allows.interaction", !bl);
    }

    @Override
    public boolean dnY() {
        return this.gd(true);
    }

    @Override
    public boolean gd(boolean bl) {
        if (super.gd(bl)) {
            fSe.gFu().f("hasOccupation", false);
            fSe.gFu().f("inventory.occupation.allows.interaction", true);
            if (cVu.eQx()) {
                cVu.eTO().eTU();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean i(boolean bl, boolean bl2) {
        if (super.i(bl, bl2)) {
            fSe.gFu().f("hasOccupation", false);
            fSe.gFu().f("inventory.occupation.allows.interaction", true);
            return true;
        }
        return false;
    }

    public bmw dnZ() {
        return baJ.hzf.iM(this.Xi());
    }

    @Override
    public Optional<fte> doa() {
        return Optional.of(caN.lHv);
    }

    public void bv(short s) {
        this.cLw = s;
    }

    @Override
    public short bEr() {
        return this.cLw;
    }

    @Override
    public /* synthetic */ ezN dob() {
        return this.dmN();
    }

    @Override
    public /* synthetic */ eRS doc() {
        return this.dmz();
    }

    @Override
    @NotNull
    public /* synthetic */ fft dod() {
        return this.dno();
    }

    @Override
    public /* synthetic */ QE baz() {
        return this.dmz();
    }

    @Override
    public /* synthetic */ void b(afW afW2, VX vX, VX vX2) {
        this.a((adS)afW2, (bZE)vX, (bZE)vX2);
    }

    static /* synthetic */ Logger aGh() {
        return pfX;
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

    static /* synthetic */ long l(bgT bgT2) {
        return bgT2.ePP;
    }

    static /* synthetic */ Logger dof() {
        return pfX;
    }

    static /* synthetic */ long m(bgT bgT2) {
        return bgT2.aXv;
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

    static /* synthetic */ long n(bgT bgT2) {
        return bgT2.aXv;
    }

    static /* synthetic */ Logger doj() {
        return pfX;
    }

    static /* synthetic */ long o(bgT bgT2) {
        return bgT2.aXv;
    }

    static /* synthetic */ long p(bgT bgT2) {
        return bgT2.aXv;
    }

    static /* synthetic */ Collection q(bgT bgT2) {
        return bgT2.pga;
    }

    static /* synthetic */ Logger dok() {
        return pfX;
    }

    static /* synthetic */ Logger dol() {
        return pfX;
    }

    static /* synthetic */ Logger dom() {
        return pfX;
    }

    static /* synthetic */ Logger don() {
        return pfX;
    }

    static /* synthetic */ Logger doo() {
        return pfX;
    }

    static /* synthetic */ Logger dop() {
        return pfX;
    }

    static /* synthetic */ Logger doq() {
        return pfX;
    }

    static /* synthetic */ Logger dor() {
        return pfX;
    }

    static /* synthetic */ Logger dos() {
        return pfX;
    }

    static /* synthetic */ Logger dot() {
        return pfX;
    }

    static /* synthetic */ long r(bgT bgT2) {
        return bgT2.ePP;
    }

    static /* synthetic */ Logger dou() {
        return pfX;
    }

    static {
        System.arraycopy(ieJ, 0, ieK, 0, ieJ.length);
        System.arraycopy(iiF, 0, ieK, ieJ.length, bhJ.iiF.length);
        ieL = new String[]{iex, idJ, idK, idL, idM, idN, idO, idP, idQ, idR, idS, idT, idU, idV, idW, idX, idY, idZ, iea, ieb, iec, "actorEquipment"};
    }
}

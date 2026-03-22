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

/*
 * Renamed from bgT
 */
public class bgt_0
extends bhJ
implements pu_0,
Vg,
afp<ads_0, bze_2>,
bvg_0,
eIt,
emj_0,
ezi_0<blx_1>,
ffh,
fgK,
fgv,
fic_0,
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
    private final HashMap<bmx_0, Short> ieN = new HashMap();
    private final HashMap<ffV, Short> ieO = new HashMap();
    bhw ieP;
    final blh_2 ieQ = new blh_2();
    final bRj ieR = new bRj();
    final fqk_0 ieS = new fqk_0();
    final fey ieT = new fey();
    private final eiz_0<bgt_0> ieU;
    final bdl_0 ieV = new bdl_0();
    private boolean ieW = true;
    protected boolean ieX = false;
    private final bdx_0 ieY;
    bnv_2 ieZ;
    private bnv_2 ifa;
    private bgp_0 ifb;
    private boolean ifc = false;
    private final bKI ifd = new bKI();
    @NotNull
    private final bvi_0 ife = new bvi_0(this);
    private boolean iff = true;
    private final bml_1 ifg = new bml_1(this);
    final ftF ifh = new ftG(false);
    private final bku_0 ifi = new bku_0();
    fia_0 ifj = null;
    private bJK ifk;
    private bsj_0 ifl;
    private final btx_0 ifm = new btx_0();
    TIntHashSet ifn;
    TIntHashSet ifo;
    TIntHashSet ifp;
    final ehz_0 ifq = new ehz_0();
    private long ifr;
    private boolean ifs = false;
    private final frf ift = new frf();
    private eHZ hUQ = new eHZ();
    @NotNull
    eIm hUL = new eIm();
    @NotNull
    private bgv_0 ifu = bgv_0.iav;
    private final bfI ifv = new bfI(this);

    public bml_1 dmz() {
        return this.ifg;
    }

    public bgt_0(boolean bl) {
        this.ieM = bl;
        ((exh_1)this.fgM()).a(this);
        this.ieT.b(fez_0.sep);
        this.ieT.b(fez_0.seq);
        feh_0 feh_02 = (feh_0)this.ieT.a(fez_0.seq);
        this.ieY = new bdx_0(feh_02, this);
        feh_02.a(this.ieY);
        this.ieU = new eiz_0<bgt_0>(this);
        this.ifd.hU(true);
        this.bXs = false;
        this.ifi.a(() -> fse_1.gFu().a((aef_2)this, "states"));
        bNB.kDS.a(this.dlc());
        this.hUQ.a(new eHS(this));
        if (!bl) {
            fse_1.gFu().f("inventory.occupation.allows.interaction", true);
        }
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_1.ljS);
        this.ifu = bgv_0.CE(n);
    }

    private void dmA() {
        this.ifv.bkZ();
    }

    @Override
    protected evd_2 dmB() {
        evd_2 evd_22 = new evd_2();
        evd_22.a(new bit(this));
        return evd_22;
    }

    @Override
    protected bjn_1 dmC() {
        return new bjo_1();
    }

    @Override
    public boolean bvY() {
        return true;
    }

    @Override
    public fia_0 dmD() {
        return this.ifj;
    }

    @Override
    public emi_0<bgt_0> dmE() {
        return this.ifv;
    }

    @Override
    public void dC(long l) {
        super.dC(l);
        this.ieQ.dC(l);
        bve_0.dKK().a(l, this);
    }

    public void dmF() {
        bve_0.dKK().b(this.aXv, this);
    }

    @Override
    public void aPg() {
        this.ifg.a(this.dlc());
        this.ddI().bA(((bsg_1)aie_0.cfn().bmH()).a(bsn_1.liL));
        this.CI(-1);
        int n = this.e(exx_2.rGi).aYC();
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
        bcd_2 bcd_22 = bbw_2.hCq.je(this.Sn());
        bcd_22.daE().b(bcd_22);
        this.ieV.E(this);
    }

    private void dmG() {
        if (this.iiT != null) {
            ers_0.a(this.iiT, this.pgf, this);
            this.iiT = null;
        }
    }

    private void dmH() {
        if (this.ltt == eym.phX && this.dmN() == null) {
            this.ieP = new bhw(this);
            this.a(new blx_1(this.aXv));
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
        new bhj_0(this, this.iiG.fkZ());
        new bhg(this, this.iiG.fla());
        new bhi(this, this.iiG.fle());
        new bhl_0(this, this.iiG.flg());
        new bgW(this, this.iiG.fkP());
        new bhf(this, this.iiG.flE());
        new bhm(this, this.iiG.fkX());
        new bhd_0(this, this.iiG.flq());
        new bhh(this, this.iiG.flB());
        new bho_0(this, this.iiG.flC());
        new bgy_0(this, this.iiG.flG());
        new bhn_0(this, this.iiG.flx());
        new bhk(this, this.iiG.flI());
        new bhe_0(this, this.iiG.fiE());
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

    public void m(qu_0 qu_02) {
        for (exx_2 exx_22 : exx_2.values()) {
            if (exx_22.isExpandable()) {
                qu_02.b(exx_22).ot(this.ltt.k(exx_22));
                continue;
            }
            qu_02.b(exx_22).op(this.ltt.k(exx_22));
        }
        qu_02.b(exx_2.rGj).aYO();
        qu_02.b(exx_2.rGk).aYO();
        qu_02.b(exx_2.rGs).aYO();
        pr_0 pr_02 = qu_02.b(exx_2.rGl);
        pr_02.aYO();
        exv_2.a(qu_02.b(exx_2.rHH), pr_02);
        this.fgL();
    }

    @Override
    protected void dmK() {
        fse_1.gFu().a((aef_2)this, iej, iek, iel, ien, iem);
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
                    eIj2.setName(aum_0.cWf().c("build.permanent.default.name", new Object[0]));
                    continue;
                }
                eIj2.setName(aum_0.cWf().c("build.permanent.name", eIj2.tL()));
                continue;
            }
            eIj2.setName(cvu_2.Nh(eIj2.tL()));
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
        int n = bjf_1.f(ffV2);
        return this.a(ffS2).orElse(n);
    }

    private Optional<Integer> a(ffS ffS2) {
        fb_2 fb_22 = ekj_0.a(this.Xi(), this.Sn(), ffS2);
        if (fb_22.AK() == 0) {
            return Optional.empty();
        }
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(fb_22.AK());
        if (bgv_22 != null && bgv_22.fYr() != null) {
            return Optional.of(fb_22.AK());
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

    public blx_1 dmN() {
        if (this.ieP != null) {
            return this.ieP.dmN();
        }
        return null;
    }

    @Override
    public void a(blx_1 blx_12) {
        if (this.ieP == null) {
            this.ieP = new bhw(this);
        }
        this.ieP.a(blx_12);
        blx_12.a(this);
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
            cvo_2.ky(this.ieW);
        }
    }

    public void a(ffV ffV2, short s, short s2, long l, long l2) {
        if (!this.ieW) {
            return;
        }
        if (bdq_0.dRC().ab(ffV2)) {
            return;
        }
        this.a(ffV2, s, l, l2, s2);
        cvo_2.eUK().eUQ();
        fbj_1.getInstance().gtx();
    }

    private void a(ffV ffV2, short s, long l, long l2, short s2) {
        Object object;
        if (s == 0) {
            return;
        }
        int n = 1;
        long l3 = 0L;
        long l4 = ffV2.LV();
        ffs_0 ffs_02 = this.ieV.sY(l);
        ffs_0 ffs_03 = fcI.ap(this.ePP, l2);
        if (ffs_03 == null) {
            return;
        }
        if (ffV2.bfd() > s && s != -1) {
            object = ffV2.fVT();
            try {
                l3 = ((ffV)object).LV();
                n = fdY.fUs().a(ffs_02.fVb(), ffs_03.fVb(), s2, ffV2, s, (ffV)object, this, this.fgg());
            }
            catch (Exception exception) {
                pfX.error((Object)"Exception survenue durant le transfert de bag ? bag (avec split) : ", (Throwable)exception);
            }
        } else {
            try {
                n = fdY.fUs().a(ffs_02.fVb(), ffs_03.fVb(), s2, ffV2, s, null, this, this.fgg());
            }
            catch (Exception exception) {
                pfX.error((Object)"Exception survenue durant le transfert de bag ? bag (sans split) : ", (Throwable)exception);
            }
        }
        if (n == 0) {
            object = new clp_0();
            ((cll_0)object).nl(l2);
            ((cll_0)object).nn(l);
            ((clp_0)object).setDestinationPosition(s2);
            ((cll_0)object).nk(l4);
            ((cll_0)object).nm(l3);
            ((clp_0)object).ak(s);
            aue_0.cVJ().etu().d(object);
        }
    }

    @Override
    public ern_0 dmQ() {
        return this.pgf;
    }

    public void dmR() {
        this.ieN.clear();
    }

    @Override
    public void a(bmx_0 bmx_02) {
        Short s = this.ieN.get(bmx_02);
        if (s == null) {
            s = 0;
        }
        s = (short)(s + 1);
        this.ieN.put(bmx_02, s);
    }

    public ArrayList<azx_1<bmx_0, Short>> dmS() {
        ArrayList<azx_1<bmx_0, Short>> arrayList = new ArrayList<azx_1<bmx_0, Short>>();
        for (bmx_0 bmx_02 : this.ieN.keySet()) {
            Short s = this.ieN.get(bmx_02);
            if (s == null) continue;
            arrayList.add(new azx_1<bmx_0, Short>(bmx_02, s));
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

    public ArrayList<azx_1<ffV, Short>> dmU() {
        ArrayList<azx_1<ffV, Short>> arrayList = new ArrayList<azx_1<ffV, Short>>();
        for (ffV ffV2 : this.ieO.keySet()) {
            Short s = this.ieO.get(ffV2);
            if (s == null) continue;
            arrayList.add(new azx_1<ffV, Short>(ffV2, s));
        }
        return arrayList;
    }

    public final void jD(long l) {
        boolean bl = ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb);
        ckt ckt2 = new ckt(l, bl);
        aue_0.cVJ().etu().d(ckt2);
    }

    private bgy aD(bgy bgy2) {
        bsi_0 bsi_02 = bgy2.dkW();
        byte by = bsi_02.kp(bgy2.Sn());
        Collection<bgy> collection = bsi_02.bK(by);
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
        if (((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb)) {
            cko2.evv();
        }
        aue_0.cVJ().etu().d(cko2);
    }

    public void CM(int n) {
        aue_0.cVJ().etu().d(new cny(n));
    }

    public void a(ads_0 ads_02, bze_2 bze_22, bze_2 bze_23) {
        bqm_0.jbp.b(new bqi_0(bze_22, bze_23));
        bJK bJK2 = bJJ.kmp.dO(bze_23.getX(), bze_23.getY());
        if (bJK2 != this.ifk) {
            try {
                this.a(bJK2);
            }
            catch (Exception exception) {
                pfX.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public bsj_0 dmV() {
        if (this.dkZ() != null) {
            return this.dkZ();
        }
        return this.ifl;
    }

    public int dmW() {
        bsj_0 bsj_02 = this.dmV();
        return bsj_02 == null ? -1 : bsj_02.d();
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
        fec_0 fec_02 = (fec_0)this.a(fez_0.sep);
        ffm ffm2 = fec_02.UB(n);
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
            fec_0 fec_02;
            ffm ffm2;
            Map.Entry<Integer, Bu<Short, Short>> entry = iterator.next();
            int n3 = entry.getKey();
            int n4 = this.ieV.Gn(n3);
            if (n4 == 0 && (ffm2 = (fec_02 = (fec_0)this.a(fez_0.sep)).UB(n3)) != null) {
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
    public <T extends fff> T a(fez_0 fez_02) {
        return this.ieT.a(fez_02);
    }

    @Override
    public void b(int n, eyc eyc2) {
        super.b(n, eyc2);
        this.ieQ.edg();
    }

    @Override
    protected void a(int n, eyc eyc2) {
        super.a(n, eyc2);
        blo_2 blo_22 = this.ieQ.edf();
        if (blo_22 != null) {
            blo_22.bK(this);
            blo_22.edQ();
        }
        this.ieQ.edg();
    }

    @Override
    public void dkM() {
        super.dkM();
        bMV.a(this.dnM(), this.dkB(), this.dlG());
        blo_2 blo_22 = this.ieQ.edf();
        if (blo_22 != null) {
            blo_22.aZp();
            blo_22.ecU();
        }
        this.ieQ.edh();
    }

    @Override
    public void a(awk_1 awk_12, String string) {
        if (awk_12 != null) {
            fse_1.gFu().a((aef_2)this, ieu);
        } else {
            pfX.warn((Object)string);
        }
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "formatedKamas": {
                return aum_0.cWf().cQ(this.cWp().exS());
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
                return bve_0.dKK().kM(this.Sn());
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
                bmw_1 bmw_12 = this.dnZ();
                return bmw_12.aJG() ? null : bmw_12;
            }
            case "temporaryTransferInventory": {
                return this.ieY;
            }
            case "currentLevelPercentage": {
                if (this.dnG() >= ewo_0.oBF.i(ewr_0.oCk)) {
                    return 1;
                }
                return Float.valueOf(this.dnI());
            }
            case "currentLevelPercentageInText": {
                return String.format("(%s %%)", GC.B(this.dnI() * 100.0f));
            }
            case "isReachedMaxLvl": {
                return this.dnG() >= ewo_0.oBF.i(ewr_0.oCk);
            }
            case "xpRatio": {
                if (this.dnG() >= ewo_0.oBF.i(ewr_0.oCk)) {
                    return aum_0.cWf().c("maxLevel", new Object[0]);
                }
                return aum_0.cWf().c(iel, aum_0.cWf().cQ(this.dnH().cT(this.dlF())), aum_0.cWf().cQ(this.dnH().N(this.dnG())));
            }
            case "currentExperience": {
                if (this.dnG() >= ewo_0.oBF.i(ewr_0.oCk)) {
                    return aum_0.cWf().c("maxLevel", new Object[0]);
                }
                return this.dnH().cT(this.dlF());
            }
            case "xpToNextLevel": {
                return "/ " + aum_0.cWf().cQ(this.dnH().N(this.dnG()));
            }
            case "wakfuGauge": {
                return Float.valueOf(this.dmm() > 0.0f ? this.dmm() : 0.0f);
            }
            case "stasisGauge": {
                return Float.valueOf(this.dmm() < 0.0f ? -this.dmm() : 0.0f);
            }
            case "wakfuGaugePopupText": {
                float f2 = this.dmm() * 100.0f;
                String string2 = Math.abs((int)f2) + "% ";
                ahv_2 ahv_22 = new ahv_2();
                ahv_22.c(aum_0.cWf().c("wakfu.gaugePopup", new Object[0]));
                if (f2 > 0.0f) {
                    ahv_22.c("\n").ih("28d2c4").c(string2).c(aum_0.cWf().c("WAKFU", new Object[0])).ceD();
                } else if (f2 < 0.0f) {
                    ahv_22.c("\n").ih("ab00ff").c(string2).c(aum_0.cWf().c("STASIS", new Object[0])).ceD();
                } else {
                    return null;
                }
                return ahv_22.ceL();
            }
            case "wakfuGaugeColor": {
                float f3 = this.dmm();
                float f4 = Math.abs(f3);
                float[] fArray = f3 < 0.0f ? aid_0.dUC : aid_0.dUB;
                return GC.a(1.0f, fArray[0], f4) + "," + GC.a(1.0f, fArray[1], f4) + "," + GC.a(1.0f, fArray[2], f4);
            }
            case "wakfuGaugeIconStyle": {
                float f5 = this.dmm();
                return f5 < 0.0f ? "StasisIcon" : (f5 > 0.0f ? "wakfuIcon" : "");
            }
            case "nation": {
                return ((bri_2)this.ffF()).ell();
            }
            case "isInSubscriberZone": {
                return evg_1.osQ.a(new eve_2[]{this});
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
        evt_1 evt_12 = evt_1.Oq(aue_0.cVJ().cVO().arF());
        if (this.dnG() == Collections.max(bgt_0.jE(aue_0.cVJ().cVO().xl())).shortValue()) {
            return aum_0.cWf().c("rerollXp.info.onlyLowerLevelCharacters", new Object[0]);
        }
        if (evt_12.b(evv_1.oxl)) {
            return aum_0.cWf().c("rerollXp.info.hasRight", new Object[0]);
        }
        return aum_0.cWf().c("rerollXp.info.notRight", Float.valueOf(this.fX(true)));
    }

    private boolean dna() {
        evt_1 evt_12 = evt_1.Oq(aue_0.cVJ().cVO().arF());
        return evt_12.b(evv_1.oxl);
    }

    private String dnb() {
        return aum_0.cWf().c("rerollXp.factor", Float.valueOf(this.dnc()));
    }

    public float dnc() {
        return this.fX(this.dna());
    }

    private float fX(boolean bl) {
        long l = aue_0.cVJ().cVO().xl();
        ArrayList<Short> arrayList = bgt_0.jE(l);
        return ftD.a(this.dnG(), arrayList, bl);
    }

    @NotNull
    private static ArrayList<Short> jE(long l) {
        ArrayList<Short> arrayList = new ArrayList<Short>();
        fcL.rUh.a(l, new bgu_0(arrayList));
        return arrayList;
    }

    private @Unmodifiable List<Integer> dnd() {
        return bjf_1.b(fm_1.pA);
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

    public bli_1[] dnf() {
        int n = this.ife.dKL() != null ? this.ife.dKL().fPF() + 1 : 1;
        bli_1[] bli_1Array = new bli_1[n];
        bli_1Array[0] = new blh_1(this.Sn(), this.getName(), this.aWP(), this.aWO());
        if (!this.ife.dfG()) {
            return bli_1Array;
        }
        TLongObjectHashMap<exz_1> tLongObjectHashMap = this.ife.dKL().fPG();
        int n2 = 1;
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            exz_1 exz_12 = (exz_1)tLongObjectIterator.value();
            if (!(exz_12 instanceof exy_1)) continue;
            eJS eJS2 = ((exy_1)exz_12).fPk();
            long l = aue_0.cVJ().cVO().xl();
            if (eJN.qAF.O(l, eJS2.Sn()) == null) continue;
            bli_1Array[n2++] = new blt_0(eJS2);
        }
        return bli_1Array;
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
                        short s = ((bmq_0)qD.bbf()).gjy();
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
    public fqw_0 a(fqt_0 fqt_02, byte by) {
        blg_2 blg_22 = null;
        try {
            blg_22 = this.ieQ.c(fqt_02, by);
            return blg_22.edd();
        }
        catch (Exception exception) {
            pfX.error((Object)("Exception while trying to het shortcutbar " + String.valueOf((Object)fqt_02) + " / " + by), (Throwable)exception);
            return null;
        }
    }

    @Override
    public fqr_0 a(byte by, short s, fqE fqE2) {
        blg_2 blg_22 = this.ieQ.c(fqt_0.sTd, by);
        if (blg_22 == null) {
            return null;
        }
        blb_2 blb_22 = blb_2.a(fqu_0.sTq, fqE2.LV(), fqE2.avr(), fqE2.aVt());
        blg_22.a(blb_22, s == -1 ? blg_22.beO() : s);
        blg_22.ecY();
        if (this.ieQ == cxx_2.eXH().dlG()) {
            cxx_2.eXH().ek(by);
        }
        return blb_22;
    }

    @Override
    public void a(byte by, short s, fqr_0 fqr_02) {
        blg_2 blg_22 = this.ieQ.c(fqt_0.sTd, by);
        if (blg_22 == null) {
            return;
        }
        if (fqr_02 == null) {
            blg_22.a(s, true);
        } else {
            blg_22.c((blb_2)fqr_02);
        }
        blg_22.ecY();
        if (this.ieQ == cxx_2.eXH().dlG() && blg_22.aJG()) {
            cxx_2.eXH().r(by, true);
        }
    }

    @Override
    @NotNull
    public blh_2 dlG() {
        return this.ieQ;
    }

    public fqk_0 dng() {
        return this.ieS;
    }

    @Override
    public void f(zk_2 zk_22) {
    }

    @Override
    public void dnh() {
        this.a(bsn_1.ljS);
        super.dnh();
        fse_1.gFu().a((aef_2)this, ieH);
    }

    @Override
    public void dni() {
        if (this.ijc == null) {
            cdv_0.W(this);
        }
        this.a(bsn_1.ljT);
        super.dni();
    }

    @Override
    private void a(bsn_1 bsn_12) {
        int n = ((bsg_1)aie_0.cfn().bmH()).d(bsn_12);
        this.ifu = bgv_0.CE(n);
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

    public eiz_0<bgt_0> dnl() {
        return this.ieU;
    }

    @Override
    public void a(pr_0 pr_02) {
        super.a(pr_02);
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
        TLongObjectIterator<ffs_0> tLongObjectIterator = this.ieV.fVg();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            for (ffV ffV2 : (ffs_0)tLongObjectIterator.value()) {
                ffV2.bYg();
            }
        }
    }

    @Override
    public cpm_1[] chR() {
        ZH zH = this.dla();
        if (zH != null && zH instanceof bcs_0) {
            bcs_0 bcs_02 = (bcs_0)zH;
            crd_1 crd_12 = (crd_1)((Object)bcs_02.aVD());
            return crd_12.chR();
        }
        return cpm_1.nip;
    }

    @NotNull
    public bdl_0 dno() {
        return this.ieV;
    }

    @Override
    public ehy_0 dnp() {
        return this.hUQ.PI(this.hUL.fwt().wp());
    }

    @Override
    public ehy_0 CO(int n) {
        return this.hUQ.PI(n);
    }

    @Override
    public void a(qm_0 qm_02, boolean bl) {
        super.a(qm_02, bl);
        this.fO(true);
    }

    @Override
    public void ga(boolean bl) {
        super.ga(bl);
        ban_2.hzt.b(this, bl);
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
        ban_2.hzt.a(this, bl);
        this.fO(true);
    }

    @Override
    public void dnr() {
        ban_2.hzt.i(this);
        this.fO(true);
    }

    public TIntHashSet dns() {
        return this.ifn;
    }

    public TIntHashSet dnt() {
        return this.ifp;
    }

    public ehz_0 dnu() {
        return this.ifq;
    }

    @Override
    public fpu_0 dkC() {
        return bbs_2.a(eva_1.owx).map(evv_22 -> (fpQ)evv_22).map(fpQ::dkC).orElse(fpu_0.sRd);
    }

    public boolean dnv() {
        TLongIterator tLongIterator = fcL.rUh.sx(this.ePP).iterator();
        while (tLongIterator.hasNext()) {
            feh_0 feh_02 = (feh_0)((bgt_0)fcL.rUh.sw(tLongIterator.next())).a(fez_0.seq);
            if (feh_02.aJG()) continue;
            return true;
        }
        return false;
    }

    public bnv_2 dnw() {
        return this.ifa;
    }

    @Override
    public void a(bnv_2 bnv_22) {
        this.ifa = bnv_22;
    }

    public bnv_2 dnx() {
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
        String string = aum_0.cWf().c("infoPop.xpGain", this.getName(), l, l2, aPc.eww, s);
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
        if (this.fhp() != eyh_0.pka) {
            return;
        }
        this.a(new bhv_0());
    }

    @Override
    public void a(ety_0 ety_02) {
        this.dny();
        this.ieQ.edw();
        super.a(ety_02);
        if (this.dnC()) {
            new btw_0().bGy();
        } else if (ety_02.dGo() == eUw.rva && ety_02.aS(this) == 1 && ((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljb)) {
            ckF ckF2 = new ckF();
            ckF2.jm(true);
            aue_0.cVJ().etu().d(ckF2);
        }
        aJP.cig().yP(ety_02.d());
        if (!this.ieM) {
            aJP.cig().cij();
        }
    }

    @Override
    public void dkf() {
        blx_1 blx_12;
        super.dkf();
        eym eym2 = this.dfW();
        if (eym2 == eym.phX && (blx_12 = this.dmN()) != null) {
            blx_12.fmT();
        }
        this.fO(true);
    }

    @Override
    public void a(rl_0 rl_02) {
        super.a(rl_02);
        if (this.ifb != null) {
            this.ifb.a(rl_02);
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
        amc_1 amc_12 = aUm.cUI().fb(ieB);
        boolean bl2 = bl = amc_12 != null && fii_2.gBX().hf(amc_12.bCC(), amc_12.bCD());
        if (this.ifu == bgv_0.iax) {
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
            cyv_2.eXZ().eYc();
            return false;
        }
        if (this.dnC()) {
            this.ifm.dIx();
            return false;
        }
        return true;
    }

    @Override
    protected void e(bsj_0 bsj_02) {
        super.e(bsj_02);
        aKe.cix().a(bsj_02);
        czm_2.eZa();
        if (aue_0.cVJ().c(csx_1.ePi())) {
            if (bsj_02 != null) {
                csx_1.ePi().t(bsj_02);
            } else {
                csx_1.ePi().dkf();
            }
        }
    }

    public void f(bsj_0 bsj_02) {
        this.ifl = bsj_02;
        aKe.cix().a(bsj_02);
    }

    public bsj_0 dnB() {
        return this.ifl;
    }

    public boolean dnC() {
        return this.ifl != null;
    }

    public boolean a(anu_1 anu_12, boolean bl, boolean bl2) {
        if (!this.dnA()) {
            return false;
        }
        return this.ddI().a(anu_12, bl, bl2);
    }

    public boolean b(acd_1 acd_12, boolean bl, boolean bl2) {
        if (!this.dnA()) {
            return false;
        }
        return this.ddI().b(acd_12, bl, bl2);
    }

    public boolean c(acd_1 acd_12, boolean bl, boolean bl2) {
        return this.dnA() && this.ddI().c(acd_12, bl, bl2);
    }

    public boolean b(boolean bl, boolean bl2, List<acd_1> list) {
        return this.dnA() && this.ddI().b(bl, bl2, list);
    }

    public boolean b(int n, int n2, short s, boolean bl, boolean bl2) {
        return this.dnA() && this.ddI().b(n, n2, s, bl, bl2);
    }

    public boolean a(anp_2 anp_22, boolean bl) {
        return this.dnA() && this.ddI().a(anp_22, bl);
    }

    public bKI dcM() {
        return this.ifd;
    }

    @Override
    public String getName() {
        try {
            String string = auc_0.cVq().bS("nameForced");
            if (!Strings.isNullOrEmpty((String)string)) {
                return string;
            }
        }
        catch (fu_0 fu_02) {
            pfX.debug((Object)"[PROPERTY] Failed to load default name", (Throwable)fu_02);
        }
        return super.getName();
    }

    @Override
    public void a(fgj_0 fgj_02, long l2) {
        Object object;
        if (l2 != 0L) {
            object = l2 < 0L ? "kama.loss" : "kama.gain";
            aPd.f((String)object, Math.abs(l2));
        }
        object = fcL.rUh.sx(this.Xi());
        object.forEach(l -> {
            bgt_0 bgt_02 = (bgt_0)fcL.rUh.sw(l);
            fse_1.gFu().a((aef_2)bgt_02, iee);
            fse_1.gFu().a((aef_2)bgt_02, ief);
            return true;
        });
        fse_1.gFu().a((aef_2)bly_0.ivl, "companyAwardsList");
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
    public mj_1 dnH() {
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
            cty_1.ePV().ePX();
            Optional<evv_2> optional = evx_2.feo().a(this.ePP, eva_1.owr);
            if (optional.isPresent()) {
                eKd eKd2 = (eKd)optional.get();
                eKd2.Ql(s * 3);
            }
            fse_1.gFu().a((aef_2)this.iiX, this.iiX.bxk());
            if (this.ltt instanceof eym && !this.djT()) {
                ((eym)this.ltt).fhV().b(this.fgM(), (short)(this.dnG() - s), this.dnG());
                this.fgL();
            }
            short s2 = this.dnG();
            for (bmx_0 bmx_02 : this.iiX.dkB()) {
                bmx_02.cj(s2);
            }
            fse_1.gFu().a((aef_2)this.iiX, this.iiX.bxk());
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
        return bgr_1.jVu.tu(this.aXv);
    }

    public void djf() {
    }

    @Override
    public void a(@NotNull bgv_0 bgv_02) {
        this.ifu = bgv_02;
    }

    @NotNull
    public bvi_0 dnQ() {
        return this.ife;
    }

    public long dnR() {
        return this.ife.dnR();
    }

    @Override
    public long aZj() {
        return aue_0.cVJ().cVO().xl();
    }

    public boolean CQ(int n) {
        return this.dnd().stream().anyMatch(n2 -> n2 == n);
    }

    @Override
    public void CR(int n) {
        super.CR(n);
        fse_1.gFu().a((aef_2)this, ieo, ieq, iep, ier, ies);
    }

    @Override
    public Collection<ftQ> dnS() {
        return this.ifi.dsY();
    }

    public bku_0 dnT() {
        return this.ifi;
    }

    @Override
    public void a(int n, fjn_0 fjn_02, fkd_0 fkd_02, int n2, int n3) {
        Object object;
        String string;
        Object object2;
        super.a(n, fjn_02, fkd_02, n2, n3);
        fkL fkL2 = this.ffF().emF();
        if (this.bXs && fkL2 != null && n2 < fkL2.ctc() && fjn_02.Xt() == n) {
            object2 = aum_0.cWf().c("notification.nationRankLostTitle", new Object[0]);
            string = cfh_2.createLink(aum_0.cWf().c("notification.nationRankLostText", aum_0.cWf().a(57, (long)((int)fkL2.Sn()), new Object[0])), biu_1.kiz);
            object = new dcd((String)object2, string, biu_1.kiz, 600132);
            aaw_1.bUq().h((aam_2)object);
        }
        if (this.dkZ() == null) {
            this.dlk();
        }
        object2 = fkf_0.gcc().WJ(n2);
        if (this.bXs && fkd_02 != object2) {
            string = aum_0.cWf().c("notification.citizenRankTitle", new Object[0]);
            object = cfh_2.createLink(aum_0.cWf().c("notification.citizenRankText", aum_0.cWf().c(object2.clY(), new Object[0])), biu_1.kix);
            dcd dcd2 = new dcd(string, (String)object, biu_1.kix);
            aaw_1.bUq().h(dcd2);
        }
        bqm_0.jbp.b(new bre_0((fkd_0)object2, n2));
    }

    @Override
    public void a(bJK bJK2) {
        Object object;
        this.ifk = bJK2;
        if (bJK2 != null && bJK2.doW() != null) {
            object = (bkj_0)bjy_0.kmN.ebc();
            ((fpl)object).f((bJr)bJK2.doW());
            fpm.sNJ.b((fpl)object);
            bqm_0.jbp.b(new brm_0(bJK2.d()));
        } else {
            dae_0.cV((short)18865);
            bfP.dhT().a((bfT)null);
            bfP.dhT().dhZ();
            boc_2.eht().clear();
            bod_1.ehw().clear();
        }
        cux_0.mjE.h(this.ifk);
        object = (bri_2)this.ffF();
        brh_2 brh_22 = (brh_2)((bri_2)object).ell();
        fse_1.gFu().a((aef_2)brh_22, "currentNationCitizenScore", "nativeNationCitizenScore");
        big_2.dZe();
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
        if (bgr_0.dmo().ay(this)) {
            bgr_0.dmo().a(this, l);
        }
        bcm_1.hIK.n(this.aXv, l);
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
    public fgj_0 cWp() {
        return fit_0.srO.tG(this.ePP);
    }

    public boolean d(ffV ffV2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public ffs_0 e(ffV ffV2) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public vx_0 dnW() {
        return bzj_2.eqi().ble();
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
    public boolean Q(acd_1 acd_12) {
        boolean bl = super.Q(acd_12);
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
    public void a(pv_0 pv_02, px_0 px_02) {
        if (pv_02 == null) {
            return;
        }
        super.a(pv_02, px_02);
        if (pv_02.aZd() == 0) {
            switch ((ezj_0)pv_02) {
                case ptr: {
                    fse_1.gFu().f("chat.enable.interactions", !this.i(ezj_0.ptr));
                    aPt.cAg().cAy();
                    break;
                }
                case pug: {
                    fse_1.gFu().f("aptitude.enable.interactions", !this.i(ezj_0.pug));
                    break;
                }
                case puh: {
                    fse_1.gFu().f("fighter.enable.interactions", !this.i(ezj_0.puh));
                    break;
                }
                case puj: {
                    fse_1.gFu().f("inventory.enable.interactions", !this.i(ezj_0.puj));
                    break;
                }
                case puk: {
                    fse_1.gFu().f("quests.enable.interactions", !this.i(ezj_0.puk));
                    break;
                }
                case pul: {
                    fse_1.gFu().f("spells.enable.interactions", !this.i(ezj_0.pul));
                    break;
                }
                case pum: {
                    fse_1.gFu().f("character.sheet.enable.interactions", !this.i(ezj_0.pum));
                    break;
                }
                case pts: {
                    fse_1.gFu().f("followed.achievements.enable.interactions", !this.i(ezj_0.pts));
                    czm_2.eZa();
                    break;
                }
                case ptw: {
                    fse_1.gFu().f("callHelpDisabled", this.a(pv_02));
                    break;
                }
                case ptx: {
                    fse_1.gFu().f("lockFightDisabled", this.a(pv_02));
                    break;
                }
                case pty: {
                    fse_1.gFu().f("cellReportDisabled", this.a(pv_02));
                    break;
                }
                case ptz: {
                    fse_1.gFu().f("hideFightersDisabled", this.a(pv_02));
                    break;
                }
                case ptA: {
                    fse_1.gFu().f("giveUpDisabled", this.a(pv_02));
                }
            }
        }
    }

    @Override
    public void a(eid_0 eid_02) {
        super.a(eid_02);
        fse_1.gFu().f("hasOccupation", true);
        boolean bl = fug_0.fP(this.fhv());
        if (bl && cvu_2.eQx()) {
            cvu_2.eTO().eTV();
        }
        fse_1.gFu().f("inventory.occupation.allows.interaction", !bl);
    }

    @Override
    public boolean dnY() {
        return this.gd(true);
    }

    @Override
    public boolean gd(boolean bl) {
        if (super.gd(bl)) {
            fse_1.gFu().f("hasOccupation", false);
            fse_1.gFu().f("inventory.occupation.allows.interaction", true);
            if (cvu_2.eQx()) {
                cvu_2.eTO().eTU();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean i(boolean bl, boolean bl2) {
        if (super.i(bl, bl2)) {
            fse_1.gFu().f("hasOccupation", false);
            fse_1.gFu().f("inventory.occupation.allows.interaction", true);
            return true;
        }
        return false;
    }

    public bmw_1 dnZ() {
        return baj_2.hzf.iM(this.Xi());
    }

    @Override
    public Optional<fte_0> doa() {
        return Optional.of(can_0.lHv);
    }

    public void bv(short s) {
        this.cLw = s;
    }

    @Override
    public short bEr() {
        return this.cLw;
    }

    @Override
    public /* synthetic */ ezn_0 dob() {
        return this.dmN();
    }

    @Override
    public /* synthetic */ ers_0 doc() {
        return this.dmz();
    }

    @Override
    @NotNull
    public /* synthetic */ fft_0 dod() {
        return this.dno();
    }

    @Override
    public /* synthetic */ QE baz() {
        return this.dmz();
    }

    @Override
    public /* synthetic */ void b(afW afW2, vx_0 vx_02, vx_0 vx_03) {
        this.a((ads_0)afW2, (bze_2)vx_02, (bze_2)vx_03);
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

    static /* synthetic */ long l(bgt_0 bgt_02) {
        return bgt_02.ePP;
    }

    static /* synthetic */ Logger dof() {
        return pfX;
    }

    static /* synthetic */ long m(bgt_0 bgt_02) {
        return bgt_02.aXv;
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

    static /* synthetic */ long n(bgt_0 bgt_02) {
        return bgt_02.aXv;
    }

    static /* synthetic */ Logger doj() {
        return pfX;
    }

    static /* synthetic */ long o(bgt_0 bgt_02) {
        return bgt_02.aXv;
    }

    static /* synthetic */ long p(bgt_0 bgt_02) {
        return bgt_02.aXv;
    }

    static /* synthetic */ Collection q(bgt_0 bgt_02) {
        return bgt_02.pga;
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

    static /* synthetic */ long r(bgt_0 bgt_02) {
        return bgt_02.ePP;
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


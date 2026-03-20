/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.google.common.collect.Ordering;
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class bgy
extends exP
implements PU,
RG,
Rx,
aEF,
adO,
cPu,
cRD {
    public static final int iaK = 999999;
    public static final int iaL = 800067;
    public static final int iaM = 800068;
    public static final String iaN = "Smiley_";
    public static final String iaO = "name";
    public static final String iaP = "sex";
    public static final String iaQ = "breedInfo";
    public static final String iaR = "breedId";
    public static final String iaS = "smileyDescriptorLibrary";
    public static final String iaT = "happySmileyView";
    public static final String iaU = "actorDescriptorLibrary";
    public static final String iaV = "actorAnimationName";
    public static final String iaW = "actorAnimationPath";
    public static final String iaX = "actorLinkage";
    public static final String iaY = "actorAnimation";
    public static final String iaZ = "actorEquipment";
    public static final String iba = "actor";
    public static final String ibb = "direction";
    public static final String ibc = "avatarUrl";
    public static final String ibd = "level";
    public static final String ibe = "realLevel";
    public static final String ibf = "downscaleLevel";
    public static final String ibg = "nameAndLevel";
    public static final String ibh = "levelValue";
    public static final String ibi = "companionRealLevel";
    public static final String ibj = "nonOrientable";
    public static final String ibk = "isBoss";
    public static final String ibl = "id";
    public static final String ibm = "timelineDescription";
    public static final String ibn = "states";
    public static final String ibo = "allStates";
    public static final String ibp = "positiveStates";
    public static final String ibq = "neutralStates";
    public static final String ibr = "negativeStates";
    public static final String ibs = "positiveFavoriteStates";
    public static final String ibt = "neutralFavoriteStates";
    public static final String ibu = "negativeFavoriteStates";
    public static final String ibv = "naturalState";
    public static final String ibw = "protectorStates";
    public static final String ibx = "spellsInventory";
    public static final String iby = "isInSameTeam";
    public static final String ibz = "isInBlueTeam";
    public static final String ibA = "timelinePosition";
    public static final String ibB = "characteristics";
    public static final String ibC = "isFightStateBarDisplayed";
    public static final String ibD = "isKO";
    public static final String ibE = "leaderShipCost";
    public static final String ibF = "stateAffinities";
    public static final String ibG = "visible";
    public static final String ibH = "hpBarVisible";
    public static final String ibI = "healResistDescription";
    public static final String ibJ = "canSelectTimePointBonus";
    public static final String ibK = "type";
    public static final String ibL = "resistancesOverheadEnabled";
    public static final String ibM = "shortcutBarManager";
    public static final String ibN = "characterBreedIcon";
    public static final String ibO = "characterBreedHudIcon";
    public static final String[] ibP = new String[]{"name", "sex", "breedInfo", "breedId", "smileyDescriptorLibrary", "happySmileyView", "actorDescriptorLibrary", "actorAnimationName", "actorAnimationPath", "actorLinkage", "actorAnimation", "actorEquipment", "actor", "avatarUrl", "levelValue", "level", "isBoss", "direction", "characteristics", "states", "naturalState", "protectorStates", "allStates", "positiveStates", "neutralStates", "negativeStates", "positiveFavoriteStates", "neutralFavoriteStates", "negativeFavoriteStates", "timelinePosition", "isFightStateBarDisplayed", "resistancesOverheadEnabled", "isKO", "spellsInventory", "leaderShipCost", "type", "stateAffinities", "visible", "canSelectTimePointBonus", "healResistDescription", "nonOrientable", "characterBreedIcon", "characterBreedHudIcon", "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl"};
    public static final String ibQ = "CHEVEUXCUSTOM";
    public static final String ibR = "VETEMENTCUSTOM";
    public bdj hKX;
    private final ArrayList<cPS> ibS = new ArrayList();
    private static final aex ibT = new bgz();
    public static final eXx[] ibU = new eXx[]{eXx.rGD, eXx.rGE, eXx.rGF, eXx.rGC};
    private boolean ibV;
    private ZH ibW;
    private bsJ ibX;
    private int ibY = -1;
    private bdg ibZ;
    private cqR ica;
    protected final bMp icb = new bMp();
    private bsI icc;
    private bsZ icd;
    private final HashSet<bgy> ice = new HashSet();
    protected ArrayList<bMn> icf;
    protected ArrayList<bMn> icg;
    protected ArrayList<bMn> ich;
    protected ArrayList<bMn> ici;
    protected ArrayList<bMn> icj;
    protected ArrayList<bMn> ick;
    protected final bMN icl;
    protected bgw icm;
    protected biM icn;
    private boolean ico;
    private boolean icp;
    private ZG icq;
    private boolean icr;
    private byte ics = (byte)-1;
    private byte ict = (byte)-1;
    private aex icu;
    private bgH icv;
    private byte icw;
    protected bjm icx;
    private boolean icy = true;
    private boolean icz = false;
    protected TByteIntHashMap icA;

    protected bgy() {
        this.ice.clear();
        this.ice.add(this);
        this.pgf.a(new baQ(this));
        this.icl = new bMN();
    }

    public void djv() {
        if (this.icm != null) {
            this.icm.djp();
        }
    }

    public void djo() {
        if (this.icm != null) {
            this.icm.djo();
        }
    }

    public void djw() {
        if (this.icm != null) {
            this.icm.cbS();
        }
    }

    public void ddO() {
        if (this.hKX == null) {
            return;
        }
        bdt bdt2 = this.hKX.ddm();
        bdt2.ddO();
    }

    public void b(bgw bgw2) {
        if (this.icm == null) {
            this.icm = new bgw(this);
        }
        this.icm.a(bgw2);
    }

    public int djx() {
        return 0;
    }

    public bgw djy() {
        return this.icm;
    }

    public boolean djz() {
        return this.ico;
    }

    public boolean djA() {
        return this.i(eXe.rFg);
    }

    public int bvM() {
        return this.djT() ? this.ltt.fhQ() : this.ltt.bvM();
    }

    public boolean bvN() {
        return false;
    }

    public void fM(boolean bl) {
        this.ico = bl;
    }

    public boolean djB() {
        return this.icp;
    }

    public void fN(boolean bl) {
        this.icp = bl;
    }

    @Override
    public void djC() {
        super.djC();
        if (this.ibX != null) {
            this.ac(this);
        }
    }

    public void ac(bgy bgy2) {
        cco.a(bgy2.Sn(), bgy2.dlf(), true, false);
    }

    @Override
    public String toString() {
        return this.aZk();
    }

    @Override
    public long aZj() {
        return 0L;
    }

    public fi[] bes() {
        return new fi[]{fi.oX};
    }

    @Override
    public abstract eyg djD();

    @Override
    public void e(String string, Object object) {
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iaO)) {
            return this.getName();
        }
        if (string.equals(ibg)) {
            return this.lG(this.getName());
        }
        if (string.equals(iaP)) {
            return this.aWO();
        }
        if (string.equals(iaQ)) {
            return this.dkD();
        }
        if (string.equals(iaR)) {
            return this.ltt.aWP();
        }
        if (string.equals(iaS)) {
            return this.dkT();
        }
        if (string.equals(iaT)) {
            return buE.a(this.aWP(), this.aWO(), VI.bJF.d());
        }
        if (string.equals(iaU)) {
            return this.ddI();
        }
        if (string.equals(iaV)) {
            return "AnimStatique";
        }
        if (string.equals(iaW)) {
            return this.ddI().bpu();
        }
        if (string.equals(iaX)) {
            return this.ddI().bpG();
        }
        if (string.equals(iaY)) {
            return this.ddI().bkI();
        }
        if (string.equals(iaZ)) {
            return this.ddI().bqd();
        }
        if (string.equals(iba)) {
            return this.ddI();
        }
        if (string.equals(ibl)) {
            return this.aXv;
        }
        if (string.equals(ibh)) {
            return this.cmL();
        }
        if (string.equals(ibd)) {
            return this.djH();
        }
        if (string.equals(ibe)) {
            return this.djI();
        }
        if (string.equals(ibf)) {
            return this.djJ();
        }
        if (string.equals(ibm)) {
            return this.ad(this);
        }
        if (string.equals(ibE)) {
            return this.aFW() == 1 ? Integer.valueOf(this.a(eXe.rDO) ? bjA.drJ().bC(this.aWP()).crZ() : -1) : null;
        }
        if (string.equals(ibB)) {
            return this.icn;
        }
        if (string.equals(ibn)) {
            return this.djS();
        }
        if (string.equals(ibw)) {
            return this.djR();
        }
        if (string.equals(ibo)) {
            return this.djN();
        }
        if (string.equals(ibp)) {
            return this.djO();
        }
        if (string.equals(ibq)) {
            return this.djP();
        }
        if (string.equals(ibr)) {
            return this.djQ();
        }
        if (string.equals(ibs)) {
            if (this.ici == null) {
                this.djL();
            }
            return bgy.C(this.ici);
        }
        if (string.equals(ibt)) {
            if (this.icj == null) {
                this.djL();
            }
            return bgy.C(this.icj);
        }
        if (string.equals(ibu)) {
            if (this.ick == null) {
                this.djL();
            }
            return bgy.C(this.ick);
        }
        if (string.equals(ibF)) {
            return this.icl;
        }
        if (string.equals(iby)) {
            return this.dkj();
        }
        if (string.equals(ibz)) {
            return this.dkk();
        }
        if (string.equals(ibA)) {
            bsJ bsJ2 = this.ibX;
            if (bsJ2 == null) {
                return null;
            }
            int n = bsJ2.fKj();
            int n2 = bsJ2.dGQ().eB(this.Sn());
            int n3 = Math.max(0, bsJ2.dGQ().bhG());
            if (n2 == -1) {
                return null;
            }
            int n4 = (n2 - n3 + n) % n;
            if (n4 == -1) {
                return null;
            }
            return n4 + 1;
        }
        if (string.equals(ibC)) {
            return this.ibV;
        }
        if (string.equals(ibb)) {
            return this.bcB().dzy;
        }
        if (string.equals(ibD)) {
            return this.baI();
        }
        if (string.equals(ibx)) {
            return this.dkI();
        }
        if (string.equals(ibG)) {
            return this.ddI().isVisible();
        }
        if (string.equals(ibH)) {
            if (!this.ddI().isVisible()) {
                return false;
            }
            if (this.a(eXe.rFq)) {
                return false;
            }
            fSf fSf2 = fSe.gFu().getProperty("fight.displayHPBar");
            byte by = fSf2 != null && fSf2.bGI() >= 0 ? (byte)fSf2.bGI() : (byte)((bSG)aIe.cfn().bmH()).d(bSN.liS);
            if (by == bSA.lhh.emS()) {
                return true;
            }
            if (by == bSA.lhj.emS()) {
                return false;
            }
            eXf eXf2 = this.e(eXx.rHu);
            eXf eXf3 = this.e(eXx.rGi);
            eXf eXf4 = this.e(eXx.rHp);
            return eXf2.aYB() > 0 || eXf3.aYB() + eXf4.aYB() < eXf3.aYD() + eXf4.aYD();
        }
        if (string.equals(ibJ)) {
            return this.dkQ();
        }
        if (string.equals(ibI)) {
            return this.fhi() > 0.0f ? aUM.cWf().c("desc.healRes", (int)this.fhi()) : null;
        }
        if (string.equals(ibK)) {
            return this.aFW();
        }
        if (string.equals(ibj)) {
            return this.djA();
        }
        if (string.equals(ibk)) {
            return this.i(ezJ.psW) || this.i(ezJ.ptc);
        }
        if (ibv.equals(string)) {
            return this.djG();
        }
        if (ibL.equals(string)) {
            return this.icz;
        }
        if (ibN.equals(string)) {
            bfo bfo2 = this.dkD();
            if (bfo2 == null) {
                return null;
            }
            return bfo2.dgc();
        }
        if (ibO.equals(string)) {
            bfo bfo3 = this.dkD();
            if (bfo3 == null) {
                return null;
            }
            return bfo3.dgd();
        }
        if (this.icd != null) {
            return this.icd.eu(string);
        }
        return null;
    }

    private static Collection<bMn> C(ArrayList<bMn> arrayList) {
        Set<Short> set = ((bSG)aIe.cfn().bmH()).g(bSN.ljs);
        LinkedHashSet<bMn> linkedHashSet = new LinkedHashSet<bMn>();
        for (bMn bMn2 : arrayList) {
            bMQ bMQ2;
            Qk qk = bMn2.eex();
            if (!(qk instanceof bMQ) || !set.contains((bMQ2 = (bMQ)qk).gjy())) continue;
            linkedHashSet.add(bMn2);
        }
        return linkedHashSet;
    }

    public int djE() {
        return Arrays.stream(ibU).map(eXx2 -> this.pgd.c((PT)eXx2)).max(Integer::compareTo).get();
    }

    public int djF() {
        return Arrays.stream(ibU).map(eXx2 -> this.pgd.c((PT)eXx2)).min(Integer::compareTo).get();
    }

    public bMQ djG() {
        int n;
        short[] sArray = this.ltt.ckM();
        if (sArray == null || sArray.length == 0) {
            return null;
        }
        ArrayList<bMQ> arrayList = new ArrayList<bMQ>();
        for (n = 0; n < sArray.length; n = (int)((short)(n + 3))) {
            short s = sArray[n];
            bMQ bMQ2 = (bMQ)fqX.gjM().Zr(s);
            if (bMQ2 == null || !bMQ2.eeE()) continue;
            arrayList.add(bMQ2);
        }
        n = arrayList.size();
        if (n > 0) {
            if (n > 1) {
                pfX.warn((Object)String.format("Too much natural state provided for breed %s !", this.ltt.aWP()));
            }
            return (bMQ)arrayList.get(0);
        }
        return null;
    }

    public String s(String string, int n) {
        aHV aHV2 = new aHV();
        aHV2.c(string).ceC().ih(awX.dnX.bQk()).c(" ").af(this.CH(n));
        try {
            eIm eIm2 = this.dnK();
            if (eIm2 != null && eIm2.fwt().tL() != -1) {
                aHV2.a(aUK.zU(116), 14, 16, null, null);
            }
        }
        catch (Fu fu) {
            pfX.error((Object)"Exception trying to getNameAndLevel", (Throwable)fu);
        }
        return aHV2.ceL();
    }

    public String lG(String string) {
        return this.s(string, this.dnE());
    }

    public String ad(bgy bgy2) {
        return aUM.cWf().c("fight.timeline.fighterDescription", bgy2.getName(), this.djJ(), this.ak(bgy2), this.ag(bgy2), this.ai(bgy2), this.ae(bgy2), this.al(bgy2));
    }

    private Object CH(int n) {
        return aUM.cWf().c("levelShort.custom", n);
    }

    private Object djH() {
        return aUM.cWf().c("levelShort.custom", this.cmL());
    }

    private Object djI() {
        return aUM.cWf().c("levelShort.custom", this.dnG());
    }

    private Object djJ() {
        return this.CH(this.dnE());
    }

    public String ae(bgy bgy2) {
        aHV aHV2 = new aHV();
        try {
            aHV2.a(aUK.zU(5), 16, 16, null).c(" ");
        }
        catch (Fu fu) {
            pfX.warn((Object)fu.getMessage());
            aHV2.c(aUM.cWf().c("WPShort", new Object[0])).c(" : ");
        }
        aHV2.yx(bgy2.c((PT)eXx.rGl)).c("/").yx(bgy2.d(eXx.rGl));
        return aHV2.ceL();
    }

    public String af(bgy bgy2) {
        aHV aHV2 = new aHV();
        aHV2.yx(bgy2.c((PT)eXx.rGl)).c("/").yx(bgy2.d(eXx.rGl));
        return aHV2.ceL();
    }

    public String ag(bgy bgy2) {
        aHV aHV2 = new aHV();
        try {
            aHV2.a(aUK.zU(1), 16, 16, null).c(" ");
        }
        catch (Fu fu) {
            pfX.warn((Object)fu.getMessage());
            aHV2.c(aUM.cWf().c("APShort", new Object[0])).c(" : ");
        }
        aHV2.yx(bgy2.c((PT)eXx.rGj)).c("/").yx(bgy2.d(eXx.rGj));
        return aHV2.ceL();
    }

    public String ah(bgy bgy2) {
        aHV aHV2 = new aHV();
        aHV2.yx(bgy2.c((PT)eXx.rGj)).c("/").yx(bgy2.d(eXx.rGj));
        return aHV2.ceL();
    }

    public String ai(bgy bgy2) {
        aHV aHV2 = new aHV();
        try {
            aHV2.a(aUK.zU(2), 16, 16, null).c(" ");
        }
        catch (Fu fu) {
            pfX.warn((Object)fu.getMessage());
            aHV2.c(aUM.cWf().c("MPShort", new Object[0])).c(" : ");
        }
        aHV2.yx(bgy2.c((PT)eXx.rGk)).c("/").yx(bgy2.d(eXx.rGk));
        return aHV2.ceL();
    }

    public String aj(bgy bgy2) {
        aHV aHV2 = new aHV();
        aHV2.yx(bgy2.c((PT)eXx.rGk)).c("/").yx(bgy2.d(eXx.rGk));
        return aHV2.ceL();
    }

    public Object ak(bgy bgy2) {
        aHV aHV2 = new aHV();
        aHV2.c(this.icn.h(eXx.rGi).dqx());
        if (this.d(eXx.rHp) != 0) {
            aHV2.ceH().c(this.icn.h(eXx.rHp).dqx());
        }
        return aHV2.ceL();
    }

    public Object al(bgy bgy2) {
        aHV aHV2 = new aHV();
        aHV2.c(aUM.cWf().c("INITShort", new Object[0])).c(" : ");
        aHV2.yx(bgy2.c((PT)eXx.rGI));
        return aHV2.ceL();
    }

    public Object am(bgy bgy2) {
        aHV aHV2 = new aHV();
        int n = bgy2.c((PT)eXx.rGB);
        aHV2.c("Res.F").c(" : ");
        int n2 = bgy2.c((PT)eXx.rGC) + n;
        aHV2.yx(n2).c("% ");
        aHV2.c("Res.E").c(" : ");
        n2 = bgy2.c((PT)eXx.rGD) + n;
        aHV2.yx(n2).c("% ");
        aHV2.c("Res.T").c(" : ");
        n2 = bgy2.c((PT)eXx.rGE) + n;
        aHV2.yx(n2).c("% ");
        aHV2.c("Res.V").c(" : ");
        n2 = bgy2.c((PT)eXx.rGF) + n;
        aHV2.yx(n2).c("%");
        return aHV2.ceL();
    }

    public String djK() {
        bMn bMn2;
        int n;
        int n2;
        aHV aHV2 = new aHV();
        ArrayList<bMn> arrayList = this.djS();
        if (arrayList != null && arrayList.size() > 0) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                bMn2 = arrayList.get(n);
                aHV2.a(bMn2.byf(), 16, 16, null);
            }
        }
        if ((arrayList = this.djR()) != null && arrayList.size() > 0) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                bMn2 = arrayList.get(n);
                aHV2.a(bMn2.byf(), 16, 16, null);
            }
        }
        return aHV2.bXe() > 0 ? aHV2.ceL() : null;
    }

    protected void djL() {
        if (this.icf != null && this.icg != null && this.ich != null) {
            return;
        }
        this.icg = new ArrayList();
        this.icf = new ArrayList();
        this.ich = new ArrayList();
        this.ici = new ArrayList();
        this.icj = new ArrayList();
        this.ick = new ArrayList();
        for (QD qD : this.doc()) {
            bMn bMn2;
            if (!this.z(qD) || (bMn2 = this.icb.c(qD, -1L)) == null) continue;
            switch (qD.bbf().bab()) {
                case 19: 
                case 33: {
                    if (this.icg.contains(bMn2)) break;
                    this.icg.add(bMn2);
                    break;
                }
                default: {
                    if (this.icf.contains(bMn2)) break;
                    this.icf.add(bMn2);
                }
            }
            if (this.ich.contains(bMn2)) continue;
            this.ich.add(bMn2);
            if (bMn2.eet() == fqY.sXg) {
                this.ici.add(bMn2);
                continue;
            }
            if (bMn2.eet() == fqY.sXe) {
                this.ick.add(bMn2);
                continue;
            }
            this.icj.add(bMn2);
        }
        this.djM();
    }

    protected void djM() {
        Collections.sort(this.icf);
        Collections.sort(this.ich);
        Collections.sort(this.icg);
        this.ici.sort(Comparator.comparingInt(bMn::aHb));
        this.icj.sort(Comparator.comparingInt(bMn::aHb));
        this.ick.sort(Comparator.comparingInt(bMn::aHb));
    }

    protected ArrayList<bMn> djN() {
        if (bjv.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return !this.ich.isEmpty() ? this.ich : null;
    }

    protected ArrayList<bMn> djO() {
        if (bjv.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return this.ici.isEmpty() ? null : this.ici;
    }

    protected ArrayList<bMn> djP() {
        if (bjv.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return this.icj.isEmpty() ? null : this.icj;
    }

    protected ArrayList<bMn> djQ() {
        if (bjv.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return this.ick.isEmpty() ? null : this.ick;
    }

    public ArrayList<bMn> djR() {
        if (this.icg == null) {
            this.djL();
        }
        return !this.icg.isEmpty() ? this.icg : null;
    }

    private ArrayList<bMn> djS() {
        if (this.icf == null) {
            this.djL();
        }
        return !this.icf.isEmpty() ? this.icf : null;
    }

    protected final boolean z(QD qD) {
        if (qD.bbf() == null) {
            return false;
        }
        if (qD.d() == eNf.qPC.d()) {
            return false;
        }
        if (qD.d() == eNf.qTP.d()) {
            return false;
        }
        if (qD instanceof eQN) {
            return false;
        }
        if (qD.bbf() != null && qD.bbf().bab() == 1) {
            bMQ bMQ2 = (bMQ)qD.bbf();
            return bMQ2.eeE();
        }
        int n = qD.bbf().bab();
        if (n == 16 || n == 18 || n == 26 || n == 28 || n == 34 || n == 30 || n == 32 || n == 33 || n == 19) {
            return true;
        }
        if (!this.djT()) {
            return false;
        }
        if (n == 12 && qD.bba() != null && ((eNk)qD.bba()).fAt()) {
            return true;
        }
        if (n == 12 || n == 14 || n == 31) {
            return false;
        }
        return qD.Ty() || qD.aZQ();
    }

    @Override
    public String[] bxk() {
        return ibP;
    }

    @Override
    public boolean hP(String string) {
        return string.equals(iaO);
    }

    @Override
    public void d(String string, Object object) {
    }

    @Override
    public void c(String string, Object object) {
        if (string.equals(ibC)) {
            if (object instanceof Boolean) {
                this.ibV = (Boolean)object;
                if (aUE.cVJ().cVK() != null && this.ibX != null && aUE.cVJ().cVK().dkZ() == this.ibX) {
                    fSe.gFu().a((aEF)this, ibC);
                }
            } else {
                pfX.error((Object)"Tentative de modifier l'attribut isFightStateBarDisplayed avec une valeur non bool\u00e9enne");
            }
        }
        if (string.equals(iaO)) {
            this.setName(object.toString());
            fSe.gFu().a((aEF)this, iaO);
        }
    }

    @Override
    public boolean djT() {
        return (this.ibX != null || this.ibY != -1) && this.pgb;
    }

    public boolean djU() {
        return this.djT() && this.ibX.dGp() != eTW.rqV && this.ibX.dGp() != eTW.rqT;
    }

    public int aZm() {
        return this.ice.size();
    }

    public Collection<bgy> aZn() {
        return this.ice;
    }

    public bgy jq(long l) {
        for (bgy bgy2 : this.aZn()) {
            if (bgy2 == null || bgy2.Sn() != l) continue;
            return bgy2;
        }
        return null;
    }

    @Override
    public void CI(int n) {
        this.ibY = n;
        if (this.ibX != null && this.ibX.d() != n) {
            if (n != -1) {
                pfX.error((Object)"Pas de fight alors qu'on a un fightId ?");
            }
            this.e((bsJ)null);
        }
        this.pgb = n != -1;
    }

    protected void e(bsJ bsJ2) {
        this.ibX = bsJ2;
    }

    public bsZ djV() {
        return this.icd;
    }

    public void a(bsZ bsZ2) {
        this.icd = bsZ2;
    }

    public bgy a(long l, aCd aCd2, short s, ezw ezw2, Tw tw, boolean bl, ezG<eXe> ezG2) {
        bjz bjz2 = bjA.drJ().bC(s);
        if (bjz2 == null) {
            pfX.error((Object)("Impossible d'invoquer la cr\u00e9ature " + s + " : non enregistr\u00e9 dans le MonsterCharacteristicManager"));
            return null;
        }
        bgy bgy2 = bgG.dlO().ju(l);
        bgy bgy3 = bgy2 != null ? bgy2 : bhx.doA();
        this.a(bgy3, l, aCd2, ezw2, bl, bjz2, tw, ezG2);
        return bgy3;
    }

    private void a(bgy bgy2, long l, aCd aCd2, ezw ezw2, boolean bl, bjz bjz2, Tw tw, ezG<eXe> ezG2) {
        bgy2.dny();
        bgy2.c(tw);
        this.a(bgy2, l, aCd2, ezw2, bjz2);
        bgy2.aPg();
        ezw2.a(bgy2, this);
        bgy2.a((byte)2);
        bgy bgy3 = bl ? bgy2 : this;
        if (ezG2 != null && !ezG2.aJG()) {
            if (bgy2.fgN() == null) {
                bgy2.fgl();
            }
            ezG<eXe> ezG3 = bgy2.fgN();
            for (byte by : ezG2.aYU()) {
                eXe eXe2 = eXe.Te(by);
                if (eXe2 != null) {
                    ezG3.c(eXe2);
                    continue;
                }
                pfX.error((Object)("id d'une propri\u00e9t\u00e9 de base incorrect :" + by));
            }
        }
        byte by = ezw2.bcP() == -1 ? this.bcP() : ezw2.bcP();
        this.a(bgy2, bgy3, by);
        bgy2.ao(bgy3);
        bgG.dlO().ar(bgy2);
        bgy2.ddI().bd(bgy2.bcP());
        bgy2.ddI().i(bgy2.bcB());
        cRT.c(this.ibX, bgy2);
        aJP.cig().a(bgy2, bgy2.ibY);
        btn.bx(bgy2);
        bgy2.dlk();
        bgy2.dkr();
        bgy.an(bgy2);
    }

    public static void an(bgy bgy2) {
        bLH bLH2 = bgy2.dlG();
        if (bLH2 == null) {
            return;
        }
        frd frd2 = bgy2.djZ().dnM();
        ezG<eXe> ezG2 = bgy2.fgN();
        if (ezG2 != null && ((PS)ezG2).a(eXe.rFc) && frd2 != null) {
            ArrayList<bMx> arrayList = new ArrayList<bMx>();
            frd2.eEu().stream().map(n -> {
                if (n == 0) {
                    return null;
                }
                return bMB.eeV().h((int)n, bgy2.djZ().cmL());
            }).forEach(bMx2 -> {
                if (bMx2 == null) {
                    arrayList.add(null);
                    return;
                }
                bMx bMx3 = (bMx)bgy2.dkB().pc(bMx2.avr());
                bMx2.di(bMx3 != null ? bMx3.LV() : (long)bMx2.avr());
                arrayList.add((bMx)bMx2);
            });
            bLH2.aL(arrayList);
        } else {
            Iterable<bMx> iterable = bgy2.dkJ();
            bLH2.aL(Ordering.natural().onResultOf(new bMA()::f).sortedCopy(iterable));
        }
    }

    private void a(bgy bgy2, long l, aCd aCd2, ezw ezw2, bjz bjz2) {
        bgy2.dC(l);
        bgy2.c(bjz2);
        if (ezw2 != null) {
            bgy2.bw(ezw2.cmL());
            bgy2.aQ(ezw2.aWO());
        } else {
            pfX.warn((Object)("Charac null a l'initisalisation d'une invoc, uid : " + l));
        }
        bgy2.b(aCd2);
        aBI aBI2 = ezw2.bcB();
        if (aBI2 == aBI.dzt) {
            bgy2.a(this.bcB());
        } else {
            bgy2.a(aBI2);
        }
        bgy2.ll(true);
        bgy2.icx = this.icx;
    }

    private void a(bgy bgy2, bgy bgy3, byte by) {
        bgy2.ico = true;
        if (this.ibX != null) {
            this.ibX.a(bgy2, by, true, bgy3);
            bgy2.icp = true;
        } else if (this.icc != null) {
            this.icc.a(bgy2, this.bcP());
        }
    }

    @Override
    public boolean a(ezA ezA2) {
        amg amg2;
        boolean bl = super.a(ezA2);
        if (bl) {
            amg2 = this.ddI();
            this.icu = ((adS)amg2).bvD();
            ((adS)amg2).a(false, aea.cmr, aea.cmB);
            ((adJ)amg2).c(((adO)((Object)ezA2)).bvp());
            ((ZC)amg2).a(new bgA(this, ezA2, (bdj)amg2));
        }
        amg2 = aUE.cVJ().cVK();
        if (this.dkQ()) {
            ((bgy)amg2).dlH();
        }
        return bl;
    }

    @Override
    public boolean Q(aCd aCd2) {
        return this.b(aCd2, false);
    }

    @Override
    public boolean R(aCd aCd2) {
        return this.b(aCd2, true);
    }

    private void djW() {
        bdj bdj2 = this.ddI();
        bdj2.dU(null);
        bdj2.dcX().x(bdj2);
        if (this.pgx == null) {
            pfX.trace((Object)"Essaye de d\u00e9poser alors qu'il ne porte personne");
            return;
        }
        if (this.pgx instanceof bhx && ((bhx)this.pgx).aWP() == 3794) {
            bdj2.dT("Anim03PorteTonneau");
        } else {
            bdj2.dT("Anim04Porte");
        }
    }

    private boolean b(aCd aCd2, boolean bl) {
        return this.d(aCd2, bl, bl);
    }

    private boolean d(aCd aCd2, boolean bl, boolean bl2) {
        bdj bdj2 = this.ddI();
        if (bl) {
            this.djW();
        } else {
            bdj2.dcX().x(bdj2);
        }
        adJ adJ2 = bdj2.a(bl2, aCd2);
        if (this.icu == null) {
            if (adJ2 == null) {
                pfX.error((Object)"On d\u00e9pose rien (?) . double uncarry ?");
            } else {
                pfX.error((Object)"Reset le movementSelector \u00e0 null (interdit!!)");
                bdj2.a(aeB.bww());
            }
        } else {
            bdj2.a(this.icu);
            this.icu = null;
        }
        return super.R(aCd2);
    }

    @Override
    public void djX() {
        bdj bdj2 = this.ddI();
        bdj2.bvH();
        super.djX();
        bdj2.buY();
    }

    @Override
    public void cZG() {
        super.cZG();
        this.ddI().dcX().A(this.ddI());
        biu biu2 = aUE.cVJ().cVK().dpQ();
        if (biu2 != null) {
            biu2.aH(this);
        }
    }

    @Override
    public void a(ezz ezz2) {
        super.a(ezz2);
        this.ddI().a(aez.bwu());
        biu biu2 = aUE.cVJ().cVK().dpQ();
        if (biu2 != null) {
            biu2.aG(this);
        }
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 300: {
                this.e((bsJ)object);
                this.ibY = this.ibX.d();
                this.djo();
                break;
            }
            case 301: {
                this.ibV = false;
                this.e((bsJ)null);
                this.ibY = -1;
                this.icd = null;
                if (this.ddI().bvd() == 1) {
                    this.ddI().as((byte)0);
                }
                this.djo();
                this.dlk();
            }
        }
    }

    public bgy djY() {
        return bgy.b(this.ibX, this);
    }

    public bgy djZ() {
        return bgy.c(this.ibX, this);
    }

    @Override
    public void a(Rl rl) {
        switch (rl.d()) {
            case 1000: {
                eRO eRO2 = ((eXE)rl).fOT();
                if (!this.z(eRO2)) break;
                this.fO(true);
                if (this != aUE.cVJ().cVK() || !(eRO2 instanceof eRh)) break;
                fqU fqU2 = ((eRh)eRO2).fGk();
                if (fqU2 != null) {
                    bqM.jbp.b(new brK(fqU2.gjy()));
                    break;
                }
                pfX.warn((Object)"Etat inexistant on ne peut pas lancer l'\u00e9v\u00e8nement");
                break;
            }
            case 1002: {
                eXG eXG2 = (eXG)rl;
                if (this != aUE.cVJ().cVK()) break;
                for (Map.Entry<Long, QD> entry : eXG2.fOU().entrySet()) {
                    this.icb.c(entry.getValue(), entry.getKey());
                }
                this.icf = null;
                this.icg = null;
                this.ich = null;
                fSe.gFu().a((aEF)this, ibn, ibw, "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", ibo, ibp, ibq, ibr, ibs, ibt, ibu);
                break;
            }
            case 1001: {
                this.fO(false);
                break;
            }
            case 1003: {
                this.icf = null;
                this.icg = null;
                this.ich = null;
                fSe.gFu().a((aEF)this, ibn, ibw, "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", ibo, ibp, ibq, ibr, ibs, ibt, ibu);
                break;
            }
            case 101: {
                if (aUE.cVJ().cVK() != this && this.dlw()) break;
                this.ddI().ddc();
                break;
            }
            case 102: {
                this.ddI().ddf();
                break;
            }
        }
    }

    protected void fO(boolean bl) {
        if (aUE.cVJ().cVK() == null) {
            return;
        }
        this.icb.clear();
        this.icf = null;
        this.icg = null;
        this.ich = null;
        fSe.gFu().a((aEF)this, ibn, ibw, "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", ibo, ibp, ibq, ibr, ibs, ibt, ibu);
    }

    @Override
    public cPM[] chR() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.ibS.size(); ++i) {
            arrayList.add(this.ibS.get(i).eLI());
        }
        return arrayList.toArray(new cPM[arrayList.size()]);
    }

    @Override
    public boolean chS() {
        return true;
    }

    @Override
    public Point chT() {
        aam aam2 = aIe.cfn().bmC();
        aCb aCb2 = agi.c(aam2, this.getWorldX(), this.getWorldY(), this.getAltitude() + (float)this.bcN());
        int n = GC.A(aCb2.aPY);
        int n2 = GC.A(aCb2.aPZ);
        return new Point(n, n2);
    }

    @Override
    public short chU() {
        return (short)((float)this.doV().bcN() * 10.0f);
    }

    public bEr dka() {
        return bEr.dSi();
    }

    @Override
    protected fjn dkb() {
        return bRI.b(this);
    }

    @Override
    public fgD dkc() {
        return fgD.fXh();
    }

    @Override
    public boolean a(Rw rw, RG rG) {
        boolean bl;
        boolean bl2 = bl = !this.b(rw, rG);
        if (!bl) {
            pfX.warn((Object)("Action " + String.valueOf(rw) + " non prise en compte par ce CharacterInfo, type=" + this.getClass().getName() + ", id=" + this.Sn()));
        }
        return bl;
    }

    @Override
    public void c(Rw rw) {
        throw new UnsupportedOperationException("Les actions ne sont pas forward\u00e9e au serveur pour le moment, il existe encore des protocoles sous-jacents.");
    }

    @Override
    public boolean b(Rw rw, RG rG) {
        throw new UnsupportedOperationException("Pas d'action cliente prise en compte sur ce type d'\u00e9l\u00e9ment interactif.");
    }

    @Override
    public Rw bdZ() {
        return null;
    }

    @Override
    public Rw[] bea() {
        return Rw.bly;
    }

    @Override
    public Qm<eNk> dkd() {
        Qm<eNk> qm = super.dkd();
        if (qm != null) {
            return qm;
        }
        if (this.ibY != -1 && this.pgb && bsU.dHk().Ft(this.ibY) != null) {
            return bsU.dHk().Ft(this.ibY).bbh();
        }
        return null;
    }

    @Override
    public Qm<eNk> dke() {
        return baS.cZC();
    }

    @Override
    public void b(Qu qu) {
    }

    @Override
    public void c(Qu qu) {
    }

    @Override
    public void d(Qu qu) {
    }

    @Override
    public boolean baN() {
        return false;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ics = (byte)-1;
        this.ict = (byte)-1;
        this.icy = true;
    }

    protected void a(eyp eyp2) {
        this.icl.reset();
        short[] sArray = eyp2.ckM();
        if (sArray == null || sArray.length == 0) {
            return;
        }
        for (int n = 0; n < sArray.length; n = (int)((short)(n + 3))) {
            short s;
            short s2 = sArray[n];
            eRS eRS2 = this.doc();
            if (eRS2 != null) {
                eRS2.Sf(s2);
            }
            if ((s = sArray[n + 1]) == -1) {
                s = this.cmL();
            }
            QD.baX();
            eOr eOr2 = eOr.a(this.pgf, this, s2, s, sArray[n + 2] == 0);
            eOr2.bbD();
            eOr2.e(this);
            eOr2.fCy();
            eOr2.a(null, false);
        }
    }

    @Override
    public void aVH() {
        if (this.ibX != null) {
            this.ibX.aX(this);
        }
        if (this.icc != null) {
            this.icc.aT(this);
        }
        super.aVH();
        this.ibV = false;
        this.ibW = null;
        this.e((bsJ)null);
        this.ibY = -1;
        this.icd = null;
        this.ibZ = null;
        this.ica = null;
        this.icc = null;
        if (this.hKX != null) {
            this.hKX.ddm().ddP();
        }
        this.b((bdj)null);
        this.ice.clear();
        this.icb.clear();
        this.djv();
        bgG.dlO().c(this.icv);
        this.icv = null;
        this.icy = true;
        if (this.icm != null) {
            this.icm.clean();
        }
        if (this.icq != null) {
            this.icq.bpI();
            this.icq = null;
        }
        this.icx = null;
    }

    @Override
    public void baJ() {
        super.baJ();
        this.icn.c(eXx.rGi);
    }

    @Override
    public void baG() {
        super.baG();
        if (this.hKX != null) {
            cXq.eWO().a(this.hKX);
        }
    }

    @Override
    public void baL() {
        if (this.hKX == null) {
            pfX.error((Object)"actor null ? ", (Throwable)new Exception());
        } else {
            cYA.eYj().cp(this);
            this.hKX.dcV();
        }
        super.baL();
    }

    @Override
    public void a(eTY eTY2) {
        super.a(eTY2);
        if (this.ibX == null) {
            this.e((bsJ)eTY2);
            this.ibY = this.ibX.d();
        }
        this.hKX.bg(ffS.sgS.shb);
        this.dkl();
    }

    @Override
    public void dkf() {
        Object object;
        super.dkf();
        this.a(new eXF());
        if (this.doE()) {
            object = this.ddI();
            adN.bvh().j((adJ)object);
        }
        if ((object = this.dmL()) != null) {
            Optional<ffV> optional = this.dnP().B(((fhk)object).t(ffS.sgS));
            optional.ifPresent(ffV2 -> this.hKX.a(ffV2.dOg(), (short)ffS.sgS.shb));
        }
        this.dkm();
        if (this.hKX != null && this.hKX.ddm() != null) {
            this.hKX.ddm().ddK();
        }
    }

    @Override
    public void aZh() {
        bgy.a(this.ibX, this);
        if (this.ibX != null && !this.ibX.dGP()) {
            this.dkg();
        }
    }

    @Override
    public void p(long l, long l2) {
        super.p(l, l2);
        if (this.ibX == null) {
            return;
        }
        bgy bgy2 = (bgy)this.ibX.qJ(l);
        bgy bgy3 = (bgy)this.ibX.qJ(l2);
        if (bgy2 != null) {
            bgy2.dkg();
            if (bgy3 != null && bgy3.dkQ()) {
                bgy.an(bgy2);
            }
        }
    }

    @Override
    public void az(byte by) {
        super.az(by);
        this.dkg();
    }

    public void dkg() {
        this.dkh();
        this.dki();
        if (this.icd != null) {
            this.icd.dHB();
        }
    }

    public void dkh() {
        boolean bl;
        if (this.ibX == null) {
            return;
        }
        if (!this.ibX.ba((exP)this)) {
            return;
        }
        boolean bl2 = bl = this.ibX.dGQ().ez(this.aXv) && this.dlB();
        if (bl) {
            this.ddI().be(this.bcP());
        } else {
            this.ddI().bd(this.bcP());
        }
    }

    private void dki() {
        if (this.ibX == null) {
            return;
        }
        if (!this.ibX.ba((exP)this)) {
            return;
        }
        this.ddI().i(this.bcB());
    }

    @Override
    public void a(PR pR) {
        PT pT = pR.aYQ();
        bgT bgT2 = aUE.cVJ().cVK();
        if (pT.aYW() == 0) {
            switch ((eXx)pR.aYQ()) {
                case rGi: 
                case rGk: {
                    if (aUE.cVJ().c(cUB.eSi())) {
                        cUB.eSi().eSr();
                    }
                    if (aUE.cVJ().c(cUE.eSA())) {
                        cUE.eSA().eSJ();
                    }
                }
                case rGj: 
                case rGl: 
                case rGI: 
                case rGQ: 
                case rGm: 
                case rGn: 
                case rGH: 
                case rGJ: 
                case rGv: 
                case rGo: {
                    if (bgT2 == null || !this.bvY() && this.fgk()) break;
                    this.c("updateShortcut", new bgB(this, bgT2));
                }
            }
            switch ((eXx)pR.aYQ()) {
                case rGi: 
                case rHu: 
                case rHp: 
                case rHr: {
                    fSe.gFu().a((aEF)this, ibH, "hpPercentage");
                    fSe.gFu().a((aEF)this.dlE(), ((eXx)pR.aYQ()).name());
                }
            }
        }
    }

    @Override
    public void a(PV pV, PX pX) {
        if (pV == null) {
            return;
        }
        if (pV.aZd() == 1) {
            switch ((eXe)pV) {
                case rDY: {
                    this.icn.c(eXx.rGj);
                    break;
                }
                case rDe: 
                case rEJ: 
                case rDJ: 
                case rDK: {
                    if (this.ibX == null || this.ibX != aUE.cVJ().cVK().dmV()) break;
                    cUB.eSi().eSr();
                    cUE.eSA().eSJ();
                    break;
                }
                case rDs: 
                case rDg: {
                    boolean bl;
                    if (!this.dkj()) {
                        this.ddI().bqj();
                        if (this.fgN() != null) {
                            boolean bl2 = !this.a(pV);
                            this.ddI().setVisible(bl2);
                            if (bl2) {
                                this.ddI().dcU();
                            } else {
                                this.ddI().dcV();
                            }
                        }
                    }
                    cRT.c(this.ibX, this);
                    bsJ bsJ2 = this.ibX;
                    if (bsJ2 == null) break;
                    fSe.gFu().a((aEF)this, ibH);
                    boolean bl3 = bl = !this.a(pV);
                    if (bl) {
                        ((btc)bsJ2.bag()).bu(this);
                        cXq.eWO().ci(this);
                        break;
                    }
                    ((btc)bsJ2.bag()).bt(this);
                    cXq.cj(this);
                    break;
                }
                case rFq: {
                    fSe.gFu().a((aEF)this, ibH);
                }
            }
        }
    }

    public boolean dkj() {
        bgT bgT2 = aUE.cVJ().cVK();
        if (bgT2 == null) {
            return false;
        }
        bsJ bsJ2 = bgT2.dkZ();
        return this.bvY() || bsJ2 != null && bsJ2 == this.ibX && bgT2.bcP() == this.bcP();
    }

    public boolean dkk() {
        bgT bgT2 = aUE.cVJ().cVK();
        return this.dkj() || bgT2.dnB() != null && this.bcP() == 1;
    }

    @Override
    public void a(aBI aBI2) {
        this.ddI().a(aBI2);
        fSe.gFu().a((aEF)this, ibb);
    }

    @Override
    public void a(int n, int n2, short s) {
        super.a(n, n2, s);
        this.ddI().e(n, n2, s);
        cUB.eSi().X(this);
    }

    @Override
    public void b(aCd aCd2) {
        this.a(aCd2.getX(), aCd2.getY(), aCd2.bdi());
    }

    @Override
    public void b(int n, int n2, short s) {
        if (this.fgZ() != null) {
            ((bgy)this.fgZ()).d(new aCd(n, n2, s), true, false);
        }
        this.b(n, n2, s, false);
    }

    public void b(int n, int n2, short s, boolean bl) {
        this.dkR();
        aCd aCd2 = new aCd(n, n2, s);
        super.b(aCd2);
        this.ddI().a(aCd2, bl, false, false);
    }

    public abstract void dkl();

    public abstract void dkm();

    public void a(cPS cPS2) {
        this.ibS.add(cPS2);
    }

    public void CJ(int n) {
        int n2 = this.ibS.size();
        for (int i = 0; i < n2; ++i) {
            if (this.ibS.get(i).avZ() != n) continue;
            this.ibS.remove(i);
        }
    }

    public void dkn() {
        IsoParticleSystem isoParticleSystem;
        if (aUE.cVJ().cVK().djT() && this.ibY != aUE.cVJ().cVK().bqo()) {
            return;
        }
        Iterator<IsoParticleSystem> iterator = agZ.bzy().bzA();
        while (iterator.hasNext()) {
            FreeParticleSystem freeParticleSystem;
            isoParticleSystem = iterator.next();
            if (!(isoParticleSystem instanceof FreeParticleSystem) || (freeParticleSystem = (FreeParticleSystem)isoParticleSystem).bLK() != 999999 || freeParticleSystem.btr() != this.ddI()) continue;
            return;
        }
        isoParticleSystem = agY.bzw().sk(999999);
        if (isoParticleSystem == null) {
            return;
        }
        ((FreeParticleSystem)isoParticleSystem).a(this.ddI());
        agZ.bzy().b(isoParticleSystem);
    }

    public void bmX() {
        this.fP(false);
    }

    public void fP(boolean bl) {
        if (bl) {
            this.b((bdj)null);
        }
    }

    protected final void dko() {
        fSe fSe2 = fSe.gFu();
        fSe2.a((aEF)this, iaY, iaW, iaU, iaZ);
    }

    @Override
    public void as(byte[] byArray) {
        this.dkp();
        super.as(byArray);
        this.dkq();
    }

    public void dkp() {
        this.icw = (byte)(this.icw + 1);
    }

    public void dkq() {
        assert (this.icw > 0);
        this.icw = (byte)(this.icw - 1);
        this.dkr();
    }

    public final void dkr() {
        boolean bl;
        amg amg2;
        if (this.icw > 0) {
            return;
        }
        try {
            amg2 = this.hKX;
            if (amg2 == null) {
                return;
            }
            if (((ZC)amg2).bqd() == null) {
                return;
            }
            ((bdf)amg2).dcL();
            ((ZC)amg2).bqd().bHB();
            bdy bdy2 = ((bdj)amg2).ddq();
            boolean bl2 = bl = (bdy2 == null || bdy2.hLX) && !((bdj)amg2).ddr();
            if (bdy2 == null) {
                ((bdf)amg2).lf(Integer.toString(this.aVt()));
                this.dkx();
            } else {
                bdy2.Z(this);
            }
            if (bl) {
                this.dkA();
                this.dky();
            }
            this.dkt();
            this.dkw();
            this.dkz();
            this.dks();
            this.dkv();
            if (bl) {
                this.dku();
            }
        }
        catch (Exception exception) {
            pfX.error((Object)("probl\u00e8me lors de l'application de l'equipement sur l'acteur " + this.Sn() + " " + this.getName()), (Throwable)exception);
        }
        amg2 = aUE.cVJ().cVK();
        boolean bl3 = this.ibX != null && amg2 != null && ((bgT)amg2).dmV() == this.ibX;
        boolean bl4 = bl = this.ibX != null && this.ibX.dGp() != eTW.rqW;
        if (bl3 && bl) {
            bvE.dKK().kN(this.aXv);
        }
        this.dko();
    }

    protected void dks() {
    }

    protected void dkt() {
        if (this.icx != null) {
            this.icx.q(this.ddI());
        }
    }

    protected void dku() {
        fjn fjn2 = this.ffF();
        fkL fkL2 = fjn2.emF();
        if (fkL2 == null) {
            return;
        }
        bdA.a(fkL2, fjn2.Xt(), new bgC(this));
    }

    protected void dkv() {
        eID eID2 = this.dpX();
        if (eID2 != null && eID2.dsm() == 16) {
            bkG bkG2 = (bkG)eID2;
            bkG2.dsQ();
        }
    }

    protected void dkw() {
    }

    protected void dkx() {
        String string = this.dly();
        String string2 = this.dlx();
        if (string != null || string2 != null) {
            String string3;
            String string4;
            try {
                string4 = aUC.cVq().bS("ANMEquipmentPath");
            }
            catch (Fu fu) {
                pfX.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)fu);
                return;
            }
            if (string != null) {
                string3 = String.format(string4, string);
                this.ddI().b(string3, ary.fT(ibR));
            }
            if (string2 != null) {
                string3 = String.format(string4, string2);
                this.ddI().b(string3, ary.fT(ibQ));
            }
        }
    }

    protected void dky() {
        if (this.hKX != null) {
            this.ddI().ddn();
        }
    }

    protected void dkz() {
    }

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
            bGV bGV2 = (bGV)fgD.fXh().Vd(n);
            if (bGV2 == null) {
                pfX.error((Object)("Le ReferenceItem d'id " + n + " n'existe pas"));
                continue;
            }
            this.ddI().a(bGV2, (short)by);
        }
    }

    public fqP<bMx> dkB() {
        return null;
    }

    @Override
    public void CK(int n) {
        super.CK(n);
        for (eyK eyK2 : this.pga) {
            eyK2.j(this);
        }
    }

    protected void a(ewr ewr2) {
        ewo.oBF.a((ewr ewr3, Object object) -> {
            if (ewr3 != ewr2) {
                return;
            }
            this.bvp().bP(ewo.oBF.p(ewr2));
        });
    }

    public fpU dkC() {
        return fpU.sRd;
    }

    public bfo dkD() {
        return bfq.dge().BO(this.doV().aWP());
    }

    @Nullable
    public TByteIntHashMap dkE() {
        return this.icA;
    }

    public void a(TByteIntHashMap tByteIntHashMap) {
        this.icA = tByteIntHashMap;
    }

    public void b(TByteIntHashMap tByteIntHashMap) {
        this.icA = tByteIntHashMap;
    }

    public long dkF() {
        return this.Sn();
    }

    public boolean dkG() {
        long l = this.aqZ();
        return caf.lFq.rV(l);
    }

    public boolean dkH() {
        long l = this.Ya();
        return caf.lFq.X(this.aHT, l);
    }

    public bMd dkI() {
        return null;
    }

    public bMx jr(long l) {
        return null;
    }

    public Iterable<bMx> dkJ() {
        return null;
    }

    @Override
    public boolean d(int n, short s) {
        if (!this.dkN()) {
            pfX.error((Object)"Trying to add a spell to a temporary inventory, but no temporary inventory");
            return false;
        }
        bMt bMt2 = bMB.eeV().If(n);
        if (bMt2 == null) {
            pfX.error((Object)("Trying to add spell " + n + " to temporary inventory, but this spell doesn't exist"));
            return false;
        }
        bMx bMx2 = new bMx(bMt2, s, bMt2.d(), this);
        try {
            if (!((Sg)this.dkI().eek()).b(bMx2)) {
                return false;
            }
        }
        catch (SA sA) {
            pfX.error((Object)"Exception levee", (Throwable)sA);
            return false;
        }
        catch (Sz sz) {
            pfX.error((Object)"Exception levee", (Throwable)sz);
            return false;
        }
        bgT bgT2 = aUE.cVJ().cVK();
        bgy bgy2 = cUL.eST().eSH();
        if (bgy2 == this && (this.djZ() == bgT2 || this.dkQ())) {
            bLH bLH2 = bgT2.dlG();
            bLH2.a(this.dkI().eek());
            bLH2.dlH();
        }
        return true;
    }

    @Override
    public void dkK() {
        if (this.dkI() == null) {
            return;
        }
        this.dkI().T(this);
    }

    @Override
    protected void a(int n, eyc eyc2) {
        this.dkL();
        if (this.dkI() == null) {
            return;
        }
        bjz bjz2 = bjA.drJ().bC((short)n);
        if (bjz2 == null) {
            return;
        }
        ArrayList<azr<bMt>> arrayList = bjz2.dry();
        short s = switch (eyc2) {
            case eyc.phd -> this.cmL();
            default -> bjz2.cqz();
        };
        ArrayList<bMx> arrayList2 = new ArrayList<bMx>();
        for (azr<bMt> azr2 : arrayList) {
            bMt bMt2 = azr2.aHI();
            bMx bMx2 = new bMx(bMt2, s, bMt2.d(), this);
            arrayList2.add(bMx2);
        }
        this.dkI().a(arrayList2, this);
    }

    public boolean dkL() {
        return this.a((bti)null);
    }

    public boolean a(bti bti2) {
        if (this.ibX == null) {
            return false;
        }
        bth bth2 = this.ddI().dcX();
        if (bth2 instanceof btm) {
            return false;
        }
        btm btm2 = new btm(this);
        if (bti2 != null) {
            btm2.b(bti2);
        }
        if (bth2 != null) {
            btn.d(this.ddI(), btm2);
            return true;
        }
        this.ddI().a(btm2);
        btm2.x(this.ddI());
        return true;
    }

    @Override
    public void dkM() {
        if (this.dkI() == null) {
            return;
        }
        this.dkI().dkM();
    }

    @Override
    public boolean dkN() {
        if (this.dkI() == null) {
            return false;
        }
        return this.dkI().dkN();
    }

    public boolean dkO() {
        return this.hKX != null;
    }

    public boolean dkP() {
        return this.ibV;
    }

    @Override
    public boolean bcS() {
        if (this.dlw()) {
            return false;
        }
        return super.bcS();
    }

    public boolean bvY() {
        return false;
    }

    public boolean dkQ() {
        bgT bgT2 = aUE.cVJ().cVK();
        if (bgT2 == null) {
            return false;
        }
        bgy bgy2 = this.djY();
        if (bgy2 == this) {
            return this.Xi() == bgT2.Xi();
        }
        return bgy2.Xi() == bgT2.Xi() || bgy2.dkQ();
    }

    public void dkR() {
        if (this.ibZ != null) {
            bdj bdj2 = this.ddI();
            if (bdj2 == null) {
                return;
            }
            bdj2.c(this.ibZ);
            this.ibZ = null;
        }
    }

    public void dkS() {
        Object object;
        if (this.aFW() == 5) {
            object = this.e(eXx.rGi);
            ((eXf)object).op(((eXf)object).aYE());
        }
        object = this.ddI();
        boolean bl = false;
        if (this.doP()) {
            bl = true;
            ((bdj)object).a(btl.dHL());
        } else {
            String string = ((ZC)object).bkI();
            if (this.doP() && string.equalsIgnoreCase("AnimKO-SortieHS") || string.equalsIgnoreCase("AnimKO-Debut") || this.doP() && string.equalsIgnoreCase("AnimDesincarnation") || this.doP() && string.equalsIgnoreCase("AnimTombe") || string.equalsIgnoreCase("AnimEmote-Victoire")) {
                bl = true;
            }
        }
        if (!this.doP()) {
            if (bl) {
                ((bdj)object).a(btl.dHL());
                btl.dHL().u((bdj)object);
            } else {
                btn.d((bdj)object, btl.dHL());
            }
        }
        ((adS)object).bvH();
        ((bdf)object).fr(false);
        ((ZC)object).bR(((ZC)object).bqk());
        ((ZC)object).bpV();
        ((adS)object).bvt();
        ((bdj)object).dcW();
        ((bdj)object).setVisible(true);
        ((bdj)object).fs(false);
    }

    public void f(bsI bsI2) {
        this.icc = bsI2;
        if (bsI2 != null) {
            this.ibY = bsI2.d();
            this.pgb = true;
        } else {
            this.ibY = -1;
            this.pgb = false;
        }
    }

    public void a(cqR cqR2) {
        this.ica = cqR2;
    }

    public void j(aBI aBI2) {
        boolean bl;
        assert (aBI2 != null);
        boolean bl2 = bl = this.bcB() != aBI2;
        if (bl) {
            super.a(aBI2);
            fSe.gFu().a((aEF)this, ibb);
        }
    }

    public void fQ(boolean bl) {
        this.ibV = bl;
    }

    public void T(int n, int n2, short s) {
        super.a(n, n2, s);
        cUB.eSi().X(this);
    }

    public void a(bdg bdg2) {
        if (bdg2 == null) {
            return;
        }
        bdj bdj2 = this.ddI();
        if (bdj2 == null) {
            return;
        }
        this.ibZ = bdg2;
        bdj2.b(this.ibZ);
    }

    @Nullable
    public ZG dkT() {
        if (this.icq == null) {
            ZG zG = new ZG(ayM.bSE(), this.ddI().getWorldX(), this.ddI().getWorldY(), this.ddI().getAltitude());
            String string = this.dkU();
            try {
                zG.k(String.format(aUC.cVq().bS(this.dkV()), string), true);
            }
            catch (IOException iOException) {
                pfX.error((Object)"", (Throwable)iOException);
                zG.bpI();
                return null;
            }
            catch (Fu fu) {
                pfX.error((Object)"", (Throwable)fu);
                zG.bpI();
                return null;
            }
            zG.dP(string);
            this.icq = zG;
        }
        return this.icq;
    }

    protected abstract String dkU();

    protected abstract String dkV();

    @NotNull
    public bdj ddI() {
        if (this.hKX == null) {
            this.b(new bdj(this));
            if (this.bcO() >= 1) {
                this.hKX.a(ibT);
            }
        }
        return this.hKX;
    }

    @Override
    public adJ bvp() {
        return this.ddI();
    }

    public bsI dkW() {
        return this.icc;
    }

    public void dkX() {
    }

    public void dkY() {
        this.gf(false);
        this.lp(false);
        if (this.hKX != null) {
            this.hKX.setVisible(true);
        }
        this.fgJ();
    }

    public bsJ dkZ() {
        return this.ibX;
    }

    public int bqo() {
        return this.ibY;
    }

    public ZH dla() {
        return this.ibW;
    }

    public cqR dlb() {
        return this.ica;
    }

    public void l(ZH zH) {
        this.ibW = zH;
    }

    public bMp dlc() {
        return this.icb;
    }

    public void b(bdj bdj2) {
        if (bdj2 == this.hKX) {
            return;
        }
        if (this.hKX != null) {
            adN.bvh().j(this.hKX);
            this.hKX.aZp();
        }
        this.hKX = bdj2;
        if (this.icy && this.hKX != null) {
            adN.bvh().g(this.hKX);
        }
    }

    public void fR(boolean bl) {
        this.icy = bl;
    }

    public void dld() {
        this.dle();
    }

    private void dle() {
        ezw ezw2 = this.ffE();
        if (ezw2 != null) {
            long l;
            bgG bgG2 = bgG.dlO();
            bgy bgy2 = bgG2.ju(l = ezw2.fmF());
            if (bgy2 == null && this.icv == null) {
                this.icv = new bgD(this, l, ezw2, bgG2);
                bgG2.a(this.icv);
            } else {
                ezw2.a(this, bgy2);
                this.ao(bgy2);
            }
        }
    }

    protected void ao(bgy bgy2) {
        throw new UnsupportedOperationException("Doit \u00eatre un NPC");
    }

    public abstract byte dlf();

    @Override
    public byte bcP() {
        if (this.icc != null) {
            return this.icc.kp(this.Sn());
        }
        return super.bcP();
    }

    public int dlg() {
        if (this.pgw != -1) {
            return this.pgw;
        }
        if (this.doV() == null) {
            return 30000;
        }
        return this.doV().csf();
    }

    public void a(bsJ bsJ2, byte[] byArray, byte[] byArray2) {
        this.a(byArray2, false, bsJ2);
        this.a(byArray, true);
    }

    public void dU(byte[] byArray) {
        this.a(byArray, true, null);
    }

    public void a(byte[] byArray, boolean bl, eTY eTY2) {
        int n = this.c((PT)eXx.rGi);
        this.dp(byArray);
        if (!this.doE()) {
            this.dmg();
        }
        if (bl) {
            this.dlh();
        } else {
            baN.D(this.dli());
        }
        if (!bl && eTY2 != null) {
            this.e(eTY2.bbh());
        }
        this.OC(n);
    }

    public void a(byte[] byArray, boolean bl) {
        ezG<eXe> ezG2 = this.fgN();
        if (ezG2 != null) {
            ezG2.reset();
        }
        this.eu(byArray);
        if (bl) {
            this.fgm();
        }
        this.dkl();
        eXx[] eXxArray = eXx.values();
        for (int i = 0; i < eXxArray.length; ++i) {
            eXx eXx2 = eXxArray[i];
            eXf eXf2 = this.e(eXx2);
            eXf2.aYT();
        }
    }

    private void dlh() {
        LinkedList<QD> linkedList = this.dli();
        this.a(linkedList);
    }

    private void a(LinkedList<QD> linkedList) {
        for (int i = 0; i < linkedList.size(); ++i) {
            QD qD = linkedList.get(i);
            if (qD instanceof eRh) {
                qD.bbr();
            }
            qD.bbF();
            eRO eRO2 = (eRO)qD;
            if (!eRO2.fHo()) continue;
            eRO2.d(null, false);
        }
    }

    private LinkedList<QD> dli() {
        Iterator<QD> iterator = this.doc().iterator();
        LinkedList<QD> linkedList = new LinkedList<QD>();
        while (iterator.hasNext()) {
            QD qD = iterator.next();
            if (qD instanceof eRh) {
                linkedList.addFirst(qD);
                continue;
            }
            linkedList.addLast(qD);
        }
        return linkedList;
    }

    public final void dlj() {
        List<eRh> list = this.g(this.pgf);
        this.doc().clear();
        this.aH(list);
        this.dlk();
        this.a(this.doV());
    }

    @Override
    public void dlk() {
        if (this.aFW() == 5) {
            return;
        }
        super.dlk();
    }

    public void dll() {
        super.dlk();
    }

    @Override
    protected void dlm() {
        if (this.ibX == null) {
            return;
        }
        Rh rh = this.ibX.bag();
        if (rh == null) {
            return;
        }
        byte by = this.bcQ();
        if (by == -1) {
            return;
        }
        Rj rj = rh.P(by);
        if (rj == null) {
            rh.i(this);
        } else if (rj != this) {
            pfX.error((Object)("Obstacle de meme id " + String.valueOf(rj) + " different de nous " + String.valueOf(this) + " id = " + by));
        }
    }

    public void dln() {
        fSe.gFu().a((aEF)this, iaU);
    }

    public int Xt() {
        if (this.ffF() == null) {
            return 0;
        }
        return this.ffF().Xt();
    }

    @Override
    public int dlo() {
        bJK bJK2 = bJJ.kmp.dN(this.pgh.getX(), this.pgh.getY());
        if (bJK2 == null || bJK2.doW() == null) {
            return 0;
        }
        return bJK2.doW().gfT();
    }

    @Override
    public int dlp() {
        bJK bJK2 = bJJ.kmp.dN(this.pgh.getX(), this.pgh.getY());
        return bJK2 != null ? bJK2.d() : -1;
    }

    public boolean dlq() {
        if (this.ibX == null) {
            return false;
        }
        return this.doc().Sg(977) != null;
    }

    @Override
    public int dlr() {
        int n = 0;
        if (this.ibX != null) {
            for (eUc eUc2 : this.ibX.dGs()) {
                bhx bhx2;
                if (!(eUc2 instanceof bhx) || !(bhx2 = (bhx)eUc2).dOp() || bhx2.doP() || bhx2.djY() != this || bhx2.i(eXe.rEX)) continue;
                n += bhx2.doQ().cqA();
            }
        } else {
            for (exP exP2 : this.aZn()) {
                if (!exP2.dOp() || exP2.doP() || exP2.i(eXe.rEX) || !(exP2 instanceof bhx)) continue;
                n += ((bhx)exP2).doQ().cqA();
            }
        }
        return n;
    }

    @NotNull
    public bwM dls() {
        return bwN.bD(this);
    }

    @Nullable
    public aKr dlt() {
        return null;
    }

    public void dlu() {
    }

    public void fS(boolean bl) {
        this.icr = bl;
    }

    public boolean dlv() {
        return this.icr;
    }

    public boolean dlw() {
        if (this.dkj()) {
            return false;
        }
        return !this.a(eXe.rDh) && this.a(eXe.rDg) || this.a(eXe.rDs);
    }

    public String dlx() {
        if (this.ict < 0) {
            return null;
        }
        return bft.dgp().a(this.ltt.aWP(), this.aWO(), this.dlz(), this.ict);
    }

    public String dly() {
        if (this.ics < 0) {
            return null;
        }
        return bft.dgp().o(this.ltt.aWP(), this.aWO(), this.ics);
    }

    public byte dlz() {
        return this.ics;
    }

    public void c(byte by, boolean bl) {
        this.ics = by;
        if (bl) {
            this.dkr();
        }
    }

    public byte dlA() {
        return this.ict;
    }

    public void d(byte by, boolean bl) {
        this.ict = by;
        if (bl) {
            this.dkr();
        }
    }

    public boolean dlB() {
        bsJ bsJ2;
        if (!this.ddI().isVisible()) {
            return false;
        }
        if (this.a(eXe.rEu)) {
            return false;
        }
        if (this.a(eXe.rEh)) {
            return false;
        }
        if (this.a(eXe.rEi) && (bsJ2 = this.ibX) != null) {
            for (bgy bgy2 : bsJ2.fKc()) {
                if (!bgy2.dOp() || !bgy2.a(eXe.rEh) || bgy2.djZ() != this) continue;
                return false;
            }
        }
        return true;
    }

    public int dlC() {
        return 900016;
    }

    public int dlD() {
        return 900019;
    }

    public void a(eXx ... eXxArray) {
        this.icn.c(eXxArray);
    }

    public biM dlE() {
        return this.icn;
    }

    public long dlF() {
        return 0L;
    }

    public short bEr() {
        return 0;
    }

    public void fT(boolean bl) {
        if (this.icz == bl) {
            return;
        }
        this.icz = bl;
        fSe.gFu().a((aEF)this, ibL);
    }

    @Nullable
    public bLH dlG() {
        return null;
    }

    public void dlH() {
        bLH bLH2 = this.dlG();
        if (bLH2 == null) {
            return;
        }
        bLH2.dlH();
    }

    @Override
    public /* synthetic */ exP dlI() {
        return this.djZ();
    }

    public /* synthetic */ exP b(long l, aCd aCd2, short s, ezw ezw2, Tw tw, boolean bl, ezG ezG2) {
        return this.a(l, aCd2, s, ezw2, tw, bl, ezG2);
    }

    @Override
    public /* synthetic */ ffB dlJ() {
        return this.dka();
    }

    @Override
    public /* synthetic */ exP js(long l) {
        return this.jq(l);
    }

    @Override
    public /* synthetic */ eTY dlK() {
        return this.dkZ();
    }

    @Override
    public /* synthetic */ exP dlL() {
        return this.djY();
    }

    @Override
    @NotNull
    public /* synthetic */ WQ dlM() {
        return this.ddI();
    }

    @Override
    public /* synthetic */ cPv dlN() {
        return this.djV();
    }
}

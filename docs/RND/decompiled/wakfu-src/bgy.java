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
implements pu_0,
RG,
rx_0,
aef_2,
ado_0,
cpu_2,
crd_1 {
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
    public bdj_2 hKX;
    private final ArrayList<cps_1> ibS = new ArrayList();
    private static final aex ibT = new bgz_0();
    public static final exx_2[] ibU = new exx_2[]{exx_2.rGD, exx_2.rGE, exx_2.rGF, exx_2.rGC};
    private boolean ibV;
    private ZH ibW;
    private bsj_0 ibX;
    private int ibY = -1;
    private bdg_1 ibZ;
    private cqR ica;
    protected final bmp_0 icb = new bmp_0();
    private bsi_0 icc;
    private bsz_0 icd;
    private final HashSet<bgy> ice = new HashSet();
    protected ArrayList<bMn> icf;
    protected ArrayList<bMn> icg;
    protected ArrayList<bMn> ich;
    protected ArrayList<bMn> ici;
    protected ArrayList<bMn> icj;
    protected ArrayList<bMn> ick;
    protected final bmn_0 icl;
    protected bgw_0 icm;
    protected bim_0 icn;
    private boolean ico;
    private boolean icp;
    private ZG icq;
    private boolean icr;
    private byte ics = (byte)-1;
    private byte ict = (byte)-1;
    private aex icu;
    private bgh_0 icv;
    private byte icw;
    protected bjm_1 icx;
    private boolean icy = true;
    private boolean icz = false;
    protected TByteIntHashMap icA;

    protected bgy() {
        this.ice.clear();
        this.ice.add(this);
        this.pgf.a(new baq_2(this));
        this.icl = new bmn_0();
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
        bdt_2 bdt_22 = this.hKX.ddm();
        bdt_22.ddO();
    }

    public void b(bgw_0 bgw_02) {
        if (this.icm == null) {
            this.icm = new bgw_0(this);
        }
        this.icm.a(bgw_02);
    }

    public int djx() {
        return 0;
    }

    public bgw_0 djy() {
        return this.icm;
    }

    public boolean djz() {
        return this.ico;
    }

    public boolean djA() {
        return this.i(exe_1.rFg);
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
        cco_0.a(bgy2.Sn(), bgy2.dlf(), true, false);
    }

    @Override
    public String toString() {
        return this.aZk();
    }

    @Override
    public long aZj() {
        return 0L;
    }

    public fi_1[] bes() {
        return new fi_1[]{fi_1.oX};
    }

    @Override
    public abstract eyg_0 djD();

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
            return bue_0.a(this.aWP(), this.aWO(), VI.bJF.d());
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
            return this.aFW() == 1 ? Integer.valueOf(this.a(exe_1.rDO) ? bja_1.drJ().bC(this.aWP()).crZ() : -1) : null;
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
            bsj_0 bsj_02 = this.ibX;
            if (bsj_02 == null) {
                return null;
            }
            int n = bsj_02.fKj();
            int n2 = bsj_02.dGQ().eB(this.Sn());
            int n3 = Math.max(0, bsj_02.dGQ().bhG());
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
            if (this.a(exe_1.rFq)) {
                return false;
            }
            fsf_1 fsf_12 = fse_1.gFu().getProperty("fight.displayHPBar");
            byte by = fsf_12 != null && fsf_12.bGI() >= 0 ? (byte)fsf_12.bGI() : (byte)((bsg_1)aie_0.cfn().bmH()).d(bsn_1.liS);
            if (by == bsa_1.lhh.emS()) {
                return true;
            }
            if (by == bsa_1.lhj.emS()) {
                return false;
            }
            exf_2 exf_22 = this.e(exx_2.rHu);
            exf_2 exf_23 = this.e(exx_2.rGi);
            exf_2 exf_24 = this.e(exx_2.rHp);
            return exf_22.aYB() > 0 || exf_23.aYB() + exf_24.aYB() < exf_23.aYD() + exf_24.aYD();
        }
        if (string.equals(ibJ)) {
            return this.dkQ();
        }
        if (string.equals(ibI)) {
            return this.fhi() > 0.0f ? aum_0.cWf().c("desc.healRes", (int)this.fhi()) : null;
        }
        if (string.equals(ibK)) {
            return this.aFW();
        }
        if (string.equals(ibj)) {
            return this.djA();
        }
        if (string.equals(ibk)) {
            return this.i(ezj_0.psW) || this.i(ezj_0.ptc);
        }
        if (ibv.equals(string)) {
            return this.djG();
        }
        if (ibL.equals(string)) {
            return this.icz;
        }
        if (ibN.equals(string)) {
            bfo_2 bfo_22 = this.dkD();
            if (bfo_22 == null) {
                return null;
            }
            return bfo_22.dgc();
        }
        if (ibO.equals(string)) {
            bfo_2 bfo_23 = this.dkD();
            if (bfo_23 == null) {
                return null;
            }
            return bfo_23.dgd();
        }
        if (this.icd != null) {
            return this.icd.eu(string);
        }
        return null;
    }

    private static Collection<bMn> C(ArrayList<bMn> arrayList) {
        Set<Short> set = ((bsg_1)aie_0.cfn().bmH()).g(bsn_1.ljs);
        LinkedHashSet<bMn> linkedHashSet = new LinkedHashSet<bMn>();
        for (bMn bMn2 : arrayList) {
            bmq_0 bmq_02;
            Qk qk = bMn2.eex();
            if (!(qk instanceof bmq_0) || !set.contains((bmq_02 = (bmq_0)qk).gjy())) continue;
            linkedHashSet.add(bMn2);
        }
        return linkedHashSet;
    }

    public int djE() {
        return Arrays.stream(ibU).map(exx_22 -> this.pgd.c((pt_0)exx_22)).max(Integer::compareTo).get();
    }

    public int djF() {
        return Arrays.stream(ibU).map(exx_22 -> this.pgd.c((pt_0)exx_22)).min(Integer::compareTo).get();
    }

    public bmq_0 djG() {
        int n;
        short[] sArray = this.ltt.ckM();
        if (sArray == null || sArray.length == 0) {
            return null;
        }
        ArrayList<bmq_0> arrayList = new ArrayList<bmq_0>();
        for (n = 0; n < sArray.length; n = (int)((short)(n + 3))) {
            short s = sArray[n];
            bmq_0 bmq_02 = (bmq_0)fqX.gjM().Zr(s);
            if (bmq_02 == null || !bmq_02.eeE()) continue;
            arrayList.add(bmq_02);
        }
        n = arrayList.size();
        if (n > 0) {
            if (n > 1) {
                pfX.warn((Object)String.format("Too much natural state provided for breed %s !", this.ltt.aWP()));
            }
            return (bmq_0)arrayList.get(0);
        }
        return null;
    }

    public String s(String string, int n) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(string).ceC().ih(awx_2.dnX.bQk()).c(" ").af(this.CH(n));
        try {
            eIm eIm2 = this.dnK();
            if (eIm2 != null && eIm2.fwt().tL() != -1) {
                ahv_22.a(auk_0.zU(116), 14, 16, null, null);
            }
        }
        catch (fu_0 fu_02) {
            pfX.error((Object)"Exception trying to getNameAndLevel", (Throwable)fu_02);
        }
        return ahv_22.ceL();
    }

    public String lG(String string) {
        return this.s(string, this.dnE());
    }

    public String ad(bgy bgy2) {
        return aum_0.cWf().c("fight.timeline.fighterDescription", bgy2.getName(), this.djJ(), this.ak(bgy2), this.ag(bgy2), this.ai(bgy2), this.ae(bgy2), this.al(bgy2));
    }

    private Object CH(int n) {
        return aum_0.cWf().c("levelShort.custom", n);
    }

    private Object djH() {
        return aum_0.cWf().c("levelShort.custom", this.cmL());
    }

    private Object djI() {
        return aum_0.cWf().c("levelShort.custom", this.dnG());
    }

    private Object djJ() {
        return this.CH(this.dnE());
    }

    public String ae(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        try {
            ahv_22.a(auk_0.zU(5), 16, 16, null).c(" ");
        }
        catch (fu_0 fu_02) {
            pfX.warn((Object)fu_02.getMessage());
            ahv_22.c(aum_0.cWf().c("WPShort", new Object[0])).c(" : ");
        }
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGl)).c("/").yx(bgy2.d(exx_2.rGl));
        return ahv_22.ceL();
    }

    public String af(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGl)).c("/").yx(bgy2.d(exx_2.rGl));
        return ahv_22.ceL();
    }

    public String ag(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        try {
            ahv_22.a(auk_0.zU(1), 16, 16, null).c(" ");
        }
        catch (fu_0 fu_02) {
            pfX.warn((Object)fu_02.getMessage());
            ahv_22.c(aum_0.cWf().c("APShort", new Object[0])).c(" : ");
        }
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGj)).c("/").yx(bgy2.d(exx_2.rGj));
        return ahv_22.ceL();
    }

    public String ah(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGj)).c("/").yx(bgy2.d(exx_2.rGj));
        return ahv_22.ceL();
    }

    public String ai(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        try {
            ahv_22.a(auk_0.zU(2), 16, 16, null).c(" ");
        }
        catch (fu_0 fu_02) {
            pfX.warn((Object)fu_02.getMessage());
            ahv_22.c(aum_0.cWf().c("MPShort", new Object[0])).c(" : ");
        }
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGk)).c("/").yx(bgy2.d(exx_2.rGk));
        return ahv_22.ceL();
    }

    public String aj(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGk)).c("/").yx(bgy2.d(exx_2.rGk));
        return ahv_22.ceL();
    }

    public Object ak(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(this.icn.h(exx_2.rGi).dqx());
        if (this.d(exx_2.rHp) != 0) {
            ahv_22.ceH().c(this.icn.h(exx_2.rHp).dqx());
        }
        return ahv_22.ceL();
    }

    public Object al(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        ahv_22.c(aum_0.cWf().c("INITShort", new Object[0])).c(" : ");
        ahv_22.yx(bgy2.c((pt_0)exx_2.rGI));
        return ahv_22.ceL();
    }

    public Object am(bgy bgy2) {
        ahv_2 ahv_22 = new ahv_2();
        int n = bgy2.c((pt_0)exx_2.rGB);
        ahv_22.c("Res.F").c(" : ");
        int n2 = bgy2.c((pt_0)exx_2.rGC) + n;
        ahv_22.yx(n2).c("% ");
        ahv_22.c("Res.E").c(" : ");
        n2 = bgy2.c((pt_0)exx_2.rGD) + n;
        ahv_22.yx(n2).c("% ");
        ahv_22.c("Res.T").c(" : ");
        n2 = bgy2.c((pt_0)exx_2.rGE) + n;
        ahv_22.yx(n2).c("% ");
        ahv_22.c("Res.V").c(" : ");
        n2 = bgy2.c((pt_0)exx_2.rGF) + n;
        ahv_22.yx(n2).c("%");
        return ahv_22.ceL();
    }

    public String djK() {
        bMn bMn2;
        int n;
        int n2;
        ahv_2 ahv_22 = new ahv_2();
        ArrayList<bMn> arrayList = this.djS();
        if (arrayList != null && arrayList.size() > 0) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                bMn2 = arrayList.get(n);
                ahv_22.a(bMn2.byf(), 16, 16, null);
            }
        }
        if ((arrayList = this.djR()) != null && arrayList.size() > 0) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                bMn2 = arrayList.get(n);
                ahv_22.a(bMn2.byf(), 16, 16, null);
            }
        }
        return ahv_22.bXe() > 0 ? ahv_22.ceL() : null;
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
        if (bjv_2.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return !this.ich.isEmpty() ? this.ich : null;
    }

    protected ArrayList<bMn> djO() {
        if (bjv_2.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return this.ici.isEmpty() ? null : this.ici;
    }

    protected ArrayList<bMn> djP() {
        if (bjv_2.aM(this)) {
            return null;
        }
        if (this.ich == null) {
            this.djL();
        }
        return this.icj.isEmpty() ? null : this.icj;
    }

    protected ArrayList<bMn> djQ() {
        if (bjv_2.aM(this)) {
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
        if (qD.d() == enf_0.qPC.d()) {
            return false;
        }
        if (qD.d() == enf_0.qTP.d()) {
            return false;
        }
        if (qD instanceof eQN) {
            return false;
        }
        if (qD.bbf() != null && qD.bbf().bab() == 1) {
            bmq_0 bmq_02 = (bmq_0)qD.bbf();
            return bmq_02.eeE();
        }
        int n = qD.bbf().bab();
        if (n == 16 || n == 18 || n == 26 || n == 28 || n == 34 || n == 30 || n == 32 || n == 33 || n == 19) {
            return true;
        }
        if (!this.djT()) {
            return false;
        }
        if (n == 12 && qD.bba() != null && ((enk_0)qD.bba()).fAt()) {
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
                if (aue_0.cVJ().cVK() != null && this.ibX != null && aue_0.cVJ().cVK().dkZ() == this.ibX) {
                    fse_1.gFu().a((aef_2)this, ibC);
                }
            } else {
                pfX.error((Object)"Tentative de modifier l'attribut isFightStateBarDisplayed avec une valeur non bool\u00e9enne");
            }
        }
        if (string.equals(iaO)) {
            this.setName(object.toString());
            fse_1.gFu().a((aef_2)this, iaO);
        }
    }

    @Override
    public boolean djT() {
        return (this.ibX != null || this.ibY != -1) && this.pgb;
    }

    public boolean djU() {
        return this.djT() && this.ibX.dGp() != etw_0.rqV && this.ibX.dGp() != etw_0.rqT;
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
            this.e((bsj_0)null);
        }
        this.pgb = n != -1;
    }

    protected void e(bsj_0 bsj_02) {
        this.ibX = bsj_02;
    }

    public bsz_0 djV() {
        return this.icd;
    }

    public void a(bsz_0 bsz_02) {
        this.icd = bsz_02;
    }

    public bgy a(long l, acd_1 acd_12, short s, ezw ezw2, tw_0 tw_02, boolean bl, ezg_0<exe_1> ezg_02) {
        bjz_1 bjz_12 = bja_1.drJ().bC(s);
        if (bjz_12 == null) {
            pfX.error((Object)("Impossible d'invoquer la cr\u00e9ature " + s + " : non enregistr\u00e9 dans le MonsterCharacteristicManager"));
            return null;
        }
        bgy bgy2 = bgg_0.dlO().ju(l);
        bgy bgy3 = bgy2 != null ? bgy2 : bhx_0.doA();
        this.a(bgy3, l, acd_12, ezw2, bl, bjz_12, tw_02, ezg_02);
        return bgy3;
    }

    private void a(bgy bgy2, long l, acd_1 acd_12, ezw ezw2, boolean bl, bjz_1 bjz_12, tw_0 tw_02, ezg_0<exe_1> ezg_02) {
        bgy2.dny();
        bgy2.c(tw_02);
        this.a(bgy2, l, acd_12, ezw2, bjz_12);
        bgy2.aPg();
        ezw2.a(bgy2, this);
        bgy2.a((byte)2);
        bgy bgy3 = bl ? bgy2 : this;
        if (ezg_02 != null && !ezg_02.aJG()) {
            if (bgy2.fgN() == null) {
                bgy2.fgl();
            }
            ezg_0<exe_1> ezg_03 = bgy2.fgN();
            for (byte by : ezg_02.aYU()) {
                exe_1 exe_12 = exe_1.Te(by);
                if (exe_12 != null) {
                    ezg_03.c(exe_12);
                    continue;
                }
                pfX.error((Object)("id d'une propri\u00e9t\u00e9 de base incorrect :" + by));
            }
        }
        byte by = ezw2.bcP() == -1 ? this.bcP() : ezw2.bcP();
        this.a(bgy2, bgy3, by);
        bgy2.ao(bgy3);
        bgg_0.dlO().ar(bgy2);
        bgy2.ddI().bd(bgy2.bcP());
        bgy2.ddI().i(bgy2.bcB());
        crt_2.c(this.ibX, bgy2);
        aJP.cig().a(bgy2, bgy2.ibY);
        btn_0.bx(bgy2);
        bgy2.dlk();
        bgy2.dkr();
        bgy.an(bgy2);
    }

    public static void an(bgy bgy2) {
        blh_2 blh_22 = bgy2.dlG();
        if (blh_22 == null) {
            return;
        }
        frd frd2 = bgy2.djZ().dnM();
        ezg_0<exe_1> ezg_02 = bgy2.fgN();
        if (ezg_02 != null && ((ps_0)ezg_02).a(exe_1.rFc) && frd2 != null) {
            ArrayList<bmx_0> arrayList = new ArrayList<bmx_0>();
            frd2.eEu().stream().map(n -> {
                if (n == 0) {
                    return null;
                }
                return bmb_0.eeV().h((int)n, bgy2.djZ().cmL());
            }).forEach(bmx_02 -> {
                if (bmx_02 == null) {
                    arrayList.add(null);
                    return;
                }
                bmx_0 bmx_03 = (bmx_0)bgy2.dkB().pc(bmx_02.avr());
                bmx_02.di(bmx_03 != null ? bmx_03.LV() : (long)bmx_02.avr());
                arrayList.add((bmx_0)bmx_02);
            });
            blh_22.aL(arrayList);
        } else {
            Iterable<bmx_0> iterable = bgy2.dkJ();
            blh_22.aL(Ordering.natural().onResultOf(new bma_0()::f).sortedCopy(iterable));
        }
    }

    private void a(bgy bgy2, long l, acd_1 acd_12, ezw ezw2, bjz_1 bjz_12) {
        bgy2.dC(l);
        bgy2.c(bjz_12);
        if (ezw2 != null) {
            bgy2.bw(ezw2.cmL());
            bgy2.aQ(ezw2.aWO());
        } else {
            pfX.warn((Object)("Charac null a l'initisalisation d'une invoc, uid : " + l));
        }
        bgy2.b(acd_12);
        abi_1 abi_12 = ezw2.bcB();
        if (abi_12 == abi_1.dzt) {
            bgy2.a(this.bcB());
        } else {
            bgy2.a(abi_12);
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
    public boolean a(eza_0 eza_02) {
        amg_1 amg_12;
        boolean bl = super.a(eza_02);
        if (bl) {
            amg_12 = this.ddI();
            this.icu = ((ads_0)amg_12).bvD();
            ((ads_0)amg_12).a(false, aea_0.cmr, aea_0.cmB);
            ((adj_0)amg_12).c(((ado_0)((Object)eza_02)).bvp());
            ((ZC)amg_12).a(new bga_0(this, eza_02, (bdj_2)amg_12));
        }
        amg_12 = aue_0.cVJ().cVK();
        if (this.dkQ()) {
            ((bgy)amg_12).dlH();
        }
        return bl;
    }

    @Override
    public boolean Q(acd_1 acd_12) {
        return this.b(acd_12, false);
    }

    @Override
    public boolean R(acd_1 acd_12) {
        return this.b(acd_12, true);
    }

    private void djW() {
        bdj_2 bdj_22 = this.ddI();
        bdj_22.dU(null);
        bdj_22.dcX().x(bdj_22);
        if (this.pgx == null) {
            pfX.trace((Object)"Essaye de d\u00e9poser alors qu'il ne porte personne");
            return;
        }
        if (this.pgx instanceof bhx_0 && ((bhx_0)this.pgx).aWP() == 3794) {
            bdj_22.dT("Anim03PorteTonneau");
        } else {
            bdj_22.dT("Anim04Porte");
        }
    }

    private boolean b(acd_1 acd_12, boolean bl) {
        return this.d(acd_12, bl, bl);
    }

    private boolean d(acd_1 acd_12, boolean bl, boolean bl2) {
        bdj_2 bdj_22 = this.ddI();
        if (bl) {
            this.djW();
        } else {
            bdj_22.dcX().x(bdj_22);
        }
        adj_0 adj_02 = bdj_22.a(bl2, acd_12);
        if (this.icu == null) {
            if (adj_02 == null) {
                pfX.error((Object)"On d\u00e9pose rien (?) . double uncarry ?");
            } else {
                pfX.error((Object)"Reset le movementSelector \u00e0 null (interdit!!)");
                bdj_22.a(aeB.bww());
            }
        } else {
            bdj_22.a(this.icu);
            this.icu = null;
        }
        return super.R(acd_12);
    }

    @Override
    public void djX() {
        bdj_2 bdj_22 = this.ddI();
        bdj_22.bvH();
        super.djX();
        bdj_22.buY();
    }

    @Override
    public void cZG() {
        super.cZG();
        this.ddI().dcX().A(this.ddI());
        biu_0 biu_02 = aue_0.cVJ().cVK().dpQ();
        if (biu_02 != null) {
            biu_02.aH(this);
        }
    }

    @Override
    public void a(ezz ezz2) {
        super.a(ezz2);
        this.ddI().a(aez.bwu());
        biu_0 biu_02 = aue_0.cVJ().cVK().dpQ();
        if (biu_02 != null) {
            biu_02.aG(this);
        }
    }

    @Override
    public void a(int n, Object object) {
        switch (n) {
            case 300: {
                this.e((bsj_0)object);
                this.ibY = this.ibX.d();
                this.djo();
                break;
            }
            case 301: {
                this.ibV = false;
                this.e((bsj_0)null);
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
    public void a(rl_0 rl_02) {
        switch (rl_02.d()) {
            case 1000: {
                ero_0 ero_02 = ((exe_2)rl_02).fOT();
                if (!this.z(ero_02)) break;
                this.fO(true);
                if (this != aue_0.cVJ().cVK() || !(ero_02 instanceof erh_0)) break;
                fqU fqU2 = ((erh_0)ero_02).fGk();
                if (fqU2 != null) {
                    bqm_0.jbp.b(new brk_0(fqU2.gjy()));
                    break;
                }
                pfX.warn((Object)"Etat inexistant on ne peut pas lancer l'\u00e9v\u00e8nement");
                break;
            }
            case 1002: {
                exg_2 exg_22 = (exg_2)rl_02;
                if (this != aue_0.cVJ().cVK()) break;
                for (Map.Entry<Long, QD> entry : exg_22.fOU().entrySet()) {
                    this.icb.c(entry.getValue(), entry.getKey());
                }
                this.icf = null;
                this.icg = null;
                this.ich = null;
                fse_1.gFu().a((aef_2)this, ibn, ibw, "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", ibo, ibp, ibq, ibr, ibs, ibt, ibu);
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
                fse_1.gFu().a((aef_2)this, ibn, ibw, "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", ibo, ibp, ibq, ibr, ibs, ibt, ibu);
                break;
            }
            case 101: {
                if (aue_0.cVJ().cVK() != this && this.dlw()) break;
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
        if (aue_0.cVJ().cVK() == null) {
            return;
        }
        this.icb.clear();
        this.icf = null;
        this.icg = null;
        this.ich = null;
        fse_1.gFu().a((aef_2)this, ibn, ibw, "breedCharacValue", "breedCharacDescription", "breedCharacImage", "breedCharacSmallImage", "breedCharacIconUrl", ibo, ibp, ibq, ibr, ibs, ibt, ibu);
    }

    @Override
    public cpm_1[] chR() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.ibS.size(); ++i) {
            arrayList.add(this.ibS.get(i).eLI());
        }
        return arrayList.toArray(new cpm_1[arrayList.size()]);
    }

    @Override
    public boolean chS() {
        return true;
    }

    @Override
    public Point chT() {
        aam_0 aam_02 = aie_0.cfn().bmC();
        acb_1 acb_12 = agi.c(aam_02, this.getWorldX(), this.getWorldY(), this.getAltitude() + (float)this.bcN());
        int n = GC.A(acb_12.aPY);
        int n2 = GC.A(acb_12.aPZ);
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
    protected fjn_0 dkb() {
        return bri_2.b(this);
    }

    @Override
    public fgD dkc() {
        return fgD.fXh();
    }

    @Override
    public boolean a(rw_0 rw_02, RG rG) {
        boolean bl;
        boolean bl2 = bl = !this.b(rw_02, rG);
        if (!bl) {
            pfX.warn((Object)("Action " + String.valueOf(rw_02) + " non prise en compte par ce CharacterInfo, type=" + this.getClass().getName() + ", id=" + this.Sn()));
        }
        return bl;
    }

    @Override
    public void c(rw_0 rw_02) {
        throw new UnsupportedOperationException("Les actions ne sont pas forward\u00e9e au serveur pour le moment, il existe encore des protocoles sous-jacents.");
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        throw new UnsupportedOperationException("Pas d'action cliente prise en compte sur ce type d'\u00e9l\u00e9ment interactif.");
    }

    @Override
    public rw_0 bdZ() {
        return null;
    }

    @Override
    public rw_0[] bea() {
        return rw_0.bly;
    }

    @Override
    public qm_0<enk_0> dkd() {
        qm_0<enk_0> qm_02 = super.dkd();
        if (qm_02 != null) {
            return qm_02;
        }
        if (this.ibY != -1 && this.pgb && bsU.dHk().Ft(this.ibY) != null) {
            return bsU.dHk().Ft(this.ibY).bbh();
        }
        return null;
    }

    @Override
    public qm_0<enk_0> dke() {
        return bas_2.cZC();
    }

    @Override
    public void b(qu_0 qu_02) {
    }

    @Override
    public void c(qu_0 qu_02) {
    }

    @Override
    public void d(qu_0 qu_02) {
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
            ers_0 ers_02 = this.doc();
            if (ers_02 != null) {
                ers_02.Sf(s2);
            }
            if ((s = sArray[n + 1]) == -1) {
                s = this.cmL();
            }
            QD.baX();
            eor_0 eor_02 = eor_0.a(this.pgf, this, s2, s, sArray[n + 2] == 0);
            eor_02.bbD();
            eor_02.e(this);
            eor_02.fCy();
            eor_02.a(null, false);
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
        this.e((bsj_0)null);
        this.ibY = -1;
        this.icd = null;
        this.ibZ = null;
        this.ica = null;
        this.icc = null;
        if (this.hKX != null) {
            this.hKX.ddm().ddP();
        }
        this.b((bdj_2)null);
        this.ice.clear();
        this.icb.clear();
        this.djv();
        bgg_0.dlO().c(this.icv);
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
        this.icn.c(exx_2.rGi);
    }

    @Override
    public void baG() {
        super.baG();
        if (this.hKX != null) {
            cxq_1.eWO().a(this.hKX);
        }
    }

    @Override
    public void baL() {
        if (this.hKX == null) {
            pfX.error((Object)"actor null ? ", (Throwable)new Exception());
        } else {
            cya_1.eYj().cp(this);
            this.hKX.dcV();
        }
        super.baL();
    }

    @Override
    public void a(ety_0 ety_02) {
        super.a(ety_02);
        if (this.ibX == null) {
            this.e((bsj_0)ety_02);
            this.ibY = this.ibX.d();
        }
        this.hKX.bg(ffS.sgS.shb);
        this.dkl();
    }

    @Override
    public void dkf() {
        Object object;
        super.dkf();
        this.a(new exf_1());
        if (this.doE()) {
            object = this.ddI();
            adn_0.bvh().j((adj_0)object);
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
    public void a(pr_0 pr_02) {
        pt_0 pt_02 = pr_02.aYQ();
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (pt_02.aYW() == 0) {
            switch ((exx_2)pr_02.aYQ()) {
                case rGi: 
                case rGk: {
                    if (aue_0.cVJ().c(cub_1.eSi())) {
                        cub_1.eSi().eSr();
                    }
                    if (aue_0.cVJ().c(cue_2.eSA())) {
                        cue_2.eSA().eSJ();
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
                    if (bgt_02 == null || !this.bvY() && this.fgk()) break;
                    this.c("updateShortcut", new bgb_0(this, bgt_02));
                }
            }
            switch ((exx_2)pr_02.aYQ()) {
                case rGi: 
                case rHu: 
                case rHp: 
                case rHr: {
                    fse_1.gFu().a((aef_2)this, ibH, "hpPercentage");
                    fse_1.gFu().a((aef_2)this.dlE(), ((exx_2)pr_02.aYQ()).name());
                }
            }
        }
    }

    @Override
    public void a(pv_0 pv_02, px_0 px_02) {
        if (pv_02 == null) {
            return;
        }
        if (pv_02.aZd() == 1) {
            switch ((exe_1)pv_02) {
                case rDY: {
                    this.icn.c(exx_2.rGj);
                    break;
                }
                case rDe: 
                case rEJ: 
                case rDJ: 
                case rDK: {
                    if (this.ibX == null || this.ibX != aue_0.cVJ().cVK().dmV()) break;
                    cub_1.eSi().eSr();
                    cue_2.eSA().eSJ();
                    break;
                }
                case rDs: 
                case rDg: {
                    boolean bl;
                    if (!this.dkj()) {
                        this.ddI().bqj();
                        if (this.fgN() != null) {
                            boolean bl2 = !this.a(pv_02);
                            this.ddI().setVisible(bl2);
                            if (bl2) {
                                this.ddI().dcU();
                            } else {
                                this.ddI().dcV();
                            }
                        }
                    }
                    crt_2.c(this.ibX, this);
                    bsj_0 bsj_02 = this.ibX;
                    if (bsj_02 == null) break;
                    fse_1.gFu().a((aef_2)this, ibH);
                    boolean bl3 = bl = !this.a(pv_02);
                    if (bl) {
                        ((btc_0)bsj_02.bag()).bu(this);
                        cxq_1.eWO().ci(this);
                        break;
                    }
                    ((btc_0)bsj_02.bag()).bt(this);
                    cxq_1.cj(this);
                    break;
                }
                case rFq: {
                    fse_1.gFu().a((aef_2)this, ibH);
                }
            }
        }
    }

    public boolean dkj() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        bsj_0 bsj_02 = bgt_02.dkZ();
        return this.bvY() || bsj_02 != null && bsj_02 == this.ibX && bgt_02.bcP() == this.bcP();
    }

    public boolean dkk() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return this.dkj() || bgt_02.dnB() != null && this.bcP() == 1;
    }

    @Override
    public void a(abi_1 abi_12) {
        this.ddI().a(abi_12);
        fse_1.gFu().a((aef_2)this, ibb);
    }

    @Override
    public void a(int n, int n2, short s) {
        super.a(n, n2, s);
        this.ddI().e(n, n2, s);
        cub_1.eSi().X(this);
    }

    @Override
    public void b(acd_1 acd_12) {
        this.a(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    public void b(int n, int n2, short s) {
        if (this.fgZ() != null) {
            ((bgy)this.fgZ()).d(new acd_1(n, n2, s), true, false);
        }
        this.b(n, n2, s, false);
    }

    public void b(int n, int n2, short s, boolean bl) {
        this.dkR();
        acd_1 acd_12 = new acd_1(n, n2, s);
        super.b(acd_12);
        this.ddI().a(acd_12, bl, false, false);
    }

    public abstract void dkl();

    public abstract void dkm();

    public void a(cps_1 cps_12) {
        this.ibS.add(cps_12);
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
        if (aue_0.cVJ().cVK().djT() && this.ibY != aue_0.cVJ().cVK().bqo()) {
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
            this.b((bdj_2)null);
        }
    }

    protected final void dko() {
        fse_1 fse_12 = fse_1.gFu();
        fse_12.a((aef_2)this, iaY, iaW, iaU, iaZ);
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
        amg_1 amg_12;
        if (this.icw > 0) {
            return;
        }
        try {
            amg_12 = this.hKX;
            if (amg_12 == null) {
                return;
            }
            if (((ZC)amg_12).bqd() == null) {
                return;
            }
            ((bdf_1)amg_12).dcL();
            ((ZC)amg_12).bqd().bHB();
            bdy_2 bdy_22 = ((bdj_2)amg_12).ddq();
            boolean bl2 = bl = (bdy_22 == null || bdy_22.hLX) && !((bdj_2)amg_12).ddr();
            if (bdy_22 == null) {
                ((bdf_1)amg_12).lf(Integer.toString(this.aVt()));
                this.dkx();
            } else {
                bdy_22.Z(this);
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
        amg_12 = aue_0.cVJ().cVK();
        boolean bl3 = this.ibX != null && amg_12 != null && ((bgt_0)amg_12).dmV() == this.ibX;
        boolean bl4 = bl = this.ibX != null && this.ibX.dGp() != etw_0.rqW;
        if (bl3 && bl) {
            bve_0.dKK().kN(this.aXv);
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
        fjn_0 fjn_02 = this.ffF();
        fkL fkL2 = fjn_02.emF();
        if (fkL2 == null) {
            return;
        }
        bda_1.a(fkL2, fjn_02.Xt(), new bgc_0(this));
    }

    protected void dkv() {
        eid_0 eid_02 = this.dpX();
        if (eid_02 != null && eid_02.dsm() == 16) {
            bkg_2 bkg_22 = (bkg_2)eid_02;
            bkg_22.dsQ();
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
                string4 = auc_0.cVq().bS("ANMEquipmentPath");
            }
            catch (fu_0 fu_02) {
                pfX.error((Object)"Erreur au chargement d'une propri\u00e9t\u00e9", (Throwable)fu_02);
                return;
            }
            if (string != null) {
                string3 = String.format(string4, string);
                this.ddI().b(string3, ary_2.fT(ibR));
            }
            if (string2 != null) {
                string3 = String.format(string4, string2);
                this.ddI().b(string3, ary_2.fT(ibQ));
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
            bgv_2 bgv_22 = (bgv_2)fgD.fXh().Vd(n);
            if (bgv_22 == null) {
                pfX.error((Object)("Le ReferenceItem d'id " + n + " n'existe pas"));
                continue;
            }
            this.ddI().a(bgv_22, (short)by);
        }
    }

    public fqP<bmx_0> dkB() {
        return null;
    }

    @Override
    public void CK(int n) {
        super.CK(n);
        for (eyk_0 eyk_02 : this.pga) {
            eyk_02.j(this);
        }
    }

    protected void a(ewr_0 ewr_02) {
        ewo_0.oBF.a((ewr_0 ewr_03, Object object) -> {
            if (ewr_03 != ewr_02) {
                return;
            }
            this.bvp().bP(ewo_0.oBF.p(ewr_02));
        });
    }

    public fpu_0 dkC() {
        return fpu_0.sRd;
    }

    public bfo_2 dkD() {
        return bfq_2.dge().BO(this.doV().aWP());
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
        return caf_2.lFq.rV(l);
    }

    public boolean dkH() {
        long l = this.Ya();
        return caf_2.lFq.X(this.aHT, l);
    }

    public bmd_1 dkI() {
        return null;
    }

    public bmx_0 jr(long l) {
        return null;
    }

    public Iterable<bmx_0> dkJ() {
        return null;
    }

    @Override
    public boolean d(int n, short s) {
        if (!this.dkN()) {
            pfX.error((Object)"Trying to add a spell to a temporary inventory, but no temporary inventory");
            return false;
        }
        bmt_0 bmt_02 = bmb_0.eeV().If(n);
        if (bmt_02 == null) {
            pfX.error((Object)("Trying to add spell " + n + " to temporary inventory, but this spell doesn't exist"));
            return false;
        }
        bmx_0 bmx_02 = new bmx_0(bmt_02, s, bmt_02.d(), this);
        try {
            if (!((Sg)this.dkI().eek()).b(bmx_02)) {
                return false;
            }
        }
        catch (sa_0 sa_02) {
            pfX.error((Object)"Exception levee", (Throwable)sa_02);
            return false;
        }
        catch (Sz sz) {
            pfX.error((Object)"Exception levee", (Throwable)sz);
            return false;
        }
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy2 = cul_2.eST().eSH();
        if (bgy2 == this && (this.djZ() == bgt_02 || this.dkQ())) {
            blh_2 blh_22 = bgt_02.dlG();
            blh_22.a(this.dkI().eek());
            blh_22.dlH();
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
        bjz_1 bjz_12 = bja_1.drJ().bC((short)n);
        if (bjz_12 == null) {
            return;
        }
        ArrayList<azr_1<bmt_0>> arrayList = bjz_12.dry();
        short s = switch (eyc2) {
            case eyc.phd -> this.cmL();
            default -> bjz_12.cqz();
        };
        ArrayList<bmx_0> arrayList2 = new ArrayList<bmx_0>();
        for (azr_1<bmt_0> azr_12 : arrayList) {
            bmt_0 bmt_02 = azr_12.aHI();
            bmx_0 bmx_02 = new bmx_0(bmt_02, s, bmt_02.d(), this);
            arrayList2.add(bmx_02);
        }
        this.dkI().a(arrayList2, this);
    }

    public boolean dkL() {
        return this.a((bti_0)null);
    }

    public boolean a(bti_0 bti_02) {
        if (this.ibX == null) {
            return false;
        }
        bth_0 bth_02 = this.ddI().dcX();
        if (bth_02 instanceof btm_0) {
            return false;
        }
        btm_0 btm_02 = new btm_0(this);
        if (bti_02 != null) {
            btm_02.b(bti_02);
        }
        if (bth_02 != null) {
            btn_0.d(this.ddI(), btm_02);
            return true;
        }
        this.ddI().a(btm_02);
        btm_02.x(this.ddI());
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
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02 == null) {
            return false;
        }
        bgy bgy2 = this.djY();
        if (bgy2 == this) {
            return this.Xi() == bgt_02.Xi();
        }
        return bgy2.Xi() == bgt_02.Xi() || bgy2.dkQ();
    }

    public void dkR() {
        if (this.ibZ != null) {
            bdj_2 bdj_22 = this.ddI();
            if (bdj_22 == null) {
                return;
            }
            bdj_22.c(this.ibZ);
            this.ibZ = null;
        }
    }

    public void dkS() {
        Object object;
        if (this.aFW() == 5) {
            object = this.e(exx_2.rGi);
            ((exf_2)object).op(((exf_2)object).aYE());
        }
        object = this.ddI();
        boolean bl = false;
        if (this.doP()) {
            bl = true;
            ((bdj_2)object).a(btl_0.dHL());
        } else {
            String string = ((ZC)object).bkI();
            if (this.doP() && string.equalsIgnoreCase("AnimKO-SortieHS") || string.equalsIgnoreCase("AnimKO-Debut") || this.doP() && string.equalsIgnoreCase("AnimDesincarnation") || this.doP() && string.equalsIgnoreCase("AnimTombe") || string.equalsIgnoreCase("AnimEmote-Victoire")) {
                bl = true;
            }
        }
        if (!this.doP()) {
            if (bl) {
                ((bdj_2)object).a(btl_0.dHL());
                btl_0.dHL().u((bdj_2)object);
            } else {
                btn_0.d((bdj_2)object, btl_0.dHL());
            }
        }
        ((ads_0)object).bvH();
        ((bdf_1)object).fr(false);
        ((ZC)object).bR(((ZC)object).bqk());
        ((ZC)object).bpV();
        ((ads_0)object).bvt();
        ((bdj_2)object).dcW();
        ((bdj_2)object).setVisible(true);
        ((bdj_2)object).fs(false);
    }

    public void f(bsi_0 bsi_02) {
        this.icc = bsi_02;
        if (bsi_02 != null) {
            this.ibY = bsi_02.d();
            this.pgb = true;
        } else {
            this.ibY = -1;
            this.pgb = false;
        }
    }

    public void a(cqR cqR2) {
        this.ica = cqR2;
    }

    public void j(abi_1 abi_12) {
        boolean bl;
        assert (abi_12 != null);
        boolean bl2 = bl = this.bcB() != abi_12;
        if (bl) {
            super.a(abi_12);
            fse_1.gFu().a((aef_2)this, ibb);
        }
    }

    public void fQ(boolean bl) {
        this.ibV = bl;
    }

    public void T(int n, int n2, short s) {
        super.a(n, n2, s);
        cub_1.eSi().X(this);
    }

    public void a(bdg_1 bdg_12) {
        if (bdg_12 == null) {
            return;
        }
        bdj_2 bdj_22 = this.ddI();
        if (bdj_22 == null) {
            return;
        }
        this.ibZ = bdg_12;
        bdj_22.b(this.ibZ);
    }

    @Nullable
    public ZG dkT() {
        if (this.icq == null) {
            ZG zG = new ZG(aym_2.bSE(), this.ddI().getWorldX(), this.ddI().getWorldY(), this.ddI().getAltitude());
            String string = this.dkU();
            try {
                zG.k(String.format(auc_0.cVq().bS(this.dkV()), string), true);
            }
            catch (IOException iOException) {
                pfX.error((Object)"", (Throwable)iOException);
                zG.bpI();
                return null;
            }
            catch (fu_0 fu_02) {
                pfX.error((Object)"", (Throwable)fu_02);
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
    public bdj_2 ddI() {
        if (this.hKX == null) {
            this.b(new bdj_2(this));
            if (this.bcO() >= 1) {
                this.hKX.a(ibT);
            }
        }
        return this.hKX;
    }

    @Override
    public adj_0 bvp() {
        return this.ddI();
    }

    public bsi_0 dkW() {
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

    public bsj_0 dkZ() {
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

    public bmp_0 dlc() {
        return this.icb;
    }

    public void b(bdj_2 bdj_22) {
        if (bdj_22 == this.hKX) {
            return;
        }
        if (this.hKX != null) {
            adn_0.bvh().j(this.hKX);
            this.hKX.aZp();
        }
        this.hKX = bdj_22;
        if (this.icy && this.hKX != null) {
            adn_0.bvh().g(this.hKX);
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
            bgg_0 bgg_02 = bgg_0.dlO();
            bgy bgy2 = bgg_02.ju(l = ezw2.fmF());
            if (bgy2 == null && this.icv == null) {
                this.icv = new bgd_0(this, l, ezw2, bgg_02);
                bgg_02.a(this.icv);
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

    public void a(bsj_0 bsj_02, byte[] byArray, byte[] byArray2) {
        this.a(byArray2, false, bsj_02);
        this.a(byArray, true);
    }

    public void dU(byte[] byArray) {
        this.a(byArray, true, null);
    }

    public void a(byte[] byArray, boolean bl, ety_0 ety_02) {
        int n = this.c((pt_0)exx_2.rGi);
        this.dp(byArray);
        if (!this.doE()) {
            this.dmg();
        }
        if (bl) {
            this.dlh();
        } else {
            ban_2.D(this.dli());
        }
        if (!bl && ety_02 != null) {
            this.e(ety_02.bbh());
        }
        this.OC(n);
    }

    public void a(byte[] byArray, boolean bl) {
        ezg_0<exe_1> ezg_02 = this.fgN();
        if (ezg_02 != null) {
            ezg_02.reset();
        }
        this.eu(byArray);
        if (bl) {
            this.fgm();
        }
        this.dkl();
        exx_2[] exx_2Array = exx_2.values();
        for (int i = 0; i < exx_2Array.length; ++i) {
            exx_2 exx_22 = exx_2Array[i];
            exf_2 exf_22 = this.e(exx_22);
            exf_22.aYT();
        }
    }

    private void dlh() {
        LinkedList<QD> linkedList = this.dli();
        this.a(linkedList);
    }

    private void a(LinkedList<QD> linkedList) {
        for (int i = 0; i < linkedList.size(); ++i) {
            QD qD = linkedList.get(i);
            if (qD instanceof erh_0) {
                qD.bbr();
            }
            qD.bbF();
            ero_0 ero_02 = (ero_0)qD;
            if (!ero_02.fHo()) continue;
            ero_02.d(null, false);
        }
    }

    private LinkedList<QD> dli() {
        Iterator<QD> iterator = this.doc().iterator();
        LinkedList<QD> linkedList = new LinkedList<QD>();
        while (iterator.hasNext()) {
            QD qD = iterator.next();
            if (qD instanceof erh_0) {
                linkedList.addFirst(qD);
                continue;
            }
            linkedList.addLast(qD);
        }
        return linkedList;
    }

    public final void dlj() {
        List<erh_0> list = this.g(this.pgf);
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
        rh_0 rh_02 = this.ibX.bag();
        if (rh_02 == null) {
            return;
        }
        byte by = this.bcQ();
        if (by == -1) {
            return;
        }
        rj_0 rj_02 = rh_02.P(by);
        if (rj_02 == null) {
            rh_02.i(this);
        } else if (rj_02 != this) {
            pfX.error((Object)("Obstacle de meme id " + String.valueOf(rj_02) + " different de nous " + String.valueOf(this) + " id = " + by));
        }
    }

    public void dln() {
        fse_1.gFu().a((aef_2)this, iaU);
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
            for (euc_1 euc_12 : this.ibX.dGs()) {
                bhx_0 bhx_02;
                if (!(euc_12 instanceof bhx_0) || !(bhx_02 = (bhx_0)euc_12).dOp() || bhx_02.doP() || bhx_02.djY() != this || bhx_02.i(exe_1.rEX)) continue;
                n += bhx_02.doQ().cqA();
            }
        } else {
            for (exP exP2 : this.aZn()) {
                if (!exP2.dOp() || exP2.doP() || exP2.i(exe_1.rEX) || !(exP2 instanceof bhx_0)) continue;
                n += ((bhx_0)exP2).doQ().cqA();
            }
        }
        return n;
    }

    @NotNull
    public bwm_0 dls() {
        return bwn_0.bD(this);
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
        return !this.a(exe_1.rDh) && this.a(exe_1.rDg) || this.a(exe_1.rDs);
    }

    public String dlx() {
        if (this.ict < 0) {
            return null;
        }
        return bft_2.dgp().a(this.ltt.aWP(), this.aWO(), this.dlz(), this.ict);
    }

    public String dly() {
        if (this.ics < 0) {
            return null;
        }
        return bft_2.dgp().o(this.ltt.aWP(), this.aWO(), this.ics);
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
        bsj_0 bsj_02;
        if (!this.ddI().isVisible()) {
            return false;
        }
        if (this.a(exe_1.rEu)) {
            return false;
        }
        if (this.a(exe_1.rEh)) {
            return false;
        }
        if (this.a(exe_1.rEi) && (bsj_02 = this.ibX) != null) {
            for (bgy bgy2 : bsj_02.fKc()) {
                if (!bgy2.dOp() || !bgy2.a(exe_1.rEh) || bgy2.djZ() != this) continue;
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

    public void a(exx_2 ... exx_2Array) {
        this.icn.c(exx_2Array);
    }

    public bim_0 dlE() {
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
        fse_1.gFu().a((aef_2)this, ibL);
    }

    @Nullable
    public blh_2 dlG() {
        return null;
    }

    public void dlH() {
        blh_2 blh_22 = this.dlG();
        if (blh_22 == null) {
            return;
        }
        blh_22.dlH();
    }

    @Override
    public /* synthetic */ exP dlI() {
        return this.djZ();
    }

    public /* synthetic */ exP b(long l, acd_1 acd_12, short s, ezw ezw2, tw_0 tw_02, boolean bl, ezg_0 ezg_02) {
        return this.a(l, acd_12, s, ezw2, tw_02, bl, ezg_02);
    }

    @Override
    public /* synthetic */ ffb_0 dlJ() {
        return this.dka();
    }

    @Override
    public /* synthetic */ exP js(long l) {
        return this.jq(l);
    }

    @Override
    public /* synthetic */ ety_0 dlK() {
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
    public /* synthetic */ cpv_2 dlN() {
        return this.djV();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bhx
 */
public class bhx_0
extends bgy
implements pu_0,
qe_0,
fpZ {
    static final String[] igC = new String[]{"shortcutBarManager"};
    public static final String[] igD = new String[igC.length + bgy.ibP.length];
    private final ArrayList<cps_1> igE = new ArrayList<cps_1>(Arrays.asList(cps_1.niy, cps_1.niC, cps_1.niE, cps_1.njA, cps_1.niz, cps_1.niZ, cps_1.nja, cps_1.njb, cps_1.nji, cps_1.nje));
    private static final azz_1<cqs_2> igF;
    public static final boolean igG = true;
    short ejt;
    private final bMm igH = new bMm();
    private final float igI = 0.0f;
    private final eys_0 igJ = new eys_0();
    long aZA;
    private aWc igK;
    final TIntHashSet igL = new TIntHashSet();
    short igM = (short)-1;
    short igN = (short)-1;
    private bjf_2 igO = null;
    long igP;
    long igQ;
    private eiz_0<bhx_0> ieU;
    private bgp_0 ifb;
    private final blh_2 igR = new blh_2();

    protected bhx_0() {
        this.asf = 1;
        this.dmI();
        this.aZA = 0L;
        this.ltt = bjz_1.ioB;
        int n = ewo_0.oBF.i(ewr_0.oCn);
        if (n > 0) {
            this.CK(n);
        }
        this.a(ewr_0.oCp);
    }

    public static bhx_0 doA() {
        return new bhx_0();
    }

    @Override
    public boolean dmh() {
        return true;
    }

    @Override
    public void dmg() {
        if (this.ltt instanceof bjz_1) {
            bjz_1 bjz_12 = (bjz_1)this.ltt;
            this.pgd = new exy_2(bjz_12.fhP(), this.ejt);
            this.icn = new bim_0(this);
            fse_1.gFu().a((aef_2)this, "characteristics");
        }
        if (this.ieU != null) {
            this.ieU.fwU();
        }
    }

    @Override
    public void doB() {
        super.doB();
        this.dkl();
        exx_2[] exx_2Array = exx_2.values();
        for (int i = 0; i < exx_2Array.length; ++i) {
            exx_2 exx_22 = exx_2Array[i];
            this.a(this.e(exx_22));
        }
        this.igH.a(((bjz_1)this.ltt).dry(), (short)(this.ejt / 2), this);
        aue_0.cVJ().cVK().dlH();
        fse_1.gFu().a((aef_2)this, "level", "levelValue", "nameAndLevel");
    }

    @Override
    public fqr_0 a(byte by, short s, fqE fqE2) {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (this.djY().Xi() != bgt_02.Xi()) {
            return null;
        }
        blg_2 blg_22 = this.igR.c(fqt_0.sTd, by);
        if (blg_22 == null) {
            pfX.error((Object)String.format("[FIGHT] Trying to add a spell %d to shortcut bar %d / %d but this bar doesn't exist", fqE2.avr(), by, s));
            return null;
        }
        blb_2 blb_22 = blb_2.a(fqu_0.sTq, fqE2.LV(), fqE2.avr(), fqE2.aVt());
        blg_22.a(blb_22, s == -1 ? blg_22.beO() : s);
        blg_22.ecY();
        if (this.igR == cxx_2.eXH().dlG()) {
            cxx_2.eXH().ek(by);
        }
        return blb_22;
    }

    @Override
    @NotNull
    public blh_2 dlG() {
        return this.igR;
    }

    @Override
    public long aZx() {
        return this.Sn();
    }

    @Override
    public qa_0 aZy() {
        return emh_0.qMU;
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

    @Override
    public eyg_0 djD() {
        return bja_1.drJ();
    }

    @Override
    @Nullable
    public fgd_0 doC() {
        eJS eJS2 = eJN.qAF.pR(this.igQ);
        if (eJS2 == null) {
            return null;
        }
        return eJS2.dme();
    }

    @Override
    @Nullable
    public TByteIntHashMap dkE() {
        TByteIntHashMap tByteIntHashMap = super.dkE();
        if (tByteIntHashMap != null) {
            return tByteIntHashMap;
        }
        if (this.ltt != null) {
            return ((bjz_1)this.ltt).dkE();
        }
        return null;
    }

    @Nullable
    public bJr doD() {
        ArrayList arrayList = new ArrayList();
        bjx_0.klY.a((? super TProtector bJr2) -> bJr2.cXe() == this.Sn(), arrayList);
        return !arrayList.isEmpty() ? (bJr)arrayList.get(0) : null;
    }

    @Override
    public int aVt() {
        if (this.ltt == null || !(this.ltt instanceof bjz_1)) {
            return 0;
        }
        int n = super.aVt();
        if (n != 0) {
            return n;
        }
        return ((bjz_1)this.ltt).aGs();
    }

    @Override
    public bmx_0 jr(long l) {
        return this.igH.jr(l);
    }

    @Override
    public Iterable<bmx_0> dkJ() {
        ezw ezw2 = this.ffE();
        if (ezw2 == null) {
            return this.igH.bL(this);
        }
        long l = ezw2.fmF();
        if (l == -1L) {
            return this.igH.bL(this);
        }
        bgy bgy2 = bgg_0.dlO().ju(l);
        if (bgy2 == null) {
            return this.igH.bL(this);
        }
        return this.igH.bL(bgy2);
    }

    @Override
    protected String dkU() {
        return "Smiley_" + this.aWP();
    }

    @Override
    protected String dkV() {
        return "npcGfxPath";
    }

    @NotNull
    public String csl() {
        return ((bjz_1)this.ltt).csl();
    }

    @Override
    public void aPg() {
        if (this.ltt == null) {
            pfX.error((Object)"On essaie d'initialiser un monster qui ne possede pas de BreedInfo");
            return;
        }
        bjz_1 bjz_12 = (bjz_1)this.ltt;
        bdj_2 bdj_22 = this.ddI();
        bdj_22.at((byte)4);
        bdj_22.ck(false);
        if (this.p == null || this.p.isEmpty()) {
            this.setName(bjz_12.getName());
        }
        this.igH.a(bjz_12.dry(), this.ejt, this);
        if (this.doU() || this.djT()) {
            this.dmg();
        }
        this.b(bjz_12);
        this.a(bjz_12);
    }

    @Override
    protected void ao(bgy bgy2) {
        if (this.a(exe_1.rEV) && bgy2 != null) {
            blr_1.a(this, bgy2);
        }
    }

    private void b(bjz_1 bjz_12) {
        if (bjz_12.fhO() != null) {
            for (int n : bjz_12.fhO()) {
                ezj_0 ezj_02 = ezj_0.Pl(n);
                if (ezj_02 != null) {
                    this.h(ezj_02);
                    this.f(ezj_02);
                    continue;
                }
                pfX.error((Object)("id d'une propri\u00e9t\u00e9 de base (World) incorrect :" + n));
            }
        }
    }

    @Override
    protected void dmI() {
        super.dmI();
        new bha_0(this, this.igJ.fkv());
        new bhb_0(this, this.igJ.fkx());
        new bhb_0(this, this.igJ.fkw());
        new bhE(this, this.igJ.fiz());
        new bhf_0(this, this.igJ.fky());
        new bhg_0(this, this.igJ.fkz());
        new bhc_0(this, this.igJ.fkA());
        new bhD(this, this.igJ.fkB());
    }

    @Override
    public boolean doE() {
        return super.doE() || this.igQ > 0L;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ieU = null;
    }

    @Override
    public void baL() {
        super.baL();
        if (this.doE()) {
            this.doF();
        }
    }

    @Override
    protected void dny() {
        if (this.fhp() != eyh_0.pka) {
            return;
        }
        this.a(new bhh_0());
    }

    @Override
    public void a(ety_0 ety_02) {
        Optional<eIi> optional;
        this.dny();
        if (!this.doU()) {
            this.dmg();
        }
        super.a(ety_02);
        if (this.igK != null) {
            this.igK.cXd();
            this.igK = null;
        }
        if (this.doQ() != null) {
            optional = (bjz_1)this.ltt;
            this.a((eyp)((Object)optional));
            this.d((eyp)((Object)optional));
        }
        if (this.a(eyp_0.pmQ) && this.Xi() == aue_0.cVJ().cVO().xl() && this.doC() != null) {
            optional = eJW.as(this);
            optional.ifPresent(eIi2 -> aPd.g("companion.defaultEquipmentUsedInfo", this.getName(), eIi2.cmL()));
        }
        if ((optional = this.djY()) != null && ((bgy)((Object)optional)).dkQ()) {
            bhx_0.an(this);
        }
    }

    @Override
    public void dkX() {
        this.dmg();
    }

    @Override
    public final void ge(boolean bl) {
        this.doc().Se(25);
        if (this.djT() && this.dkZ() != null && !this.dkZ().dGo().fLm()) {
            return;
        }
        Iterable<bmx_0> iterable = this.dkJ();
        if (bl) {
            this.e(exx_2.rGi).fOA();
        }
        List<Long> list = ewo_0.oBF.o(ewr_0.oDD);
        for (fqE fqE2 : iterable) {
            Object Spell = fqE2.giP();
            if (fqE2.cmL() <= 0 && !((fqD)Spell).giL() || !((fqD)Spell).eeY() || list.contains(((fqD)Spell).d())) continue;
            fqE fqE3 = fqE2;
            for (enk_0 enk_02 : fqE3) {
                enk_02.a(fqE2, this, this.bdV(), enf_0.fBb(), this.bcC(), this.bcD(), this.bcE(), this, null, false);
            }
        }
        if (bl) {
            this.e(exx_2.rGi).fOB();
        }
    }

    @Override
    public void dkf() {
        aef_2 aef_22;
        if (this.dOn() && ((exP)((Object)(aef_22 = this.djZ()))).doV() == eym.phX) {
            this.ae((exP)((Object)aef_22));
        }
        super.dkf();
        if (this.doQ() != null && !this.doP()) {
            this.a(this.doQ());
        }
        if (!this.baM()) {
            this.fgM().aYH();
        }
        if (this.ffT()) {
            long l = this.Sn();
            this.dkZ().a(new bhz(this, l));
        } else {
            this.dkS();
            aef_22 = this.dkZ();
            if (this.doP()) {
                if (!((bsj_0)aef_22).kw(this.Sn())) {
                    this.doF();
                } else {
                    this.gf(false);
                    this.dkS();
                }
            }
        }
    }

    public void doF() {
        if (this.djT()) {
            this.djY().dlu();
        }
        bdj_2 bdj_22 = this.ddI();
        if (this.doE() || this.a(ezj_0.psI) || !this.doQ().crI()) {
            bdj_22.setVisible(false);
            bdj_22.fs(true);
            bjl_1.dri().a(this, true);
        } else {
            bjn_2.drQ().pu(this.aXv);
            bjn_2.drQ().a(this, ezj_0.psF);
            bjl_1.dri().a(this, true);
            bdj_22.dT("AnimStatiqueCadavre");
            bdj_22.setVisible(true);
            bdj_22.qR(afX.csl.byy());
        }
    }

    @Override
    protected eyp dmk() {
        return bjz_1.ioB;
    }

    @Override
    protected byte dml() {
        return 1;
    }

    @Override
    public void setName(String string) {
        if ((string == null || string.length() == 0) && this.ltt instanceof bjz_1) {
            string = ((bjz_1)this.ltt).getName();
        }
        super.setName(string);
    }

    @Override
    @NotNull
    public ejg_0 dmn() {
        return ejd_0.qyt;
    }

    public short doG() {
        if (this.ltt == null) {
            return 0;
        }
        return this.ltt.aWP();
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public float dmm() {
        return 0.0f;
    }

    @Override
    public eyl_0 dmj() {
        return this.igJ;
    }

    public bMm doH() {
        return this.igH;
    }

    @Override
    public fqP<bmx_0> dkB() {
        return this.igH.ees();
    }

    @Override
    public void bw(short s) {
        this.ejt = s;
    }

    public long aXa() {
        return this.aZA;
    }

    public void da(long l) {
        this.aZA = l;
    }

    public aWc doI() {
        return this.igK;
    }

    public void a(aWc aWc2) {
        this.igK = aWc2;
    }

    @Override
    public void gf(boolean bl) {
        super.gf(bl);
    }

    @Override
    protected fjn_0 dkb() {
        return new flt_0(this);
    }

    public boolean CU(int n) {
        return !this.igL.contains(n);
    }

    public void u(int n, boolean bl) {
        if (bl) {
            this.igL.remove(n);
        } else {
            this.igL.add(n);
        }
    }

    @Override
    public boolean doJ() {
        if (!(this.ffE() instanceof blu_1)) {
            return true;
        }
        bgy bgy2 = this.djZ();
        return bgy2 == null || bgy2 == this || bgy2.doJ();
    }

    @Override
    public int cqy() {
        return this.ltt.cqy();
    }

    public long doK() {
        return this.igP;
    }

    public long doL() {
        return this.igQ;
    }

    public void jI(long l) {
        this.igQ = l;
    }

    public void a(eiz_0<bhx_0> eiz_02) {
        this.ieU = eiz_02;
    }

    public eiz_0<bhx_0> dnl() {
        return this.ieU;
    }

    @Override
    public boolean bwb() {
        return false;
    }

    @Override
    public Iterable<? extends fqE> doM() {
        if (this.igQ > 0L) {
            return this.igH.dkJ();
        }
        return null;
    }

    public void B(short s, short s2) {
        bjz_1 bjz_12 = bja_1.drJ().bC(s);
        this.c(bjz_12);
        this.bw(s2);
        bdj_2 bdj_22 = new bdj_2(this);
        this.b(bdj_22);
        ezg_0<ezj_0> ezg_02 = this.fgT();
        if (ezg_02 != null) {
            ezg_02.reset();
        }
        this.aPg();
        bdj_22.bpC();
        bji_1 bji_12 = bjl_1.dri().jO(this.aXa());
        if (bji_12 != null) {
            bji_12.b(this);
        }
    }

    @Override
    public byte dlf() {
        return 1;
    }

    public short doN() {
        if (this.igM > 0) {
            return this.igM;
        }
        if (this.ltt instanceof bjz_1) {
            return (short)Math.min(((bjz_1)this.ltt).doN(), 6);
        }
        return 0;
    }

    public short crL() {
        if (this.igN > 0) {
            return this.igN;
        }
        if (this.ltt instanceof bjz_1) {
            return (short)Math.min(((bjz_1)this.ltt).crL(), 6);
        }
        return 0;
    }

    public boolean doO() {
        return this.crL() > 0 && this.doN() > 0;
    }

    @Override
    public boolean doP() {
        return super.doP() || this.a(ezj_0.psF);
    }

    public void aF(bgy bgy2) {
    }

    public bjz_1 doQ() {
        if (!(this.ltt instanceof bjz_1)) {
            pfX.error((Object)("Un NPC n'a pas de breed de type MonsterBreed " + String.valueOf(this.ltt) + ", mob ID = " + this.aXv));
        }
        return (bjz_1)super.doV();
    }

    @Override
    protected void dkv() {
        super.dkv();
        bjk_2.b(this.doR(), this);
        bjk_2.b(this.doS(), this);
    }

    @Override
    protected void dkw() {
        super.dkw();
        bjk_2.c(this.doR(), this);
        bjk_2.c(this.doS(), this);
    }

    @Override
    protected void dkx() {
        super.dkx();
        bjk_2.a(this.doR(), this);
        bjk_2.a(this.doS(), this);
    }

    public bjf_2 doR() {
        bjz_1 bjz_12 = this.doQ();
        if (bjz_12 == null) {
            return null;
        }
        return bjz_12.drA();
    }

    private bjf_2 doS() {
        return this.igO;
    }

    public void a(bjf_2 bjf_22) {
        this.igO = bjf_22;
    }

    @Override
    public void dkl() {
        ((exy_2)this.fgM()).a(this);
        bNB.kDS.a(this.dlc());
    }

    @Override
    public void dkm() {
        ((exy_2)this.fgM()).b(this);
        bNB.kDS.b(this.dlc());
    }

    @Override
    public void f(pv_0 pv_02) {
        super.f(pv_02);
        if (cpa_1.j(pv_02)) {
            this.ifb = new bjv_2(this);
        }
        if (this.ifb == null) {
            return;
        }
        this.ifb.f(pv_02);
    }

    @Override
    public void h(pv_0 pv_02) {
        super.h(pv_02);
        if (this.ifb == null) {
            return;
        }
        this.ifb.h(pv_02);
    }

    @Override
    public void a(rl_0 rl_02) {
        super.a(rl_02);
        if (this.ifb == null) {
            return;
        }
        this.ifb.a(rl_02);
    }

    @Override
    public void a(int n, Object object) {
        super.a(n, object);
        if (this.ifb == null) {
            return;
        }
        this.ifb.a(n, object);
    }

    public void a(bgp_0 bgp_02) {
        this.ifb = bgp_02;
    }

    @Override
    public String getName() {
        if (bjv_2.aM(this)) {
            return aum_0.cWf().c("hooded.monster", new Object[0]);
        }
        return super.getName();
    }

    @Override
    public boolean a(eyp_0 eyp_02) {
        if (this.asf == 5) {
            return eyp_0.pmQ.a(eyp_02);
        }
        return eyp_0.pmP.a(eyp_02);
    }

    @Override
    public cpm_1[] chR() {
        boolean bl;
        int n;
        ArrayList<cpm_1> arrayList = new ArrayList<cpm_1>(Arrays.asList(super.chR()));
        for (int i = 0; i < this.igE.size(); ++i) {
            arrayList.add((cpm_1)this.igE.get(i).eLI());
        }
        igF.clear();
        Object object = ((bjz_1)this.ltt).fhL();
        while (object.hasNext()) {
            object.advance();
            igF.add(new cqs_2((bmv_2)object.value()));
        }
        arrayList.addAll(igF);
        igF.clear();
        object = this.doQ().aGT();
        for (n = 0; n < ((ArrayList)object).size(); ++n) {
            arrayList.add(new cqr_2((bjo_2)((ArrayList)object).get(n)));
        }
        n = evm_2.b(aue_0.cVJ().cVO().cWq(), evn_2.otV) ? 1 : 0;
        boolean bl2 = bl = this.dkG() && this.doT();
        if ((n != 0 || bl) && !this.doP()) {
            arrayList.add(new cqj_2(this));
        }
        return arrayList.toArray(new cpm_1[arrayList.size()]);
    }

    private boolean doT() {
        long[] lArray = caf_2.lFq.mD(this.aqZ());
        if (lArray == null) {
            return true;
        }
        for (long l : lArray) {
            if (l != this.aZA) continue;
            return false;
        }
        return true;
    }

    private boolean doU() {
        return this.asf == 5 || this.dOp();
    }

    @Override
    public Optional<fte_0> doa() {
        return Optional.of(can_0.lHv);
    }

    @Override
    public Object eu(String string) {
        switch (string) {
            case "shortcutBarManager": {
                return this.igR;
            }
        }
        return super.eu(string);
    }

    @Override
    public /* synthetic */ bmd_1 dkI() {
        return this.doH();
    }

    @Override
    public /* synthetic */ eyp doV() {
        return this.doQ();
    }

    @Override
    @Nullable
    public /* synthetic */ foP doW() {
        return this.doD();
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

    static /* synthetic */ Logger aGS() {
        return pfX;
    }

    static /* synthetic */ long a(bhx_0 bhx_02) {
        return bhx_02.aXv;
    }

    static /* synthetic */ Logger doX() {
        return pfX;
    }

    static /* synthetic */ Logger dog() {
        return pfX;
    }

    static {
        System.arraycopy(igC, 0, igD, 0, igC.length);
        System.arraycopy(bgy.ibP, 0, igD, igC.length, bgy.ibP.length);
        igF = new azz_1<cqs_2>(new bhy_0());
    }
}


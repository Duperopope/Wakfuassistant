/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import com.ankamagames.framework.graphics.engine.material.Material;
import gnu.trove.set.hash.TByteHashSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bsJ
 */
public class bsj_0
extends etu_0<bgy>
implements aeh_2,
bsS {
    public static final String[] jiG = new String[0];
    protected static final Material jiH = (Material)Material.daL.bSJ();
    private final ArrayList<bsQ> jiI;
    private final HashSet<bgy> jiJ = new HashSet(0);
    private final bsL jiK;
    private final List<eVf<bgy>> jiL = new ArrayList<eVf<bgy>>();
    private final TByteHashSet jiM;
    private final TByteHashSet jiN;
    private final bbw jiO;
    private final List<bgy> jiP = new ArrayList<bgy>();
    private int jiQ;
    final bsO jiR;
    boolean jiS;
    private List<Long> hsD;
    private List<Long> jiT;
    private long dfi;
    private long jiU;
    private boolean jiV;
    private ftJ jiW;
    private LocalDateTime jiX;
    private final EnumMap<eVi, CellParticleSystem> jiY = new EnumMap(eVi.class);
    private final aVa jiZ;

    public bsj_0(int n, eUw eUw2, rh_0 rh_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, etw_0 etw_02) {
        this(n, eUw2, rh_02, tByteHashSet, tByteHashSet2);
        this.jiq = etw_02;
    }

    public bsj_0(int n, eUw eUw2, rh_0 rh_02, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2) {
        super(n, eUw2, rh_02);
        this.rry = new bub(this).fNT();
        this.jiL.add(new buc((bua)this.rry));
        this.jiR = new bsO(rh_02);
        this.jiK = new bsL(this);
        this.jiI = new ArrayList();
        this.rqG = new bsP();
        this.jiM = tByteHashSet;
        this.jiN = tByteHashSet2;
        this.jiO = new bbw(n);
        this.rrE.a(this.jiO);
        this.jiZ = new aVa(n);
    }

    @Override
    public long bam() {
        throw new UnsupportedOperationException("Le client ne doit pas donner un Id d'effectuser");
    }

    @Override
    protected void a(eVm eVm2) {
    }

    @Override
    public void a(bgy bgy2, byte by, boolean bl) {
        if (!(bgy2 instanceof bhx_0)) {
            super.a(bgy2, by, bl);
            return;
        }
        bhx_0 bhx_02 = (bhx_0)bgy2;
        long l = bhx_02.doK();
        bgy bgy3 = bgg_0.dlO().ju(l);
        if (bgy3 == null) {
            super.a(bgy2, by, bl);
            return;
        }
        this.a(bgy2, by, bl, bgy3);
    }

    @Override
    public boolean dGG() {
        if (!this.fKm()) {
            return false;
        }
        TByteHashSet tByteHashSet = new TByteHashSet();
        boolean bl = this.a(tByteHashSet);
        if (bl) {
            return false;
        }
        for (byte by : tByteHashSet) {
            this.fB(by);
        }
        return true;
    }

    @Override
    public void dGH() {
        bsU.dHk().r(this);
        this.jiU = 0L;
        this.jiL.clear();
        this.jiO.cZM();
        this.jiK.dHh();
        bsX.dHm().bhk();
        super.dGH();
    }

    @Override
    public eup_0 dGI() {
        return null;
    }

    protected void ba(bgy bgy2) {
        super.G(bgy2);
        bgy2.ac(bgy2);
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).G(bgy2);
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public exP dy(int n, int n2) {
        Object t = super.dy(n, n2);
        if (t != null && ((exP)t).cyi()) {
            return null;
        }
        return t;
    }

    public void bb(bgy bgy2) {
        super.F(bgy2);
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).I(bgy2);
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void bc(bgy bgy2) {
        super.E(bgy2);
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).J(bgy2);
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void bd(bgy bgy2) {
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).K(bgy2);
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        bgy2.fN(false);
        super.D(bgy2);
    }

    @Override
    public void w(exP exP2) {
        if (exP2.bcQ() != -1 && this.rrz.aK(exP2.bcC(), exP2.bcD())) {
            this.rrz.i(exP2);
        }
    }

    @Override
    public void a(bgy bgy2, List<int[]> list, euz_1 euz_12) {
        bsg_0.jia.aP(bgy2);
    }

    @Override
    public void f(QQ qQ) {
        super.f(qQ);
        if (!this.u(qQ)) {
            return;
        }
        akj_0.ciY().a(qQ, this);
        qu_0 qu_02 = qQ.bci();
        if (qu_02 instanceof bgy) {
            bsg_0.jia.b(qQ, (bgy)qu_02);
        }
        ((aIs)aie_0.cfn().bmC()).a(akj_0.ciY());
        if (qQ.aeV() == etm_0.rnr.aHp() && aue_0.cVJ().c(cue_2.eSA())) {
            cue_2.eSA().eSG();
        }
    }

    @Override
    public boolean u(QQ qQ) {
        bbq bbq2;
        if (qQ.aeV() == etm_0.rnt.aHp() && this.a(bbq2 = (bbq)qQ)) {
            return false;
        }
        if (!qQ.a(etl_0.rnc)) {
            return true;
        }
        return aue_0.cVJ().cVK().bcP() == qQ.bcP();
    }

    public boolean a(bbq bbq2) {
        byte by;
        if (!bbq2.cyi()) {
            return false;
        }
        qu_0 qu_02 = bbq2.bci();
        if (qu_02 == null) {
            return true;
        }
        bgy bgy2 = (bgy)this.rrw.qY(qu_02.Sn());
        if (bgy2 == null) {
            return true;
        }
        byte by2 = this.rrw.aS(bgy2);
        return by2 != (by = this.rrw.aS(aue_0.cVJ().cVK()));
    }

    public bsO dGJ() {
        return this.jiR;
    }

    @Override
    public long bhF() {
        return this.jiU;
    }

    @Override
    public Optional<bgy> dGK() {
        return Optional.ofNullable((bgy)this.rrw.qY(this.jiU));
    }

    @Override
    public aVa dGy() {
        return this.jiZ;
    }

    @Override
    public void g(QQ qQ) {
        Object object;
        super.g(qQ);
        if (qQ instanceof bbC) {
            object = ((bbC)((Object)qQ)).cZE();
            cxq_1.eWO().a(object.dac());
        }
        this.G(qQ);
        akj_0.ciY().o(qQ);
        object = aue_0.cVJ().cVN();
        if (object != null) {
            ((blh_2)object).edH();
        }
        if (!this.jiS) {
            daY daY2 = new daY((eSS)qQ);
            daY2.lK(19231);
            daY2.cC(false);
            aaw_1.bUq().h(daY2);
        }
    }

    @Override
    public void i(QQ qQ) {
        aJP.cig().b(this, qQ);
    }

    private boolean a(TByteHashSet tByteHashSet) {
        Iterator iterator = this.rrw.a(evb_0.fNn()).iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            bgy bgy2 = (bgy)iterator.next();
            tByteHashSet.add(bgy2.bcP());
            if (tByteHashSet.size() < this.fJY()) continue;
            bl = true;
            break;
        }
        return bl;
    }

    @Override
    public void be(bgy bgy2) {
        if (!this.jiK.dHi()) {
            return;
        }
        this.jiK.dHh();
        this.bf(bgy2);
    }

    @Override
    void bf(bgy bgy2) {
        aue_0.cVJ().b(cul_2.eST());
        long l = bgy2.Sn();
        short s = this.dGQ().bhJ();
        ckz ckz2 = new ckz(l, s);
        aue_0.cVJ().etu().d(ckz2);
    }

    public void a(@NotNull eVf eVf2) {
        if (!this.jiL.contains(eVf2)) {
            this.jiL.add(eVf2);
        }
    }

    public void b(@NotNull eVf eVf2) {
        this.jiL.remove(eVf2);
    }

    public void bg(bgy bgy2) {
        if (!this.jiP.contains(bgy2)) {
            this.jiP.add(bgy2);
        }
    }

    public void a(eVg eVg2) {
        Object object;
        bgy bgy2 = bvz_0.ju(eVg2.fMW());
        if (bgy2 == null) {
            rrm.error((Object)String.format("Joueur #%d \u00e0 l'origine du verrouillage du combat id=%d inconnu", eVg2.fMW(), this.d()));
        } else {
            object = aue_0.cVJ().cVK();
            if (((bgy)object).bcP() == eVg2.bcP()) {
                fse_1.gFu().f("currentFightLocked", eVg2.bfb());
            }
        }
        if (eVg2.bfb()) {
            this.jiM.add(eVg2.bcP());
        } else {
            this.jiM.remove(eVg2.bcP());
        }
        if (eVg2.fMV()) {
            object = aum_0.cWf().c("fight.autoLocked", new Object[0]);
        } else {
            String string = eVg2.bfb() ? "fight.lockedBy" : "fight.unlockedBy";
            object = aum_0.cWf().c(string, bgy2 == null ? null : bgy2.getName());
        }
        aPh.czg().ja((String)object);
    }

    @Override
    public void a(QQ qQ, anu_1 anu_12) {
    }

    @Override
    public void b(QQ qQ, anu_1 anu_12) {
    }

    public boolean kv(long l) {
        if (this.jiT == null) {
            return false;
        }
        return this.jiT.contains(l);
    }

    public boolean kw(long l) {
        if (this.hsD == null) {
            return false;
        }
        return this.hsD.contains(l);
    }

    public void gS(boolean bl) {
        Iterator iterator = this.dGs().iterator();
        if (bl) {
            while (iterator.hasNext()) {
                bgy bgy2 = (bgy)iterator.next();
                bgy2.ddI().b(bsj_0.dGL());
            }
        }
    }

    protected static Material dGL() {
        jiH.x(0.2f, 0.2f, 0.2f);
        return jiH;
    }

    public void dGM() {
        rrm.error((Object)"ASK FOR FIGHT RECOVERY PROCESS");
        this.dGQ().bhk();
        ckw ckw2 = new ckw();
        ckw2.pu(this.d());
        aue_0.cVJ().etu().d(ckw2);
    }

    public void dY(byte[] byArray) {
        rrm.error((Object)"PROCESSING FIGHT RECOVERY");
        this.as(byArray);
        this.dGQ().start();
    }

    public boolean bh(bgy bgy2) {
        return this.jiJ.add(bgy2);
    }

    public boolean bi(bgy bgy2) {
        return this.jiJ.remove(bgy2);
    }

    public boolean bj(bgy bgy2) {
        return this.jiJ.contains(bgy2);
    }

    public boolean bk(bgy bgy2) {
        for (bgy bgy3 : this.dGs()) {
            if (!(bgy3 instanceof bhJ) || bgy3 == bgy2 || this.jiJ.contains(bgy3)) continue;
            return false;
        }
        return true;
    }

    public long bM(byte by) {
        return ((bgy)this.fA(by)).Sn();
    }

    public boolean bl(bgy bgy2) {
        return this.rrw.bz(bgy2);
    }

    public void a(bsQ bsQ2) {
        if (!this.jiI.contains(bsQ2)) {
            this.jiI.add(bsQ2);
        }
    }

    public void a(exP exP2, fqD fqD2, acd_1 acd_12) {
        int n;
        for (n = 0; n < this.jiL.size(); ++n) {
            try {
                this.jiL.get(n).b((bgy)exP2, fqD2, acd_12);
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        if (exP2 == null || fqD2 == null) {
            return;
        }
        n = fqD2.Fq();
        short s = exP2.cmL();
        this.jiQ += fqD2.Zc(s > n ? n : (int)s);
    }

    public boolean dGN() {
        if (this.jiX == null) {
            return true;
        }
        return !this.jiX.plusSeconds((long)Math.floor((float)this.jiQ / 2.0f)).isAfter(LocalDateTime.now());
    }

    public ftJ dGO() {
        return this.jiW;
    }

    public void a(ftJ ftJ2) {
        this.jiW = ftJ2;
    }

    public int getDuration() {
        int n = (int)(System.currentTimeMillis() - this.dfi) / 60000;
        if (n >= 0) {
            return n;
        }
        return 0;
    }

    @Override
    public String[] bxk() {
        return jiG;
    }

    @Override
    public Object eu(String string) {
        return null;
    }

    @Override
    public boolean dGP() {
        return super.dGP() || this.jiS;
    }

    public bua dGQ() {
        return (bua)super.dHf();
    }

    public void bm(bgy bgy2) {
        super.C(bgy2);
    }

    @Override
    public qg_0<enk_0> bac() {
        return bat_2.cZD();
    }

    @Override
    protected void Fr(int n) {
        if (this.dGR()) {
            aki_0.ciX().c(this);
            aue_0.cVJ().a(cuh_2.eSM());
            aag_0 aag_02 = aie_0.cfn().bmC().bqL();
            aag_02.c(aie_0.cfo().cVK().ddI());
            bsX.dHm().d(n, null);
            for (int i = 0; i < this.jiL.size(); ++i) {
                try {
                    this.jiL.get(i).dHO();
                    continue;
                }
                catch (Exception exception) {
                    rrm.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }

    public boolean dGR() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        return this.rrw.bz(bgt_02) || bgt_02.dnB() != null && bgt_02.dnB().d() == this.d();
    }

    @Override
    public void dGS() {
        this.jiq = etw_0.rqX;
        if (this.dGR()) {
            aki_0.ciX().clear();
            aag_0 aag_02 = aie_0.cfn().bmC().bqL();
            aag_02.c(aie_0.cfo().cVK().ddI());
            aue_0.cVJ().b(cuh_2.eSM());
            this.jiN.clear();
            this.jiM.clear();
            for (int i = 0; i < this.jiL.size(); ++i) {
                try {
                    this.jiL.get(i).dGS();
                    continue;
                }
                catch (Exception exception) {
                    rrm.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }

    @Override
    public void dGT() {
        super.dGT();
        this.dfi = System.currentTimeMillis();
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).dHN();
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void chN() {
        this.jiS = true;
        int n = this.jiL.size();
        for (int i = 0; i < n; ++i) {
            try {
                this.jiL.get(i).dHP();
                continue;
            }
            catch (RuntimeException runtimeException) {
                rrm.error((Object)"Exception levee", (Throwable)runtimeException);
            }
        }
        super.chN();
        this.dHa();
    }

    @Override
    public void dGU() {
        super.dGU();
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).dHQ();
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void bn(bgy bgy2) {
        super.B(bgy2);
        if (bgy2.bvY()) {
            var2_2 = this.bK(bgy2.bcP());
            bgy bgy3 = null;
            Iterator iterator = var2_2.iterator();
            while (iterator.hasNext()) {
                bgy bgy4 = (bgy)iterator.next();
                if (!this.aU(bgy4)) continue;
                bgy3 = bgy4;
                break;
            }
            if (bgy3 != null) {
                if (bgy3 instanceof bhx_0) {
                    bqm_0.jbp.b(new brq_0(bgy3.aWP(), ((bhx_0)bgy3).aXa()));
                } else if (bgy3 instanceof bhJ) {
                    bqm_0.jbp.b(new brq_0(bgy3.aWP(), ((bhJ)bgy3).b(Vf.bxK)));
                } else {
                    bqm_0.jbp.b(new brq_0(bgy3.aWP(), 0L));
                }
            }
            fse_1.gFu().f("currentFightLocked", this.bN(this.aS(bgy2)));
            fse_1.gFu().f("currentFightRequestHelp", this.bG(bgy2.bcP()));
        } else if (bgy2 instanceof bhx_0) {
            bvl_0 bvl_02;
            var2_2 = (bhx_0)bgy2;
            long l = aue_0.cVJ().cVO().xl();
            long l2 = ((bhx_0)var2_2).doL();
            bvk_0 bvk_02 = cxs_1.eXb().eXc();
            if (bvk_02 != null && (bvl_02 = bvk_02.kR(-l2)) != null) {
                exf_2 exf_22 = ((exP)var2_2).e(exx_2.rGi);
                exf_22.a(new bsk_0(this, bvl_02));
            }
            if (l2 > 0L && eJN.qAF.O(l, l2) != null) {
                bqm_0.jbp.b(new brg_1());
            } else {
                ((bgy)var2_2).dkL();
            }
        }
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).B(bgy2);
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public boolean bN(byte by) {
        return this.jiM != null && this.jiM.contains(by);
    }

    public void h(byte by, boolean bl) {
        if (bl) {
            this.jiN.add(by);
        } else {
            this.jiN.remove(by);
        }
    }

    public boolean bG(byte by) {
        return this.jiN.contains(by);
    }

    public TByteHashSet dGV() {
        return this.jiN;
    }

    public TByteHashSet dGW() {
        return this.jiM;
    }

    public void bo(bgy bgy2) {
        super.A(bgy2);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgy bgy3 = this.dGQ().dIA();
        if (this.jiq == etw_0.rqW) {
            return;
        }
        if (bgy2.Xi() != bgt_02.Xi()) {
            return;
        }
        if (bgy3 != null && bgy3.Xi() == bgy2.Xi()) {
            return;
        }
        cul_2.ce(bvz_0.x(bgt_02));
    }

    public void bp(@NotNull bgy bgy2) {
        super.z(bgy2);
        this.jiU = bgy2.Sn();
        this.kx(this.qR(bgy2.Sn()));
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bgt_02.a(exx_2.rGj, exx_2.rGi, exx_2.rGk, exx_2.rGl);
        if (bsj_0.bq(bgy2)) {
            aue_0.cVJ().b(cug_2.eSL());
            if (!bgy2.fgk()) {
                aue_0.cVJ().a(cul_2.eST());
            }
            cAY.eHc().nP(600077L);
            this.ky(bgy2.Sn());
        } else {
            fhs_2 object;
            cAY.eHc().nP(600078L);
            fsf_1 fsf_12 = fse_1.gFu().aX("itemDetail", "inventoryDialog");
            if (fsf_12 != null && (object = fyw_0.gqw().gqC().uR("inventoryDialog")) != null) {
                fse_1.gFu().b("itemDetail", "usableNow", object);
            }
        }
        bsg_0.jia.dGl();
        bsg_0.jia.aO(bgy2);
        agm_2.cbu().d(new buw_1(bgy2.Sn()));
        aVi.cWF().m(this);
        if (bgy2.fhm().get(1)) {
            return;
        }
        for (eVf eVf2 : this.jiL) {
            try {
                eVf2.z(bgy2);
            }
            catch (Exception exception) {
                rrm.error((Object)("Exception raised in onFighterStartTurn for fighter " + bgy2.getName() + " in listener " + eVf2.getClass().getSimpleName()), (Throwable)exception);
            }
        }
        if (bgy2 instanceof bhx_0) {
            return;
        }
        this.jiX = LocalDateTime.now();
    }

    public void kx(long l) {
        bsX.dHm().d(l, this.dGK().orElse(null));
    }

    public static boolean bq(bgy bgy2) {
        if (bgy2 == null) {
            return false;
        }
        return bgy2.dkQ();
    }

    public void ky(long l) {
        this.jiK.s(this.qR(l), l);
    }

    public void br(@NotNull bgy bgy2) {
        Object object;
        akj_0.ciY().cjb();
        cuk_2.eSS().k(null);
        cuk_2.eSS().eNl();
        this.dGX();
        super.y(bgy2);
        long l = aue_0.cVJ().cVK().Xi();
        if (bgy2.Xi() == l && aue_0.cVJ().c(cul_2.eST())) {
            bsg_0.jia.dGl();
        }
        long l2 = bgy2.dOo();
        bgy bgy3 = (bgy)this.qJ(l2);
        if ((bgy2.Xi() == l || bgy3.Xi() == l) && (object = this.dGQ().kF(l)) != null) {
            cul_2.ce((bgy)object);
        }
        if (!bgy2.fhm().get(2)) {
            for (eVf eVf2 : this.jiL) {
                try {
                    eVf2.y(bgy2);
                }
                catch (Exception exception) {
                    rrm.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
        if (aue_0.cVJ().c(cul_2.eST())) {
            aue_0.cVJ().b(cul_2.eST());
        }
        if (!aue_0.cVJ().c(cug_2.eSL())) {
            aue_0.cVJ().a(cug_2.eSL());
        }
        this.jiX = null;
        this.jiQ = 0;
    }

    private void dGX() {
        if (!this.jiK.dHi()) {
            return;
        }
        this.jiK.dHh();
    }

    @Override
    public void dGY() {
        super.dGY();
        bsg_0.jia.dGl();
        this.jiK.dHh();
        bsX.dHm().bhk();
        this.dfi = 0L;
        this.jiJ.clear();
        cuk_2.eSS().k(null);
        cuk_2.eSS().eNl();
        aue_0.cVJ().cVK().dlH();
        aue_0.cVJ().cVK().dpH().eej();
        int n = this.jiP.size();
        for (int i = 0; i < n; ++i) {
            bgy bgy2 = this.jiP.get(i);
            cco_0.etB();
            cco_0.a(false, bgy2);
        }
        Iterator<eVf<bgy>> iterator = this.jiL.iterator();
        while (iterator.hasNext()) {
            try {
                iterator.next().dGY();
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        cuu_1.eRY();
        this.dGZ();
    }

    public void dGZ() {
        for (CellParticleSystem cellParticleSystem : this.jiY.values()) {
            cellParticleSystem.bLH();
            agZ.bzy().so(cellParticleSystem.bLJ());
        }
        this.jiY.clear();
    }

    @Override
    public void a(Uc uc) {
        ero_0 ero_02 = (ero_0)uc.biU();
        if (ero_02 == null) {
            return;
        }
        qu_0 qu_02 = ero_02.bbd();
        if (qu_02 != null && qu_02 instanceof bgy) {
            ((bgy)qu_02).dlc().C(ero_02);
        }
        if (!ero_02.fCn()) {
            super.a(uc);
        }
    }

    @Override
    public void a(eSM eSM2) {
        super.a(eSM2);
        this.jiR.gU(eSM2.cyi());
        if (!this.rrA.d(eSM2)) {
            this.rrA.a(eSM2);
        }
    }

    public void bs(bgy bgy2) {
    }

    @Override
    public void k(@NotNull rj_0 rj_02) {
        if (rj_02 instanceof byx_0) {
            byx_0 byx_02 = (byx_0)rj_02;
            this.t(byx_02);
        }
    }

    private void dHa() {
        int n = this.jiI.size();
        for (int i = 0; i < n; ++i) {
            this.jiI.get(i).g(this);
        }
        this.jiI.clear();
    }

    public boolean dHb() {
        return this.jiV;
    }

    public void gT(boolean bl) {
        this.jiV = bl;
    }

    public Collection<bgy> dHc() {
        return this.rrw.a(evb_0.a(evb_0.fNt()));
    }

    @Override
    public void kz(long l) {
        super.kz(l);
        this.jiK.dHh();
        long l2 = this.qR(this.jiU);
        this.jiK.s(l2, this.jiU);
        bsX.dHm().c(l2, this.dGK().orElse(null));
    }

    @Override
    public void dHd() {
        super.dHd();
        for (int i = 0; i < this.jiL.size(); ++i) {
            try {
                this.jiL.get(i).dHd();
                continue;
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    public void Q(List<Long> list) {
        this.jiT = list;
    }

    public void O(List<Long> list) {
        this.hsD = list;
    }

    public void a(acd_1 acd_12, eVi eVi2) {
        Optional<bts_0> optional = bts_0.b(eVi2);
        if (optional.isEmpty()) {
            return;
        }
        CellParticleSystem cellParticleSystem = agY.bzw().sl(optional.get().bBE());
        cellParticleSystem.r(acd_12.getX(), acd_12.getY(), acd_12.bdi());
        cellParticleSystem.setDuration(0);
        agZ.bzy().b(cellParticleSystem);
        this.jiY.put(eVi2, cellParticleSystem);
    }

    public Optional<eVi> S(@NotNull acd_1 acd_12) {
        for (Map.Entry<eVi, CellParticleSystem> entry : this.jiY.entrySet()) {
            CellParticleSystem cellParticleSystem = entry.getValue();
            if (!acd_12.cF((int)cellParticleSystem.aSc(), (int)cellParticleSystem.aSd())) continue;
            return Optional.of(entry.getKey());
        }
        return Optional.empty();
    }

    public void a(eVi eVi2) {
        CellParticleSystem cellParticleSystem = this.jiY.get((Object)eVi2);
        if (cellParticleSystem == null) {
            return;
        }
        cellParticleSystem.bLH();
        if (!agZ.bzy().a((IsoParticleSystem)cellParticleSystem)) {
            return;
        }
        agZ.bzy().so(cellParticleSystem.bLJ());
    }

    public bgy dHe() {
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        if (bgt_02.djT() && bgt_02.dkZ() == this) {
            bgy bgy2 = this.dGQ().dIA();
            if (bgy2 != null && bgy2.dkQ()) {
                return bgy2;
            }
            return bgt_02;
        }
        return bgt_02;
    }

    public String toString() {
        return "Fight{" + this.d() + "}";
    }

    @Override
    public /* synthetic */ void x(exP exP2) {
        this.bs((bgy)exP2);
    }

    @Override
    public /* synthetic */ void y(@NotNull exP exP2) {
        this.br((bgy)exP2);
    }

    @Override
    public /* synthetic */ void z(@NotNull exP exP2) {
        this.bp((bgy)exP2);
    }

    @Override
    public /* synthetic */ void A(exP exP2) {
        this.bo((bgy)exP2);
    }

    @Override
    public /* synthetic */ void B(exP exP2) {
        this.bn((bgy)exP2);
    }

    @Override
    public /* synthetic */ void C(exP exP2) {
        this.bm((bgy)exP2);
    }

    @Override
    public /* synthetic */ ewk_1 dHf() {
        return this.dGQ();
    }

    @Override
    public /* synthetic */ void D(exP exP2) {
        this.bd((bgy)exP2);
    }

    @Override
    public /* synthetic */ void E(exP exP2) {
        this.bc((bgy)exP2);
    }

    @Override
    public /* synthetic */ void F(exP exP2) {
        this.bb((bgy)exP2);
    }

    @Override
    protected /* synthetic */ void G(exP exP2) {
        this.ba((bgy)exP2);
    }

    @Override
    public /* synthetic */ TA baf() {
        return this.dGQ();
    }

    @Override
    public /* synthetic */ ags_0 dGx() {
        return this.dGJ();
    }

    @Override
    public /* synthetic */ bgy kq(long l) {
        return (bgy)super.qJ(l);
    }

    static /* synthetic */ Logger aGh() {
        return rrm;
    }
}


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

public class bsJ
extends eTU<bgy>
implements aEH,
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

    public bsJ(int n, eUw eUw2, Rh rh, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2, eTW eTW2) {
        this(n, eUw2, rh, tByteHashSet, tByteHashSet2);
        this.jiq = eTW2;
    }

    public bsJ(int n, eUw eUw2, Rh rh, TByteHashSet tByteHashSet, TByteHashSet tByteHashSet2) {
        super(n, eUw2, rh);
        this.rry = new bub(this).fNT();
        this.jiL.add(new buc((bua)this.rry));
        this.jiR = new bsO(rh);
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
        if (!(bgy2 instanceof bhx)) {
            super.a(bgy2, by, bl);
            return;
        }
        bhx bhx2 = (bhx)bgy2;
        long l = bhx2.doK();
        bgy bgy3 = bgG.dlO().ju(l);
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
    public eUp dGI() {
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
    public void a(bgy bgy2, List<int[]> list, eUz eUz2) {
        bsG.jia.aP(bgy2);
    }

    @Override
    public void f(QQ qQ) {
        super.f(qQ);
        if (!this.u(qQ)) {
            return;
        }
        aKJ.ciY().a(qQ, this);
        Qu qu = qQ.bci();
        if (qu instanceof bgy) {
            bsG.jia.b(qQ, (bgy)qu);
        }
        ((aIs)aIe.cfn().bmC()).a(aKJ.ciY());
        if (qQ.aeV() == eTm.rnr.aHp() && aUE.cVJ().c(cUE.eSA())) {
            cUE.eSA().eSG();
        }
    }

    @Override
    public boolean u(QQ qQ) {
        bbq bbq2;
        if (qQ.aeV() == eTm.rnt.aHp() && this.a(bbq2 = (bbq)qQ)) {
            return false;
        }
        if (!qQ.a(eTl.rnc)) {
            return true;
        }
        return aUE.cVJ().cVK().bcP() == qQ.bcP();
    }

    public boolean a(bbq bbq2) {
        byte by;
        if (!bbq2.cyi()) {
            return false;
        }
        Qu qu = bbq2.bci();
        if (qu == null) {
            return true;
        }
        bgy bgy2 = (bgy)this.rrw.qY(qu.Sn());
        if (bgy2 == null) {
            return true;
        }
        byte by2 = this.rrw.aS(bgy2);
        return by2 != (by = this.rrw.aS(aUE.cVJ().cVK()));
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
            cXq.eWO().a(object.dac());
        }
        this.G(qQ);
        aKJ.ciY().o(qQ);
        object = aUE.cVJ().cVN();
        if (object != null) {
            ((bLH)object).edH();
        }
        if (!this.jiS) {
            daY daY2 = new daY((eSS)qQ);
            daY2.lK(19231);
            daY2.cC(false);
            aAW.bUq().h(daY2);
        }
    }

    @Override
    public void i(QQ qQ) {
        aJP.cig().b(this, qQ);
    }

    private boolean a(TByteHashSet tByteHashSet) {
        Iterator iterator = this.rrw.a(eVB.fNn()).iterator();
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
        aUE.cVJ().b(cUL.eST());
        long l = bgy2.Sn();
        short s = this.dGQ().bhJ();
        ckz ckz2 = new ckz(l, s);
        aUE.cVJ().etu().d(ckz2);
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
        bgy bgy2 = bvZ.ju(eVg2.fMW());
        if (bgy2 == null) {
            rrm.error((Object)String.format("Joueur #%d \u00e0 l'origine du verrouillage du combat id=%d inconnu", eVg2.fMW(), this.d()));
        } else {
            object = aUE.cVJ().cVK();
            if (((bgy)object).bcP() == eVg2.bcP()) {
                fSe.gFu().f("currentFightLocked", eVg2.bfb());
            }
        }
        if (eVg2.bfb()) {
            this.jiM.add(eVg2.bcP());
        } else {
            this.jiM.remove(eVg2.bcP());
        }
        if (eVg2.fMV()) {
            object = aUM.cWf().c("fight.autoLocked", new Object[0]);
        } else {
            String string = eVg2.bfb() ? "fight.lockedBy" : "fight.unlockedBy";
            object = aUM.cWf().c(string, bgy2 == null ? null : bgy2.getName());
        }
        aPh.czg().ja((String)object);
    }

    @Override
    public void a(QQ qQ, anU anU2) {
    }

    @Override
    public void b(QQ qQ, anU anU2) {
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
                bgy2.ddI().b(bsJ.dGL());
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
        aUE.cVJ().etu().d(ckw2);
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

    public void a(exP exP2, fqD fqD2, aCd aCd2) {
        int n;
        for (n = 0; n < this.jiL.size(); ++n) {
            try {
                this.jiL.get(n).b((bgy)exP2, fqD2, aCd2);
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
    public Qg<eNk> bac() {
        return baT.cZD();
    }

    @Override
    protected void Fr(int n) {
        if (this.dGR()) {
            aKI.ciX().c(this);
            aUE.cVJ().a(cUH.eSM());
            aag aag2 = aIe.cfn().bmC().bqL();
            aag2.c(aIe.cfo().cVK().ddI());
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
        bgT bgT2 = aUE.cVJ().cVK();
        return this.rrw.bz(bgT2) || bgT2.dnB() != null && bgT2.dnB().d() == this.d();
    }

    @Override
    public void dGS() {
        this.jiq = eTW.rqX;
        if (this.dGR()) {
            aKI.ciX().clear();
            aag aag2 = aIe.cfn().bmC().bqL();
            aag2.c(aIe.cfo().cVK().ddI());
            aUE.cVJ().b(cUH.eSM());
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
                if (bgy3 instanceof bhx) {
                    bqM.jbp.b(new brq(bgy3.aWP(), ((bhx)bgy3).aXa()));
                } else if (bgy3 instanceof bhJ) {
                    bqM.jbp.b(new brq(bgy3.aWP(), ((bhJ)bgy3).b(Vf.bxK)));
                } else {
                    bqM.jbp.b(new brq(bgy3.aWP(), 0L));
                }
            }
            fSe.gFu().f("currentFightLocked", this.bN(this.aS(bgy2)));
            fSe.gFu().f("currentFightRequestHelp", this.bG(bgy2.bcP()));
        } else if (bgy2 instanceof bhx) {
            bvL bvL2;
            var2_2 = (bhx)bgy2;
            long l = aUE.cVJ().cVO().xl();
            long l2 = ((bhx)var2_2).doL();
            bvK bvK2 = cXs.eXb().eXc();
            if (bvK2 != null && (bvL2 = bvK2.kR(-l2)) != null) {
                eXf eXf2 = ((exP)var2_2).e(eXx.rGi);
                eXf2.a(new bsK(this, bvL2));
            }
            if (l2 > 0L && eJN.qAF.O(l, l2) != null) {
                bqM.jbp.b(new brg());
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
        bgT bgT2 = aUE.cVJ().cVK();
        bgy bgy3 = this.dGQ().dIA();
        if (this.jiq == eTW.rqW) {
            return;
        }
        if (bgy2.Xi() != bgT2.Xi()) {
            return;
        }
        if (bgy3 != null && bgy3.Xi() == bgy2.Xi()) {
            return;
        }
        cUL.ce(bvZ.x(bgT2));
    }

    public void bp(@NotNull bgy bgy2) {
        super.z(bgy2);
        this.jiU = bgy2.Sn();
        this.kx(this.qR(bgy2.Sn()));
        bgT bgT2 = aUE.cVJ().cVK();
        bgT2.a(eXx.rGj, eXx.rGi, eXx.rGk, eXx.rGl);
        if (bsJ.bq(bgy2)) {
            aUE.cVJ().b(cUG.eSL());
            if (!bgy2.fgk()) {
                aUE.cVJ().a(cUL.eST());
            }
            cAY.eHc().nP(600077L);
            this.ky(bgy2.Sn());
        } else {
            fHs object;
            cAY.eHc().nP(600078L);
            fSf fSf2 = fSe.gFu().aX("itemDetail", "inventoryDialog");
            if (fSf2 != null && (object = fyw.gqw().gqC().uR("inventoryDialog")) != null) {
                fSe.gFu().b("itemDetail", "usableNow", object);
            }
        }
        bsG.jia.dGl();
        bsG.jia.aO(bgy2);
        aGm.cbu().d(new bUW(bgy2.Sn()));
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
        if (bgy2 instanceof bhx) {
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
        aKJ.ciY().cjb();
        cUK.eSS().k(null);
        cUK.eSS().eNl();
        this.dGX();
        super.y(bgy2);
        long l = aUE.cVJ().cVK().Xi();
        if (bgy2.Xi() == l && aUE.cVJ().c(cUL.eST())) {
            bsG.jia.dGl();
        }
        long l2 = bgy2.dOo();
        bgy bgy3 = (bgy)this.qJ(l2);
        if ((bgy2.Xi() == l || bgy3.Xi() == l) && (object = this.dGQ().kF(l)) != null) {
            cUL.ce((bgy)object);
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
        if (aUE.cVJ().c(cUL.eST())) {
            aUE.cVJ().b(cUL.eST());
        }
        if (!aUE.cVJ().c(cUG.eSL())) {
            aUE.cVJ().a(cUG.eSL());
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
        bsG.jia.dGl();
        this.jiK.dHh();
        bsX.dHm().bhk();
        this.dfi = 0L;
        this.jiJ.clear();
        cUK.eSS().k(null);
        cUK.eSS().eNl();
        aUE.cVJ().cVK().dlH();
        aUE.cVJ().cVK().dpH().eej();
        int n = this.jiP.size();
        for (int i = 0; i < n; ++i) {
            bgy bgy2 = this.jiP.get(i);
            cco.etB();
            cco.a(false, bgy2);
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
        cUu.eRY();
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
        eRO eRO2 = (eRO)uc.biU();
        if (eRO2 == null) {
            return;
        }
        Qu qu = eRO2.bbd();
        if (qu != null && qu instanceof bgy) {
            ((bgy)qu).dlc().C(eRO2);
        }
        if (!eRO2.fCn()) {
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
    public void k(@NotNull Rj rj) {
        if (rj instanceof byx) {
            byx byx2 = (byx)rj;
            this.t(byx2);
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
        return this.rrw.a(eVB.a(eVB.fNt()));
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

    public void a(aCd aCd2, eVi eVi2) {
        Optional<btS> optional = btS.b(eVi2);
        if (optional.isEmpty()) {
            return;
        }
        CellParticleSystem cellParticleSystem = agY.bzw().sl(optional.get().bBE());
        cellParticleSystem.r(aCd2.getX(), aCd2.getY(), aCd2.bdi());
        cellParticleSystem.setDuration(0);
        agZ.bzy().b(cellParticleSystem);
        this.jiY.put(eVi2, cellParticleSystem);
    }

    public Optional<eVi> S(@NotNull aCd aCd2) {
        for (Map.Entry<eVi, CellParticleSystem> entry : this.jiY.entrySet()) {
            CellParticleSystem cellParticleSystem = entry.getValue();
            if (!aCd2.cF((int)cellParticleSystem.aSc(), (int)cellParticleSystem.aSd())) continue;
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
        bgT bgT2 = aUE.cVJ().cVK();
        if (bgT2.djT() && bgT2.dkZ() == this) {
            bgy bgy2 = this.dGQ().dIA();
            if (bgy2 != null && bgy2.dkQ()) {
                return bgy2;
            }
            return bgT2;
        }
        return bgT2;
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
    public /* synthetic */ eWk dHf() {
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
    public /* synthetic */ agS dGx() {
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

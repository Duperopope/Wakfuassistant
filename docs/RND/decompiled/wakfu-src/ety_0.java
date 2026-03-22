/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.hash.TByteHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eTY
 */
public abstract class ety_0<F extends exP>
extends ff_1
implements QT,
qv_0,
ano_2<qu_0>,
eub_0<F> {
    protected static final Logger rrm = Logger.getLogger(ety_0.class);
    public static final int rrn = 300;
    public static final int rro = 301;
    public static final int rrp = 305;
    public static final int rrq = 306;
    public static final int rrr = 307;
    public static final int rrs = 308;
    private final ArrayList<eVe> rrt = new ArrayList();
    private final Set<F> rru = new HashSet<F>();
    private boolean rrv;
    protected final evr_0<F> rrw = new evr_0();
    private final TLongArrayList rrx = new TLongArrayList();
    protected ewk_1 rry;
    protected final rh_0 rrz;
    protected qm_0 bgJ;
    protected QR rrA;
    @Nullable
    private eVm rrB = null;
    private final int rrC;
    @NotNull
    protected final eUw rrD;
    protected boolean jiS = false;
    protected final eur_0 rrE = new eus_0();
    protected uw_0 rrF;
    private final ux_0 rrG;
    protected byte rrH;
    private final fi_1 rrI = new etz_0(this);

    @Override
    public abstract long bam();

    protected ety_0(int n, @NotNull eUw eUw2, rh_0 rh_02) {
        this.rrF = ue_0.bjV().bjm();
        this.rrG = uw_0.fn(this.rrF.bjB());
        this.rrD = eUw2;
        this.rrC = n;
        this.rrz = rh_02;
        this.rrA = eth_0.a(this, this.bbh());
    }

    @Override
    public fi_1[] zj() {
        return new fi_1[]{this.fJW()};
    }

    public fi_1 fJW() {
        return this.rrI;
    }

    public final void eF(byte[] byArray) {
        this.baf().a(this.bbh(), byArray);
    }

    public StringBuilder sq(String string) {
        return new StringBuilder().append("[_FL_] fightId=").append(this.d()).append(' ').append(string);
    }

    public StringBuilder sr(String string) {
        return new StringBuilder().append("[_FL_] fightId=").append(this.d()).append(' ').append(string).append(" ; fighters = ").append(this.dGs().stream().map(Object::toString).collect(Collectors.joining(", ")));
    }

    public StringBuilder b(String string, Throwable throwable) {
        return this.sq(string).append(' ').append(adu_1.a(throwable));
    }

    @Override
    public int d() {
        return this.rrC;
    }

    public boolean a(eVe eVe2) {
        if (!this.rrt.contains(eVe2)) {
            return this.rrt.add(eVe2);
        }
        return false;
    }

    @Override
    public byte dGr() {
        throw new UnsupportedOperationException("Impossible de r\u00e9cup\u00e9rer cette info");
    }

    @Override
    public rh_0 bag() {
        return this.rrz;
    }

    public byte aZv() {
        return this.rrD.aZv();
    }

    public TA baf() {
        return this.rry;
    }

    @Override
    public QR bai() {
        return this.rrA;
    }

    protected abstract void a(eVm var1);

    protected final eVm fJX() {
        if (this.rrB == null) {
            this.rrB = new eVn();
            this.rrB.d(this.bag());
            this.a(this.rrB);
        }
        return this.rrB;
    }

    @Nullable
    public eVo aI(exP exP2) {
        if (this.rrB == null) {
            return null;
        }
        if (exP2 == null) {
            return null;
        }
        return this.rrB.qX(exP2.Sn());
    }

    public List<eVo> fl(byte by) {
        if (this.rrB == null) {
            return Collections.emptyList();
        }
        ArrayList<eVo> arrayList = new ArrayList<eVo>();
        for (exP exP2 : this.bL(by)) {
            eVo eVo2 = this.rrB.qX(exP2.Sn());
            if (eVo2 == null || eVo2.aJG()) continue;
            arrayList.add(eVo2);
        }
        return arrayList;
    }

    public byte fJY() {
        return this.dGo().fJY();
    }

    public byte fJZ() {
        return this.dGo().fJZ();
    }

    public byte fKa() {
        return this.dGo().fKa();
    }

    public byte fKb() {
        return this.dGo().fKb();
    }

    public Collection<F> bK(byte by) {
        return this.rrw.a(evb_0.a(evb_0.fK(by)));
    }

    public Collection<F> fm(byte by) {
        return fcI.N(this.bK(by));
    }

    public Collection<F> fn(byte by) {
        return this.rrw.a(evb_0.d(evb_0.a(evb_0.fK(by)), evb_0.fNn()));
    }

    public Collection<F> fo(byte by) {
        return this.rrw.a(evb_0.d(evb_0.fK(by), evb_0.fNn()));
    }

    public Collection<F> fp(byte by) {
        return this.rrw.a(evb_0.d(evb_0.a(evb_0.fK(by)), evb_0.c(evb_0.fNp(), evb_0.fNn())));
    }

    public Collection<F> fq(byte by) {
        return this.rrw.a(evb_0.a(evb_0.fK(by)), evb_0.fJ((byte)0));
    }

    public Collection<F> fr(byte by) {
        return fcI.N(this.fq(by));
    }

    public Collection<F> fs(byte by) {
        return this.rrw.a(evb_0.fK(by), evb_0.fJ((byte)0));
    }

    public Collection<F> ft(byte by) {
        return fcI.N(this.fs(by));
    }

    @Override
    public Collection<F> bL(byte by) {
        return this.rrw.a(evb_0.fK(by));
    }

    public Collection<F> fu(byte by) {
        return fcI.N(this.bL(by));
    }

    public Collection<F> fv(byte by) {
        return this.rrw.a(evb_0.fK(by), evb_0.a(evb_0.l(exe_1.rFi)));
    }

    public Collection<F> fw(byte by) {
        return this.rrw.a(evb_0.d(evb_0.fNn(), evb_0.fNv(), evb_0.a(evb_0.fK(by))));
    }

    public Collection<F> aJ(exP exP2) {
        return this.rrw.a(evb_0.fNn(), evb_0.a(evb_0.fM(exP2.fhg())), evb_0.a(evb_0.fNr()), evb_0.a(evb_0.l(exe_1.rDp)));
    }

    public F qJ(long l) {
        return this.rrw.qY(l);
    }

    public Collection<F> fKc() {
        return this.rrw.a(evb_0.fNn());
    }

    @Override
    public Collection<F> dGs() {
        return this.rrw.a(evb_0.c(evb_0.fNn(), evb_0.fNp()));
    }

    public Collection<F> aK(exP exP2) {
        return this.rrw.a(evb_0.bG(exP2));
    }

    public boolean aL(F f2) {
        return f2.djT() && (this.rrw.ba((exP)f2) || this.rrw.bb((exP)f2));
    }

    @Override
    public qm_0 bbh() {
        return this.bgJ;
    }

    @Override
    public euf_0 a(F f2, byte by) {
        if (f2.dlK() != null && f2.dlK().qJ(((exP)f2).Sn()) != null) {
            rrm.error((Object)"Le personnage est deja ajout\u00e9 au combat !");
            return euf_0.rxj;
        }
        if (this.bL(by).contains(f2)) {
            return euf_0.rxj;
        }
        if (((exP)f2).doP()) {
            return euf_0.rxl;
        }
        if (by < 0 || by >= this.rrD.fJZ()) {
            return euf_0.rxm;
        }
        if (!eug_0.a(this, f2)) {
            return euf_0.rxE;
        }
        if (!eug_0.a(this, f2, by)) {
            return euf_0.rxr;
        }
        if (!eug_0.a(this, f2, by)) {
            return euf_0.rxq;
        }
        if (!eug_0.b(this, f2, by)) {
            return euf_0.rxq;
        }
        euf_0 euf_02 = eug_0.c(this, f2, by);
        if (euf_02 != euf_0.rxi) {
            return euf_02;
        }
        if (by == 0 && this.rrD.fLc()) {
            return euf_0.rxi;
        }
        int n = this.rrw.a(evb_0.fK(by)).size() + 1;
        byte by2 = ((exP)f2).aFW();
        if (by2 == 0 || by2 == 5 ? n > this.fKa() : n > this.fKb()) {
            return euf_0.rxk;
        }
        return euf_0.rxi;
    }

    public boolean a(byte by, Collection<F> collection) {
        return this.a(by, collection, true);
    }

    public boolean a(byte by, Collection<F> collection, boolean bl) {
        if (bl && !this.b(by, collection)) {
            return false;
        }
        for (exP exP2 : collection) {
            this.a(exP2, by, exP2.dOp());
            this.bh(exP2);
            if (this.dGp() != etw_0.rqW) continue;
            return false;
        }
        return true;
    }

    private boolean b(byte by, Collection<F> collection) {
        if (by == 0 && this.rrD.fLc()) {
            return true;
        }
        int n = collection.size();
        boolean bl = this.L(collection);
        return by >= 0 && by < this.fJZ() && n <= (bl ? this.fKa() : this.fKb());
    }

    private boolean L(Collection<F> collection) {
        for (exP exP2 : collection) {
            if (exP2.aFW() != 0) continue;
            return true;
        }
        return false;
    }

    public euf_0 b(F f2, byte by, boolean bl) {
        euf_0 euf_02 = euf_0.rxi;
        if (!bl || (euf_02 = this.a(f2, by)) == euf_0.rxi) {
            this.a(f2, by, false);
            this.bh(f2);
        }
        return euf_02;
    }

    public void a(F f2, byte by, boolean bl) {
        this.a(f2, by, bl, f2);
    }

    public void a(F f2, byte by, boolean bl, F f3) {
        this.rrw.a(f2, by, bl, f3);
        this.B(f2);
    }

    public boolean qI(long l) {
        F f2 = this.rrw.b(evb_0.rb(l));
        if (this.rrA != null) {
            this.rrA.k((qu_0)f2);
        }
        if (!this.aM(f2)) {
            return false;
        }
        if (!this.dGG()) {
            if (((exP)f2).fhf()) {
                this.bj(f2);
            } else {
                this.bi(f2);
            }
            return true;
        }
        return false;
    }

    private boolean aM(F f2) {
        if (f2 == null) {
            return false;
        }
        for (exP exP2 : this.rrw.aK(f2)) {
            if (exP2 != null) {
                exP2.aZh();
                continue;
            }
            rrm.error((Object)"On un fighter non pr\u00e9sent en combat sous le contr\u00f4le d'un fighter en combat ");
        }
        for (exP exP2 : this.rrw.a(evb_0.fNn(), evb_0.bG(f2))) {
            exP2.aT(true);
            this.aD(exP2);
            exP2.aT(false);
        }
        for (exP exP2 : this.rrw.a(evb_0.fNp(), evb_0.bG(f2))) {
            exP2.aT(true);
            this.aE(exP2);
            exP2.aT(false);
        }
        return true;
    }

    @Override
    @NotNull
    public eUw dGo() {
        return this.rrD;
    }

    public Collection<F> fKd() {
        return this.rrw.a(evb_0.fJ((byte)0));
    }

    public Collection<F> fKe() {
        return fcI.N(this.fKd());
    }

    public Collection<F> fKf() {
        return this.rrw.a(evb_0.fJ((byte)1));
    }

    public Collection<F> fKg() {
        return this.rrw.a(evb_0.fJ((byte)5));
    }

    public Collection<F> fKh() {
        return this.rrw.a(evb_0.c(evb_0.fJ((byte)0), evb_0.fJ((byte)5)));
    }

    public Collection<F> aN(exP exP2) {
        return this.rrw.a(evb_0.fJ((byte)5), evb_0.bF(exP2));
    }

    public Collection<F> fKi() {
        return this.rrw.a(evb_0.c(evb_0.fNn(), evb_0.l(exe_1.rEG)));
    }

    public int fKj() {
        return this.fKc().size();
    }

    public boolean aD(F f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("appel de putFighterOffPlay avec fighter = null");
        }
        boolean bl = true;
        if (!this.dGo().fLb() && this.fKj() <= 1) {
            bl = false;
        } else if (this.aO(f2)) {
            this.A(f2);
        } else {
            bl = false;
            rrm.error((Object)this.sq("\u00c9chec de la transition IN PLAY -> OFF PLAY pour " + ((exP)f2).Sn()));
        }
        ((exP)f2).baG();
        return bl;
    }

    public boolean aO(F f2) {
        return this.rrw.bw(f2);
    }

    @Override
    public Collection<F> bJ(byte by) {
        return this.rrw.a(evb_0.fNn(), evb_0.fK(by), evb_0.a(evb_0.l(exe_1.rFi)));
    }

    public Collection<F> a(evb_0 ... evb_0Array) {
        return this.rrw.a(evb_0Array);
    }

    public Collection<F> fx(byte by) {
        return this.rrw.a(evb_0.c(evb_0.fNn(), evb_0.l(exe_1.rEG)), evb_0.fK(by), evb_0.a(evb_0.l(exe_1.rFi)));
    }

    public Collection<F> fy(byte by) {
        return this.rrw.a(evb_0.fM(by));
    }

    public Collection<F> fz(byte by) {
        Collection<F> collection = this.rrw.a(evb_0.c(evb_0.fNn(), evb_0.l(exe_1.rEG)), evb_0.fK(by));
        Iterator<F> iterator = collection.iterator();
        while (iterator.hasNext()) {
            exP exP2 = (exP)iterator.next();
            if (!exP2.i(exe_1.rEv)) continue;
            iterator.remove();
        }
        return collection;
    }

    public void C(F f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("appel de putFighterBackInPlay avec fighter = null");
        }
        if (this.rrw.bv(f2)) {
            ((exP)f2).aZh();
        } else {
            rrm.error((Object)this.sq("\u00c9chec de la transition OFF PLAY -> IN PLAY pour " + ((exP)f2).Sn()));
        }
        ((exP)f2).baJ();
    }

    public boolean aE(F f2) {
        if (f2 == null) {
            throw new IllegalArgumentException("appel de putFighterOutOfPlay avec fighter = null");
        }
        boolean bl = true;
        try {
            if (!this.aP(f2)) {
                rrm.error((Object)this.sq("\u00c9chec de la transition OFF PLAY -> OUT OF PLAY pour " + String.valueOf(f2)), (Throwable)new Exception("for stacktrace"));
                bl = false;
            } else {
                ((exP)f2).aZh();
            }
            ((exP)f2).baL();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            rrm.error((Object)"Exception levee", (Throwable)illegalArgumentException);
        }
        this.G(f2);
        return bl;
    }

    public boolean aP(F f2) {
        return this.rrw.bx(f2);
    }

    private boolean fKk() {
        return this.dGo().fLa().d(this);
    }

    public boolean dGG() {
        try {
            if (!this.rrv) {
                return false;
            }
            if (this.jiS) {
                return false;
            }
            if (this.fKk()) {
                return false;
            }
            this.jiS = true;
            byte by = this.rrD.fLa().e(this);
            if (by != -1) {
                this.fB(by);
            }
            azg_1 azg_12 = new azg_1();
            for (exP exP2 : this.fKr()) {
                byte by2 = exP2.bcP();
                if (by2 == by || azg_12.aG(by2)) continue;
                azg_12.aF(by2);
                this.fC(by2);
            }
            this.chN();
        }
        catch (Exception exception) {
            rrm.error((Object)this.sq("CHECK DE FIN DE COMBAT : On termine de force"));
            rrm.error((Object)this.sq("CHECK DE FIN DE COMBAT : on loggue, mais on ne fait rien, sinon on p\u00e8te un combat "), (Throwable)exception);
        }
        return true;
    }

    public byte bgZ() {
        TByteHashSet tByteHashSet = this.fKl();
        if (tByteHashSet.size() == 1) {
            return tByteHashSet.toArray()[0];
        }
        if (this.rrD.fLv()) {
            return 1;
        }
        rrm.error((Object)this.sr("There's more than one winning team at the end of the fight, no team is considered winner then"));
        return -1;
    }

    private TByteHashSet fKl() {
        TByteHashSet tByteHashSet = new TByteHashSet();
        for (exP exP2 : this.fKc()) {
            if (exP2.bcP() == -1) {
                rrm.error((Object)this.sq("[FIGHT_REFACTOR] Fighter is inPlay but have team id of -1 : " + String.valueOf(exP2) + " - " + adu_1.xg(8)));
                continue;
            }
            if (exP2.i(exe_1.rEv)) continue;
            tByteHashSet.add(exP2.bcP());
        }
        return tByteHashSet;
    }

    public boolean fKm() {
        return this.rrv;
    }

    public void chN() {
        this.jiS = true;
        try {
            this.baf().bhk();
            this.baf().bhO();
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Arret de la timeline ", exception));
        }
        try {
            for (exP qu_02 : this.fKc()) {
                this.A(qu_02);
                this.G(qu_02);
            }
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Retrait des personnages inplay", exception));
        }
        try {
            for (exP exP2 : this.rrw.a(evb_0.fNp())) {
                this.G(exP2);
            }
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Retrait des personnages offplay", exception));
        }
        try {
            for (QQ qQ : this.rrA.bde()) {
                this.g(qQ);
            }
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Retrait des zones d'effets", exception));
        }
        try {
            for (exP exP3 : this.rrw.a(evb_0.fNo())) {
                if (exP3.dlI() != exP3) continue;
                exP3.dkf();
            }
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Notification de fin de combat", exception));
        }
        try {
            for (exP exP4 : this.rrw.a(evb_0.fNo())) {
                if (exP4.dlI() != exP4) continue;
                this.aX(exP4);
            }
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Retrait des fighters li\u00e9s aux combats de leur controlleur", exception));
        }
        if (fcI.fSM()) {
            this.fKn();
        }
        for (exP exP5 : this.fKr()) {
            try {
                if (this.aW(exP5) != exP5) continue;
                this.D(exP5);
            }
            catch (Exception exception) {
                rrm.error((Object)this.b("FIN DE COMBAT : Retrait des controlleurs", exception));
            }
        }
        try {
            this.dGY();
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Dispatch de l'\u00e9venement de fin de combat", exception));
        }
        try {
            this.fJI();
        }
        catch (Exception exception) {
            rrm.error((Object)this.b("FIN DE COMBAT : Destruction des aires d'effet", exception));
        }
        this.dGH();
    }

    private void fKn() {
        for (exP exP2 : this.fKr()) {
            try {
                if (this.aW(exP2) != exP2 || !fcK.rUe.aU(exP2)) continue;
                this.D(exP2);
            }
            catch (Exception exception) {
                rrm.error((Object)this.b("FIN DE COMBAT : Retrait des controlleurs", exception));
            }
        }
    }

    public long fKo() {
        return 0L;
    }

    protected void fJI() {
        this.rrA.bch();
    }

    public void dGH() {
        if (this.rrA != null) {
            this.rrA.aZp();
            this.rrA = null;
        }
        if (this.bgJ != null) {
            this.bgJ = null;
        }
        this.rru.clear();
        this.rry = null;
        this.rrt.clear();
        this.rrw.clear();
        this.rrB = null;
    }

    public abstract eup_0 dGI();

    protected void G(F f2) {
        this.aR(f2);
        this.aQ(f2);
    }

    protected void aQ(F f2) {
        if (!((exP)f2).dOn()) {
            return;
        }
        long l = ((exP)f2).fhp().fhH().fmF();
        F f3 = this.rrw.qY(l);
        if (f3 == null) {
            rrm.error((Object)("[SYMBIOT] Cannot put summon  on cooldown, summoner character not found id=" + l + " summon=" + String.valueOf(f2)));
            return;
        }
        if (((exP)f3).dob() == null) {
            rrm.error((Object)("[SYMBIOT] Cannot put summon on cooldown, summoner character has no symbiot id=" + l + " summon=" + String.valueOf(f2)));
            return;
        }
        byte by = ((exP)f3).dob().px(((exP)f2).Sn());
        if (by == -1) {
            rrm.error((Object)("[SYMBIOT] Cannot put summon on cooldown, summon has no valid index in symbiot. Summoner id=" + l + " summon=" + String.valueOf(f2)));
            return;
        }
        ((exP)f3).fgh().i(by, this.baf().bhJ());
        ((exP)f3).dob().X(by, true);
        Optional.ofNullable(((exP)f3).dob().Pm(by)).ifPresent(ezw2 -> ezw2.lM(-1L));
    }

    public void aR(F f2) {
        this.rrz.g((rj_0)f2);
    }

    private Iterator<qu_0> dGw() {
        Collection<Iterator<qu_0>> collection = this.fKp();
        return new azj_1<qu_0>(collection);
    }

    private Collection<Iterator<? extends qu_0>> fKp() {
        ArrayList<QQ> arrayList;
        ArrayList<Iterator<? extends qu_0>> arrayList2 = new ArrayList<Iterator<? extends qu_0>>();
        arrayList2.add(this.dGs().iterator());
        if (this.rrA != null && !(arrayList = new ArrayList<QQ>(this.rrA.bdh())).isEmpty()) {
            arrayList2.add(arrayList.iterator());
        }
        return arrayList2;
    }

    @Override
    public qu_0 dg(long l) {
        QQ qQ = this.rrA.do(l);
        if (qQ != null) {
            return qQ;
        }
        qQ = this.rrw.qY(l);
        if (qQ != null) {
            return qQ;
        }
        return this.qH(l);
    }

    public int fKq() {
        return this.rrw.a(new evb_0[0]).size();
    }

    public Collection<F> fKr() {
        return this.rrw.a(new evb_0[0]);
    }

    public Collection<F> fKs() {
        if (this.rrD.fLv()) {
            ArrayList<F> arrayList = new ArrayList<F>();
            arrayList.addAll(this.rrw.a(evb_0.d(evb_0.fK((byte)1), evb_0.a(evb_0.d(evb_0.fNm(), evb_0.fNq())))));
            arrayList.addAll(this.rrw.a(evb_0.d(evb_0.fK((byte)0), evb_0.a(evb_0.fNq()))));
            return arrayList;
        }
        return this.rrw.a(evb_0.a(evb_0.d(evb_0.fNm(), evb_0.fNq())));
    }

    public qu_0 qH(long l) {
        return null;
    }

    @Nullable
    public Iterator<qu_0> fJz() {
        return new azi_1<qu_0>();
    }

    public boolean qF(long l) {
        return false;
    }

    Iterator<qu_0> fKt() {
        Collection<Iterator<qu_0>> collection = this.fKp();
        Iterator<qu_0> iterator = this.fJz();
        if (iterator != null) {
            collection.add(iterator);
        }
        return new azj_1<qu_0>(collection);
    }

    @Override
    public Iterator<qu_0> ban() {
        return new eua_1(this);
    }

    public Iterator<qu_0> v(@Nullable qu_0 qu_02) {
        if (this.dGp() == etw_0.rqX && qu_02 != null) {
            return List.of(qu_02).iterator();
        }
        return this.ban();
    }

    @Override
    public List<qu_0> a(acd_1 acd_12) {
        return this.b(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    @Override
    public List<qu_0> b(int n, int n2, int n3) {
        Iterator<qu_0> iterator = this.ban();
        ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
        while (iterator.hasNext()) {
            qu_0 qu_02 = iterator.next();
            if (amf_1.a(qu_02, n, n2) != 0) continue;
            arrayList.add(qu_02);
        }
        return arrayList;
    }

    public <T extends exP> T ax(acd_1 acd_12) {
        if (acd_12 == null) {
            return null;
        }
        return this.dy(acd_12.getX(), acd_12.getY());
    }

    public <T extends exP> T dy(int n, int n2) {
        if (this.rrz == null) {
            return null;
        }
        TByteHashSet tByteHashSet = this.rrz.W(n, n2);
        if (tByteHashSet == null) {
            return null;
        }
        for (byte by : tByteHashSet) {
            rj_0 rj_02 = this.rrz.P(by);
            if (!(rj_02 instanceof exP)) continue;
            return (T)((exP)rj_02);
        }
        return null;
    }

    public byte fKu() {
        return this.rrH;
    }

    @Override
    public byte kp(long l) {
        F f2 = this.rrw.qY(l);
        return this.aS((exP)f2);
    }

    public byte aS(exP exP2) {
        return this.rrw.aS(exP2);
    }

    public byte aT(exP exP2) {
        return this.rrw.aT(exP2);
    }

    public void b(exP exP2, byte by) {
        this.rrw.b(exP2, by);
    }

    public F fA(byte by) {
        return this.rrw.b(evb_0.fL(by), evb_0.fNt());
    }

    public boolean aU(F f2) {
        return this.rrw.bD((exP)f2);
    }

    public F aV(F f2) {
        return this.rrw.aV(f2);
    }

    public F aW(F f2) {
        return this.rrw.aW(f2);
    }

    public void p(long l, long l2) {
        F f2 = this.qJ(l);
        F f3 = this.qJ(l2);
        if (f2 == null) {
            rrm.error((Object)String.format("[FIGHT_CONTROLLERS] Fighter introuvable pour un changement de controlleur : %d", l));
        }
        if (f3 == null) {
            rrm.error((Object)String.format("[FIGHT_CONTROLLERS] Fighter introuvable pour un changement de controlleur : %d", l2));
        }
        this.rrw.e(f2, f3);
    }

    public void aX(F f2) {
        this.rrw.aX(f2);
    }

    public void aY(F f2) {
        this.rrw.aY(f2);
    }

    public evr_0<F> fKv() {
        return this.rrw;
    }

    public Collection<QQ> bdh() {
        if (this.rrA != null) {
            return this.rrA.bdh();
        }
        return Collections.emptyList();
    }

    public boolean aZ(exP exP2) {
        return this.rrw.bA(exP2);
    }

    public boolean ba(exP exP2) {
        return this.rrw.ba(exP2);
    }

    public boolean a(exP exP2, evv_0 ... evv_0Array) {
        return this.rrw.b(exP2, evv_0Array);
    }

    public boolean bb(exP exP2) {
        return this.rrw.bb(exP2);
    }

    public boolean bc(exP exP2) {
        return this.rrw.bc(exP2);
    }

    public evv_0 bd(exP exP2) {
        return this.rrw.bd(exP2);
    }

    public void be(F f2) {
        if (((exP)f2).a(exe_1.rFi)) {
            return;
        }
        if (!this.baf().ew(((exP)f2).Sn())) {
            StringBuilder stringBuilder = new StringBuilder("Cannot remove fighter " + String.valueOf(f2) + " from timeline because it's not in it --- Fighters : ");
            for (exP exP2 : this.rrw.a(new evb_0[0])) {
                stringBuilder.append(exP2.Sn()).append(" (breed ").append(exP2.aWP()).append(") - ");
            }
            rrm.error((Object)this.sq(stringBuilder.toString()), new Throwable());
        }
    }

    public void bf(F f2) {
        if (!((exP)f2).a(exe_1.rFi)) {
            this.baf().eV(((exP)f2).Sn());
        }
    }

    public void bg(exP exP2) {
        this.rrx.add(exP2.Sn());
    }

    public boolean qK(long l) {
        return this.rrx.contains(l);
    }

    public int fKw() {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
    }

    public void Sw(int n) {
        throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
    }

    public ux_0 fKx() {
        return this.rrG;
    }

    public void bh(F f2) {
        ((exP)f2).a(300, this);
        for (int i = 0; i < this.rrt.size(); ++i) {
            this.rrt.get(i).bh((exP)f2);
        }
    }

    public void F(F f2) {
        ((exP)f2).a(305, this);
        for (int i = 0; i < this.rrt.size(); ++i) {
            this.rrt.get(i).F((exP)f2);
        }
    }

    public void E(F f2) {
        ((exP)f2).a(306, this);
        for (int i = 0; i < this.rrt.size(); ++i) {
            this.rrt.get(i).E((exP)f2);
        }
    }

    public void bi(F f2) {
        ((exP)f2).a(308, this);
    }

    public void bj(F f2) {
        ((exP)f2).a(307, this);
    }

    public void D(F f2) {
        if (f2 == null) {
            return;
        }
        try {
            this.bk(f2);
            this.rrw.bB(f2);
        }
        catch (Exception exception) {
            rrm.error((Object)"Exception levee", (Throwable)exception);
        }
        try {
            ((exP)f2).a(301, this);
        }
        catch (Exception exception) {
            rrm.error((Object)"Exception levee", (Throwable)exception);
        }
    }

    private void bk(F f2) {
        if (!this.rru.contains(f2)) {
            this.rru.add(f2);
            for (exP exP2 : this.rrw.bC(f2)) {
                if (exP2 == f2) continue;
                this.bk(exP2);
            }
        }
        this.bl(f2);
    }

    protected void bl(F f2) {
        if (!this.rrw.bz(f2)) {
            return;
        }
        ((exP)f2).dkf();
        this.rrw.by(f2);
    }

    public void B(F f2) {
        ((exP)f2).a(this);
        rrm.info((Object)this.sq(((exP)f2).aZk() + " breed : " + ((exP)f2).aWP() + " [" + ((exP)f2).Sn() + "] isControlledByAI=" + ((exP)f2).fgk() + " obstacleId : " + ((exP)f2).bcQ() + " join the fight at " + String.valueOf(((exP)f2).aZw())));
    }

    public void bm(exP exP2) {
        if (exP2 == null) {
            return;
        }
        if (exP2.a(exe_1.rEk)) {
            return;
        }
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        for (QQ qQ : this.rrA.bdh()) {
            if (!qQ.a(exP2, exP2.bcC(), exP2.bcD(), exP2.bcE())) continue;
            arrayList.add(qQ);
        }
        if (!arrayList.isEmpty()) {
            for (QQ qQ : arrayList) {
                qQ.a(10012, null, (anu_1)exP2);
                if (!this.dGG()) continue;
                return;
            }
        }
    }

    public void w(exP exP2) {
        this.rrz.f(exP2);
    }

    public void A(F f2) {
        if (this.bai() != null) {
            this.bai().k((qu_0)f2);
        }
    }

    public abstract void a(F var1, List<int[]> var2, euz_1 var3);

    public abstract void aF(F var1);

    public void fJF() {
        this.rrv = true;
    }

    public abstract void dGY();

    public void fB(byte by) {
        for (exP exP2 : this.rrw.fG(by)) {
            this.F(exP2);
        }
        this.rrH = by;
    }

    public void fC(byte by) {
        for (exP exP2 : this.rrw.fG(by)) {
            try {
                if (exP2.fhf()) {
                    this.bj(exP2);
                    continue;
                }
                this.E(exP2);
            }
            catch (Exception exception) {
                rrm.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public void f(QQ qQ) {
        if (qQ.bcQ() >= 0) {
            this.rrz.i(qQ);
        } else {
            this.rrz.f(qQ);
        }
        if (qQ.aeV() == etm_0.rnz.aHp()) {
            ((eSP)qQ).a(this.rrE);
            this.rrE.d((eSP)qQ);
        } else if (qQ.aeV() == etm_0.rnD.aHp()) {
            eST eST2 = (eST)qQ;
            switch (eST2.fIN()) {
                case 4: {
                    this.fJX().b(eST2);
                    break;
                }
            }
        }
    }

    @Override
    public void g(QQ qQ) {
        this.rrz.g(qQ);
        if (qQ.aeV() == etm_0.rnz.aHp()) {
            this.rrE.e((eSP)qQ);
            ((eSP)qQ).a((eUU)null);
        } else if (qQ.aeV() == etm_0.rnD.aHp()) {
            eST eST2 = (eST)qQ;
            switch (eST2.fIN()) {
                case 4: {
                    this.fJX().c(eST2);
                    break;
                }
            }
        }
    }

    protected void G(QQ qQ) {
        if (!(qQ instanceof eza_0)) {
            return;
        }
        eza_0 eza_02 = (eza_0)((Object)qQ);
        boolean bl = eza_02.buW();
        if (!bl) {
            return;
        }
        if (eza_02.fgZ() != null) {
            eza_02.fgZ().djX();
        }
    }

    @Override
    public void h(QQ qQ) {
        if (qQ.baF() && qQ.baN()) {
            qQ.aT(true);
            qQ.b((qu_0)null);
            qQ.aT(false);
        }
    }

    @Override
    public void c(QQ qQ, anu_1 anu_12) {
    }

    @Override
    public void i(QQ qQ) {
    }

    public uw_0 fKy() {
        return this.rrF;
    }

    @Override
    public /* synthetic */ euc_1 ku(long l) {
        return this.qJ(l);
    }

    @Override
    public /* synthetic */ Iterator l(@Nullable anu_1 anu_12) {
        return this.v((qu_0)anu_12);
    }
}


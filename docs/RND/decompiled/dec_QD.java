Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  GC
 *  QE
 *  QF
 *  QH
 *  QJ
 *  Qj
 *  Qk
 *  Qm
 *  Qr
 *  Qs
 *  Qu
 *  TN
 *  TZ
 *  Ud
 *  aCd
 *  anU
 *  aoY
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.InvalidProtocolBufferException
 *  fi
 *  iA
 *  iM
 *  iO
 *  ii
 *  im
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public abstract class QD<FX extends Qj, EC extends Qk>
implements aoY {
    private static final byte bgz = 3;
    protected static final Logger bgA = Logger.getLogger(QD.class);
    protected boolean bgB = false;
    protected FX bgC = null;
    protected EC bgD = null;
    protected Qu bgE = null;
    protected Qu bgF = null;
    protected final aCd bgG = new aCd();
    private Qr bgH;
    private QE bgI = null;
    protected Qm<FX> bgJ = null;
    protected int o;
    protected long bgK = -1L;
    protected long bgL = -1L;
    protected QF bgM;
    protected int aQL = 0;
    private final HashSet<Integer> bgN = new HashSet();
    protected int bgO = -1;
    private QD<FX, EC> bgP;
    protected boolean bgQ = true;
    private boolean bgR = false;
    private static final ThreadLocal<Short> bgS = ThreadLocal.withInitial(() -> (short)0);
    private static final short bgT = 400;
    protected static final short bgU = 2000;
    protected TN bgV = TN.biB();
    private static final boolean bgW = false;
    private boolean bgX = false;
    private Ud bgY;
    protected byte[] bgZ;
    private static long adP = 0L;
    private static QH bha = null;
    protected boolean bhb = false;
    protected Qs bhc = null;
    private boolean bhd = false;
    protected boolean bhe = false;
    private boolean bhf = false;

    public static void baX() {
        bgS.set((short)0);
    }

    public static void a(QH qH) {
        bha = qH;
    }

    private static long baY() {
        if (adP < Long.MAX_VALUE) {
            return adP++;
        }
        adP = 0L;
        return adP;
    }

    public int d() {
        return this.o;
    }

    public void lK(int n) {
        this.o = n;
    }

    public long LV() {
        return this.bgK;
    }

    public long Qq() {
        return this.bgL;
    }

    public void di(long l) {
        this.bgK = l;
    }

    public QF baZ() {
        return this.bgM;
    }

    public void a(QF qF) {
        this.bgM = qF;
    }

    public FX bba() {
        return this.bgC;
    }

    public void b(FX FX) {
        this.bgC = FX;
    }

    public void bbb() {
        this.bhc = new Qs();
        this.bhe = true;
    }

    public Qu bbc() {
        return this.bgE;
    }

    public void e(Qu qu) {
        this.bgE = qu;
    }

    public Qu bbd() {
        return this.bgF;
    }

    public aCd bbe() {
        return this.bgG;
    }

    public EC bbf() {
        return this.bgD;
    }

    public void f(Qu qu) {
        this.bgF = qu;
    }

    public void c(int n, int n2, short s) {
        this.bgG.Q(n, n2, s);
    }

    public Qr bbg() {
        return this.bgH;
    }

    public void a(EC EC) {
        this.bgD = EC;
    }

    public void a(Qm qm) {
        this.bgJ = qm;
    }

    public Qm bbh() {
        return this.bgJ;
    }

    public int getValue() {
        return this.aQL;
    }

    public void oB(int n) {
        this.aQL = n;
    }

    public int aZH() {
        if (this.bgC == null) {
            return -1;
        }
        return this.bgC.aZH();
    }

    public boolean bbi() {
        return false;
    }

    public void aZp() {
        this.aVH();
        this.bgB = true;
    }

    public boolean bbj() {
        return this.bgB;
    }

    public abstract List<Qu> a(FX var1, anU var2, Qm<FX> var3, int var4, int var5, short var6);

    public Qs a(FX FX, EC EC, Qm qm, Qu qu, int n, int n2, short s, Qu qu2, Qr qr) {
        Object object;
        if (this.bhc != null) {
            this.bhc.clear();
        } else {
            this.bhc = Qs.baq();
            this.bhd = true;
        }
        if (qr == null || qr.bap()) {
            QD.baX();
        }
        this.a(FX, EC, qm, qu, null, n, n2, s, qr);
        if (this.bbC() && !this.bbB() && (object = this.bbn()) != null) {
            if (((QD)object).Ty() && !((QD)object).bbY()) {
                ((QD)object).bbU();
            }
            if (((QD)object).bbt()) {
                if (((QD)object).bbB() && this.bgF == null) {
                    bgA.warn((Object)(" on veut calculer un effet qui a besoin d'une cible, sans cible : " + this.bbN()));
                }
                if (((QD)object).bbA() && this.bgE == null) {
                    bgA.warn((Object)("on veut calculer un effet qui a besoin d'un caster, sans caster : " + this.bbN()));
                }
                if (((QD)object).bbC() && this.bgG == null) {
                    bgA.warn((Object)("on veut calculer un effet qui a besoin d'une cellule cible, sans cellule cible : " + this.bbN()));
                }
                ((QD)object).n(null);
            }
            if (this.bgE != null && this.bgE.baz() != null) {
                if (((QD)object).bbY() || ((QD)object).Ty()) {
                    this.bgE.baz().p((QD)object);
                }
            } else {
                ((QD)object).bbM();
            }
            if (!((QD)object).aZQ()) {
                ((QD)object).bbK();
            }
        }
        if (this.bbB()) {
            if (qu2 == null || FX != null && FX.baa()) {
                object = this.a(FX, (anU)qu, qm, n, n2, s);
                this.d((Collection<Qu>)object);
                if (this.bhc != null) {
                    this.bhc.b((Collection)object);
                }
            } else {
                this.g(qu2);
                if (this.bhc != null) {
                    this.bhc.a(qu2);
                }
            }
        }
        if (this.bhe) {
            this.bbl();
        }
        return this.bhc;
    }

    public void a(FX FX, EC EC, Qm qm, Qu qu, Qu qu2, int n, int n2, short s, Qr qr) {
        this.bgC = FX;
        this.bgD = EC;
        this.bgE = qu;
        this.bgJ = qm;
        this.bgF = qu2;
        this.c(n, n2, s);
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = qr != null ? qr.bao() : null;
        this.bbk();
    }

    public void a(Qr qr) {
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = qr;
    }

    protected void bbk() {
        if (this.bgC != null) {
            this.bgO = this.bgC.aZV();
        }
    }

    protected void bbl() {
        this.bgC = null;
        this.bgD = null;
        this.bgE = null;
        this.bgJ = null;
        this.bgF = null;
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = null;
    }

    public QD bbm() {
        return this.bgP;
    }

    public void g(QD<FX, EC> qD) {
        this.bgP = qD;
    }

    public QD b(Qm qm) {
        QD<FX, EC> qD = this.bbn();
        qD.lK(this.d());
        qD.a(qm);
        qD.a(this.baZ());
        return qD;
    }

    public QD<FX, EC> bbn() {
        @NotNull QD<FX, EC> qD = this.bbo();
        qD.bgK = bha != null ? bha.baY() : QD.baY();
        qD.h(this);
        qD.bgL = qD.bgK;
        return qD;
    }

    public abstract QD<FX, EC> bbo();

    protected void bbp() {
        this.bgI = null;
        this.bgO = -1;
        this.bgE = null;
        this.bgF = null;
        this.bgJ = null;
        this.bgC = null;
        this.bgD = null;
        this.bgQ = true;
        this.bgN.clear();
        this.bhe = false;
        this.bhc = null;
        this.bgK = -1L;
        this.bgL = -1L;
        this.bhd = false;
        this.bgV = null;
        this.bgX = false;
    }

    public void aVH() {
        this.bhf = false;
        this.bbp();
        this.bgG.Q(Integer.MIN_VALUE, Integer.MIN_VALUE, (short)Short.MIN_VALUE);
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = null;
        this.aQL = 0;
        this.bgP = null;
        this.bhb = false;
        if (this.bgY != null) {
            this.bgY.biV();
        }
        this.bgY = null;
        if (this.bhc != null && this.bhd) {
            this.bhc.aZp();
        }
    }

    protected void h(QD<FX, EC> qD) {
        this.bhf = qD.bhf;
        this.bgC = qD.bgC;
        this.bgD = qD.bgD;
        this.bgE = qD.bgE;
        this.bgF = qD.bgF;
        this.bgG.C(qD.bgG);
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = qD.bgH != null ? qD.bgH.bao() : null;
        this.bgJ = qD.bgJ;
        this.o = qD.o;
        this.bgM = qD.bgM;
        this.aQL = qD.aQL;
        this.bby();
        this.bgN.addAll(qD.bgN);
        this.bbz();
        this.bgO = qD.bgO;
        this.bgP = qD.bgP;
        this.bhb = false;
        this.bhc = qD.bhc;
        this.bgQ = qD.bgQ;
    }

    public void oC(int n) {
        this.bgN.add(n);
    }

    public void c(Collection<Integer> collection) {
        this.bgN.addAll(collection);
    }

    public void oD(int n) {
        this.bgN.remove(n);
    }

    public boolean oE(int n) {
        return this.bgN.contains(n);
    }

    public QE bbq() {
        return this.bgI;
    }

    public void a(QE qE) {
        this.bgI = qE;
    }

    public void bbr() {
        this.bgQ = false;
    }

    public void bbs() {
        this.bgQ = true;
    }

    public boolean bbt() {
        return this.bgQ;
    }

    public Qs bbu() {
        return this.bhc;
    }

    public BitSet aZJ() {
        if (this.bgC == null) {
            return null;
        }
        return this.bgC.aZJ();
    }

    public BitSet aZK() {
        if (this.bgC == null) {
            return null;
        }
        return this.bgC.aZK();
    }

    public BitSet aZM() {
        if (this.bgC == null) {
            return null;
        }
        return this.bgC.aZM();
    }

    public BitSet bbv() {
        if (this.bgC == null) {
            return null;
        }
        return this.bgC.aZN();
    }

    public BitSet bbw() {
        if (this.bgC == null) {
            return null;
        }
        return this.bgC.aZO();
    }

    public boolean oF(int n) {
        if (n < 0) {
            return false;
        }
        if (this.aZK() != null && this.aZK().get(n)) {
            return true;
        }
        if (this.aZJ() != null && this.aZJ().get(n)) {
            return true;
        }
        if (this.aZM() != null && this.aZM().get(n)) {
            return true;
        }
        if (this.bbv() != null && this.bbv().get(n)) {
            return true;
        }
        return this.bbw() != null && this.bbw().get(n);
    }

    public BitSet aZL() {
        if (this.bgC == null) {
            return null;
        }
        return this.bgC.aZL();
    }

    public BitSet bbx() {
        if (this.bgC != null && this.bgC.aZR() != null) {
            this.bgC.aZR().stream().forEach(this.bgN::add);
        }
        return QD.a(this.bgN);
    }

    @NotNull
    private static BitSet a(Set<Integer> set) {
        BitSet bitSet = new BitSet();
        set.forEach(bitSet::set);
        return bitSet;
    }

    public void bby() {
        this.bgN.clear();
        this.bgN.add(0);
    }

    public int aZP() {
        if (this.bgC == null) {
            return Integer.MIN_VALUE;
        }
        return this.bgC.aZP();
    }

    protected void bbz() {
    }

    public boolean aZQ() {
        if (this.aZK() != null && !this.aZK().isEmpty()) {
            return true;
        }
        if (this.aZJ() != null && !this.aZJ().isEmpty()) {
            return true;
        }
        if (this.aZM() != null && !this.aZM().isEmpty()) {
            return true;
        }
        if (this.bbv() != null && !this.bbv().isEmpty()) {
            return true;
        }
        return this.bbw() != null && !this.bbw().isEmpty();
    }

    public abstract boolean bbA();

    public abstract boolean bbB();

    public abstract boolean bbC();

    public void a(int n, float f, boolean bl) {
    }

    public boolean aZz() {
        return this.bgC != null && this.bgC.aZz();
    }

    public boolean aZB() {
        return this.bgC != null && this.bgC.aZB();
    }

    public void dq(byte ... byArray) {
        if (this.bbx() == null) {
            return;
        }
        for (byte by : byArray) {
            this.M(by);
        }
    }

    public void bbD() {
        this.bhf = true;
    }

    public boolean aZE() {
        return this.bhf || this.bgC != null && this.bgC.aZE();
    }

    public boolean bbE() {
        return this.bhf;
    }

    public boolean M(byte by) {
        if (this.bbx() == null) {
            return false;
        }
        boolean bl = false;
        switch (by) {
            case 1: {
                ArrayList<Qu> arrayList = new ArrayList<Qu>();
                while (this.bbc() != null && !arrayList.contains(this.bbc())) {
                    arrayList.add(this.bbc());
                    bl |= this.bbc().a(this.bbx(), (Object)this, (byte)10);
                }
                arrayList.clear();
                while (this.bbd() != null && !arrayList.contains(this.bbd())) {
                    arrayList.add(this.bbd());
                    bl |= this.bbd().a(this.bbx(), (Object)this, (byte)1);
                }
                break;
            }
            case 2: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), (Object)this, (byte)20);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), (Object)this, (byte)2);
                break;
            }
            case 3: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), (Object)this, (byte)30);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), (Object)this, (byte)3);
                break;
            }
            case 4: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), (Object)this, (byte)40);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), (Object)this, (byte)4);
                break;
            }
            case 6: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), (Object)this, (byte)60);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), (Object)this, (byte)6);
                break;
            }
        }
        return bl;
    }

    public void bbF() {
        if (this.bgJ != null && this.bgJ.bad() != null) {
            this.bgJ.bad().e(this);
        }
    }

    public void bbG() {
        if (this.bgJ != null && this.bgJ.bad() != null) {
            this.bgJ.bad().f(this);
        }
    }

    public void g(Qu qu) {
        if (qu == null) {
            return;
        }
        this.d(Collections.singletonList(qu));
    }

    public boolean d(Collection<Qu> collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        boolean bl = false;
        short s = (short)(bgS.get() + 1);
        bgS.set(s);
        if (s >= this.bbH()) {
            if (s == this.bbH()) {
                StringBuilder stringBuilder = new StringBuilder().append("infinite loop on RunningEffect ? action id=").append(this.d()).append(", effect Id ").append(this.aZH()).append(", context ").append(this.bbh());
                if (this.bbh() != null && this.bbh().bak() != null) {
                    stringBuilder.append(", Casted Spell ").append(this.bbh().bak().axA());
                }
                stringBuilder.append(", Trigger history ").append(QJ.bhM.get());
                bgA.error((Object)stringBuilder.toString(), (Throwable)new NullPointerException("Error for stack analysis"));
            }
            return false;
        }
        ArrayList<QD<FX, EC>> arrayList = new ArrayList<QD<FX, EC>>();
        ArrayList<QD<FX, EC>> arrayList2 = new ArrayList<QD<FX, EC>>();
        for (Qu object : collection) {
            QD<FX, EC> qD = this.bbn();
            qD.f(object);
            if (this.bgJ != null && this.bgJ.baf() != null) {
                qD.bgV = this.bgJ.baf().bhP();
            }
            if (!qD.aZQ()) {
                if (object != null) {
                    qD.M((byte)1);
                }
                if (qD.bgX) {
                    qD.aZp();
                    continue;
                }
                if (this.bbt() && qD.bbt()) {
                    if (this.bbA() && qD.bbc() == null) {
                        bgA.warn((Object)("Needing caster effect has no caster " + this.d() + (String)(this.bgC != null ? " generic effect " + this.bgC.aZH() + "action " + this.bgC.avZ() : "")));
                    }
                    if (this.bbC() && qD.bbe() == null) {
                        bgA.warn((Object)("Needing target cell effect has no target cell " + this.d() + (String)(this.bgC != null ? " generic effect" + this.bgC.aZH() + " action " + this.bgC.avZ() : "")));
                    }
                    qD.n(null);
                }
                bl = true;
                arrayList.add(qD);
            } else if (qD.Ty() && !qD.bbY()) {
                bl = true;
                qD.bbU();
            }
            if (qD.Ty() || qD.bbX()) {
                if (this.aZD()) {
                    if (qD.bbc() != null && qD.bbc().baz() != null) {
                        qD.bbc().baz().p(qD);
                        qD.bbF();
                    } else {
                        arrayList2.add(qD);
                    }
                } else if (qD.bbd() != null && qD.bbd().baz() != null) {
                    qD.bbd().baz().p(qD);
                    qD.bbF();
                } else {
                    arrayList2.add(qD);
                }
            }
            if (arrayList.contains(qD) || arrayList2.contains(qD) || qD.bgI != null) continue;
            qD.aZp();
        }
        for (QD qD : arrayList) {
            if (qD.Ty() && !qD.bbY()) {
                qD.bbU();
            }
            if (!qD.bbX()) {
                qD.bbK();
                continue;
            }
            qD.bbT();
        }
        for (QD qD : arrayList2) {
            qD.aZp();
        }
        return bl;
    }

    public short bbH() {
        return 400;
    }

    public void aV(boolean bl) {
        this.bgX = bl;
    }

    public abstract boolean bbI();

    protected abstract boolean bbJ();

    public boolean i(QD qD) {
        return true;
    }

    public void bbK() {
        if (this.bbI()) {
            if (this.bbd() != null && this.bbd().baM() && !this.bce()) {
                this.aX(false);
                return;
            }
            this.M((byte)2);
            if (this.bbd() != null && this.bbd().baM() && !this.bce()) {
                this.aX(false);
                return;
            }
            if (this.bbJ()) {
                this.aX(false);
                return;
            }
            this.a(this.bbm(), false);
            return;
        }
        this.aX(false);
    }

    protected void bbL() {
    }

    public void bbM() {
        this.bhb = true;
    }

    protected void j(QD qD) {
        qD.bbM();
    }

    public void k(QD qD) {
        Qu qu;
        long l;
        Qu qu2 = this.m(qD);
        long l2 = qu2 != null ? qu2.Sn() : 0L;
        Qu qu3 = this.l(qD);
        long l3 = l = qu3 != null ? qu3.Sn() : 0L;
        if (((QJ)QJ.bhM.get()).b(this.aZH(), l2, l)) {
            return;
        }
        if (!this.i(qD)) {
            return;
        }
        QD<FX, EC> qD2 = this.bbn();
        qD2.g(this);
        qD2.bgL = this.LV();
        this.j(qD2);
        if (qD != null) {
            qD2.e(this.m(qD));
            qD2.f(this.l(qD));
            if (qD2.bbd() != null) {
                qu = qD2.bbd();
                qD2.c(qu.bcC(), qu.bcD(), qu.bcE());
            } else {
                qu = qD.bbe();
                qD2.c(qu.getX(), qu.getY(), qu.bdi());
            }
        }
        if (qD2.bbB() && qD2.bbd() == null || qD2.bbA() && qD2.bbc() == null || qD2.bbd() != null && qD2.bbd().baM() && !this.bce() || qD2.bbC() && qD2.bbe() == null) {
            if (qD2.bbB() && qD2.bbd() == null) {
                bgA.error((Object)("on veut executer un effet qui a besoin d'une cible, sans cible (action=" + qD2.bbN() + ")"));
            }
            if (qD2.bbA() && qD2.bbc() == null) {
                bgA.error((Object)("on veut executer un effet qui a besoin d'un caster, sans caster\t(action = " + qD2.bbN() + ")"));
            }
            if (qD2.bbC() && qD2.bbe() == null) {
                bgA.error((Object)("on veut executer un effet qui a besoin d'une cellule cible, sans cellule cible (action=" + qD2.bbN() + ")"));
            }
            qD2.aZp();
            return;
        }
        qu = ((QJ)QJ.bhM.get()).a(this.aZH(), l2, l);
        boolean bl = qu.bcr() == null;
        try {
            if (qD2.bbt()) {
                qD2.n(qD);
            }
            qD2.dq(1, 2);
            long l4 = this.LV();
            qD2.a(qD, true);
            if (this.LV() == l4) {
                this.aX(true);
            }
        }
        catch (Exception exception) {
            bgA.error((Object)("[RE] An error occurred while executing running effect " + String.valueOf(qD2) + ", current effect = " + String.valueOf(this)), (Throwable)exception);
        }
        ((QJ)QJ.bhM.get()).bcp();
        if (bl) {
            ((QJ)QJ.bhM.get()).clear();
        }
    }

    public String bbN() {
        return this.bgC == null ? this.getClass().getSimpleName() : "Act#" + this.bgC.avZ() + "@Eff#" + this.bgC.aZH();
    }

    protected Qu l(QD qD) {
        if (qD == null || this.bgC == null || this.aZB()) {
            return this.bgF;
        }
        if (this.aZz()) {
            if (this.bgC.aZC()) {
                return qD.bbc();
            }
            return qD.bbd();
        }
        if (this.bgC.aZC()) {
            return qD.bbd();
        }
        return qD.bbc();
    }

    protected Qu m(QD qD) {
        return this.bgE;
    }

    public void bbO() {
        if (this.bgI != null) {
            this.bgI.q(this);
        } else {
            this.bbR();
        }
    }

    public void bbP() {
        this.bbO();
    }

    public boolean bbQ() {
        return this.bgR;
    }

    public void bbR() {
        this.aW(true);
    }

    public void bbS() {
    }

    public void aW(boolean bl) {
        this.bbS();
        if (bl) {
            this.bbZ();
        }
        this.bbG();
        this.bgR = true;
        if (!this.bhe) {
            this.aZp();
        }
    }

    public abstract void bbT();

    public abstract void bbU();

    public TN bbV() {
        return this.bgV;
    }

    public abstract TZ bbW();

    public abstract boolean bbX();

    public boolean aZD() {
        return this.bgC != null && this.bgC.aZD();
    }

    public abstract boolean Ty();

    public abstract boolean bbY();

    public void a(QD qD, boolean bl) {
        this.bbZ();
        if (this.bhc != null) {
            this.bhc.a(this.bbx());
            this.bhc.bar();
        }
        this.dq(3, 4);
        this.bbL();
        this.aX(true);
    }

    public void aX(boolean bl) {
        boolean bl2 = false;
        if (bl && this.bgO >= 0) {
            if (this.bgO > 0) {
                --this.bgO;
            }
            if (this.bgO == 0) {
                bl2 = true;
            }
        }
        if (!(this.bbQ() || this.Ty() && !bl2)) {
            this.bbO();
        }
    }

    protected void bbZ() {
        try {
            for (int n = 0; this.bca() && n < 3; n = (int)((byte)(n + 1))) {
            }
        }
        catch (Exception exception) {
            bgA.error((Object)"Exception catch\u00e9e : ", (Throwable)exception);
        }
    }

    protected boolean bca() {
        boolean bl = false;
        if (this.bgF != null && !this.bgF.baI() && this.bgF.baF() && this.bgF.baN()) {
            this.bgF.aT(true);
            bl = true;
            this.bgF.b(this.bgE);
            if (this.bgF != null) {
                this.bgF.aT(false);
            }
        }
        if (this.bgE != null && !this.bgE.baI() && this.bgE.baF() && this.bgE.baN()) {
            this.bgE.aT(true);
            bl = true;
            this.bgE.b(this.bgE);
            if (this.bgE != null) {
                this.bgE.aT(false);
            }
        }
        return bl;
    }

    public abstract void n(QD var1);

    public boolean o(QD qD) {
        return false;
    }

    public byte[] apI() {
        return this.bcb().toByteArray();
    }

    @NotNull
    public iM bcb() {
        iO iO2 = iM.QQ().ak(this.LV()).al(this.Qq()).eK(this.bgC == null ? this.bcd().aZH() : this.bgC.aZH()).eL(this.aQL);
        if (this.bgG != null) {
            iO2.a(im.NP().es(this.bgG.getX()).et(this.bgG.getY()).eu((int)this.bgG.bdi()));
        }
        if (this.bgE != null) {
            iO2.am(this.bgE.Sn());
        }
        if (this.bgF != null) {
            iO2.an(this.bgF.Sn());
        }
        if (this.bgD != null) {
            iO2.eM(this.bgD.bab()).ao(this.bgD.QF());
        }
        iO2.d(this.QH());
        this.a(iO2);
        this.b(iO2);
        this.c(iO2);
        return iO2.QW();
    }

    public iM dr(byte[] byArray) {
        try {
            iM iM2 = iM.bf((byte[])byArray);
            this.d(iM2);
            return iM2;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bgA.error((Object)"Error trying to unserialize a RE", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }

    public void d(iM iM2) {
        long l;
        this.di(iM2.LV());
        this.bgL = iM2.Qq();
        if (this.bgJ != null && this.bgJ.bac() != null && iM2.Qr()) {
            this.bgC = this.bgJ.bac().oy(iM2.Qs());
            if (this.bgC == null) {
                bgA.error((Object)("Unable to unserialize RunningEffect : generic effect unknown : " + iM2.Qs()));
            }
        }
        if (iM2.LW()) {
            this.bgG.Q(iM2.Qt().getX(), iM2.Qt().getY(), GC.cu((long)iM2.Qt().NN()));
        }
        this.aQL = iM2.getValue();
        if (iM2.Qv()) {
            l = iM2.Qw();
            this.dk(l);
        } else {
            this.bgE = null;
        }
        if (iM2.Qx()) {
            l = iM2.Qy();
            this.dj(l);
        } else {
            this.bgF = null;
        }
        if (iM2.QC() && iM2.QE()) {
            this.f(iM2.QD(), iM2.QF());
        }
        if (iM2.QG()) {
            this.f(iM2.QH());
        }
        this.e(iM2);
        this.f(iM2);
        this.g(iM2);
    }

    public void dj(long l) {
        if (this.bgJ != null && this.bgJ.bah() != null) {
            this.bgF = this.bgJ.bah().dg(l);
            if (this.bgF == null) {
                // empty if block
            }
        }
    }

    public void dk(long l) {
        if (this.bgJ != null && this.bgJ.bah() != null) {
            this.e(this.bgJ.bah().dg(l));
            if (this.bgE == null) {
                // empty if block
            }
        } else {
            bgA.error((Object)("No context, unable to get caster for RE : " + this.o));
        }
    }

    protected abstract void f(iA var1);

    protected abstract void f(int var1, long var2);

    public fi bcc() {
        return fi.oX;
    }

    public abstract iA QH();

    protected void a(iO iO2) {
    }

    protected void e(iM iM2) {
    }

    protected void b(iO iO2) {
        fi fi2 = this.bcc();
        if (fi2 == null || fi2 == fi.oX) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(fi2.zt());
        fi2.as(byteBuffer);
        iO2.d(ii.MR().bT(ByteString.copyFrom((byte[])byteBuffer.array())).MX());
    }

    protected void f(iM iM2) {
        if (iM2.Qz()) {
            ByteString byteString = iM2.QA().LO();
            this.bcc().a(ByteBuffer.wrap(byteString.toByteArray()), 0);
        }
    }

    protected void c(iO iO2) {
    }

    protected void g(iM iM2) {
    }

    public abstract Qj bcd();

    public void dl(long l) {
        this.bgL = l;
    }

    public void a(Ud ud) {
        this.bgY = ud;
    }

    protected abstract boolean bce();

    public void ds(byte[] byArray) {
        this.bgZ = byArray;
    }

    public byte[] bcf() {
        return this.bgZ;
    }

    public String toString() {
        return "RunningEffect{m_genericEffect=" + String.valueOf(this.bgC) + ", m_caster=" + String.valueOf(this.bgE) + ", m_target=" + String.valueOf(this.bgF) + ", m_targetCell=" + String.valueOf(this.bgG) + ", m_id=" + this.o + ", m_uid=" + this.bgK + ", m_value=" + this.aQL + "}";
    }
}


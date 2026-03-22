/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.InvalidProtocolBufferException
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
implements aoy_1 {
    private static final byte bgz = 3;
    protected static final Logger bgA = Logger.getLogger(QD.class);
    protected boolean bgB = false;
    protected FX bgC = null;
    protected EC bgD = null;
    protected qu_0 bgE = null;
    protected qu_0 bgF = null;
    protected final acd_1 bgG = new acd_1();
    private qr_0 bgH;
    private QE bgI = null;
    protected qm_0<FX> bgJ = null;
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
    private static qh_0 bha = null;
    protected boolean bhb = false;
    protected qs_0 bhc = null;
    private boolean bhd = false;
    protected boolean bhe = false;
    private boolean bhf = false;

    public static void baX() {
        bgS.set((short)0);
    }

    public static void a(qh_0 qh_02) {
        bha = qh_02;
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
        this.bhc = new qs_0();
        this.bhe = true;
    }

    public qu_0 bbc() {
        return this.bgE;
    }

    public void e(qu_0 qu_02) {
        this.bgE = qu_02;
    }

    public qu_0 bbd() {
        return this.bgF;
    }

    public acd_1 bbe() {
        return this.bgG;
    }

    public EC bbf() {
        return this.bgD;
    }

    public void f(qu_0 qu_02) {
        this.bgF = qu_02;
    }

    public void c(int n, int n2, short s) {
        this.bgG.Q(n, n2, s);
    }

    public qr_0 bbg() {
        return this.bgH;
    }

    public void a(EC EC) {
        this.bgD = EC;
    }

    public void a(qm_0 qm_02) {
        this.bgJ = qm_02;
    }

    public qm_0 bbh() {
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

    public abstract List<qu_0> a(FX var1, anu_1 var2, qm_0<FX> var3, int var4, int var5, short var6);

    public qs_0 a(FX FX, EC EC, qm_0 qm_02, qu_0 qu_02, int n, int n2, short s, qu_0 qu_03, qr_0 qr_02) {
        Object object;
        if (this.bhc != null) {
            this.bhc.clear();
        } else {
            this.bhc = qs_0.baq();
            this.bhd = true;
        }
        if (qr_02 == null || qr_02.bap()) {
            QD.baX();
        }
        this.a(FX, EC, qm_02, qu_02, null, n, n2, s, qr_02);
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
            if (qu_03 == null || FX != null && FX.baa()) {
                object = this.a(FX, qu_02, qm_02, n, n2, s);
                this.d((Collection<qu_0>)object);
                if (this.bhc != null) {
                    this.bhc.b((Collection<qu_0>)object);
                }
            } else {
                this.g(qu_03);
                if (this.bhc != null) {
                    this.bhc.a(qu_03);
                }
            }
        }
        if (this.bhe) {
            this.bbl();
        }
        return this.bhc;
    }

    public void a(FX FX, EC EC, qm_0 qm_02, qu_0 qu_02, qu_0 qu_03, int n, int n2, short s, qr_0 qr_02) {
        this.bgC = FX;
        this.bgD = EC;
        this.bgE = qu_02;
        this.bgJ = qm_02;
        this.bgF = qu_03;
        this.c(n, n2, s);
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = qr_02 != null ? qr_02.bao() : null;
        this.bbk();
    }

    public void a(qr_0 qr_02) {
        if (this.bgH != null) {
            this.bgH.aZp();
        }
        this.bgH = qr_02;
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

    public QD b(qm_0 qm_02) {
        QD<FX, EC> qD = this.bbn();
        qD.lK(this.d());
        qD.a(qm_02);
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

    public qs_0 bbu() {
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

    public void a(int n, float f2, boolean bl) {
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
                ArrayList<qu_0> arrayList = new ArrayList<qu_0>();
                while (this.bbc() != null && !arrayList.contains(this.bbc())) {
                    arrayList.add(this.bbc());
                    bl |= this.bbc().a(this.bbx(), this, (byte)10);
                }
                arrayList.clear();
                while (this.bbd() != null && !arrayList.contains(this.bbd())) {
                    arrayList.add(this.bbd());
                    bl |= this.bbd().a(this.bbx(), this, (byte)1);
                }
                break;
            }
            case 2: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), this, (byte)20);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), this, (byte)2);
                break;
            }
            case 3: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), this, (byte)30);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), this, (byte)3);
                break;
            }
            case 4: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), this, (byte)40);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), this, (byte)4);
                break;
            }
            case 6: {
                if (this.bbc() != null) {
                    bl |= this.bbc().a(this.bbx(), this, (byte)60);
                }
                if (this.bbd() == null) break;
                bl |= this.bbd().a(this.bbx(), this, (byte)6);
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

    public void g(qu_0 qu_02) {
        if (qu_02 == null) {
            return;
        }
        this.d(Collections.singletonList(qu_02));
    }

    public boolean d(Collection<qu_0> collection) {
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
                stringBuilder.append(", Trigger history ").append(qj_0.bhM.get());
                bgA.error((Object)stringBuilder.toString(), (Throwable)new NullPointerException("Error for stack analysis"));
            }
            return false;
        }
        ArrayList<QD<FX, EC>> arrayList = new ArrayList<QD<FX, EC>>();
        ArrayList<QD<FX, EC>> arrayList2 = new ArrayList<QD<FX, EC>>();
        for (qu_0 object : collection) {
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
        Object object;
        long l;
        qu_0 qu_02 = this.m(qD);
        long l2 = qu_02 != null ? qu_02.Sn() : 0L;
        qu_0 qu_03 = this.l(qD);
        long l3 = l = qu_03 != null ? qu_03.Sn() : 0L;
        if (qj_0.bhM.get().b(this.aZH(), l2, l)) {
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
                object = qD2.bbd();
                qD2.c(object.bcC(), object.bcD(), object.bcE());
            } else {
                object = qD.bbe();
                qD2.c(((acd_1)object).getX(), ((acd_1)object).getY(), ((acd_1)object).bdi());
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
        object = qj_0.bhM.get().a(this.aZH(), l2, l);
        boolean bl = ((QL)object).bcr() == null;
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
        qj_0.bhM.get().bcp();
        if (bl) {
            qj_0.bhM.get().clear();
        }
    }

    public String bbN() {
        return this.bgC == null ? this.getClass().getSimpleName() : "Act#" + this.bgC.avZ() + "@Eff#" + this.bgC.aZH();
    }

    protected qu_0 l(QD qD) {
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

    protected qu_0 m(QD qD) {
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

    public abstract tz_0 bbW();

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
    public im_1 bcb() {
        io_1 io_12 = im_1.QQ().ak(this.LV()).al(this.Qq()).eK(this.bgC == null ? this.bcd().aZH() : this.bgC.aZH()).eL(this.aQL);
        if (this.bgG != null) {
            io_12.a(im_2.NP().es(this.bgG.getX()).et(this.bgG.getY()).eu(this.bgG.bdi()));
        }
        if (this.bgE != null) {
            io_12.am(this.bgE.Sn());
        }
        if (this.bgF != null) {
            io_12.an(this.bgF.Sn());
        }
        if (this.bgD != null) {
            io_12.eM(this.bgD.bab()).ao(this.bgD.QF());
        }
        io_12.d(this.QH());
        this.a(io_12);
        this.b(io_12);
        this.c(io_12);
        return io_12.QW();
    }

    public im_1 dr(byte[] byArray) {
        try {
            im_1 im_12 = im_1.bf(byArray);
            this.d(im_12);
            return im_12;
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bgA.error((Object)"Error trying to unserialize a RE", (Throwable)invalidProtocolBufferException);
            return null;
        }
    }

    public void d(im_1 im_12) {
        long l;
        this.di(im_12.LV());
        this.bgL = im_12.Qq();
        if (this.bgJ != null && this.bgJ.bac() != null && im_12.Qr()) {
            this.bgC = this.bgJ.bac().oy(im_12.Qs());
            if (this.bgC == null) {
                bgA.error((Object)("Unable to unserialize RunningEffect : generic effect unknown : " + im_12.Qs()));
            }
        }
        if (im_12.LW()) {
            this.bgG.Q(im_12.Qt().getX(), im_12.Qt().getY(), GC.cu(im_12.Qt().NN()));
        }
        this.aQL = im_12.getValue();
        if (im_12.Qv()) {
            l = im_12.Qw();
            this.dk(l);
        } else {
            this.bgE = null;
        }
        if (im_12.Qx()) {
            l = im_12.Qy();
            this.dj(l);
        } else {
            this.bgF = null;
        }
        if (im_12.QC() && im_12.QE()) {
            this.f(im_12.QD(), im_12.QF());
        }
        if (im_12.QG()) {
            this.f(im_12.QH());
        }
        this.e(im_12);
        this.f(im_12);
        this.g(im_12);
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

    protected abstract void f(ia_2 var1);

    protected abstract void f(int var1, long var2);

    public fi_1 bcc() {
        return fi_1.oX;
    }

    public abstract ia_2 QH();

    protected void a(io_1 io_12) {
    }

    protected void e(im_1 im_12) {
    }

    protected void b(io_1 io_12) {
        fi_1 fi_12 = this.bcc();
        if (fi_12 == null || fi_12 == fi_1.oX) {
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(fi_12.zt());
        fi_12.as(byteBuffer);
        io_12.d(ii_1.MR().bT(ByteString.copyFrom((byte[])byteBuffer.array())).MX());
    }

    protected void f(im_1 im_12) {
        if (im_12.Qz()) {
            ByteString byteString = im_12.QA().LO();
            this.bcc().a(ByteBuffer.wrap(byteString.toByteArray()), 0);
        }
    }

    protected void c(io_1 io_12) {
    }

    protected void g(im_1 im_12) {
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


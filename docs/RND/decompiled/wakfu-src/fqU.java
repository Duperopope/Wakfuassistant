/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class fqU
implements eNl {
    private static final int sWD = 981;
    public static final short sWE = 0;
    public static final short sWF = 0;
    public static final short sWG = 0;
    protected short sWH;
    protected short sWI;
    protected short sWJ;
    protected int sWK;
    protected boolean esK;
    protected int sWL;
    protected int sWM;
    protected boolean esN;
    protected boolean esL;
    protected boolean sWN;
    protected boolean esQ;
    protected boolean sWO = false;
    protected boolean esR = false;
    protected TIntHashSet sWP;
    protected ang_2 sWQ;
    private final HashSet<Integer> sWR = new HashSet();
    private boolean sWS;
    protected boolean esU;
    protected byte esV;
    protected exe_0 sWT;
    protected List<Pf> sWU = null;
    protected boolean esT = false;
    protected short ejt;
    protected int dJT;
    protected azl_2<enk_0> bil = new azl_2();
    private boolean sWV = false;
    protected boolean sWW = false;
    protected boolean sWX = false;

    public static int ag(short s, short s2) {
        return (s << 16) + (s2 & 0xFFFF);
    }

    public static short Zl(int n) {
        return (short)(n >> 16);
    }

    public ang_2 gjv() {
        return this.sWQ;
    }

    public static short YZ(int n) {
        return (short)(n & 0xFFFF);
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    public fqU cm(short s) {
        fqU fqU2 = new fqU();
        this.a(s, fqU2);
        return fqU2;
    }

    protected void a(short s, fqU fqU2) {
        fqU2.sWI = this.sWI;
        fqU2.sWH = this.sWH;
        fqU2.sWJ = this.sWJ;
        fqU2.sWK = this.sWK;
        fqU2.sWL = this.sWL;
        fqU2.esK = this.esK;
        fqU2.sWM = this.sWM;
        fqU2.bil = this.bil;
        fqU2.sWR.addAll(this.sWR);
        fqU2.ejt = (short)Math.min(s, this.sWH);
        fqU2.dJT = fqU.ag(this.sWI, s);
        fqU2.esN = this.esN;
        fqU2.esL = this.esL;
        fqU2.sWN = this.sWN;
        fqU2.sWP = this.sWP;
        fqU2.esQ = this.esQ;
        fqU2.sWO = this.sWO;
        fqU2.esR = this.esR;
        fqU2.esT = this.esT;
        fqU2.esU = this.esU;
        fqU2.sWV = this.sWV;
        fqU2.esV = this.esV;
        fqU2.sWW = this.sWW;
        fqU2.sWX = this.sWX;
    }

    public int giB() {
        return this.Zm(this.ejt);
    }

    public Ua gjw() {
        return this.fF(this.ejt);
    }

    public Ua fF(short s) {
        short s2 = (short)this.Zm(s);
        return Ua.pB(s2).bp(false).bo(this.esK).am((short)(this.sWJ + 1));
    }

    public int Zm(int n) {
        return this.sWJ + (int)Math.floor((n < this.sWH ? n : (int)this.sWH) * this.sWK);
    }

    public int gjx() {
        return this.sWL + (this.ejt < this.sWH ? this.ejt : this.sWH) * this.sWM;
    }

    public short gjy() {
        return this.sWI;
    }

    public int caO() {
        return this.dJT;
    }

    public void v(enk_0 enk_02) {
        this.bil.M(enk_02);
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        return this.fB(this.cmL()).iterator();
    }

    public ArrayList<enk_0> fB(short s) {
        int n = this.bil.aVo();
        ArrayList<enk_0> arrayList = new ArrayList<enk_0>(n);
        for (int i = 0; i < n; ++i) {
            enk_0 enk_02 = this.bil.vK(i);
            if (s < enk_02.fAv() || s > enk_02.fAw()) continue;
            arrayList.add(enk_02);
        }
        return arrayList;
    }

    public HashSet<Integer> gjz() {
        return this.sWR;
    }

    public void Zn(int n) {
        this.sWR.add(n);
    }

    @Override
    public int bab() {
        return 1;
    }

    @Override
    public long QF() {
        return this.dJT;
    }

    public boolean cwt() {
        return this.esN && !this.sWS;
    }

    public Iterator<Pf> gjA() {
        return this.sWU != null ? this.sWU.iterator() : new azi_1();
    }

    public boolean gjB() {
        return this.sWU != null && !this.sWU.isEmpty();
    }

    public boolean cws() {
        return this.sWN;
    }

    @Override
    public short fvT() {
        return 0;
    }

    @Override
    public short fvU() {
        return 0;
    }

    @Override
    public short fvV() {
        return 0;
    }

    public boolean gjC() {
        return this.sWS;
    }

    public void oj(boolean bl) {
        this.sWS = bl;
    }

    public boolean cwA() {
        return this.esU;
    }

    public TIntHashSet gjD() {
        return this.sWP;
    }

    public boolean gjE() {
        return this.gjx() < 0 && this.giB() < 0;
    }

    public boolean cww() {
        return this.esQ;
    }

    public boolean gjF() {
        return this.sWO;
    }

    public boolean cwx() {
        return this.esR;
    }

    public void ok(boolean bl) {
        this.esR = bl;
    }

    public short gjG() {
        return this.sWH;
    }

    public boolean cwz() {
        return this.esT;
    }

    public String getName() {
        return "state-" + this.gjy();
    }

    public void ol(boolean bl) {
        this.sWV = bl;
    }

    public boolean gjH() {
        return this.sWV;
    }

    public boolean gjI() {
        return this.sWI == 981;
    }

    public exe_0 gjJ() {
        return this.sWT;
    }

    public fqY eet() {
        return fqY.hz(this.esV);
    }

    public boolean gjK() {
        return this.sWW;
    }

    public boolean gjL() {
        return this.sWX;
    }

    public void om(boolean bl) {
        this.sWX = bl;
    }

    public String toString() {
        return "State{m_stateBaseId=" + this.sWI + ", m_level=" + this.ejt + "}";
    }
}


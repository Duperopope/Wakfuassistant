/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class eKR {
    private static final Logger qEe = Logger.getLogger(eKR.class);
    private static final double qEf = 10.0;
    public static final byte qEg = 0;
    public static final float qEh = 0.6666667f;
    private final int qEi;
    private final int qEj;
    private final short qEk;
    private final long qEl;
    private final int qEm;
    private final int qEn;
    private final ang_2 qEo;
    private final ang_2 qEp;
    private final boolean qEq;
    private final EnumSet<eKS> qEr;
    protected final Map<Integer, Bu<Short, Short>> qEs = new HashMap<Integer, Bu<Short, Short>>();
    private final eKV qEt;
    private final int[] qEu;

    public eKR(int n, int n2, short s, long l, int n3, ang_2 ang_22, ang_2 ang_23, boolean bl, EnumSet<eKS> enumSet, eKV eKV2, int n4, int[] nArray) {
        this.qEi = n;
        this.qEj = n2;
        this.qEk = s;
        this.qEl = l;
        this.qEm = n3;
        this.qEo = ang_22;
        this.qEp = ang_23;
        this.qEq = bl;
        this.qEr = enumSet != null ? enumSet : EnumSet.noneOf(eKS.class);
        this.qEt = eKV2;
        this.qEu = nArray;
        this.qEn = n4;
    }

    public boolean at(exP exP2) {
        return this.qEo == null || this.qEo.b(exP2, exP2, this, exP2.bdV());
    }

    public boolean au(exP exP2) {
        return this.qEp == null || this.qEp.b(exP2, exP2, this, exP2.bdV());
    }

    public boolean cui() {
        return this.qEq;
    }

    public boolean av(exP exP2) {
        return this.au(exP2) && (!this.cui() || this.at(exP2));
    }

    public boolean b(eki_0 eki_02) {
        return this.c(eKS.qEv) && !eki_02.h(this);
    }

    public byte aFW() {
        return 0;
    }

    public void a(eKS eKS2) {
        this.qEr.add(eKS2);
    }

    public void e(Collection<eKS> collection) {
        this.qEr.addAll(collection);
    }

    public void b(eKS eKS2) {
        this.qEr.remove(eKS2);
    }

    public void g(Collection<eKS> collection) {
        this.qEr.removeAll(collection);
    }

    public boolean c(eKS eKS2) {
        return this.qEr.contains(eKS2);
    }

    public Iterator<eKS> bek() {
        return this.qEr.iterator();
    }

    public int[] fyV() {
        return this.qEu;
    }

    public int d() {
        return this.qEi;
    }

    public short dxy() {
        return this.qEk;
    }

    @NotNull
    public ekb_0 fyW() {
        return ekb_0.dS(this.dxy());
    }

    public boolean fyX() {
        eKV eKV2 = this.fyZ();
        if (eKV2 == null || eKV2 == eKV.qEF) {
            return false;
        }
        int n = eKV2.azv();
        Object r = fgD.fXh().Vd(n);
        if (r == null) {
            return false;
        }
        return ((fhc_0)r).dGh().cqc();
    }

    public long fyY() {
        return this.qEl;
    }

    public int cuj() {
        return this.qEm;
    }

    public long aw(exP exP2) {
        int n = exP2.dmn().a(eje_0.qyv, this.qEj, 8);
        double d2 = 1.0 / (double)this.qEl;
        double d3 = 1.0 + (double)n / 100.0;
        double d4 = d2 * d3;
        return Math.round(1.0 / d4);
    }

    public double dU(short s) {
        double d2 = GC.b((double)(this.qEk - s), 0.0, 10.0);
        double d3 = d2 / 10.0;
        return 1.0 - d3;
    }

    public long a(short s, eve_2 eve_22) {
        return eKX.a(s, this.qEk, eKQ.qEb.QV(this.qEj), this.qEm, eve_22);
    }

    public long a(eve_2 eve_22) {
        eKW eKW2 = eKQ.qEb.QV(this.qEj);
        int n = (int)((float)this.qEm * 0.6666667f);
        return eKX.a(this.qEk, this.qEk, eKW2, n, eve_22);
    }

    public eKV fyZ() {
        return this.qEt;
    }

    public Iterator<Map.Entry<Integer, Bu<Short, Short>>> fza() {
        return this.qEs.entrySet().iterator();
    }

    public ang_2 bdo() {
        return this.qEo;
    }

    public boolean QX(int n) {
        return this.qEs.containsKey(n);
    }

    public void b(int n, short s, short s2) {
        this.qEs.put(n, new Bu<Short, Short>(s, s2));
    }

    public String toString() {
        return "CraftRecipe{m_id=" + this.qEi + ", m_craftId=" + this.qEj + ", m_requiredLevel=" + this.qEk + ", m_craftDuration=" + this.qEl + "}";
    }

    public boolean dxG() {
        return this.qEn > 0;
    }

    public int cuo() {
        return this.qEn;
    }

    public int cms() {
        return this.qEj;
    }

    public eKW exD() {
        return eKQ.qEb.QV(this.qEj);
    }

    public Map<Integer, Bu<Short, Short>> fzb() {
        return this.qEs;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class eNB
extends qz_0
implements enk_0 {
    private static final double qYF = 1.0E-5;
    private final float qYG;
    private final float qYH;
    private final float[] qYI;
    private final int qYJ;
    private final boolean qYK;
    private final boolean qYL;
    private final boolean qYM;
    private final boolean qYN;
    private boolean etS;
    private final int qYO;
    private final int qYP;
    private final ang_2 qYQ;
    private boolean qYR;
    private final byte qYS;
    private List<Pf> qYT;
    private List<Pf> qYU;
    private List<Pf> qYV;
    private List<Pf> qYW;
    private List<Pf> qYX;
    private List<Pf> qYY;
    private final boolean qYZ;
    private final boolean qZa;
    private final boolean qZb;
    private int dKh;
    private boolean etQ = true;
    private boolean etR = true;
    private QC qZc;
    private QA qZd;
    private final aoh_1 qZe;
    protected static final int[] qZf = new int[0];
    protected static final float[] qZg = new float[0];
    protected static final int[] qZh = new int[]{0};
    private final float qZi;
    private boolean qZj = false;
    private boolean qYi;
    private Set<eNi> qZk;

    public eNB(int n, int n2, aoh_1 aoh_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, anx_1<qu_0> anx_12, boolean bl, float[] fArray, float f2, float f3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, ang_2 ang_22, short s, float f4, byte by, boolean bl6, boolean bl7, boolean bl8, boolean bl9, boolean bl10, aoh_1 aoh_13, boolean bl11, boolean bl12, boolean bl13) {
        super(n, n2, aoh_12, nArray, nArray2, nArray3, nArray4, nArray5, nArray6, nArray7, l, anx_12, bl, bl2, s, bl3, bl4, bl5, bl7);
        this.qZe = aoh_13;
        this.qYG = f2;
        this.qYH = f3;
        this.qYI = fArray;
        this.qYJ = fArray.length / 2;
        this.qYS = by;
        this.qYO = n3;
        this.qYP = n4;
        this.qYQ = ang_22;
        this.qYK = bl6;
        this.qYL = bl11;
        this.qYM = bl12;
        this.qYN = bl13;
        this.qYZ = bl8;
        this.qZa = bl9;
        this.qZi = f4;
        this.qZb = bl10;
        if (n2 != -1 && n2 != -2) {
            ero_0 ero_02 = (ero_0)enf_0.fBb().pU(n2);
            if (ero_02 == null) {
                bfD.error((Object)("Impossible de cr\u00e9er l'effet " + n + " : action " + n2 + " inconnue"));
            } else if (!ero_02.bEt().oQ(fArray.length)) {
                bfD.error((Object)("Impossible de cr\u00e9er l'effet " + n + " : nombre de param\u00e8tres incorrect : " + fArray.length));
            }
        }
    }

    protected eNB(int n, int n2, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, anx_1<qu_0> anx_12, boolean bl, float[] fArray, float f2, float f3, boolean bl2, boolean bl3, boolean bl4, boolean bl5, int n3, int n4, ang_2 ang_22, short s, float f4, boolean bl6, boolean bl7, boolean bl8, boolean bl9, boolean bl10, aoh_1 aoh_13, boolean bl11, boolean bl12, boolean bl13) {
        super(n, n2, aoh_12, bitSet, bitSet2, bitSet3, bitSet4, bitSet5, bitSet6, bitSet7, l, anx_12, bl, bl2, s, bl3, bl4, bl5, bl6);
        this.qZe = aoh_13;
        this.qYG = f2;
        this.qYH = f3;
        this.qYI = fArray;
        this.qYJ = fArray.length / 2;
        this.qYS = (byte)-1;
        this.qYK = bl9;
        this.qYL = bl11;
        this.qYM = bl12;
        this.qYN = bl13;
        this.qZi = f4;
        this.qYO = n3;
        this.qYP = n4;
        this.qYQ = ang_22;
        this.qYZ = bl7;
        this.qZa = bl8;
        this.qZb = bl10;
    }

    @Override
    public byte aZG() {
        return 0;
    }

    @Override
    public float eb(short s) {
        return this.qYG + (float)s * this.qYH;
    }

    @Override
    public boolean fAt() {
        return this.qYZ || this.qZa;
    }

    @Override
    public boolean beB() {
        return this.qYZ;
    }

    @Override
    public boolean fAu() {
        return this.qZa;
    }

    public boolean cxw() {
        return this.qZb;
    }

    @Override
    public byte fAl() {
        return this.qYS;
    }

    @Override
    public float[] fAm() {
        return this.qYI;
    }

    @Override
    public int fAn() {
        return this.qYJ;
    }

    @Override
    public int a(int n, short s, ene_0 ene_02) {
        float f2 = this.x(n, s);
        switch (ene_02) {
            case qPu: {
                if (this.qYI[n * 2 + 1] >= 0.0f) {
                    return (int)Math.floor(f2);
                }
                return (int)Math.ceil(f2);
            }
        }
        return (int)f2;
    }

    @Override
    public float x(int n, short s) {
        if (n < 0 || n >= this.qYI.length / 2) {
            throw new IllegalArgumentException("Tentative de r\u00e9cup\u00e9ration d'un param\u00e8tre d'ID " + n + " alors que le nombre de valeurs est de " + this.qYI.length + " effet : " + this.aZH());
        }
        float f2 = this.qYI[n * 2 + 1] * (float)s;
        if ((double)Math.abs(f2 - (float)Math.round(f2)) < 1.0E-5) {
            f2 = Math.round(f2);
        }
        return this.qYI[n * 2] + f2;
    }

    @Override
    public float Rz(int n) {
        if (n < 0 || n >= this.qYI.length / 2) {
            throw new IllegalArgumentException("Tentative de r\u00e9cup\u00e9ration d'un param\u00e8tre d'ID " + n + " alors que le nombre de valeurs est de " + this.qYI.length);
        }
        return this.qYI[n * 2];
    }

    public float RV(int n) {
        if (n < 0 || n >= this.qYI.length / 2) {
            throw new IllegalArgumentException("Tentative de r\u00e9cup\u00e9ration d'un param\u00e8tre d'ID " + n + " alors que le nombre de valeurs est de " + this.qYI.length);
        }
        return this.qYI[n * 2 + 1];
    }

    @Override
    public boolean fAo() {
        return this.qYK;
    }

    @Override
    public boolean fAp() {
        return this.qYL;
    }

    @Override
    public boolean fAq() {
        return this.qYM;
    }

    @Override
    public boolean fAr() {
        return this.qYN;
    }

    public eNB fBs() {
        float[] fArray = new float[this.qYI.length];
        System.arraycopy(this.qYI, 0, fArray, 0, this.qYI.length);
        eNB eNB2 = new eNB(this.aZH(), this.avZ(), this.aZS(), this.aZJ(), this.aZK(), this.aZL(), this.aZM(), this.aZN(), this.aZO(), this.aZR(), this.aZU(), this.aZI(), this.aZT(), fArray, this.qYG, this.qYH, this.aZz(), this.aZC(), this.aZB(), this.aZD(), this.qYO, this.qYP, this.qYQ, this.aZV(), this.cxm(), this.aZE(), this.beB(), this.fAu(), this.fAo(), this.cxw(), this.fAB(), this.fAp(), this.fAq(), this.fAr());
        eNB2.bfT = this.bfT;
        return eNB2;
    }

    @Override
    public float cxm() {
        return this.qZi;
    }

    @Override
    public int cbj() {
        return this.dKh;
    }

    @Override
    public void xV(int n) {
        this.dKh = n;
    }

    @Override
    public void a(QB qB) {
        this.bfT = qB;
    }

    @Override
    public void a(QC qC) {
        this.qZc = qC;
    }

    @Override
    public QC aZY() {
        return this.qZc;
    }

    @Override
    public void a(QA qA) {
        this.qZd = qA;
    }

    @Override
    public QA aZZ() {
        return this.qZd;
    }

    @Override
    public boolean aZC() {
        return this.qZc == QC.bgs;
    }

    @Override
    public void lN(boolean bl) {
        super.aU(bl);
    }

    @Override
    public ang_2 fAx() {
        return this.qYQ;
    }

    @Override
    public int fAv() {
        return this.qYO;
    }

    @Override
    public int fAw() {
        return this.qYP;
    }

    public float fBv() {
        return this.qYH;
    }

    @Override
    public float fAy() {
        return this.qYG;
    }

    @Override
    public void lO(boolean bl) {
        this.etQ = bl;
    }

    @Override
    public boolean cxB() {
        return this.etQ;
    }

    @Override
    public boolean cxC() {
        return this.etR;
    }

    @Override
    public void lP(boolean bl) {
        this.etR = bl;
    }

    @Override
    public boolean baa() {
        return this.qZj;
    }

    public void lU(boolean bl) {
        this.qZj = bl;
    }

    @Override
    public void a(Pf pf) {
        if (this.qYT == null) {
            this.qYT = new ArrayList<Pf>();
        }
        this.qYT.add(pf);
        this.k(pf);
    }

    @Override
    public void b(Pf pf) {
        if (this.qYU == null) {
            this.qYU = new ArrayList<Pf>();
        }
        this.qYU.add(pf);
        this.k(pf);
    }

    @Override
    public void c(Pf pf) {
        if (this.qYV == null) {
            this.qYV = new ArrayList<Pf>();
        }
        this.qYV.add(pf);
        this.k(pf);
    }

    @Override
    public void d(Pf pf) {
        if (this.qYW == null) {
            this.qYW = new ArrayList<Pf>();
        }
        this.qYW.add(pf);
        this.k(pf);
    }

    @Override
    public void e(Pf pf) {
        if (this.qYX == null) {
            this.qYX = new ArrayList<Pf>();
        }
        this.qYX.add(pf);
        this.k(pf);
    }

    private void k(Pf pf) {
        if (this.qYY == null) {
            this.qYY = new ArrayList<Pf>();
        }
        if (!this.qYY.contains(pf)) {
            this.qYY.add(pf);
        }
    }

    @Override
    public Iterator<Pf> fAz() {
        return this.qYT != null ? this.qYT.iterator() : new azi_1();
    }

    @Override
    public Iterator<Pf> fAA() {
        return this.qYV != null ? this.qYV.iterator() : new azi_1();
    }

    @Override
    public boolean f(Pf pf) {
        return this.qYU != null && this.qYU.contains(pf);
    }

    @Override
    public boolean g(Pf pf) {
        return this.qYW != null && this.qYW.contains(pf);
    }

    @Override
    public boolean h(Pf pf) {
        return this.qYT != null && this.qYT.contains(pf);
    }

    @Override
    public boolean i(Pf pf) {
        return this.qYV != null && this.qYV.contains(pf);
    }

    @Override
    public boolean j(Pf pf) {
        return this.qYX != null && this.qYX.contains(pf);
    }

    @Override
    public List<Pf> fAC() {
        return this.qYY;
    }

    @Override
    public aoh_1 fAB() {
        return this.qZe;
    }

    public void lV(boolean bl) {
        this.etS = bl;
    }

    @Override
    public boolean fAD() {
        return this.etS;
    }

    @Nullable
    public ero_0 fBw() {
        return (ero_0)enf_0.fBb().pU(this.avZ());
    }

    @Override
    public boolean fAE() {
        return this.qYR;
    }

    public void lW(boolean bl) {
        this.qYR = bl;
    }

    @Override
    public boolean fAF() {
        return this.qYi;
    }

    public void lS(boolean bl) {
        this.qYi = bl;
    }

    public void N(int ... nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            eNi eNi2 = eNi.RQ(n);
            this.b(eNi2);
        }
    }

    public void b(eNi eNi2) {
        if (eNi2 == null) {
            return;
        }
        if (this.qZk == null) {
            this.qZk = new HashSet<eNi>();
        }
        this.qZk.add(eNi2);
    }

    @Override
    public boolean a(eNi eNi2) {
        if (this.qZk == null) {
            return false;
        }
        return this.qZk.contains(eNi2);
    }

    @Override
    public qs_0 a(Qk qk, qu_0 qu_02, qm_0 qm_02, vd_0<? extends QD> vd_02, int n, int n2, short s, qu_0 qu_03, qr_0 qr_02, boolean bl) {
        if (!this.a(qu_02, qm_02, n, n2, s)) {
            return null;
        }
        QD qD = vd_02.pU(this.avZ());
        if (qD == null) {
            bfD.error((Object)("Unknown effect used in data " + this.avZ()));
            return null;
        }
        QD qD2 = qD.b(qm_02);
        qs_0 qs_02 = qD2.a(this, qk, qm_02, qu_02, n, n2, s, this.cxw() ? qu_02 : qu_03, qr_02);
        qD2.aZp();
        if (!bl) {
            qs_02.clear();
            return null;
        }
        return qs_02;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(qu_0 qu_02, qm_0 qm_02, int n, int n2, short s) {
        void var8_11;
        abi_1 abi_12;
        if (this.fAB() == null) {
            return true;
        }
        Iterable<qu_0> iterable = anv_1.bEg().a(qu_02, qm_02.bae(), this.fAB(), n, n2, s, this.aZI());
        for (qu_0 object2 : iterable) {
            if (object2 instanceof eSS && !((eSS)object2).bcS()) continue;
            return false;
        }
        rh_0 rh_02 = qm_02.bag();
        if (rh_02 == null) {
            return true;
        }
        if (qu_02 != null) {
            acd_1 acd_12 = qu_02.aZw();
            abi_12 = qu_02.bcB();
        } else {
            acd_1 acd_13 = new acd_1(n, n2, s);
            abi_12 = abi_1.dzq;
        }
        Iterable<int[]> iterable2 = this.fAB().b(n, n2, s, var8_11.getX(), var8_11.getY(), var8_11.bdi(), abi_12);
        for (int[] nArray : iterable2) {
            if (!rh_02.T(nArray[0], nArray[1])) {
                return false;
            }
            if (rh_02.X(nArray[0], nArray[1]) == null) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ Object clone() {
        return this.fBs();
    }

    @Override
    public /* synthetic */ enk_0 fAs() {
        return this.fBs();
    }
}


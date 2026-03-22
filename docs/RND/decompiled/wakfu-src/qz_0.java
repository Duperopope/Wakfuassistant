/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.BitSet;
import org.apache.log4j.Logger;

/*
 * Renamed from Qz
 */
public abstract class qz_0
implements Qj {
    protected static final Logger bfD = Logger.getLogger(Qj.class);
    private final int bfE;
    private final int bfF;
    private final aoh_1 bfG;
    private final anx_1<qu_0> bfH;
    private final long bfI;
    private short bfJ;
    private final boolean bfK;
    protected final boolean bfL = true;
    private BitSet bfM;
    private BitSet bfN;
    private BitSet bfO;
    private BitSet bfP;
    private BitSet bfQ;
    private BitSet bfR;
    private BitSet bfS;
    protected QB bfT = QB.bgl;
    private boolean bfU = false;
    private boolean bfV = false;
    private int bfW;
    private boolean bfX = false;
    private final boolean bfY;
    private boolean bfZ = false;

    public qz_0(int n, int n2, aoh_1 aoh_12, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7, long l, anx_1<qu_0> anx_12, boolean bl, boolean bl2, short s, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        this.bfE = n;
        this.bfF = n2;
        this.bfG = aoh_12;
        this.bfI = l;
        this.bfH = anx_12;
        if (nArray.length > 0) {
            this.bfM = new BitSet();
            this.a(nArray, this.bfM);
        }
        if (nArray2.length > 0) {
            this.bfN = new BitSet();
            this.a(nArray2, this.bfN);
        }
        if (nArray3.length > 0) {
            this.bfR = new BitSet();
            this.a(nArray3, this.bfR);
        }
        if (nArray4.length > 0) {
            this.bfO = new BitSet();
            this.a(nArray4, this.bfO);
        }
        if (nArray5.length > 0) {
            this.bfP = new BitSet();
            this.a(nArray5, this.bfP);
        }
        if (nArray6.length > 0) {
            this.bfQ = new BitSet();
            this.a(nArray6, this.bfQ);
        }
        if (nArray7.length > 0) {
            this.bfS = new BitSet();
            this.a(nArray7, this.bfS);
        }
        this.bfY = bl;
        if (bl2) {
            this.bfT = QB.bgk;
        }
        this.bfV = bl3;
        this.bfX = bl5;
        this.bfU = bl4;
        this.bfJ = s;
        this.bfK = bl6;
    }

    private void a(int[] nArray, BitSet bitSet) {
        if (nArray == null || bitSet == null) {
            return;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            if (n < 0) continue;
            bitSet.set(n);
        }
    }

    public void oA(int n) {
        this.bfW = n;
    }

    @Override
    public int aZP() {
        return this.bfW;
    }

    @Override
    public boolean aZz() {
        return this.bfT == QB.bgk;
    }

    @Override
    public boolean aZA() {
        return this.bfT == QB.bgm;
    }

    @Override
    public boolean aZB() {
        return this.bfU;
    }

    @Override
    public boolean aZC() {
        return this.bfV;
    }

    @Override
    public QC aZY() {
        return null;
    }

    @Override
    public QA aZZ() {
        return null;
    }

    @Override
    public boolean aZD() {
        return this.bfX;
    }

    @Override
    public boolean aZE() {
        return this.bfK;
    }

    @Override
    public boolean aZF() {
        return false;
    }

    protected qz_0(int n, int n2, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, BitSet bitSet5, BitSet bitSet6, BitSet bitSet7, long l, anx_1<qu_0> anx_12, boolean bl, boolean bl2, short s, boolean bl3, boolean bl4, boolean bl5, boolean bl6) {
        int n3;
        this.bfE = n;
        this.bfF = n2;
        this.bfG = aoh_12;
        this.bfI = l;
        this.bfH = anx_12;
        if (bitSet != null) {
            for (n3 = 0; n3 < bitSet.size(); ++n3) {
                if (n3 <= 0 || !bitSet.get(n3)) continue;
                this.bfM = new BitSet();
                this.bfM.set(n3);
            }
        }
        if (bitSet2 != null) {
            for (n3 = 0; n3 < bitSet2.size(); ++n3) {
                if (n3 <= 0 || !bitSet2.get(n3)) continue;
                this.bfN = new BitSet();
                this.bfN.set(n3);
            }
        }
        if (bitSet3 != null) {
            for (n3 = 0; n3 < bitSet3.size(); ++n3) {
                if (n3 <= 0 || !bitSet3.get(n3)) continue;
                this.bfR = new BitSet();
                this.bfR.set(n3);
            }
        }
        if (bitSet4 != null) {
            for (n3 = 0; n3 < bitSet4.size(); ++n3) {
                if (n3 <= 0 || !bitSet4.get(n3)) continue;
                this.bfO = new BitSet();
                this.bfO.set(n3);
            }
        }
        if (bitSet5 != null) {
            for (n3 = 0; n3 < bitSet5.size(); ++n3) {
                if (n3 <= 0 || !bitSet5.get(n3)) continue;
                this.bfP = new BitSet();
                this.bfP.set(n3);
            }
        }
        if (bitSet6 != null) {
            for (n3 = 0; n3 < bitSet6.size(); ++n3) {
                if (n3 <= 0 || !bitSet6.get(n3)) continue;
                this.bfQ = new BitSet();
                this.bfQ.set(n3);
            }
        }
        if (bitSet7 != null) {
            for (n3 = 0; n3 < bitSet7.size(); ++n3) {
                if (n3 <= 0 || !bitSet7.get(n3)) continue;
                this.bfS = new BitSet();
                this.bfS.set(n3);
            }
        }
        this.bfY = bl;
        if (bl2) {
            this.bfT = QB.bgk;
        }
        this.bfV = bl3;
        this.bfU = bl4;
        this.bfX = bl5;
        this.bfJ = s;
        this.bfK = bl6;
    }

    @Override
    public int aZH() {
        return this.bfE;
    }

    @Override
    public int avZ() {
        return this.bfF;
    }

    @Override
    public boolean df(long l) {
        return (this.bfI & l) == l;
    }

    @Override
    public anx_1<qu_0> aZI() {
        return this.bfH;
    }

    @Override
    public BitSet aZJ() {
        return this.bfM;
    }

    @Override
    public BitSet aZK() {
        return this.bfN;
    }

    @Override
    public BitSet aZL() {
        return this.bfR;
    }

    @Override
    public BitSet aZM() {
        return this.bfO;
    }

    @Override
    public BitSet aZN() {
        return this.bfP;
    }

    @Override
    public BitSet aZO() {
        return this.bfQ;
    }

    @Override
    public boolean aZQ() {
        if (this.bfN != null && !this.bfN.isEmpty()) {
            return true;
        }
        if (this.bfM != null && !this.bfM.isEmpty()) {
            return true;
        }
        if (this.bfO != null && !this.bfO.isEmpty()) {
            return true;
        }
        if (this.bfP != null && !this.bfP.isEmpty()) {
            return true;
        }
        return this.bfQ != null && !this.bfQ.isEmpty();
    }

    @Override
    public BitSet aZR() {
        return this.bfS;
    }

    @Override
    public qs_0 a(Qk qk, qu_0 qu_02, qm_0 qm_02, vd_0<? extends QD> vd_02, int n, int n2, short s, qu_0 qu_03, qr_0 qr_02, boolean bl) {
        QD qD = vd_02.pU(this.avZ());
        qs_0 qs_02 = qD.a(this, qk, qm_02, qu_02, n, n2, s, qu_03, qr_02);
        if (!bl) {
            qs_02.clear();
            return null;
        }
        return qs_02;
    }

    @Override
    public aoh_1 aZS() {
        return this.bfG;
    }

    @Override
    public boolean aZT() {
        return this.bfY;
    }

    @Override
    public long aZU() {
        return this.bfI;
    }

    @Override
    public short aZV() {
        return this.bfJ;
    }

    public boolean baT() {
        return true;
    }

    @Override
    public void S(short s) {
        this.bfJ = s;
    }

    protected void aU(boolean bl) {
        this.bfZ = bl;
    }

    @Override
    public boolean aZW() {
        return this.bfZ;
    }

    @Override
    public boolean aZX() {
        return !this.bfZ;
    }

    public String toString() {
        return "StandardEffect{m_effectId=" + this.bfE + ", m_actionId=" + this.bfF + "}";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public abstract class eSS
extends QQ<enk_0, etj_0>
implements aoy_1,
eNl,
eyo_0 {
    public static final short rly = 1;
    public static final short rlz = 1;
    public static final short rlA = 1;
    protected BitSet rlB;
    protected Set<pv_0> qZk;
    protected short ejt;
    protected eQN rlC;
    private boolean rlD = true;
    private byte ebP = (byte)-1;
    protected exP rlE;
    protected QE bhH;

    protected eSS(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
        this.e(n, fArray2);
    }

    private void e(int n, float[] fArray) {
        if (!this.bEt().oQ(fArray == null ? 0 : fArray.length)) {
            bih.error((Object)("Wrong number of parameters for effectArea " + n + " : " + (fArray == null ? 0 : fArray.length)));
        }
    }

    protected eSS() {
    }

    public eSS b(etj_0 etj_02) {
        eSS eSS2 = (eSS)super.a(etj_02);
        eSS2.rlB = this.rlB;
        eSS2.rlD = this.rlD;
        if (this.qZk != null) {
            eSS2.qZk = new HashSet<pv_0>(this.qZk);
        }
        if (etj_02 != null) {
            eSS2.ejt = etj_02.cmL();
            eSS2.N(etj_02.bcQ());
        } else {
            eSS2.ejt = this.ejt;
        }
        return eSS2;
    }

    @Override
    public void j(qu_0 qu_02) {
        super.j(qu_02);
        if (qu_02 != null && qu_02.bax() == 20) {
            this.ebP = ((exP)qu_02).bcP();
        }
    }

    public abstract void aPg();

    @Override
    public boolean a(@Nullable QD qD, anu_1 anu_12) {
        if (anu_12 instanceof ant_1 && this.a(etl_0.rmZ) && this.ebP == ((ant_1)anu_12).bcP()) {
            return false;
        }
        return super.a(qD, anu_12);
    }

    @Override
    public boolean a(int n, anu_1 anu_12) {
        if (anu_12 instanceof ant_1 && this.a(etl_0.rmZ) && this.ebP == ((ant_1)anu_12).bcP()) {
            return false;
        }
        return super.a(n, anu_12);
    }

    @Override
    public byte bax() {
        return 2;
    }

    public pr_0 fIB() {
        return null;
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return null;
    }

    public eja_0 fIC() {
        return null;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return false;
    }

    protected void fIH() {
        if (this.biq == null) {
            return;
        }
        this.fIK();
        this.fIJ();
        this.fII();
    }

    private void fII() {
        this.a(exx_2.rHC, this.biq);
        this.a(exx_2.rHB, this.biq);
        this.a(exx_2.rHz, this.biq);
        this.a(exx_2.rHA, this.biq);
    }

    private void fIJ() {
        for (eNd eNd2 : eNd.values()) {
            exx_2 exx_22 = eNd2.fAU();
            if (!this.biq.a(exx_22) || !this.a(exx_22)) continue;
            pr_0 pr_02 = this.b(exx_22);
            pr_02.aYH();
            pr_02.nt(this.biq.c(exx_22));
        }
    }

    private void fIK() {
        if (!this.a(exx_2.rGw)) {
            return;
        }
        pr_0 pr_02 = this.b(exx_2.rGw);
        pr_02.aYH();
        if (this.biq.a(exx_2.rGw)) {
            pr_02.nt(this.biq.c(exx_2.rGw));
        }
    }

    @Override
    public void b(qu_0 qu_02) {
        this.a(10014, null, (anu_1)qu_02);
        super.b(qu_02);
    }

    @Override
    public final boolean bcT() {
        return this.fID() && !this.a(etl_0.rni);
    }

    protected boolean fID() {
        return super.bcT();
    }

    @Override
    public boolean bcz() {
        if (this.bis == null) {
            return false;
        }
        if (this.bis.length != 4) {
            return false;
        }
        return this.bis[0] + (float)this.cmL() * this.bis[1] > 0.0f || this.bis[2] + (float)this.cmL() * this.bis[3] > 0.0f;
    }

    @Override
    public boolean a(pv_0 pv_02) {
        return this.qZk != null && this.qZk.contains(pv_02);
    }

    @Override
    public byte b(pv_0 pv_02) {
        if (this.qZk == null) {
            return 0;
        }
        return (byte)(this.qZk.contains(pv_02) ? 1 : 0);
    }

    @Override
    public void f(pv_0 pv_02) {
        if (pv_02 == null) {
            return;
        }
        if (this.qZk == null) {
            this.qZk = new HashSet<pv_0>();
        }
        this.qZk.add(pv_02);
    }

    public void N(int ... nArray) {
        if (nArray == null) {
            return;
        }
        for (int i = 0; i < nArray.length; ++i) {
            int n = nArray[i];
            etl_0 etl_02 = etl_0.Sq(n);
            this.f(etl_02);
        }
    }

    @Override
    public QE baz() {
        if (this.a(etl_0.rnk)) {
            if (this.bhH == null) {
                this.bhH = new ers_0(this);
            }
            return this.bhH;
        }
        return super.baz();
    }

    @Override
    public boolean baA() {
        return this.a(etl_0.rnk) || super.baA();
    }

    @Override
    public void g(pv_0 pv_02) {
        this.h(pv_02);
    }

    @Override
    public void h(pv_0 pv_02) {
        if (this.qZk == null) {
            return;
        }
        this.qZk.remove(pv_02);
    }

    @Override
    public void a(pv_0 pv_02, byte by) {
        if (pv_02.aZd() != 4) {
            return;
        }
        if (by > 0) {
            this.f(pv_02);
        }
    }

    @Override
    public short cmL() {
        return this.ejt;
    }

    @Override
    public boolean bcy() {
        return this.bgO < 0;
    }

    @Override
    public void f(anu_1 anu_12) {
        if (this.bgJ != null && this.bgJ.baf() != null) {
            TA tA = this.bgJ.baf();
            int n = (int)(this.bis[0] + (float)this.cmL() * this.bis[1]);
            int n2 = (int)(this.bis[2] + (float)this.cmL() * this.bis[3]);
            Ua ua = Ua.pB((short)n).bo(n2 > 0);
            tA.a(new TT(this, anu_12.Sn()), ua.am((short)1));
        }
    }

    @Override
    public void g(anu_1 anu_12) {
        List<anu_1> list = this.d(anu_12);
        if (list != null && !list.isEmpty()) {
            for (anu_1 anu_13 : list) {
                if (anu_13 != null && anu_13 instanceof qu_0 && ((qu_0)anu_13).baz() != null) {
                    ((qu_0)anu_13).baz().a(this, true, true);
                }
                this.i(anu_13);
            }
        } else {
            if (this.bgJ == null) {
                return;
            }
            ano_2<qu_0> ano_22 = this.bgJ.bae();
            if (ano_22 == null) {
                return;
            }
            Iterator<qu_0> iterator = ano_22.ban();
            while (iterator.hasNext()) {
                qu_0 qu_02;
                qu_0 qu_03 = iterator.next();
                if (!(qu_03 instanceof qu_0) || (qu_02 = qu_03).baz() == null) continue;
                qu_02.baz().a(this, true);
            }
        }
    }

    @Override
    public boolean a(BitSet bitSet, anu_1 anu_12) {
        if (bitSet == null) {
            return false;
        }
        if (this.bij.intersects(bitSet)) {
            return true;
        }
        if (this.bik.intersects(bitSet)) {
            return true;
        }
        return this.rlB.intersects(bitSet);
    }

    @Override
    public void a(BitSet bitSet, @Nullable QD qD, anu_1 anu_12) {
        super.a(bitSet, qD, anu_12);
        if (this.rlB != null && this.rlB.intersects(bitSet)) {
            this.fIL();
        }
    }

    private void fIL() {
        QE qE = this.rlC.bbq();
        if (qE != null) {
            qE.q(this.rlC);
        } else {
            this.bgJ.bai().b(this);
        }
    }

    @Override
    public void bcL() {
        super.bcL();
        if (this.rlC == null) {
            return;
        }
        QE qE = this.rlC.bbq();
        if (qE != null) {
            qE.q(this.rlC);
        }
    }

    @Override
    public void baG() {
        if (this.bgJ instanceof enu_0) {
            ((enu_0)this.bgJ).a(this);
        }
        super.baG();
    }

    @Override
    public short fvT() {
        return 1;
    }

    @Override
    public short fvU() {
        return 1;
    }

    @Override
    public short fvV() {
        return 1;
    }

    public void d(BitSet bitSet) {
        this.rlB = bitSet;
    }

    @Override
    public void a(eQN eQN2) {
        this.rlC = eQN2;
    }

    @Override
    public boolean bEf() {
        return true;
    }

    public void mz(boolean bl) {
        this.rlD = bl;
    }

    @Override
    public boolean bdc() {
        return this.rlD;
    }

    public void fg(boolean bl) {
    }

    @Override
    public byte bcP() {
        return this.ebP;
    }

    @Override
    public void az(byte by) {
        this.ebP = by;
    }

    @Override
    public eyp doV() {
        return eym.phV;
    }

    @Override
    public long dOo() {
        if (this.biq != null) {
            return this.biq.Sn();
        }
        return 0L;
    }

    @Override
    public boolean dOp() {
        return false;
    }

    @Override
    public int d(pt_0 pt_02) {
        if (this.a(pt_02)) {
            return this.b(pt_02).aYD();
        }
        return 0;
    }

    @Override
    public boolean i(pv_0 pv_02) {
        return false;
    }

    @Override
    public boolean kW(long l) {
        fqU fqU2 = this.qB(l);
        return fqU2 != null;
    }

    @Override
    public int dh(long l) {
        if (this.baz() == null) {
            return -1;
        }
        for (QD qD : this.baz()) {
            if (qD.d() != enf_0.qPC.d() || (long)((erh_0)qD).fGk().gjy() != l) continue;
            return ((erh_0)qD).fGk().cmL();
        }
        return -1;
    }

    @Override
    public boolean v(long l, long l2) {
        fqU fqU2 = this.qB(l);
        if (fqU2 == null) {
            return false;
        }
        return l2 == (long)fqU2.cmL();
    }

    private fqU qB(long l) {
        if (this.baz() == null) {
            return null;
        }
        for (QD qD : this.baz()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            return fqU2;
        }
        return null;
    }

    @Override
    public boolean a(long l, long l2, eyo_0 eyo_02) {
        if (this.baz() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.baz()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if ((long)fqU2.cmL() != l2) {
                return false;
            }
            if (qD.bbc() == null) {
                return false;
            }
            return qD.bbc().Sn() == eyo_02.Sn();
        }
        return false;
    }

    @Override
    public boolean a(long l, eyo_0 eyo_02) {
        if (this.baz() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.baz()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if (qD.bbc() == null) {
                return false;
            }
            return qD.bbc().Sn() == eyo_02.Sn();
        }
        return false;
    }

    @Override
    public boolean b(long l, long l2, eyo_0 eyo_02) {
        if (this.baz() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.baz()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if ((long)fqU2.cmL() != l2) {
                return false;
            }
            if (qD.bbc() == null) {
                return false;
            }
            if (!(qD.bbc() instanceof euc_1)) {
                return false;
            }
            return ((euc_1)qD.bbc()).dlK().kp(qD.bbc().Sn()) == eyo_02.bcP();
        }
        return false;
    }

    @Override
    public boolean b(long l, eyo_0 eyo_02) {
        if (this.baz() == null) {
            return false;
        }
        if (eyo_02 == null) {
            return false;
        }
        for (QD qD : this.baz()) {
            fqU fqU2;
            if (qD.d() != enf_0.qPC.d() || (long)(fqU2 = ((erh_0)qD).fGk()).gjy() != l) continue;
            if (qD.bbc() == null) {
                return false;
            }
            if (!(qD.bbc() instanceof euc_1)) {
                return false;
            }
            return ((euc_1)qD.bbc()).dlK().kp(qD.bbc().Sn()) == eyo_02.bcP();
        }
        return false;
    }

    @Override
    public boolean w(long l, long l2) {
        fqU fqU2 = this.qB(l);
        if (fqU2 == null) {
            return false;
        }
        return l2 <= (long)fqU2.cmL();
    }

    @Override
    public boolean a(eyp_0 eyp_02) {
        return eyp_0.pmR.a(eyp_02);
    }

    public void a(pt_0 pt_02, qu_0 qu_02) {
        if (this.a(pt_02) && qu_02.a(pt_02)) {
            pr_0 pr_02 = this.b(pt_02);
            pr_02.aYH();
            pr_02.nt(qu_02.c(pt_02));
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.ebP = (byte)-1;
        this.rlC = null;
        this.qZk = null;
        this.rlE = null;
        if (this.bhH != null) {
            this.bhH.bch();
        }
        this.bhH = null;
    }

    public String getName() {
        return this.toString();
    }

    @Override
    public boolean djT() {
        return true;
    }

    @Override
    public int dOm() {
        return 0;
    }

    @Override
    public int Gc(int n) {
        return 0;
    }

    @Override
    public boolean dOn() {
        return false;
    }

    protected qu_0 fIM() {
        if (this.a(etl_0.rnd) && this.biq != null) {
            return this.biq;
        }
        return this;
    }

    public void aC(exP exP2) {
        this.rlE = exP2;
    }

    public abstract byte[] fIz();

    public abstract void fz(ByteBuffer var1);

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.b((etj_0)qS);
    }
}


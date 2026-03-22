/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

public abstract class eSN
extends eSS {
    private abi_1 bmk;
    private static final pt_0[] rll = new pt_0[]{eSN.fIA(), exx_2.rGw, exx_2.rGx, exx_2.rGA, exx_2.rGy, exx_2.rGz, exx_2.rHz, exx_2.rHA, exx_2.rHB, exx_2.rHC, exx_2.rGO, exx_2.rGP, exx_2.rGB, exx_2.rGF, exx_2.rGC, exx_2.rGD, exx_2.rGE, exx_2.rGu, exx_2.rHs};
    protected final eja_0 rlm = new eja_0(rll);
    private int egJ;
    public static final QX rln = new QX(new QW("Balise destructible", new aou_1("HP"), new aou_1("incr par level")));

    public static exx_2 fIA() {
        return exx_2.rGi;
    }

    public QX fIy() {
        return rln;
    }

    public eSN(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public eSS b(etj_0 etj_02) {
        eSS eSS2 = super.b(etj_02);
        if (etj_02 != null && etj_02.bcB() != null) {
            eSS2.a(etj_02.bcB());
        } else {
            eSS2.a(abi_1.dzm);
        }
        return eSS2;
    }

    protected eSN() {
    }

    @Override
    public int aeV() {
        return etm_0.rns.aHp();
    }

    @Override
    public void aPg() {
        this.rlm.aYH();
        int n = (int)(this.oO(0) + (float)this.cmL() * this.oO(1));
        this.rlm.b(eSN.fIA()).ot(n);
        this.rlm.b(eSN.fIA()).aYO();
        this.bhH = new ers_0(this);
        this.f(exe_1.rEt);
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return anu_12 == this.biq;
    }

    @Override
    public pr_0 fIB() {
        return this.b(eSN.fIA());
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return this.rlm.b(pt_02);
    }

    @Override
    public eja_0 fIC() {
        return this.rlm;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        if (this.rlm == null) {
            return false;
        }
        return this.rlm.g(pt_02);
    }

    @Override
    public boolean baF() {
        return super.baF() || this.rlm.c(eSN.fIA()) <= 0;
    }

    @Override
    public abi_1 bcB() {
        return this.bmk;
    }

    @Override
    public void a(abi_1 abi_12) {
        this.bmk = abi_12;
    }

    @Override
    public abi_1 baC() {
        return this.bcB();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        return new long[]{anf_2.L(this.bcC(), this.bcD(), this.bcE())};
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        return new ArrayList<anu_1>();
    }

    @Override
    public void baG() {
        super.baG();
        if (this.bgJ == null) {
            return;
        }
        Collection<QQ> collection = this.fIE();
        this.J(collection);
    }

    private void J(Collection<QQ> collection) {
        for (QQ qQ : collection) {
            this.bgJ.bai().b(qQ);
        }
    }

    private Collection<QQ> fIE() {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        for (QQ qQ : this.bgJ.bai().bdh()) {
            if (!this.z(qQ)) continue;
            arrayList.add(qQ);
        }
        return arrayList;
    }

    private boolean z(QQ qQ) {
        return qQ != this && this.A(qQ) && this.C(qQ) && this.B(qQ);
    }

    private boolean A(QQ qQ) {
        return qQ.aeV() == etm_0.rns.aHp();
    }

    private boolean B(QQ qQ) {
        return qQ.bci() == this.bci();
    }

    private boolean C(QQ qQ) {
        return qQ.bcC() == this.bcC() && qQ.bcD() == this.bcD() && qQ.bcE() == this.bcE();
    }

    @Override
    public QE baz() {
        return this.bhH;
    }

    @Override
    public boolean baA() {
        return true;
    }

    @Override
    public byte bcN() {
        return 6;
    }

    @Override
    public boolean bcR() {
        return true;
    }

    @Override
    public boolean bcS() {
        return true;
    }

    @Override
    public boolean fID() {
        return true;
    }

    public void Sp(int n) {
        this.egJ = n;
    }

    public int cjV() {
        return this.egJ;
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.d(eSN.fIA()));
        azg_12.vC(this.c(eSN.fIA()));
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        this.b(eSN.fIA()).ot(n);
        this.b(eSN.fIA()).op(n2);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.egJ = 0;
    }

    @Override
    public /* synthetic */ aox_1 bEt() {
        return this.fIy();
    }

    @Override
    public /* synthetic */ List d(anu_1 anu_12) {
        return this.m(anu_12);
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.b((etj_0)qS);
    }
}


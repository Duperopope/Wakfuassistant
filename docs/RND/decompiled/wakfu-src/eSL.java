/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

public abstract class eSL
extends eSQ {
    private static final pt_0[] rle = new pt_0[]{eSL.fIA(), exx_2.rGw, exx_2.rGF, exx_2.rGE, exx_2.rGC, exx_2.rGD, exx_2.rGB};
    protected final eja_0 rlf = new eja_0(rle);
    private abi_1 pgl = null;
    public static final QX rlg = new QX(new QW("Tonneau Panda avec increment des PV par level", new aou_1("PV"), new aou_1("incr par level"), new aou_1("Bonus de PV en % de PV du caster"), new aou_1("incr du Bonus de PV en % de PV du caster")));
    private final long[] rlh = new long[1];

    public static exx_2 fIA() {
        return exx_2.rGi;
    }

    protected eSL() {
    }

    public eSL(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void aPg() {
        this.rlf.aYH();
        int n = this.fmj();
        this.rlf.b(eSL.fIA()).ot(n);
        this.rlf.b(eSL.fIA()).aYO();
        this.bhH = new ers_0(this);
    }

    private int fmj() {
        float f2 = this.oO(0);
        short s = this.cmL();
        float f3 = (float)s * this.oO(1);
        float f4 = this.oO(2) + this.oO(3) * (float)s;
        float f5 = f2 + f3;
        float f6 = f4 * (float)(this.biq != null ? this.biq.b(eSL.fIA()).aYD() / 100 : 0);
        return (int)(f5 + f6);
    }

    @Override
    public pr_0 fIB() {
        return this.b(eSL.fIA());
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return this.rlf.b(pt_02);
    }

    @Override
    public eja_0 fIC() {
        return this.rlf;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return this.rlf.g(pt_02);
    }

    @Override
    public int aeV() {
        return etm_0.rnE.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        this.rlh[0] = anf_2.s(this.bio);
        return this.rlh;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return null;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return false;
    }

    @Override
    public boolean bcS() {
        return true;
    }

    @Override
    public boolean bcR() {
        return true;
    }

    @Override
    public boolean fID() {
        return true;
    }

    @Override
    public boolean baF() {
        return super.baF() || this.rlf.c(eSL.fIA()) <= 0;
    }

    @Override
    public boolean bcF() {
        return false;
    }

    @Override
    public int bcC() {
        if (this.fgZ() != null) {
            this.fgZ().bcC();
        }
        return super.bcC();
    }

    @Override
    public int bcD() {
        ezz ezz2 = this.fgZ();
        if (ezz2 != null) {
            ezz2.bcD();
        }
        return super.bcD();
    }

    @Override
    public short bcE() {
        ezz ezz2 = this.fgZ();
        if (ezz2 != null) {
            ezz2.bcE();
        }
        return super.bcE();
    }

    @Override
    public aox_1 bEt() {
        return rlg;
    }

    @Override
    public void b(abi_1 abi_12) {
        this.pgl = abi_12;
    }

    @Override
    public abi_1 baC() {
        if (this.pgl == null) {
            return this.bcB();
        }
        return this.pgl;
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
    protected byte bcA() {
        return 3;
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.d(eSL.fIA()));
        azg_12.vC(this.c(eSL.fIA()));
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        this.b(eSL.fIA()).ot(n);
        this.b(eSL.fIA()).op(n2);
    }
}


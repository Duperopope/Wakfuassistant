/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

public abstract class eSP
extends eSQ {
    private static final pt_0[] rlq = new pt_0[]{exx_2.rHi, exx_2.rGw, exx_2.rGx, exx_2.rGA, exx_2.rGy, exx_2.rGz, exx_2.rHz, exx_2.rHA, exx_2.rHB, exx_2.rHC, exx_2.rGO, exx_2.rGR};
    protected final eja_0 rlr = new eja_0(rlq);
    private abi_1 pgl = null;
    public static final QX rls = new QX(new QW("Bombe roublard", new aou_1("BOMB_COOLDOWN")), new QW("Bombe roublard avec increment des PV par level", new aou_1("BOMB_COOLDOWN"), new aou_1("incr par level")));
    protected eUU rlt;
    private final long[] rlu = new long[1];

    protected eSP() {
    }

    public eSP(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void aPg() {
        this.rlr.aYH();
        float f2 = this.biv.length > 1 ? (float)this.cmL() * this.oO(1) : 0.0f;
        int n = (int)(this.oO(0) + f2);
        this.rlr.b(exx_2.rHi).ot(n);
        this.rlr.b(exx_2.rHi).aYO();
        this.bhH = new ers_0(this);
    }

    @Override
    public pr_0 fIB() {
        return this.b(exx_2.rHi);
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return this.rlr.b(pt_02);
    }

    @Override
    public eja_0 fIC() {
        return this.rlr;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return this.rlr.g(pt_02);
    }

    @Override
    public int aeV() {
        return etm_0.rnz.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        this.rlu[0] = anf_2.s(this.bio);
        return this.rlu;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return null;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        if (anu_12 == null) {
            return true;
        }
        if (this.biq == anu_12) {
            return true;
        }
        if (anu_12 instanceof eSP) {
            return ((QP)((Object)anu_12)).bci() == this.biq;
        }
        if (anu_12 instanceof exP) {
            return ((ezz)((Object)anu_12)).dlL() == this.biq;
        }
        return false;
    }

    @Override
    public boolean c(ezz ezz2) {
        if (this.c(exx_2.rHi) <= 0) {
            return false;
        }
        return super.c(ezz2);
    }

    @Override
    public boolean bcS() {
        return false;
    }

    @Override
    public boolean bcR() {
        return false;
    }

    @Override
    public boolean bcF() {
        return false;
    }

    @Override
    public int bcC() {
        ezz ezz2 = this.fgZ();
        if (ezz2 != null) {
            ezz2.bcC();
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
        return rls;
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

    public void fIF() {
    }

    @Override
    public void a(eUU eUU2) {
        this.rlt = eUU2;
    }

    @Override
    public void bpP() {
        super.bpP();
        if (this.rlt != null) {
            try {
                this.rlt.j(this);
            }
            catch (Exception exception) {
                bih.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        azg_12.vC(this.d(exx_2.rHi));
        azg_12.vC(this.c(exx_2.rHi));
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        int n2 = byteBuffer.getInt();
        this.b(exx_2.rHi).ot(n);
        this.b(exx_2.rHi).op(n2);
    }
}


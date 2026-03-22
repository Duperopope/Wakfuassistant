/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;

public abstract class eSJ
extends eSS {
    public static final QX rla = new QX(new QW("Art\u00e9fact standard", new aou_1[0]));
    private final long[] rlb = new long[1];

    protected eSJ() {
    }

    protected eSJ(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public int aeV() {
        return etm_0.rnH.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 != null) {
            this.rlb[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
            return this.rlb;
        }
        return null;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return null;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return true;
    }

    public QX fIy() {
        return rla;
    }

    @Override
    public void aPg() {
    }

    @Override
    public byte[] fIz() {
        return new byte[0];
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ aox_1 bEt() {
        return this.fIy();
    }
}


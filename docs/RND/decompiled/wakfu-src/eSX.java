/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public abstract class eSX
extends eSS {
    public static final QX rmg = new QX(new QW("LootArea standard", new aou_1[0]));
    private abi_1 bmk;
    private final long[] rmh = new long[1];

    @Override
    public aox_1 bEt() {
        return rmg;
    }

    protected eSX(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected eSX() {
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

    @Override
    public void aPg() {
    }

    @Override
    public int aeV() {
        return etm_0.rnB.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        this.rmh[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
        return this.rmh;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return null;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return true;
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
    public byte[] fIz() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.b((etj_0)qS);
    }
}


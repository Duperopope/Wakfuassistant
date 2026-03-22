/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public abstract class eSO
extends eSS {
    public static final QX rlo = new QX(new QW("Bomb combo standard", new aou_1[0]));
    private final long[] rlp = new long[1];

    @Override
    public aox_1 bEt() {
        return rlo;
    }

    protected eSO() {
    }

    protected eSO(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 == null) {
            return null;
        }
        this.rlp[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
        return this.rlp;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        if (anu_12 == null) {
            return null;
        }
        ArrayList<anu_1> arrayList = new ArrayList<anu_1>();
        arrayList.add(anu_12);
        return arrayList;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return true;
    }

    @Override
    public int aeV() {
        return etm_0.rnF.aHp();
    }

    @Override
    public byte[] fIz() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ List d(anu_1 anu_12) {
        return this.m(anu_12);
    }
}


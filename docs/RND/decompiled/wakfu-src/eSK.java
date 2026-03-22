/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.Nullable;

public abstract class eSK
extends eSS {
    public static final QX rlc = new QX(new QW("Aura standard", new aou_1[0]));
    private final long[] rld = new long[1];

    public QX fIy() {
        return rlc;
    }

    protected eSK() {
    }

    public eSK(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void aPg() {
    }

    @Override
    public int aeV() {
        return etm_0.rnu.aHp();
    }

    @Override
    public int bcC() {
        return this.biq.bcC();
    }

    @Override
    public int bcD() {
        return this.biq.bcD();
    }

    @Override
    public short bcE() {
        return this.biq.bcE();
    }

    @Override
    public void a(int n, int n2, short s) {
    }

    @Override
    public boolean a(BitSet bitSet, anu_1 anu_12) {
        if (anu_12 == this.biq && bitSet.get(10004)) {
            return true;
        }
        return super.a(bitSet, anu_12);
    }

    @Override
    public void a(BitSet bitSet, @Nullable QD qD, anu_1 anu_12) {
        if (anu_12 == this.biq && (bitSet.get(10001) || bitSet.get(10002))) {
            return;
        }
        super.a(bitSet, qD, anu_12);
    }

    @Override
    public boolean bcF() {
        return false;
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 != null) {
            this.rld[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
            return this.rld;
        }
        return null;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        ArrayList<anu_1> arrayList = new ArrayList<anu_1>();
        if (anu_12 != null) {
            arrayList.add(anu_12);
        }
        return arrayList;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return true;
    }

    @Override
    public void bcW() {
    }

    @Override
    public byte[] fIz() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ aox_1 bEt() {
        return this.fIy();
    }

    @Override
    public /* synthetic */ List d(anu_1 anu_12) {
        return this.m(anu_12);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from eTc
 */
public abstract class etc_0
extends eSS {
    public static final QX rmB = new QX(new QW("Case simple", new aou_1[0]));

    public QX fIy() {
        return rmB;
    }

    public etc_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected etc_0() {
    }

    @Override
    public void aPg() {
        this.bhH = new ers_0(this);
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
    public int aeV() {
        return etm_0.rnC.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        return null;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return Collections.emptyList();
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
}


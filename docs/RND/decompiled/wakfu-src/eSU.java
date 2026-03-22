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

public abstract class eSU
extends eSS {
    public static final QX rlX = new QX(new QW("Portail standard", new aou_1[0]));

    @Override
    public aox_1 bEt() {
        return rlX;
    }

    protected eSU() {
    }

    protected eSU(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public void aPg() {
    }

    @Override
    public long[] c(anu_1 anu_12) {
        return null;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        return null;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return false;
    }

    @Override
    public int aeV() {
        return etm_0.rnG.aHp();
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


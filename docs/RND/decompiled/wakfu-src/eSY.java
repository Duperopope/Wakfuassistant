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

public abstract class eSY
extends eSS {
    public static final QX rmi = new QX(new QW("Case simple", new aou_1[0]));
    private int atn = etm_0.rnw.aHp();
    private abi_1 bmk;

    public QX fIy() {
        return rmi;
    }

    public eSY(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    public eSY r(etj_0 etj_02) {
        eSY eSY2 = (eSY)super.b(etj_02);
        eSY2.atn = this.atn;
        if (etj_02 != null && etj_02.bcB() != null) {
            eSY2.a(etj_02.bcB());
        }
        return eSY2;
    }

    protected eSY() {
    }

    @Override
    public int aeV() {
        return this.atn;
    }

    public void ma(int n) {
        this.atn = n;
    }

    @Override
    public void aPg() {
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return anu_12 == this.biq;
    }

    @Override
    public long[] c(anu_1 anu_12) {
        return null;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        ArrayList<anu_1> arrayList = new ArrayList<anu_1>();
        arrayList.add(anu_12);
        return arrayList;
    }

    @Override
    public byte bcN() {
        return 6;
    }

    @Override
    public void a(abi_1 abi_12) {
        if (abi_12 != null) {
            this.bmk = abi_12;
        }
    }

    @Override
    public abi_1 bcB() {
        if (this.bmk == null) {
            return super.bcB();
        }
        return this.bmk;
    }

    @Override
    public byte[] fIz() {
        return ArrayUtils.EMPTY_BYTE_ARRAY;
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.r(etj_02);
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
        return this.r((etj_0)qS);
    }
}


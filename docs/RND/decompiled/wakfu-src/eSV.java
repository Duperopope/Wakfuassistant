/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public abstract class eSV
extends eSS {
    public static final QX rlY = new QX(new QW("Glyphe standard", new aou_1[0]), new QW("Glyphe param\u00e9tr\u00e9", new aou_1("0 : rien (default), 1 : le caster doit rester sur sa position")), new QW("Glyphe appartenant au caster", new aou_1("0 : rien (default), 1 : le caster doit rester sur sa position"), new aou_1("0 : le glyphe est caster des effets (default), 1 : le caster du glyphe est caster des effets")));
    private final acd_1 rlZ = new acd_1();
    private boolean rma;
    protected boolean rmb;
    private final long[] rmc = new long[1];
    private abi_1 bmk = abi_1.dzq;

    public QX fIy() {
        return rlY;
    }

    protected eSV() {
    }

    public eSV(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    public eSV n(etj_0 etj_02) {
        eSV eSV2 = (eSV)super.b(etj_02);
        if (etj_02 != null) {
            if (etj_02.bci() != null) {
                qu_0 qu_02 = etj_02.bci();
                eSV2.ap(qu_02.bcC(), qu_02.bcD(), qu_02.bcE());
            }
            eSV2.a(etj_02.bcB());
        }
        return eSV2;
    }

    @Override
    public void aPg() {
        if (this.biv == null) {
            this.rma = false;
            this.rmb = false;
            return;
        }
        this.rma = this.biv.length > 0 && this.oO(0) == 1.0f;
        this.rmb = this.biv.length > 1 && this.oO(1) == 1.0f;
    }

    public void ap(int n, int n2, short s) {
        this.rlZ.setX(n);
        this.rlZ.setY(n2);
        this.rlZ.aM(s);
    }

    public boolean fIO() {
        if (!this.rma) {
            return true;
        }
        if (this.biq == null) {
            return false;
        }
        return this.rlZ.L(this.biq.bcC(), this.biq.bcD(), this.biq.bcE());
    }

    @Override
    public int aeV() {
        return etm_0.rnq.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 != null) {
            this.rmc[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
            return this.rmc;
        }
        return null;
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
    public int bcX() {
        return this.rlZ.getX();
    }

    @Override
    public int bcY() {
        return this.rlZ.getY();
    }

    @Override
    public short bcZ() {
        return this.rlZ.bdi();
    }

    @Override
    public abi_1 bcB() {
        return abi_1.dzq;
    }

    @Override
    public void a(abi_1 abi_12) {
        this.bmk = abi_12;
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.rma ? (byte)1 : 0);
        azg_12.vC(this.rlZ.getX());
        azg_12.vC(this.rlZ.getY());
        azg_12.aG(this.rlZ.bdi());
        azg_12.aF((byte)this.bmk.dzy);
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        this.rma = byteBuffer.get() == 1;
        this.ap(byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getShort());
        abi_1 abi_12 = abi_1.wG(byteBuffer.get());
        this.a(abi_12);
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.n(etj_02);
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
        return this.n((etj_0)qS);
    }
}


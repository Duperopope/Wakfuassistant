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

public abstract class eSZ
extends eSS {
    private static final BitSet rmj = new BitSet();
    public static final QX rmk;
    private static final pt_0[] rml;
    protected final eja_0 rmm = new eja_0(rml);
    private BitSet rmn;
    private boolean rmo = false;
    private boolean euy;
    private final long[] rmp = new long[1];

    public QX fIy() {
        return rmk;
    }

    protected eSZ() {
    }

    @Override
    public void aPg() {
        this.rmm.aYH();
        this.rmo = false;
        this.euy = true;
        if (this.biv == null) {
            return;
        }
        if (this.biv.length > 0) {
            boolean bl = this.rmo = this.oO(0) == 1.0f;
        }
        if (this.biv.length > 1) {
            this.euy = this.oO(1) == 0.0f;
        }
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return this.rmm.b(pt_02);
    }

    @Override
    public eja_0 fIC() {
        return this.rmm;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return this.rmm.g(pt_02);
    }

    public eSZ(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public int aeV() {
        return etm_0.rnt.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        this.rmp[0] = anf_2.s(this.bio);
        return this.rmp;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        return null;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        if (this.rmo) {
            return true;
        }
        if (anu_12 != this.biq) {
            return true;
        }
        if (!(this.biq instanceof exP)) {
            return true;
        }
        if (this.rmn != null && !this.rmn.intersects(rmj)) {
            return true;
        }
        euc_1 euc_12 = (euc_1)this.biq;
        ety_0 ety_02 = euc_12.dlK();
        return ety_02 == null || !ety_02.baf().ez(euc_12.Sn());
    }

    @Override
    public boolean a(BitSet bitSet, anu_1 anu_12) {
        this.rmn = bitSet;
        boolean bl = this.e(anu_12) && super.a(bitSet, anu_12);
        this.rmn = null;
        return bl;
    }

    public boolean cyi() {
        return this.euy;
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

    static {
        rmj.set(10001);
        rmj.set(10008);
        rmj.set(10002);
        rmk = new QX(new QW("Pi\u00e8ge standard", new aou_1[0]), new QW("Pi\u00e8ge pouvant \u00eatre d\u00e9clench\u00e9 par son proprio", new aou_1("peut \u00eatre d\u00e9clench\u00e9 par le proprio (1=oui, 0= non (defaut))")), new QW("Piege visible pour tout le monde", new aou_1("peut \u00eatre d\u00e9clench\u00e9 par le proprio (1=oui, 0= non (defaut))"), new aou_1("visible pour tout le monde (1=oui, 0= non (defaut))")));
        rml = new pt_0[]{exx_2.rGw, exx_2.rGx, exx_2.rGy, exx_2.rGA, exx_2.rGz, exx_2.rHz, exx_2.rHA, exx_2.rHB, exx_2.rHC, exx_2.rGv};
    }
}


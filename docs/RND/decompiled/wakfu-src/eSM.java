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

public abstract class eSM
extends eSS {
    public static final QX rli = new QX(new QW("Aura de tour de bulle de combat", new aou_1[0]), new QW("Bordure bloquante", new aou_1("Bloquante (1 = oui, 0 = non (defaut))")), new QW("Bordure invisible", new aou_1("Bloquante (1 = oui, 0 = non (defaut))"), new aou_1("Invisible (1 = oui, 0 = non (defaut))")));
    protected boolean baw = false;
    protected boolean rlj = false;
    private final long[] rlk = new long[1];

    public QX fIy() {
        return rli;
    }

    protected eSM() {
    }

    public eSM(int n, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, null, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public int aeV() {
        return etm_0.rnv.aHp();
    }

    @Override
    public void aPg() {
        if (this.bcJ() >= 1) {
            boolean bl = this.baw = (int)this.oO(0) == 1;
        }
        if (this.bcJ() >= 2) {
            this.rlj = (int)this.oO(0) == 1;
        }
    }

    @Override
    public boolean bcS() {
        return this.baw;
    }

    public boolean cyi() {
        return this.rlj;
    }

    public void h(rh_0 rh_02) {
        this.bfG = new etd_0(rh_02);
        if (this.baw) {
            rh_02.bdU();
        }
    }

    @Override
    public void bcW() {
        if (this.bfG instanceof etd_0) {
            this.biC = ((etd_0)this.bfG).fIT();
        } else {
            super.bcW();
        }
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 != null) {
            this.rlk[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
            return this.rlk;
        }
        return null;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        ArrayList<anu_1> arrayList = new ArrayList<anu_1>();
        arrayList.add(anu_12);
        return arrayList;
    }

    @Override
    public boolean e(anu_1 anu_12) {
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

    @Override
    public /* synthetic */ List d(anu_1 anu_12) {
        return this.m(anu_12);
    }
}


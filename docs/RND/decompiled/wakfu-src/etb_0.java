/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eTb
 */
public abstract class etb_0
extends eSS {
    public static final QX rmw = new QX(new QW("Warp standard", new aou_1[0]));
    protected acd_1 rmx;
    protected acd_1 rmy;
    protected boolean rmz;
    private final long[] rmA = new long[1];

    @Override
    public aox_1 bEt() {
        return rmw;
    }

    protected etb_0() {
    }

    protected etb_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public eSS b(etj_0 etj_02) {
        etb_0 etb_02 = (etb_0)super.b(etj_02);
        if (this.rmx != null) {
            etb_02.rmx = new acd_1(this.rmx);
        }
        if (this.rmy != null) {
            etb_02.rmy = new acd_1(this.rmy);
        }
        return etb_02;
    }

    @Override
    public void aPg() {
        if (this.rmz) {
            return;
        }
        Iterable<int[]> iterable = this.biq != null ? this.bcG().b(this.bio.getX(), this.bio.getY(), this.bio.bdi(), this.biq.bcC(), this.biq.bcD(), this.biq.bcE(), this.biq.bcB()) : this.bcG().b(this.bio.getX(), this.bio.getY(), this.bio.bdi(), this.bio.getX(), this.bio.getY(), this.bio.bdi(), this.bcB());
        Iterator<int[]> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
        }
        this.rmx = new acd_1(iterator.next());
        if (!iterator.hasNext()) {
            throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
        }
        this.rmy = new acd_1(iterator.next());
        if (iterator.hasNext()) {
            throw new InvalidParameterException("Un warp doit avoir une zone d'effet de deux poins uniquement");
        }
    }

    @Override
    public int aeV() {
        return etm_0.rny.aHp();
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 != null) {
            this.rmA[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
            return this.rmA;
        }
        return null;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return Collections.emptyList();
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return true;
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        azg_12.gK(anf_2.L(this.rmx.getX(), this.rmx.getY(), this.rmx.bdi()));
        azg_12.gK(anf_2.L(this.rmy.getX(), this.rmy.getY(), this.rmy.bdi()));
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        this.rmx = anf_2.gn(byteBuffer.getLong());
        this.rmy = anf_2.gn(byteBuffer.getLong());
        this.rmz = true;
    }

    public Iterable<int[]> fIS() {
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(this.rmx.bWB());
        arrayList.add(this.rmy.bWB());
        return arrayList;
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.b((etj_0)qS);
    }
}


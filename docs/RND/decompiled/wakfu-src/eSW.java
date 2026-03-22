/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

public abstract class eSW
extends eSS {
    public static final QX rmd = new QX(new QW("Heure standard", new aou_1[0]));
    private boolean rme = false;
    private byte rgK;
    private final long[] rmf = new long[1];

    public QX fIy() {
        return rmd;
    }

    public eSW(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    protected eSW() {
    }

    @Override
    public void aPg() {
    }

    @Override
    public int aeV() {
        return etm_0.rnr.aHp();
    }

    public boolean fIP() {
        return this.rme;
    }

    public void fh(boolean bl) {
        this.rme = bl;
    }

    public void bc(byte by) {
        this.rgK = by;
    }

    public byte fIQ() {
        return this.rgK;
    }

    @Override
    public boolean bcy() {
        return true;
    }

    @Override
    public boolean bcz() {
        return false;
    }

    @Override
    public void a(int n, int n2, short s, QD qD) {
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 == this.biq) {
            this.rmf[0] = anf_2.L(this.biq.bcC(), this.biq.bcD(), this.biq.bcE());
            return this.rmf;
        }
        return null;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        ArrayList<anu_1> arrayList = new ArrayList<anu_1>();
        if (this.biq != null) {
            arrayList.add(this.biq);
        }
        return arrayList;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return this.biq == anu_12;
    }

    @Override
    public void f(anu_1 anu_12) {
    }

    @Override
    public void baG() {
        super.baG();
        if (this.bgJ == null) {
            return;
        }
        Collection<QQ> collection = this.fIR();
        this.K(collection);
    }

    private void K(Collection<QQ> collection) {
        for (QQ qQ : collection) {
            this.bgJ.bai().b(qQ);
        }
    }

    private Collection<QQ> fIR() {
        ArrayList<QQ> arrayList = new ArrayList<QQ>();
        for (QQ qQ : this.bgJ.bai().bdh()) {
            if (qQ == this || qQ.bcC() != this.bcC() || qQ.bcD() != this.bcD() || qQ.bcE() != this.bcE() || qQ.bci() != this.bci()) continue;
            arrayList.add(qQ);
        }
        return arrayList;
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        azg_12.aF(this.rgK);
        azg_12.aF((byte)(this.rme ? 1 : 0));
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        this.bc(byteBuffer.get());
        this.fh(byteBuffer.get() == 1);
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


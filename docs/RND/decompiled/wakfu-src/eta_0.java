/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/*
 * Renamed from eTa
 */
public abstract class eta_0
extends eSS {
    private static final ArrayList<anu_1> rmq = new ArrayList();
    private boolean rmr;
    private boolean rms;
    private static final pt_0[] rmt = new pt_0[]{exx_2.rGB, exx_2.rGF, exx_2.rGC, exx_2.rGD, exx_2.rGE, exx_2.rGu, exx_2.rHs, exx_2.rGP};
    protected eja_0 jCH;
    protected exx_2 rmu;
    public static final QX rmv = new QX(new QW("Mur destructible, avec HP", new aou_1("HP"), new aou_1("incr par level"), new aou_1("bloque le mouvement (l:oui, 0:non)"), new aou_1("bloque la ligne de vue (l:oui, 0:non)")));

    public QX fIy() {
        return rmv;
    }

    public eta_0(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    @Override
    public eSS b(etj_0 etj_02) {
        eSS eSS2 = super.b(etj_02);
        if (etj_02 != null && etj_02.bcB() != null) {
            eSS2.a(etj_02.bcB());
        } else {
            eSS2.a(abi_1.dzm);
        }
        return eSS2;
    }

    protected eta_0() {
    }

    @Override
    public int aeV() {
        return etm_0.rnx.aHp();
    }

    @Override
    public void aPg() {
        ArrayList<pt_0> arrayList = new ArrayList<pt_0>(Arrays.asList(rmt));
        this.rmu = exx_2.rGi;
        arrayList.add(this.rmu);
        this.jCH = new eja_0(arrayList);
        this.jCH.aYH();
        if (this.biv != null && this.biv.length >= 4) {
            int n = (int)(this.oO(0) + (float)this.cmL() * this.oO(1));
            this.jCH.b(this.rmu).ot(n);
            this.jCH.b(this.rmu).aYO();
            this.rmr = this.oO(2) == 1.0f;
            this.rms = this.oO(3) == 1.0f;
            this.bhH = new ers_0(this);
        } else {
            bih.error((Object)"nombre de param\u00e8tre incorrect pour la cr\u00e9ation d'un mur");
        }
    }

    @Override
    public boolean e(anu_1 anu_12) {
        return false;
    }

    @Override
    public pr_0 fIB() {
        return this.b(this.rmu);
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return this.jCH.b(pt_02);
    }

    @Override
    public eja_0 fIC() {
        return this.jCH;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        if (this.jCH != null) {
            return this.jCH.g(pt_02);
        }
        return false;
    }

    @Override
    public boolean baF() {
        return super.baF() || this.jCH.c(this.rmu) <= 0;
    }

    @Override
    public long[] c(anu_1 anu_12) {
        return null;
    }

    public ArrayList<anu_1> m(anu_1 anu_12) {
        return rmq;
    }

    @Override
    public byte bcN() {
        return 6;
    }

    @Override
    public boolean bcR() {
        return this.rmr || this.rms;
    }

    @Override
    public boolean bcS() {
        return this.rmr;
    }

    @Override
    public boolean fID() {
        return this.rms;
    }

    @Override
    public boolean bcM() {
        return this.rms;
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
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        if (this.a(exx_2.rGi)) {
            azg_12.vC(this.d(exx_2.rGi));
            azg_12.vC(this.c(exx_2.rGi));
        }
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        if (this.a(exx_2.rGi)) {
            int n = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            this.b(exx_2.rGi).ot(n);
            this.b(exx_2.rGi).op(n2);
        }
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
        return this.b((etj_0)qS);
    }
}


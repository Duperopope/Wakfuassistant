/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class QQ<FX extends Qj, P extends QS>
implements QP,
QY,
Qk<FX>,
qu_0,
rj_0,
ant_1,
ayx_2 {
    protected static final Logger bih = Logger.getLogger(QQ.class);
    public static final int bii = 45;
    protected BitSet bij;
    protected BitSet bik;
    protected azl_2<FX> bil;
    protected long bim;
    protected long aXv;
    private byte bin = (byte)-1;
    protected final acd_1 bio = new acd_1();
    protected aoh_1 bfG;
    protected qm_0 bgJ;
    protected ObjectPool bip;
    protected qu_0 biq;
    protected int bgO;
    protected final ArrayList<anu_1> bir = new ArrayList();
    protected float[] bis;
    private QT bit;
    protected int biu;
    protected float[] biv;
    protected boolean biw = false;
    protected boolean bix = false;
    protected boolean biy = true;
    protected boolean biz = false;
    private boolean biA = true;
    private boolean biB = true;
    protected Iterable<int[]> biC;
    private int biD;
    private boolean biE = false;
    private boolean biF = false;

    protected QQ() {
    }

    public int bcu() {
        return 8;
    }

    @Override
    public void dp(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.eK(byteBuffer);
    }

    public void eK(ByteBuffer byteBuffer) {
        long l = byteBuffer.getLong();
        if (this.bgJ != null && l != 0L) {
            this.j(this.bgJ.bah().dg(l));
        } else {
            bih.error((Object)"contexte non initialis\u00e9");
        }
    }

    @Override
    public byte[] baB() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(this.bcu());
        byteBuffer.putLong(this.biq != null ? this.biq.Sn() : 0L);
        return byteBuffer.array();
    }

    public QQ(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        this.aVI();
        this.bim = n;
        this.bfG = aoh_12;
        this.bij = bitSet;
        this.bik = bitSet2;
        this.bgO = n2;
        this.biu = n3;
        this.bis = fArray;
        this.biv = fArray2;
        this.biw = bl;
        this.biy = bl2;
        this.biD = n4;
    }

    public QQ a(P p2) {
        QQ qQ = this.bcv();
        qQ.bfG = this.bfG;
        qQ.bij = this.bij;
        qQ.bik = this.bik;
        qQ.bil = this.bil;
        qQ.bim = this.bim;
        qQ.bgO = this.bgO;
        qQ.bis = this.bis;
        qQ.biu = this.biu;
        qQ.biv = this.biv;
        qQ.biw = this.biw;
        qQ.bix = this.bix;
        qQ.biA = this.biA;
        qQ.biy = this.biy;
        qQ.biD = this.biD;
        if (p2 != null) {
            qQ.aXv = ((QS)p2).Sn();
            qQ.a(((QS)p2).getX(), ((QS)p2).getY(), ((QS)p2).bdi());
            qQ.bgJ = ((QS)p2).bbh();
            qQ.j(((QS)p2).bci());
        }
        qQ.bir.clear();
        return qQ;
    }

    protected abstract QQ bcv();

    @Override
    public abstract int aeV();

    @Override
    public void aVI() {
        this.bil = new azl_2();
        this.aXv = 0L;
        this.bio.setX(0);
        this.bio.setY(0);
        this.bio.aM((short)0);
        this.bfG = null;
        this.bgJ = null;
        this.biq = null;
        this.bgO = 0;
        this.bit = null;
        this.biz = false;
        this.bir.clear();
        this.biE = false;
        this.biD = -1;
        this.bin = (byte)-1;
    }

    @Override
    public void aVH() {
        this.bil = null;
        this.aXv = 0L;
        this.bio.setX(0);
        this.bio.setY(0);
        this.bio.aM((short)0);
        this.bfG = null;
        this.bgJ = null;
        this.biq = null;
        this.bgO = 0;
        this.bit = null;
        this.biz = false;
        this.bir.clear();
        this.biC = null;
        this.biD = -1;
    }

    public void aZp() {
        if (this.bip != null) {
            try {
                this.bip.returnObject((Object)this);
            }
            catch (Exception exception) {
                bih.error((Object)"impossible");
            }
            this.bip = null;
        } else {
            this.aVH();
        }
    }

    public long bcw() {
        return this.bim;
    }

    public void a(QT qT) {
        this.bit = qT;
    }

    public azl_2<FX> bcx() {
        return this.bil;
    }

    public abstract boolean bcy();

    public abstract boolean bcz();

    protected byte bcA() {
        return 1;
    }

    @Override
    public boolean a(BitSet bitSet, QD qD, byte by) {
        if (this.baz() != null) {
            this.baz().a(bitSet, qD, by);
        }
        if (qD == null) {
            return false;
        }
        byte by2 = this.bcA();
        if (by == by2) {
            acd_1 acd_12;
            boolean bl = true;
            if (qD.bba() == null && !this.bio.equals(acd_12 = qD.bbe())) {
                bl = false;
            }
            if (bl && this.a(bitSet, (anu_1)qD.bbc())) {
                this.a(bitSet, qD, (anu_1)qD.bbc());
                return true;
            }
        }
        return false;
    }

    @Override
    public qu_0 bci() {
        return this.biq;
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        return null;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        return false;
    }

    @Override
    public int c(pt_0 pt_02) {
        pr_0 pr_02 = this.b(pt_02);
        if (pr_02 != null) {
            return pr_02.aYB();
        }
        throw new UnsupportedOperationException("caract\u00e9ristique inexistante " + String.valueOf(pt_02));
    }

    @Override
    public abi_1 bcB() {
        return this.biq == null ? abi_1.dzq : this.biq.bcB();
    }

    @Override
    public void a(abi_1 abi_12) {
    }

    @Override
    public abi_1 baC() {
        return null;
    }

    @Override
    public void b(abi_1 abi_12) {
    }

    @Override
    public sp_0 baD() {
        return null;
    }

    @Override
    public boolean baF() {
        return this.bgO == 0 && !this.biE;
    }

    @Override
    public boolean baE() {
        return false;
    }

    @Override
    public boolean bay() {
        return true;
    }

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public long QF() {
        return this.aXv;
    }

    @Override
    public int bcC() {
        return this.bio.getX();
    }

    @Override
    public int bcD() {
        return this.bio.getY();
    }

    @Override
    public short bcE() {
        return this.bio.bdi();
    }

    @Override
    public float getWorldX() {
        return this.bio.getX();
    }

    @Override
    public float getWorldY() {
        return this.bio.getY();
    }

    @Override
    public float getAltitude() {
        return this.bio.bdi();
    }

    public int Fq() {
        return this.biD;
    }

    @Override
    public void a(int n, int n2, short s) {
        this.bio.setX(n);
        this.bio.setY(n2);
        this.bio.aM(s);
        if (this.bit != null) {
            this.bit.i(this);
        }
    }

    @Override
    public final void b(acd_1 acd_12) {
        this.a(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public boolean bcF() {
        return true;
    }

    public qm_0 bbh() {
        return this.bgJ;
    }

    @Override
    public void b(int n, int n2, short s) {
        throw new UnsupportedOperationException("Teleport de BasicEffectArea non impl\u00e9ment\u00e9");
    }

    public void c(acd_1 acd_12) {
        throw new UnsupportedOperationException("Teleport de BasicEffectArea non impl\u00e9ment\u00e9");
    }

    @Override
    public int bab() {
        return 3;
    }

    public void a(FX FX) {
        this.bil.M(FX);
    }

    public void a(FX[] FXArray) {
        this.bil.b(FXArray);
    }

    @Override
    @NotNull
    public Iterator<FX> iterator() {
        return this.bil.iterator();
    }

    public void a(aoh_1 aoh_12) {
        this.bfG = aoh_12;
    }

    public aoh_1 bcG() {
        return this.bfG;
    }

    public void a(ObjectPool objectPool) {
        this.bip = objectPool;
    }

    public boolean d(acd_1 acd_12) {
        if (acd_12 == null) {
            return false;
        }
        return this.d(acd_12.getX(), acd_12.getY(), acd_12.bdi());
    }

    public boolean d(int n, int n2, short s) {
        if (this.bfG != null) {
            if (this.biC != null) {
                for (int[] nArray : this.biC) {
                    if (nArray[0] != n || nArray[1] != n2) continue;
                    return true;
                }
                return false;
            }
            return this.bfG.a(this.bcC(), this.bcD(), this.bcE(), this.bcC(), this.bcD(), this.bcE(), n, n2, s);
        }
        bih.error((Object)("m_area is null for area " + String.valueOf(this)), new Throwable());
        return false;
    }

    public boolean a(qu_0 qu_02, int n, int n2, short s) {
        if (this.d(n, n2, s)) {
            return true;
        }
        int n3 = qu_02.bcO();
        if (n3 == 0) {
            return false;
        }
        for (int i = -n3; i <= n3; ++i) {
            for (int j = -n3; j <= n3; ++j) {
                if (!this.d(n + i, n2 + j, s)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(qu_0 qu_02) {
        this.b((anu_1)null);
        this.baG();
        this.biz = true;
    }

    @Override
    public void c(qu_0 qu_02) {
    }

    public boolean a(int n, anu_1 anu_12) {
        BitSet bitSet = new BitSet();
        bitSet.set(n);
        return this.a(bitSet, anu_12);
    }

    public boolean oM(int n) {
        return this.bij.get(n);
    }

    public boolean a(BitSet bitSet, anu_1 anu_12) {
        if (this.bij.intersects(bitSet)) {
            return true;
        }
        return this.bik.intersects(bitSet);
    }

    public void a(int n, QD qD, anu_1 anu_12) {
        BitSet bitSet = new BitSet();
        bitSet.set(n);
        this.a(bitSet, qD, anu_12);
    }

    @Deprecated
    public void b(BitSet bitSet, anu_1 anu_12) {
        this.a(bitSet, null, anu_12);
    }

    public void a(BitSet bitSet, @Nullable QD qD, anu_1 anu_12) {
        if (this.bij.intersects(bitSet)) {
            this.a(qD, anu_12);
        }
        if (this.bik.intersects(bitSet)) {
            this.g(anu_12);
        }
    }

    public boolean oN(int n) {
        BitSet bitSet = new BitSet();
        bitSet.set(n);
        return this.bij.intersects(bitSet) || this.bik.intersects(bitSet);
    }

    public void a(anu_1 anu_12) {
        if (anu_12 != null) {
            this.bir.remove(anu_12);
        }
        this.j(anu_12);
    }

    public void b(anu_1 anu_12) {
        if (anu_12 != null && !this.bir.contains(anu_12)) {
            this.bir.add(anu_12);
        }
        this.k(anu_12);
    }

    public void ba(boolean bl) {
        this.biA = bl;
    }

    protected boolean bcH() {
        return this.biA;
    }

    public boolean bcI() {
        return this.biy;
    }

    public boolean a(@Nullable QD qD, anu_1 anu_12) {
        if (this.e(anu_12) && this.bgO != 0 && !this.biE) {
            if (this.bcz()) {
                this.b(anu_12);
                this.f(anu_12);
            }
            this.h(anu_12);
            if (this.bcH()) {
                if (!this.bcy() && this.bgO > 0) {
                    --this.bgO;
                }
                if (this.bit != null) {
                    try {
                        this.bit.c(this, anu_12);
                    }
                    catch (Exception exception) {
                        bih.error((Object)"Exception levee", (Throwable)exception);
                    }
                }
                long[] lArray = this.c(anu_12);
                this.biE = true;
                if (lArray != null) {
                    for (int i = lArray.length - 1; i >= 0; --i) {
                        long l = lArray[i];
                        try {
                            this.a(anf_2.go(l), anf_2.gp(l), anf_2.gq(l), qD);
                            continue;
                        }
                        catch (Exception exception) {
                            bih.error((Object)"Exception levee lors de l'execution des effets d'une zone", (Throwable)exception);
                        }
                    }
                }
                this.biE = false;
            }
            if (this.bit != null) {
                try {
                    this.bit.h(this);
                }
                catch (Exception exception) {
                    bih.error((Object)"Exception levee", (Throwable)exception);
                }
            }
            return true;
        }
        return false;
    }

    public abstract long[] c(anu_1 var1);

    public abstract List<anu_1> d(anu_1 var1);

    public abstract void a(int var1, int var2, short var3, QD var4);

    public abstract boolean e(anu_1 var1);

    public abstract void f(anu_1 var1);

    public float oO(int n) {
        if (this.biv == null || n >= this.biv.length) {
            bih.error((Object)("appel d'un param\u00e8tre inexistant : " + n));
            return -1.0f;
        }
        return this.biv[n];
    }

    public int bcJ() {
        if (this.biv == null) {
            return 0;
        }
        return this.biv.length;
    }

    public void g(anu_1 anu_12) {
        List<anu_1> list = this.d(anu_12);
        if (list == null) {
            return;
        }
        for (anu_1 anu_13 : list) {
            if (anu_13 != null && anu_13 instanceof qu_0 && ((qu_0)anu_13).baz() != null) {
                ((qu_0)anu_13).baz().a(this, true);
            }
            this.i(anu_13);
        }
    }

    @Override
    public boolean a(pv_0 pv_02) {
        return false;
    }

    @Override
    public void f(pv_0 pv_02) {
    }

    @Override
    public byte b(pv_0 pv_02) {
        return 0;
    }

    @Override
    public void a(pv_0 pv_02, byte by) {
    }

    @Override
    public void g(pv_0 pv_02) {
    }

    @Override
    public void h(pv_0 pv_02) {
    }

    @Override
    public boolean baH() {
        return !this.biz;
    }

    @Override
    public boolean baI() {
        return this.biz;
    }

    @Override
    public void baG() {
    }

    @Override
    public boolean baK() {
        return this.baI();
    }

    @Override
    public boolean baM() {
        return this.baI();
    }

    @Override
    public void baL() {
    }

    @Override
    public void baJ() {
    }

    @Override
    public void d(qu_0 qu_02) {
    }

    public void h(anu_1 anu_12) {
        this.bit.a(this, anu_12);
    }

    public void i(anu_1 anu_12) {
        if (this.bit != null) {
            this.bit.b(this, anu_12);
        } else {
            bih.warn((Object)"Can't call listener, can be a problem ?");
        }
    }

    public void j(anu_1 anu_12) {
    }

    public void k(anu_1 anu_12) {
    }

    public void bcK() {
    }

    public void bcL() {
    }

    public boolean bcM() {
        return false;
    }

    @Override
    public byte bcN() {
        return 0;
    }

    @Override
    public byte bcO() {
        return 0;
    }

    @Override
    public boolean baN() {
        return !this.biF;
    }

    @Override
    public void aT(boolean bl) {
        this.biF = bl;
    }

    @Override
    public byte bcP() {
        if (this.biq != null) {
            return ((ant_1)((Object)this.biq)).bcP();
        }
        return 0;
    }

    @Override
    public byte bcQ() {
        return this.bin;
    }

    @Override
    public void N(byte by) {
        this.bin = by;
    }

    protected void j(qu_0 qu_02) {
        this.biq = qu_02;
    }

    @Override
    public boolean bcR() {
        return false;
    }

    @Override
    public boolean bcS() {
        return false;
    }

    @Override
    public boolean bcT() {
        return false;
    }

    public boolean bcU() {
        return this.biw;
    }

    public boolean bcV() {
        return this.bix;
    }

    public void bb(boolean bl) {
        this.bix = bl;
    }

    public void bcW() {
        int n = this.bcX();
        int n2 = this.bcY();
        short s = this.bcZ();
        abi_1 abi_12 = this.bcB();
        this.biC = this.bfG.b(this.bio.getX(), this.bio.getY(), this.bio.bdi(), n, n2, s, abi_12);
    }

    public int bcX() {
        return this.biq == null ? this.bio.getX() : this.biq.bcC();
    }

    public int bcY() {
        return this.biq == null ? this.bio.getY() : this.biq.bcD();
    }

    public short bcZ() {
        return this.biq == null ? this.bio.bdi() : this.biq.bcE();
    }

    public Iterable<int[]> bda() {
        return this.biC;
    }

    public boolean bdb() {
        return this.biB;
    }

    public void bc(boolean bl) {
        this.biB = bl;
    }

    public boolean bdc() {
        return true;
    }

    @Override
    public acd_1 aZw() {
        return this.bio;
    }

    @Override
    public QQ bdd() {
        return this;
    }

    public String toString() {
        return "BasicEffectArea{m_baseId=" + this.bim + ", m_id=" + this.aXv + ", m_obstacleId=" + this.bin + ", m_position=" + String.valueOf(this.bio) + "}";
    }
}


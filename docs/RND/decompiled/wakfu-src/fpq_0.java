/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TByteIntHashMap;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fpq
 */
public final class fpq_0
extends eIz
implements tk_0<fpp_0> {
    private int epQ;
    private eic_0 sOl;
    private int mzM;
    private int mjJ = -1;
    private fpp_0 mjK = fpp_0.sNV;
    private int sOm;
    private int sOn = -1;
    private int sOo = -1;
    private int sOp = -1;
    private fpp_0 sOq = fpp_0.sNV;
    private uw_0 sOr = uw_0.bju();
    private short ejt;
    private short jvL;
    private boolean sOs;
    private short sOt;
    private short sOu;
    private final TByteIntHashMap sOv = new TByteIntHashMap();
    private final TByteIntHashMap sOw = new TByteIntHashMap();
    private boolean sOx;
    private final azs_2<Long, Integer> sOy = new azs_2(30);

    public fpq_0(long l, int n) {
        this.aXv = l;
        this.epQ = n;
    }

    public fpq_0(long l, int n, ux_0 ux_02) {
        this.aXv = l;
        this.epQ = n;
        this.sOr.f(ux_02);
    }

    public fpq_0(ByteBuffer byteBuffer) {
        this.eL(byteBuffer);
    }

    public eic_0 ggo() {
        return this.sOl;
    }

    public void b(eic_0 eic_02) {
        this.sOl = eic_02;
    }

    @Override
    public long Sn() {
        return this.aXv;
    }

    @Override
    public String HR() {
        return this.aFF;
    }

    @Override
    public int bgK() {
        return this.mzM;
    }

    @Override
    public void pp(int n) {
        this.mzM = n;
    }

    public short cmL() {
        return this.ejt;
    }

    public void bw(short s) {
        this.ejt = s;
    }

    public short ggp() {
        return this.jvL <= 0 ? this.ejt : this.jvL;
    }

    public short fPm() {
        return this.jvL;
    }

    public void eu(short s) {
        this.jvL = s;
    }

    @Override
    public short aWP() {
        return this.sOl.aWP();
    }

    @Override
    public long Ya() {
        return this.sOl.Ya();
    }

    public boolean ggq() {
        return this.sOs;
    }

    public void nG(boolean bl) {
        this.sOs = bl;
    }

    public int Xt() {
        return this.epQ;
    }

    public void Le(int n) {
        this.epQ = n;
    }

    @Override
    public String getName() {
        return this.sOl.xO();
    }

    @Override
    public dR fwD() {
        return this.sOl.fwD();
    }

    public uw_0 ggr() {
        return this.sOr;
    }

    public void aj(ux_0 ux_02) {
        this.sOr.f(ux_02);
    }

    public void ut(long l) {
        Integer n = this.sOy.P(l);
        if (n == null || n == 0) {
            this.sOy.f(l, 1);
        } else {
            this.sOy.f(l, n + 1);
        }
    }

    public int uu(long l) {
        Integer n = this.sOy.O(l);
        return n != null ? n : 0;
    }

    public void ggs() {
        this.sOy.clear();
    }

    @Override
    public int bgM() {
        return this.mjJ;
    }

    @Override
    public void pq(int n) {
        this.mjJ = n;
    }

    public fpp_0 eDH() {
        return this.mjK;
    }

    public void e(fpp_0 fpp_02) {
        this.mjK = fpp_02;
    }

    public int ggt() {
        return this.sOm;
    }

    public void Yr(int n) {
        this.sOm = n;
    }

    public int ggu() {
        return this.sOn;
    }

    public void Ys(int n) {
        this.sOn = n;
    }

    public int ggv() {
        return this.sOo;
    }

    public void Yt(int n) {
        this.sOo = n;
    }

    public int ggw() {
        return this.sOp;
    }

    public void Yu(int n) {
        this.sOp = n;
    }

    public fpp_0 ggx() {
        return this.sOq;
    }

    public void f(fpp_0 fpp_02) {
        this.sOq = fpp_02;
    }

    public void ggy() {
        this.sOq = this.mjK;
        this.sOn = this.mjJ;
        this.sOm = this.mzM;
    }

    @Override
    public byte aWO() {
        return this.sOl.aWO();
    }

    public short ggz() {
        return this.sOt;
    }

    public void ft(short s) {
        this.sOt = s;
    }

    public short ggA() {
        return this.sOu;
    }

    public void fu(short s) {
        this.sOu = s;
    }

    public int a(fpo_0 fpo_02) {
        return this.sOw.get(fpo_02.aJr()) + this.sOv.get(fpo_02.aJr());
    }

    public int b(fpo_0 fpo_02) {
        return this.sOv.get(fpo_02.aJr());
    }

    public int c(fpo_0 fpo_02) {
        return this.sOw.get(fpo_02.aJr());
    }

    public void a(fpo_0 fpo_02, int n) {
        this.sOv.put(fpo_02.aJr(), GC.a(0, n, new int[0]));
    }

    public void b(fpo_0 fpo_02, int n) {
        this.sOw.put(fpo_02.aJr(), GC.a(0, n, new int[0]));
    }

    public void d(fpo_0 fpo_02) {
        this.sOv.adjustOrPutValue(fpo_02.aJr(), 1, 1);
    }

    public void e(fpo_0 fpo_02) {
        this.sOw.adjustOrPutValue(fpo_02.aJr(), 1, 1);
    }

    public boolean ggB() {
        return this.sOx;
    }

    public void nH(boolean bl) {
        this.sOx = bl;
    }

    public void a(azg_1 azg_12, boolean bl) {
        azg_12.gK(this.aXv);
        azg_12.vC(this.epQ);
        azg_12.vC(this.mzM);
        azg_12.vC(this.sOm);
        azg_12.aG(this.ejt);
        azg_12.aG(this.sOl.aWP());
        azg_12.gK(this.sOl.Ya());
        boolean bl2 = bl && this.sOl.fwD() != null;
        azg_12.dz(bl2);
        if (bl2) {
            byte[] objectArray = this.sOl.fwD().toByteArray();
            azg_12.aG((short)objectArray.length);
            azg_12.dH(objectArray);
        }
        azg_12.vC(this.mjJ);
        azg_12.vC(this.sOn);
        azg_12.aF(this.mjK.aJr());
        azg_12.aF(this.sOq.aJr());
        azg_12.aF(this.sOl.aWO());
        azg_12.aG(this.sOt);
        azg_12.aG(this.sOu);
        for (fpo_0 fpo_02 : fpo_0.values()) {
            azg_12.vC(this.sOv.get(fpo_02.aJr()));
        }
        for (fpo_0 fpo_02 : fpo_0.values()) {
            azg_12.vC(this.sOw.get(fpo_02.aJr()));
        }
        byte[] byArray = BH.aP(this.sOl.xO());
        azg_12.vC(byArray.length);
        azg_12.dH(byArray);
        azg_12.gK(this.sOr.bjB());
    }

    public void eL(ByteBuffer byteBuffer) {
        this.aXv = byteBuffer.getLong();
        this.sOl = new eic_0(this.aXv);
        this.epQ = byteBuffer.getInt();
        this.mzM = byteBuffer.getInt();
        this.sOm = byteBuffer.getInt();
        this.ejt = byteBuffer.getShort();
        this.sOl.aT(byteBuffer.getShort());
        this.sOl.jQ(byteBuffer.getLong());
        if (byteBuffer.get() != 0) {
            byte[] objectArray = new byte[byteBuffer.getShort()];
            byteBuffer.get(objectArray);
            this.sOl.d(fpq_0.eA(objectArray));
        }
        this.mjJ = byteBuffer.getInt();
        this.sOn = byteBuffer.getInt();
        this.mjK = fpp_0.hk(byteBuffer.get());
        this.sOq = fpp_0.hk(byteBuffer.get());
        this.sOl.aQ(byteBuffer.get());
        this.sOt = byteBuffer.getShort();
        this.sOu = byteBuffer.getShort();
        for (fpo_0 fpo_02 : fpo_0.values()) {
            this.sOv.put(fpo_02.aJr(), byteBuffer.getInt());
        }
        for (fpo_0 fpo_02 : fpo_0.values()) {
            this.sOw.put(fpo_02.aJr(), byteBuffer.getInt());
        }
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.sOl.dm(BH.dc(byArray));
        this.sOr = uw_0.fn(byteBuffer.getLong());
    }

    public int k(@NotNull tk_0<fpp_0> tk_02) {
        if (tk_02.bgK() > this.mzM) {
            return 1;
        }
        if (tk_02.bgK() < this.mzM) {
            return -1;
        }
        return this.sOr.k(tk_02.bgN());
    }

    public String toString() {
        return "PvpLadderEntry{m_id=" + this.aXv + ", m_nationId=" + this.epQ + ", m_strength=" + this.mzM + ", m_level=" + this.ejt + ", m_breedId=" + this.aZk + ", m_canGainPvpPoints=" + this.sOs + ", m_name='" + this.p + "', m_guildId=" + this.aDL + ", m_fightOccurences=" + String.valueOf(this.sOy) + "}";
    }

    @Override
    public /* synthetic */ ux_0 bgN() {
        return this.ggr();
    }

    @Override
    public /* synthetic */ void a(ti_0 ti_02) {
        this.e((fpp_0)ti_02);
    }

    @Override
    public /* synthetic */ ti_0 bgL() {
        return this.eDH();
    }

    @Override
    public /* synthetic */ int compareTo(@NotNull Object object) {
        return this.k((tk_0)object);
    }
}


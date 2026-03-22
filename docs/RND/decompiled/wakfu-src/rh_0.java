/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.hash.TByteHashSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Rh
 */
public class rh_0
extends wz_0 {
    protected short[] bjT;
    protected int bjU;
    protected int bjV;
    protected int bjW;
    protected int bjX;
    protected short bjY;
    protected boolean bjZ;
    protected short bka;
    protected short bkb;
    protected short aXk;
    protected short bkc;
    private final TByteHashSet bkd = new TByteHashSet();
    private final TByteHashSet bke = new TByteHashSet();
    private boolean bkf = false;
    private final rj_0[] bkg = new rj_0[127];
    protected final rk_0 bkh = new rk_0();
    private boolean bki;
    private byte[] bkj;
    private final rm_0 bkk = new rm_0();
    protected byte bkl = 0;
    protected byte bkm = 0;
    private azy_2<int[]> bkn;
    protected static final int bko = 512;
    protected static final int bkp = 256;
    protected static final int bkq = 128;
    protected static final int bkr = 63;
    protected static final int bks = 10;
    protected static final int bkt = 0;
    protected static final int bku = 65279;
    protected static final boolean bkv = false;
    private static final Logger bkw = Logger.getLogger((String)"debug");
    protected static final wt_0[] bkx = new wt_0[32];
    private static final Logger bky = Logger.getLogger(rh_0.class);
    private List<int[]> bkz;

    @Override
    public boolean g(int n, int n2, short s) {
        int n3 = this.Y(n, n2);
        if (n3 < 0 || n3 >= this.bjU) {
            bky.info((Object)"trying to get information in a fightmap on a out of bounds cell");
            return true;
        }
        short s2 = this.bjT[n3];
        if ((s2 & 0x300) != 0) {
            return true;
        }
        if (this.bkf) {
            return false;
        }
        TByteHashSet tByteHashSet = this.W(n, n2);
        if (tByteHashSet == null || tByteHashSet.isEmpty()) {
            return false;
        }
        for (byte by : tByteHashSet) {
            boolean bl;
            rj_0 rj_02 = this.bkg[by];
            if (rj_02 == null || !(bl = rj_02.bcS()) || this.bkd.contains(by)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean h(int n, int n2, short s) {
        int n3 = this.Y(n, n2);
        if (n3 < 0 || n3 >= this.bjU) {
            bky.info((Object)"trying to get information in a fightmap on an out-of-bounds cell");
            return true;
        }
        short s2 = this.bjT[n3];
        if ((s2 & 0x100) == 256) {
            return true;
        }
        TByteHashSet tByteHashSet = this.W(n, n2);
        if (tByteHashSet == null || tByteHashSet.isEmpty()) {
            return false;
        }
        for (byte by : tByteHashSet) {
            rj_0 rj_02 = this.bkg[by];
            if (rj_02 == null) {
                return false;
            }
            boolean bl = rj_02.bcT();
            if (!bl || this.bke.contains(by)) continue;
            return true;
        }
        return false;
    }

    public short[] bdw() {
        return this.bjT;
    }

    public int bdx() {
        return this.bjU;
    }

    public int bdy() {
        return this.bjV;
    }

    public byte bdz() {
        return this.bkl;
    }

    public byte bdA() {
        return this.bkm;
    }

    public boolean bdB() {
        return this.bki;
    }

    public byte[] bdC() {
        return this.bkj;
    }

    public boolean a(aoh_1 aoh_12, int n, int n2, short s, int n3, int n4, short s2, abi_1 abi_12) {
        if (aoh_12 == null) {
            return true;
        }
        Iterable<int[]> iterable = aoh_12.b(n, n2, s, n3, n4, s2, abi_12);
        if (iterable == null) {
            return true;
        }
        for (int[] nArray : iterable) {
            if (!this.T(nArray[0], nArray[1])) {
                return false;
            }
            if (this.X(nArray[0], nArray[1]) == null) continue;
            return false;
        }
        return true;
    }

    public boolean R(int n, int n2) {
        if (!this.aK(n, n2)) {
            return false;
        }
        int n3 = this.Y(n, n2);
        return this.bjT[n3] != -257 && (this.bjT[n3] & 0x80) != 0;
    }

    public boolean S(int n, int n2) {
        if (!this.aK(n, n2)) {
            return false;
        }
        int n3 = this.Y(n, n2);
        return this.oR(n3);
    }

    private boolean oR(int n) {
        return (this.bjT[n] & 0x80) == 0;
    }

    public boolean T(int n, int n2) {
        if (!this.aK(n, n2)) {
            return false;
        }
        int n3 = this.Y(n, n2);
        return this.oS(n3);
    }

    private boolean oS(int n) {
        return (this.bjT[n] & 0xFFFFFEFF) != -257;
    }

    public rj_0[] bdD() {
        return this.bkg;
    }

    public rj_0 P(byte by) {
        if (!this.R(by)) {
            return null;
        }
        return this.bkg[by];
    }

    public boolean U(int n, int n2) {
        if (!this.aK(n, n2)) {
            return false;
        }
        return this.T(n, n2) || this.S(n - 1, n2) || this.S(n, n2 - 1) || this.S(n + 1, n2) || this.S(n, n2 + 1);
    }

    public byte V(int n, int n2) {
        if (n < this.bro || n >= this.bro + this.brs || n2 < this.brp || n2 >= this.brp + this.brt) {
            return -1;
        }
        TByteHashSet tByteHashSet = this.bkh.oZ(this.Y(n, n2));
        if (tByteHashSet == null || tByteHashSet.isEmpty()) {
            return -1;
        }
        return tByteHashSet.iterator().next();
    }

    public TByteHashSet W(int n, int n2) {
        TByteHashSet tByteHashSet = new TByteHashSet();
        if (n < this.bro || n >= this.bro + this.brs || n2 < this.brp || n2 >= this.brp + this.brt) {
            return tByteHashSet;
        }
        return this.bkh.oZ(this.Y(n, n2));
    }

    public int Q(byte by) {
        return this.bkh.Y(by);
    }

    public byte[] bdE() {
        return this.bkh.bdE();
    }

    protected int a(rj_0 rj_02) {
        return this.Y(rj_02.bcC(), rj_02.bcD());
    }

    @Nullable
    public rj_0 X(int n, int n2) {
        byte by = this.V(n, n2);
        if (by < 0) {
            return null;
        }
        return this.bkg[by];
    }

    public void b(rj_0 rj_02) {
        assert (rj_02 != null) : "can't work on a null obstacle";
        this.bkd.add(rj_02.bcQ());
    }

    public void c(rj_0 rj_02) {
        assert (rj_02 != null) : "can't work on a null obstacle";
        this.bkd.remove(rj_02.bcQ());
    }

    public void bdF() {
        this.bkd.clear();
    }

    public boolean bdG() {
        return this.bkf;
    }

    public void bd(boolean bl) {
        this.bkf = bl;
    }

    public void d(rj_0 rj_02) {
        assert (rj_02 != null) : "can't work on a null obstacle";
        this.bke.add(rj_02.bcQ());
    }

    public void e(rj_0 rj_02) {
        assert (rj_02 != null) : "can't work on a null obstacle";
        this.bke.remove(rj_02.bcQ());
    }

    public void bdH() {
        this.bke.clear();
    }

    public void f(rj_0 rj_02) {
        if (rj_02 == null) {
            return;
        }
        if (!rj_02.bcR()) {
            return;
        }
        this.j(rj_02);
        if (this.aK(rj_02.bcC(), rj_02.bcD())) {
            this.b(rj_02, rj_02.bcC(), rj_02.bcD());
        }
    }

    public void a(byte by, int n) {
        this.bkh.b(by, n);
    }

    public void g(rj_0 rj_02) {
        if (rj_02 == null) {
            return;
        }
        if (!rj_02.bcR()) {
            return;
        }
        if (!this.R(rj_02.bcQ())) {
            return;
        }
        if (this.bkg[rj_02.bcQ()] == rj_02) {
            if (this.aK(rj_02.bcC(), rj_02.bcD())) {
                this.h(rj_02);
            }
            this.bkg[rj_02.bcQ()] = null;
        }
        rj_02.N((byte)-1);
    }

    public void a(@NotNull rj_0 rj_02, boolean bl) {
        int n;
        assert (rj_02.bcR());
        assert (this.bkg[rj_02.bcQ()] == rj_02) : "This obstacle must have been added with addObstacle";
        int n2 = rj_02.bcC();
        if (!this.aK(n2, n = rj_02.bcD())) {
            return;
        }
        if (bl) {
            this.b(rj_02, n2, n);
        } else {
            this.h(rj_02);
        }
    }

    public void a(rj_0 rj_02, int n, int n2) {
        assert (rj_02 != null) : "can't work on a null obstacle";
        if (!rj_02.bcR()) {
            return;
        }
        if (this.aK(rj_02.bcC(), rj_02.bcD())) {
            this.h(rj_02);
        }
        if (this.aK(n, n2)) {
            this.b(rj_02, n, n2);
        }
    }

    private void b(rj_0 rj_02, int n, int n2) {
        byte by;
        if (rj_02 == null) {
            bky.error((Object)"On passe un obstacle null");
            return;
        }
        if (!this.R(rj_02.bcQ())) {
            bky.error((Object)(" l'id de l'obstacle est invalide : " + rj_02.bcQ() + " : " + String.valueOf(rj_02)));
            return;
        }
        byte by2 = rj_02.bcQ();
        rj_0 rj_03 = this.bkg[by2];
        if (rj_03 != null && rj_03 != rj_02) {
            this.g(rj_03);
        }
        if ((by = rj_02.bcO()) <= 0 && !this.aK(n, n2)) {
            bky.error((Object)"Les coordonn\u00e9es doivent etre dans la FightMap");
            return;
        }
        this.bkg[by2] = rj_02;
        this.bkh.b(by2, this.Y(n, n2));
        if (by <= 0) {
            return;
        }
        for (int i = n - by; i <= n + by; ++i) {
            for (int j = n2 - by; j <= n2 + by; ++j) {
                if (!this.aK(i, j) || i == n && j == n2) continue;
                int n3 = this.Y(i, j);
                this.bkh.c(by2, n3);
            }
        }
    }

    private void h(rj_0 rj_02) {
        if (rj_02 == null) {
            return;
        }
        if (rj_02.bcO() <= 0) {
            this.bkh.W(rj_02.bcQ());
        } else if (rj_02.bcO() > 0) {
            this.bkh.X(rj_02.bcQ());
        }
    }

    protected int Y(int n, int n2) {
        return (n2 - this.brp) * this.brs + (n - this.bro);
    }

    public int oT(int n) {
        return n / this.brs + this.brp;
    }

    public int oU(int n) {
        return n % this.brs + this.bro;
    }

    public void i(rj_0 rj_02) {
        if (rj_02 == null) {
            return;
        }
        byte by = rj_02.bcQ();
        if (this.bkg[by] != rj_02) {
            this.h(this.bkg[by]);
            this.b(rj_02, rj_02.bcC(), rj_02.bcD());
        }
        this.bkg[by] = rj_02;
    }

    private byte j(rj_0 rj_02) {
        assert (rj_02 != null);
        byte by = this.bkg.length;
        for (byte by2 = 0; by2 < by; by2 = (byte)((byte)(by2 + 1))) {
            if (this.bkg[by2] != null) continue;
            this.bkg[by2] = rj_02;
            rj_02.N(by2);
            return by2;
        }
        bky.warn((Object)"Max obstacle per fight reached");
        return -1;
    }

    public void a(boolean bl, boolean bl2) {
        for (int i = this.bro; i < this.bro + this.brs; ++i) {
            for (int j = this.brp; j < this.brp + this.brt; ++j) {
                wy_0 wy_02;
                if (!this.T(i, j) || (wy_02 = wa_0.a((long)this.aXk, i, j, bl2 ? this.bkc : (short)0)) == null) continue;
                wy_02.c(i, j, bl);
            }
        }
    }

    public boolean R(byte by) {
        return by >= 0;
    }

    public short Z(int n, int n2) {
        assert (n >= this.bro && n < this.bro + this.brs && n2 >= this.brp && n2 < this.brp + this.brt) : "Coords must be in the fightMap, you can call isInMap to do make sure that's the case";
        int n3 = this.Y(n, n2);
        int n4 = (this.bjT[n3] & 0x3F) >>> 0;
        int n5 = this.bOr.size();
        for (int i = 0; i < n5; ++i) {
            wy_0 wy_02 = (wy_0)this.bOr.get(i);
            ww_0 ww_02 = wy_02.bmp();
            if (!ww_02.aK(n, n2)) continue;
            int n6 = ww_02.a(n, n2, bkx, 0);
            if (n4 >= n6) {
                return Short.MIN_VALUE;
            }
            return rh_0.bkx[n4].ban;
        }
        return Short.MIN_VALUE;
    }

    public short bdI() {
        return this.bka;
    }

    public short bdJ() {
        return this.bkb;
    }

    public boolean bdK() {
        return this.bjZ;
    }

    public short bdL() {
        return this.aXk;
    }

    public void U(short s) {
        this.aXk = s;
    }

    public short bdM() {
        return this.bkc;
    }

    public void V(short s) {
        this.bkc = s;
    }

    public void S(byte by) {
        this.bkl = by;
    }

    public void T(byte by) {
        this.bkm = by;
    }

    public void W(short s) {
        this.bkb = s;
    }

    public void X(short s) {
        this.bka = s;
    }

    public void dt(byte[] byArray) {
        this.bkj = byArray;
    }

    public void be(boolean bl) {
        this.bki = bl;
    }

    public void oV(int n) {
        this.bro = n;
    }

    public void oW(int n) {
        this.brp = n;
    }

    public void oX(int n) {
        this.bjU = n;
    }

    public void j(short[] sArray) {
        this.bjT = sArray;
    }

    public void setWidth(int n) {
        this.brs = n;
    }

    public void setHeight(int n) {
        this.brt = n;
    }

    public TLongArrayList U(byte by) {
        return this.bkk.U(by);
    }

    public void bdN() {
        for (int i = this.bro; i < this.brq; ++i) {
            for (int j = this.brp; j < this.brr; ++j) {
                byte by = this.aa(i, j);
                if (by == -1) continue;
                this.bkk.a(by, i, j);
            }
        }
    }

    public void oY(int n) {
        int n2;
        int n3;
        this.bkj = new byte[this.bjU];
        TIntArrayList tIntArrayList = new TIntArrayList();
        for (int i = this.bro; i < this.brq; ++i) {
            for (n3 = this.brp; n3 < this.brr; ++n3) {
                n2 = this.aa(i, n3);
                if (n2 == -1) continue;
                tIntArrayList.add(this.Y(i, n3));
            }
        }
        if (tIntArrayList.size() < n * 2) {
            return;
        }
        acd_1[][] acd_1Array = new acd_1[2][n];
        for (n3 = 0; n3 < n; ++n3) {
            n2 = tIntArrayList.removeAt(GC.mR(tIntArrayList.size()));
            acd_1Array[0][n3] = new acd_1(this.oU(n2), this.oT(n2));
            n2 = tIntArrayList.removeAt(GC.mR(tIntArrayList.size()));
            acd_1Array[1][n3] = new acd_1(this.oU(n2), this.oT(n2));
        }
        for (n3 = 0; n3 < acd_1Array.length; ++n3) {
            acd_1[] acd_1Array2 = acd_1Array[n3];
            this.a(acd_1Array2, (byte)n3);
        }
    }

    public void a(acd_1[] acd_1Array, byte by) {
        int n;
        assert (by != -1) : "Id can't be equal to -1 since this value is used when the cell is not a valid position";
        assert (this.bjU != 0) : "The fight map must be created before custom teams are added";
        if (!this.bki) {
            this.bki = true;
            this.bkj = new byte[this.bjU];
            this.bkn = new azy_2(2);
            for (n = 0; n < this.bkj.length; ++n) {
                this.bkj[n] = -1;
            }
        }
        n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = acd_1Array.length;
        for (int i = 0; i < n7; ++i) {
            acd_1 acd_12 = acd_1Array[i];
            if (acd_12 == null) continue;
            int n8 = acd_12.getX();
            int n9 = acd_12.getY();
            assert (this.S(n8, n9)) : "The start position (" + n8 + "; " + n9 + ") is not in the fightMap";
            if (i == 0) {
                n = n8;
                n2 = n9;
                n3 = n8;
                n4 = n9;
                n5 = n8;
                n6 = n9;
            } else {
                if (n8 < n3) {
                    n3 = n8;
                }
                if (n9 < n4) {
                    n4 = n9;
                }
                if (n8 > n5) {
                    n5 = n8;
                }
                if (n9 > n6) {
                    n6 = n9;
                }
                int n10 = n5 - (n5 - n3) / 2;
                int n11 = n6 - (n6 - n4) / 2;
                if (Math.abs(n8 - n10) + Math.abs(n9 - n11) < Math.abs(n - n10) + Math.abs(n2 - n11)) {
                    n = n8;
                    n2 = n9;
                }
            }
            this.bkj[this.Y((int)n8, (int)n9)] = by;
            this.bkk.a(by, n8, n9);
        }
        this.bkn.a(by, new int[]{n, n2});
    }

    public byte aa(int n, int n2) {
        if (!this.S(n, n2)) {
            return -1;
        }
        if (this.bki) {
            return this.bkj[this.Y(n, n2)];
        }
        if (this.brs >= this.brt) {
            int n3 = this.brs / 2;
            return n < this.bro + n3 ? this.bkl : (byte)(1 - this.bkl);
        }
        int n4 = this.brt / 2;
        return n2 < this.brp + n4 ? this.bkm : (byte)(1 - this.bkm);
    }

    public byte a(acd_1 acd_12, acd_1 acd_13) {
        if (this.brs >= this.brt) {
            return acd_12.getX() <= acd_13.getX() ? (byte)0 : 1;
        }
        return acd_12.getY() <= acd_13.getY() ? (byte)0 : 1;
    }

    public acd_1 bdO() {
        return new acd_1(this.brs / 2 + this.bro, this.brt / 2 + this.brp, 0);
    }

    public final wt_0 i(int n, int n2, short s) {
        if (!this.aK(n, n2)) {
            return null;
        }
        int n3 = this.Y(n, n2);
        int n4 = (this.bjT[n3] & 0x3F) >>> 0;
        int n5 = this.bOr.size();
        for (int i = 0; i < n5; ++i) {
            wy_0 wy_02 = (wy_0)this.bOr.get(i);
            ww_0 ww_02 = wy_02.bmp();
            if (!ww_02.aK(n, n2)) continue;
            int n6 = ww_02.a(n, n2, bkx, 0);
            if (n4 >= n6) {
                return null;
            }
            if (s != rh_0.bkx[n4].ban) {
                return null;
            }
            return bkx[n4];
        }
        return null;
    }

    public final boolean j(int n, int n2, short s) {
        wt_0 wt_02 = this.i(n, n2, s);
        if (wt_02 == null) {
            return false;
        }
        return wt_02.bNP != -1;
    }

    public final boolean ab(int n, int n2) {
        int n3 = this.Y(n, n2);
        if (n3 < 0 || n3 >= this.bjU) {
            return false;
        }
        short s = this.bjT[n3];
        return (s & 0x300) != 0;
    }

    public short ac(int n, int n2) {
        int n3 = this.bro + this.brs - n > n - this.bro ? this.bro + this.brs - n : n - this.bro;
        int n4 = this.brp + this.brt - n > n2 - this.brp ? this.brp + this.brt - n2 : n2 - this.brp;
        return (short)(n3 > n4 ? n3 : n4);
    }

    public abi_1 V(byte by) {
        if (this.brs >= this.brt) {
            return by == 0 ? abi_1.dzk : abi_1.dzo;
        }
        return by == 0 ? abi_1.dzm : abi_1.dzq;
    }

    public void clear() {
        this.bjU = 0;
        this.bOr.clear();
        this.bkj = null;
    }

    public void bdP() {
        boolean bl;
        boolean bl2 = bl = this.bkc == 0;
        if (!wa_0.bmu() && !bl) {
            aci_1 aci_12 = vz_0.i(this.bro, this.brp, this.brs, this.brt);
            for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
                for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                    wa_0.b((long)this.aXk, (int)((short)j), (int)((short)i), this.bkc);
                }
            }
        }
    }

    public int bdQ() {
        int n = 0;
        n += 4;
        n += 16;
        n += 4;
        n += 2;
        n += this.bjU * 2;
        ++n;
        if (this.bki) {
            n += this.bkj.length;
        }
        return n += 2;
    }

    public void eL(ByteBuffer byteBuffer) {
        int n = byteBuffer.position();
        this.aXk = byteBuffer.getShort();
        this.bkc = byteBuffer.getShort();
        this.bro = byteBuffer.getInt();
        this.brp = byteBuffer.getInt();
        this.brs = byteBuffer.getInt();
        this.brt = byteBuffer.getInt();
        this.bka = byteBuffer.getShort();
        this.bkb = byteBuffer.getShort();
        this.bjU = byteBuffer.getShort();
        assert (byteBuffer.remaining() > this.bjU * 2);
        this.bjT = new short[this.bjU];
        for (int i = 0; i < this.bjU; ++i) {
            this.bjT[i] = byteBuffer.getShort();
        }
        boolean bl = this.bki = byteBuffer.get() == 1;
        if (this.bki) {
            this.bkj = new byte[this.bjU];
            byteBuffer.get(this.bkj);
        }
        aci_1 aci_12 = vz_0.i(this.bro, this.brp, this.brs, this.brt);
        if (wa_0.bmu()) {
            for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
                for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                    wy_0 wy_02 = wa_0.l((short)j, (short)i);
                    if (wy_02 == null) continue;
                    this.bOr.add(wy_02);
                }
            }
        } else {
            for (int i = aci_12.cuS; i < aci_12.cuT; ++i) {
                for (int j = aci_12.cuQ; j < aci_12.cuR; ++j) {
                    try {
                        wa_0.b(this.aXk, (short)j, (short)i);
                        wy_0 wy_03 = wa_0.b((long)this.aXk, (short)j, (short)i, this.bkc);
                        if (wy_03 == null) continue;
                        this.bOr.add(wy_03);
                        continue;
                    }
                    catch (IOException iOException) {
                        bky.error((Object)("Unable to load map (" + (short)j + "; " + (short)i + ")"));
                    }
                }
            }
        }
        this.bkl = byteBuffer.get();
        this.bkm = byteBuffer.get();
        assert (byteBuffer.position() - n == this.bdQ()) : "Unserialized data don't have the right size";
    }

    public boolean a(anu_1 anu_12, acd_1 acd_12) {
        int n;
        int n2 = acd_12.getX();
        if (!this.aK(n2, n = acd_12.getY())) {
            return false;
        }
        byte by = anu_12.bcO();
        short s = acd_12.bdi();
        if (by == 0) {
            if (anu_12 instanceof rj_0) {
                this.b((rj_0)((Object)anu_12));
            }
            boolean bl = this.g(n2, n, s);
            if (anu_12 instanceof rj_0) {
                this.bdF();
            }
            return !bl;
        }
        if (anu_12 instanceof rj_0) {
            this.b((rj_0)((Object)anu_12));
        }
        for (int i = n2 - by; i <= n2 + by; ++i) {
            for (int j = n - by; j <= n + by; ++j) {
                if (this.aK(n2, n) && !this.g(i, j, s)) continue;
                if (anu_12 instanceof rj_0) {
                    this.bdF();
                }
                return false;
            }
        }
        if (anu_12 instanceof rj_0) {
            this.b((rj_0)((Object)anu_12));
        }
        return true;
    }

    public String toString() {
        return "boundingBox={(" + this.bro + ", " + this.brp + ") => (" + this.brq + ", " + this.brr + ")}, numCells=" + this.bjU + ", width=" + this.brs + ", height=" + this.brt + ", center=(" + this.bjW + ", " + this.bjX + ", " + this.bjY + ")";
    }

    @Override
    protected int ad(int n, int n2) {
        int n3 = this.bOr.size();
        for (int i = 0; i < n3; ++i) {
            ww_0 ww_02 = ((wy_0)this.bOr.get(i)).bmp();
            int n4 = ww_02.bap;
            int n5 = ww_02.baq;
            if (n < n4 || n >= n4 + 18 || n2 < n5 || n2 >= n5 + 18) continue;
            return i;
        }
        return -1;
    }

    public void a(wy_0 wy_02) {
        this.bOr.add(wy_02);
    }

    public acd_1 bdR() {
        this.bdS();
        int[] nArray = this.bkz.get(GC.mR(this.bkz.size()));
        return new acd_1(nArray);
    }

    private void bdS() {
        if (this.bkz != null) {
            return;
        }
        this.bkz = new ArrayList<int[]>();
        for (int i = 0; i < this.bjT.length; ++i) {
            if (!this.oR(i)) continue;
            int n = i % this.brs + this.bro;
            int n2 = i / this.brs + this.brp;
            this.bkz.add(new int[]{n, n2});
        }
    }

    public List<int[]> bdT() {
        this.bdS();
        return new ArrayList<int[]>(this.bkz);
    }

    public void bdU() {
        for (int i = 0; i < this.bjT.length; ++i) {
            short s = this.bjT[i];
            if ((s & 0x80) == 0) continue;
            int n = i;
            this.bjT[n] = (short)(this.bjT[n] | 0x200);
        }
    }

    static {
        for (int i = 0; i < bkx.length; ++i) {
            rh_0.bkx[i] = new wt_0();
        }
    }
}


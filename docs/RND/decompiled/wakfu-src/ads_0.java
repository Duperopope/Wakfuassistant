/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from adS
 */
public class ads_0
extends adj_0
implements adx_0 {
    public static final int[][] clo = new int[][]{{-1, -1}, {-1, 1}, {1, -1}, {0, -1}, {-1, 0}, {0, 1}, {1, 0}, {1, 1}};
    public static final int[][] clp = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    public static final short clq = 4;
    public static final short clr = 8;
    protected static final float cls = 2.0f;
    private static final byte clt = 0;
    private static final byte clu = 1;
    private static final byte clv = 2;
    private static final boolean clw = false;
    private static final wt_0[] clx = wt_0.blX();
    public static boolean cly;
    public static boolean clz;
    protected static final boolean clA = false;
    protected final List<adm_0> clB = new ArrayList<adm_0>(5);
    protected final Set<adm_0> clC = new HashSet<adm_0>(5);
    private final adv_0 clD = new adv_0();
    private final adv_0 clE = new adv_0();
    public int[][] clF = clo;
    protected short clG = (short)4;
    protected anp_2 clH;
    protected int clI;
    protected int clJ;
    protected int clK;
    protected boolean clL;
    protected final TIntHashSet clM = new TIntHashSet();
    protected ace_2 clN;
    protected acp_1 clO;
    protected byte clP = (byte)8;
    protected boolean clQ = true;
    private aex clR = aeB.bww();
    protected aed_0 clS = aem_0.bwq();
    private boolean clT;
    private boolean clU;
    private boolean clV;
    private float clW = 1.0f;
    private int clX;

    public ads_0(long l) {
        super(l);
    }

    public ads_0(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    public ads_0(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public boolean a(adm_0 adm_02) {
        return this.clB.contains(adm_02);
    }

    public final void b(adm_0 adm_02) {
        if (this.clB.contains(adm_02)) {
            this.clC.remove(adm_02);
            return;
        }
        this.clB.add(adm_02);
    }

    public final void c(adm_0 adm_02) {
        if (adm_02 != null) {
            this.clC.add(adm_02);
        }
    }

    public final void m(Class<?> clazz) {
        for (adm_0 adm_02 : this.clB) {
            if (!clazz.isAssignableFrom(adm_02.getClass())) continue;
            this.clC.add(adm_02);
        }
    }

    public final void bvt() {
        this.clC.addAll(this.clB);
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        float[] fArray;
        boolean bl;
        this.clX += n;
        if (this.clN == null) {
            return;
        }
        if ((long)this.clX >= this.clN.bXF()) {
            this.bvu();
            return;
        }
        this.clB.removeAll(this.clC);
        this.clC.clear();
        if (cly) {
            this.bvv();
        }
        float f2 = ads_0.a(this.clN, this.clX);
        acp_1 acp_12 = this.clN.fZ(this.clX);
        abi_1 abi_12 = this.a(acp_12, this.clO);
        acp_1 acp_13 = this.clN.a(this.clX, abi_12 != null ? abi_12 : this.bcB(), this.clH);
        float f3 = acp_12.aSc();
        float f4 = acp_12.aSd();
        int n2 = Math.round(f3);
        int n3 = Math.round(acp_13.aSc());
        int n4 = Math.round(f4);
        int n5 = Math.round(acp_13.aSd());
        int n6 = this.bw(n2, n4);
        if (!this.clH.m(new int[]{n2, n4})) {
            int[] nArray = this.clH.tj(this.clI);
            n2 = Math.round(nArray[0]);
            n4 = Math.round(nArray[1]);
        }
        int n7 = this.clH.F(n2, n4, this.clI);
        int n8 = this.clH.F(n3, n5, this.clI);
        int n9 = this.y(n2, n4, n7);
        int n10 = this.y(n3, n5, n8);
        this.z(n2, n4, n6);
        if (n3 != n2 || n5 != n4) {
            ads_0.a(n2, n4, n9, this.clD);
            ads_0.a(n3, n5, n10, this.clE);
        }
        this.clO = acp_12;
        assert (!Float.isNaN(f3));
        assert (!Float.isNaN(f4));
        if (n2 != this.bcC() || n4 != this.bcD() || n9 != this.bcE()) {
            agX.c(this);
        }
        if (!(bl = this.a(acp_12, n3, n5, fArray = new float[]{this.bVB}))) {
            bl = this.d(acp_12, n3, n5, fArray);
        }
        if (!bl) {
            bl = this.a(acp_12, n3, n5, n10, fArray);
        }
        if (!bl) {
            bl = this.b(acp_12, n3, n5, fArray);
        }
        if (!bl) {
            bl = this.c(acp_12, n3, n5, fArray);
        }
        if (!bl && this.clH != null) {
            this.clS.a((adx_0)this, (int)(f2 * (float)this.clH.bDU()));
            this.clL = false;
        }
        if (abi_12 != null) {
            this.clS.b((adx_0)this, abi_12);
        }
        super.e(f3, f4, fArray[0]);
        this.bvw();
    }

    protected final void bvu() {
        int n;
        int n2;
        ArrayList<adj_0> arrayList;
        acp_1 acp_12 = this.clN.bzM();
        super.e(acp_12.aSc(), acp_12.aSd(), acp_12.aSe());
        if (this.buU() != null) {
            this.buU().e(this.bVz, this.bVA, this.bVB + (float)this.aKu());
        }
        if ((arrayList = this.bva()) != null) {
            n2 = arrayList.size();
            for (n = 0; n < n2; ++n) {
                arrayList.get(n).e(this.bVz, this.bVA, this.bVB);
            }
        }
        this.clN = null;
        this.clH = null;
        this.clI = -1;
        this.clJ = -1;
        this.clK = -1;
        this.clS.a((adx_0)this, 0);
        this.clS.b(this);
        this.clR.i(this);
        this.clL = false;
        this.clB.removeAll(this.clC);
        this.clC.clear();
        n2 = this.clB.size();
        for (n = 0; n < n2; ++n) {
            this.clB.get(n).pathEnded(this, (int)this.bVz, (int)this.bVA, (short)this.bVB);
        }
        this.clB.removeAll(this.clC);
        this.clC.clear();
        agX.c(this);
    }

    protected void bvv() {
    }

    private static float a(ace_2 ace_22, int n) {
        long l = ace_22.bXF();
        return (float)(l - (long)n) / (float)(l - ace_22.bXG());
    }

    @Nullable
    private abi_1 a(acp_1 acp_12, acp_1 acp_13) {
        float f2 = acp_12.aPY - acp_13.aPY;
        float f3 = acp_12.aPZ - acp_13.aPZ;
        if (f2 == 0.0f && f3 == 0.0f) {
            return null;
        }
        if (this.bvx() == 8) {
            return acp_1.bo(f2, f3);
        }
        return acp_1.bp(f2, f3);
    }

    private int y(int n, int n2, int n3) {
        int n4;
        int n5 = this.clH.bDU();
        int n6 = n4 = this.clI == 0 ? 0 : this.clI - 1;
        while (n4 < n5) {
            int[] nArray = this.clH.tj(n4);
            if (nArray[0] == n && nArray[1] == n2 && Math.abs(n3 - nArray[2]) <= this.bvy()) {
                return nArray[2];
            }
            ++n4;
        }
        short s = wa_0.w(n, n2, (short)n3);
        if (s == Short.MIN_VALUE) {
            return n3;
        }
        return s;
    }

    private int bw(int n, int n2) {
        int n3 = Integer.MAX_VALUE;
        int n4 = 0;
        for (int i = this.clI; i < this.clH.bDU(); ++i) {
            int[] nArray = this.clH.tj(i);
            int n5 = (nArray[0] - n) * (nArray[0] - n) + (nArray[1] - n2) * (nArray[1] - n2);
            if (n5 >= n3) continue;
            n3 = n5;
            n4 = i;
        }
        return n4;
    }

    protected void z(int n, int n2, int n3) {
        if (n3 > this.clI) {
            int n4 = this.clI;
            for (int i = this.clI + 1; i < n3; ++i) {
                this.a(this.clH.tj(i), this.clH.tj(i - 1));
            }
            this.clI = this.clI != n4 ? this.bw(n, n2) : n3;
            if (clz) {
                this.bvz();
            }
        }
    }

    private static void a(int n, int n2, int n3, adv_0 adv_02) {
        if (adv_02.A(n, n2, n3)) {
            return;
        }
        adv_02.reset();
        wy_0 wy_02 = wa_0.aQ(n, n2);
        if (wy_02 == null) {
            return;
        }
        int n4 = wy_02.bmp().a(n, n2, clx, 0);
        if (n4 == 0) {
            return;
        }
        for (int i = 0; i < n4; ++i) {
            DisplayedScreenElement displayedScreenElement;
            wt_0 wt_02 = clx[i];
            if (wt_02.ban != n3 || (displayedScreenElement = aaa_0.brC().f(wt_02.bap, wt_02.baq, wt_02.ban, abd.ccZ)) == null) continue;
            aeS aeS2 = displayedScreenElement.brk().bsz();
            adv_02.cmb = aeS2.bwX();
            adv_02.cmc = adv_02.cmb != 0 ? (byte)aeS2.bwY() : (byte)0;
            adv_02.setPosition(n, n2, n3);
            break;
        }
        if (adv_02.cmf == Integer.MAX_VALUE) {
            adv_02.cmb = 0;
            adv_02.cmc = 0;
            adv_02.setPosition(n, n2, n3);
        }
    }

    private boolean a(acp_1 acp_12, int n, int n2, float[] fArray) {
        float f2;
        if (!this.clD.bvZ() || !this.clE.bvZ()) {
            return false;
        }
        float f3 = (float)n - acp_12.aSc();
        float f4 = (float)n2 - acp_12.aSd();
        float f5 = aco_1.bn(f3, f4);
        int n3 = this.clE.cmd - this.clD.cmd;
        int n4 = this.clE.cme - this.clD.cme;
        int n5 = this.clE.cmf - this.clD.cmf;
        float f6 = aco_1.bn(n3, n4);
        float f7 = f2 = f6 == 0.0f ? 0.0f : GC.b(1.0f - GC.J(f5 / f6), 0.0f, 1.0f);
        if (!wa_0.i(this.clD.cmd, this.clD.cme, this.clD.cmf) || !wa_0.i(this.clE.cmd, this.clE.cme, this.clE.cmf) || GC.e(f2, 0.0f) || Math.abs(n5) < 10) {
            return false;
        }
        this.clS.d(this);
        if ((double)f5 == 0.0) {
            fArray[0] = (float)this.clD.cmf + f2 * (float)n5;
            return true;
        }
        fArray[0] = this.aL(f2, 0.5f);
        return true;
    }

    protected boolean b(acp_1 acp_12, int n, int n2, float[] fArray) {
        boolean bl;
        if (!this.clD.bvZ() || !this.clE.bvZ()) {
            return false;
        }
        boolean bl2 = bl = wa_0.k(this.clD.cmd, this.clD.cme, this.clD.cmf) && this.clD.cmd == this.clE.cmd && this.clD.cme == this.clE.cme;
        if (!(wa_0.l(this.clD.cmd, this.clD.cme, this.clD.cmf) && wa_0.k(this.clE.cmd, this.clE.cme, this.clE.cmf) || bl)) {
            return false;
        }
        this.clS.e(this);
        this.clL = true;
        return true;
    }

    protected boolean c(acp_1 acp_12, int n, int n2, float[] fArray) {
        if (!this.clD.bvZ() || !this.clE.bvZ()) {
            return false;
        }
        if (!wa_0.k(this.clD.cmd, this.clD.cme, this.clD.cmf) || !wa_0.l(this.clE.cmd, this.clE.cme, this.clE.cmf)) {
            return false;
        }
        this.clS.f(this);
        this.clL = true;
        return true;
    }

    private boolean d(acp_1 acp_12, int n, int n2, float[] fArray) {
        float f2;
        if (!this.clD.bvZ() || !this.clE.bvZ()) {
            return false;
        }
        if (wa_0.i(this.clD.cmd, this.clD.cme, this.clD.cmf) && wa_0.i(this.clE.cmd, this.clE.cme, this.clE.cmf)) {
            return false;
        }
        float f3 = (float)n - acp_12.aSc();
        float f4 = (float)n2 - acp_12.aSd();
        float f5 = aco_1.bn(f3, f4);
        int n3 = this.clE.cmd - this.clD.cmd;
        int n4 = this.clE.cme - this.clD.cme;
        int n5 = this.clE.cmf - this.clD.cmf;
        float f6 = aco_1.bn(n3, n4);
        float f7 = f2 = f6 == 0.0f ? 0.0f : GC.b(1.0f - GC.J(f5 / f6), 0.0f, 1.0f);
        if ((double)f5 == 0.0) {
            fArray[0] = (float)this.clD.cmf + f2 * (float)n5;
            return false;
        }
        boolean bl = this.clS.b((adx_0)this, n5);
        byte by = ads_0.a(this.clD, this.clE, 1);
        if (bl && (by == 1 || by == 2)) {
            boolean bl2 = false;
            aeq_0 aeq_02 = n5 >= 0 ? this.clS.bwi() : this.clS.bwh();
            aev_0 aev_02 = aeq_02.cr(f2);
            switch (aev_02) {
                case cni: {
                    break;
                }
                case cnm: {
                    fArray[0] = this.clE.cmf;
                    break;
                }
                case cnj: 
                case cnk: 
                case cnl: {
                    bl2 = true;
                    fArray[0] = aeq_02.a(this.clD.cmf, this.clE.cmf, f2, aev_02);
                }
            }
            if (this.clQ && bl2 && by != 2) {
                if (this.clJ == -1) {
                    this.clJ = this.clI;
                    if (this.bKc.equals("AnimSaut-Marche") || this.bKc.equals("AnimSaut-Marche") || this.bKc.equals("AnimSaut-Marche") || this.bKc.equals("AnimSaut-Marche")) {
                        this.bpC();
                    }
                }
                boolean bl3 = Math.abs(this.clD.cmf - this.clE.cmf) == 3;
                boolean bl4 = this.clD.cmf <= this.clE.cmf;
                this.clS.a(this, n5, aev_02, bl4, bl3);
                if ((double)f2 <= 0.48 && this.clI > this.clJ) {
                    this.clJ = this.clI;
                    this.bpC();
                }
                return true;
            }
            return false;
        }
        fArray[0] = this.aL(f2, 0.1f);
        return false;
    }

    private boolean a(acp_1 acp_12, int n, int n2, int n3, float[] fArray) {
        float f2 = (float)n - acp_12.aSc();
        float f3 = (float)n2 - acp_12.aSd();
        float f4 = aco_1.bn(f2, f3);
        int n4 = this.clE.cmd - this.clD.cmd;
        int n5 = this.clE.cme - this.clD.cme;
        float f5 = aco_1.bn(n4, n5);
        float f6 = f5 == 0.0f ? 0.0f : GC.b(1.0f - GC.J(f4 / f5), 0.0f, 1.0f);
        int n6 = Math.round(acp_12.aSc());
        int n7 = Math.round(acp_12.aSd());
        int n8 = Math.round(acp_12.aSe());
        if (wa_0.g(this.clE.cmd, this.clE.cme, this.clE.cmf) && GC.e(f6, 0.0f)) {
            return false;
        }
        if (wa_0.g(n6, n7, n8)) {
            return true;
        }
        if (wa_0.h(n6, n7, n8) && wa_0.g(n, n2, n3)) {
            this.clS.c(this);
            return true;
        }
        return false;
    }

    private void bvw() {
        ArrayList<adj_0> arrayList;
        if (this.buU() != null) {
            this.buU().e(this.bVz, this.bVA, this.bVB + (float)this.aKu());
        }
        if ((arrayList = this.bva()) != null) {
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                arrayList.get(i).e(this.bVz, this.bVA, this.bVB);
            }
        }
    }

    public byte bvx() {
        return this.clP;
    }

    public short bvy() {
        return this.clG;
    }

    protected void bvz() {
    }

    private float aL(float f2, float f3) {
        adv_0 adv_02 = f2 <= 0.5f ? this.clD : this.clE;
        int n = this.clE.cmf - this.clD.cmf;
        if (adv_02.cmb == 0) {
            if (n == 0 || this.clD.cmb != this.clE.cmb) {
                return adv_02.cmf;
            }
            if (this.clD.cmb == this.clE.cmb) {
                float f4 = 0.5f - f2;
                if (Math.abs(f4) > f3) {
                    return adv_02.cmf;
                }
                return (float)this.clD.cmf + (f3 - f4) / f3 * 0.5f * (float)n;
            }
        }
        float f5 = this.clD.cmb == this.clE.cmb ? f2 : (f2 <= 0.5f ? f2 * 2.0f : f2 * 2.0f - 1.0f);
        return (float)this.clD.cmf + f5 * (float)n;
    }

    private static byte a(adv_0 adv_02, adv_0 adv_03, int n) {
        int n2 = adv_03.cmd - adv_02.cmd;
        int n3 = adv_03.cme - adv_02.cme;
        byte by = adv_02.cmc;
        byte by2 = adv_03.cmc;
        byte by3 = adv_02.cmb;
        byte by4 = adv_03.cmb;
        int n4 = adv_03.cmf - (by4 != 0 ? by2 / 2 : 0) - (adv_02.cmf - (by3 != 0 ? by / 2 : 0));
        if (n2 == 0 || n3 == 0) {
            if (n2 > 0) {
                if ((by3 & 0xC) == 12 && (by4 & 3) == 3) {
                    return 2;
                }
                byte by5 = (by3 & 4) == 4 ? by : (byte)0;
                byte by6 = (by3 & 8) == 8 ? by : (byte)0;
                byte by7 = by4 == 0 || (by4 & 1) == 1 ? by2 : (byte)0;
                byte by8 = by4 == 0 || (by4 & 2) == 2 ? by2 : (byte)0;
                return Math.abs(by5 - (by8 + n4)) <= Math.abs(n) && Math.abs(by6 - (by7 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            if (n2 < 0) {
                if ((by3 & 3) == 3 && (by4 & 0xC) == 12) {
                    return 2;
                }
                byte by9 = (by3 & 1) == 1 ? by : (byte)0;
                byte by10 = (by3 & 2) == 2 ? by : (byte)0;
                byte by11 = by4 == 0 || (by4 & 8) == 8 ? by2 : (byte)0;
                byte by12 = by4 == 0 || (by4 & 4) == 4 ? by2 : (byte)0;
                return Math.abs(by9 - (by11 + n4)) <= Math.abs(n) && Math.abs(by10 - (by12 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            if (n3 > 0) {
                if ((by3 & 9) == 9 && (by4 & 6) == 6) {
                    return 2;
                }
                byte by13 = (by3 & 1) == 1 ? by : (byte)0;
                byte by14 = (by3 & 8) == 8 ? by : (byte)0;
                byte by15 = by4 == 0 || (by4 & 2) == 2 ? by2 : (byte)0;
                byte by16 = by4 == 0 || (by4 & 4) == 4 ? by2 : (byte)0;
                return Math.abs(by13 - (by15 + n4)) <= Math.abs(n) && Math.abs(by14 - (by16 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            if ((by3 & 6) == 6 && (by4 & 9) == 9) {
                return 2;
            }
            byte by17 = (by3 & 2) == 2 ? by : (byte)0;
            byte by18 = (by3 & 4) == 4 ? by : (byte)0;
            byte by19 = by4 == 0 || (by4 & 1) == 1 ? by2 : (byte)0;
            byte by20 = by4 == 0 || (by4 & 8) == 8 ? by2 : (byte)0;
            return Math.abs(by18 - (by20 + n4)) <= Math.abs(n) && Math.abs(by17 - (by19 + n4)) <= Math.abs(n) ? (byte)0 : 1;
        }
        if (n2 > 0) {
            if (n3 > 0) {
                byte by21 = (by3 & 8) == 8 ? by : (byte)0;
                byte by22 = by4 == 0 || (by4 & 2) == 2 ? by2 : (byte)0;
                return Math.abs(by21 - (by22 + n4)) <= Math.abs(n) ? (byte)0 : 1;
            }
            byte by23 = (by3 & 4) == 4 ? by : (byte)0;
            byte by24 = by4 == 0 || (by4 & 1) == 1 ? by2 : (byte)0;
            return Math.abs(by23 - (by24 + n4)) <= Math.abs(n) ? (byte)0 : 1;
        }
        if (n3 > 0) {
            byte by25 = (by3 & 1) == 1 ? by : (byte)0;
            byte by26 = by4 == 0 || (by4 & 4) == 4 ? by2 : (byte)0;
            return Math.abs(by25 - (by26 + n4)) <= Math.abs(n) ? (byte)0 : 1;
        }
        byte by27 = (by3 & 2) == 2 ? by : (byte)0;
        byte by28 = by4 == 0 || (by4 & 8) == 8 ? by2 : (byte)0;
        return Math.abs(by27 - (by28 + n4)) <= Math.abs(n) ? (byte)0 : 1;
    }

    public void aw(short s) {
        this.clG = s;
    }

    public void at(byte by) {
        this.clP = by;
    }

    public void bvA() {
        if (this.clH == null) {
            return;
        }
        anp_2 anp_22 = this.clH.bP(this.clI, this.clI + 2);
        this.a(anp_22, false, true);
    }

    public void a(anp_2 anp_22, boolean bl, boolean bl2) {
        this.a(anp_22, bl, bl2, aea_0.cmC);
    }

    public void a(anp_2 anp_22, boolean bl, boolean bl2, aea_0 aea_02) {
        this.clJ = -1;
        this.clK = -1;
        if (anp_22.bDU() < 2) {
            return;
        }
        if (anp_22.bDU() == 2 && anp_22.bDW()[0] == anp_22.bDX()[0] && anp_22.bDW()[1] == anp_22.bDX()[1]) {
            this.rX(0);
            return;
        }
        switch (aea_02) {
            case cmx: 
            case cmo: {
                this.clS = aef_0.bwm();
                break;
            }
            case cmr: 
            case cmw: 
            case cmA: 
            case cmn: {
                this.clS = aem_0.bwq();
                break;
            }
            case cmy: {
                this.clS = this.clR.bwt();
                break;
            }
            case cmz: {
                this.clS = this.clR.bws();
                break;
            }
            default: {
                this.rX(anp_22.bDU());
            }
        }
        float f2 = (float)this.clS.a(this) / (this.clW * adq_0.bqv());
        adr_0[] adr_0Array = new adr_0[anp_22.bDU()];
        adr_0Array[0] = adr_0.cld;
        int n = anp_22.bDU();
        for (int i = 1; i < n; ++i) {
            adr_0Array[i - 1] = adq_0.b(anp_22.tj(i), anp_22.tj(i - 1));
        }
        adr_0Array[anp_22.bDU() - 1] = adr_0Array[anp_22.bDU() - 2];
        acy_2 acy_22 = new acy_2(0L);
        this.clX = 0;
        ArrayList<Object> arrayList = new ArrayList<int[]>();
        arrayList.add(anp_22.bDW());
        int n2 = anp_22.bDU();
        boolean bl3 = false;
        boolean bl4 = true;
        adr_0 adr_02 = adr_0Array[0];
        for (int i = 1; i < n2; ++i) {
            int[] nArray = anp_22.tj(i);
            adr_0 adr_03 = adr_0Array[i];
            arrayList.add(nArray);
            if (i == n2 - 1) {
                bl3 = true;
            } else if (adr_03 != adr_02) {
                bl3 = true;
            }
            if (bl3) {
                boolean bl5;
                boolean bl6 = adr_02 == adr_0.cli || adr_02 == adr_0.clh || adr_02 == adr_0.clg;
                boolean bl7 = bl5 = adr_02 == adr_0.clf;
                if ((bl6 || bl5) && this.clS.bwk()) {
                    f2 = n2 - 3 <= i ? (float)sm_0.bpt.bfX() : (float)sm_0.bps.bfX();
                }
                this.a(new anp_2(arrayList), acy_22, bl4, adr_02, f2);
                arrayList = new ArrayList();
                arrayList.add(nArray);
                bl4 = false;
                bl3 = false;
            }
            adr_02 = adr_03;
        }
        this.clN = acy_22;
        this.clO = new acp_1(this.bVz, this.bVA, this.bVB);
        this.clH = anp_22;
        this.clI = 0;
        if (cly) {
            this.clM.forEach((TIntProcedure)new adt_0(this));
            this.clM.clear();
        }
    }

    private void a(anp_2 anp_22, acy_2 acy_22, boolean bl, adr_0 adr_02, float f2) {
        Object object;
        float f3 = adr_02.aSa();
        if (f3 < 0.0f) {
            f3 = f2;
        }
        Object object2 = anp_22.f((int)f3, true);
        acp_1 acp_12 = new acp_1(this.bVz, this.bVA, this.bVB);
        if (bl && this.clN != null) {
            object = ((ArrayList)object2).get(0);
            ((acc_2)object).b(acp_12);
            ((acc_2)object).c(((acc_2)object).bzM().k(((acc_2)object).bzK()));
        }
        if (adr_02.bvq() && ((ArrayList)object2).size() > 1) {
            object = new ArrayList(((ArrayList)object2).size());
            Iterator<acc_2> iterator = ((ArrayList)object2).iterator();
            while (iterator.hasNext()) {
                acc_2 acc_22 = iterator.next();
                ((ArrayList)object).addAll(acc_22.Q(2.0));
            }
            object2 = object;
            acy_22.a(new acf_2((List<acc_2>)object2, this.clX));
        } else {
            int n = this.clS.bwj();
            if (n >= 0) {
                this.clS.a((adx_0)this, anp_22.tk(1));
            }
            acy_22.a(new acb_2((List<acc_2>)object2, this.clX + Math.max(0, n)));
        }
        float f4 = adr_02.bvr();
        if (f4 > 0.0f) {
            acy_22.a(new aci_2(acy_22.bzM(), (long)f4, this.clX));
        }
    }

    public void a(boolean bl, aea_0 aea_02) {
        aed_0 aed_02 = aeb_0.bwg().a(aea_02);
        this.a(aew_0.a(bl, this, aed_02, aed_02));
    }

    public void a(boolean bl, aea_0 aea_02, aea_0 aea_03) {
        aed_0 aed_02 = aeb_0.bwg().a(aea_02);
        aed_0 aed_03 = aeb_0.bwg().a(aea_03);
        this.a(aew_0.a(bl, this, aed_02, aed_03));
    }

    @Override
    public void e(float f2, float f3, float f4) {
        if (this.bvO().g(this)) {
            anp_2 anp_22;
            if (this.clH == null) {
                anp_22 = new anp_2(2);
                anp_22.a(0, (int)this.bVz, (int)this.bVA, (short)this.bVB);
                anp_22.a(1, (int)f2, (int)f3, (short)f4);
            } else {
                anp_22 = new anp_2(3);
                anp_22.a(0, (int)this.bVz, (int)this.bVA, (short)this.bVB);
                anp_22.a(1, this.clH.bDX());
                anp_22.a(2, (int)f2, (int)f3, (short)f4);
            }
            this.a(anp_22, true, false);
            return;
        }
        super.e(f2, f3, f4);
        this.bvB();
    }

    public void bvB() {
        this.clH = null;
        this.clI = -1;
        this.clJ = -1;
        this.clK = -1;
        this.clN = null;
        this.clB.clear();
        this.clR.i(this);
        this.clU = false;
        this.clV = false;
        this.clT = false;
        if (this.bvC()) {
            this.clS.a((adx_0)this, 0);
            this.clS.b(this);
        }
    }

    protected boolean bvC() {
        return this.clS != null && !this.buW();
    }

    @Override
    protected void a(int[] nArray, int[] nArray2) {
        int[] nArray3 = new int[]{nArray[0], nArray[1], nArray[2]};
        if (this.clH != null) {
            int n = this.clH.bDU();
            boolean bl = false;
            for (int i = 0; i < n; ++i) {
                int[] nArray4 = this.clH.tj(i);
                if (nArray4[0] != nArray[0] || nArray4[1] != nArray[1]) continue;
                nArray3[2] = nArray4[2];
                bl = true;
                break;
            }
            if (!bl) {
                return;
            }
        }
        if (this.ckw != null) {
            ady_0[] ady_0Array;
            for (ady_0 ady_02 : ady_0Array = this.ckw.toArray(new ady_0[this.ckw.size()])) {
                ady_02.cellPositionChanged(this, nArray3[0], nArray3[1], (short)nArray3[2]);
            }
        }
        if (this.buU() != null) {
            this.buU().a(nArray3, nArray2);
        }
    }

    @Override
    protected void reset() {
        super.reset();
        this.clB.clear();
        this.clC.clear();
        this.clH = null;
        this.clN = null;
    }

    @Override
    public boolean aA(float f2, float f3) {
        if (this.bvE()) {
            return this.d(f2, f3, 2.0f);
        }
        return super.aA(f2, f3);
    }

    @Override
    public aex bvD() {
        return this.clR;
    }

    @Override
    public void a(int n, short s) {
        super.a(n, s);
        adj_0 adj_02 = this.buU();
        if (adj_02 != null) {
            adj_02.a(n, s);
        }
    }

    public boolean bvE() {
        return this.clH != null;
    }

    public final anp_2 bvF() {
        return this.clH;
    }

    public ace_2 bvG() {
        return this.clN;
    }

    @Override
    public void bvH() {
        this.clR.j(this);
    }

    public int bvI() {
        if (this.clH != null) {
            return this.clH.tj(this.clI)[0];
        }
        return (int)this.bVz;
    }

    public int bvJ() {
        if (this.clH != null) {
            return this.clH.tj(this.clI)[1];
        }
        return (int)this.bVA;
    }

    public short bvK() {
        if (this.buW()) {
            return (short)this.buV().getAltitude();
        }
        if (this.clH != null) {
            return (short)this.clH.tj(this.clI)[2];
        }
        return (short)this.bVB;
    }

    @Override
    public String bvL() {
        return this.bpT();
    }

    @Override
    public int bvM() {
        return 5;
    }

    @Override
    public boolean bvN() {
        return false;
    }

    @Override
    public final aed_0 bvO() {
        return this.clS;
    }

    protected void rX(int n) {
        aed_0 aed_02 = this.clR.c(this, n);
        assert (aed_02 != null);
        this.clS = aed_02;
    }

    @Override
    public sm_0 bvP() {
        return sm_0.bps;
    }

    @Override
    public int bvQ() {
        return this.bvP().bfX();
    }

    @Override
    public sm_0 bvR() {
        return sm_0.bpt;
    }

    @Override
    public int bvS() {
        return this.bvR().bfX();
    }

    @Override
    public void ch(boolean bl) {
        this.clT = bl;
    }

    @Override
    public void a(aex aex2) {
        assert (this.clR != null);
        this.clR = aex2;
        anp_2 anp_22 = this.bvF();
        this.rX(anp_22 != null && anp_22.bDV() ? anp_22.bDU() : 0);
    }

    public void b(aex aex2) {
        this.clR = aex2;
        if (this.clS.bwe() == aea_0.cmn || this.clS.bwe() == aea_0.cmz) {
            this.clS = aex2.bws();
        } else if (this.clS.bwe() == aea_0.cmo || this.clS.bwe() == aea_0.cmy) {
            this.clS = aex2.bwt();
        } else {
            this.a(this.clR);
        }
    }

    @Override
    public boolean bvT() {
        return this.clT;
    }

    @Override
    public void ci(boolean bl) {
        this.clU = bl;
    }

    @Override
    public boolean bvU() {
        return this.clU;
    }

    @Override
    public void cj(boolean bl) {
        this.clV = bl;
    }

    @Override
    public boolean bvV() {
        return this.clV;
    }

    public boolean bvW() {
        return wa_0.k(this.bvI(), this.bvJ(), this.bvK());
    }

    public boolean bvX() {
        return this.clL;
    }

    public boolean bvY() {
        return false;
    }

    public void cq(float f2) {
        this.clW = f2;
    }

    public void ck(boolean bl) {
        this.clQ = bl;
    }
}


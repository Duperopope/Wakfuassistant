/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from adJ
 */
public abstract class adj_0
extends ZH {
    protected static final Logger ckv = Logger.getLogger(adj_0.class);
    protected final ArrayList<ady_0<ads_0>> ckw = new ArrayList(2);
    private adj_0 ckx;
    private adj_0 cky;
    private ArrayList<adj_0> ckz;
    private adj_0 ckA;
    private boolean ckB;
    private boolean ckC;
    private boolean ckD;
    private byte ckE;
    public static final byte ckF = 0;
    public static final byte ckG = 1;
    public static final byte ckH = 2;
    public static final int ckI = 500;
    private static final int ckJ = 1;
    private static final int ckK = 1;
    private int bsx = -1;

    public adj_0(long l) {
        super(l);
    }

    public adj_0(long l, float f2, float f3, float f4) {
        super(l, f2, f3, f4);
    }

    public adj_0(long l, float f2, float f3) {
        super(l, f2, f3);
    }

    public boolean buT() {
        return this.ckD;
    }

    @Override
    public void a(abi_1 abi_12) {
        if (abi_12 == null) {
            ckv.error((Object)"Unable to set a Direction8 to null", (Throwable)new Exception());
            return;
        }
        if (this.bmk == abi_12) {
            return;
        }
        int n = abi_12.dzy - this.bmk.dzy;
        this.bmk = abi_12;
        this.bWk = true;
        if (this.ckz != null) {
            int n2 = this.ckz.size();
            for (int i = 0; i < n2; ++i) {
                adj_0 adj_02 = this.ckz.get(i);
                if (!adj_02.ckC) continue;
                adj_02.a(this.bmk);
            }
        }
    }

    @Override
    public void e(float f2, float f3, float f4) {
        int n = this.bcC();
        int n2 = this.bcD();
        short s = this.bcE();
        super.e(f2, f3, f4);
        int n3 = this.bcC();
        int n4 = this.bcD();
        if (n3 != n || n4 != n2) {
            this.a(new int[]{this.bcC(), this.bcD(), Math.round(this.getAltitude())}, new int[]{n, n2, s});
        }
        if (this.ckx != null) {
            this.ckx.e(f2, f3, f4 + (float)this.aKu());
        }
        if (this.ckz != null) {
            int n5 = this.ckz.size();
            for (int i = 0; i < n5; ++i) {
                this.ckz.get(i).e(f2, f3, f4 + (float)this.aKu());
            }
        }
    }

    protected void a(adj_0 adj_02) {
        this.ckx = adj_02;
    }

    public adj_0 buU() {
        return this.ckx;
    }

    protected void b(adj_0 adj_02) {
        this.cky = adj_02;
    }

    public adj_0 buV() {
        return this.cky;
    }

    public boolean buW() {
        return this.cky != null;
    }

    public boolean buX() {
        return this.ckx != null;
    }

    public void c(adj_0 adj_02) {
        if (adj_02 == this || adj_02 == null) {
            return;
        }
        adj_02.b(this);
        this.a(adj_02);
        adj_02.bpC();
    }

    @Override
    public boolean dT(String string) {
        boolean bl = super.dT(string);
        if (bl && this.ckz != null) {
            int n = this.ckz.size();
            for (int i = 0; i < n; ++i) {
                adj_0 adj_02 = this.ckz.get(i);
                if (!adj_02.ckB) continue;
                adj_02.dT(string);
            }
        }
        return bl;
    }

    @Override
    public boolean c(aaj_0 aaj_02) {
        if (!super.c(aaj_02)) {
            return false;
        }
        if (this.cky != null) {
            Matrix44 matrix44 = this.cky.bqd().bHs();
            if (matrix44 == null) {
                return false;
            }
            this.a(aaj_02, matrix44, this.cky);
            this.bpq().cWM = this.cky.bpq().cWM + 1L;
            this.a(this.cky.bqh(), this.cky.bqi());
        } else if (this.ckA != null && this.ckA.bqd() != null) {
            Matrix44 matrix44 = this.ckA.bqd().bHt();
            this.a(aaj_02, matrix44, this.ckA);
        }
        return true;
    }

    public adj_0 buY() {
        if (this.ckx != null) {
            this.dU(null);
            this.ckx.b((adj_0)null);
            adj_0 adj_02 = this.ckx;
            this.a((adj_0)null);
            adj_02.bpC();
            return adj_02;
        }
        return null;
    }

    public adj_0 a(boolean bl, acd_1 acd_12) {
        if (this.ckx != null) {
            if (bl) {
                this.dU(null);
                this.q(acd_12);
            }
            this.ckx.b((adj_0)null);
            adj_0 adj_02 = this.ckx;
            this.a((adj_0)null);
            if (bl) {
                adj_02.bpC();
            }
            return adj_02;
        }
        return null;
    }

    private void q(acd_1 acd_12) {
        ahg ahg2 = new ahg(this.ckx);
        ahg2.d(new acp_1(acd_12.getX(), acd_12.getY(), acd_12.bdi()));
        ahg2.b(new acp_1(this.ckx.bcC(), this.ckx.bcD(), this.ckx.bcE() + this.aKu()));
        ahg2.fY(500L);
        ahg2.c(new acp_1(0.0f, 0.0f, 1.0f));
        ahg2.e(new acp_1(0.0f, 0.0f, 1.0f));
        ahl.bzR().b(ahg2);
    }

    public void d(adj_0 adj_02) {
        this.a(adj_02, false, false, true);
    }

    public void a(adj_0 adj_02, boolean bl, boolean bl2, boolean bl3) {
        assert (this.ckA == null) : "A mobile is already linked to this mobile";
        assert (adj_02 != null) : "You can't link a null mobile";
        if (this.ckz == null) {
            this.ckz = new ArrayList(1);
        }
        this.ckz.add(adj_02);
        adj_02.ckA = this;
        adj_02.ckB = bl;
        adj_02.ckD = bl2;
        adj_02.ckC = bl3;
        this.bpC();
        adj_02.bpC();
        adj_02.bve();
    }

    public final void buZ() {
        if (this.ckz == null) {
            return;
        }
        int n = this.ckz.size();
        for (int i = 0; i < n; ++i) {
            adj_0 adj_02 = this.ckz.get(i);
            adj_02.ckA = null;
            adj_02.bpC();
        }
        this.ckz.clear();
        this.ckz = null;
    }

    public final void e(adj_0 adj_02) {
        if (this.ckz == null) {
            return;
        }
        this.ckz.remove(adj_02);
        adj_02.ckA = null;
        adj_02.bpC();
    }

    public ArrayList<adj_0> bva() {
        return this.ckz;
    }

    public adj_0 bvb() {
        return this.ckA;
    }

    public final void a(ady_0<ads_0> ady_02) {
        if (ady_02 != null && !this.ckw.contains(ady_02)) {
            this.ckw.add(ady_02);
        }
    }

    public final boolean b(ady_0<ads_0> ady_02) {
        return this.ckw.contains(ady_02);
    }

    public final boolean c(ady_0<ads_0> ady_02) {
        return ady_02 != null && this.ckw.remove(ady_02);
    }

    public final void bvc() {
        this.ckw.clear();
    }

    protected void a(int[] nArray, int[] nArray2) {
        if (this.ckw != null) {
            ady_0[] ady_0Array;
            for (ady_0 ady_02 : ady_0Array = this.ckw.toArray(new ady_0[this.ckw.size()])) {
                ady_02.cellPositionChanged(this, nArray[0], nArray[1], (short)nArray[2]);
            }
        }
        if (this.buU() != null) {
            this.buU().a(nArray, nArray2);
        }
    }

    public void as(byte by) {
        this.ckE = by;
    }

    public byte bvd() {
        return this.ckE;
    }

    public void pu(int n) {
        this.bsx = n;
    }

    @Override
    public int bqo() {
        return this.bsx;
    }

    private void a(aaj_0 aaj_02, Matrix44 matrix44, adj_0 adj_02) {
        awo_1 awo_12 = new awo_1();
        Matrix44 matrix442 = awo_12.bIT();
        matrix442.c(matrix44);
        matrix442.d(adj_02.a(aaj_02));
        float f2 = adj_02.bqd().getScale();
        float[] fArray = matrix442.bQE();
        fArray[0] = fArray[0] / f2;
        fArray[5] = fArray[5] / f2;
        BatchTransformer batchTransformer = this.bpq().bIS();
        batchTransformer.b(0, awo_12);
        matrix442.bsI();
    }

    @Override
    public void p(float[] fArray) {
        if (this.ckA != null) {
            this.bve();
        } else {
            super.p(fArray);
            if (this.ckz != null) {
                int n = this.ckz.size();
                for (int i = 0; i < n; ++i) {
                    this.ckz.get(i).bve();
                }
            }
        }
    }

    protected void bve() {
        if (this.ckA == null) {
            return;
        }
        Material material = this.ckA.bpt();
        this.bVn.N(material.bKT());
        this.bpr().c(this.bVn);
    }

    public void f(adj_0 adj_02) {
        aro_1 aro_12 = this.bqd();
        if (aro_12 == null) {
            return;
        }
        aro_1 aro_13 = adj_02.bqd();
        if (aro_13 == null) {
            return;
        }
        aro_12.d(aro_13);
    }

    public void bvf() {
    }

    public void bvg() {
    }

    public boolean cf(boolean bl) {
        return false;
    }
}


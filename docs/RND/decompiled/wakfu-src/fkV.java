/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class fkV
extends fkx_0<fkz> {
    protected static final Logger sCQ = Logger.getLogger(fkV.class);
    @Nullable
    private fkw_0 sCR = null;
    @Nullable
    final TIntObjectHashMap<azm_1> sCS = new TIntObjectHashMap();
    private int sCT = 0;
    private final List<fkz> sCU = new ArrayList<fkz>();

    protected fkV(fjo_0 fjo_02) {
        super(fjo_02);
    }

    @Override
    public void gbf() {
    }

    void WR(int n) {
        if (this.sCT > 0) {
            return;
        }
        fkz[] fkzArray = new fkz[this.sCU.size()];
        this.sCU.toArray(fkzArray);
        for (int i = fkzArray.length - 1; i >= 0; --i) {
            fkzArray[i].a(n, this.ems());
        }
    }

    public void c(fkz fkz2) {
        if (fkz2 == null) {
            return;
        }
        this.sCU.add(fkz2);
    }

    public void d(fkz fkz2) {
        this.sCU.remove(fkz2);
    }

    public abstract void f(int var1, int[] var2);

    public abstract void Jk(int var1);

    public abstract void h(int var1, int[] var2);

    public abstract void g(int var1, int[] var2);

    void gcH() {
        ++this.sCT;
    }

    void gcI() {
        --this.sCT;
    }

    @Nullable
    public azm_1 WE(int n) {
        return (azm_1)this.sCS.get(n);
    }

    protected void j(int n, int[] nArray) {
        azm_1 azm_12 = this.WT(n);
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            azm_12.vL(nArray[i]);
        }
        this.gcJ();
        this.WR(n);
    }

    protected void k(int n, int[] nArray) {
        azm_1 azm_12 = this.WE(n);
        if (azm_12 == null) {
            return;
        }
        int n2 = nArray.length;
        int n3 = azm_12.aVo();
        block0: for (int i = n3 - 1; i >= 0; --i) {
            for (int j = 0; j < n2; ++j) {
                if (azm_12.vM(i) != nArray[j]) continue;
                azm_12.ux(i);
                continue block0;
            }
        }
        this.gcJ();
        this.WR(n);
    }

    protected void WS(int n) {
        azm_1 azm_12 = this.WE(n);
        if (azm_12 == null || azm_12.aVo() == 0) {
            return;
        }
        azm_12.clear();
        this.gcJ();
        this.WR(n);
    }

    protected void e(int n, int[] nArray) {
        if (nArray == null || nArray.length == 0) {
            this.WS(n);
            return;
        }
        azm_1 azm_12 = this.WT(n);
        if (this.a(nArray, azm_12)) {
            return;
        }
        azm_12.clear();
        int n2 = nArray.length;
        for (int i = 0; i < n2; ++i) {
            azm_12.vL(nArray[i]);
        }
        this.gcJ();
        this.WR(n);
    }

    boolean a(int[] nArray, @NotNull azm_1 azm_12) {
        if (azm_12.aVo() == 0) {
            return nArray == null || nArray.length == 0;
        }
        if (nArray == null || nArray.length != azm_12.aVo()) {
            return false;
        }
        boolean bl = true;
        for (int i = 0; i < azm_12.aVo(); ++i) {
            int n = azm_12.pF(i);
            boolean bl2 = false;
            for (int j = 0; j < nArray.length; ++j) {
                if (nArray[j] != n) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            bl = false;
            break;
        }
        return bl;
    }

    @NotNull
    protected azm_1 WT(int n) {
        azm_1 azm_12 = (azm_1)this.sCS.get(n);
        if (azm_12 != null) {
            return azm_12;
        }
        azm_12 = new azm_1();
        this.sCS.put(n, (Object)azm_12);
        return azm_12;
    }

    private void gcJ() {
        if (this.sCR != null) {
            this.sCR.gcK();
        }
    }

    @NotNull
    public fkl_0 gbl() {
        if (this.sCR == null) {
            this.sCR = new fkw_0(this);
        }
        return this.sCR;
    }

    @Override
    public /* synthetic */ void a(fkA fkA2) {
        this.d((fkz)fkA2);
    }

    @Override
    public /* synthetic */ void b(fkA fkA2) {
        this.c((fkz)fkA2);
    }
}


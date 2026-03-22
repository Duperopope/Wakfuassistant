/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public abstract class VW<P extends vx_0<P>> {
    protected static final boolean bLp = false;
    protected static final Logger bLq = Logger.getLogger(VW.class);
    protected P bLr;

    protected VW() {
    }

    protected abstract P a(int var1, int var2, int var3, int var4, boolean var5);

    private P aB(int n, int n2) {
        return this.a(n, n2, 18, 18, false);
    }

    private P aC(int n, int n2) {
        return this.a(n, n2, 18, 18, true);
    }

    public void aD(int n, int n2) {
        int n3 = vz_0.qd(n);
        int n4 = vz_0.qe(n2);
        P p2 = this.aC(n3, n4);
        ((vx_0)p2).a(4, p2);
        this.a((vx_0<P>)p2, n3, n4);
        this.bLr = p2;
        bLq.info((Object)(this.getClass().getSimpleName() + " initialis\u00e9, centr\u00e9 sur " + String.valueOf(this.bLr)));
    }

    private void a(vx_0<P> vx_02, int n, int n2) {
        vx_02.a(7, this.aB(n, n2 + 1));
        vx_02.a(6, this.aB(n - 1, n2 + 1));
        vx_02.a(8, this.aB(n + 1, n2 + 1));
        vx_02.a(3, this.aB(n - 1, n2));
        vx_02.a(5, this.aB(n + 1, n2));
        vx_02.a(1, this.aB(n, n2 - 1));
        vx_02.a(0, this.aB(n - 1, n2 - 1));
        vx_02.a(2, this.aB(n + 1, n2 - 1));
    }

    public boolean blc() {
        return this.bLr != null;
    }

    public final List<P> bld() {
        if (this.bLr != null) {
            return ((vx_0)this.bLr).blf();
        }
        return null;
    }

    public void clear() {
    }

    public final P aE(int n, int n2) {
        assert (this.bLr != null);
        for (vx_0 vx_02 : this.bLr.blg()) {
            if (vx_02 == null || vx_02.getX() != n || vx_02.getY() != n2) continue;
            return (P)vx_02;
        }
        return null;
    }

    public final P aF(int n, int n2) {
        assert (this.bLr != null);
        for (vx_0 vx_02 : this.bLr.blg()) {
            if (vx_02 == null || !vx_02.aG(n, n2)) continue;
            return (P)vx_02;
        }
        return null;
    }

    public final P ble() {
        return (P)((vx_0)this.bLr).qc(4);
    }
}


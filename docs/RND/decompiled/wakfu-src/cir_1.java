/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cIr
 */
public abstract class cir_1
implements cpg_1 {
    private static final Logger ndJ = Logger.getLogger(cir_1.class);
    protected cie_1 nae;
    protected ciy_1 kWd;
    private final cis_1 ndK;

    protected cir_1(cis_1 cis_12) {
        this.ndK = cis_12;
    }

    protected cir_1() {
        this(new cis_1(false, false));
    }

    @Override
    public final void b(cie_1 cie_12) {
        this.nae = cie_12;
        cie_12.a(this.ndK);
    }

    protected abstract void ey(int var1, int var2);

    @Override
    public final boolean eB(int n, int n2) {
        this.nae.eLa();
        if (!this.eD(n, n2)) {
            return false;
        }
        this.ey(n, n2);
        if (this.kWd != null) {
            ArrayList<fsX> arrayList = this.kWd.eLh();
            for (fsX fsX2 : arrayList) {
                if (fsX2.glC() != fsY.teK) continue;
                this.nae.f(fsX2.eLi());
            }
        }
        return this.kWd != null && !this.kWd.eLg();
    }

    @Override
    public void eC(int n, int n2) {
        if (!this.eB(n, n2)) {
            this.clear();
            return;
        }
        this.kWd.b(this.nae.getWorkingHavenWorld());
        aaw_1.bUq().h(new dbb_0(this.kWd));
        this.kWd = null;
        this.eLd();
    }

    protected void eLd() {
    }

    private boolean eD(int n, int n2) {
        acc_1 acc_12 = this.nae.getPatchCoordFromMouse(n, n2);
        return this.nae.getWorkingHavenWorld().gs(acc_12.bWx(), acc_12.bWy());
    }

    @Override
    public void clear() {
        if (this.kWd != null) {
            this.kWd.g(this.nae);
            this.nae.a(this.ndK);
            this.kWd = null;
        }
    }

    @Override
    public abstract fsc_0 eLc();
}


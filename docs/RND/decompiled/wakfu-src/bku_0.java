/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from bkU
 */
public final class bku_0 {
    protected static final Logger isk = Logger.getLogger(bku_0.class);
    private final ArrayList<ftQ> isl = new ArrayList();
    private final ArrayList<bkw_0> ism = new ArrayList(1);
    private long dxy;

    public final void a(bkw_0 bkw_02) {
        this.ism.add(bkw_02);
    }

    public final void b(bkw_0 bkw_02) {
        this.ism.remove(bkw_02);
    }

    public final void a(ftQ ftQ2) {
        this.isl.add(ftQ2);
        if (!ftQ2.gmH().gmF()) {
            this.dta();
        }
    }

    public final void b(ftQ ftQ2) {
        this.isl.remove(ftQ2);
        if (!this.dsZ()) {
            this.dtb();
        }
    }

    public final void dsX() {
        this.isl.clear();
        this.dtb();
    }

    public final Collection<ftQ> dsY() {
        return this.isl;
    }

    private boolean dsZ() {
        int n = this.isl.size();
        for (int i = 0; i < n; ++i) {
            ftQ ftQ2 = this.isl.get(i);
            if (ftQ2.gmH().gmF()) continue;
            return true;
        }
        return false;
    }

    private void dta() {
        if (this.dxy == 0L) {
            this.dxy = abb_2.bUA().a(new bkv_0(this), 1000L, 1);
            this.dtc();
        }
    }

    private void dtb() {
        if (this.dxy != 0L) {
            abb_2.bUA().hk(this.dxy);
            this.dxy = 0L;
            this.dtc();
        }
    }

    void dtc() {
        int n = this.ism.size();
        for (int i = 0; i < n; ++i) {
            bkw_0 bkw_02 = this.ism.get(i);
            bkw_02.onTick();
        }
    }
}


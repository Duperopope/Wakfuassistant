/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public abstract class foP
implements qe_0 {
    protected static final Logger sMt = Logger.getLogger(foP.class);
    private int o;
    private fjo_0 sMu;
    private fjo_0 sMv;
    private foM sMw;
    private final ArrayList<fpa> sMx = new ArrayList();

    protected foP(int n) {
        this.o = n;
        this.sMu = null;
        this.sMv = null;
    }

    protected void lK(int n) {
        this.o = n;
    }

    public int d() {
        return this.o;
    }

    @Override
    public long aZx() {
        return this.o;
    }

    @Override
    public qa_0 aZy() {
        return emh_0.qMT;
    }

    public void a(fpa fpa2) {
        if (!this.sMx.contains(fpa2)) {
            this.sMx.add(fpa2);
        }
    }

    public void b(fpa fpa2) {
        this.sMx.remove(fpa2);
    }

    public fjo_0 gfQ() {
        return this.sMu;
    }

    public void r(fjo_0 fjo_02) {
        this.sMu = fjo_02;
        if (this.sMv == null) {
            this.s(this.sMu);
        }
    }

    public fjo_0 gfR() {
        return this.sMv;
    }

    public void s(fjo_0 fjo_02) {
        fjo_0 fjo_03 = this.sMv;
        this.sMv = fjo_02;
        for (int i = 0; i < this.sMx.size(); ++i) {
            this.sMx.get(i).a(this, fjo_02);
        }
        this.b(fjo_02, fjo_03);
    }

    protected void b(fjo_0 fjo_02, fjo_0 fjo_03) {
    }

    public foM gfS() {
        return this.sMw;
    }

    @Nullable
    public foI eaJ() {
        return null;
    }

    public void d(foM foM2) {
        if (this.sMw != null) {
            this.sMw.f(null);
        }
        this.sMw = foM2;
        if (this.sMw != null) {
            this.sMw.f(this);
        }
    }

    public String toString() {
        return "Protector {id=" + this.o + ", nativeNation=" + (this.sMu != null ? Integer.valueOf(this.sMu.Xt()) : null) + ", currentNation=" + (this.sMv != null ? Integer.valueOf(this.sMv.Xt()) : null) + ", territory=" + (this.sMw != null ? Integer.valueOf(this.sMw.d()) : null) + "}";
    }

    public int gfT() {
        if (this.sMv == null) {
            return -1;
        }
        return this.sMv.Xt();
    }

    public int gfU() {
        if (this.sMu == null) {
            return -1;
        }
        return this.sMu.Xt();
    }

    public abstract fpb eaF();

    public boolean dpu() {
        return this.gfT() != 0;
    }

    public long aqZ() {
        return this.sMw.aqZ();
    }
}


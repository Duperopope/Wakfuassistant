/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fIq
 */
public class fiq_1
implements ayx_2,
ayz_2 {
    private static final Logger uAZ = Logger.getLogger(fiq_1.class);
    private static final ObjectPool uBa = new ayv_2(new fir_1());
    protected ObjectPool uth;
    protected boolean uBb = false;
    protected fzq_0 uBc = null;
    protected boolean uBd = false;
    protected fhv_1 uBe;
    protected fhv_1 uBf;
    @Nullable
    protected fiq_1 uBg;
    protected final ArrayList<fhv_1> uBh = new ArrayList();

    public void v(fhv_1 fhv_12) {
        this.uBh.add(fhv_12);
    }

    public fhv_1 gBA() {
        int n = this.uBh.size();
        return n > 0 ? this.uBh.remove(n - 1) : null;
    }

    public boolean gBB() {
        return !this.uBh.isEmpty();
    }

    public boolean gBC() {
        return this.uBb;
    }

    public void oY(boolean bl) {
        this.uBb = bl;
    }

    public <T extends fhv_1> T gBD() {
        return (T)this.uBf;
    }

    public void w(fhv_1 fhv_12) {
        this.uBf = fhv_12;
    }

    public <T extends fhv_1> T gBE() {
        return (T)this.uBe;
    }

    public void x(fhv_1 fhv_12) {
        this.uBe = fhv_12;
    }

    public fzq_0 gBy() {
        return this.uBc;
    }

    public void b(fzq_0 fzq_02) {
        this.uBc = fzq_02;
    }

    public boolean gBF() {
        return this.uBd;
    }

    public void oZ(boolean bl) {
        this.uBd = bl;
    }

    @Nullable
    public fiq_1 gBG() {
        return this.uBg;
    }

    public void P(@Nullable fiq_1 fiq_12) {
        this.uBg = fiq_12;
    }

    public static fiq_1 gBH() {
        fiq_1 fiq_12;
        try {
            fiq_12 = (fiq_1)uBa.borrowObject();
            fiq_12.uth = uBa;
        }
        catch (Exception exception) {
            uAZ.error((Object)"Probl\u00e8me au borrowObject.");
            fiq_12 = new fiq_1();
            fiq_12.aVI();
        }
        return fiq_12;
    }

    @Override
    public void aZp() {
        if (this.uth == null) {
            this.aVH();
            return;
        }
        try {
            this.uth.returnObject((Object)this);
        }
        catch (Exception exception) {
            this.aVH();
        }
    }

    @Override
    public void aVH() {
        this.uBe = null;
        this.uBf = null;
        this.uBh.clear();
        this.uth = null;
        this.uBg = null;
    }

    @Override
    public void aVI() {
        this.uBd = false;
        this.uBb = false;
    }

    public String toString() {
        return "Event type=" + String.valueOf((Object)this.gBy());
    }
}


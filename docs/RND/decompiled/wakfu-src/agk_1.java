/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.openal.ALCcontext
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.jogamp.openal.ALCcontext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from aGK
 */
public abstract class agk_1
implements agc_1 {
    private static final boolean dMk = false;
    protected static final Logger dMl = Logger.getLogger(agk_1.class);
    private byte dMm = 0;
    private byte dMn = 0;
    private float dMo = 1.0f;
    private float cCH = 1.0f;
    private float czn = 1.0f;
    private float cnK = 1.0f;
    private float dMp;
    private float dLN;
    private boolean dMq = false;
    private boolean dMr = false;
    private final String dMs;
    protected agm_1 dMt;
    protected ahu_1 dMu;
    protected ahg_2 dMv;
    protected int dMw = 0;
    protected byte dMx = 0;
    private boolean cHn = true;
    private final ArrayList<agl_1> dMy = new ArrayList();
    private final ArrayList<agl_1> dMz = new ArrayList();
    private final ArrayList<agl_1> dMA = new ArrayList();
    private final byte dMB;

    protected agk_1(String string) {
        this(string, -1);
    }

    protected agk_1(String string, byte by) {
        this(string, 0, by);
    }

    protected agk_1(String string, byte by, byte by2) {
        this.dMs = string;
        this.dMt = null;
        this.dMp = 0.0f;
        this.dMx = by;
        this.dMB = by2;
    }

    public boolean xY(int n) {
        if (n > this.dMm - this.dMn) {
            return false;
        }
        this.dMn = (byte)(this.dMn + n);
        return true;
    }

    public boolean xZ(int n) {
        if (this.dMn < n) {
            return false;
        }
        this.dMn = (byte)(this.dMn - n);
        return true;
    }

    public void a(agl_1 agl_12) {
        this.dMz.add(agl_12);
    }

    public void b(agl_1 agl_12) {
        this.dMA.add(agl_12);
    }

    public byte cbD() {
        return this.dMm;
    }

    public boolean aM(byte by) {
        assert (by >= 0) : "Nombre de voix invalide";
        if (by == this.dMm) {
            return false;
        }
        if (by > this.dMm ? !this.dMu.xY(by - this.dMm) : !this.dMu.xZ(this.dMm - by)) {
            return false;
        }
        this.dMm = by;
        return true;
    }

    public byte cbE() {
        return this.dMB;
    }

    public byte cbF() {
        return this.dMx;
    }

    public void aN(byte by) {
        this.dMx = by;
    }

    public boolean isEnabled() {
        return this.cHn;
    }

    public void setEnabled(boolean bl) {
        this.cHn = bl;
    }

    public agm_1 cbG() {
        return this.dMt;
    }

    public void a(agm_1 agm_12) {
        this.dMt = agm_12;
    }

    public void b(ahu_1 ahu_12) {
        this.dMu = ahu_12;
    }

    public ahu_1 cbH() {
        return this.dMu;
    }

    public final void a(ahg_2 ahg_22) {
        this.dMv = ahg_22;
    }

    public final ahg_2 cbI() {
        assert (this.dMv != null) : "Il faut d'abord initialiser en  appelant setHelper";
        return this.dMv;
    }

    public float bBA() {
        return this.cCH;
    }

    public void dM(float f2) {
        this.cCH = f2;
        this.dR(this.cCH);
    }

    public float cbJ() {
        return this.dMo;
    }

    public void dN(float f2) {
        this.dMo = f2;
        this.dM(this.dMo);
    }

    public void dO(float f2) {
        this.dM(this.dMo * f2);
    }

    public float cbK() {
        return this.cCH / this.dMo;
    }

    @Override
    public final float bBt() {
        return this.czn * this.cCH;
    }

    public final float cbL() {
        return this.czn;
    }

    public final void dP(float f2) {
        if (this.czn != f2) {
            float f3 = this.czn;
            this.czn = f2;
            this.bs(f3, this.czn);
            this.dR(this.bBA());
        }
    }

    public final void dQ(float f2) {
        if (this.cnK != f2) {
            this.bt(this.cnK, f2);
            this.dR(this.bBA());
            this.cnK = f2;
        }
    }

    public final float cbM() {
        return this.cnK;
    }

    public final boolean cbN() {
        return this.dMq;
    }

    public final void dO(boolean bl) {
        this.g(this.dMq, bl);
        this.dMq = bl;
    }

    public boolean cbO() {
        return this.cHn && (!this.dMq || this.dMr);
    }

    public boolean a(ahp_1 ahp_12) {
        return this.a(ahp_12, null);
    }

    public boolean a(ahp_1 ahp_12, @Nullable List<ahp_1> list) {
        long l;
        long l2;
        if (!this.cbO()) {
            return false;
        }
        if (!ahp_12.cdd()) {
            return true;
        }
        Predicate<ahm_1> predicate = ahm_12 -> ahm_12.aYj() == ahp_12.aYj();
        if (list != null) {
            l2 = list.stream().filter(predicate).count();
            if (l2 >= (long)ahp_12.cde()) {
                return false;
            }
        } else {
            l2 = 0L;
        }
        return (l = this.cbQ().stream().filter(predicate).count()) + l2 < (long)ahp_12.cde();
    }

    public boolean cbP() {
        return this.dMr;
    }

    public void dP(boolean bl) {
        this.dMr = bl;
    }

    public String getName() {
        return this.dMs;
    }

    public abstract Collection<ahk_1> cbQ();

    public abstract ahk_1 a(ahz_1 var1, boolean var2, boolean var3, boolean var4, long var5, long var7);

    @Nullable
    public ahk_1 a(long l, boolean bl, boolean bl2, boolean bl3, long l2) {
        if (this.dMv != null && this.cbO()) {
            ahz_1 ahz_12;
            try {
                ahz_12 = this.dMv.hE(l);
            }
            catch (IOException iOException) {
                dMl.error((Object)("Impossible de charger le son d'id " + l));
                return null;
            }
            if (ahz_12 == null) {
                dMl.error((Object)("Impossible de charger le son d'id " + l));
                return null;
            }
            return this.a(ahz_12, bl, bl2, bl3, l, l2);
        }
        return null;
    }

    public abstract void a(ahk_1 var1);

    public abstract void bs(float var1, float var2);

    public abstract void dR(float var1);

    public abstract void bt(float var1, float var2);

    public abstract void g(boolean var1, boolean var2);

    @Nullable
    public ahk_1 k(long l, long l2) {
        ahz_1 ahz_12;
        try {
            ahz_12 = this.dMv.hE(l);
        }
        catch (IOException iOException) {
            dMl.error((Object)("Impossible de pr\u00e9parer le son d'id " + l), (Throwable)iOException);
            return null;
        }
        if (ahz_12 == null) {
            dMl.error((Object)("Impossible de pr\u00e9parer le son d'id " + l));
            return null;
        }
        return this.a(ahz_12, l, l2);
    }

    @Nullable
    public ahk_1 a(ahz_1 ahz_12, long l, long l2) {
        if (this.cbO()) {
            return this.dMu.a(ahz_12, this, l, l2);
        }
        return null;
    }

    public abstract void cbR();

    public void hD(long l) {
        int n;
        for (n = this.dMz.size() - 1; n >= 0; --n) {
            this.dMy.add(this.dMz.remove(n));
        }
        for (n = this.dMA.size() - 1; n >= 0; --n) {
            this.dMy.remove(this.dMA.remove(n));
        }
        int n2 = this.dMy.size();
        for (n = 0; n < n2; ++n) {
            this.dMy.get(n).a(this, l);
        }
        float f2 = 0.0f;
        if (this.dMp > 0.0f) {
            f2 = Math.min(this.dLN, this.czn + this.dMp);
        } else if (this.dMp < 0.0f) {
            f2 = Math.max(this.dLN, this.czn + this.dMp);
        } else {
            return;
        }
        if (f2 == this.dLN) {
            this.dMp = 0.0f;
            this.dLN = 0.0f;
        }
        this.dP(f2);
    }

    @Override
    public void br(float f2, float f3) {
        if (f3 > 0.0f) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > this.cbM()) {
                this.dQ(f2);
            }
            this.dLN = f2;
            this.dMp = (f2 - this.bBt()) * 10.0f / f3;
        }
    }

    public abstract void bhk();

    public abstract void b(ahk_1 var1);

    public void bVm() {
    }

    public void cbS() {
    }

    public boolean ya(int n) {
        if (this.dMw == n) {
            return false;
        }
        this.dMw = n;
        return true;
    }

    public void a(@Nullable ALCcontext aLCcontext) {
        this.dMw = 0;
    }
}


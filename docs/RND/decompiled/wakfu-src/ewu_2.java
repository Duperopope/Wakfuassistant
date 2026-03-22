/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWu
 */
public class ewu_2
implements aao_2 {
    private final azb_2 rBC;
    private ewq_2 rBD;
    private final abb_2 rBE;
    private Long rBF;
    private long rBG;

    public ewu_2(azb_2 azb_22, abb_2 abb_22) {
        this.rBC = azb_22;
        this.rBE = abb_22;
    }

    public void Y(long l, int n) {
        this.fOc();
        this.rBF = this.rBE.a(this, l, n, 1L);
        this.rBG = this.rBC.bjZ() + l;
    }

    private void fOc() {
        if (this.rBF != null) {
            this.rBE.hk(this.rBF);
        }
        this.rBF = null;
    }

    public boolean dHi() {
        return this.rBF != null;
    }

    public void dHh() {
        this.fOc();
    }

    public int fOd() {
        return Math.max(0, (int)(this.eyT() / 1000L));
    }

    public long eyT() {
        return this.rBG - this.rBC.bjZ();
    }

    public void a(ewq_2 ewq_22) {
        this.rBD = ewq_22;
    }

    @Override
    public boolean b(@Nullable aam_2 aam_22) {
        if (!(aam_22 instanceof aba_2)) {
            return true;
        }
        ewq_2 ewq_22 = this.rBD.dHg();
        if (ewq_22 == null) {
            this.rBE.b(this);
            return true;
        }
        return this.a((aba_2)aam_22, ewq_22);
    }

    private boolean a(@NotNull aba_2 aba_22, ewq_2 ewq_22) {
        if (this.rBF != null && this.rBF.longValue() == aba_22.bUx()) {
            this.rBF = null;
            ewq_22.Fs(aba_22.bUy());
        }
        return false;
    }

    @Override
    public final long Sn() {
        return 1L;
    }

    @Override
    public final void dC(long l) {
    }
}


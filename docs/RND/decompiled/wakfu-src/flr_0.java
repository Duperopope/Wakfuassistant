/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from flr
 */
public abstract class flr_0
implements fjn_0 {
    protected static final Logger sEg = Logger.getLogger(flr_0.class);
    private fjo_0 laU;
    private final EnumSet<fkK> sEh = EnumSet.noneOf(fkK.class);
    private final uw_0 sEi = uw_0.bju();
    private fng_0 sEj = fng_0.sHX;
    private fpp_0 sEk = fpp_0.sNV;
    private long sEl;
    protected final fjm sEm;

    protected flr_0(fjm fjm2) {
        this.sEm = fjm2;
    }

    @Override
    public long gaS() {
        return this.sEm.Sn();
    }

    @Override
    public void a(fjn_0 fjn_02) {
        this.h(fjn_02.ems());
        this.b(fjn_02.emF());
        this.z(fjn_02.gba());
        this.Z(fjn_02.gaT());
        this.sEj = fjn_02.gaZ();
        this.sEk = fjn_02.gbb();
        this.sEl = fjn_02.gbc();
    }

    @Override
    public void h(@NotNull fjo_0 fjo_02) {
        this.laU = fjo_02;
        Object t = fcL.rUh.sw(this.sEm.Sn());
        if (t != null && ((exP)t).ffF().Xt() != fjo_02.Xt()) {
            ((exP)t).ffF().h(fjo_02);
        }
    }

    @Override
    @NotNull
    public fjo_0 ems() {
        return this.laU;
    }

    @Override
    public int Xt() {
        return this.laU.Xt();
    }

    @Override
    public ux_0 gaT() {
        if (this.laU == fjo_0.sys) {
            return uw_0.bvJ;
        }
        if (this.sEi != null) {
            return this.sEi;
        }
        return uw_0.bvJ;
    }

    @Override
    public void Z(@NotNull ux_0 ux_02) {
        if (this.laU == fjo_0.sys) {
            return;
        }
        this.sEi.f(ux_02);
    }

    @Override
    public boolean elm() {
        fof_0 fof_02 = (fof_0)evx_2.feo().a(this.sEm.Xi(), eva_1.owH).orElse(new fof_0());
        if (fof_02.gfG()) {
            return true;
        }
        return this.laU != fjo_0.sys && this.sEi != null && !this.sEi.bjv() && this.laU.eCK().g(this.sEi);
    }

    @Override
    public boolean gaU() {
        return this.laU.gbx() && !this.elm();
    }

    @Override
    public boolean els() {
        return this.laU.tQ(this.gaS());
    }

    @Override
    public fkw gaV() {
        return this.laU.tR(this.gaS());
    }

    @Override
    public boolean b(fkK fkK2) {
        return this.sEh.add(fkK2);
    }

    @Override
    public boolean c(fkK fkK2) {
        return this.sEh.remove((Object)fkK2);
    }

    @Override
    public boolean a(fkK fkK2) {
        return this.sEh.contains((Object)fkK2);
    }

    @Override
    public EnumSet<fkK> gba() {
        return this.sEh;
    }

    @Override
    public void z(Collection<fkK> collection) {
        this.sEh.clear();
        this.sEh.addAll(collection);
    }

    @Override
    public fng_0 gaZ() {
        return this.sEj;
    }

    @Override
    public void a(fng_0 fng_02) {
        this.sEj = fng_02;
    }

    @Override
    public void reset() {
        this.i(fjo_0.sys);
    }

    @Override
    public void i(@NotNull fjo_0 fjo_02) {
        this.h(fjo_02);
        this.b((fkL)null);
        this.z(Collections.emptySet());
        this.Z(uw_0.bvJ);
        this.sEj = fng_0.sHX;
        this.sEl = 0L;
    }

    @Override
    public int WA(int n) {
        return 0;
    }

    @Override
    public void Jo(int n) {
        throw new UnsupportedOperationException("Impossible de lancer une purgation de peine : \u00e0 impl\u00e9menter autre part");
    }

    public void eln() {
        throw new UnsupportedOperationException("Impossible de stopper une purgation de peine : \u00e0 impl\u00e9menter autre part");
    }

    public int gdd() {
        throw new UnsupportedOperationException("Pas de purgation ici : \u00e0 impl\u00e9menter autre part");
    }

    public int gde() {
        throw new UnsupportedOperationException("Pas de purgation ici : \u00e0 impl\u00e9menter autre part");
    }

    public int WU(int n) {
        throw new UnsupportedOperationException("Pas de purgation ici : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean gaW() {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean WB(int n) {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean gaX() {
        throw new UnsupportedOperationException("Impossible de savoir si on est hors la loi de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean WC(int n) {
        throw new UnsupportedOperationException("Impossible de savoir si on est hors la loi de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public void iv(boolean bl) {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public boolean gaY() {
        throw new UnsupportedOperationException("Impossible de Savoir si on est enemy de la nation : \u00e0 impl\u00e9menter autre part");
    }

    @Override
    public fpp_0 gbb() {
        return this.sEk;
    }

    @Override
    public void b(fpp_0 fpp_02) {
        this.sEk = fpp_02;
    }

    @Override
    public void tO(long l) {
        this.sEl = l;
    }

    @Override
    public long gbc() {
        return this.sEl;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fnR
 */
public class fnr_0
implements fnl_0 {
    public static final int sKz = 3;
    private final List<fns_0> sKA = new ArrayList<fns_0>();
    private fov_0 sKB;
    @Nullable
    private String p;
    private int sKC;
    private int epe;
    private int asC;
    private int sKD;
    private final uw_0 sKE = new uw_0(null);
    private final uw_0 sKF = new uw_0(null);
    private int sKG;
    private final uw_0 sKH = new uw_0(null);

    public void h(fov_0 fov_02) {
        this.sKB = fov_02;
        this.sKC = fov_02.gfD();
        this.epe = fov_02.agM();
        ux_0 ux_02 = ue_0.bjV().bjc();
        this.sKE.f(ux_02);
        this.sKF.f(ux_02);
    }

    @Override
    public fov_0 geL() {
        return this.sKB;
    }

    @Override
    @Nullable
    public String getName() {
        return this.p;
    }

    @Override
    public int agM() {
        return this.epe;
    }

    @Override
    public int agI() {
        return this.sKC;
    }

    @Override
    public fow_0 geM() {
        if (foy_0.sLJ.XS(this.sKD)) {
            Optional<fov_0> optional = foy_0.sLJ.XT(this.sKD);
            return optional.map(fov_02 -> fov_02.XK(this.sKC) ? fov_02.XN(this.sKC) : fov_02.XN(fov_02.gfD())).orElse(null);
        }
        if (foC.sLW.XI(this.sKD)) {
            foA foA2 = foC.sLW.aF(this.sKD);
            if (foA2 == null) {
                return null;
            }
            int n = foA2.ctm();
            fov_0 fov_03 = foy_0.sLJ.XQ(n);
            if (fov_03 == null) {
                return null;
            }
            if (fov_03.XK(this.sKC)) {
                return fov_03.XN(this.sKC);
            }
            return fov_03.XN(fov_03.gfD());
        }
        if (this.sKB.XK(this.sKC)) {
            return this.sKB.XN(this.sKC);
        }
        return this.sKB.XN(this.sKB.gfD());
    }

    @Override
    public int agK() {
        return this.sKD;
    }

    @Override
    public int agN() {
        return this.asC;
    }

    @Override
    public short cmL() {
        return GC.cu(this.asC / this.sKB.csH());
    }

    @Override
    public short aVe() {
        return this.sKB.aVe();
    }

    @Override
    public ux_0 geN() {
        return this.sKE;
    }

    public uw_0 geX() {
        return this.sKF;
    }

    @Override
    public int agT() {
        return this.sKG;
    }

    @Override
    public ux_0 geP() {
        return this.sKH;
    }

    @Override
    public boolean geQ() {
        return !this.sKH.bjv() && this.sKG > 0;
    }

    @Override
    public boolean apo() {
        return this.epe > 0 && !this.geQ();
    }

    public void setName(@Nullable String string) {
        this.p = string;
        this.fxA();
    }

    public void Xx(int n) {
        this.epe = GC.a(n, 0, this.sKB.agM());
        this.gfa();
    }

    public void Xy(int n) {
        if (n == this.sKC) {
            return;
        }
        this.sKC = n;
        this.geY();
    }

    public void Xz(int n) {
        if (n == this.sKD) {
            return;
        }
        this.sKD = n;
        this.geZ();
    }

    public void lQ(int n) {
        this.asC = Math.min(Math.max(0, n), this.sKB.csH() * this.sKB.aVe());
        this.gfb();
    }

    public void ac(ux_0 ux_02) {
        this.sKE.f(ux_02);
        this.gfc();
    }

    public void ad(ux_0 ux_02) {
        this.sKF.f(ux_02);
        this.gfd();
    }

    public void af(ux_0 ux_02) {
        this.sKH.f(ux_02);
        this.gfe();
    }

    public void Xw(int n) {
        this.sKG = n;
        this.gff();
    }

    private void fxA() {
        this.sKA.forEach(fns_02 -> fns_02.mx(this.p));
    }

    private void geY() {
        this.sKA.forEach(fns_02 -> fns_02.Hk(this.sKC));
    }

    private void geZ() {
        this.sKA.forEach(fns_02 -> fns_02.Hl(this.sKD));
    }

    private void gfa() {
        this.sKA.forEach(fns_02 -> fns_02.Hm(this.epe));
    }

    private void gfb() {
        this.sKA.forEach(fns_02 -> fns_02.Hn(this.asC));
    }

    private void gfc() {
        this.sKA.forEach(fns_02 -> fns_02.I(this.sKE));
    }

    private void gfd() {
        this.sKA.forEach(fns_02 -> fns_02.J(this.sKF));
    }

    private void gfe() {
        this.sKA.forEach(fns_02 -> fns_02.K(this.sKH));
    }

    private void gff() {
        this.sKA.forEach(fns_02 -> fns_02.Ho(this.sKG));
    }

    @Override
    public final boolean a(fns_0 fns_02) {
        return !this.sKA.contains(fns_02) && this.sKA.add(fns_02);
    }

    @Override
    public final boolean b(fns_0 fns_02) {
        return this.sKA.remove(fns_02);
    }

    public boolean c(wg_2 wg_22) {
        wg_22.WB = this.sKB.d();
        wg_22.ahS = this.sKC;
        wg_22.WD = this.sKD;
        wg_22.WF = this.epe;
        wg_22.ahU = this.sKE.bjB();
        wg_22.ahV = this.sKF.bjB();
        wg_22.WE = this.sKG;
        wg_22.ahW = this.sKH.bjB();
        wg_22.Vk = this.p;
        wg_22.ahT = this.asC;
        return true;
    }

    public boolean d(wg_2 wg_22) {
        this.sKB = foy_0.sLJ.XP(wg_22.WB);
        this.Xy(wg_22.ahS);
        this.Xz(wg_22.WD);
        this.Xx(wg_22.WF);
        this.ac(uw_0.fn(wg_22.ahU));
        this.ad(uw_0.fn(wg_22.ahV));
        this.Xw(wg_22.WE);
        this.af(uw_0.fn(wg_22.ahW));
        this.setName(wg_22.Vk);
        this.lQ(wg_22.ahT);
        return true;
    }

    public String toString() {
        return "pet(m_listeners=" + this.sKA.size() + ", m_definition=" + String.valueOf(this.sKB) + ", m_name='" + this.p + "', m_colorItemRefId=" + this.sKC + ", m_health=" + this.epe + ", m_xp=" + this.asC + ", m_equippedRefItemId=" + this.sKD + ", m_lastMealDate=" + String.valueOf(this.sKE) + ", m_lastHungryDate=" + String.valueOf(this.sKF) + ", m_sleepRefItemId=" + this.sKG + ", m_sleepDate=" + String.valueOf(this.sKH) + ")";
    }

    @Override
    public String beT() {
        return "pet(m_name='" + this.p + "', m_colorItemRefId=" + this.sKC + ", m_health=" + this.epe + ", m_xp=" + this.asC + ", m_equippedRefItemId=" + this.sKD + ")";
    }

    @Override
    public /* synthetic */ ux_0 geO() {
        return this.geX();
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.d((wg_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.c((wg_2)object);
    }
}


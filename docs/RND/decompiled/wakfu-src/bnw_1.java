/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNw
 */
public class bnw_1
extends bnx_1 {
    public static final String kCw = "mobile";
    private bjk_0 kCx;

    public bnw_1() {
    }

    public bnw_1(bgt_0 bgt_02) {
        super(bgt_02);
    }

    public void f(fov_0 fov_02) {
        for_0 for_02 = (for_0)fov_02;
        fnl_0 fnl_02 = fno_0.sKx.g(for_02);
        bjj_0 bjj_02 = new bjj_0(this.kDa, fnl_02);
        int n = for_02.aVt();
        fos_0 fos_02 = fou_0.sLB.az(n);
        bjj_02.eam().dT(ajf_0.yG(fos_02.gfA().d()));
        this.kCx = (bjk_0)bjj_02.eam();
        fse_1.gFu().a((aef_2)this, "animName", kCw);
    }

    public void a(fos_0 fos_02, @Nullable bdf_1 bdf_12) {
        this.kCx = new bjk_0(null, null);
        this.kCx.lf(fos_02.aXE());
        this.kCx.a(abi_1.dzm);
        this.kCx.dT("AnimStatique");
        this.kCx.a(aeB.bww());
        if (bdf_12 != null) {
            this.kCx.f(bdf_12);
        }
        this.kCx.qR(afX.csq.byy());
        this.kCx.at((byte)8);
        this.kCx.setVisible(true);
        this.kCx.bpC();
        fse_1.gFu().a((aef_2)this, "animName", kCw);
    }

    public void a(foA foA2) {
        this.a(foA2, aue_0.cVJ().cVK(), null, null);
    }

    public void a(foA foA2, bhJ bhJ2, @Nullable Integer n, @Nullable Integer n2) {
        Object object;
        fov_0 fov_02 = foy_0.sLJ.XQ(foA2.ctm());
        this.kCx = new bjk_0(null, null);
        this.kCx.lf(foA2.aXE());
        if (fov_02 != null) {
            if (n != null && (object = fov_02.XN(n)) != null) {
                this.kCx.a((fow_0)object);
            } else {
                this.kCx.a(fov_02.XN(fov_02.gfD()));
            }
        }
        if (n2 != null && (object = fgD.fXh().Vd(n2)) != null) {
            this.kCx.Bx(((fhc_0)object).aVt());
        }
        bjn_0.a((ZC)this.kCx, bhJ2);
        this.kCx.a(abi_1.dzm);
        this.kCx.dT("AnimStatique");
        this.kCx.a(aeB.bww());
        this.kCx.qR(afX.csq.byy());
        this.kCx.at((byte)8);
        this.kCx.setVisible(true);
        object = (bgv_2)fgD.fXh().Vd(foA2.AK());
        if (object != null) {
            this.kCx.Bx(((fhc_0)object).aVt());
        }
        this.kCx.bpC();
        fse_1.gFu().a((aef_2)this, "animName", kCw, "petAnimationEquipment");
    }

    @Override
    public ZC getAnimatedElement() {
        return this.kCx;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kCw)) {
            return this.kCx;
        }
        if (string.equals("petAnimationEquipment")) {
            return this.kCx.bqd();
        }
        return super.eu(string);
    }
}


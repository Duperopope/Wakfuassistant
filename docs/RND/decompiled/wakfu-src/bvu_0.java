/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvU
 */
public final class bvu_0
implements eyc_1 {
    public static final int jvK = -1;
    private int eoY = -1;
    private short jvL = (short)-1;

    @Override
    public void a(eya_1 eya_12) {
        if (this.eoY == -1) {
            this.eoY = eya_12.cmL();
            return;
        }
        if (this.eoY < eya_12.cmL() && aue_0.cVJ().cVK().Sn() != eya_12.KU()) {
            aPd.f("infoPop.levelUp", eya_12.cmL(), eya_12.getName());
        }
        this.eoY = eya_12.cmL();
        ctu_2.nJd.ePN();
    }

    @Override
    public void b(eya_1 eya_12) {
        short s = eya_12.fPm();
        if (s == this.jvL) {
            return;
        }
        if (this.jvL <= 0 && s <= 0) {
            return;
        }
        this.jvL = s;
        if (this.jvL <= 0) {
            aPd.f("infoPop.downscaleDisable", this.eoY, eya_12.getName());
            return;
        }
        aPd.f("infoPop.downscaleLevelChange", this.jvL, eya_12.getName());
        ctu_2.nJd.ePN();
    }

    @Override
    public void c(eya_1 eya_12) {
        this.e(eya_12);
    }

    @Override
    public void d(eya_1 eya_12) {
        this.e(eya_12);
    }

    private void e(eya_1 eya_12) {
        cxs_1.eXb().oI(eya_12.KU());
    }

    @Override
    public void f(eya_1 eya_12) {
    }

    @Override
    public void g(eya_1 eya_12) {
    }
}


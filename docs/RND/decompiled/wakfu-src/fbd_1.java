/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fBd
 */
public class fbd_1
extends faw_2 {
    public static final String TAG = "dndc";
    private fmm_2 tRB = null;
    boolean ivN = true;
    private boolean tRC = true;
    private boolean tRD = false;
    private boolean tRE = true;
    public static final int tRF = 1080770853;
    public static final int tRG = -287739027;
    public static final int tRH = -1316873902;
    public static final int tRI = 1713834839;

    public void setDragEnabled(boolean bl) {
        this.ivN = bl;
    }

    public void setDropEnabled(boolean bl) {
        this.tRC = bl;
    }

    public boolean isDragEnabled() {
        return this.ivN;
    }

    public boolean isDropEnabled() {
        return this.tRC;
    }

    public boolean isDisplayCopy() {
        return this.tRE;
    }

    public void setDisplayCopy(boolean bl) {
        this.tRE = bl;
    }

    public void setValidateDrop(fmm_2 fmm_22) {
        this.tRB = fmm_22;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public fes_2 getWidget(int n, int n2) {
        if (this.isCopy()) {
            return null;
        }
        return super.getWidget(n, n2);
    }

    public boolean isCopy() {
        return this.tRD;
    }

    public void setCopy(boolean bl) {
        this.tRD = bl;
    }

    public void aX(Object object) {
        if (!this.ivN) {
            return;
        }
        flu_1 flu_12 = flu_1.a(fbj_1.getInstance().getCurrentMouseEvent(), this, object);
        this.h(flu_12);
    }

    public void a(fbd_1 fbd_12, Object object, int n) {
        if (!this.tRC) {
            return;
        }
        fla_2 fla_22 = fla_2.c(fbj_1.getInstance().getCurrentMouseEvent(), this, fbd_12, object);
        fla_22.abY(n);
        this.h(fla_22);
    }

    public void aY(Object object) {
        if (!this.tRC) {
            return;
        }
        flc_2 flc_22 = flc_2.a(fbj_1.getInstance().getCurrentMouseEvent(), this, object);
        this.h(flc_22);
    }

    public void a(fbd_1 fbd_12, Object object) {
        if (!this.ivN) {
            return;
        }
        flw_1 flw_12 = flw_1.a(fbj_1.getInstance().getCurrentMouseEvent(), this, fbd_12, object);
        this.h(flw_12);
    }

    public void b(fbd_1 fbd_12, Object object) {
        if (!this.ivN) {
            return;
        }
        fhy_2.gBq().eHV();
        fly_1 fly_12 = fly_1.b(fbj_1.getInstance().getCurrentMouseEvent(), this, fbd_12, object);
        this.h(fly_12);
    }

    public boolean isDropValid(fbd_1 fbd_12, Object object) {
        Object object2;
        if (!this.tRC) {
            return false;
        }
        if (this.tRB != null && (object2 = this.tRB.b(fbd_12, this, object)) != null) {
            return (Boolean)object2;
        }
        return true;
    }

    @Override
    public void gsh() {
        super.gsh();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fbd_1 fbd_12 = (fbd_1)fhi_22;
        super.a(fhi_22);
        fbd_12.tRB = this.tRB;
        fbd_12.ivN = this.ivN;
        fbd_12.tRC = this.tRC;
        fbd_12.tRE = this.tRE;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tRB = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.tRD = false;
        this.a(fzq_0.tJO, new fbe_1(this), false);
        this.a(fzq_0.tJO, new fbf_2(this), true);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 1080770853) {
            this.setValidateDrop(fic_12.b(fmm_2.class, string));
        } else if (n == -287739027) {
            this.setDragEnabled(Bw.aK(string));
        } else if (n == -1316873902) {
            this.setDropEnabled(Bw.aK(string));
        } else if (n == 1713834839) {
            this.setDisplayCopy(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -287739027) {
            this.setDragEnabled(Bw.l(object));
        } else if (n == -1316873902) {
            this.setDropEnabled(Bw.l(object));
        } else if (n == 1713834839) {
            this.setDisplayCopy(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Point;

/*
 * Renamed from fEq
 */
public class feq_1
extends faw_2
implements WR,
faw_1,
fis_1 {
    public static final String TAG = "WatcherContainer";
    protected WQ ujX;
    protected boolean ujY = true;
    private faa_2 tCX = null;
    int bRf = 0;
    int bRg = 0;
    private boolean ujZ = true;
    protected fer_1 uka;
    public static final int ukb = 92903173;
    public static final int ukc = "target".hashCode();
    public static final int ukd = -636864651;
    public static final int uke = 1485313835;
    public static final int ukf = -1922149780;

    public fer_1 getWatcherContainerAdviser() {
        return this.uka;
    }

    protected void f(int n, float f2) {
    }

    @Override
    public int gsr() {
        return xd_0.bnv().a(this.uka);
    }

    @Override
    public void gss() {
    }

    @Override
    public float getWorldX() {
        if (this.ujX != null) {
            return this.ujX.getWorldX();
        }
        return 0.0f;
    }

    @Override
    public float getWorldY() {
        if (this.ujX != null) {
            return this.ujX.getWorldY();
        }
        return 0.0f;
    }

    @Override
    public float getAltitude() {
        if (this.ujX != null) {
            return this.ujX.getAltitude();
        }
        return 0.0f;
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public faa_2 getAlign() {
        return this.tCX;
    }

    public void setAlign(faa_2 faa_22) {
        this.tCX = faa_22;
    }

    public WQ getTarget() {
        return this.ujX;
    }

    public void setTarget(WQ wQ) {
        if (this.ujX != wQ) {
            if (this.ujX != null) {
                this.ujX.b(this);
            }
            this.ujX = wQ;
            if (this.ujX != null) {
                this.ujX.a(this);
            }
        }
        if (this.ujX != null) {
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
    }

    public void setTarget(WQ wQ, int n, int n2) {
        this.bRf = n;
        this.bRg = n2;
        if (this.ujX != null && this.ujX != wQ) {
            this.ujX.b(this);
        }
        this.ujX = wQ;
        if (this.ujX != null) {
            this.ujX.a(this);
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
    }

    public boolean isUseTargetPositionning() {
        return this.ujZ;
    }

    public void setUseTargetPositionning(boolean bl) {
        this.ujZ = bl;
    }

    @Override
    public int getXOffset() {
        return this.bRf;
    }

    public void setXOffset(int n) {
        this.bRf = n;
        if (this.ujX != null) {
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
    }

    @Override
    public int getYOffset() {
        return this.bRg;
    }

    public void setYOffset(int n) {
        this.bRg = n;
        if (this.ujX != null) {
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
    }

    public void setOffset(int n, int n2) {
        this.bRf = n;
        this.bRg = n2;
        if (this.ujX != null && this.ujX.bnh()) {
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
    }

    @Override
    public void setPosition(int n, int n2) {
        if (!this.ujZ) {
            super.setPosition(n, n2);
        }
    }

    @Override
    public void setPosition(int n, int n2, boolean bl) {
        if (!this.ujZ) {
            super.setPosition(n, n2, bl);
        }
    }

    @Override
    public void setPosition(Point point) {
        if (!this.ujZ) {
            super.setPosition(point);
        }
    }

    @Override
    public void setX(int n) {
        if (!this.ujZ) {
            super.setX(n);
        }
    }

    @Override
    public void setY(int n) {
        if (!this.ujZ) {
            super.setY(n);
        }
    }

    @Override
    public void setTargetIsVisible(boolean bl) {
        this.ujY = bl;
    }

    protected void bqn() {
        this.setVisible(this.ujY);
    }

    @Override
    public void gsh() {
        super.gsh();
        if (this.ujX != null) {
            this.ujX.b(this);
        }
    }

    @Override
    public void a(WQ wQ, int n, int n2, int n3) {
        if (this.ujZ) {
            acc_1 acc_12 = this.getComputedPosition(n, n2, n3);
            if (acc_12.bWx() == 0 && acc_12.bWy() == 0) {
                return;
            }
            super.setPosition(acc_12.bWx(), acc_12.bWy(), true);
        }
    }

    protected final int getHalfDisplayWidth() {
        return fbj_1.getInstance().getWidth() / 2;
    }

    protected final int getHalfDisplayHeight() {
        return fbj_1.getInstance().getHeight() / 2;
    }

    public acc_1 getPositionWithOutOfScreen(int n, int n2, int n3) {
        return this.getComputedPosition(n, n2, n3, false);
    }

    public acc_1 getComputedPosition(int n, int n2, int n3) {
        return this.getComputedPosition(n, n2, n3, true);
    }

    private acc_1 getComputedPosition(int n, int n2, int n3, boolean bl) {
        float f2 = fyw_0.gqw().gqD().bRv();
        float f3 = this.uka.getZoomFactor();
        float f4 = (float)n * fyw_0.gqw().gqD().bRu();
        float f5 = (float)n2 * fyw_0.gqw().gqD().bRu();
        int n4 = (int)((float)(this.getHalfDisplayWidth() - this.tCX.uS(this.getWidth())) + (f4 + (float)this.bRf * f3) / f2);
        int n5 = (int)((float)this.getHalfDisplayHeight() + ((float)this.tCX.uT(n3) + f5 + (float)this.bRg * f3) / f2);
        if (!bl) {
            return new acc_1(n4, n5);
        }
        int n6 = GC.a(n4, 0, this.uko.getAppearance().getContentWidth() - this.ukt.width);
        int n7 = GC.a(n5, 0, this.uko.getAppearance().getContentHeight() - this.ukt.height);
        return new acc_1(n6, n7);
    }

    @Override
    public void grg() {
        super.grg();
        if (this.ujX != null) {
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
    }

    @Override
    public boolean run(fiq_1 fiq_12) {
        if (fiq_12.gBy() != fzq_0.tKh) {
            return false;
        }
        if (this.ujX != null) {
            this.a(null, this.ujX.getScreenX(), this.ujX.getScreenY(), this.ujX.bng());
        }
        return false;
    }

    @Override
    public void aVH() {
        super.aVH();
        xd_0.bnv().b(this.uka);
        this.tCX = null;
        this.ujX = null;
        this.uka = null;
        fbj_1.getInstance().b(fzq_0.tKh, this, false);
    }

    @Override
    public void aVI() {
        super.aVI();
        this.setVisible(true);
        this.ujZ = true;
        this.tCX = faa_2.tLL;
        this.uka = new fer_1(this);
        fbj_1.getInstance().a(fzq_0.tKh, this, false);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        super.a(fhi_22);
        feq_1 feq_12 = (feq_1)fhi_22;
        feq_12.setUseTargetPositionning(this.isUseTargetPositionning());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == 92903173) {
            this.setAlign(faa_2.tI(string));
        } else if (n == -636864651) {
            this.setUseTargetPositionning(Bw.aK(string));
        } else if (n == 1485313835) {
            this.setXOffset(Bw.m(string));
        } else if (n == -1922149780) {
            this.setYOffset(Bw.m(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == 92903173) {
            this.setAlign((faa_2)((Object)object));
        } else if (n == -636864651) {
            this.setUseTargetPositionning(Bw.l(object));
        } else if (n == 1485313835) {
            this.setXOffset(Bw.m(object));
        } else if (n == -1922149780) {
            this.setYOffset(Bw.m(object));
        } else if (n == ukc) {
            this.setTarget((WQ)object);
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}


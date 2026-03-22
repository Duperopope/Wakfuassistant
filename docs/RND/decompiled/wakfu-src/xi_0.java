/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;

/*
 * Renamed from Xi
 */
public class xi_0
extends xg_0 {
    public static final int bRk = -1;
    private int bRl = 0;
    private int bMn = -1;
    private int bRm;

    public xi_0(awh_2 awh_22, String string) {
        super(awh_22, string);
        this.setDuration(-1);
    }

    public xi_0(awh_2 awh_22, String string, int n) {
        super(awh_22, string);
        this.setDuration(n);
    }

    public int getDuration() {
        return this.bMn;
    }

    public void setDuration(int n) {
        assert (n >= -1);
        this.bMn = n;
    }

    public boolean bnq() {
        if (this.bMn == -1) {
            return true;
        }
        return this.bRl <= this.bMn + this.bRm;
    }

    public void bnz() {
        this.bRl = 0;
    }

    public void qy(int n) {
        if (this.bRm > 0) {
            this.bRm -= n;
            if (this.bRm <= 0) {
                this.bny().setVisible(true);
            }
        } else {
            this.bRl += n;
        }
    }

    public void qC(int n) {
        assert (n >= 0);
        this.bRm = n;
        if (this.bRm > 0) {
            this.bny().setVisible(false);
        }
    }

    protected int bnA() {
        return this.bRl;
    }

    public final String bnB() {
        return this.bny().bOf();
    }

    public final void c(float f2, float f3, float f4, float f5) {
        this.bny().c(f2, f3, f4, f5);
    }

    public final void a(awh_2 awh_22) {
        this.bny().a(awh_22);
    }

    public final void aw(float f2, float f3) {
        this.bny().a(new acr_1(f2, f3, 0.0f));
    }

    public final void setBorderWidth(float f2) {
        this.bny().bOe().dc(f2);
    }

    public final void setMaxWidth(int n) {
        this.bny().uL(n);
    }

    public final int getMaxWidth() {
        return this.bny().getMaxWidth();
    }

    public final int getMinWidth() {
        return this.bny().bOj();
    }

    public final void a(ahd ahd2) {
        GeometryBackground geometryBackground = this.bny().bOe();
        geometryBackground.a(ahd2.bnE(), ahd2.bnF());
        geometryBackground.b(ahd2.bnG());
        geometryBackground.a(ahd2.bnH());
        geometryBackground.u(ahd2.getLeftMargin(), ahd2.getRightMargin(), ahd2.getTopMargin(), ahd2.getBottomMargin());
    }

    public final void setMinWidth(int n) {
        this.bny().uM(n);
    }

    @Override
    public final void setVisible(boolean bl) {
        this.bny().setVisible(bl);
    }

    public final void qD(int n) {
        this.bny().uN(n);
    }

    public final int bnC() {
        return this.bny().bOh();
    }

    public final int bnD() {
        return this.bny().bOi();
    }
}


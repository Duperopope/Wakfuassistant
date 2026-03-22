/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.xulor2.core.vignetting.FocusEntity;
import java.awt.Point;
import java.util.Optional;

/*
 * Renamed from fKh
 */
public class fkh_2
extends fes_2 {
    public static final String TAG = "focus";
    private final FocusEntity uFz = FocusEntity.uFw.bSJ();
    private final fkd_2 uFA = fkd_2.checkOut();
    private fkf_2 nNB = fkf_2.uFy;
    private float nNC;
    private float nND;
    private float nNE;
    private float nNF;
    private long uFB;
    private long nNG;
    private float nNH;
    private float nNI;
    private float nNJ;
    private float nNK;
    private long uFC;
    private float ayP;
    private long nNL;
    private long nNM;

    public void setCenter(float f2, float f3, float f4, float f5) {
        this.nNC = f2;
        this.nND = f3;
        this.nNE = f4;
        this.nNF = f5;
        this.setMovePosition(0L, f2, f3, f4, f5);
        this.setNeedsToPreProcess();
    }

    public void setMovePosition(long l, float f2, float f3, float f4, float f5) {
        this.uFB = 0L;
        this.nNG = l;
        this.nNH = f2;
        this.nNI = f3;
        this.nNJ = f4;
        this.nNK = f5;
        this.setNeedsToPreProcess();
    }

    @Override
    public fkd_2 getAppearance() {
        return (fkd_2)this.uki;
    }

    public void setColor(float f2, float f3, float f4) {
        this.uFz.setColor(f2, f3, f4);
    }

    public void setAlpha(float f2) {
        this.uFC = 0L;
        this.ayP = f2;
    }

    public void setFadeInDuration(long l) {
        this.nNL = l;
    }

    public void setFadeOutDuration(long l) {
        this.nNM = l;
    }

    public void setMouseBlocked(boolean bl) {
        this.uFA.setMouseBlocked(bl);
    }

    public void setTarget(fkf_2 fkf_22) {
        this.nNB = fkf_22;
    }

    public void reset() {
        this.ayP = 0.75f;
        this.nNL = 0L;
        this.nNM = 0L;
        this.uFz.reset();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uFB = 0L;
        this.uFC = 0L;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uFB = 0L;
        this.uFC = 0L;
        this.uFA.setWidget(this);
        this.d(this.uFA);
        this.setNeedsToPreProcess();
    }

    @Override
    public boolean LZ(int n) {
        this.abR(n);
        this.abS(n);
        return super.LZ(n);
    }

    private void abR(int n) {
        this.uFC += (long)n;
        float f2 = Math.min(1.0f, (float)this.uFC / (float)this.nNL);
        float f3 = 0.0f;
        float f4 = this.ayP;
        float f5 = 0.0f + f2 * (f4 - 0.0f);
        this.uFz.setAlpha(f5);
        if (f5 < this.ayP) {
            this.setNeedsToPreProcess();
        }
    }

    private void abS(int n) {
        float f2;
        float f3;
        float f4;
        this.uFB += (long)n;
        float f5 = Math.min(1.0f, (float)this.uFB / (float)this.nNG);
        boolean bl = true;
        float f6 = this.nNC + f5 * (this.nNH - this.nNC);
        if (Math.abs(this.nNH - f6) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        if (Math.abs(this.nNI - (f4 = this.nND + f5 * (this.nNI - this.nND))) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        if (Math.abs(this.nNJ - (f3 = this.nNE + f5 * (this.nNJ - this.nNE))) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        if (Math.abs(this.nNK - (f2 = this.nNF + f5 * (this.nNK - this.nNF))) > 1.0f) {
            this.setNeedsToPreProcess();
        }
        Point point = Optional.ofNullable(this.nNB.getPosition()).orElse(fkf_2.uFx.getLocation());
        float f7 = (float)point.getX();
        float f8 = (float)point.getY();
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f + f7 + f6;
        float f12 = 0.0f + f8 + f4;
        float f13 = 0.0f + f7 + f3;
        float f14 = 0.0f + f8 + f2;
        this.uFz.setCenter(f11, f12, f13, f14);
        this.uFA.setCenter(f11, f12, f13, f14);
        if (this.nNB != uFy) {
            this.setNeedsToPreProcess();
        }
    }

    @Override
    public void setSize(int n, int n2, boolean bl) {
        super.setSize(n, n2, bl);
        this.uFz.aG(n, n2);
    }

    @Override
    protected void eKZ() {
        super.eKZ();
        this.bVe.g(this.uFz);
    }

    @Override
    public boolean isAppearanceCompatible(fys_0 fys_02) {
        return fys_02 instanceof fkd_2;
    }

    @Override
    public String getTag() {
        return TAG;
    }
}


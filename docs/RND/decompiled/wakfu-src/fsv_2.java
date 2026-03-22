/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.util.function.Consumer;
import javax.annotation.Nullable;

/*
 * Renamed from fSv
 */
public class fsv_2<T>
extends fss_2<Float> {
    private Consumer<T> vek;
    private final T vel;

    public fsv_2(float f2, fes_2 fes_22, int n, faw_2 faw_22, @Nullable T t) {
        super(Float.valueOf(f2), Float.valueOf(0.0f), fes_22, 0, n, abn.cdp);
        this.vel = t;
        fys_0 fys_02 = fes_22.getAppearance();
        axb_2 axb_22 = fys_02.getModulationColor();
        awx_2 awx_22 = axb_22 == null ? new awx_2(awx_2.dnF) : (axb_22 instanceof awx_2 ? (awx_2)axb_22 : new awx_2(axb_22));
        awx_22.setAlpha(f2);
        fys_02.setModulationColor(awx_22);
    }

    @Override
    public boolean Ma(int n) {
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ == null) {
            return true;
        }
        float f2 = this.tXJ.h(((Float)this.veb).floatValue(), ((Float)this.vec).floatValue(), this.bUi, this.bMn);
        fys_0 fys_02 = this.getWidget().getAppearance();
        axb_2 axb_22 = fys_02.getModulationColor();
        if (axb_22 instanceof awx_2) {
            ((awx_2)axb_22).setAlpha(f2);
        } else {
            fys_02.setModulationColor(new awx_2(axb_22.bPW(), axb_22.bQg(), axb_22.bQh(), f2));
        }
        return true;
    }

    public void gGb() {
        this.bUi = 0;
        this.Ma(0);
        this.setPaused(true);
        this.getWidget().b(this);
    }

    @Override
    public void cbz() {
        super.cbz();
        if (this.vek != null && this.vel != null && !this.isPaused()) {
            this.vek.accept(this.vel);
        }
    }

    public void A(Consumer<T> consumer) {
        this.vek = consumer;
    }
}


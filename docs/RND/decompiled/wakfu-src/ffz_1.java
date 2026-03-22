/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Insets;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fFz
 */
public abstract class ffz_1
implements fkc_1,
fzc {
    protected axb_2 ncL = null;
    protected axb_2 chO = null;
    @Nullable
    protected acb_1 uql = null;

    @Override
    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        this.gwq();
    }

    @Override
    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public abstract void a(int var1, int var2, int var3, int var4, float var5);

    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110) {
    }

    public abstract Entity getEntity();

    public abstract void aVI();

    public void aVH() {
        this.ncL = null;
        this.chO = null;
        this.uql = null;
    }

    @Override
    public Optional<acb_1> gwp() {
        return Optional.ofNullable(this.uql);
    }

    public void setHorizontal(boolean bl) {
    }

    public void setColor(axb_2 axb_22) {
        if (this.chO == axb_22) {
            return;
        }
        this.chO = axb_22;
        this.gwq();
    }

    protected abstract void gwq();

    public axb_2 getColor() {
        return this.chO;
    }

    public void setBorderColor(axb_2 axb_22) {
    }

    public axb_2 getBorderColor() {
        return null;
    }

    public void setFullCirclePercentage(float f2) {
    }

    public void setDeltaAngle(float f2) {
    }

    public void setPosition(faa_2 faa_22) {
    }

    public void setBorder(Insets insets) {
    }

    public Insets getBorder() {
        return null;
    }

    public void setClockwise(boolean bl) {
    }
}


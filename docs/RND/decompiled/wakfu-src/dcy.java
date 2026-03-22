/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class dcy
extends dae_0 {
    @NotNull
    private ekb_0 iHd;

    @Override
    public int d() {
        return 19467;
    }

    @NotNull
    @Generated
    public ekb_0 dyn() {
        return this.iHd;
    }

    @Generated
    public dcy(@NotNull ekb_0 ekb_02) {
        if (ekb_02 == null) {
            throw new NullPointerException("step is marked non-null but is null");
        }
        this.iHd = ekb_02;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dcy)) {
            return false;
        }
        dcy dcy2 = (dcy)object;
        if (!dcy2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ekb_0 ekb_02 = this.dyn();
        ekb_0 ekb_03 = dcy2.dyn();
        return !(ekb_02 == null ? ekb_03 != null : !((Object)((Object)ekb_02)).equals((Object)ekb_03));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof dcy;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        ekb_0 ekb_02 = this.dyn();
        n2 = n2 * 59 + (ekb_02 == null ? 43 : ((Object)((Object)ekb_02)).hashCode());
        return n2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class dcx
extends dcv {
    @NotNull
    private final ekb_0 ofo;
    private final boolean ofp;

    public dcx(@NotNull ekb_0 ekb_02, boolean bl, @Nullable Integer n, boolean bl2) {
        super(n, bl2);
        this.ofo = ekb_02;
        this.ofp = bl;
    }

    @Override
    public int d() {
        return 19536;
    }

    @NotNull
    @Generated
    public ekb_0 dyn() {
        return this.ofo;
    }

    @Generated
    public boolean fbT() {
        return this.ofp;
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dcx)) {
            return false;
        }
        dcx dcx2 = (dcx)object;
        if (!dcx2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.fbT() != dcx2.fbT()) {
            return false;
        }
        ekb_0 ekb_02 = this.dyn();
        ekb_0 ekb_03 = dcx2.dyn();
        return !(ekb_02 == null ? ekb_03 != null : !((Object)((Object)ekb_02)).equals((Object)ekb_03));
    }

    @Override
    @Generated
    protected boolean C(Object object) {
        return object instanceof dcx;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.fbT() ? 79 : 97);
        ekb_0 ekb_02 = this.dyn();
        n2 = n2 * 59 + (ekb_02 == null ? 43 : ((Object)((Object)ekb_02)).hashCode());
        return n2;
    }
}


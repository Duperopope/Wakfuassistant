/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public abstract class dcv
extends dae_0 {
    @Nullable
    private final Integer ofl;
    private final boolean ofm;

    public boolean fbR() {
        return this.ofl != null;
    }

    @Nullable
    @Generated
    public Integer dzm() {
        return this.ofl;
    }

    @Generated
    public boolean fbS() {
        return this.ofm;
    }

    @Generated
    public dcv(@Nullable Integer n, boolean bl) {
        this.ofl = n;
        this.ofm = bl;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dcv)) {
            return false;
        }
        dcv dcv2 = (dcv)object;
        if (!dcv2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.fbS() != dcv2.fbS()) {
            return false;
        }
        Integer n = this.dzm();
        Integer n2 = dcv2.dzm();
        return !(n == null ? n2 != null : !((Object)n).equals(n2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof dcv;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + (this.fbS() ? 79 : 97);
        Integer n3 = this.dzm();
        n2 = n2 * 59 + (n3 == null ? 43 : ((Object)n3).hashCode());
        return n2;
    }
}


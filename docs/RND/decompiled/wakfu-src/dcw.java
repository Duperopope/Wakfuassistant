/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class dcw
extends dcv {
    private final int ofn;

    public dcw(int n, @Nullable Integer n2, boolean bl) {
        super(n2, bl);
        this.ofn = n;
    }

    @Override
    public int d() {
        return 16894;
    }

    @Generated
    public int rX() {
        return this.ofn;
    }

    @Override
    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dcw)) {
            return false;
        }
        dcw dcw2 = (dcw)object;
        if (!dcw2.C(this)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        return this.rX() == dcw2.rX();
    }

    @Override
    @Generated
    protected boolean C(Object object) {
        return object instanceof dcw;
    }

    @Override
    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = super.hashCode();
        n2 = n2 * 59 + this.rX();
        return n2;
    }
}


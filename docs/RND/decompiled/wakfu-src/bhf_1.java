/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

/*
 * Renamed from bHF
 */
public abstract class bhf_1
extends bhi_1 {
    protected final boolean kck;
    private final String kcl;

    bhf_1(boolean bl, String string, Runnable runnable) {
        super(runnable);
        this.kck = bl;
        this.kcl = string;
    }

    @Override
    public boolean isValid() {
        return this.kck;
    }

    @Override
    public String dDG() {
        return aum_0.cWf().c(this.kcl, new Object[0]);
    }

    @Generated
    public boolean isEnabled() {
        return this.kck;
    }

    @Generated
    public String clY() {
        return this.kcl;
    }
}


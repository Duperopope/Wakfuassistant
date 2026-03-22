/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJV
 */
public abstract class fjv_2
extends fjz_2
implements fks_2 {
    private fys_0 uFf;

    @Override
    public void c(@Nullable fes_2 fes_22, @Nullable fes_2 fes_23) {
        if (fes_22 != null) {
            fes_22.b(this);
        }
        if (fes_23 != null) {
            fes_23.a(this);
        } else {
            this.c(this.uFf, null);
            this.uFf = null;
        }
    }

    @Nullable
    public fys_0 getAppearanceRelated() {
        fes_2 fes_22 = this.getWidgetRelated();
        if (fes_22 == null) {
            return null;
        }
        fys_0 fys_02 = fes_22.getAppearance();
        if (fys_02 != this.uFf) {
            this.c(this.uFf, fys_02);
        }
        this.uFf = fys_02;
        return fys_02;
    }

    public void c(@Nullable fys_0 fys_02, @Nullable fys_0 fys_03) {
    }

    @Override
    public void d(@Nullable fys_0 fys_02, @Nullable fys_0 fys_03) {
        if (fys_02 == fys_03) {
            return;
        }
        this.gCJ();
    }
}


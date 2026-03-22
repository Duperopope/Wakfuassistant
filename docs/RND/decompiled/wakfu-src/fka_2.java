/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fKa
 */
public class fka_2
extends fjz_2
implements ffg_2 {
    public static final String TAG = "isWidgetVisible";
    public static final String uFn = "isVisible";
    private boolean uFo;

    @Override
    public boolean isValid(Object object) {
        fes_2 fes_22 = this.getWidgetRelated();
        this.uFo = fes_22 != null && fes_22.isVisible();
        return this.uFo;
    }

    @Override
    public void c(@Nullable fes_2 fes_22, @Nullable fes_2 fes_23) {
        if (fes_22 != null) {
            fes_22.b(this);
        }
        if (fes_23 != null) {
            fes_23.a(this);
        } else {
            this.onVisibilityChanged(this.uFo, false);
            this.uFo = false;
        }
    }

    @Override
    public void onVisibilityChanged(boolean bl, boolean bl2) {
        if (bl == bl2) {
            return;
        }
        this.gCJ();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOe
 */
class coe_2
implements fgl_1 {
    final /* synthetic */ faw_2 ngk;
    final /* synthetic */ cod_2 ngl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coe_2(cod_2 cod_22, faw_2 faw_22) {
        this.ngl = cod_22;
        this.ngk = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngk.gvq();
        this.ngk.a(new cof_2(this, runnable));
        this.ngl.R(this.ngk);
    }
}


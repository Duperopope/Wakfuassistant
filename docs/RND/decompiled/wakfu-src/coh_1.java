/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOh
 */
class coh_1
implements fgl_1 {
    final /* synthetic */ fbz_2 ngp;
    final /* synthetic */ cod_2 ngq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coh_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.ngq = cod_22;
        this.ngp = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngp.gvq();
        this.ngp.a(new coi_2(this, runnable));
        this.ngq.u(this.ngp);
    }
}


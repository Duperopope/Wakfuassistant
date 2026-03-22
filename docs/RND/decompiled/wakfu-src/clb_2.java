/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLb
 */
class clb_2
implements fgl_1 {
    final /* synthetic */ faw_2 neX;
    final /* synthetic */ ckv_2 neY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clb_2(ckv_2 ckv_22, faw_2 faw_22) {
        this.neY = ckv_22;
        this.neX = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neX.gvq();
        this.neX.a(new clc_2(this, runnable));
        this.neY.cr(this.neX);
    }
}


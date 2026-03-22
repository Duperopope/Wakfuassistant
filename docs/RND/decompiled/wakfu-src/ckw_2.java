/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cKW
 */
class ckw_2
implements fgl_1 {
    final /* synthetic */ faw_2 neO;
    final /* synthetic */ ckv_2 neP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ckw_2(ckv_2 ckv_22, faw_2 faw_22) {
        this.neP = ckv_22;
        this.neO = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neO.gvq();
        this.neO.a(new ckx_2(this, runnable));
        this.neP.p(this.neO);
    }
}


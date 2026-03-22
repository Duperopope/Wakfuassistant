/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cKY
 */
class cky_1
implements fgl_1 {
    final /* synthetic */ faw_2 neS;
    final /* synthetic */ ckv_2 neT;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cky_1(ckv_2 ckv_22, faw_2 faw_22) {
        this.neT = ckv_22;
        this.neS = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neS.gvq();
        this.neS.a(new ckz_2(this, runnable));
        this.neT.bj(this.neS);
    }
}


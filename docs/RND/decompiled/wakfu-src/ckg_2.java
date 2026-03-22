/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cKG
 */
class ckg_2
implements fgl_1 {
    final /* synthetic */ faw_2 neJ;
    final /* synthetic */ ckf_1 neK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ckg_2(ckf_1 ckf_12, faw_2 faw_22) {
        this.neK = ckf_12;
        this.neJ = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neJ.gvq();
        this.neJ.a(new ckh_2(this, runnable));
        this.neK.r(this.neJ);
    }
}


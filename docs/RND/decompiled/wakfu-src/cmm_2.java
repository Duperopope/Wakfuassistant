/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMm
 */
class cmm_2
implements fgl_1 {
    final /* synthetic */ faw_2 ngf;
    final /* synthetic */ cln_1 ngg;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmm_2(cln_1 cln_12, faw_2 faw_22) {
        this.ngg = cln_12;
        this.ngf = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngf.gvq();
        this.ngf.a(new cmn_2(this, runnable));
        this.ngg.X(this.ngf);
    }
}


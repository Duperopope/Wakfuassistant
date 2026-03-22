/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMj
 */
class cmj_2
implements fgl_1 {
    final /* synthetic */ faw_2 nga;
    final /* synthetic */ cln_1 ngb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmj_2(cln_1 cln_12, faw_2 faw_22) {
        this.ngb = cln_12;
        this.nga = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nga.gvq();
        this.nga.a(new cmk_1(this, runnable));
        this.ngb.q(this.nga);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLP
 */
class clp_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfr;
    final /* synthetic */ cln_1 nfs;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clp_1(cln_1 cln_12, faw_2 faw_22) {
        this.nfs = cln_12;
        this.nfr = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfr.gvq();
        this.nfr.a(new clq_2(this, runnable));
        this.nfs.al(this.nfr);
    }
}


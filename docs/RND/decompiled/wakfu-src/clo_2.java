/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLO
 */
class clo_2
implements fgl_1 {
    final /* synthetic */ fdh_1 nfp;
    final /* synthetic */ cln_1 nfq;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clo_2(cln_1 cln_12, fdh_1 fdh_12) {
        this.nfq = cln_12;
        this.nfp = fdh_12;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfp.gvq();
        this.nfq.l(this.nfp);
        runnable.run();
    }
}


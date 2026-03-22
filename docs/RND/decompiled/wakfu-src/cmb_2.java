/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMb
 */
class cmb_2
implements fgl_1 {
    final /* synthetic */ fdh_1 nfL;
    final /* synthetic */ cln_1 nfM;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmb_2(cln_1 cln_12, fdh_1 fdh_12) {
        this.nfM = cln_12;
        this.nfL = fdh_12;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfL.gvq();
        this.nfM.m(this.nfL);
        runnable.run();
    }
}


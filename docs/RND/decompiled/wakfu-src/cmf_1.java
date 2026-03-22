/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMf
 */
class cmf_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfT;
    final /* synthetic */ cln_1 nfU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmf_1(cln_1 cln_12, faw_2 faw_22) {
        this.nfU = cln_12;
        this.nfT = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfT.gvq();
        this.nfU.cY(this.nfT);
        runnable.run();
    }
}


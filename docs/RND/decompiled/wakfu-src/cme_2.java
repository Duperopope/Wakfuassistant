/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMe
 */
class cme_2
implements fgl_1 {
    final /* synthetic */ faw_2 nfR;
    final /* synthetic */ cln_1 nfS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cme_2(cln_1 cln_12, faw_2 faw_22) {
        this.nfS = cln_12;
        this.nfR = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfR.gvq();
        this.nfS.cL(this.nfR);
        runnable.run();
    }
}


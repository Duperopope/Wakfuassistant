/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMc
 */
class cmc_2
implements fgl_1 {
    final /* synthetic */ faw_2 nfN;
    final /* synthetic */ cln_1 nfO;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmc_2(cln_1 cln_12, faw_2 faw_22) {
        this.nfO = cln_12;
        this.nfN = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfN.gvq();
        this.nfO.aB(this.nfN);
        runnable.run();
    }
}


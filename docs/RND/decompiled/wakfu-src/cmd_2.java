/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMd
 */
class cmd_2
implements fgl_1 {
    final /* synthetic */ faw_2 nfP;
    final /* synthetic */ cln_1 nfQ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmd_2(cln_1 cln_12, faw_2 faw_22) {
        this.nfQ = cln_12;
        this.nfP = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfP.gvq();
        this.nfQ.bI(this.nfP);
        runnable.run();
    }
}


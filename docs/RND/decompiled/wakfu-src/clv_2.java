/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLV
 */
class clv_2
implements fgl_1 {
    final /* synthetic */ faw_2 nfB;
    final /* synthetic */ cln_1 nfC;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clv_2(cln_1 cln_12, faw_2 faw_22) {
        this.nfC = cln_12;
        this.nfB = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfB.gvq();
        this.nfB.a(new clw_1(this, runnable));
        this.nfC.au(this.nfB);
    }
}


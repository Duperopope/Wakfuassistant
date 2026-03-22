/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cMg
 */
class cmg_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfV;
    final /* synthetic */ cln_1 nfW;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cmg_1(cln_1 cln_12, faw_2 faw_22) {
        this.nfW = cln_12;
        this.nfV = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfV.gvq();
        this.nfV.a(new cmh_2(this, runnable));
        this.nfW.I(this.nfV);
    }
}


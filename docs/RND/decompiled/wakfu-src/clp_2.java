/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLp
 */
class clp_2
implements fgl_1 {
    final /* synthetic */ fbz_2 nfc;
    final /* synthetic */ clo_1 nfd;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clp_2(clo_1 clo_12, fbz_2 fbz_22) {
        this.nfd = clo_12;
        this.nfc = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfc.gvq();
        this.nfc.a(new clq_1(this, runnable));
        this.nfd.Q(this.nfc);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLB
 */
class clb_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfh;
    final /* synthetic */ cla_2 nfi;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    clb_1(cla_2 cla_22, faw_2 faw_22) {
        this.nfi = cla_22;
        this.nfh = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfh.gvq();
        this.nfh.a(new clc_1(this, runnable));
        this.nfi.ao(this.nfh);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fEv
 */
class fev_1
implements fgl_1 {
    final /* synthetic */ fzb_0 umk;
    final /* synthetic */ fes_2 uml;
    final /* synthetic */ Runnable umm;
    final /* synthetic */ fes_2 umn;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fev_1(fes_2 fes_22, fzb_0 fzb_02, fes_2 fes_23, Runnable runnable) {
        this.umn = fes_22;
        this.umk = fzb_02;
        this.uml = fes_23;
        this.umm = runnable;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.umn.gvq();
        if (this.umk.tGD) {
            this.umn.a(new few_1(this, runnable));
            this.umm.run();
        } else {
            this.umm.run();
            runnable.run();
        }
    }
}


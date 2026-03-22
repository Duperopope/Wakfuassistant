/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cJG
 */
class cjg_1
implements fgl_1 {
    final /* synthetic */ fbz_2 neE;
    final /* synthetic */ cjf_2 neF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjg_1(cjf_2 cjf_22, fbz_2 fbz_22) {
        this.neF = cjf_22;
        this.neE = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neE.gvq();
        this.neE.a(new cjh_1(this, runnable));
        this.neF.s(this.neE);
    }
}


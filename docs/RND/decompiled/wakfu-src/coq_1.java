/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOq
 */
class coq_1
implements fgl_1 {
    final /* synthetic */ fbz_2 ngE;
    final /* synthetic */ cod_2 ngF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coq_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.ngF = cod_22;
        this.ngE = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngE.gvq();
        this.ngE.a(new cor_2(this, runnable));
        this.ngF.d(this.ngE);
    }
}


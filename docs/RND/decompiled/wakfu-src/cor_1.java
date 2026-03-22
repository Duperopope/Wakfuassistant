/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOR
 */
class cor_1
implements fgl_1 {
    final /* synthetic */ fbz_2 nhx;
    final /* synthetic */ cod_2 nhy;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cor_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.nhy = cod_22;
        this.nhx = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nhx.gvq();
        this.nhx.a(new cos_1(this, runnable));
        this.nhy.p(this.nhx);
    }
}


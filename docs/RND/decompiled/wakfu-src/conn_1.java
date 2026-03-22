/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOnn
 */
class conn_1
implements fgl_1 {
    final /* synthetic */ fbz_2 ngz;
    final /* synthetic */ cod_2 ngA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    conn_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.ngA = cod_22;
        this.ngz = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngz.gvq();
        this.ngz.a(new coo_2(this, runnable));
        this.ngA.c(this.ngz);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOk
 */
class cok_2
implements fgl_1 {
    final /* synthetic */ fbz_2 ngu;
    final /* synthetic */ cod_2 ngv;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cok_2(cod_2 cod_22, fbz_2 fbz_22) {
        this.ngv = cod_22;
        this.ngu = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngu.gvq();
        this.ngu.a(new col_2(this, runnable));
        this.ngv.F(this.ngu);
    }
}


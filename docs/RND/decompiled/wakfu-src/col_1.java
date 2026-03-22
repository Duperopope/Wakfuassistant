/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOL
 */
class col_1
implements fgl_1 {
    final /* synthetic */ fbz_2 nhn;
    final /* synthetic */ cod_2 nho;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    col_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.nho = cod_22;
        this.nhn = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nhn.gvq();
        this.nhn.a(new com_2(this, runnable));
        this.nho.v(this.nhn);
    }
}


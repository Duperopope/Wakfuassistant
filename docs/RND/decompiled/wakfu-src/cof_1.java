/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOF
 */
class cof_1
implements fgl_1 {
    final /* synthetic */ fbz_2 nhd;
    final /* synthetic */ cod_2 nhe;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cof_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.nhe = cod_22;
        this.nhd = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nhd.gvq();
        this.nhd.a(new cog_1(this, runnable));
        this.nhe.a(this.nhd);
    }
}


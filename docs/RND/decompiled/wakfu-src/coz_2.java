/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOz
 */
class coz_2
implements fgl_1 {
    final /* synthetic */ fbz_2 ngT;
    final /* synthetic */ cod_2 ngU;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coz_2(cod_2 cod_22, fbz_2 fbz_22) {
        this.ngU = cod_22;
        this.ngT = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngT.gvq();
        this.ngT.a(new coa_1(this, runnable));
        this.ngU.m(this.ngT);
    }
}


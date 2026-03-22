/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOI
 */
class coi_1
implements fgl_1 {
    final /* synthetic */ fbz_2 nhi;
    final /* synthetic */ cod_2 nhj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coi_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.nhj = cod_22;
        this.nhi = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nhi.gvq();
        this.nhi.a(new coj_1(this, runnable));
        this.nhj.b(this.nhi);
    }
}


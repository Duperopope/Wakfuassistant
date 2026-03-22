/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOw
 */
class cow_1
implements fgl_1 {
    final /* synthetic */ fcq_2 ngO;
    final /* synthetic */ cod_2 ngP;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cow_1(cod_2 cod_22, fcq_2 fcq_22) {
        this.ngP = cod_22;
        this.ngO = fcq_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngO.gvq();
        this.ngO.a(new cox_2(this, runnable));
        this.ngP.g(this.ngO);
    }
}


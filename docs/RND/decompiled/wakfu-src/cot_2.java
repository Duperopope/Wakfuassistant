/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOt
 */
class cot_2
implements fgl_1 {
    final /* synthetic */ faw_2 ngJ;
    final /* synthetic */ cod_2 ngK;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cot_2(cod_2 cod_22, faw_2 faw_22) {
        this.ngK = cod_22;
        this.ngJ = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.ngJ.gvq();
        this.ngJ.a(new cou_1(this, runnable));
        this.ngK.i(this.ngJ);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cOO
 */
class coo_1
implements fgl_1 {
    final /* synthetic */ fbz_2 nhs;
    final /* synthetic */ cod_2 nht;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    coo_1(cod_2 cod_22, fbz_2 fbz_22) {
        this.nht = cod_22;
        this.nhs = fbz_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nhs.gvq();
        this.nhs.a(new cop_2(this, runnable));
        this.nht.o(this.nhs);
    }
}


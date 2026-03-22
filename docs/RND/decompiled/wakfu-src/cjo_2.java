/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cJo
 */
class cjo_2
implements fgl_1 {
    final /* synthetic */ faw_2 nek;
    final /* synthetic */ cjn_1 nel;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjo_2(cjn_1 cjn_12, faw_2 faw_22) {
        this.nel = cjn_12;
        this.nek = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nek.gvq();
        this.nek.a(new cjp_2(this, runnable));
        this.nel.R(this.nek);
    }
}


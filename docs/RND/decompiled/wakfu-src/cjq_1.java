/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cJq
 */
class cjq_1
implements fgl_1 {
    final /* synthetic */ faw_2 neo;
    final /* synthetic */ cjn_1 nep;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjq_1(cjn_1 cjn_12, faw_2 faw_22) {
        this.nep = cjn_12;
        this.neo = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neo.gvq();
        this.neo.a(new cjr_1(this, runnable));
        this.nep.dZ(this.neo);
    }
}


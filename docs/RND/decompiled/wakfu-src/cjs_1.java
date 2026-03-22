/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cJs
 */
class cjs_1
implements fgl_1 {
    final /* synthetic */ faw_2 nes;
    final /* synthetic */ cjn_1 net;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjs_1(cjn_1 cjn_12, faw_2 faw_22) {
        this.net = cjn_12;
        this.nes = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nes.gvq();
        this.nes.a(new cjt_1(this, runnable));
        this.net.f(this.nes);
    }
}


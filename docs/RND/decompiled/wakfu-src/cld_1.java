/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLD
 */
class cld_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfl;
    final /* synthetic */ cla_2 nfm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cld_1(cla_2 cla_22, faw_2 faw_22) {
        this.nfm = cla_22;
        this.nfl = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfl.gvq();
        this.nfl.a(new cle_1(this, runnable));
        this.nfm.aT(this.nfl);
    }
}


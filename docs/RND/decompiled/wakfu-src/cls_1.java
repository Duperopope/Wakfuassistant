/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLS
 */
class cls_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfw;
    final /* synthetic */ cln_1 nfx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cls_1(cln_1 cln_12, faw_2 faw_22) {
        this.nfx = cln_12;
        this.nfw = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfw.gvq();
        this.nfw.a(new clt_2(this, runnable));
        this.nfx.bu(this.nfw);
    }
}


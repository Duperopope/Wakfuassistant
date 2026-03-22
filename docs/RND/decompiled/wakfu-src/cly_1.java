/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cLY
 */
class cly_1
implements fgl_1 {
    final /* synthetic */ faw_2 nfG;
    final /* synthetic */ cln_1 nfH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cly_1(cln_1 cln_12, faw_2 faw_22) {
        this.nfH = cln_12;
        this.nfG = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.nfG.gvq();
        this.nfG.a(new clz_2(this, runnable));
        this.nfH.cT(this.nfG);
    }
}


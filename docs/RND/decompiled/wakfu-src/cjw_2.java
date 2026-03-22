/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cJw
 */
class cjw_2
implements fgl_1 {
    final /* synthetic */ faw_2 neA;
    final /* synthetic */ cjn_1 neB;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cjw_2(cjn_1 cjn_12, faw_2 faw_22) {
        this.neB = cjn_12;
        this.neA = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.neA.gvq();
        this.neA.a(new cjx_2(this, runnable));
        this.neB.dI(this.neA);
    }
}


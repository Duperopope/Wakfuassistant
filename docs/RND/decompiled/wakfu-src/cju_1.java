/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cJu
 * Illegal identifiers - consider using --renameillegalidents true
 */
class cju_1
implements fgl_1 {
    final /* synthetic */ faw_2 new;
    final /* synthetic */ cjn_1 nex;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    cju_1(cjn_1 cjn_12, faw_2 faw_22) {
        this.nex = cjn_12;
        this.new = faw_22;
    }

    @Override
    public void a(boolean bl, boolean bl2, @NotNull Runnable runnable) {
        if (!bl2) {
            return;
        }
        this.new.gvq();
        this.new.a(new cjv_2(this, runnable));
        this.nex.dk(this.new);
    }
}


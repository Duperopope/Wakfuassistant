/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from ffv
 */
class ffv_0
implements TObjectProcedure<ffs_0> {
    final /* synthetic */ RX sfw;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ffv_0(fft_0 fft_02, RX rX) {
        this.sfw = rX;
    }

    public boolean g(ffs_0 ffs_02) {
        ffs_02.a(this.sfw);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.g((ffs_0)object);
    }
}


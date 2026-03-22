/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class ffw
implements TObjectProcedure<ffs_0> {
    final /* synthetic */ ArrayList sfx;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ffw(fft_0 fft_02, ArrayList arrayList) {
        this.sfx = arrayList;
    }

    public boolean g(ffs_0 ffs_02) {
        this.sfx.add(ffs_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.g((ffs_0)object);
    }
}


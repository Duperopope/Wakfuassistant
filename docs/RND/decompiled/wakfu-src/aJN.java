/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class aJN
implements TObjectProcedure<ZH> {
    final /* synthetic */ ArrayList ecb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aJN(ArrayList arrayList) {
        this.ecb = arrayList;
    }

    public boolean f(ZH zH) {
        this.ecb.add(zH);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.f((ZH)object);
    }
}


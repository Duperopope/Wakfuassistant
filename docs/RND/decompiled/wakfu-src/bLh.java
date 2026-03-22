/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bLh
implements TObjectProcedure<bKV> {
    final /* synthetic */ bLe krZ;

    bLh(bLe bLe2) {
        this.krZ = bLe2;
    }

    public boolean e(bKV bKV2) {
        this.krZ.b(bKV2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((bKV)object);
    }
}


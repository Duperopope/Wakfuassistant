/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bLn
implements TObjectProcedure<bKV> {
    final /* synthetic */ bLm ksp;

    bLn(bLm bLm2) {
        this.ksp = bLm2;
    }

    public boolean e(bKV bKV2) {
        short s = bKV2.eco().ghz();
        bLm.a(this.ksp, s);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((bKV)object);
    }
}


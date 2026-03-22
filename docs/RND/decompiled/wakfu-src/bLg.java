/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bLg
implements TObjectProcedure<bKV> {
    final /* synthetic */ aaj_0 krX;
    final /* synthetic */ bLe krY;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bLg(bLe bLe2, aaj_0 aaj_02) {
        this.krY = bLe2;
        this.krX = aaj_02;
    }

    public boolean e(bKV bKV2) {
        if (bKV2.c(this.krX)) {
            bLe.a(this.krY, bKV2, this.krX);
            bLe.b(this.krY).add(bKV2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((bKV)object);
    }
}


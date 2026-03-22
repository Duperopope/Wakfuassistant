/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class ftL
implements TObjectProcedure<ftH> {
    final /* synthetic */ int[] tgv;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ftL(ftJ ftJ2, int[] nArray) {
        this.tgv = nArray;
    }

    public boolean b(ftH ftH2) {
        this.tgv[0] = this.tgv[0] + ftH2.DN();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((ftH)object);
    }
}


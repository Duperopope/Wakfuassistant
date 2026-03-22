/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;
import java.util.List;

class Um
implements TLongProcedure {
    final /* synthetic */ short buE;
    final /* synthetic */ TA buF;
    final /* synthetic */ Uj buG;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    Um(Uj uj, short s, TA tA) {
        this.buG = uj;
        this.buE = s;
        this.buF = tA;
    }

    public boolean execute(long l) {
        List list;
        List list2 = (List)this.buG.buz.get(this.buE);
        if (list2 != null) {
            this.buG.a(l, this.buF, list2);
        }
        if ((list = (List)this.buG.buA.get(this.buE)) != null) {
            this.buG.a(l, this.buF, list);
        }
        return true;
    }
}


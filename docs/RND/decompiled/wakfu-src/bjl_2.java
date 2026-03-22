/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bjL
 */
class bjl_2
implements TObjectProcedure<bjj_2> {
    final /* synthetic */ String ipE;
    final /* synthetic */ bdj_2 ipF;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bjl_2(String string, bdj_2 bdj_22) {
        this.ipE = string;
        this.ipF = bdj_22;
    }

    public boolean b(bjj_2 bjj_22) {
        String string = String.format(this.ipE, bjj_22.ipC);
        this.ipF.b(string, ary_2.n(bjj_22.beD));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((bjj_2)object);
    }
}


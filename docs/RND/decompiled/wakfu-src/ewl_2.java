/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

/*
 * Renamed from eWl
 */
class ewl_2
implements TLongProcedure {
    final /* synthetic */ StringBuilder rBj;
    final /* synthetic */ ewk_1 rBk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ewl_2(ewk_1 ewk_12, StringBuilder stringBuilder) {
        this.rBk = ewk_12;
        this.rBj = stringBuilder;
    }

    public boolean execute(long l) {
        this.rBj.append('(').append(l).append(':').append(this.rBk.eLo().rj(l)).append("),");
        return true;
    }
}


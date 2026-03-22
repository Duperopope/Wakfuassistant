/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

/*
 * Renamed from eWm
 */
class ewm_2
implements TLongProcedure {
    final /* synthetic */ StringBuilder rBl;
    final /* synthetic */ ewk_1 rBm;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    ewm_2(ewk_1 ewk_12, StringBuilder stringBuilder) {
        this.rBm = ewk_12;
        this.rBl = stringBuilder;
    }

    public boolean execute(long l) {
        this.rBl.append('(').append(l).append(" | ").append(this.rBm.rBe.rh(l)).append("),");
        return true;
    }
}


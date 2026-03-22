/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 */
import gnu.trove.procedure.TObjectObjectProcedure;

/*
 * Renamed from asv
 */
class asv_1
implements TObjectObjectProcedure<String, String> {
    final /* synthetic */ ast_1 cYy;

    asv_1(ast_1 ast_12) {
        this.cYy = ast_12;
    }

    public boolean z(String string, String string2) {
        asr_1 asr_12 = this.cYy.ga(string);
        asr_12.x(string, string2);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, Object object2) {
        return this.z((String)object, (String)object2);
    }
}


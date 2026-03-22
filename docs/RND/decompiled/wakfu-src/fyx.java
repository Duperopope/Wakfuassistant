/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class fyx
implements TObjectProcedure<String> {
    final /* synthetic */ StringBuilder tCH;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    fyx(fyw_0 fyw_02, StringBuilder stringBuilder) {
        this.tCH = stringBuilder;
    }

    public boolean tq(String string) {
        this.tCH.append('\t').append(string).append('\n');
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.tq((String)object);
    }
}


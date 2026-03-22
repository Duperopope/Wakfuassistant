/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 *  org.apache.commons.lang3.StringUtils
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import java.util.Collection;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from aFq
 */
class afq_1
implements TObjectObjectProcedure<String, Class> {
    final /* synthetic */ String dIj;
    final /* synthetic */ Collection dIk;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    afq_1(afp_1 afp_12, String string, Collection collection) {
        this.dIj = string;
        this.dIk = collection;
    }

    public boolean c(String string, Class clazz) {
        if (StringUtils.contains((CharSequence)this.dIj, (CharSequence)string)) {
            this.dIk.add(new afo_1(string, clazz));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object, Object object2) {
        return this.c((String)object, (Class)object2);
    }
}


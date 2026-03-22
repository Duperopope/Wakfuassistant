/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectObjectProcedure
 */
import gnu.trove.procedure.TObjectObjectProcedure;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/*
 * Renamed from aFm
 */
class afm_2
implements TObjectObjectProcedure<String, ArrayList<Class>> {
    int dIa = 0;
    final /* synthetic */ afn_1[] dIb;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    afm_2(afl_2 afl_22, afn_1[] afn_1Array) {
        this.dIb = afn_1Array;
    }

    public boolean g(String string, ArrayList<Class> arrayList) {
        String[] stringArray = new String[arrayList.size()];
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            stringArray[i] = arrayList.get(i).getName();
        }
        Constructor[] constructorArray = afl_2.q(stringArray);
        this.dIb[this.dIa++] = string.length() == 0 ? new afn_1(string, null, constructorArray) : new afn_1(string, constructorArray, null);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, Object object2) {
        return this.g((String)object, (ArrayList)object2);
    }
}


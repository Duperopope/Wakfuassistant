/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bvV
 */
public class bvv_0 {
    private final ArrayList<faZ> jvM = new ArrayList();

    public boolean a(faZ faZ2) {
        return !this.jvM.contains(faZ2) && this.jvM.add(faZ2);
    }

    public boolean s(TObjectProcedure<faZ> tObjectProcedure) {
        for (int i = 0; i < this.jvM.size(); ++i) {
            if (tObjectProcedure.execute((Object)this.jvM.get(i))) continue;
            return false;
        }
        return true;
    }
}


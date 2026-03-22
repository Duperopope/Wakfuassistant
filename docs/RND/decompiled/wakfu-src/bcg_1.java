/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bcg
 */
class bcg_1
implements TIntObjectProcedure<bbu_2> {
    bcg_1(bcd_2 bcd_22) {
    }

    public boolean a(int n, bbu_2 bbu_22) {
        if (bbu_22.app()) {
            ArrayList<bcj_1> arrayList = bbu_22.dau();
            int n2 = arrayList.size();
            for (int i = 0; i < n2; ++i) {
                bcj_1 bcj_12 = arrayList.get(i);
                bcj_12.fk(true);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (bbu_2)object);
    }
}


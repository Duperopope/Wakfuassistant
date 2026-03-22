/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bOe
 */
class boe_2
implements TIntObjectProcedure<boi_2> {
    final /* synthetic */ bod_2 kJN;

    boe_2(bod_2 bod_22) {
        this.kJN = bod_22;
    }

    public boolean a(int n, boi_2 boi_22) {
        ArrayList<bog_2> arrayList = new ArrayList<bog_2>();
        boi_22.b(new bof_2(this, arrayList));
        boj_2 boj_22 = new boj_2(boi_22, arrayList);
        this.kJN.kJK.put(boi_22.aYs(), (Object)boj_22);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (boi_2)object);
    }
}


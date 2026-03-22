/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

/*
 * Renamed from arI
 */
class ari_1
implements TObjectProcedure<arz_1> {
    final /* synthetic */ arf_2 cVa;

    ari_1(arf_2 arf_22) {
        this.cVa = arf_22;
    }

    public boolean a(arz_1 arz_12) {
        List<ez_1> list = arz_12.bHM();
        for (ez_1 ez_12 : list) {
            if (ez_12 == null || this.cVa.cUS.contains(ez_12)) continue;
            this.cVa.cUS.add(ez_12);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((arz_1)object);
    }
}


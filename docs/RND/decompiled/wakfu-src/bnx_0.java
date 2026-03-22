/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.List;

/*
 * Renamed from bnX
 */
class bnx_0
implements TObjectProcedure<eIb> {
    final /* synthetic */ List iLs;
    final /* synthetic */ bnw_0 iLt;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bnx_0(bnw_0 bnw_02, List list) {
        this.iLt = bnw_02;
        this.iLs = list;
    }

    public boolean a(eIb eIb2) {
        int n = eIb2.d();
        if (this.iLs.contains(n)) {
            return true;
        }
        bny_0 bny_02 = new bny_0(n);
        this.iLt.iLd.put(n, (Object)bny_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((eIb)object);
    }
}


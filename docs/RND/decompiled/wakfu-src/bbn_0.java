/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.List;

/*
 * Renamed from bbN
 */
class bbn_0
implements TIntProcedure {
    final /* synthetic */ String hBB;
    final /* synthetic */ List hBC;
    final /* synthetic */ bbl_0 hBD;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bbn_0(bbl_0 bbl_02, String string, List list) {
        this.hBD = bbl_02;
        this.hBB = string;
        this.hBC = list;
    }

    public boolean execute(int n) {
        bbf_0 bbf_02 = (bbf_0)this.hBD.hBt.get(n);
        if (!bbf_02.dak().contains(this.hBB)) {
            return true;
        }
        this.hBC.add(bbf_02);
        return true;
    }
}


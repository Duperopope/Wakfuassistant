/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.List;

/*
 * Renamed from bbM
 */
class bbm_0
implements TIntProcedure {
    final /* synthetic */ String hBx;
    final /* synthetic */ String hBy;
    final /* synthetic */ List hBz;
    final /* synthetic */ bbl_0 hBA;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bbm_0(bbl_0 bbl_02, String string, String string2, List list) {
        this.hBA = bbl_02;
        this.hBx = string;
        this.hBy = string2;
        this.hBz = list;
    }

    public boolean execute(int n) {
        bbf_0 bbf_02 = (bbf_0)this.hBA.hBs.get(n);
        if (!bbf_02.dak().contains(this.hBx)) {
            return true;
        }
        if (!this.hBy.isEmpty() && !bbf_02.dal()) {
            return true;
        }
        this.hBz.add(bbf_02);
        return true;
    }
}


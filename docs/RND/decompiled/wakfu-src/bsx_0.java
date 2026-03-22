/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntShortProcedure
 */
import gnu.trove.procedure.TIntShortProcedure;
import java.util.Optional;

/*
 * Renamed from bsx
 */
class bsx_0
implements TIntShortProcedure {
    final /* synthetic */ bgt_0 jhb;
    final /* synthetic */ Optional jhc;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bsx_0(bsu_0 bsu_02, bgt_0 bgt_02, Optional optional) {
        this.jhb = bgt_02;
        this.jhc = optional;
    }

    public boolean execute(int n, short s) {
        if (this.jhb.dno().UN(n) >= s) {
            return true;
        }
        if (this.jhc.isPresent() && ((feb_0)this.jhc.get()).Qe(n) >= s) {
            return true;
        }
        fec_0 fec_02 = (fec_0)this.jhb.a(fez_0.sep);
        ffm ffm2 = fec_02.UB(n);
        return ffm2 != null && ffm2.bfd() >= s;
    }
}


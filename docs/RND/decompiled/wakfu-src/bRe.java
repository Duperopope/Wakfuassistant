/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class bRe
implements TObjectProcedure<fbl_0> {
    final /* synthetic */ ahv_2 kZk;
    final /* synthetic */ bRd kZl;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bRe(bRd bRd2, ahv_2 ahv_22) {
        this.kZl = bRd2;
        this.kZk = ahv_22;
    }

    public boolean a(fbl_0 fbl_02) {
        int n;
        fsZ fsZ2;
        if (this.kZk.bXe() > 0) {
            this.kZk.ceH();
        }
        if ((fsZ2 = this.kZl.Jc(fbl_02.coB())) != null) {
            this.kZk.ih(awx_2.dnJ.bQk());
        }
        if ((n = fbl_02.oP()) > 1) {
            this.kZk.yx(n).c("x");
        }
        this.kZk.c(aum_0.cWf().a(134, (long)fbl_02.coB(), new Object[0]));
        if (fsZ2 != null) {
            this.kZk.ceD();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fbl_0)object);
    }
}

